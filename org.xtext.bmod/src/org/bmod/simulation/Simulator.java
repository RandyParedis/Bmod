package org.bmod.simulation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// Simulator based upon
//	http://www.java-gaming.org/topics/game-loops/24220/view.html
public class Simulator extends JFrame implements ActionListener, ChangeListener {

	private static final long serialVersionUID = 1L;
	
	public static final long seed = 0;
	public static Random engine = new Random(seed);

	private SimulationPanel panel;
	private JPanel buttons;
	private JButton startButton = new JButton("Start");
	private JButton stepButton = new JButton("Step");
	private JButton quitButton = new JButton("Quit");
	private JSlider zoomSlider;
	private boolean running = false;
	private boolean paused = true;
	private int frames = 0;
	
	private double zoom_factor = 2.0;
	private ArrayList<Simulatable> objects;
	
	private int min_x = -1;
	private int min_y = -1;
	private int max_x = -1;
	private int max_y = -1;
	
	private void computeArea() {
		min_x = min_y = max_x = max_y = -1;
		final int cs = Simulatable.cellsize;
		for(Simulatable object: objects) {
			if(object instanceof Cell) {
				Cell c = (Cell)object;
				if(min_x == -1 || c.x < min_x) { min_x = c.x; }
				if(min_y == -1 || c.y < min_y) { min_y = c.y; }
				if(c.x > max_x) { max_x = c.x; }
				if(c.y > max_y) { max_y = c.y; }
			}
		}
		// Rescale
		min_x *= cs;
		min_y *= cs;
		max_x *= cs;
		max_y *= cs;
		
		// Add offsets
		min_x += Simulatable.offset_x;
		min_y += Simulatable.offset_y;
		// Take bottom-right corner
		max_x += cs + Simulatable.offset_x;
		max_y += cs + Simulatable.offset_y;
//		System.out.format("(%d, %d) -> (%d, %d)%n", min_x, min_y, max_x, max_y);
	}

	public Simulator(ArrayList<Simulatable> objects) {
		super("Bmod Simulator");
		this.objects = objects;
		computeArea();
		panel = new SimulationPanel();
		createWindow();
	}
	
	
	private void reorder_simulation() {
		// Reorder objects so there is a logical order of execution:
		//		- Person
		//		- Cell (Fire)
		//		- others
		objects.sort((Simulatable a, Simulatable b) -> {
			if(a instanceof Person && b instanceof Cell) {
				return -1;
			} else if(a instanceof Cell && b instanceof Person) {
				return 1;
			} else {
				return 0;
			}
		});
	}
	
	private void reorder_draw() {
		// Reorder objects so there is a logical order of drawing:
		//		- Cell (Fire)
		//		- Room
		//		- Door
		//		- Sign
		//		- Person
		objects.sort((Simulatable a, Simulatable b) -> {
			if(a.getClass() == b.getClass()) {
				return 0;
			}
			if(a instanceof Cell) {
				return -1;
			} else if(b instanceof Cell) {
				return 1;
			} else if(a instanceof Room) {
				return -1;
			} else if(b instanceof Room) {
				return 1;
			} else if(a instanceof Door) {
				return -1;
			} else if(b instanceof Door) {
				return 1;
			} else if(a instanceof EmergencySign) {
				return -1;
			} else if(b instanceof EmergencySign) {
				return 1;
			} else if(a instanceof Person) {
				return -1;
			} else if(b instanceof Person) {
				return 1;
			} else {
				return 0;
			}
		});
	}

	private void createWindow() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		buttons = new JPanel();
		buttons.setLayout(new GridLayout(1,2));
		buttons.add(startButton);
		buttons.add(stepButton);
		buttons.add(quitButton);
		
		final int start = 100;
		final int end = 300;
		final int value = 200;
		zoomSlider = new JSlider(start, end, value);
		zoomSlider.setPaintLabels(true);
		zoomSlider.setPaintTicks(true);
		zoomSlider.setMajorTickSpacing(50);
		zoomSlider.setMinorTickSpacing(5);
		Dictionary<Integer, JLabel> labels = new Hashtable<>();
		for (int i = start; i <= end; i += 20) {
			String text = String.format("%1.1f", i / 100.0);
			labels.put(i, new JLabel(text));
		}
		zoomSlider.setLabelTable(labels);
		zoomSlider.setSnapToTicks(true);
		
		cp.add(panel, BorderLayout.CENTER);
		cp.add(zoomSlider, BorderLayout.NORTH);
		cp.add(buttons, BorderLayout.SOUTH);

		startButton.addActionListener(this);
		stepButton.addActionListener(this);
		quitButton.addActionListener(this);
		zoomSlider.addChangeListener(this);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		zoom(zoom_factor);
		update();
		draw();
	}
	
	private void resetSize() {
		final int ho = startButton.getHeight() + zoomSlider.getHeight();
		Dimension d = panel.getPreferredSize();
		d.setSize(d.getWidth(), d.getHeight() + ho + Simulatable.offset_y);
		setMinimumSize(d);
		setMaximumSize(d);
		setSize(d);
		setPreferredSize(d);
		pack();
	}
	
	private void zoom(double factor) {
		zoom_factor = factor;
		Simulatable.zoom(factor);
		computeArea();
		resetSize();
	}

	public void actionPerformed(ActionEvent e) {
		Object s = e.getSource();
		if(s == startButton) {
			if(!running) {
				running = true;
				run();
			}
			paused = !paused;
			if(!paused) {
				startButton.setText("Pause");
				stepButton.setEnabled(false);
			} else {
				startButton.setText("Continue");
				stepButton.setEnabled(true);
			}
		} else if (s == stepButton) {
			if(paused) {
				step();
			}
		} else if (s == quitButton) {
			System.exit(0);
		}
	}
	
	public void stateChanged(ChangeEvent e) {
		Object s = e.getSource();
		if(s == zoomSlider) {
			if (zoomSlider.getValueIsAdjusting()) {
	            return;
	        }
			double val = (double)zoomSlider.getValue() / 100.0;
			zoom(val);
		}
	}

	public void run() {
		Thread loop = new Thread()
		{
			public void run()
			{
				simulation();
			}
		};
		loop.start();
		zoom(zoom_factor);
	}

	// MUST BE RAN IN ANOTHER THREAD
	private void simulation() {
		while(running) {
			if(!paused) {
				step();
			}
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	private void step() {
		update();
		draw();
		++frames;
	}

	private void update() {
		panel.update();
	}

	private void draw() {
		panel.repaint();
	}

	private class SimulationPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		
		public SimulationPanel() {
			
		}
		
		@Override
		public Dimension getPreferredSize() {
			final int ox = Simulatable.offset_x;
			final int oy = Simulatable.offset_y;
			return new Dimension((max_x - min_x) + 2 * ox, (max_y - min_y) + 2 * oy);
		}
		
		@Override
		public Dimension getSize() {
			return getPreferredSize();
		}
		
		@Override
		public Dimension getMinimumSize() {
			return getPreferredSize();
		}
		
		@Override
		public Dimension getMaximumSize() {
			return getPreferredSize();
		}

		public void update() {
			reorder_simulation();
			for(Simulatable object: objects) {
				object.clearMsgs();
			}
			boolean must_end = true;
			boolean burned_down = true;
			for(Simulatable object: objects) {
				object.update(objects);
				if(object instanceof Cell) {
					if(!((Cell)object).onFire) {
						burned_down = false;
					}
				} else if(object instanceof Person) {
					if(((Person)object).isAlive() && !((Person)object).escaped) {
						must_end = false;
					}
				}
			}
			for(Simulatable object: objects) {
				object.clean();
			}
			if(burned_down || must_end) {
				running = false;
				startButton.setText("Finished");
				startButton.setEnabled(false);
				stepButton.setEnabled(false);
			}
		}

		public void paintComponent(Graphics g) {
			reorder_draw();
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, getWidth(), getHeight());
			
			g.setColor(getBackground());
			final int ox = Simulatable.offset_x;
			final int oy = Simulatable.offset_y;
			g.fillRect(ox, oy, getWidth() - 2 * ox, getHeight() - 2 * oy);
			
			// Draw all elements
			ArrayList<String> info = new ArrayList<String>();
			ArrayList<String> error = new ArrayList<String>();
			for(Simulatable object: objects) {
				object.paint(g);
				String in = object.getInfo();
				String err = object.getError();
				if(!in.isEmpty()) {
					info.add(object.getInfo());
				}
				if(!err.isEmpty()) {
					error.add(object.getInfo());
				}
			}

			g.setColor(Color.WHITE);
			g.setFont(new Font("Arial", Font.PLAIN, 15));
			final int cs = Simulatable.cellsize;
			g.drawString(String.format("[(%d, %d), (%d, %d)];  Frame: %d;  Zoom: %1.2f",
					(min_x - ox) / cs, (min_y - oy) / cs, (max_x - ox) / cs, (max_y - oy) / cs,
					frames, zoom_factor), 15, 20);
			
			// Draw messages
			final int msgY = getHeight() - 10;
			for(String s: info) {
				System.out.println(s);
			}
			for(String s: error) {
				System.err.println(s);
			}
			if(error.isEmpty() && !info.isEmpty()) {
				g.setColor(Color.CYAN);
				String res = "";
				for(int i = 0; i < info.size(); ++i) {
					res += info.get(i);
					if(i < info.size() - 1) {
						res += "; ";
					}
				}
				g.drawString(res, 15, msgY);
			} else if(!error.isEmpty()) {
				g.setColor(Color.RED);
				String res = "";
				for(int i = 0; i < error.size(); ++i) {
					res += error.get(i);
					if(i < error.size() - 1) {
						res += "; ";
					}
				}
				g.drawString(res, 15, msgY);
			}
		}
	}
	
//	public static void main(String[] args) {
//		ArrayList<Simulatable> list = new ArrayList<Simulatable>();
//		Room room = new Room();
//		for(int i = 0; i < 10; ++i) {
//			Cell c1 = new Cell(i, i);
//			Cell c2 = new Cell(i, i + 1);
//			room.add(c1);
//			room.add(c2);
//			list.add(c1);
//			list.add(c2);
//		}
//		((Cell)(list.get(0))).setExit(true);
//		((Cell)(list.get(list.size() - 1))).ignite();
//		list.add(room);
//		new Simulator(list);
//	}
}

package org.bmod.simulation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Person extends Simulatable {
	public int x, y;

	final public String name;
	final private String perception;
	final private String action;

	private boolean notified = false;
	private boolean running = false;
	private boolean alive = true;
	public boolean escaped = false;

	private Cell target = null;
	private ArrayList<Cell> path = new ArrayList<Cell>();

	public interface Perception {
		boolean func(Person p, ArrayList<Simulatable> objects);
	}

	public interface Action {
		void func(Person p, ArrayList<Simulatable> objects);
	}

	public static Map<String, Perception> perceptions;
	static {
		perceptions = new HashMap<String, Perception>();
		perceptions.put("attentive", (Person p, ArrayList<Simulatable> objects) -> {
			for (Simulatable s : objects) {
				if (s instanceof Cell) {
					if (((Cell) s).onFire) {
						return true;
					}
				}
			}
			return false;
		});
		perceptions.put("relaxed", (Person p, ArrayList<Simulatable> objects) -> {
			return p.isNotified();
		});
		perceptions.put("optimistic", (Person p, ArrayList<Simulatable> objects) -> {
			Room room = p.getRoom(objects);
			for (Cell c : room.getCells()) {
				if (c.onFire) {
					return true;
				}
			}
			return false;
		});
		perceptions.put("sceptic", (Person p, ArrayList<Simulatable> objects) -> {
			int[] vals = { -1, 1 };
			for (int i : vals) {
				Cell c = findCell(p.x + i, p.y, objects);
				if (c != null && c.onFire) {
					return true;
				}
				c = Simulatable.findCell(p.x, p.y + i, objects);
				if (c != null && c.onFire) {
					return true;
				}
			}
			return false;
		});
	}
	public static Map<String, Action> actions;
	static {
		actions = new HashMap<String, Action>();
		actions.put("newcomer", (Person p, ArrayList<Simulatable> objects) -> {
			ArrayList<Cell> blacklist = new ArrayList<Cell>();
			for (Simulatable s : objects) {
				if (s instanceof Cell) {
					Cell cell = (Cell) s;
					if (cell.onFire) {
						blacklist.add(cell);
					}
				}
			}
			ArrayList<Cell> neighbourhood = findCell(p.x, p.y, objects).getNeighbourhood(objects, blacklist);
			ArrayList<Cell> available = new ArrayList<Cell>();
			for (Cell cell : neighbourhood) {
				if (cell.x != p.x && cell.y != p.y && cell.containsPerson(objects)) {
					available.add(cell);
				}
			}
			if (!available.isEmpty()) {
				p.target(available.get(0), objects);
			}
		});
		actions.put("experienced", (Person p, ArrayList<Simulatable> objects) -> {
			if (p.target == null) {
				Cell t = findCell(p.x, p.y, objects);
				ArrayList<Cell> blacklist = new ArrayList<Cell>();
				for (Simulatable s : objects) {
					if (s instanceof Cell) {
						Cell c = (Cell) s;
						if (c.onFire) {
							blacklist.add(c);
						}
					}
				}
				ArrayList<Cell> neighbourhood = t.getNeighbourhood(objects, blacklist);
				for (Cell c : neighbourhood) {
					if (c.isExit()) {
						p.target(c, objects);
						break;
					}
				}

				// No exit found
				if (p.target == null) {
					Room room = p.getRoom(objects);
					ArrayList<Cell> candidates = new ArrayList<Cell>();
					for (Simulatable s : objects) {
						if (s instanceof Door) {
							Door door = (Door) s;
							if (room.contains(door.getC1())) {
								candidates.add(door.getC1());
							} else if (room.contains(door.getC2())) {
								candidates.add(door.getC2());
							}
						}
					}
					Random ran = new Random();
					p.target(candidates.get(ran.nextInt(candidates.size())), objects);
				}
			}
		});
		actions.put("panic", (Person p, ArrayList<Simulatable> objects) -> {
			Cell loc = findCell(p.x, p.y, objects);
			ArrayList<Cell> neighbourhood = loc.getNeighbourhood(objects);
			neighbourhood = (ArrayList<Cell>) neighbourhood.clone();
			neighbourhood.remove(loc);
			p.target(neighbourhood.get(Simulator.engine.nextInt(neighbourhood.size())), objects);
		});
	}

	public Person(String name, int x, int y, final String perc, final String action) {
		this.x = x;
		this.y = y;
		perception = perc;
		this.action = action;

		this.name = name;
	}

	public void move(int x, int y) {
		Cell in = new Cell(this.x, this.y);
		Cell to = new Cell(x, y);
		if (!in.isNeighbouring(to)) {
			throw new Error("Person cannot move to a non-neighbouring cell.");
		}
		this.x = x;
		this.y = y;
	}

	public void burn() {
		alive = false;
		String[] s = {
				name + " died in a terrible fire.",
				name + " has perished away.",
				name + " went up in flames.",
				name + " could not be saved.",
				name + " went to inspect the fire from too close.",
				name + " burned to a crisp.",
				name + " tried to fight a Balrog."
		};

		info(s[Simulator.engine.nextInt(s.length)]);
	}

	public void escape() {
		escaped = true;
		String[] s = {
				name + " escaped from the flames.",
				name + " ran fast enough.",
				name + " found the exit.",
				name + " fought the Balrog."
		};

		info(s[Simulator.engine.nextInt(s.length)]);
	}

	public Room getRoom(ArrayList<Simulatable> objects) {
		for (Simulatable s : objects) {
			if (s instanceof Room) {
				Room room = (Room) s;
				if (room.contains(x, y)) {
					return room;
				}
			}
		}

		throw new NullPointerException();
	}

	public void target(Cell c, ArrayList<Simulatable> objects) {
		if (c == null) {
			target = c;
			path = new ArrayList<Cell>();
		} else {
			target = c;
			Cell current = findCell(x, y, objects);
			path = bfs(current, c, objects, false);
		}
	}

	public void notifyPerson() {
		notified = true;
	}

	public boolean isNotified() {
		return notified;
	}

	public boolean isAlive() {
		return alive;
	}

	public void notifyAllPeopleInRoom(ArrayList<Simulatable> objects) {
		// Find room
		Room r = getRoom(objects);

		// Notify everyone in the room
		for (Simulatable s : objects) {
			if (s instanceof Person) {
				Person person = (Person) s;
				if (person.getRoom(objects) == r && !person.isNotified()) {
					person.notifyPerson();
				}
			}
		}
	}

	@Override
	public void update(ArrayList<Simulatable> objects) {
		Cell c = findCell(x, y, objects);
		if (alive && !escaped) {
			if (c.onFire) {
				burn();
			} else {
				if (!running) {
					running = perceptions.get(perception).func(this, objects);
					if (running) {
						notifyAllPeopleInRoom(objects);
					}
				}
				if (running) {
					actions.get(action).func(this, objects);
					if (target == c) {
						if (c.isExit()) {
							escape();
						} else {
							for (Simulatable s : objects) {
								if (s instanceof Door) {
									Door door = (Door) s;
									if (door.getC1() == c) {
										move(door.getC2().x, door.getC2().y);
										break;
									} else if (door.getC2() == c) {
										move(door.getC1().x, door.getC1().y);
										break;
									}
								}
							}
							target(null, null);
						}
					} else {
						if (path.size() > 1) {
							Cell next = path.get(path.indexOf(c) + 1);
							move(next.x, next.y);
						}
					}
				}
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		if (escaped) {
			return;
		}
		g.setColor(Color.CYAN);
		if (notified) {
			g.setColor(Color.PINK);
		}
		if (running) {
			g.setColor(Color.ORANGE);
		}
		if (!alive) {
			g.setColor(Color.BLACK);
		}
		g.setFont(new Font("Arial", Font.BOLD, cellsize / 3));
		final int x = this.x * cellsize + offset_x;
		final int y = this.y * cellsize + offset_y;
		g.drawString(name.substring(0, Math.min(3, name.length())), x + 2, y + cellsize / 2);

//		if(target != null) {
//			g.setColor(Color.CYAN);
//			g.drawLine(x, y, target.x * cellsize + offset_x, target.y * cellsize + offset_y);
//		}
	}
}

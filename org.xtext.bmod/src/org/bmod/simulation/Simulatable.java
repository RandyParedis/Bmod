package org.bmod.simulation;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public abstract class Simulatable {
	static protected int cellsize = 20;
	static final protected int offset_x = 30;
	static final protected int offset_y = 30;
	
	private String m_info = "";
	private String m_error = "";
	
	public void update(ArrayList<Simulatable> objects) {}
	public void clean() {}
	public void paint(Graphics g) {}
	
	protected void info(String info) { m_info = info; }
	protected void error(String error) { m_error = error; }
	
	public String getInfo() {
		return m_info;
	}
	
	public String getError() {
		return m_error;
	}
	
	public void clearMsgs() {
		m_info = "";
		m_error = "";
	}
	
	public static void zoom(double factor) {
		cellsize = (int) (20.0 * factor);
	}
	
	public static Cell findCell(int x, int y, ArrayList<Simulatable> objects) {
		for(Simulatable s: objects) {
			if(s instanceof Cell) {
				Cell c = (Cell)s;
				if(c.x == x && c.y == y) {
					return c;
				}
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Cell> bfs(Cell start, Cell goal, ArrayList<Simulatable> objects, boolean throughFire) {
		Map<Cell, ArrayList<Cell>> path = new HashMap<Cell, ArrayList<Cell>>();
		ArrayList<Cell> cp = new ArrayList<Cell>();
		cp.add(start);
		path.put(start, cp);
		Queue<Cell> queue = new PriorityQueue<Cell>();
		queue.add(start);
		
		while(!queue.isEmpty()) {
			Cell c = queue.remove();
			
			ArrayList<Cell> candidates = new ArrayList<Cell>();
			int[] locs = {-1, 1};
			for(int i: locs)  {
				Cell f = findCell(c.x + i, c.y, objects);
				if(f != null && path.get(f) == null && !(!throughFire && f.onFire)) {
					candidates.add(f);
					queue.add(f);
				}
				f = findCell(c.x, c.y + i, objects);
				if(f != null && path.get(f) == null && !(!throughFire && f.onFire)) {
					candidates.add(f);
					queue.add(f);
				}
			}
			
			for(Cell can: candidates) {
				cp = (ArrayList<Cell>) path.get(c).clone();
				cp.add(can);
				path.put(can, cp);
				
				if(can == goal) {
					return cp;
				}
			}
		}
		
		return new ArrayList<Cell>();
	}
}

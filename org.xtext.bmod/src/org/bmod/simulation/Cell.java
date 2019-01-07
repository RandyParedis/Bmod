package org.bmod.simulation;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Cell extends Simulatable implements Comparable<Cell> {
	public boolean onFire = false;
	private boolean isExit = false;
	
	private boolean just_ignited = false;
	
	public int x;
	public int y;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean isNeighbouring(Cell other) {
		return (((x + 1 == other.x || x - 1 == other.x) && y == other.y) ||
				((y + 1 == other.y || y - 1 == other.y) && x == other.x));
	}
	
	// TODO: make it so it won't go through walls
	@Override
	public void update(ArrayList<Simulatable> objects) {
		if(!just_ignited && onFire) {
			for(Simulatable object: objects) {
				if((object instanceof Cell) && isNeighbouring((Cell)object)) {
					Cell cell = (Cell)object;
					if(isNeighbouring(cell) && !cell.onFire) {
						Room room = null;
						for(Simulatable s: objects) {
							if(s instanceof Room) {
								Room r = (Room)s;
								if(r.contains(cell)) {
									room = r;
									break;
								}
							}
						}
						if(room.contains(this)) {
							cell.ignite();
						} else {
							for(Simulatable s: objects) {
								if(s instanceof Door) {
									Door door = (Door)s;
									if((door.getC1() == this && door.getC2() == cell) ||
										(door.getC2() == this && door.getC1() == cell)) {
										cell.ignite();
										break;
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Override
	public void clean() {
		just_ignited = false;
	}
	
	public void ignite() {
		info(String.format("Ignited (%d, %d)", x, y));
		onFire = true;
		just_ignited = true;
	}
	
	public boolean isExit() { return isExit; }
	
	public void setExit(boolean exit) {
		isExit = exit;
	}
	
	@Override
	public void paint(Graphics g) {
		if(onFire) {
			g.setColor(Color.RED);
		} else if(isExit){
			g.setColor(Color.GREEN);
		} else {
			g.setColor(Color.GRAY);
		}
		g.fillRect(x * cellsize + offset_x, y * cellsize + offset_y, cellsize, cellsize);
		
		g.setColor(Color.BLACK);
		g.drawRect(x * cellsize + offset_x, y * cellsize + offset_y, cellsize, cellsize);
	}
	
	
	public boolean containsPerson(ArrayList<Simulatable> objects) {
		for(Simulatable s: objects) {
			if(s instanceof Person) {
				Person p = (Person)s;
				if(p.x == x && p.y == y) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public ArrayList<Cell> getNeighbourhood(ArrayList<Simulatable> objects) {
		Room current = null;
		for(Simulatable s: objects) {
			if(s instanceof Room) {
				Room room = (Room)s;
				if(room.contains(this)) {
					current = room;
				}
			}
		}
		
		if(current == null) { throw new NullPointerException(); }
		
		Map<Cell, Integer> distances = new HashMap<Cell, Integer>();
		Map<Cell, Boolean> visited = new HashMap<Cell, Boolean>();
		
		for(Cell cell: current.getCells()) {
			distances.put(cell, current.getCells().size());
			visited.put(cell, false);
		}
		
		ArrayList<Cell> result = new ArrayList<Cell>();
		Queue<Cell> queue = new PriorityQueue<Cell>();
		distances.put(this, 0);
		visited.put(this, true);
		queue.add(this);
		
		while(!queue.isEmpty()) {
			Cell cell = queue.remove();
			if(!result.contains(cell)) {
				result.add(cell);
			}
			
			ArrayList<Cell> candidates = new ArrayList<Cell>();
			int[] locs = {-1, 1};
			for(int i: locs)  {
				Cell f = findCell(cell.x + i, cell.y, objects);
				if(f != null) {
					Boolean b = visited.get(f);
					if(b != null && !b) {
						candidates.add(f);
						queue.add(f);
					}
				}
				f = findCell(cell.x, cell.y + i, objects);
				if(f != null) {
					Boolean b = visited.get(f);
					if(b != null && !b) {
						candidates.add(f);
						queue.add(f);
					}
				}
			}
			
			for(Cell c: candidates) {
				visited.put(cell, true);
				distances.put(c, distances.get(cell) + 1);
			}
		}
		
		result.sort((Cell a, Cell b) -> {
			return distances.get(a) - distances.get(b); 
		});
		return result;
	}
	
	public ArrayList<Cell> getNeighbourhood(ArrayList<Simulatable> objects, ArrayList<Cell> blacklist) {
		Room current = null;
		for(Simulatable s: objects) {
			if(s instanceof Room) {
				Room room = (Room)s;
				if(room.contains(this)) {
					current = room;
				}
			}
		}
		
		if(current == null) { throw new NullPointerException(); }
		
		Map<Cell, Integer> distances = new HashMap<Cell, Integer>();
		Map<Cell, Boolean> visited = new HashMap<Cell, Boolean>();
		
		for(Cell cell: current.getCells()) {
			distances.put(cell, current.getCells().size());
			visited.put(cell, false);
		}
		
		ArrayList<Cell> result = new ArrayList<Cell>();
		Queue<Cell> queue = new PriorityQueue<Cell>();
		distances.put(this, 0);
		visited.put(this, true);
		queue.add(this);
		
		while(!queue.isEmpty()) {
			Cell cell = queue.remove();
			if(!result.contains(cell)) {
				result.add(cell);
			}
			
			ArrayList<Cell> candidates = new ArrayList<Cell>();
			int[] locs = {-1, 1};
			for(int i: locs)  {
				Cell f = findCell(cell.x + i, cell.y, objects);
				if(f != null) {
					Boolean b = visited.get(f);
					if(b != null && !b && !blacklist.contains(f)) {
						candidates.add(f);
						queue.add(f);
					}
				}
				f = findCell(cell.x, cell.y + i, objects);
				if(f != null) {
					Boolean b = visited.get(f);
					if(b != null && !b && !blacklist.contains(f)) {
						candidates.add(f);
						queue.add(f);
					}
				}
			}
			
			for(Cell c: candidates) {
				visited.put(c, true);
				distances.put(c, distances.get(cell) + 1);
			}
		}
		
		result.sort((Cell a, Cell b) -> {
			return distances.get(a) - distances.get(b); 
		});
		return result;
	}

	@Override
	public int compareTo(Cell o) {
		return x - o.x + y - o.y;
	}
}

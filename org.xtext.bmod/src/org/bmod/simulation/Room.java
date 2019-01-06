package org.bmod.simulation;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Room extends Simulatable {
	private ArrayList<Cell> cells = new ArrayList<Cell>();
	
	private int min_x = -1;
	private int min_y = -1;
	private int max_x = -1;
	private int max_y = -1;
	
	public void add(Cell c) {
		cells.add(c);
	}
	
	public ArrayList<Cell> getCells() { return cells; }
	
	public boolean contains(Cell c) {
		for(Cell x: cells) {
			if(x == c) {
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		for(Cell c: cells) {
			if(x == c.x && y == c.y) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void reinit_after() {
		min_x = min_y = max_x = max_y = -1;
		for(Cell c: cells) {
			if(min_x == -1 || c.x < min_x) { min_x = c.x; }
			if(min_y == -1 || c.y < min_y) { min_y = c.y; }
			if(c.x > max_x) { max_x = c.x; }
			if(c.y > max_y) { max_y = c.y; }
		}
		max_x += cellsize;
		max_y += cellsize;
		
//		System.out.format("(%d, %d) -> (%d, %d)%n", min_x, min_y, max_x, max_y);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(min_x, min_y, max_x - min_x, max_y - min_y);
		g.drawRect(min_x + 1, min_y + 1, max_x - min_x - 2, max_y - min_y - 2);
	}
}

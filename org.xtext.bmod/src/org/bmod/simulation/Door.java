package org.bmod.simulation;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Door extends Simulatable {
	private Cell c1, c2;
	
	public Door(int x1, int y1, int x2, int y2) {
		c1 = new Cell(x1, y1);
		c2 = new Cell(x2, y2);
	}
	
	public void setup(ArrayList<Simulatable> list) {
		for(Simulatable s: list) {
			if(s instanceof Cell) {
				Cell c = (Cell)s;
				if(c1.x == c.x && c1.y == c.y) {
					c1 = c;
				}
				if(c2.x == c.x && c2.y == c.y) {
					c2 = c;
				}
			}
		}
	}
	
	public Cell getC1() { return c1; }
	public Cell getC2() { return c2; }
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		final int x1 = c1.x * cellsize + offset_x;
		final int y1 = c1.y * cellsize + offset_y;
		final int x2 = c2.x * cellsize + offset_x;
		final int y2 = c2.y * cellsize + offset_y;
		final int cs2 = cellsize/2;
		g.drawLine(x1 + cs2, y1 + cs2, x2 + cs2, y2 + cs2);
	}
}

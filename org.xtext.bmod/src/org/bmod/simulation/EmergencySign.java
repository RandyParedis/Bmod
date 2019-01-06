package org.bmod.simulation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public class EmergencySign extends Simulatable {
	private Door door_on;
	private Door door_to;
	
	private enum Direction {
		UP, DOWN, LEFT, RIGHT, NONE
	}
	
	private Direction direction = Direction.NONE;
	private boolean swapped = false;
	private ArrayList<Simulatable> objects;
	
	public EmergencySign(Door d1, Door d2) {
		door_on = d1;
		door_to = d2;
	}
	
	public void setup(ArrayList<Simulatable> list) {
		objects = list;
		reinit_after();
	}
	
	@Override
	public void reinit_after() {
		// Find cell in common room
		Cell common = null;
		Cell other = null;
		for(Simulatable s: objects) {
			if(s instanceof Room) {
				Room room = (Room)s;
				if(room.contains(door_on.getC1()) && (room.contains(door_to.getC1()) || room.contains(door_to.getC2()))) {
					common = door_on.getC1();
					other = door_on.getC2();
				}
				if(room.contains(door_on.getC2()) && (room.contains(door_to.getC1()) || room.contains(door_to.getC2()))) {
					common = door_on.getC2();
					other = door_on.getC1();
					swapped = true;
				}
			}
		}
		if(common == null || other == null) { throw new NullPointerException(); }

		// Determine arrowhead direction
		if(common.x == other.x) {
			if(common.y < other.y) {
				direction = Direction.UP;
			} else {
				direction = Direction.DOWN;
			}
		} else {
			if(common.x < other.x) {
				direction = Direction.LEFT;
			} else {
				direction = Direction.RIGHT;
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if(direction == Direction.NONE) { throw new NullPointerException(); }
		g.setColor(Color.BLUE);
		Polygon p = new Polygon();
		Cell c = door_on.getC1();
		if(swapped) {
			c = door_on.getC2();
		}
		final int aw = 5;
		final int cs2 = cellsize / 2;
		switch(direction) {
		case DOWN:
			p.addPoint(c.x + cs2 - aw, c.y + cs2 - aw);
			p.addPoint(c.x + cs2 + aw, c.y + cs2 - aw);
			p.addPoint(c.x + cs2, c.y + cs2 + aw);
			break;
		case LEFT:
			p.addPoint(c.x + cs2 + aw, c.y + cs2 - aw);
			p.addPoint(c.x + cs2 + aw, c.y + cs2 + aw);
			p.addPoint(c.x + cs2 - aw, c.y + cs2);
			break;
		case RIGHT:
			p.addPoint(c.x + cs2 - aw, c.y + cs2 - aw);
			p.addPoint(c.x + cs2 - aw, c.y + cs2 + aw);
			p.addPoint(c.x + cs2 + aw, c.y + cs2);
			break;
		case UP:
			p.addPoint(c.x + cs2 - aw, c.y + cs2 + aw);
			p.addPoint(c.x + cs2 + aw, c.y + cs2 + aw);
			p.addPoint(c.x + cs2, c.y + cs2 - aw);
			break;
		default:
			break;
		}
		
		g.fillPolygon(p);
	}
}

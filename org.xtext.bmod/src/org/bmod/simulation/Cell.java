package org.bmod.simulation;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Cell extends Simulatable {
	public boolean onFire = false;
	private boolean isExit = false;
	
	private boolean just_ignited = false;
	
	public int x;
	public int y;
	
	public Cell(int x, int y) {
		this.x = compX(x);
		this.y = compY(y);
	}
	
	public boolean isNeighbouring(Cell other) {
		return (((x + cellsize == other.x || x - cellsize == other.x) && y == other.y) ||
				((y + cellsize == other.y || y - cellsize == other.y) && x == other.x));
	}
	
	@Override
	public void update(ArrayList<Simulatable> objects) {
		if(!just_ignited && onFire) {
			for(Simulatable object: objects) {
				if((object instanceof Cell) && isNeighbouring((Cell)object)) {
					if(!((Cell)object).onFire) {
						((Cell)object).ignite();
					}
				}
			}
		}
	}
	
	@Override
	public void reinit_before() {
		x = decompX(x);
		y = decompY(y);
	}
	
	@Override
	public void reinit_after() {
		x = compX(x);
		y = compY(y);
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
		g.fillRect(x, y, cellsize, cellsize);
		
		g.setColor(Color.BLACK);
		g.drawRect(x, y, cellsize, cellsize);
	}
}

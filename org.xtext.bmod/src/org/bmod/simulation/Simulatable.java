package org.bmod.simulation;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Simulatable {
	static protected int cellsize = 20;
	static final protected int offset_x = 30;
	static final protected int offset_y = 30;
	
	private String m_info = "";
	private String m_error = "";
	
	protected void reinit_before() {}
	protected void reinit_after() {}
	public void update(ArrayList<Simulatable> objects) {}
	public void clean() {}
	public void paint(Graphics g) {}
	
	protected static int compX(int x) {
		return x * cellsize + offset_x;
	}
	
	protected static int decompX(int x) {
		return (x - offset_x) / cellsize;
	}
	
	protected static int compY(int y) {
		return y * cellsize + offset_y;
	}
	
	protected static int decompY(int y) {
		return (y - offset_y) / cellsize;
	}
	
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
}

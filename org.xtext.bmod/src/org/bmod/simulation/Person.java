package org.bmod.simulation;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Person extends Simulatable {
	public int x, y;
	
	final public String name;
	final private String perception;
	final private String action;
	
	private boolean notified = false;
	private boolean running = false;
	
	private interface Perception {
		boolean func(Person p, ArrayList<Simulatable> objects);
	}
	
	private interface Action {
		void func(Person p, ArrayList<Simulatable> objects);
	}
	
	public static Map<String, Perception> perceptions;
	static {
		perceptions = new HashMap<String, Perception>();
		perceptions.put("attentive", (Person p, ArrayList<Simulatable> objects) -> {
			for(Simulatable s: objects) {
				if(s instanceof Cell) {
					if(((Cell)s).onFire) {
						return true;
					}
				}
			}
			return false;
		});
		perceptions.put("optimistic", (Person p, ArrayList<Simulatable> objects) -> {
			return false;
		});
		perceptions.put("relaxed", (Person p, ArrayList<Simulatable> objects) -> {
			return false;
		});
		perceptions.put("sceptic", (Person p, ArrayList<Simulatable> objects) -> {
			return false;
		});
	}
	public static Map<String, Action> actions;
	static {
		actions = new HashMap<String, Action>();
		actions.put("experienced", (Person p, ArrayList<Simulatable> objects) -> {
			
		});
		actions.put("newcomer", (Person p, ArrayList<Simulatable> objects) -> {
			
		});
		actions.put("panic", (Person p, ArrayList<Simulatable> objects) -> {
			
		});
	}
	
	public Person(String name, int x, int y, final String perc, final String action) {
		this.x = compX(x);
		this.y = compY(y);
		perception = perc;
		this.action = action;
		
		this.name = name;
	}
	
	public Room getRoom(ArrayList<Simulatable> objects) {
		for(Simulatable s: objects) {
			if(s instanceof Room) {
				Room room = (Room)s;
				if(room.contains(x, y)) {
					return room;
				}
			}
		}
		
		throw new NullPointerException();
	}
	
	public void notifyPerson() {
		notified = true;
	}
	
	public boolean isNotified() {
		return notified;
	}
	
	public void notifyAllPeopleInRoom(ArrayList<Simulatable> objects) {
		// Find room
		Room r = getRoom(objects);
		
		// Notify everyone in the room
		for(Simulatable s: objects) {
			if(s instanceof Person) {
				Person person = (Person)s;
				if(person.getRoom(objects) == r) {
					person.notifyPerson();
				}
			}
		}
	}
	
	@Override
	public void update(ArrayList<Simulatable> objects) {
		if(!running) {
			running = perceptions.get(perception).func(this, objects);
			if(running) {
				notifyAllPeopleInRoom(objects);
			}
		} else {
			actions.get(action).func(this, objects);
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
	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		if(notified) {
			g.setColor(Color.PINK);
		}
		if(running) {
			g.setColor(Color.ORANGE);
		}
		g.drawString(name.substring(0, Math.min(3, name.length())), x + 2, y + cellsize / 2);
	}
}

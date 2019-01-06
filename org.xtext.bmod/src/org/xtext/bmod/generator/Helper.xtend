package org.xtext.bmod.generator

import java.util.ArrayList
import org.xtext.bmod.bmod.Area
import org.xtext.bmod.bmod.BmodFactory
import org.xtext.bmod.bmod.Coordinate
import org.xtext.bmod.bmod.Door
import org.xtext.bmod.bmod.EmergencySign
import org.xtext.bmod.bmod.Floorplan
import org.xtext.bmod.bmod.Room

class Helper {
	static def ArrayList<Coordinate> getAreaCoords(Area area) {
		var coords = newArrayList(area.from);
		for(var x = area.from.x; x <= area.to.x; x++) {
			for(var y = area.from.y; y <= area.to.y; y++) {
				var c = BmodFactory.eINSTANCE.createCoordinate;
				c.x = x;
				c.y = y;
				if(!isIn(c, coords)) {
					coords.add(c);
				}
			}
		}
		for(c: area.without) {
			for(var i = 0; i < coords.size; i++) {
				if(coordinateEquals(coords.get(i), c)) {
					coords.remove(i);
					i--;
				}
			}
		}
		return coords;
	}
	
	static def ArrayList<Coordinate> getRoomCoords(Room room) {
		var coords = newArrayList(room.areas.get(0).from);
		for(area: room.areas) {
			val cc = getAreaCoords(area);
			for(c: cc) {
				if(!isIn(c, coords)) {					
					coords.add(c);
				}
			}
		}
		return coords;
	}
	
	static def boolean neighbouring(Coordinate a, Coordinate b) {
		return (((a.x + 1 == b.x) || (a.x - 1 == b.x)) && a.y == b.y) ||
			   (((a.y + 1 == b.y) || (a.y - 1 == b.y)) && a.x == b.x);
	}
	
	static def boolean isIn(Coordinate c, ArrayList<Coordinate> l) {
		for(e: l) {
			if(coordinateEquals(c, e)) {
				return true;
			}
		}
		return false;
	}
	
	static def boolean isIn(Room c, ArrayList<Room> l) {
		for(e: l) {
			if(c == e) {
				return true;
			}
		}
		return false;
	}
	
	static def boolean isIn(Door d, ArrayList<Door> l) {
		for(e: l) {
			if(d == e) {
				return true;
			}
		}
		return false;
	}
	
	static def boolean coordinateEquals(Coordinate a, Coordinate b) {
		return (a.x == b.x && a.y == b.y);
	}
	
	static def boolean areIntersecting(ArrayList<Coordinate> a, ArrayList<Coordinate> b) {
		for(i: a) {
			for(j: b) {
				if(coordinateEquals(i, j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	static def EmergencySign getDoorSign(Door door, Floorplan fp) {
		for(sign: fp.signs) {
			if(sign.on == door) {
				return sign;
			}
		}
		return null;
	}
}

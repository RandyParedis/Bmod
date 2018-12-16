package org.xtext.bmod

import java.util.ArrayList
import org.xtext.bmod.bmod.Area
import org.xtext.bmod.bmod.BmodFactory
import org.xtext.bmod.bmod.Coordinate

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
}
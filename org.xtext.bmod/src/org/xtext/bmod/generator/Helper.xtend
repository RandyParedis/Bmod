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
	static def Coordinate newCoordinate(int x, int y) {
		var c = BmodFactory.eINSTANCE.createCoordinate;
		c.x = x;
		c.y = y;
		return c;
	}
	
	static def ArrayList<Coordinate> getAreaCoords(Area area) {
		var coords = newArrayList(area.from);
		for(var x = area.from.x; x <= area.to.x; x++) {
			for(var y = area.from.y; y <= area.to.y; y++) {
				var c = newCoordinate(x, y);
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
	
	static def Pair<Coordinate, Coordinate> getFloorplanBoundaries(Floorplan fp) {
		var min = null as Coordinate;
		var max = null as Coordinate;
		for(room: fp.rooms) {
			for(cell: room.getRoomCoords) {
				if(min === null) {
					min = newCoordinate(cell.x, cell.y);
				}
				if(max === null) {
					max = newCoordinate(cell.x, cell.y);
				}
				if(cell.x < min.x) {
					min.x = cell.x;
				} else if(cell.y < min.y) {
					min.y = cell.y;
				}
				if(cell.x > max.x) {
					max.x = cell.x;
				} else if(cell.y > max.y) {
					max.y = cell.y;
				}
			}
		}
		return min -> max;
	}
	
	static def ArrayList<Pair<Coordinate, Coordinate>> getRoomObstacles(Room room, Floorplan fp) {
		var result = <Pair<Coordinate, Coordinate>>newArrayList();
		var cells = getRoomCoords(room);
		var subset = <Coordinate>newArrayList;
		subset.addAll(cells);
		for(r: fp.rooms) {
			if(r != room) {
				val c = getRoomCoords(r);
				for(door: fp.doors) {
					if(isIn(door.from, c)) {
						subset.add(door.from);
					} else if(isIn(door.to, c)) {
						subset.add(door.to);
					}
				}
			}
		}
		for(cell: cells) {
			var top = true;
			var bottom = true;
			var left = true;
			var right = true;			
			for(n: subset) {
				if(cell.y == n.y && cell.x + 1 == n.x) {
					right = false;
				}
				if(cell.y == n.y && cell.x - 1 == n.x) {
					left = false;
				}
				if(cell.x == n.x && cell.y + 1 == n.y) {
					bottom = false;
				}
				if(cell.x == n.x && cell.y - 1 == n.y) {
					top = false;
				}
			}
			if(top) {
				val c1 = newCoordinate(cell.x, cell.y);
				val c2 = newCoordinate(cell.x + 1, cell.y);
				val pair = c1 -> c2;
				result.add(pair);
			}
			if(left) {
				val c1 = newCoordinate(cell.x, cell.y);
				val c2 = newCoordinate(cell.x, cell.y + 1);
				val pair = c1 -> c2;
				result.add(pair);
			}
			if(right) {
				val c1 = newCoordinate(cell.x + 1, cell.y);
				val c2 = newCoordinate(cell.x + 1, cell.y + 1);
				val pair = c1 -> c2;
				result.add(pair);
			}
			if(bottom) {
				val c1 = newCoordinate(cell.x, cell.y + 1);
				val c2 = newCoordinate(cell.x + 1, cell.y + 1);
				val pair = c1 -> c2;
				result.add(pair);
			}
		}
		return result;
	}
}

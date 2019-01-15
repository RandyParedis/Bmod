/*
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.validation

import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.scoping.impl.ImportUriResolver
import org.eclipse.xtext.validation.Check
import org.xtext.bmod.bmod.Area
import org.xtext.bmod.bmod.BmodPackage
import org.xtext.bmod.bmod.Coordinate
import org.xtext.bmod.bmod.Door
import org.xtext.bmod.bmod.EmergencySign
import org.xtext.bmod.bmod.Floorplan
import org.xtext.bmod.bmod.Import
import org.xtext.bmod.bmod.Room
import org.xtext.bmod.breact.React
import org.xtext.bmod.generator.Helper

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BmodValidator extends AbstractBmodValidator {
	
	
	@Inject
	ImportUriResolver uriResolver
	
	public static val BR_TL = 'brtl';
	
	@Check
	def void checkAreaTopLeftToBottomRight(Area area) {
		if(area.from.x > area.to.x || area.from.y > area.to.y) {
			error("Area must be defined from top-left to bottom-right", BmodPackage.Literals.AREA__FROM, BR_TL);
		}
	}
	
	@Check
	def void checkRoomAllCellsConnected(Room room) {
		// Create the Cell List
		val coords = Helper.getRoomCoords(room);
				
		if(coords.empty) {
			error("Area must contain cells", room.areas.get(0), null);
		} else {
			// Do Floodfill to check if all cells are connected
			var set = newArrayList(coords.get(0));
			
			for(var i = 0; i < set.size; i++) {
				for(c: coords) {
					if(Helper.neighbouring(c, set.get(i)) && !Helper.isIn(c, set)) {
						set.add(c);
					}
				}
			}
			if(set.size != coords.size) {
				error("Room has disconnected cells", room, null);
			}
		}
	}
	
	@Check
	def void checkRoomsNoOverlap(Floorplan fp) {
		for(a: fp.rooms) {
			for(b: fp.rooms) {
				if(a != b && Helper.areIntersecting(Helper.getRoomCoords(a), Helper.getRoomCoords(b))) {
					error("Rooms are overlapping", b, null);
				}
			}
		}
	}
	
	@Check
	def void checkRoomsConnected(Floorplan fp) {
		if(!fp.rooms.empty) {
			var set = newArrayList(fp.rooms.get(0));
			for(var i = 0; i < set.size; i++) {
				for(r: fp.rooms) {
					var connected = false;
					for(door: fp.doors) {
						if(Helper.isIn(door.from, Helper.getRoomCoords(set.get(i))) &&
							Helper.isIn(door.to, Helper.getRoomCoords(r))) {
								connected = true;
							}
					}
					if(connected && !Helper.isIn(r, set)) {
						set.add(r);
					}
				}
			}
			if(set.size != fp.rooms.size) {
				error("Floorplan has disconnected rooms", fp, null);
			}			
		}
	}
	
	@Check
	def void checkDoorCellsNeighbouring(Door door) {
		if(!Helper.neighbouring(door.from, door.to)) {
			error("The cells of the door must be neighbouring", door, null);
		}
	}
	
	@Check
	def void checkDoorCellsDifferentRooms(Floorplan fp) {
		for(room: fp.rooms) {
			val cells = Helper.getRoomCoords(room);
			for(door: fp.doors) {
				if(Helper.isIn(door.from, cells) && Helper.isIn(door.to, cells)) {
					error("The cells of the door must be in different rooms", door, null);
				}
			}
		}
	}
	
	@Check
	def void checkAtLeastOneExit(Floorplan fp) {
		if(fp.exits.empty) {
			error("There must be at least one Exit in the floorplan", fp, null);
		}
	}
	
	@Check
	def void checkExitInFloor(Floorplan fp) {
		for(exit: fp.exits) {
			var found = false;
			for(room: fp.rooms) {
				for(cell: Helper.getRoomCoords(room)) {
					if(exit.location.x == cell.x && exit.location.y == cell.y) {
						found = true;
					}
				}
			}
			if(!found) {
				error("Location of Exit does not exist on floor", exit, null);
			}
		}
	}
	
	@Check
	def void checkFireInFloor(Floorplan fp) {
		for(fire: fp.fires) {
			var found = false;
			for(room: fp.rooms) {
				for(cell: Helper.getRoomCoords(room)) {
					if(fire.location.x == cell.x && fire.location.y == cell.y) {
						found = true;
					}
				}
			}
			if(!found) {
				error("Location of Fire does not exist on floor", fire, null);
			}
		}
	}
	
	@Check
	def void checkNonCyclicSigns(Floorplan fp) {
		for(sign: fp.signs) {
			var set = new ArrayList<Door>();
			var queue = new ArrayList<EmergencySign>();
			queue.add(sign);
			while(!queue.empty) {
				val current = queue.get(0);
				queue.remove(0);
				if(set.contains(current.from)) {
					error("The emergency signs are circular dependant", sign, null);
					return;
				}
				set.add(current.ref.to);
				for(s: Helper.getDoorSigns(current.ref.to, fp)) {
					queue.add(s);
				}
			}
		}
	}
	
	@Check
	def void checkEmergencySignsConnectRooms(Floorplan fp) {
		if(fp.rooms.empty) { return; }
				
		// Do Floodfill to check if all cells are connected wrt Emergency Signs
		for(sign: fp.signs) {
			val common = Helper.commonRoom(sign.from, sign.ref.to, fp);
			if(common !== null) {
				var set = <Coordinate>newArrayList();
				if(Helper.isIn(sign.from.from, Helper.getRoomCoords(common))) {
					set.add(sign.from.from);
				} else {
					set.add(sign.from.to);
				}
			
				for(var i = 0; i < set.size; i++) {
					// Create the Cell List
					var current = null as Room;
					for(room: fp.rooms) {
						if(Helper.isIn(set.get(i), Helper.getRoomCoords(room))) {							
							current = room;
						}
					}
					val coords = Helper.getRoomCoords(current);
					for(door: fp.doors) {
						if(Helper.isIn(door.from, Helper.getRoomCoords(current)) || Helper.isIn(door.to, Helper.getRoomCoords(current))) {
							var has_sign = false;
							for(s: fp.signs) {
								if(s.from == door) {
									has_sign = true;
									val comm = Helper.commonRoom(s.from, s.ref.to, fp);
									if(comm !== null) {
										if(Helper.isIn(s.from.from, Helper.getRoomCoords(comm)) && !Helper.isIn(s.from.from, coords)) {
											coords.add(s.from.from);
										} else if(Helper.isIn(s.from.to, Helper.getRoomCoords(comm)) && !Helper.isIn(s.from.to, coords)) {
											coords.add(s.from.to);
										}
									}
								}
							}
							if(!has_sign) {
								if(!Helper.isIn(door.from, coords)) {
									coords.add(door.from);
								}
								if(!Helper.isIn(door.to, coords)) {
									coords.add(door.to);
								}
							}
						}
					}
					
					for(c: coords) {
						if(Helper.neighbouring(c, set.get(i)) && !Helper.isIn(c, set)) {
							set.add(c);
						}
					}
				}
				
				var found = false;
				for(exit: fp.exits) {
					if(Helper.isIn(exit.location, set)) {
						found = true;
					}
				}
				
				if(!found) {
					error("No exit is reachable with this Sign", sign, null);
				}
			}
		}
	}
	
	@Check
	def void checkSignsSameRoom(Floorplan fp) {
		for(sign: fp.signs) {
			val res = Helper.commonRoom(sign.from, sign.ref.to, fp);
			if(res === null) {
				error("Emergency Signs must point to doors in the same room", sign , null);
			}
		}
	}
	
	@Check
	def void checkPersonsInExistingCell(Floorplan fp) {
		var cells = new ArrayList<Coordinate>();
		for(room: fp.rooms) {
			cells.addAll(Helper.getRoomCoords(room));
		}
		for(person: fp.persons) {
			if(!Helper.isIn(person.location, cells)) {
				error("The person is not in an existing cell", person, null);
			}
		}
	}
	
	@Check
	def void checkValidImport(Import imp) {
		val context_uri = EcoreUtil2.getURI(imp);
		val current_directory = context_uri.trimSegments(1).path;
		val resurl = "platform:" + current_directory + "/" + uriResolver.apply(imp)
		val uri = URI.createURI(resurl);
		if(uri.fileExtension != 'br' && uri.fileExtension != 'breact') {
			error("Can only import BReact files", imp, null);
			return;
		}
		val resSet = new XtextResourceSet()
		try {
			resSet.getResource(uri, true)
		} catch(Exception e) {
			error(e.message, imp, null);
		}
	}
	
	@Check
	def void checkValidActions(Floorplan fp) {
		val context_uri = EcoreUtil2.getURI(fp);
		val current_directory = context_uri.trimSegments(1).path;
		val actions = newArrayList();
		val resSet = new XtextResourceSet()
		fp.imports.forEach[
			var uri = "platform:" + current_directory + "/" + uriResolver.apply(it)
			try {
				val res = resSet.getResource(URI.createURI(uri), true)
				val root = res.contents.get(0) as React;
				for(action: root.actions) {
					actions.add(action.name);
				}
			} catch(Exception e) {}
		]
		for(person: fp.persons) {
			val res = actions.filter[it == person.action.name]
			if(res.empty) {
				error("Invalid action for Person", person, null)
			} else if(res.length > 1) {
				error("Too many actions with this name", person, null)
			}
		}		
	}
}
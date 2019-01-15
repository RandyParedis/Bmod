/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.bmod.bmod.Area;
import org.xtext.bmod.bmod.BmodPackage;
import org.xtext.bmod.bmod.Coordinate;
import org.xtext.bmod.bmod.Door;
import org.xtext.bmod.bmod.EmergencySign;
import org.xtext.bmod.bmod.Exit;
import org.xtext.bmod.bmod.Fire;
import org.xtext.bmod.bmod.Floorplan;
import org.xtext.bmod.bmod.Import;
import org.xtext.bmod.bmod.Person;
import org.xtext.bmod.bmod.Room;
import org.xtext.bmod.breact.ActionDesc;
import org.xtext.bmod.breact.React;
import org.xtext.bmod.generator.Helper;
import org.xtext.bmod.validation.AbstractBmodValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class BmodValidator extends AbstractBmodValidator {
  @Inject
  private ImportUriResolver uriResolver;
  
  public static final String BR_TL = "brtl";
  
  @Check
  public void checkAreaTopLeftToBottomRight(final Area area) {
    if (((area.getFrom().getX() > area.getTo().getX()) || (area.getFrom().getY() > area.getTo().getY()))) {
      this.error("Area must be defined from top-left to bottom-right", BmodPackage.Literals.AREA__FROM, BmodValidator.BR_TL);
    }
  }
  
  @Check
  public void checkRoomAllCellsConnected(final Room room) {
    final ArrayList<Coordinate> coords = Helper.getRoomCoords(room);
    boolean _isEmpty = coords.isEmpty();
    if (_isEmpty) {
      this.error("Area must contain cells", room.getAreas().get(0), null);
    } else {
      ArrayList<Coordinate> set = CollectionLiterals.<Coordinate>newArrayList(coords.get(0));
      for (int i = 0; (i < set.size()); i++) {
        for (final Coordinate c : coords) {
          if ((Helper.neighbouring(c, set.get(i)) && (!Helper.isIn(c, set)))) {
            set.add(c);
          }
        }
      }
      int _size = set.size();
      int _size_1 = coords.size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        this.error("Room has disconnected cells", room, null);
      }
    }
  }
  
  @Check
  public void checkRoomsNoOverlap(final Floorplan fp) {
    EList<Room> _rooms = fp.getRooms();
    for (final Room a : _rooms) {
      EList<Room> _rooms_1 = fp.getRooms();
      for (final Room b : _rooms_1) {
        if (((!Objects.equal(a, b)) && Helper.areIntersecting(Helper.getRoomCoords(a), Helper.getRoomCoords(b)))) {
          this.error("Rooms are overlapping", b, null);
        }
      }
    }
  }
  
  @Check
  public void checkRoomsConnected(final Floorplan fp) {
    boolean _isEmpty = fp.getRooms().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      ArrayList<Room> set = CollectionLiterals.<Room>newArrayList(fp.getRooms().get(0));
      for (int i = 0; (i < set.size()); i++) {
        EList<Room> _rooms = fp.getRooms();
        for (final Room r : _rooms) {
          {
            boolean connected = false;
            EList<Door> _doors = fp.getDoors();
            for (final Door door : _doors) {
              if ((Helper.isIn(door.getFrom(), Helper.getRoomCoords(set.get(i))) && 
                Helper.isIn(door.getTo(), Helper.getRoomCoords(r)))) {
                connected = true;
              }
            }
            if ((connected && (!Helper.isIn(r, set)))) {
              set.add(r);
            }
          }
        }
      }
      int _size = set.size();
      int _size_1 = fp.getRooms().size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        this.error("Floorplan has disconnected rooms", fp, null);
      }
    }
  }
  
  @Check
  public void checkDoorCellsNeighbouring(final Door door) {
    boolean _neighbouring = Helper.neighbouring(door.getFrom(), door.getTo());
    boolean _not = (!_neighbouring);
    if (_not) {
      this.error("The cells of the door must be neighbouring", door, null);
    }
  }
  
  @Check
  public void checkDoorCellsDifferentRooms(final Floorplan fp) {
    EList<Room> _rooms = fp.getRooms();
    for (final Room room : _rooms) {
      {
        final ArrayList<Coordinate> cells = Helper.getRoomCoords(room);
        EList<Door> _doors = fp.getDoors();
        for (final Door door : _doors) {
          if ((Helper.isIn(door.getFrom(), cells) && Helper.isIn(door.getTo(), cells))) {
            this.error("The cells of the door must be in different rooms", door, null);
          }
        }
      }
    }
  }
  
  @Check
  public void checkAtLeastOneExit(final Floorplan fp) {
    boolean _isEmpty = fp.getExits().isEmpty();
    if (_isEmpty) {
      this.error("There must be at least one Exit in the floorplan", fp, null);
    }
  }
  
  @Check
  public void checkExitInFloor(final Floorplan fp) {
    EList<Exit> _exits = fp.getExits();
    for (final Exit exit : _exits) {
      {
        boolean found = false;
        EList<Room> _rooms = fp.getRooms();
        for (final Room room : _rooms) {
          ArrayList<Coordinate> _roomCoords = Helper.getRoomCoords(room);
          for (final Coordinate cell : _roomCoords) {
            if (((exit.getLocation().getX() == cell.getX()) && (exit.getLocation().getY() == cell.getY()))) {
              found = true;
            }
          }
        }
        if ((!found)) {
          this.error("Location of Exit does not exist on floor", exit, null);
        }
      }
    }
  }
  
  @Check
  public void checkFireInFloor(final Floorplan fp) {
    EList<Fire> _fires = fp.getFires();
    for (final Fire fire : _fires) {
      {
        boolean found = false;
        EList<Room> _rooms = fp.getRooms();
        for (final Room room : _rooms) {
          ArrayList<Coordinate> _roomCoords = Helper.getRoomCoords(room);
          for (final Coordinate cell : _roomCoords) {
            if (((fire.getLocation().getX() == cell.getX()) && (fire.getLocation().getY() == cell.getY()))) {
              found = true;
            }
          }
        }
        if ((!found)) {
          this.error("Location of Fire does not exist on floor", fire, null);
        }
      }
    }
  }
  
  @Check
  public void checkNonCyclicSigns(final Floorplan fp) {
    EList<EmergencySign> _signs = fp.getSigns();
    for (final EmergencySign sign : _signs) {
      {
        ArrayList<Door> set = new ArrayList<Door>();
        ArrayList<EmergencySign> queue = new ArrayList<EmergencySign>();
        queue.add(sign);
        while ((!queue.isEmpty())) {
          {
            final EmergencySign current = queue.get(0);
            queue.remove(0);
            boolean _contains = set.contains(current.getFrom());
            if (_contains) {
              this.error("The emergency signs are circular dependant", sign, null);
              return;
            }
            set.add(current.getRef().getTo());
            ArrayList<EmergencySign> _doorSigns = Helper.getDoorSigns(current.getRef().getTo(), fp);
            for (final EmergencySign s : _doorSigns) {
              queue.add(s);
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkEmergencySignsConnectRooms(final Floorplan fp) {
    boolean _isEmpty = fp.getRooms().isEmpty();
    if (_isEmpty) {
      return;
    }
    EList<EmergencySign> _signs = fp.getSigns();
    for (final EmergencySign sign : _signs) {
      {
        final Room common = Helper.commonRoom(sign.getFrom(), sign.getRef().getTo(), fp);
        if ((common != null)) {
          ArrayList<Coordinate> set = CollectionLiterals.<Coordinate>newArrayList();
          boolean _isIn = Helper.isIn(sign.getFrom().getFrom(), Helper.getRoomCoords(common));
          if (_isIn) {
            set.add(sign.getFrom().getFrom());
          } else {
            set.add(sign.getFrom().getTo());
          }
          for (int i = 0; (i < set.size()); i++) {
            {
              Room current = ((Room) null);
              EList<Room> _rooms = fp.getRooms();
              for (final Room room : _rooms) {
                boolean _isIn_1 = Helper.isIn(set.get(i), Helper.getRoomCoords(room));
                if (_isIn_1) {
                  current = room;
                }
              }
              final ArrayList<Coordinate> coords = Helper.getRoomCoords(current);
              EList<Door> _doors = fp.getDoors();
              for (final Door door : _doors) {
                if ((Helper.isIn(door.getFrom(), Helper.getRoomCoords(current)) || Helper.isIn(door.getTo(), Helper.getRoomCoords(current)))) {
                  boolean has_sign = false;
                  EList<EmergencySign> _signs_1 = fp.getSigns();
                  for (final EmergencySign s : _signs_1) {
                    Door _from = s.getFrom();
                    boolean _equals = Objects.equal(_from, door);
                    if (_equals) {
                      has_sign = true;
                      final Room comm = Helper.commonRoom(s.getFrom(), s.getRef().getTo(), fp);
                      if ((comm != null)) {
                        if ((Helper.isIn(s.getFrom().getFrom(), Helper.getRoomCoords(comm)) && (!Helper.isIn(s.getFrom().getFrom(), coords)))) {
                          coords.add(s.getFrom().getFrom());
                        } else {
                          if ((Helper.isIn(s.getFrom().getTo(), Helper.getRoomCoords(comm)) && (!Helper.isIn(s.getFrom().getTo(), coords)))) {
                            coords.add(s.getFrom().getTo());
                          }
                        }
                      }
                    }
                  }
                  if ((!has_sign)) {
                    boolean _isIn_2 = Helper.isIn(door.getFrom(), coords);
                    boolean _not = (!_isIn_2);
                    if (_not) {
                      coords.add(door.getFrom());
                    }
                    boolean _isIn_3 = Helper.isIn(door.getTo(), coords);
                    boolean _not_1 = (!_isIn_3);
                    if (_not_1) {
                      coords.add(door.getTo());
                    }
                  }
                }
              }
              for (final Coordinate c : coords) {
                if ((Helper.neighbouring(c, set.get(i)) && (!Helper.isIn(c, set)))) {
                  set.add(c);
                }
              }
            }
          }
          boolean found = false;
          EList<Exit> _exits = fp.getExits();
          for (final Exit exit : _exits) {
            boolean _isIn_1 = Helper.isIn(exit.getLocation(), set);
            if (_isIn_1) {
              found = true;
            }
          }
          if ((!found)) {
            this.error("No exit is reachable with this Sign", sign, null);
          }
        }
      }
    }
  }
  
  @Check
  public void checkSignsSameRoom(final Floorplan fp) {
    EList<EmergencySign> _signs = fp.getSigns();
    for (final EmergencySign sign : _signs) {
      {
        final Room res = Helper.commonRoom(sign.getFrom(), sign.getRef().getTo(), fp);
        if ((res == null)) {
          this.error("Emergency Signs must point to doors in the same room", sign, null);
        }
      }
    }
  }
  
  @Check
  public void checkPersonsInExistingCell(final Floorplan fp) {
    ArrayList<Coordinate> cells = new ArrayList<Coordinate>();
    EList<Room> _rooms = fp.getRooms();
    for (final Room room : _rooms) {
      cells.addAll(Helper.getRoomCoords(room));
    }
    EList<Person> _persons = fp.getPersons();
    for (final Person person : _persons) {
      boolean _isIn = Helper.isIn(person.getLocation(), cells);
      boolean _not = (!_isIn);
      if (_not) {
        this.error("The person is not in an existing cell", person, null);
      }
    }
  }
  
  @Check
  public void checkValidImport(final Import imp) {
    final URI context_uri = EcoreUtil2.getURI(imp);
    final String current_directory = context_uri.trimSegments(1).path();
    String _apply = this.uriResolver.apply(imp);
    final String resurl = ((("platform:" + current_directory) + "/") + _apply);
    final URI uri = URI.createURI(resurl);
    if (((!Objects.equal(uri.fileExtension(), "br")) && (!Objects.equal(uri.fileExtension(), "breact")))) {
      this.error("Can only import BReact files", imp, null);
      return;
    }
    final XtextResourceSet resSet = new XtextResourceSet();
    try {
      resSet.getResource(uri, true);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        this.error(e.getMessage(), imp, null);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Check
  public void checkValidActions(final Floorplan fp) {
    final URI context_uri = EcoreUtil2.getURI(fp);
    final String current_directory = context_uri.trimSegments(1).path();
    final ArrayList<String> actions = CollectionLiterals.<String>newArrayList();
    final XtextResourceSet resSet = new XtextResourceSet();
    final Consumer<Import> _function = (Import it) -> {
      String _apply = this.uriResolver.apply(it);
      String uri = ((("platform:" + current_directory) + "/") + _apply);
      try {
        final Resource res = resSet.getResource(URI.createURI(uri), true);
        EObject _get = res.getContents().get(0);
        final React root = ((React) _get);
        EList<ActionDesc> _actions = root.getActions();
        for (final ActionDesc action : _actions) {
          actions.add(action.getName());
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    };
    fp.getImports().forEach(_function);
    EList<Person> _persons = fp.getPersons();
    for (final Person person : _persons) {
      {
        final Function1<String, Boolean> _function_1 = (String it) -> {
          String _name = person.getAction().getName();
          return Boolean.valueOf(Objects.equal(it, _name));
        };
        final Iterable<String> res = IterableExtensions.<String>filter(actions, _function_1);
        boolean _isEmpty = IterableExtensions.isEmpty(res);
        if (_isEmpty) {
          this.error("Invalid action for Person", person, null);
        } else {
          int _length = ((Object[])Conversions.unwrapArray(res, Object.class)).length;
          boolean _greaterThan = (_length > 1);
          if (_greaterThan) {
            this.error("Too many actions with this name", person, null);
          }
        }
      }
    }
  }
}

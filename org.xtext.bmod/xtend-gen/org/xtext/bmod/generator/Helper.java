package org.xtext.bmod.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import org.xtext.bmod.bmod.Area;
import org.xtext.bmod.bmod.BmodFactory;
import org.xtext.bmod.bmod.Coordinate;
import org.xtext.bmod.bmod.Door;
import org.xtext.bmod.bmod.EmergencySign;
import org.xtext.bmod.bmod.Floorplan;
import org.xtext.bmod.bmod.Room;

@SuppressWarnings("all")
public class Helper {
  public static Coordinate newCoordinate(final int x, final int y) {
    Coordinate c = BmodFactory.eINSTANCE.createCoordinate();
    c.setX(x);
    c.setY(y);
    return c;
  }
  
  public static ArrayList<Coordinate> getAreaCoords(final Area area) {
    ArrayList<Coordinate> coords = CollectionLiterals.<Coordinate>newArrayList(area.getFrom());
    for (int x = area.getFrom().getX(); (x <= area.getTo().getX()); x++) {
      for (int y = area.getFrom().getY(); (y <= area.getTo().getY()); y++) {
        {
          Coordinate c = Helper.newCoordinate(x, y);
          boolean _isIn = Helper.isIn(c, coords);
          boolean _not = (!_isIn);
          if (_not) {
            coords.add(c);
          }
        }
      }
    }
    EList<Coordinate> _without = area.getWithout();
    for (final Coordinate c : _without) {
      for (int i = 0; (i < coords.size()); i++) {
        boolean _coordinateEquals = Helper.coordinateEquals(coords.get(i), c);
        if (_coordinateEquals) {
          coords.remove(i);
          i--;
        }
      }
    }
    return coords;
  }
  
  public static ArrayList<Coordinate> getRoomCoords(final Room room) {
    ArrayList<Coordinate> coords = CollectionLiterals.<Coordinate>newArrayList(room.getAreas().get(0).getFrom());
    EList<Area> _areas = room.getAreas();
    for (final Area area : _areas) {
      {
        final ArrayList<Coordinate> cc = Helper.getAreaCoords(area);
        for (final Coordinate c : cc) {
          boolean _isIn = Helper.isIn(c, coords);
          boolean _not = (!_isIn);
          if (_not) {
            coords.add(c);
          }
        }
      }
    }
    return coords;
  }
  
  public static boolean neighbouring(final Coordinate a, final Coordinate b) {
    return (((((a.getX() + 1) == b.getX()) || ((a.getX() - 1) == b.getX())) && (a.getY() == b.getY())) || ((((a.getY() + 1) == b.getY()) || ((a.getY() - 1) == b.getY())) && (a.getX() == b.getX())));
  }
  
  public static boolean isIn(final Coordinate c, final ArrayList<Coordinate> l) {
    for (final Coordinate e : l) {
      boolean _coordinateEquals = Helper.coordinateEquals(c, e);
      if (_coordinateEquals) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean isIn(final Room c, final ArrayList<Room> l) {
    for (final Room e : l) {
      boolean _equals = Objects.equal(c, e);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean isIn(final Door d, final ArrayList<Door> l) {
    for (final Door e : l) {
      boolean _equals = Objects.equal(d, e);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean coordinateEquals(final Coordinate a, final Coordinate b) {
    return ((a.getX() == b.getX()) && (a.getY() == b.getY()));
  }
  
  public static boolean areIntersecting(final ArrayList<Coordinate> a, final ArrayList<Coordinate> b) {
    for (final Coordinate i : a) {
      for (final Coordinate j : b) {
        boolean _coordinateEquals = Helper.coordinateEquals(i, j);
        if (_coordinateEquals) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static EmergencySign getDoorSign(final Door door, final Floorplan fp) {
    EList<EmergencySign> _signs = fp.getSigns();
    for (final EmergencySign sign : _signs) {
      Door _from = sign.getFrom();
      boolean _equals = Objects.equal(_from, door);
      if (_equals) {
        return sign;
      }
    }
    return null;
  }
  
  public static ArrayList<EmergencySign> getDoorSigns(final Door door, final Floorplan fp) {
    ArrayList<EmergencySign> set = new ArrayList<EmergencySign>();
    EList<EmergencySign> _signs = fp.getSigns();
    for (final EmergencySign sign : _signs) {
      Door _from = sign.getFrom();
      boolean _equals = Objects.equal(_from, door);
      if (_equals) {
        set.add(sign);
      }
    }
    return set;
  }
  
  public static ArrayList<Door> chainDoors(final Door door, final Floorplan fp) {
    ArrayList<Door> set = new ArrayList<Door>();
    ArrayList<EmergencySign> queue = new ArrayList<EmergencySign>();
    ArrayList<EmergencySign> _doorSigns = Helper.getDoorSigns(door, fp);
    for (final EmergencySign s : _doorSigns) {
      queue.add(s);
    }
    while ((!queue.isEmpty())) {
      {
        final EmergencySign current = queue.get(0);
        queue.remove(0);
        set.add(current.getRef().getTo());
        ArrayList<EmergencySign> _doorSigns_1 = Helper.getDoorSigns(current.getRef().getTo(), fp);
        for (final EmergencySign s_1 : _doorSigns_1) {
          queue.add(s_1);
        }
      }
    }
    return set;
  }
  
  public static ArrayList<Door> sortDoors(final Floorplan fp) {
    final ArrayList<Door> doors = CollectionLiterals.<Door>newArrayList();
    EList<Door> _doors = fp.getDoors();
    for (final Door d : _doors) {
      doors.add(d);
    }
    final Comparator<Door> _function = (Door a, Door b) -> {
      final ArrayList<Door> chainA = Helper.chainDoors(a, fp);
      final ArrayList<Door> chainB = Helper.chainDoors(b, fp);
      boolean _contains = chainA.contains(b);
      if (_contains) {
        return (-1);
      }
      boolean _contains_1 = chainB.contains(a);
      if (_contains_1) {
        return 1;
      }
      return 0;
    };
    doors.sort(_function);
    return doors;
  }
  
  public static Room commonRoom(final Door d1, final Door d2, final Floorplan fp) {
    EList<Room> _rooms = fp.getRooms();
    for (final Room room : _rooms) {
      {
        final ArrayList<Coordinate> rc = Helper.getRoomCoords(room);
        if (((((Helper.isIn(d1.getFrom(), rc) && Helper.isIn(d2.getFrom(), rc)) || (Helper.isIn(d1.getFrom(), rc) && Helper.isIn(d2.getTo(), rc))) || (Helper.isIn(d1.getTo(), rc) && Helper.isIn(d2.getFrom(), rc))) || (Helper.isIn(d1.getTo(), rc) && Helper.isIn(d2.getTo(), rc)))) {
          return room;
        }
      }
    }
    return null;
  }
  
  public static Pair<Coordinate, Coordinate> getFloorplanBoundaries(final Floorplan fp) {
    Coordinate min = ((Coordinate) null);
    Coordinate max = ((Coordinate) null);
    EList<Room> _rooms = fp.getRooms();
    for (final Room room : _rooms) {
      ArrayList<Coordinate> _roomCoords = Helper.getRoomCoords(room);
      for (final Coordinate cell : _roomCoords) {
        {
          if ((min == null)) {
            min = Helper.newCoordinate(cell.getX(), cell.getY());
          }
          if ((max == null)) {
            max = Helper.newCoordinate(cell.getX(), cell.getY());
          }
          int _x = cell.getX();
          int _x_1 = min.getX();
          boolean _lessThan = (_x < _x_1);
          if (_lessThan) {
            min.setX(cell.getX());
          } else {
            int _y = cell.getY();
            int _y_1 = min.getY();
            boolean _lessThan_1 = (_y < _y_1);
            if (_lessThan_1) {
              min.setY(cell.getY());
            }
          }
          int _x_2 = cell.getX();
          int _x_3 = max.getX();
          boolean _greaterThan = (_x_2 > _x_3);
          if (_greaterThan) {
            max.setX(cell.getX());
          } else {
            int _y_2 = cell.getY();
            int _y_3 = max.getY();
            boolean _greaterThan_1 = (_y_2 > _y_3);
            if (_greaterThan_1) {
              max.setY(cell.getY());
            }
          }
        }
      }
    }
    return Pair.<Coordinate, Coordinate>of(min, max);
  }
  
  public static ArrayList<Pair<Coordinate, Coordinate>> getRoomObstacles(final Room room, final Floorplan fp) {
    ArrayList<Pair<Coordinate, Coordinate>> result = CollectionLiterals.<Pair<Coordinate, Coordinate>>newArrayList();
    ArrayList<Coordinate> cells = Helper.getRoomCoords(room);
    ArrayList<Coordinate> subset = CollectionLiterals.<Coordinate>newArrayList();
    subset.addAll(cells);
    EList<Room> _rooms = fp.getRooms();
    for (final Room r : _rooms) {
      boolean _notEquals = (!Objects.equal(r, room));
      if (_notEquals) {
        final ArrayList<Coordinate> c = Helper.getRoomCoords(r);
        EList<Door> _doors = fp.getDoors();
        for (final Door door : _doors) {
          boolean _isIn = Helper.isIn(door.getFrom(), c);
          if (_isIn) {
            subset.add(door.getFrom());
          } else {
            boolean _isIn_1 = Helper.isIn(door.getTo(), c);
            if (_isIn_1) {
              subset.add(door.getTo());
            }
          }
        }
      }
    }
    for (final Coordinate cell : cells) {
      {
        boolean top = true;
        boolean bottom = true;
        boolean left = true;
        boolean right = true;
        for (final Coordinate n : subset) {
          {
            if (((cell.getY() == n.getY()) && ((cell.getX() + 1) == n.getX()))) {
              right = false;
            }
            if (((cell.getY() == n.getY()) && ((cell.getX() - 1) == n.getX()))) {
              left = false;
            }
            if (((cell.getX() == n.getX()) && ((cell.getY() + 1) == n.getY()))) {
              bottom = false;
            }
            if (((cell.getX() == n.getX()) && ((cell.getY() - 1) == n.getY()))) {
              top = false;
            }
          }
        }
        if (top) {
          final Coordinate c1 = Helper.newCoordinate(cell.getX(), cell.getY());
          int _x = cell.getX();
          int _plus = (_x + 1);
          final Coordinate c2 = Helper.newCoordinate(_plus, cell.getY());
          final Pair<Coordinate, Coordinate> pair = Pair.<Coordinate, Coordinate>of(c1, c2);
          result.add(pair);
        }
        if (left) {
          final Coordinate c1_1 = Helper.newCoordinate(cell.getX(), cell.getY());
          int _x_1 = cell.getX();
          int _y = cell.getY();
          int _plus_1 = (_y + 1);
          final Coordinate c2_1 = Helper.newCoordinate(_x_1, _plus_1);
          final Pair<Coordinate, Coordinate> pair_1 = Pair.<Coordinate, Coordinate>of(c1_1, c2_1);
          result.add(pair_1);
        }
        if (right) {
          int _x_2 = cell.getX();
          int _plus_2 = (_x_2 + 1);
          final Coordinate c1_2 = Helper.newCoordinate(_plus_2, cell.getY());
          int _x_3 = cell.getX();
          int _plus_3 = (_x_3 + 1);
          int _y_1 = cell.getY();
          int _plus_4 = (_y_1 + 1);
          final Coordinate c2_2 = Helper.newCoordinate(_plus_3, _plus_4);
          final Pair<Coordinate, Coordinate> pair_2 = Pair.<Coordinate, Coordinate>of(c1_2, c2_2);
          result.add(pair_2);
        }
        if (bottom) {
          int _x_4 = cell.getX();
          int _y_2 = cell.getY();
          int _plus_5 = (_y_2 + 1);
          final Coordinate c1_3 = Helper.newCoordinate(_x_4, _plus_5);
          int _x_5 = cell.getX();
          int _plus_6 = (_x_5 + 1);
          int _y_3 = cell.getY();
          int _plus_7 = (_y_3 + 1);
          final Coordinate c2_3 = Helper.newCoordinate(_plus_6, _plus_7);
          final Pair<Coordinate, Coordinate> pair_3 = Pair.<Coordinate, Coordinate>of(c1_3, c2_3);
          result.add(pair_3);
        }
      }
    }
    return result;
  }
}

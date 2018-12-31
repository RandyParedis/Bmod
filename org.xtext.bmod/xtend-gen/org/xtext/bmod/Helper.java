package org.xtext.bmod;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.bmod.bmod.Area;
import org.xtext.bmod.bmod.BmodFactory;
import org.xtext.bmod.bmod.Coordinate;
import org.xtext.bmod.bmod.Door;
import org.xtext.bmod.bmod.EmergencySign;
import org.xtext.bmod.bmod.Floorplan;
import org.xtext.bmod.bmod.Room;

@SuppressWarnings("all")
public class Helper {
  public static ArrayList<Coordinate> getAreaCoords(final Area area) {
    ArrayList<Coordinate> coords = CollectionLiterals.<Coordinate>newArrayList(area.getFrom());
    for (int x = area.getFrom().getX(); (x <= area.getTo().getX()); x++) {
      for (int y = area.getFrom().getY(); (y <= area.getTo().getY()); y++) {
        {
          Coordinate c = BmodFactory.eINSTANCE.createCoordinate();
          c.setX(x);
          c.setY(y);
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
      Door _on = sign.getOn();
      boolean _equals = Objects.equal(_on, door);
      if (_equals) {
        return sign;
      }
    }
    return null;
  }
}

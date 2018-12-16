package org.xtext.bmod;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.bmod.bmod.Area;
import org.xtext.bmod.bmod.BmodFactory;
import org.xtext.bmod.bmod.Coordinate;

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
}

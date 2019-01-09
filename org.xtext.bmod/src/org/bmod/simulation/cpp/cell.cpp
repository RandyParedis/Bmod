/**
 * This file is generated for a pedsim simulation of Bmod.
 */

#include "cell.h"

namespace simulation {	
	bool find(Cell* needle, const std::vector<Cell*>& haystack) {
		for(Cell* cell: haystack) {
			if(cell->x == needle->x && cell->y == needle->y) {
				return true;
			}
		}
		return false;
	}
	
	bool Cell::canSpread(Cell* target, const Floor& floor, const std::vector<Cell*>& fire, const std::vector<Cell*>& to_add) {
		if(find(target, fire) || find(target, to_add)) { return false; }
		for(std::vector<Cell*> room: floor.rooms) {
			if(!find(this, room)) { continue; }
			for(Door* door: floor.doors) {
				room.emplace_back(new Cell(door->x1, door->y1));
				room.emplace_back(new Cell(door->x2, door->y2));
			}
			return find(target, room);
		}
		return false;
	}
}

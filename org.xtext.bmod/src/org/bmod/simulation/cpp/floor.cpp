/**
 * This file is generated for a pedsim simulation of Bmod.
 */


#include "person.h"
#include "floor.h"
#include "cell.h"

namespace simulation {
	void Floor::setExit(double x, double y) {
		Cell* a = at(x, y);
		if(a != nullptr) {
			a->exit = true;
		}
	}
	
	Cell* Floor::at(double x, double y) const {
		for(std::vector<Cell*> room: rooms) {
			for(Cell* cell: room) {
				if(cell->x == x && cell->y == y) {
					return cell;
				}
			}
		}
		return nullptr;
	}
}

/**
 * This file is generated for a pedsim simulation of Bmod.
 */

#ifndef SIMULATION_CELL_H
#define SIMULATION_CELL_H

#include "floor.h"
#include "door.h"
#include <vector>

namespace simulation {
	
	struct Cell {
		int x;
		int y;
		bool onfire;
		bool drawn;
		
		bool exit;
		
		Cell(int x, int y): x(x), y(y), onfire(false), drawn(false), exit(false) {}
		
		bool canSpread(Cell* target, const Floor& floor, const std::vector<Cell*>& fire, const std::vector<Cell*>& to_add);
	};
	
	bool find(Cell* needle, const std::vector<Cell*>& haystack);
}

#endif


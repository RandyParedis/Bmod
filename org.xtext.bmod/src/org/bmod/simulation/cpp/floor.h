/**
 * This file is generated for a pedsim simulation of Bmod.
 */

#ifndef SIMULATION_FLOOR_H
#define SIMULATION_FLOOR_H

#include "door.h"

namespace simulation {

	struct Cell;
	class Person;

	struct Floor {
		std::vector<std::vector<Cell*>> rooms;
		std::vector<Door*> doors;
		std::vector<Person*> people;
		
		void setExit(double x, double y);
		
		Cell* at(double x, double y) const;
	};
}

#endif


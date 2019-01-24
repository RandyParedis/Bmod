/**
 * This file is generated for a pedsim simulation of Bmod.
 */

#ifndef SIMULATION_FLOOR_H
#define SIMULATION_FLOOR_H

#include <functional>
#include <map>
#include "door.h"

namespace simulation {

	struct Cell;
	class Person;

	struct Floor {
		std::vector<std::vector<Cell*>> rooms;
		std::map<unsigned long, unsigned long> capacities;
		std::vector<Door*> doors;
		std::vector<Person*> people;
		
		double scale = 1.0;
		
		void setExit(double x, double y);
		
		Cell* at(double x, double y) const;
		
		std::vector<Cell*> find(std::function<bool(const Cell* cell)> condition, const Cell* room=nullptr, bool joindoors=false) const;
		std::vector<Door*> find(std::function<bool(const Door* cell)> condition, const Cell* room=nullptr) const;
		std::vector<Person*> find(std::function<bool(const Person* cell)> condition, const Person* room) const;
		std::vector<Person*> find(std::function<bool(const Person* cell)> condition, const Cell* room=nullptr) const;
		
		double distance(const Cell* a, const Cell* b, bool throughfire=false) const;
		double distance(double x1, double y1, double x2, double y2, bool throughfire=false) const;
		
		std::vector<Cell*> bfs(const Cell* a, const Cell* b, bool throughfire=false) const;
		std::vector<Cell*> bfs(double x1, double y1, double x2, double y2, bool throughfire=false) const;
	};
}

#endif


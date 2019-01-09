/**
 * This file is generated for a pedsim simulation of Bmod.
 */
 
#include "../person.h"
#include "../floor.h"
#include "../cell.h"

#include <cmath>

namespace simulation {
	namespace targetters {
		Person::TargetterFunc action_experienced = [](const Person* person, const Floor& floor) -> Cell* {
			auto dist = [](double x1, double y1, double x2, double y2) -> double {
				return std::abs(x2 - x1) + std::abs(y2 - y1);
			};
			
			// find nearest Person (This type of code can be generated via the br-file?)
			Person* nearest = nullptr;
			for(Person* p : floor.people) {
				if(p == person) { continue; }
				if(nearest == nullptr || dist(person->getX(), person->getY(), p->getX(), p->getY()) < dist(person->getX(), person->getY(), nearest->getX(), nearest->getY())) {
					nearest = p;
				}
			}
			if(nearest != nullptr) {
				return floor.at(nearest->getX(), nearest->getY());
			}
			return nullptr;
		};
	}
}

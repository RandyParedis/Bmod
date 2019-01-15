/**
 * This file is generated for a pedsim simulation of Bmod.
 * It contains the actionprofiles of the people, generated from BReact.
 */

#include "targetters.h"

#include "../simulation/cell.h"
#include "../simulation/floor.h"

#include <cmath>

namespace simulation {
	namespace targetters {
		const bool action_experienced_shared = false;
		Person::TargetterFunc action_experienced = [](const Person* person, const Floor& floor) -> Cell* {
			auto dist = [&floor, &person](double x, double y) -> double { return floor.distance(person->getX(), person->getY(), x, y); };
			Cell* location = floor.at(person->getX(), person->getY());
		
			std::vector<Person*> ptargets;
			std::vector<Cell*> ctargets;
			std::vector<Door*> dtargets;
		
			ctargets = floor.find([&location, &floor](const Cell* c)->bool {
				return (c != location && c->exit && !c->onfire);
			}, location);
			if(!ctargets.empty()) {
				Cell* ctarget = nullptr;
				for(Cell* c: ctargets) {
					if(ctarget == nullptr ||
						dist(c->x, c->y) < dist(ctarget->x, ctarget->y)) {
							ctarget = c;
					}
				}
				if(ctarget != nullptr) {
					return ctarget;
				}
			}
			
			dtargets = floor.find([&floor](const Door* d)->bool {
				return (!floor.at(d->getX1(), d->getY1())->onfire || !floor.at(d->getX2(), d->getY2())->onfire);
			}, location);
			if(!dtargets.empty()) {
				Door* dtarget = nullptr;
				for(Door* d: dtargets) {
					if(dtarget == nullptr ||
						dist(d->getX1(), d->getY1()) < dist(dtarget->getX1(), dtarget->getY1()) ||
						dist(d->getX1(), d->getY1()) < dist(dtarget->getX2(), dtarget->getY2()) ||
						dist(d->getX2(), d->getY2()) < dist(dtarget->getX1(), dtarget->getY1()) ||
						dist(d->getX2(), d->getY2()) < dist(dtarget->getX2(), dtarget->getY2())) {
							dtarget = d;
					}
				}
				if(dtarget != nullptr) {
					if(dist(dtarget->getX1(), dtarget->getY1()) > dist(dtarget->getX2(), dtarget->getY2())) {
						return floor.at(dtarget->getX1(), dtarget->getY1());
					}
					return floor.at(dtarget->getX2(), dtarget->getY2());
				}
			}
			
			ctargets = floor.find([&location, &floor](const Cell* c)->bool {
				return (c != location && c->exit && !c->onfire);
			});
			if(!ctargets.empty()) {
				Cell* ctarget = nullptr;
				for(Cell* c: ctargets) {
					if(ctarget == nullptr ||
						dist(c->x, c->y) < dist(ctarget->x, ctarget->y)) {
							ctarget = c;
					}
				}
				if(ctarget != nullptr) {
					return ctarget;
				}
			}
			
			return nullptr;
		};
		
		const bool action_newcomer_shared = false;
		Person::TargetterFunc action_newcomer = [](const Person* person, const Floor& floor) -> Cell* {
			auto dist = [&floor, &person](double x, double y) -> double { return floor.distance(person->getX(), person->getY(), x, y); };
			Cell* location = floor.at(person->getX(), person->getY());
		
			std::vector<Person*> ptargets;
			std::vector<Cell*> ctargets;
			std::vector<Door*> dtargets;
		
			ptargets = floor.find([&person, &floor](const Person* p)->bool {
				return (p != person && !p->hasEscaped() && !floor.at(p->getX(), p->getY())->onfire);
			}, person);
			if(!ptargets.empty()) {
				Person* ptarget = nullptr;
				for(Person* p: ptargets) {
					if(ptarget == nullptr ||
						dist(p->getX(), p->getY()) < dist(ptarget->getX(), ptarget->getY())) {
							ptarget = p;
					}
				}
				if(ptarget != nullptr) {
					return floor.at(ptarget->getX(), ptarget->getY());
				}
			}
			
			return nullptr;
		};
		
		const bool action_newcomer_better_shared = false;
		Person::TargetterFunc action_newcomer_better = [](const Person* person, const Floor& floor) -> Cell* {
			auto dist = [&floor, &person](double x, double y) -> double { return floor.distance(person->getX(), person->getY(), x, y); };
			Cell* location = floor.at(person->getX(), person->getY());
		
			std::vector<Person*> ptargets;
			std::vector<Cell*> ctargets;
			std::vector<Door*> dtargets;
		
			ptargets = floor.find([&person, &floor](const Person* p)->bool {
				return (p != person && !p->hasEscaped() && !floor.at(p->getX(), p->getY())->onfire);
			}, person);
			if(!ptargets.empty()) {
				Person* ptarget = nullptr;
				for(Person* p: ptargets) {
					if(ptarget == nullptr ||
						dist(p->getX(), p->getY()) < dist(ptarget->getX(), ptarget->getY())) {
							ptarget = p;
					}
				}
				if(ptarget != nullptr) {
					return floor.at(ptarget->getX(), ptarget->getY());
				}
			}
			
			ctargets = floor.find([&location, &floor](const Cell* c)->bool {
				return (c != location && c->exit);
			}, location);
			if(!ctargets.empty()) {
				Cell* ctarget = nullptr;
				for(Cell* c: ctargets) {
					if(ctarget == nullptr ||
						dist(c->x, c->y) < dist(ctarget->x, ctarget->y)) {
							ctarget = c;
					}
				}
				if(ctarget != nullptr) {
					return ctarget;
				}
			}
			
			dtargets = floor.find([&floor](const Door* d)->bool {
				return (true);
			}, location);
			if(!dtargets.empty()) {
				if(dist(dtargets.front()->getX1(), dtargets.front()->getY1()) > dist(dtargets.front()->getX2(), dtargets.front()->getY2())) {
					return floor.at(dtargets.front()->getX1(), dtargets.front()->getY1());
				}
				return floor.at(dtargets.front()->getX2(), dtargets.front()->getY2());
			}
			
			return nullptr;
		};
		
		const bool action_panic1_shared = false;
		Person::TargetterFunc action_panic1 = [](const Person* person, const Floor& floor) -> Cell* {
			auto dist = [&floor, &person](double x, double y) -> double { return floor.distance(person->getX(), person->getY(), x, y); };
			Cell* location = floor.at(person->getX(), person->getY());
		
			std::vector<Person*> ptargets;
			std::vector<Cell*> ctargets;
			std::vector<Door*> dtargets;
		
			ctargets = floor.find([&location](const Cell* c)->bool {
				return (c != location);
			}, location);
			if(!ctargets.empty()) {
				return ctargets.front();
			}
			
			return nullptr;
		};
		
		const bool action_panic2_shared = false;
		Person::TargetterFunc action_panic2 = [](const Person* person, const Floor& floor) -> Cell* {
			auto dist = [&floor, &person](double x, double y) -> double { return floor.distance(person->getX(), person->getY(), x, y); };
			Cell* location = floor.at(person->getX(), person->getY());
		
			std::vector<Person*> ptargets;
			std::vector<Cell*> ctargets;
			std::vector<Door*> dtargets;
		
			ctargets = floor.find([&location](const Cell* c)->bool {
				return (c != location);
			}, location);
			if(!ctargets.empty()) {
				return ctargets.back();
			}
			
			return nullptr;
		};
		
		const bool action_scared_shared = false;
		Person::TargetterFunc action_scared = [](const Person* person, const Floor& floor) -> Cell* {
			auto dist = [&floor, &person](double x, double y) -> double { return floor.distance(person->getX(), person->getY(), x, y); };
			Cell* location = floor.at(person->getX(), person->getY());
		
			std::vector<Person*> ptargets;
			std::vector<Cell*> ctargets;
			std::vector<Door*> dtargets;
		
			ctargets = floor.find([&location](const Cell* c)->bool {
				return (c != location && c->onfire);
			}, location);
			if(!ctargets.empty()) {
				Cell* farthest = nullptr;
				double fd = 0;
				std::vector<Cell*> lst = floor.find([](const Cell* c){ return !c->onfire; }, location);
				for(Cell* cell: lst) {
					double d = 0;
					for(Cell* c: ctargets) {
						d += floor.distance(c->x, c->y, cell->x, cell->y);
					}
					if(farthest == nullptr || d > fd) {
						farthest = cell;
						fd = d;
					}
				}
				if(farthest != nullptr) { return farthest; }
			}
			
			return nullptr;
		};
		
		const bool action_suicidal_shared = false;
		Person::TargetterFunc action_suicidal = [](const Person* person, const Floor& floor) -> Cell* {
			auto dist = [&floor, &person](double x, double y) -> double { return floor.distance(person->getX(), person->getY(), x, y); };
			Cell* location = floor.at(person->getX(), person->getY());
		
			std::vector<Person*> ptargets;
			std::vector<Cell*> ctargets;
			std::vector<Door*> dtargets;
		
			ctargets = floor.find([&location](const Cell* c)->bool {
				return (c != location && c->onfire);
			}, location);
			if(!ctargets.empty()) {
				Cell* ctarget = nullptr;
				for(Cell* c: ctargets) {
					if(ctarget == nullptr ||
						dist(c->x, c->y) < dist(ctarget->x, ctarget->y)) {
							ctarget = c;
					}
				}
				if(ctarget != nullptr) {
					return ctarget;
				}
			}
			
			return nullptr;
		};
		
		const bool action_smart_shared = true;
		Person::TargetterFunc action_smart = [](const Person* person, const Floor& floor) -> Cell* {
			auto dist = [&floor, &person](double x, double y) -> double { return floor.distance(person->getX(), person->getY(), x, y); };
			Cell* location = floor.at(person->getX(), person->getY());
		
			std::vector<Person*> ptargets;
			std::vector<Cell*> ctargets;
			std::vector<Door*> dtargets;
		
			ctargets = floor.find([&location, &floor](const Cell* c)->bool {
				return (c != location && c->exit && !c->onfire);
			}, location);
			if(!ctargets.empty()) {
				Cell* ctarget = nullptr;
				for(Cell* c: ctargets) {
					if(ctarget == nullptr ||
						dist(c->x, c->y) < dist(ctarget->x, ctarget->y)) {
							ctarget = c;
					}
				}
				if(ctarget != nullptr) {
					return ctarget;
				}
			}
			
			ctargets = floor.find([&location, &floor](const Cell* c)->bool {
				return (c != location && c->exit);
			}, location);
			if(!ctargets.empty()) {
				Cell* ctarget = nullptr;
				for(Cell* c: ctargets) {
					if(ctarget == nullptr ||
						dist(c->x, c->y) < dist(ctarget->x, ctarget->y)) {
							ctarget = c;
					}
				}
				if(ctarget != nullptr) {
					return ctarget;
				}
			}
			
			dtargets = floor.find([&floor](const Door* d)->bool {
				return (!floor.at(d->getX1(), d->getY1())->onfire || !floor.at(d->getX2(), d->getY2())->onfire);
			}, location);
			if(!dtargets.empty()) {
				if(dist(dtargets.back()->getX1(), dtargets.back()->getY1()) > dist(dtargets.back()->getX2(), dtargets.back()->getY2())) {
					return floor.at(dtargets.back()->getX1(), dtargets.back()->getY1());
				}
				return floor.at(dtargets.back()->getX2(), dtargets.back()->getY2());
			}
			
			dtargets = floor.find([&floor](const Door* d)->bool {
				return (true);
			}, location);
			if(!dtargets.empty()) {
				Door* dtarget = nullptr;
				for(Door* d: dtargets) {
					if(dtarget == nullptr ||
						dist(d->getX1(), d->getY1()) < dist(dtarget->getX1(), dtarget->getY1()) ||
						dist(d->getX1(), d->getY1()) < dist(dtarget->getX2(), dtarget->getY2()) ||
						dist(d->getX2(), d->getY2()) < dist(dtarget->getX1(), dtarget->getY1()) ||
						dist(d->getX2(), d->getY2()) < dist(dtarget->getX2(), dtarget->getY2())) {
							dtarget = d;
					}
				}
				if(dtarget != nullptr) {
					if(dist(dtarget->getX1(), dtarget->getY1()) > dist(dtarget->getX2(), dtarget->getY2())) {
						return floor.at(dtarget->getX1(), dtarget->getY1());
					}
					return floor.at(dtarget->getX2(), dtarget->getY2());
				}
			}
			
			ctargets = floor.find([&location](const Cell* c)->bool {
				return (c != location && c->onfire);
			}, location);
			if(!ctargets.empty()) {
				Cell* farthest = nullptr;
				double fd = 0;
				std::vector<Cell*> lst = floor.find([](const Cell* c){ return !c->onfire; }, location);
				for(Cell* cell: lst) {
					double d = 0;
					for(Cell* c: ctargets) {
						d += floor.distance(c->x, c->y, cell->x, cell->y);
					}
					if(farthest == nullptr || d > fd) {
						farthest = cell;
						fd = d;
					}
				}
				if(farthest != nullptr) { return farthest; }
			}
			
			return nullptr;
		};
		
	}
}

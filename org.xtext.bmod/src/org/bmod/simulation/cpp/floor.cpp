/**
 * This file is generated for a pedsim simulation of Bmod.
 */


#include "person.h"
#include "floor.h"
#include "cell.h"

#include <math.h>
#include <queue>
#include <utility>

namespace simulation {
	void Floor::setExit(double x, double y) {
		Cell* a = at(x, y);
		if(a != nullptr) {
			a->exit = true;
		}
	}
	
	Cell* Floor::at(double x, double y) const {
		x = floor(x);
		y = floor(y);
		for(const std::vector<Cell*>& room: rooms) {
			for(Cell* cell: room) {
				if(cell->x == x && cell->y == y) {
					return cell;
				}
			}
		}
		return nullptr;
	}
	
	std::vector<Cell*> Floor::find(std::function<bool(const Cell* cell)> condition, const Cell* roomcell, bool joindoors) const {
		std::vector<Cell*> lst;
		if(roomcell != nullptr) {
			for(const std::vector<Cell*>& room: rooms) {
				bool here = false;
				for(Cell* cell: room) {
					if(cell == roomcell) { here = true; break; }
				}
				if(here) {
					for(Cell* cell: room) {
						if(condition(cell)) { lst.emplace_back(cell); }
					}
					break;
				}
			}
			if(joindoors) {
				std::vector<Door*> roomdoors = find([](const Door* door) { return true; }, roomcell);
				for(Door* door: roomdoors) {
					Cell* dc1 = at(door->getX1(), door->getY1());
					Cell* dc2 = at(door->getX2(), door->getY2());
					if(condition(dc1)) { lst.emplace_back(dc1); }
					if(condition(dc2)) { lst.emplace_back(dc2); }
				}
			}
		} else {
			for(const std::vector<Cell*>& room: rooms) {
				for(Cell* cell: room) {
					if(condition(cell)) { lst.emplace_back(cell); }
				}
			}
		}
		return lst;
	}
	
	std::vector<Door*> Floor::find(std::function<bool(const Door* cell)> condition, const Cell* roomcell) const {
		std::vector<Door*> lst;
		if(roomcell != nullptr) {
			for(const std::vector<Cell*>& room: rooms) {
				bool here = false;
				for(Cell* cell: room) {
					if(cell == roomcell) { here = true; break; }
				}
				if(here) {
					for(Door* door: doors) {
						if(condition(door)) {
							Cell* dc1 = at(door->getX1(), door->getY1());
							Cell* dc2 = at(door->getX2(), door->getY2());
							for(Cell* cell: room) {
								if(dc1 == cell || dc2 == cell) { lst.emplace_back(door); }
							}
						}
					}
					break;
				}
			}
		} else {
			for(Door* door: doors) {
				if(condition(door)) { lst.emplace_back(door); }
			}
		}
		return lst;
	}
	
	std::vector<Person*> Floor::find(std::function<bool(const Person* cell)> condition, const Person* roomperson) const {
		Cell* loc = nullptr;
		if(roomperson != nullptr) {
			loc = at(roomperson->getX(), roomperson->getY());
		}
		return find(condition, loc);
	}
	
	std::vector<Person*> Floor::find(std::function<bool(const Person* cell)> condition, const Cell* roomperson) const {
		std::vector<Person*> lst;
		if(roomperson != nullptr) {
			for(const std::vector<Cell*>& room: rooms) {
				bool here = false;
				for(Cell* cell: room) {
					if(roomperson == cell) { here = true; break; }
				}
				if(here) {
					for(Person* person: people) {
						if(condition(person)) {
							Cell* c = at(person->getX(), person->getY());
							for(Cell* cell: room) {
								if(c == cell) { lst.emplace_back(person); }
							}
						}
					}
					break;
				}
			}
		} else {
			for(Person* person: people) {
				if(condition(person)) { lst.emplace_back(person); }
			}
		}
		return lst;
	}
	
	double Floor::distance(const Cell* a, const Cell* b, bool throughfire) const {
		std::map<const Cell*, double> path;
		path[a] = 0.0;
		std::queue<const Cell*> queue;
		queue.push(a);
		
		while(!queue.empty()) {
			const Cell* c = queue.front();
			queue.pop();
			
			std::vector<Cell*> candidates = find([&c, this, &path, &throughfire](const Cell* f) {
				return ((((f->x == c->x + this->scale || f->x == c->x - this->scale) && f->y == c->y) ||
					((f->y == c->y + this->scale || f->y == c->y - this->scale) && f->x == c->x)) && 
					path.find(f) == path.end() && !(!throughfire && f->onfire));
			}, c, true);
			for(Cell* candidate: candidates) {
				queue.push(candidate);
				double dist = path.at(c) + 1.0;
				if(candidate == b) {
					return dist;
				}
				path[candidate] = dist;
			}
		}
		return 0;
	}
	
	double Floor::distance(double x1, double y1, double x2, double y2, bool throughfire) const {
		return distance(at(x1, y1), at(x2, y2), throughfire);
	}
	
	std::vector<Cell*> Floor::bfs(const Cell* a, const Cell* b, bool throughfire) const {
		std::map<const Cell*, std::vector<Cell*>> path;
		path[a].emplace_back(at(a->x, a->y));
		std::queue<const Cell*> queue;
		queue.push(a);
		
		while(!queue.empty()) {
			const Cell* c = queue.front();
			queue.pop();
			
			std::vector<Cell*> candidates = find([&c, this, &path, &throughfire](const Cell* f) {
				return ((((f->x == c->x + this->scale || f->x == c->x - this->scale) && f->y == c->y) ||
					((f->y == c->y + this->scale || f->y == c->y - this->scale) && f->x == c->x)) && 
					path.find(f) == path.end() && !(!throughfire && f->onfire));
			}, c, true);
			for(Cell* candidate: candidates) {
				queue.push(candidate);
				std::vector<Cell*> p = path.at(c);
				p.emplace_back(candidate);
				if(candidate == b) {
					return p;
				}
				path[candidate] = p;
			}
		}
		return {};
	}
	
	std::vector<Cell*> Floor::bfs(double x1, double y1, double x2, double y2, bool throughfire) const {
		return bfs(at(x1, y1), at(x2, y2), throughfire);
	}
}


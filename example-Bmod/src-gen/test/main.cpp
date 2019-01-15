#include "ped_includes.h"

#include <iostream>
#include <sstream>
#include <unistd.h>
#include <utility>

#include "simulation/cell.h"
#include "simulation/door.h"
#include "simulation/floor.h"
#include "simulation/person.h"

#include "actions/targetters.h"

using namespace std;
using namespace simulation;

Person* newAgent(Ped::Tscene* scene, double x, double y, const Floor& floor) {
	Person* p = new Person(x, y, 0.5, floor);
	scene->addAgent(p->get());
	return p;
}

void drawLocation(Cell* cell, Ped::OutputWriter* ow, double red, double green, double blue) {
	Ped::Tvector c1(cell->x, cell->y);
	Ped::Tvector c2(cell->x + 1.0, cell->y + 1.0);
	Ped::Tvector c3(cell->x, cell->y + 1.0);
	Ped::Tvector c4(cell->x + 1.0, cell->y);
	
	// Draw cross
	ow->drawLine(c1, c2, 1, red, green, blue);
	ow->drawLine(c3, c4, 1, red, green, blue);
}


int main(int argc, char *argv[]) {
	
	cout << "# PedSim Simulation of 'test' using libpedsim version " << Ped::LIBPEDSIM_VERSION << endl;
	
	// Setup
	Ped::Tscene *pedscene = new Ped::Tscene();
	
	// create an output writer which will send output to a visualizer
	Ped::OutputWriter *ow = new Ped::UDPOutputWriter();
	ow->setScenarioName("test");
	pedscene->setOutputWriter(ow);
	
	// Create floorplan
	vector<pair<Cell*, Cell*>> obstacles;
	Floor floor;
	floor.scale = 1.0;
	vector<Cell*> room;
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-6.0, -4.0), new Cell(-5.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-6.0, -4.0), new Cell(-6.0, -3.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-6.0, -3.0), new Cell(-6.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-6.0, -2.0), new Cell(-5.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-5.0, -4.0), new Cell(-4.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-5.0, -2.0), new Cell(-4.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-4.0, -4.0), new Cell(-3.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-3.0, -4.0), new Cell(-2.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-3.0, -2.0), new Cell(-2.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-2.0, -4.0), new Cell(-1.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, -4.0), new Cell(-1.0, -3.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, -3.0), new Cell(0.0, -3.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, -2.0), new Cell(0.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(0.0, -4.0), new Cell(1.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(0.0, -4.0), new Cell(0.0, -3.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(0.0, -2.0), new Cell(1.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(1.0, -4.0), new Cell(2.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(1.0, -2.0), new Cell(2.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(2.0, -4.0), new Cell(3.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(2.0, -2.0), new Cell(3.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(3.0, -4.0), new Cell(4.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(3.0, -2.0), new Cell(4.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(4.0, -4.0), new Cell(5.0, -4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(5.0, -4.0), new Cell(5.0, -3.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(5.0, -3.0), new Cell(5.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(4.0, -2.0), new Cell(5.0, -2.0)));
	room = {};
	room.emplace_back(new Cell(-6.0, -4.0));
	room.emplace_back(new Cell(-6.0, -3.0));
	room.emplace_back(new Cell(-5.0, -4.0));
	room.emplace_back(new Cell(-5.0, -3.0));
	room.emplace_back(new Cell(-4.0, -4.0));
	room.emplace_back(new Cell(-4.0, -3.0));
	room.emplace_back(new Cell(-3.0, -4.0));
	room.emplace_back(new Cell(-3.0, -3.0));
	room.emplace_back(new Cell(-2.0, -4.0));
	room.emplace_back(new Cell(-2.0, -3.0));
	room.emplace_back(new Cell(-1.0, -3.0));
	room.emplace_back(new Cell(0.0, -4.0));
	room.emplace_back(new Cell(0.0, -3.0));
	room.emplace_back(new Cell(1.0, -4.0));
	room.emplace_back(new Cell(1.0, -3.0));
	room.emplace_back(new Cell(2.0, -4.0));
	room.emplace_back(new Cell(2.0, -3.0));
	room.emplace_back(new Cell(3.0, -4.0));
	room.emplace_back(new Cell(3.0, -3.0));
	room.emplace_back(new Cell(4.0, -4.0));
	room.emplace_back(new Cell(4.0, -3.0));
	floor.rooms.emplace_back(room);
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-4.0, -2.0), new Cell(-4.0, -1.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-4.0, -1.0), new Cell(-4.0, 0.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-4.0, 0.0), new Cell(-4.0, 1.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-4.0, 1.0), new Cell(-3.0, 1.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-3.0, -2.0), new Cell(-2.0, -2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-3.0, 1.0), new Cell(-2.0, 1.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, -2.0), new Cell(-1.0, -1.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, -1.0), new Cell(-1.0, 0.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-2.0, 1.0), new Cell(-1.0, 1.0)));
	room = {};
	room.emplace_back(new Cell(-4.0, -2.0));
	room.emplace_back(new Cell(-4.0, -1.0));
	room.emplace_back(new Cell(-4.0, 0.0));
	room.emplace_back(new Cell(-3.0, -2.0));
	room.emplace_back(new Cell(-3.0, -1.0));
	room.emplace_back(new Cell(-3.0, 0.0));
	room.emplace_back(new Cell(-2.0, -2.0));
	room.emplace_back(new Cell(-2.0, -1.0));
	room.emplace_back(new Cell(-2.0, 0.0));
	floor.rooms.emplace_back(room);
	floor.capacities.insert(std::make_pair<unsigned long, unsigned long>(1, 0));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, 0.0), new Cell(0.0, 0.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, 1.0), new Cell(-1.0, 2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, 2.0), new Cell(-1.0, 3.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, 3.0), new Cell(-1.0, 4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, 4.0), new Cell(-1.0, 5.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, 5.0), new Cell(-1.0, 6.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(-1.0, 6.0), new Cell(0.0, 6.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(0.0, 0.0), new Cell(1.0, 0.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(0.0, 6.0), new Cell(1.0, 6.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(1.0, 0.0), new Cell(2.0, 0.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(1.0, 6.0), new Cell(2.0, 6.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(2.0, 0.0), new Cell(3.0, 0.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(2.0, 6.0), new Cell(3.0, 6.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(3.0, 0.0), new Cell(4.0, 0.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(4.0, 0.0), new Cell(4.0, 1.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(4.0, 1.0), new Cell(4.0, 2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(4.0, 5.0), new Cell(4.0, 6.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(3.0, 6.0), new Cell(4.0, 6.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(4.0, 2.0), new Cell(5.0, 2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(4.0, 5.0), new Cell(5.0, 5.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(5.0, 2.0), new Cell(6.0, 2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(5.0, 5.0), new Cell(6.0, 5.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(6.0, 2.0), new Cell(7.0, 2.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(7.0, 2.0), new Cell(7.0, 3.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(7.0, 3.0), new Cell(7.0, 4.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(7.0, 4.0), new Cell(7.0, 5.0)));
	obstacles.emplace_back(make_pair<Cell*, Cell*>(new Cell(6.0, 5.0), new Cell(7.0, 5.0)));
	room = {};
	room.emplace_back(new Cell(-1.0, 0.0));
	room.emplace_back(new Cell(-1.0, 1.0));
	room.emplace_back(new Cell(-1.0, 2.0));
	room.emplace_back(new Cell(-1.0, 3.0));
	room.emplace_back(new Cell(-1.0, 4.0));
	room.emplace_back(new Cell(-1.0, 5.0));
	room.emplace_back(new Cell(0.0, 0.0));
	room.emplace_back(new Cell(0.0, 1.0));
	room.emplace_back(new Cell(0.0, 2.0));
	room.emplace_back(new Cell(0.0, 3.0));
	room.emplace_back(new Cell(0.0, 4.0));
	room.emplace_back(new Cell(0.0, 5.0));
	room.emplace_back(new Cell(1.0, 0.0));
	room.emplace_back(new Cell(1.0, 1.0));
	room.emplace_back(new Cell(1.0, 2.0));
	room.emplace_back(new Cell(1.0, 3.0));
	room.emplace_back(new Cell(1.0, 4.0));
	room.emplace_back(new Cell(1.0, 5.0));
	room.emplace_back(new Cell(2.0, 0.0));
	room.emplace_back(new Cell(2.0, 1.0));
	room.emplace_back(new Cell(2.0, 2.0));
	room.emplace_back(new Cell(2.0, 3.0));
	room.emplace_back(new Cell(2.0, 4.0));
	room.emplace_back(new Cell(2.0, 5.0));
	room.emplace_back(new Cell(3.0, 0.0));
	room.emplace_back(new Cell(3.0, 1.0));
	room.emplace_back(new Cell(3.0, 2.0));
	room.emplace_back(new Cell(3.0, 3.0));
	room.emplace_back(new Cell(3.0, 4.0));
	room.emplace_back(new Cell(3.0, 5.0));
	room.emplace_back(new Cell(4.0, 2.0));
	room.emplace_back(new Cell(4.0, 3.0));
	room.emplace_back(new Cell(4.0, 4.0));
	room.emplace_back(new Cell(5.0, 2.0));
	room.emplace_back(new Cell(5.0, 3.0));
	room.emplace_back(new Cell(5.0, 4.0));
	room.emplace_back(new Cell(6.0, 2.0));
	room.emplace_back(new Cell(6.0, 3.0));
	room.emplace_back(new Cell(6.0, 4.0));
	floor.rooms.emplace_back(room);
	room = {};
	for(const auto& obstacle: obstacles) {
		pedscene->addObstacle(new Ped::Tobstacle(obstacle.first->x, obstacle.first->y, obstacle.second->x, obstacle.second->y));
	}
	
	// Set exits
	floor.setExit(-6.0, -4.0);
	
	// Draw doors
	floor.doors.emplace_back(new Door(-2.0, 0.0, -1.0, 0.0));
	floor.doors.emplace_back(new Door(-4.0, -3.0, -4.0, -2.0));
	floor.doors.emplace_back(new Door(-2.0, -3.0, -2.0, -2.0));
	for(Door* door: floor.doors) {
		door->draw(ow, 1.0);
	}
	
	// Fire
	floor.at(2.0, 4.0)->onfire = true;
	
	for(const std::vector<Cell*>& room: floor.rooms) {
		for(Cell* cell: room) {
			if(cell->onfire) {
				drawLocation(cell, ow, 1, 0, 0);
			} else if(cell->exit) {
				drawLocation(cell, ow, 0, 1, 0);
			}
		}
	}
	
	// Create people
	floor.people.emplace_back(newAgent(pedscene, -3.0, -1.0, floor));
	floor.people.back()->registerTargetter(targetters::action_smart, targetters::action_smart_shared);
	
	// convenience
	const vector<Ped::Tagent*>& myagents = pedscene->getAllAgents();
	const vector<Ped::Tobstacle*>& myobstacles = pedscene->getAllObstacles();
	
	// Metrics
	ow->writeMetrics({
		{"Timestep", "0"},
		{"Ignited Cells", "0"},
		{"Burning (Percentage)", "0"},
		{"Escaped People", "0"},
		{"Death People", "0"},
		{"Room Capacities Violated", "0"}
	});
	
	// simulation loop
	pedscene->moveAgents(0.4);
	long int time = 0;
	vector<Cell*> fire = floor.find([](const Cell* c) { return c->onfire; });
	while(fire.size() < 69 && floor.find([](const Person* p) { return p->isAlive() && !p->hasEscaped(); }).size() > 0) {
		++time;
		ow->writeTimeStep(time);
		// Delay for next step
		// char c;
		// cin >> c;
		usleep(500*1000);
		
		// Compute agent movement
		for(Person* person: floor.people) {
			person->target();
		}
		// Move all agents
	    long int timestep = 0;
	    int notreached = myagents.size();
	    pedscene->moveAgents(1);
	    
	    // Spread Fire
	    vector<Cell*> to_add;
		for(auto f: fire) {
			Cell* right = new Cell(f->x + 1.0, f->y);
			if(f->canSpread(right, floor, fire, to_add)) {
				to_add.emplace_back(right);
			}
			
			Cell* left = new Cell(f->x - 1.0, f->y);
			if(f->canSpread(left, floor, fire, to_add)) {
				to_add.emplace_back(left);
			}
			
			Cell* top = new Cell(f->x, f->y - 1.0); 
			if(f->canSpread(top, floor, fire, to_add)) {
				to_add.emplace_back(top);
			}
			
			Cell* bottom = new Cell(f->x, f->y + 1.0);
			if(f->canSpread(bottom, floor, fire, to_add)) {
				to_add.emplace_back(bottom);
			}
		}
		for(auto f: to_add) {
			Cell* loc = floor.at(f->x, f->y);
			loc->onfire = true;
			fire.emplace_back(loc);
		}
		for(const std::vector<Cell*>& room: floor.rooms) {
			for(Cell* cell: room) {
				if(cell->onfire) {
					drawLocation(cell, ow, 1, 0, 0);
				} else if(cell->exit) {
					drawLocation(cell, ow, 0, 1, 0);
				}
			}
		}
		
		for(Door* door: floor.doors) {
			door->draw(ow, 1.0);
		}
		
		pedscene->moveAgents(0); //< Somehow this is necessary to draw all the obstacles correctly.
		
		// Clear escaped persons
		for(Person* p: floor.people) {
			if(p->hasEscaped()) {
				pedscene->removeAgent(p->get());
			}
		}
		
		// Check Capacities
		int caps = 0;
		for(const auto& cap: floor.capacities) {
			if(floor.find([](const Person* p) { return p->isAlive() && !p->hasEscaped(); }, floor.rooms.at(cap.first).front()).size() > cap.second) {
				++caps;
			}
		}
		
		// Metrics
		ow->writeMetrics({
			{"Timestep", std::to_string(time)},
			{"Ignited Cells", std::to_string(fire.size())},
			{"Burning (Percentage)", std::to_string((double)fire.size() / (double)69)},
			{"Escaped People", std::to_string(floor.people.size() - myagents.size())},
			{"Death People", std::to_string(floor.people.size() - floor.find([](const Person* p) { return p->isAlive(); }).size())},
			{"Room Capacities Violated", std::to_string(caps)}
		});
	}
	
	// cleanup
	for (auto a : pedscene->getAllAgents()) { delete a; };
	for (auto w : pedscene->getAllWaypoints()) { delete w; };
	for (auto o : pedscene->getAllObstacles()) { delete o; };
	for (auto c : fire) { delete c; }
	for (auto p : floor.people) { delete p; }
	for (auto d : floor.doors) { delete d; }
	delete pedscene;
	
	return EXIT_SUCCESS;
}

/**
 * This file is generated for a pedsim simulation of Bmod.
 */

#include "cell.h"
#include "person.h"

namespace simulation {
	Person::Person(double x, double y, double offset, const Floor& floor):
			m_x(x + offset), m_y(y + offset), m_offset(offset), m_escaped(false), m_alive(true), m_agent(new Ped::Tagent()),
			m_targetter([](const Person*, const Floor& floor)->Cell*{ return nullptr; }), m_target(nullptr), m_shared(false), m_floor(floor) {
			
		m_agent->setWaypointBehavior(Ped::Tagent::BEHAVIOR_ONCE);  // only once
		m_agent->setVmax(1.2);
		m_agent->setfactorsocialforce(10.0);
		m_agent->setfactorobstacleforce(1.0);
		m_agent->setPosition(m_x, m_y, 0); 		// 2D, so 'z' must be 0
	}
	
	void Person::target() {
		if(!m_escaped && m_alive) {
			// Update position
			Ped::Tvector pos = m_agent->getPosition();
			m_x = pos.x;
			m_y = pos.y;
			
			if(m_floor.at(m_x, m_y)->onfire) {
				m_alive = false;
				m_agent->clearWaypoints();
				return;
			}
			
			// Compute target
			if(m_target == nullptr) {
				if(m_shared) {
					std::vector<Person*> vec = m_floor.find([](const Person* p)-> bool {
						return p->m_shared;
					}, this);
					for(Person* p: vec) {
						if(p->m_target != nullptr) {
							m_target = p->m_target;
							break;
						}
					}
					if(m_target == nullptr) {
						m_target = m_targetter(this, m_floor);
					}
				} else {
					m_target = m_targetter(this, m_floor);
				}
				if(m_target != nullptr) {
					// TODO: use BFS to determine where to go instead of going straight to the target
					// std::vector<Cell*> lst = m_floor.bfs(m_x, m_y, m_target->x, m_target->y);
					// if(lst.size() > 1) {
				 	//	Cell* next = lst.at(1);
					// 	m_agent->addWaypoint(new Ped::Twaypoint(next->x + m_offset, next->y + m_offset, 1));
					// }
					m_agent->addWaypoint(new Ped::Twaypoint(m_target->x + m_offset, m_target->y + m_offset, 1));
				}
			}
			
			// Send agent to target
			if(m_target != nullptr) {
				if(m_agent->reachedDestination()) {
					m_agent->clearWaypoints();
					if(m_target->exit) {
						m_escaped = true;
					}
					m_target = nullptr;
				}
			}
		}
	}
}

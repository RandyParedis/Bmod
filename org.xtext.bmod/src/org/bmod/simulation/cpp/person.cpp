/**
 * This file is generated for a pedsim simulation of Bmod.
 */

#include "cell.h"
#include "person.h"

#include <iostream>

namespace simulation {
	Person::Person(double x, double y, double offset, const Floor& floor):
			m_x(x + offset), m_y(y + offset), m_offset(offset), m_escaped(false), m_agent(new Ped::Tagent()),
			m_targetter([](const Person*, const Floor& floor)->Cell*{ return nullptr; }), m_target(nullptr), m_floor(floor) {
			
		m_agent->setWaypointBehavior(Ped::Tagent::BEHAVIOR_ONCE);  // only once
		m_agent->setVmax(1.2);
		m_agent->setfactorsocialforce(10.0);
		m_agent->setfactorobstacleforce(1.0);
		m_agent->setPosition(m_x, m_y, 0); 		// 2D, so 'z' must be 0
	}
	
	void Person::target() {
		if(!m_escaped) {
			// Update position
			Ped::Tvector pos = m_agent->getPosition();
			m_x = pos.x;
			m_y = pos.y;
			
			// Compute target
			if(m_target == nullptr) {
				m_target = m_targetter(this, m_floor);
				if(m_target != nullptr) {
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

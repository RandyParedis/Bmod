/**
 * This file is generated for a pedsim simulation of Bmod.
 */
 
#ifndef SIMULATION_PERSON_H
#define SIMULATION_PERSON_H

#include "ped_includes.h"
#include <functional>
#include "floor.h"

namespace simulation {
	class Person {
	public:
		Person(double x, double y, double offset, const Floor& floor);
		
		typedef std::function<Cell*(const Person*, const Floor&)> TargetterFunc;
		
		Ped::Tagent* get() const { return m_agent; };
		
		void setX(double x) { m_x = x; }
		void setY(double y) { m_y = y; }
		double getX() const { return m_x; }
		double getY() const { return m_y; }
		
		bool hasEscaped() const { return m_escaped; } 
		
		void registerTargetter(const TargetterFunc& func) { m_targetter = func; }
		void target();
		
	private:
		double m_x;
		double m_y;
		double m_offset;
		
		bool m_escaped;
		
		Ped::Tagent* m_agent;
		
		TargetterFunc m_targetter;
		Cell* m_target;
		
		const Floor& m_floor;
	};
}

#endif


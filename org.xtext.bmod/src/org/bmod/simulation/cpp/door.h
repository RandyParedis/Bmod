/**
 * This file is generated for a pedsim simulation of Bmod.
 */
 
#ifndef SIMULATION_DOOR_H
#define SIMULATION_DOOR_H
 
#include "ped_includes.h"
 
namespace simulation {
	struct Door {
	public:
		Door(double x1, double y1, double x2, double y2): x1(x1), y1(y1), x2(x2), y2(y2) {}
		
		void draw(Ped::OutputWriter* ow, double scale) {
			Ped::Tvector door_1(0, 0);
			Ped::Tvector door_2(0, 0);
			if(x1 < x2) {
				door_1.x = x2;
				door_1.y = y1;
				door_2.x = x2;
				door_2.y = y1 + scale;
			} else if(x1 < x2) {
				door_1.x = x1;
				door_1.y = y1;
				door_2.x = x1;
				door_2.y = y1 + scale;
			} else {
				if(y1 < y2) {
					door_1.y = y2;
					door_1.x = x1;
					door_2.y = y2;
					door_2.x = x1 + scale;
				} else {
					door_1.y = y1;
					door_1.x = x1;
					door_2.y = y1;
					door_2.x = x1 + scale;
				}
			}
			ow->drawLine(door_1, door_2, 1, 0, 1, 0);
		}
		
		double getX1() const { return x1; };
		double getY1() const { return y1; };
		double getX2() const { return x2; };
		double getY2() const { return y2; };

	private:
		double x1;
		double y1;
		double x2;
		double y2;
	};
}

#endif


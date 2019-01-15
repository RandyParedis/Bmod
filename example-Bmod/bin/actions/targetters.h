/**
 * This file is generated for a pedsim simulation of Bmod.
 * It contains the actionprofiles of the people, generated from BReact.
 */
 
#ifndef SIMULATION_TARGETTERS_ACTIONS_H
#define SIMULATION_TARGETTERS_ACTIONS_H

#include <cmath>
#include "../simulation/person.h"
		 
namespace simulation {
	namespace targetters {
 		extern const bool action_experienced_shared;
 		extern Person::TargetterFunc action_experienced;
 		extern const bool action_newcomer_shared;
 		extern Person::TargetterFunc action_newcomer;
 		extern const bool action_newcomer_better_shared;
 		extern Person::TargetterFunc action_newcomer_better;
 		extern const bool action_panic1_shared;
 		extern Person::TargetterFunc action_panic1;
 		extern const bool action_panic2_shared;
 		extern Person::TargetterFunc action_panic2;
 		extern const bool action_scared_shared;
 		extern Person::TargetterFunc action_scared;
 		extern const bool action_suicidal_shared;
 		extern Person::TargetterFunc action_suicidal;
 		extern const bool action_smart_shared;
 		extern Person::TargetterFunc action_smart;
 	}
}

#endif // SIMULATION_TARGETTERS_ACTIONS_H

/*
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.bmod.breact.ActionDesc
import org.xtext.bmod.breact.Distance
import org.xtext.bmod.breact.Locatable

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BReactGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val simpleClassName = resource.getURI.trimFileExtension.lastSegment
		if(resource.contents?.head === null) {
			return;
		}
		val model = resource.contents.head.eContents;
		
		fsa.generateFile(simpleClassName + "/targetters.h", '''
		/**
		 * This file is generated for a pedsim simulation of Bmod.
		 * It contains the actionprofiles of the people, generated from BReact.
		 */
		 
		#ifndef SIMULATION_TARGETTERS_«simpleClassName.toUpperCase»_H
		#define SIMULATION_TARGETTERS_«simpleClassName.toUpperCase»_H
		
		#include <cmath>
		#include "../simulation/person.h"
				 
		namespace simulation {
			namespace targetters {
		 		«FOR action: model.filter(ActionDesc)»
		 			extern const bool action_«action.name»_shared;
		 			extern Person::TargetterFunc action_«action.name»;
		 		«ENDFOR»
		 	}
		}
		
		#endif // SIMULATION_TARGETTERS_«simpleClassName.toUpperCase»_H
		''');
		
		fsa.generateFile(simpleClassName + '/targetters.cpp', '''
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
				«FOR action: model.filter(ActionDesc)»
					const bool action_«action.name»_shared = «IF action.shared»true«ELSE»false«ENDIF»;
					Person::TargetterFunc action_«action.name» = [](const Person* person, const Floor& floor) -> Cell* {
						auto dist = [&floor, &person](double x, double y) -> double { return floor.distance(person->getX(), person->getY(), x, y); };
						Cell* location = floor.at(person->getX(), person->getY());
					
						std::vector<Person*> ptargets;
						std::vector<Cell*> ctargets;
						std::vector<Door*> dtargets;
					
						«FOR find: action.finds»
							«IF find.locatable == Locatable.PERSON»
								ptargets = floor.find([&person, &floor](const Person* p)->bool {
									return (p != person && !p->hasEscaped()«IF find.normal || find.burning» && «IF find.normal»!«ENDIF»floor.at(p->getX(), p->getY())->onfire«ENDIF»);
								}«IF !find.global», person«ENDIF»);
								if(!ptargets.empty()) {
									«IF find.distance == Distance.FIRST»
										return floor.at(ptargets.front()->getX(), ptargets.front()->getY());
									«ELSEIF find.distance == Distance.LAST»
										return floor.at(ptargets.back()->getX(), ptargets.back()->getY());
									«ELSEIF find.distance == Distance.NEAREST»
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
									«ELSE»
										«IF find.from»
											Cell* farthest = nullptr;
											double fd = 0;
											ctargets = floor.find([](const Cell* c){ return !c->onfire; }«IF !find.global», location«ENDIF»);
											for(Cell* cell: ctargets) {
												double d = 0;
												for(Person* p: ptargets) {
													d += floor.distance(p->getX(), p->getY(), cell->x, cell->y);
												}
												if(farthest == nullptr || d > fd) {
													farthest = cell;
													fd = d;
												}
											}
											if(farthest != nullptr) { return farthest; }
										«ELSE»
											Person* ptarget = nullptr;
											for(Person* p: ptargets) {
												if(ptarget == nullptr ||
													dist(p->getX(), p->getY()) > dist(ptarget->getX(), ptarget->getY())) {
														ptarget = p;
												}
											}
											if(ptarget != nullptr) {
												return floor.at(ptarget->getX(), ptarget->getY());
											}
										«ENDIF»
									«ENDIF»
								}
			 				«ELSEIF find.locatable == Locatable.CELL»
								ctargets = floor.find([&location](const Cell* c)->bool {
									return (c != location«IF find.normal || find.burning» && «IF find.normal»!«ENDIF»c->onfire«ENDIF»);
								}«IF !find.global», location«ENDIF»);
								if(!ctargets.empty()) {
									«IF find.distance == Distance.FIRST»
										return ctargets.front();
									«ELSEIF find.distance == Distance.LAST»
										return ctargets.back();
									«ELSEIF find.distance == Distance.NEAREST»
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
									«ELSE»
										«IF find.from»
											Cell* farthest = nullptr;
											double fd = 0;
											std::vector<Cell*> lst = floor.find([](const Cell* c){ return !c->onfire; }«IF !find.global», location«ENDIF»);
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
										«ELSE»
											Cell* ctarget = nullptr;
											for(Cell* c: ctargets) {
												if(ctarget == nullptr ||
													dist(c->x, c->y) > dist(ctarget->x, ctarget->y)) {
														ctarget = c;
												}
											}
											if(ctarget != nullptr) {
												return ctarget;
											}
										«ENDIF»
									«ENDIF»
								}
							«ELSEIF find.locatable == Locatable.FIRE»
								ctargets = floor.find([&location](const Cell* c)->bool {
									return (c != location && c->onfire);
								}«IF !find.global», location«ENDIF»);
								if(!ctargets.empty()) {
									«IF find.distance == Distance.FIRST»
										return ctargets.front();
									«ELSEIF find.distance == Distance.LAST»
										return ctargets.back();
									«ELSEIF find.distance == Distance.NEAREST»
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
									«ELSE»
										«IF find.from»
											Cell* farthest = nullptr;
											double fd = 0;
											std::vector<Cell*> lst = floor.find([](const Cell* c){ return !c->onfire; }«IF !find.global», location«ENDIF»);
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
										«ELSE»
											Cell* ctarget = nullptr;
											for(Cell* c: ctargets) {
												if(ctarget == nullptr ||
													dist(c->x, c->y) > dist(ctarget->x, ctarget->y)) {
														ctarget = c;
												}
											}
											if(ctarget != nullptr) {
												return ctarget;
											}
										«ENDIF»
									«ENDIF»
								}
							«ELSEIF find.locatable == Locatable.EXIT»
								ctargets = floor.find([&location, &floor](const Cell* c)->bool {
									return (c != location && c->exit«IF find.normal || find.burning» && «IF find.normal»!«ENDIF»c->onfire«ENDIF»);
								}«IF !find.global», location«ENDIF»);
								if(!ctargets.empty()) {
									«IF find.distance == Distance.FIRST»
										return ctargets.front();
									«ELSEIF find.distance == Distance.LAST»
										return ctargets.back();
									«ELSEIF find.distance == Distance.NEAREST»
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
									«ELSE»
										«IF find.from»
											Cell* farthest = nullptr;
											double fd = 0;
											std::vector<Cell*> lst = floor.find([](const Cell* c){ return !c->onfire; }«IF !find.global», location«ENDIF»);
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
										«ELSE»
											Cell* ctarget = nullptr;
											for(Cell* c: ctargets) {
												if(ctarget == nullptr ||
													dist(c->x, c->y) > dist(ctarget->x, ctarget->y)) {
														ctarget = c;
												}
											}
											if(ctarget != nullptr) {
												return ctarget;
											}
										«ENDIF»
									«ENDIF»
								}
		 					«ELSEIF find.locatable == Locatable.DOOR»
								dtargets = floor.find([&floor](const Door* d)->bool {
									return («IF find.normal || find.burning»«IF find.normal»!«ENDIF»floor.at(d->getX1(), d->getY1())->onfire || «IF find.normal»!«ENDIF»floor.at(d->getX2(), d->getY2())->onfire«ELSE»true«ENDIF»);
								}«IF !find.global», location«ENDIF»);
								if(!dtargets.empty()) {
									«IF find.distance == Distance.FIRST»
										if(dist(dtargets.front()->getX1(), dtargets.front()->getY1()) > dist(dtargets.front()->getX2(), dtargets.front()->getY2())) {
											return floor.at(dtargets.front()->getX1(), dtargets.front()->getY1());
										}
										return floor.at(dtargets.front()->getX2(), dtargets.front()->getY2());
									«ELSEIF find.distance == Distance.LAST»
										if(dist(dtargets.back()->getX1(), dtargets.back()->getY1()) > dist(dtargets.back()->getX2(), dtargets.back()->getY2())) {
											return floor.at(dtargets.back()->getX1(), dtargets.back()->getY1());
										}
										return floor.at(dtargets.back()->getX2(), dtargets.back()->getY2());
									«ELSEIF find.distance == Distance.NEAREST»
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
									«ELSE»
										«IF find.from»
											Cell* farthest = nullptr;
											double fd = 0;
											ctargets = floor.find([](const Cell* c){ return !c->onfire; }«IF !find.global», location«ENDIF»);
											for(Cell* cell: ctargets) {
												double d = 0;
												for(Door* d: dtargets) {
													if(dist(d->getX1(), d->getY1()) < dist(d->getX2(), d->getY2()) {
														d += floor.distance(d->getX1(), d->getY1(), cell->x, cell->y);
													} else {
														d += floor.distance(d->getX2(), d->getY2(), cell->x, cell->y);
													}
												}
												if(farthest == nullptr || d > fd) {
													farthest = cell;
													fd = d;
												}
											}
											if(farthest != nullptr) { return farthest; }
										«ELSE»
											Door* dtarget = nullptr;
											for(Door* d: dtargets) {
												if(dtarget == nullptr ||
													dist(d->getX1(), d->getY1()) > dist(dtarget->getX1(), dtarget->getY1()) ||
													dist(d->getX1(), d->getY1()) > dist(dtarget->getX2(), dtarget->getY2()) ||
													dist(d->getX2(), d->getY2()) > dist(dtarget->getX1(), dtarget->getY1()) ||
													dist(d->getX2(), d->getY2()) > dist(dtarget->getX2(), dtarget->getY2())) {
														dtarget = d;
												}
											}
											if(dtarget != nullptr) {
												if(dist(dtarget->getX1(), dtarget->getY1()) > dist(dtarget->getX2(), dtarget->getY2())) {
													return floor.at(dtarget->getX1(), dtarget->getY1());
												}
												return floor.at(dtarget->getX2(), dtarget->getY2());
											}
										«ENDIF»
									«ENDIF»
								}
			 				«ENDIF»
							
			 			«ENDFOR»
						return nullptr;
					};
					
		 		«ENDFOR»
			}
		}
		''');
	}
}

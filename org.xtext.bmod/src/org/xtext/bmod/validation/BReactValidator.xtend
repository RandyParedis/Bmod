/*
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.validation

import org.eclipse.xtext.validation.Check
import org.xtext.bmod.breact.ActionDesc
import org.xtext.bmod.breact.BreactPackage
import org.xtext.bmod.breact.Distance
import org.xtext.bmod.breact.Find
import org.xtext.bmod.breact.Locatable
import org.xtext.bmod.breact.React

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BReactValidator extends AbstractBReactValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					BReactPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	public static val BURNING_CELL = 'burningCell';
	public static val BURNING_FIRE = 'burningFire';
	public static val NORMAL_FIRE = 'normalFire';
	public static val EXCESSIVE_FROM = 'excessiveFrom';
	
	@Check
	def checkBurningCell(Find find) {
		if(find.burning && find.locatable == Locatable.CELL) {
			warning("Finding a burning Cell is the same as finding a Fire", BreactPackage.Literals.FIND__BURNING, BURNING_CELL);
		}
	}
	
	@Check
	def checkBurningFire(Find find) {
		if(find.burning && find.locatable == Locatable.FIRE) {
			warning("Useless keyword 'burning'", BreactPackage.Literals.FIND__BURNING, BURNING_FIRE);
		} else if(find.normal && find.locatable == Locatable.FIRE) {
			error("Invalid keyword 'normal' for Fire", BreactPackage.Literals.FIND__NORMAL, NORMAL_FIRE);
		}
	}
	
	@Check
	def checkUniqueNames(React react) {
		val lst = newArrayList();
		for(action: react.actions) {
			if(lst.contains(action.name)) {
				error("There already exists an action with this name", action, null)
			} else {
				lst.add(action.name);
			}
		}
	}
	
	@Check
	def checkSimilarFinds(ActionDesc action) {
		val lst = <Find>newArrayList();
		for(find: action.finds) {
			var found = false;
			for(c: lst) {
				if(c.global == find.global && c.distance == find.distance &&
					c.burning == find.burning && c.normal == find.normal &&
					c.locatable == find.locatable) {
						warning("Duplicate find statement", find, null);
						found = true;
					}
			}
			if(!found) {
				lst.add(find);
			}
		}
	}
	
	@Check
	def checkExcessiveFrom(Find find) {
		if(find.from && find.distance != Distance.FARTHEST) {
			warning("The keyword 'from' only makes sense when used together with 'farthest'", BreactPackage.Literals.FIND__FROM, EXCESSIVE_FROM);
		}
	}
}

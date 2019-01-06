package org.xtext.bmod.scoping;

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class BmodScopingScopeProvider extends AbstractDeclarativeScopeProvider {
//	@Override
//	public IScope getScope(EObject context, EReference reference) {
//		if (context instanceof DoorRef) {
//			return IScope.NULLSCOPE;
//			DoorRef doorRef = (DoorRef) context;
//			Floorplan floorplan = (Floorplan) doorRef.eContainer().eContainer();
//			System.out.println("FLOORPLAN: " + floorplan);
//			if(floorplan == null) { return IScope.NULLSCOPE; }
//			return Scopes.scopeFor(floorplan.getDoors(), IScope.NULLSCOPE);
//		}
//		if (context instanceof DangerousCondition) {
//			DangerousCondition dancon = (DangerousCondition) context;
//			Floorplan floorplan = (Floorplan) dancon.eContainer();
//			if(floorplan == null) { return IScope.NULLSCOPE; }
//			return Scopes.scopeFor(floorplan.getRooms(), IScope.NULLSCOPE);
//		}
//
//		return super.getScope(context, reference);
//	}
}

/**
 * @Generated
 */
package org.xtext.ha.web;

import org.dslforge.xtext.common.guice.AbstractGuiceAwareWebExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.ha.web.internal.Activator;

import com.google.inject.Injector;

public class RulesExecutableExtensionFactory extends AbstractGuiceAwareWebExecutableExtensionFactory {

	@Override
	public Bundle getBundle() {
		return Activator.getInstance().getBundle();
	}
	
	@Override
	public Injector getInjector() {
		return Activator.getInstance().getInjector(Activator.ORG_XTEXT_HA_RULES);
	}
}

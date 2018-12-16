/*
 * generated by Xtext 2.16.0
 */
package org.xtext.ha.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.ha.ui.internal.HaActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RulesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(HaActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		HaActivator activator = HaActivator.getInstance();
		return activator != null ? activator.getInjector(HaActivator.ORG_XTEXT_HA_RULES) : null;
	}

}

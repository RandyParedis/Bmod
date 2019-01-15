/*
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.bmod.ui.internal.BmodActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BReactExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(BmodActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		BmodActivator activator = BmodActivator.getInstance();
		return activator != null ? activator.getInjector(BmodActivator.ORG_XTEXT_BMOD_BREACT) : null;
	}

}

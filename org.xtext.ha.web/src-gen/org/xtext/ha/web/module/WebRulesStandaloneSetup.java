/**
 * @Generated
 */
package org.xtext.ha.web.module;

import org.eclipse.xtext.util.Modules2;
import org.xtext.ha.RulesRuntimeModule;
import org.xtext.ha.RulesStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class WebRulesStandaloneSetup extends RulesStandaloneSetup {

	public static void doSetup() {
		new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule();
			Injector injector = Guice.createInjector(runtimeModule);
			register(injector);
			return injector;
		} catch (Exception e) {
			System.err.println("Failed to create injector for " + language);
			throw new RuntimeException("Failed to create injector for "
					+ language, e);
		}
	}

	private Module getRuntimeModule() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();
		RulesRuntimeModule original = new RulesRuntimeModule();
		WebRulesRuntimeModule module = new WebRulesRuntimeModule();
		Module mergedModule = Modules2.mixin((Module) original, module);
		return mergedModule;
	}
}

/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod;

import org.xtext.bmod.BReactStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BReactStandaloneSetup extends BReactStandaloneSetupGenerated {
  public static void doSetup() {
    new BReactStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.breact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.breact.React#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.xtext.bmod.breact.BreactPackage#getReact()
 * @model
 * @generated
 */
public interface React extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.bmod.breact.ActionDesc}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.xtext.bmod.breact.BreactPackage#getReact_Actions()
   * @model containment="true"
   * @generated
   */
  EList<ActionDesc> getActions();

} // React

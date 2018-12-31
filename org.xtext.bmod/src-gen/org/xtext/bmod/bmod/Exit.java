/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.bmod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.bmod.Exit#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.xtext.bmod.bmod.BmodPackage#getExit()
 * @model
 * @generated
 */
public interface Exit extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(Coordinate)
   * @see org.xtext.bmod.bmod.BmodPackage#getExit_Location()
   * @model containment="true"
   * @generated
   */
  Coordinate getLocation();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.Exit#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Coordinate value);

} // Exit

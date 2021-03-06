/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.bmod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.bmod.DoorRef#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.xtext.bmod.bmod.BmodPackage#getDoorRef()
 * @model
 * @generated
 */
public interface DoorRef extends EObject
{
  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Door)
   * @see org.xtext.bmod.bmod.BmodPackage#getDoorRef_To()
   * @model
   * @generated
   */
  Door getTo();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.DoorRef#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Door value);

} // DoorRef

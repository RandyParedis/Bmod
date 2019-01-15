/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.breact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Desc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.breact.ActionDesc#isShared <em>Shared</em>}</li>
 *   <li>{@link org.xtext.bmod.breact.ActionDesc#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.bmod.breact.ActionDesc#getFinds <em>Finds</em>}</li>
 * </ul>
 *
 * @see org.xtext.bmod.breact.BreactPackage#getActionDesc()
 * @model
 * @generated
 */
public interface ActionDesc extends EObject
{
  /**
   * Returns the value of the '<em><b>Shared</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shared</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shared</em>' attribute.
   * @see #setShared(boolean)
   * @see org.xtext.bmod.breact.BreactPackage#getActionDesc_Shared()
   * @model
   * @generated
   */
  boolean isShared();

  /**
   * Sets the value of the '{@link org.xtext.bmod.breact.ActionDesc#isShared <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shared</em>' attribute.
   * @see #isShared()
   * @generated
   */
  void setShared(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.bmod.breact.BreactPackage#getActionDesc_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.bmod.breact.ActionDesc#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Finds</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.bmod.breact.Find}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finds</em>' containment reference list.
   * @see org.xtext.bmod.breact.BreactPackage#getActionDesc_Finds()
   * @model containment="true"
   * @generated
   */
  EList<Find> getFinds();

} // ActionDesc

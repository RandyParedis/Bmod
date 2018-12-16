/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.bmod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.bmod.Room#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.Room#getNamed <em>Named</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.Room#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @see org.xtext.bmod.bmod.BmodPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject
{
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
   * @see org.xtext.bmod.bmod.BmodPackage#getRoom_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.Room#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Named</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named</em>' attribute.
   * @see #setNamed(String)
   * @see org.xtext.bmod.bmod.BmodPackage#getRoom_Named()
   * @model
   * @generated
   */
  String getNamed();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.Room#getNamed <em>Named</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named</em>' attribute.
   * @see #getNamed()
   * @generated
   */
  void setNamed(String value);

  /**
   * Returns the value of the '<em><b>Area</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Area</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Area</em>' containment reference.
   * @see #setArea(Area)
   * @see org.xtext.bmod.bmod.BmodPackage#getRoom_Area()
   * @model containment="true"
   * @generated
   */
  Area getArea();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.Room#getArea <em>Area</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Area</em>' containment reference.
   * @see #getArea()
   * @generated
   */
  void setArea(Area value);

} // Room

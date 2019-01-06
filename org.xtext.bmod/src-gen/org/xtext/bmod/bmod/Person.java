/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.bmod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.bmod.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.Person#getNamed <em>Named</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.Person#getLocation <em>Location</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.Person#getPerception <em>Perception</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.Person#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.xtext.bmod.bmod.BmodPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
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
   * @see org.xtext.bmod.bmod.BmodPackage#getPerson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.Person#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.bmod.bmod.BmodPackage#getPerson_Named()
   * @model
   * @generated
   */
  String getNamed();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.Person#getNamed <em>Named</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named</em>' attribute.
   * @see #getNamed()
   * @generated
   */
  void setNamed(String value);

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
   * @see org.xtext.bmod.bmod.BmodPackage#getPerson_Location()
   * @model containment="true"
   * @generated
   */
  Coordinate getLocation();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.Person#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Coordinate value);

  /**
   * Returns the value of the '<em><b>Perception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Perception</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perception</em>' containment reference.
   * @see #setPerception(Perception)
   * @see org.xtext.bmod.bmod.BmodPackage#getPerson_Perception()
   * @model containment="true"
   * @generated
   */
  Perception getPerception();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.Person#getPerception <em>Perception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Perception</em>' containment reference.
   * @see #getPerception()
   * @generated
   */
  void setPerception(Perception value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see org.xtext.bmod.bmod.BmodPackage#getPerson_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link org.xtext.bmod.bmod.Person#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

} // Person

/**
 * generated by Xtext 2.16.0
 */
package org.xtext.ha.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ha.rules.Rule#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.ha.rules.Rule#getWhen <em>When</em>}</li>
 *   <li>{@link org.xtext.ha.rules.Rule#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @see org.xtext.ha.rules.RulesPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends Declaration
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.ha.rules.RulesPackage#getRule_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.ha.rules.Rule#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>When</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' reference.
   * @see #setWhen(State)
   * @see org.xtext.ha.rules.RulesPackage#getRule_When()
   * @model
   * @generated
   */
  State getWhen();

  /**
   * Sets the value of the '{@link org.xtext.ha.rules.Rule#getWhen <em>When</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' reference.
   * @see #getWhen()
   * @generated
   */
  void setWhen(State value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' reference.
   * @see #setThen(State)
   * @see org.xtext.ha.rules.RulesPackage#getRule_Then()
   * @model
   * @generated
   */
  State getThen();

  /**
   * Sets the value of the '{@link org.xtext.ha.rules.Rule#getThen <em>Then</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' reference.
   * @see #getThen()
   * @generated
   */
  void setThen(State value);

} // Rule

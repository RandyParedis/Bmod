/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.bmod.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.bmod.bmod.BmodPackage;
import org.xtext.bmod.bmod.Perception;
import org.xtext.bmod.bmod.PerceptionEnum;
import org.xtext.bmod.bmod.PerceptionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.bmod.impl.PerceptionImpl#getExisting <em>Existing</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.impl.PerceptionImpl#getCustom <em>Custom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerceptionImpl extends MinimalEObjectImpl.Container implements Perception
{
  /**
   * The default value of the '{@link #getExisting() <em>Existing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExisting()
   * @generated
   * @ordered
   */
  protected static final PerceptionEnum EXISTING_EDEFAULT = PerceptionEnum.ATTENTIVE;

  /**
   * The cached value of the '{@link #getExisting() <em>Existing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExisting()
   * @generated
   * @ordered
   */
  protected PerceptionEnum existing = EXISTING_EDEFAULT;

  /**
   * The cached value of the '{@link #getCustom() <em>Custom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustom()
   * @generated
   * @ordered
   */
  protected PerceptionLevel custom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerceptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BmodPackage.Literals.PERCEPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PerceptionEnum getExisting()
  {
    return existing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExisting(PerceptionEnum newExisting)
  {
    PerceptionEnum oldExisting = existing;
    existing = newExisting == null ? EXISTING_EDEFAULT : newExisting;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodPackage.PERCEPTION__EXISTING, oldExisting, existing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PerceptionLevel getCustom()
  {
    if (custom != null && custom.eIsProxy())
    {
      InternalEObject oldCustom = (InternalEObject)custom;
      custom = (PerceptionLevel)eResolveProxy(oldCustom);
      if (custom != oldCustom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BmodPackage.PERCEPTION__CUSTOM, oldCustom, custom));
      }
    }
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PerceptionLevel basicGetCustom()
  {
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustom(PerceptionLevel newCustom)
  {
    PerceptionLevel oldCustom = custom;
    custom = newCustom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodPackage.PERCEPTION__CUSTOM, oldCustom, custom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BmodPackage.PERCEPTION__EXISTING:
        return getExisting();
      case BmodPackage.PERCEPTION__CUSTOM:
        if (resolve) return getCustom();
        return basicGetCustom();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BmodPackage.PERCEPTION__EXISTING:
        setExisting((PerceptionEnum)newValue);
        return;
      case BmodPackage.PERCEPTION__CUSTOM:
        setCustom((PerceptionLevel)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BmodPackage.PERCEPTION__EXISTING:
        setExisting(EXISTING_EDEFAULT);
        return;
      case BmodPackage.PERCEPTION__CUSTOM:
        setCustom((PerceptionLevel)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BmodPackage.PERCEPTION__EXISTING:
        return existing != EXISTING_EDEFAULT;
      case BmodPackage.PERCEPTION__CUSTOM:
        return custom != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (existing: ");
    result.append(existing);
    result.append(')');
    return result.toString();
  }

} //PerceptionImpl

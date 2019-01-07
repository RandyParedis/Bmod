/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.bmod.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.bmod.bmod.BmodPackage;
import org.xtext.bmod.bmod.Coordinate;
import org.xtext.bmod.bmod.Fire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.bmod.impl.FireImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FireImpl extends MinimalEObjectImpl.Container implements Fire
{
  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected Coordinate location;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FireImpl()
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
    return BmodPackage.Literals.FIRE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordinate getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation(Coordinate newLocation, NotificationChain msgs)
  {
    Coordinate oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodPackage.FIRE__LOCATION, oldLocation, newLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(Coordinate newLocation)
  {
    if (newLocation != location)
    {
      NotificationChain msgs = null;
      if (location != null)
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodPackage.FIRE__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodPackage.FIRE__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodPackage.FIRE__LOCATION, newLocation, newLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BmodPackage.FIRE__LOCATION:
        return basicSetLocation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BmodPackage.FIRE__LOCATION:
        return getLocation();
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
      case BmodPackage.FIRE__LOCATION:
        setLocation((Coordinate)newValue);
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
      case BmodPackage.FIRE__LOCATION:
        setLocation((Coordinate)null);
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
      case BmodPackage.FIRE__LOCATION:
        return location != null;
    }
    return super.eIsSet(featureID);
  }

} //FireImpl
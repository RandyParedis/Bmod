/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.bmod.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.bmod.bmod.Area;
import org.xtext.bmod.bmod.BmodPackage;
import org.xtext.bmod.bmod.Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.bmod.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.impl.RoomImpl#isHasCapacity <em>Has Capacity</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.impl.RoomImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.xtext.bmod.bmod.impl.RoomImpl#getAreas <em>Areas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isHasCapacity() <em>Has Capacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasCapacity()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_CAPACITY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasCapacity() <em>Has Capacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasCapacity()
   * @generated
   * @ordered
   */
  protected boolean hasCapacity = HAS_CAPACITY_EDEFAULT;

  /**
   * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacity()
   * @generated
   * @ordered
   */
  protected static final int CAPACITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacity()
   * @generated
   * @ordered
   */
  protected int capacity = CAPACITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getAreas() <em>Areas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAreas()
   * @generated
   * @ordered
   */
  protected EList<Area> areas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoomImpl()
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
    return BmodPackage.Literals.ROOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodPackage.ROOM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasCapacity()
  {
    return hasCapacity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasCapacity(boolean newHasCapacity)
  {
    boolean oldHasCapacity = hasCapacity;
    hasCapacity = newHasCapacity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodPackage.ROOM__HAS_CAPACITY, oldHasCapacity, hasCapacity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCapacity()
  {
    return capacity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCapacity(int newCapacity)
  {
    int oldCapacity = capacity;
    capacity = newCapacity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodPackage.ROOM__CAPACITY, oldCapacity, capacity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Area> getAreas()
  {
    if (areas == null)
    {
      areas = new EObjectContainmentEList<Area>(Area.class, this, BmodPackage.ROOM__AREAS);
    }
    return areas;
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
      case BmodPackage.ROOM__AREAS:
        return ((InternalEList<?>)getAreas()).basicRemove(otherEnd, msgs);
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
      case BmodPackage.ROOM__NAME:
        return getName();
      case BmodPackage.ROOM__HAS_CAPACITY:
        return isHasCapacity();
      case BmodPackage.ROOM__CAPACITY:
        return getCapacity();
      case BmodPackage.ROOM__AREAS:
        return getAreas();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BmodPackage.ROOM__NAME:
        setName((String)newValue);
        return;
      case BmodPackage.ROOM__HAS_CAPACITY:
        setHasCapacity((Boolean)newValue);
        return;
      case BmodPackage.ROOM__CAPACITY:
        setCapacity((Integer)newValue);
        return;
      case BmodPackage.ROOM__AREAS:
        getAreas().clear();
        getAreas().addAll((Collection<? extends Area>)newValue);
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
      case BmodPackage.ROOM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BmodPackage.ROOM__HAS_CAPACITY:
        setHasCapacity(HAS_CAPACITY_EDEFAULT);
        return;
      case BmodPackage.ROOM__CAPACITY:
        setCapacity(CAPACITY_EDEFAULT);
        return;
      case BmodPackage.ROOM__AREAS:
        getAreas().clear();
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
      case BmodPackage.ROOM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BmodPackage.ROOM__HAS_CAPACITY:
        return hasCapacity != HAS_CAPACITY_EDEFAULT;
      case BmodPackage.ROOM__CAPACITY:
        return capacity != CAPACITY_EDEFAULT;
      case BmodPackage.ROOM__AREAS:
        return areas != null && !areas.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", hasCapacity: ");
    result.append(hasCapacity);
    result.append(", capacity: ");
    result.append(capacity);
    result.append(')');
    return result.toString();
  }

} //RoomImpl

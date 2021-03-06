/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.breact.impl;

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

import org.xtext.bmod.breact.ActionDesc;
import org.xtext.bmod.breact.BreactPackage;
import org.xtext.bmod.breact.Find;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Desc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bmod.breact.impl.ActionDescImpl#isShared <em>Shared</em>}</li>
 *   <li>{@link org.xtext.bmod.breact.impl.ActionDescImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.bmod.breact.impl.ActionDescImpl#getFinds <em>Finds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionDescImpl extends MinimalEObjectImpl.Container implements ActionDesc
{
  /**
   * The default value of the '{@link #isShared() <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShared()
   * @generated
   * @ordered
   */
  protected static final boolean SHARED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShared() <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShared()
   * @generated
   * @ordered
   */
  protected boolean shared = SHARED_EDEFAULT;

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
   * The cached value of the '{@link #getFinds() <em>Finds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinds()
   * @generated
   * @ordered
   */
  protected EList<Find> finds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionDescImpl()
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
    return BreactPackage.Literals.ACTION_DESC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isShared()
  {
    return shared;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShared(boolean newShared)
  {
    boolean oldShared = shared;
    shared = newShared;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BreactPackage.ACTION_DESC__SHARED, oldShared, shared));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BreactPackage.ACTION_DESC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Find> getFinds()
  {
    if (finds == null)
    {
      finds = new EObjectContainmentEList<Find>(Find.class, this, BreactPackage.ACTION_DESC__FINDS);
    }
    return finds;
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
      case BreactPackage.ACTION_DESC__FINDS:
        return ((InternalEList<?>)getFinds()).basicRemove(otherEnd, msgs);
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
      case BreactPackage.ACTION_DESC__SHARED:
        return isShared();
      case BreactPackage.ACTION_DESC__NAME:
        return getName();
      case BreactPackage.ACTION_DESC__FINDS:
        return getFinds();
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
      case BreactPackage.ACTION_DESC__SHARED:
        setShared((Boolean)newValue);
        return;
      case BreactPackage.ACTION_DESC__NAME:
        setName((String)newValue);
        return;
      case BreactPackage.ACTION_DESC__FINDS:
        getFinds().clear();
        getFinds().addAll((Collection<? extends Find>)newValue);
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
      case BreactPackage.ACTION_DESC__SHARED:
        setShared(SHARED_EDEFAULT);
        return;
      case BreactPackage.ACTION_DESC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BreactPackage.ACTION_DESC__FINDS:
        getFinds().clear();
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
      case BreactPackage.ACTION_DESC__SHARED:
        return shared != SHARED_EDEFAULT;
      case BreactPackage.ACTION_DESC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BreactPackage.ACTION_DESC__FINDS:
        return finds != null && !finds.isEmpty();
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
    result.append(" (shared: ");
    result.append(shared);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActionDescImpl

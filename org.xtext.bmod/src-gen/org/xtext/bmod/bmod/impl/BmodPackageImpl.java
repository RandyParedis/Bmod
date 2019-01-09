/**
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.bmod.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.bmod.bmod.Action;
import org.xtext.bmod.bmod.ActionEnum;
import org.xtext.bmod.bmod.ActionProfile;
import org.xtext.bmod.bmod.Area;
import org.xtext.bmod.bmod.BmodFactory;
import org.xtext.bmod.bmod.BmodPackage;
import org.xtext.bmod.bmod.Coordinate;
import org.xtext.bmod.bmod.DangerousCondition;
import org.xtext.bmod.bmod.Door;
import org.xtext.bmod.bmod.DoorRef;
import org.xtext.bmod.bmod.EmergencySign;
import org.xtext.bmod.bmod.Exit;
import org.xtext.bmod.bmod.Fire;
import org.xtext.bmod.bmod.Floorplan;
import org.xtext.bmod.bmod.Model;
import org.xtext.bmod.bmod.Perception;
import org.xtext.bmod.bmod.PerceptionEnum;
import org.xtext.bmod.bmod.PerceptionLevel;
import org.xtext.bmod.bmod.Person;
import org.xtext.bmod.bmod.Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BmodPackageImpl extends EPackageImpl implements BmodPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floorplanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass perceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass perceptionLevelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionProfileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fireEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emergencySignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doorRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dangerousConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coordinateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass areaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum perceptionEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum actionEnumEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.bmod.bmod.BmodPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BmodPackageImpl()
  {
    super(eNS_URI, BmodFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link BmodPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BmodPackage init()
  {
    if (isInited) return (BmodPackage)EPackage.Registry.INSTANCE.getEPackage(BmodPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredBmodPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    BmodPackageImpl theBmodPackage = registeredBmodPackage instanceof BmodPackageImpl ? (BmodPackageImpl)registeredBmodPackage : new BmodPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theBmodPackage.createPackageContents();

    // Initialize created meta-data
    theBmodPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBmodPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BmodPackage.eNS_URI, theBmodPackage);
    return theBmodPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloorplan()
  {
    return floorplanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFloorplan_Perceptions()
  {
    return (EReference)floorplanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFloorplan_Actions()
  {
    return (EReference)floorplanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFloorplan_Rooms()
  {
    return (EReference)floorplanEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFloorplan_Doors()
  {
    return (EReference)floorplanEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFloorplan_Persons()
  {
    return (EReference)floorplanEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFloorplan_Exits()
  {
    return (EReference)floorplanEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFloorplan_Fires()
  {
    return (EReference)floorplanEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFloorplan_Signs()
  {
    return (EReference)floorplanEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFloorplan_Dancons()
  {
    return (EReference)floorplanEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoom()
  {
    return roomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoom_Name()
  {
    return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoom_Areas()
  {
    return (EReference)roomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoor()
  {
    return doorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoor_Name()
  {
    return (EAttribute)doorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoor_From()
  {
    return (EReference)doorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoor_To()
  {
    return (EReference)doorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerception()
  {
    return perceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerception_Existing()
  {
    return (EAttribute)perceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPerception_Custom()
  {
    return (EReference)perceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Existing()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Custom()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerceptionLevel()
  {
    return perceptionLevelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerceptionLevel_Name()
  {
    return (EAttribute)perceptionLevelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionProfile()
  {
    return actionProfileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionProfile_Name()
  {
    return (EAttribute)actionProfileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerson()
  {
    return personEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_Name()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPerson_Location()
  {
    return (EReference)personEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPerson_Perception()
  {
    return (EReference)personEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPerson_Action()
  {
    return (EReference)personEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExit()
  {
    return exitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExit_Location()
  {
    return (EReference)exitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFire()
  {
    return fireEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFire_Location()
  {
    return (EReference)fireEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmergencySign()
  {
    return emergencySignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmergencySign_On()
  {
    return (EReference)emergencySignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmergencySign_To()
  {
    return (EReference)emergencySignEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoorRef()
  {
    return doorRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoorRef_Ref()
  {
    return (EReference)doorRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDangerousCondition()
  {
    return dangerousConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDangerousCondition_On()
  {
    return (EReference)dangerousConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDangerousCondition_Amount()
  {
    return (EAttribute)dangerousConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoordinate()
  {
    return coordinateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoordinate_X()
  {
    return (EAttribute)coordinateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoordinate_Y()
  {
    return (EAttribute)coordinateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArea()
  {
    return areaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArea_From()
  {
    return (EReference)areaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArea_To()
  {
    return (EReference)areaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArea_Without()
  {
    return (EReference)areaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPerceptionEnum()
  {
    return perceptionEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getActionEnum()
  {
    return actionEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodFactory getBmodFactory()
  {
    return (BmodFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);

    floorplanEClass = createEClass(FLOORPLAN);
    createEReference(floorplanEClass, FLOORPLAN__PERCEPTIONS);
    createEReference(floorplanEClass, FLOORPLAN__ACTIONS);
    createEReference(floorplanEClass, FLOORPLAN__ROOMS);
    createEReference(floorplanEClass, FLOORPLAN__DOORS);
    createEReference(floorplanEClass, FLOORPLAN__PERSONS);
    createEReference(floorplanEClass, FLOORPLAN__EXITS);
    createEReference(floorplanEClass, FLOORPLAN__FIRES);
    createEReference(floorplanEClass, FLOORPLAN__SIGNS);
    createEReference(floorplanEClass, FLOORPLAN__DANCONS);

    roomEClass = createEClass(ROOM);
    createEAttribute(roomEClass, ROOM__NAME);
    createEReference(roomEClass, ROOM__AREAS);

    doorEClass = createEClass(DOOR);
    createEAttribute(doorEClass, DOOR__NAME);
    createEReference(doorEClass, DOOR__FROM);
    createEReference(doorEClass, DOOR__TO);

    perceptionEClass = createEClass(PERCEPTION);
    createEAttribute(perceptionEClass, PERCEPTION__EXISTING);
    createEReference(perceptionEClass, PERCEPTION__CUSTOM);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__EXISTING);
    createEReference(actionEClass, ACTION__CUSTOM);

    perceptionLevelEClass = createEClass(PERCEPTION_LEVEL);
    createEAttribute(perceptionLevelEClass, PERCEPTION_LEVEL__NAME);

    actionProfileEClass = createEClass(ACTION_PROFILE);
    createEAttribute(actionProfileEClass, ACTION_PROFILE__NAME);

    personEClass = createEClass(PERSON);
    createEAttribute(personEClass, PERSON__NAME);
    createEReference(personEClass, PERSON__LOCATION);
    createEReference(personEClass, PERSON__PERCEPTION);
    createEReference(personEClass, PERSON__ACTION);

    exitEClass = createEClass(EXIT);
    createEReference(exitEClass, EXIT__LOCATION);

    fireEClass = createEClass(FIRE);
    createEReference(fireEClass, FIRE__LOCATION);

    emergencySignEClass = createEClass(EMERGENCY_SIGN);
    createEReference(emergencySignEClass, EMERGENCY_SIGN__ON);
    createEReference(emergencySignEClass, EMERGENCY_SIGN__TO);

    doorRefEClass = createEClass(DOOR_REF);
    createEReference(doorRefEClass, DOOR_REF__REF);

    dangerousConditionEClass = createEClass(DANGEROUS_CONDITION);
    createEReference(dangerousConditionEClass, DANGEROUS_CONDITION__ON);
    createEAttribute(dangerousConditionEClass, DANGEROUS_CONDITION__AMOUNT);

    coordinateEClass = createEClass(COORDINATE);
    createEAttribute(coordinateEClass, COORDINATE__X);
    createEAttribute(coordinateEClass, COORDINATE__Y);

    areaEClass = createEClass(AREA);
    createEReference(areaEClass, AREA__FROM);
    createEReference(areaEClass, AREA__TO);
    createEReference(areaEClass, AREA__WITHOUT);

    // Create enums
    perceptionEnumEEnum = createEEnum(PERCEPTION_ENUM);
    actionEnumEEnum = createEEnum(ACTION_ENUM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    floorplanEClass.getESuperTypes().add(this.getModel());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floorplanEClass, Floorplan.class, "Floorplan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFloorplan_Perceptions(), this.getPerceptionLevel(), null, "perceptions", null, 0, -1, Floorplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloorplan_Actions(), this.getActionProfile(), null, "actions", null, 0, -1, Floorplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloorplan_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, Floorplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloorplan_Doors(), this.getDoor(), null, "doors", null, 0, -1, Floorplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloorplan_Persons(), this.getPerson(), null, "persons", null, 0, -1, Floorplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloorplan_Exits(), this.getExit(), null, "exits", null, 0, -1, Floorplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloorplan_Fires(), this.getFire(), null, "fires", null, 0, -1, Floorplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloorplan_Signs(), this.getEmergencySign(), null, "signs", null, 0, -1, Floorplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloorplan_Dancons(), this.getDangerousCondition(), null, "dancons", null, 0, -1, Floorplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoom_Areas(), this.getArea(), null, "areas", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doorEClass, Door.class, "Door", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoor_From(), this.getCoordinate(), null, "from", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoor_To(), this.getCoordinate(), null, "to", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(perceptionEClass, Perception.class, "Perception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerception_Existing(), this.getPerceptionEnum(), "existing", null, 0, 1, Perception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerception_Custom(), this.getPerceptionLevel(), null, "custom", null, 0, 1, Perception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Existing(), this.getActionEnum(), "existing", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Custom(), this.getActionProfile(), null, "custom", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(perceptionLevelEClass, PerceptionLevel.class, "PerceptionLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerceptionLevel_Name(), ecorePackage.getEString(), "name", null, 0, 1, PerceptionLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionProfileEClass, ActionProfile.class, "ActionProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionProfile_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerson_Location(), this.getCoordinate(), null, "location", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerson_Perception(), this.getPerception(), null, "perception", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerson_Action(), this.getAction(), null, "action", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExit_Location(), this.getCoordinate(), null, "location", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fireEClass, Fire.class, "Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFire_Location(), this.getCoordinate(), null, "location", null, 0, 1, Fire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emergencySignEClass, EmergencySign.class, "EmergencySign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmergencySign_On(), this.getDoor(), null, "on", null, 0, 1, EmergencySign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmergencySign_To(), this.getDoorRef(), null, "to", null, 0, 1, EmergencySign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doorRefEClass, DoorRef.class, "DoorRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoorRef_Ref(), this.getDoor(), null, "ref", null, 0, 1, DoorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dangerousConditionEClass, DangerousCondition.class, "DangerousCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDangerousCondition_On(), this.getRoom(), null, "on", null, 0, 1, DangerousCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDangerousCondition_Amount(), ecorePackage.getEInt(), "amount", null, 0, 1, DangerousCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coordinateEClass, Coordinate.class, "Coordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoordinate_X(), ecorePackage.getEInt(), "x", null, 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoordinate_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArea_From(), this.getCoordinate(), null, "from", null, 0, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArea_To(), this.getCoordinate(), null, "to", null, 0, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArea_Without(), this.getCoordinate(), null, "without", null, 0, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(perceptionEnumEEnum, PerceptionEnum.class, "PerceptionEnum");
    addEEnumLiteral(perceptionEnumEEnum, PerceptionEnum.ATTENTIVE);
    addEEnumLiteral(perceptionEnumEEnum, PerceptionEnum.RELAXED);
    addEEnumLiteral(perceptionEnumEEnum, PerceptionEnum.OPTIMISTIC);
    addEEnumLiteral(perceptionEnumEEnum, PerceptionEnum.SCEPTIC);

    initEEnum(actionEnumEEnum, ActionEnum.class, "ActionEnum");
    addEEnumLiteral(actionEnumEEnum, ActionEnum.NEWCOMER);
    addEEnumLiteral(actionEnumEEnum, ActionEnum.EXPERIENCED);
    addEEnumLiteral(actionEnumEEnum, ActionEnum.PANIC);

    // Create resource
    createResource(eNS_URI);
  }

} //BmodPackageImpl

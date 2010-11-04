/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.inavare.vims.iolist.model.impl;

import com.inavare.vims.iolist.model.DataType;
import com.inavare.vims.iolist.model.Item;
import com.inavare.vims.iolist.model.ModelFactory;
import com.inavare.vims.iolist.model.ModelPackage;

import com.inavare.vims.iolist.model.SummaryGroup;
import com.inavare.vims.iolist.model.SummaryItem;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass itemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass summaryGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass summaryItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dataTypeEEnum = null;

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
     * @see com.inavare.vims.iolist.model.ModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelPackageImpl()
    {
        super(eNS_URI, ModelFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelPackage init()
    {
        if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

        // Obtain or create and register package
        ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theModelPackage.createPackageContents();

        // Initialize created meta-data
        theModelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theModelPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
        return theModelPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getItem()
    {
        return itemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_Device()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_Name()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_DataType()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_Unit()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_Alias()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_Description()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_DefaultChain()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalMin()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalMinAck()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalMax()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalMaxAck()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalHighHighAvailable()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalHighHighAck()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalHighHighPreset()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_EventCommand()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalManual()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_RemoteManual()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_System()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_Location()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_Component()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_RemoteMin()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_RemoteMax()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_RemoteHighHigh()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_RemoteHigh()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_RemoteLow()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_RemoteLowLow()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalHighAvailable()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalHighAck()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalHighPreset()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalLowAvailable()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalLowAck()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalLowPreset()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalLowLowAvailable()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalLowLowAck()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalLowLowPreset()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_RemoteBool()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_Input()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(36);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_Output()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(37);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalBool()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(38);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalScaleAvailable()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(39);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalScaleFactor()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(40);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalScaleOffset()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(41);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_ListMonitorPreset()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(42);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_ListMonitorListIsAlarm()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(43);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_ListMonitorAckRequired()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(44);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_ListMonitorItems()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(45);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_DebugInformation()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(46);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalBoolAvailable()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(47);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_LocalBoolAck()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(48);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_IgnoreSummary()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures().get(49);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSummaryGroup()
    {
        return summaryGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSummaryGroup_Items()
    {
        return (EReference)summaryGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryGroup_Id()
    {
        return (EAttribute)summaryGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryGroup_Location()
    {
        return (EAttribute)summaryGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryGroup_Component()
    {
        return (EAttribute)summaryGroupEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSummaryItem()
    {
        return summaryItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryItem_DataSourceId()
    {
        return (EAttribute)summaryItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryItem_Type()
    {
        return (EAttribute)summaryItemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDataType()
    {
        return dataTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelFactory getModelFactory()
    {
        return (ModelFactory)getEFactoryInstance();
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
        itemEClass = createEClass(ITEM);
        createEAttribute(itemEClass, ITEM__DEVICE);
        createEAttribute(itemEClass, ITEM__NAME);
        createEAttribute(itemEClass, ITEM__DATA_TYPE);
        createEAttribute(itemEClass, ITEM__UNIT);
        createEAttribute(itemEClass, ITEM__ALIAS);
        createEAttribute(itemEClass, ITEM__DESCRIPTION);
        createEAttribute(itemEClass, ITEM__DEFAULT_CHAIN);
        createEAttribute(itemEClass, ITEM__LOCAL_MIN);
        createEAttribute(itemEClass, ITEM__LOCAL_MIN_ACK);
        createEAttribute(itemEClass, ITEM__LOCAL_MAX);
        createEAttribute(itemEClass, ITEM__LOCAL_MAX_ACK);
        createEAttribute(itemEClass, ITEM__LOCAL_HIGH_HIGH_AVAILABLE);
        createEAttribute(itemEClass, ITEM__LOCAL_HIGH_HIGH_ACK);
        createEAttribute(itemEClass, ITEM__LOCAL_HIGH_HIGH_PRESET);
        createEAttribute(itemEClass, ITEM__EVENT_COMMAND);
        createEAttribute(itemEClass, ITEM__LOCAL_MANUAL);
        createEAttribute(itemEClass, ITEM__REMOTE_MANUAL);
        createEAttribute(itemEClass, ITEM__SYSTEM);
        createEAttribute(itemEClass, ITEM__LOCATION);
        createEAttribute(itemEClass, ITEM__COMPONENT);
        createEAttribute(itemEClass, ITEM__REMOTE_MIN);
        createEAttribute(itemEClass, ITEM__REMOTE_MAX);
        createEAttribute(itemEClass, ITEM__REMOTE_HIGH_HIGH);
        createEAttribute(itemEClass, ITEM__REMOTE_HIGH);
        createEAttribute(itemEClass, ITEM__REMOTE_LOW);
        createEAttribute(itemEClass, ITEM__REMOTE_LOW_LOW);
        createEAttribute(itemEClass, ITEM__LOCAL_HIGH_AVAILABLE);
        createEAttribute(itemEClass, ITEM__LOCAL_HIGH_ACK);
        createEAttribute(itemEClass, ITEM__LOCAL_HIGH_PRESET);
        createEAttribute(itemEClass, ITEM__LOCAL_LOW_AVAILABLE);
        createEAttribute(itemEClass, ITEM__LOCAL_LOW_ACK);
        createEAttribute(itemEClass, ITEM__LOCAL_LOW_PRESET);
        createEAttribute(itemEClass, ITEM__LOCAL_LOW_LOW_AVAILABLE);
        createEAttribute(itemEClass, ITEM__LOCAL_LOW_LOW_ACK);
        createEAttribute(itemEClass, ITEM__LOCAL_LOW_LOW_PRESET);
        createEAttribute(itemEClass, ITEM__REMOTE_BOOL);
        createEAttribute(itemEClass, ITEM__INPUT);
        createEAttribute(itemEClass, ITEM__OUTPUT);
        createEAttribute(itemEClass, ITEM__LOCAL_BOOL);
        createEAttribute(itemEClass, ITEM__LOCAL_SCALE_AVAILABLE);
        createEAttribute(itemEClass, ITEM__LOCAL_SCALE_FACTOR);
        createEAttribute(itemEClass, ITEM__LOCAL_SCALE_OFFSET);
        createEAttribute(itemEClass, ITEM__LIST_MONITOR_PRESET);
        createEAttribute(itemEClass, ITEM__LIST_MONITOR_LIST_IS_ALARM);
        createEAttribute(itemEClass, ITEM__LIST_MONITOR_ACK_REQUIRED);
        createEAttribute(itemEClass, ITEM__LIST_MONITOR_ITEMS);
        createEAttribute(itemEClass, ITEM__DEBUG_INFORMATION);
        createEAttribute(itemEClass, ITEM__LOCAL_BOOL_AVAILABLE);
        createEAttribute(itemEClass, ITEM__LOCAL_BOOL_ACK);
        createEAttribute(itemEClass, ITEM__IGNORE_SUMMARY);

        summaryGroupEClass = createEClass(SUMMARY_GROUP);
        createEReference(summaryGroupEClass, SUMMARY_GROUP__ITEMS);
        createEAttribute(summaryGroupEClass, SUMMARY_GROUP__ID);
        createEAttribute(summaryGroupEClass, SUMMARY_GROUP__LOCATION);
        createEAttribute(summaryGroupEClass, SUMMARY_GROUP__COMPONENT);

        summaryItemEClass = createEClass(SUMMARY_ITEM);
        createEAttribute(summaryItemEClass, SUMMARY_ITEM__DATA_SOURCE_ID);
        createEAttribute(summaryItemEClass, SUMMARY_ITEM__TYPE);

        // Create enums
        dataTypeEEnum = createEEnum(DATA_TYPE);
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

        // Initialize classes and features; add operations and parameters
        initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getItem_Device(), ecorePackage.getEString(), "device", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_DataType(), this.getDataType(), "dataType", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_DefaultChain(), ecorePackage.getEBoolean(), "defaultChain", "true", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalMin(), ecorePackage.getEDoubleObject(), "localMin", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalMinAck(), ecorePackage.getEBoolean(), "localMinAck", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalMax(), ecorePackage.getEDoubleObject(), "localMax", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalMaxAck(), ecorePackage.getEBoolean(), "localMaxAck", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalHighHighAvailable(), ecorePackage.getEBoolean(), "localHighHighAvailable", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalHighHighAck(), ecorePackage.getEBoolean(), "localHighHighAck", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalHighHighPreset(), ecorePackage.getEDoubleObject(), "localHighHighPreset", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_EventCommand(), ecorePackage.getEBoolean(), "eventCommand", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalManual(), ecorePackage.getEBoolean(), "localManual", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_RemoteManual(), ecorePackage.getEBoolean(), "remoteManual", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_System(), ecorePackage.getEString(), "system", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_Location(), ecorePackage.getEString(), "location", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_Component(), ecorePackage.getEString(), "component", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_RemoteMin(), ecorePackage.getEBoolean(), "remoteMin", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_RemoteMax(), ecorePackage.getEBoolean(), "remoteMax", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_RemoteHighHigh(), ecorePackage.getEBoolean(), "remoteHighHigh", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_RemoteHigh(), ecorePackage.getEBoolean(), "remoteHigh", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_RemoteLow(), ecorePackage.getEBoolean(), "remoteLow", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_RemoteLowLow(), ecorePackage.getEBoolean(), "remoteLowLow", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalHighAvailable(), ecorePackage.getEBoolean(), "localHighAvailable", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalHighAck(), ecorePackage.getEBoolean(), "localHighAck", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalHighPreset(), ecorePackage.getEDoubleObject(), "localHighPreset", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalLowAvailable(), ecorePackage.getEBoolean(), "localLowAvailable", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalLowAck(), ecorePackage.getEBoolean(), "localLowAck", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalLowPreset(), ecorePackage.getEDoubleObject(), "localLowPreset", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalLowLowAvailable(), ecorePackage.getEBoolean(), "localLowLowAvailable", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalLowLowAck(), ecorePackage.getEBoolean(), "localLowLowAck", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalLowLowPreset(), ecorePackage.getEDoubleObject(), "localLowLowPreset", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_RemoteBool(), ecorePackage.getEBoolean(), "remoteBool", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_Input(), ecorePackage.getEBoolean(), "input", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_Output(), ecorePackage.getEBoolean(), "output", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalBool(), ecorePackage.getEBooleanObject(), "localBool", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalScaleAvailable(), ecorePackage.getEBoolean(), "localScaleAvailable", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalScaleFactor(), ecorePackage.getEDoubleObject(), "localScaleFactor", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalScaleOffset(), ecorePackage.getEDoubleObject(), "localScaleOffset", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_ListMonitorPreset(), ecorePackage.getEBoolean(), "listMonitorPreset", "false", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_ListMonitorListIsAlarm(), ecorePackage.getEBoolean(), "listMonitorListIsAlarm", "true", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_ListMonitorAckRequired(), ecorePackage.getEBoolean(), "listMonitorAckRequired", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_ListMonitorItems(), ecorePackage.getEString(), "listMonitorItems", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_DebugInformation(), ecorePackage.getEString(), "debugInformation", null, 0, 1, Item.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalBoolAvailable(), ecorePackage.getEBoolean(), "localBoolAvailable", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_LocalBoolAck(), ecorePackage.getEBoolean(), "localBoolAck", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getItem_IgnoreSummary(), ecorePackage.getEBoolean(), "ignoreSummary", "false", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(summaryGroupEClass, SummaryGroup.class, "SummaryGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSummaryGroup_Items(), this.getSummaryItem(), null, "items", null, 0, -1, SummaryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSummaryGroup_Id(), ecorePackage.getEString(), "id", null, 1, 1, SummaryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSummaryGroup_Location(), ecorePackage.getEString(), "location", null, 0, 1, SummaryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSummaryGroup_Component(), ecorePackage.getEString(), "component", null, 0, 1, SummaryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(summaryItemEClass, SummaryItem.class, "SummaryItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSummaryItem_DataSourceId(), ecorePackage.getEString(), "dataSourceId", null, 1, 1, SummaryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSummaryItem_Type(), ecorePackage.getEString(), "type", null, 1, 1, SummaryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(dataTypeEEnum, DataType.class, "DataType");
        addEEnumLiteral(dataTypeEEnum, DataType.VARIANT);
        addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);
        addEEnumLiteral(dataTypeEEnum, DataType.STRING);
        addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
        addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
        addEEnumLiteral(dataTypeEEnum, DataType.LONG_INTEGER);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations()
    {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
        addAnnotation
          (getItem_Alias(), 
           source, 
           new String[] 
           {
             "namespace", ""
           });
    }

} //ModelPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.inavare.vims.iolist.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.inavare.vims.iolist.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "model";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///com/inavare/vims/iolist/model.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "com.inavare.vims.iolist.model";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelPackage eINSTANCE = com.inavare.vims.iolist.model.impl.ModelPackageImpl.init();

    /**
     * The meta object id for the '{@link com.inavare.vims.iolist.model.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.inavare.vims.iolist.model.impl.ItemImpl
     * @see com.inavare.vims.iolist.model.impl.ModelPackageImpl#getItem()
     * @generated
     */
    int ITEM = 0;

    /**
     * The feature id for the '<em><b>Device</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__DEVICE = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__NAME = 1;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__DATA_TYPE = 2;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__UNIT = 3;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__ALIAS = 4;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__DESCRIPTION = 5;

    /**
     * The feature id for the '<em><b>Default Chain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__DEFAULT_CHAIN = 6;

    /**
     * The feature id for the '<em><b>Local Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_MIN = 7;

    /**
     * The feature id for the '<em><b>Local Min Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_MIN_ACK = 8;

    /**
     * The feature id for the '<em><b>Local Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_MAX = 9;

    /**
     * The feature id for the '<em><b>Local Max Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_MAX_ACK = 10;

    /**
     * The feature id for the '<em><b>Local High High Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_HIGH_HIGH_AVAILABLE = 11;

    /**
     * The feature id for the '<em><b>Local High High Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_HIGH_HIGH_ACK = 12;

    /**
     * The feature id for the '<em><b>Local High High Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_HIGH_HIGH_PRESET = 13;

    /**
     * The feature id for the '<em><b>Event Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__EVENT_COMMAND = 14;

    /**
     * The feature id for the '<em><b>Local Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_MANUAL = 15;

    /**
     * The feature id for the '<em><b>Remote Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_MANUAL = 16;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__SYSTEM = 17;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCATION = 18;

    /**
     * The feature id for the '<em><b>Component</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__COMPONENT = 19;

    /**
     * The feature id for the '<em><b>Remote Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_MIN = 20;

    /**
     * The feature id for the '<em><b>Remote Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_MAX = 21;

    /**
     * The feature id for the '<em><b>Remote High High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_HIGH_HIGH = 22;

    /**
     * The feature id for the '<em><b>Remote High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_HIGH = 23;

    /**
     * The feature id for the '<em><b>Remote Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_LOW = 24;

    /**
     * The feature id for the '<em><b>Remote Low Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_LOW_LOW = 25;

    /**
     * The feature id for the '<em><b>Local High Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_HIGH_AVAILABLE = 26;

    /**
     * The feature id for the '<em><b>Local High Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_HIGH_ACK = 27;

    /**
     * The feature id for the '<em><b>Local High Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_HIGH_PRESET = 28;

    /**
     * The feature id for the '<em><b>Local Low Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_LOW_AVAILABLE = 29;

    /**
     * The feature id for the '<em><b>Local Low Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_LOW_ACK = 30;

    /**
     * The feature id for the '<em><b>Local Low Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_LOW_PRESET = 31;

    /**
     * The feature id for the '<em><b>Local Low Low Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_LOW_LOW_AVAILABLE = 32;

    /**
     * The feature id for the '<em><b>Local Low Low Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_LOW_LOW_ACK = 33;

    /**
     * The feature id for the '<em><b>Local Low Low Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_LOW_LOW_PRESET = 34;

    /**
     * The feature id for the '<em><b>Remote Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_BOOL = 35;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__INPUT = 36;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__OUTPUT = 37;

    /**
     * The feature id for the '<em><b>Local Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_BOOL = 38;

    /**
     * The feature id for the '<em><b>Local Scale Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_SCALE_AVAILABLE = 39;

    /**
     * The feature id for the '<em><b>Local Scale Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_SCALE_FACTOR = 40;

    /**
     * The feature id for the '<em><b>Local Scale Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_SCALE_OFFSET = 41;

    /**
     * The feature id for the '<em><b>List Monitor Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LIST_MONITOR_PRESET = 42;

    /**
     * The feature id for the '<em><b>List Monitor List Is Alarm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LIST_MONITOR_LIST_IS_ALARM = 43;

    /**
     * The feature id for the '<em><b>List Monitor Ack Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LIST_MONITOR_ACK_REQUIRED = 44;

    /**
     * The feature id for the '<em><b>List Monitor Items</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LIST_MONITOR_ITEMS = 45;

    /**
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__DEBUG_INFORMATION = 46;

    /**
     * The feature id for the '<em><b>Local Bool Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_BOOL_AVAILABLE = 47;

    /**
     * The feature id for the '<em><b>Local Bool Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_BOOL_ACK = 48;

    /**
     * The feature id for the '<em><b>Ignore Summary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__IGNORE_SUMMARY = 49;

    /**
     * The number of structural features of the '<em>Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_FEATURE_COUNT = 50;

    /**
     * The meta object id for the '{@link com.inavare.vims.iolist.model.impl.SummaryGroupImpl <em>Summary Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.inavare.vims.iolist.model.impl.SummaryGroupImpl
     * @see com.inavare.vims.iolist.model.impl.ModelPackageImpl#getSummaryGroup()
     * @generated
     */
    int SUMMARY_GROUP = 1;

    /**
     * The feature id for the '<em><b>Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP__ITEMS = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP__ID = 1;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP__LOCATION = 2;

    /**
     * The feature id for the '<em><b>Component</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP__COMPONENT = 3;

    /**
     * The number of structural features of the '<em>Summary Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link com.inavare.vims.iolist.model.impl.SummaryItemImpl <em>Summary Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.inavare.vims.iolist.model.impl.SummaryItemImpl
     * @see com.inavare.vims.iolist.model.impl.ModelPackageImpl#getSummaryItem()
     * @generated
     */
    int SUMMARY_ITEM = 2;

    /**
     * The feature id for the '<em><b>Data Source Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_ITEM__DATA_SOURCE_ID = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_ITEM__TYPE = 1;

    /**
     * The number of structural features of the '<em>Summary Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_ITEM_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link com.inavare.vims.iolist.model.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.inavare.vims.iolist.model.DataType
     * @see com.inavare.vims.iolist.model.impl.ModelPackageImpl#getDataType()
     * @generated
     */
    int DATA_TYPE = 3;


    /**
     * Returns the meta object for class '{@link com.inavare.vims.iolist.model.Item <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item</em>'.
     * @see com.inavare.vims.iolist.model.Item
     * @generated
     */
    EClass getItem();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getDevice <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Device</em>'.
     * @see com.inavare.vims.iolist.model.Item#getDevice()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Device();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see com.inavare.vims.iolist.model.Item#getName()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Name();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see com.inavare.vims.iolist.model.Item#getDataType()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DataType();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see com.inavare.vims.iolist.model.Item#getUnit()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Unit();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alias</em>'.
     * @see com.inavare.vims.iolist.model.Item#getAlias()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Alias();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see com.inavare.vims.iolist.model.Item#getDescription()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Description();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isDefaultChain <em>Default Chain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Chain</em>'.
     * @see com.inavare.vims.iolist.model.Item#isDefaultChain()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DefaultChain();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocalMin <em>Local Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Min</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocalMin()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalMin();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalMinAck <em>Local Min Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Min Ack</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalMinAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalMinAck();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocalMax <em>Local Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Max</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocalMax()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalMax();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalMaxAck <em>Local Max Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Max Ack</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalMaxAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalMaxAck();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalHighHighAvailable <em>Local High High Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High High Available</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalHighHighAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighHighAvailable();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalHighHighAck <em>Local High High Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High High Ack</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalHighHighAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighHighAck();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocalHighHighPreset <em>Local High High Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High High Preset</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocalHighHighPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighHighPreset();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isEventCommand <em>Event Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Event Command</em>'.
     * @see com.inavare.vims.iolist.model.Item#isEventCommand()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_EventCommand();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalManual <em>Local Manual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Manual</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalManual()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalManual();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isRemoteManual <em>Remote Manual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Manual</em>'.
     * @see com.inavare.vims.iolist.model.Item#isRemoteManual()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteManual();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System</em>'.
     * @see com.inavare.vims.iolist.model.Item#getSystem()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_System();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocation()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Location();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component</em>'.
     * @see com.inavare.vims.iolist.model.Item#getComponent()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Component();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isRemoteMin <em>Remote Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Min</em>'.
     * @see com.inavare.vims.iolist.model.Item#isRemoteMin()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteMin();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isRemoteMax <em>Remote Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Max</em>'.
     * @see com.inavare.vims.iolist.model.Item#isRemoteMax()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteMax();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isRemoteHighHigh <em>Remote High High</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote High High</em>'.
     * @see com.inavare.vims.iolist.model.Item#isRemoteHighHigh()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteHighHigh();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isRemoteHigh <em>Remote High</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote High</em>'.
     * @see com.inavare.vims.iolist.model.Item#isRemoteHigh()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteHigh();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isRemoteLow <em>Remote Low</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Low</em>'.
     * @see com.inavare.vims.iolist.model.Item#isRemoteLow()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteLow();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isRemoteLowLow <em>Remote Low Low</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Low Low</em>'.
     * @see com.inavare.vims.iolist.model.Item#isRemoteLowLow()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteLowLow();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalHighAvailable <em>Local High Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High Available</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalHighAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighAvailable();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalHighAck <em>Local High Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High Ack</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalHighAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighAck();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocalHighPreset <em>Local High Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High Preset</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocalHighPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighPreset();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalLowAvailable <em>Local Low Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Available</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalLowAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowAvailable();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalLowAck <em>Local Low Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Ack</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalLowAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowAck();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocalLowPreset <em>Local Low Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Preset</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocalLowPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowPreset();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalLowLowAvailable <em>Local Low Low Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Low Available</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalLowLowAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowLowAvailable();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalLowLowAck <em>Local Low Low Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Low Ack</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalLowLowAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowLowAck();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocalLowLowPreset <em>Local Low Low Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Low Preset</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocalLowLowPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowLowPreset();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isRemoteBool <em>Remote Bool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Bool</em>'.
     * @see com.inavare.vims.iolist.model.Item#isRemoteBool()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteBool();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see com.inavare.vims.iolist.model.Item#isInput()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Input();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output</em>'.
     * @see com.inavare.vims.iolist.model.Item#isOutput()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Output();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocalBool <em>Local Bool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Bool</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocalBool()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalBool();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalScaleAvailable <em>Local Scale Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Scale Available</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalScaleAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalScaleAvailable();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocalScaleFactor <em>Local Scale Factor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Scale Factor</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocalScaleFactor()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalScaleFactor();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getLocalScaleOffset <em>Local Scale Offset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Scale Offset</em>'.
     * @see com.inavare.vims.iolist.model.Item#getLocalScaleOffset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalScaleOffset();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isListMonitorPreset <em>List Monitor Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>List Monitor Preset</em>'.
     * @see com.inavare.vims.iolist.model.Item#isListMonitorPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_ListMonitorPreset();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isListMonitorListIsAlarm <em>List Monitor List Is Alarm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>List Monitor List Is Alarm</em>'.
     * @see com.inavare.vims.iolist.model.Item#isListMonitorListIsAlarm()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_ListMonitorListIsAlarm();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isListMonitorAckRequired <em>List Monitor Ack Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>List Monitor Ack Required</em>'.
     * @see com.inavare.vims.iolist.model.Item#isListMonitorAckRequired()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_ListMonitorAckRequired();

    /**
     * Returns the meta object for the attribute list '{@link com.inavare.vims.iolist.model.Item#getListMonitorItems <em>List Monitor Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>List Monitor Items</em>'.
     * @see com.inavare.vims.iolist.model.Item#getListMonitorItems()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_ListMonitorItems();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#getDebugInformation <em>Debug Information</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Debug Information</em>'.
     * @see com.inavare.vims.iolist.model.Item#getDebugInformation()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DebugInformation();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalBoolAvailable <em>Local Bool Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Bool Available</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalBoolAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalBoolAvailable();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isLocalBoolAck <em>Local Bool Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Bool Ack</em>'.
     * @see com.inavare.vims.iolist.model.Item#isLocalBoolAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalBoolAck();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.Item#isIgnoreSummary <em>Ignore Summary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ignore Summary</em>'.
     * @see com.inavare.vims.iolist.model.Item#isIgnoreSummary()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_IgnoreSummary();

    /**
     * Returns the meta object for class '{@link com.inavare.vims.iolist.model.SummaryGroup <em>Summary Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Summary Group</em>'.
     * @see com.inavare.vims.iolist.model.SummaryGroup
     * @generated
     */
    EClass getSummaryGroup();

    /**
     * Returns the meta object for the containment reference list '{@link com.inavare.vims.iolist.model.SummaryGroup#getItems <em>Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Items</em>'.
     * @see com.inavare.vims.iolist.model.SummaryGroup#getItems()
     * @see #getSummaryGroup()
     * @generated
     */
    EReference getSummaryGroup_Items();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.SummaryGroup#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see com.inavare.vims.iolist.model.SummaryGroup#getId()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_Id();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.SummaryGroup#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see com.inavare.vims.iolist.model.SummaryGroup#getLocation()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_Location();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.SummaryGroup#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component</em>'.
     * @see com.inavare.vims.iolist.model.SummaryGroup#getComponent()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_Component();

    /**
     * Returns the meta object for class '{@link com.inavare.vims.iolist.model.SummaryItem <em>Summary Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Summary Item</em>'.
     * @see com.inavare.vims.iolist.model.SummaryItem
     * @generated
     */
    EClass getSummaryItem();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.SummaryItem#getDataSourceId <em>Data Source Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Source Id</em>'.
     * @see com.inavare.vims.iolist.model.SummaryItem#getDataSourceId()
     * @see #getSummaryItem()
     * @generated
     */
    EAttribute getSummaryItem_DataSourceId();

    /**
     * Returns the meta object for the attribute '{@link com.inavare.vims.iolist.model.SummaryItem#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see com.inavare.vims.iolist.model.SummaryItem#getType()
     * @see #getSummaryItem()
     * @generated
     */
    EAttribute getSummaryItem_Type();

    /**
     * Returns the meta object for enum '{@link com.inavare.vims.iolist.model.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Data Type</em>'.
     * @see com.inavare.vims.iolist.model.DataType
     * @generated
     */
    EEnum getDataType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelFactory getModelFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link com.inavare.vims.iolist.model.impl.ItemImpl <em>Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.inavare.vims.iolist.model.impl.ItemImpl
         * @see com.inavare.vims.iolist.model.impl.ModelPackageImpl#getItem()
         * @generated
         */
        EClass ITEM = eINSTANCE.getItem();

        /**
         * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DEVICE = eINSTANCE.getItem_Device();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DATA_TYPE = eINSTANCE.getItem_DataType();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__UNIT = eINSTANCE.getItem_Unit();

        /**
         * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__ALIAS = eINSTANCE.getItem_Alias();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DESCRIPTION = eINSTANCE.getItem_Description();

        /**
         * The meta object literal for the '<em><b>Default Chain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DEFAULT_CHAIN = eINSTANCE.getItem_DefaultChain();

        /**
         * The meta object literal for the '<em><b>Local Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_MIN = eINSTANCE.getItem_LocalMin();

        /**
         * The meta object literal for the '<em><b>Local Min Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_MIN_ACK = eINSTANCE.getItem_LocalMinAck();

        /**
         * The meta object literal for the '<em><b>Local Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_MAX = eINSTANCE.getItem_LocalMax();

        /**
         * The meta object literal for the '<em><b>Local Max Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_MAX_ACK = eINSTANCE.getItem_LocalMaxAck();

        /**
         * The meta object literal for the '<em><b>Local High High Available</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_HIGH_HIGH_AVAILABLE = eINSTANCE.getItem_LocalHighHighAvailable();

        /**
         * The meta object literal for the '<em><b>Local High High Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_HIGH_HIGH_ACK = eINSTANCE.getItem_LocalHighHighAck();

        /**
         * The meta object literal for the '<em><b>Local High High Preset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_HIGH_HIGH_PRESET = eINSTANCE.getItem_LocalHighHighPreset();

        /**
         * The meta object literal for the '<em><b>Event Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__EVENT_COMMAND = eINSTANCE.getItem_EventCommand();

        /**
         * The meta object literal for the '<em><b>Local Manual</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_MANUAL = eINSTANCE.getItem_LocalManual();

        /**
         * The meta object literal for the '<em><b>Remote Manual</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_MANUAL = eINSTANCE.getItem_RemoteManual();

        /**
         * The meta object literal for the '<em><b>System</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__SYSTEM = eINSTANCE.getItem_System();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCATION = eINSTANCE.getItem_Location();

        /**
         * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__COMPONENT = eINSTANCE.getItem_Component();

        /**
         * The meta object literal for the '<em><b>Remote Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_MIN = eINSTANCE.getItem_RemoteMin();

        /**
         * The meta object literal for the '<em><b>Remote Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_MAX = eINSTANCE.getItem_RemoteMax();

        /**
         * The meta object literal for the '<em><b>Remote High High</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_HIGH_HIGH = eINSTANCE.getItem_RemoteHighHigh();

        /**
         * The meta object literal for the '<em><b>Remote High</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_HIGH = eINSTANCE.getItem_RemoteHigh();

        /**
         * The meta object literal for the '<em><b>Remote Low</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_LOW = eINSTANCE.getItem_RemoteLow();

        /**
         * The meta object literal for the '<em><b>Remote Low Low</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_LOW_LOW = eINSTANCE.getItem_RemoteLowLow();

        /**
         * The meta object literal for the '<em><b>Local High Available</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_HIGH_AVAILABLE = eINSTANCE.getItem_LocalHighAvailable();

        /**
         * The meta object literal for the '<em><b>Local High Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_HIGH_ACK = eINSTANCE.getItem_LocalHighAck();

        /**
         * The meta object literal for the '<em><b>Local High Preset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_HIGH_PRESET = eINSTANCE.getItem_LocalHighPreset();

        /**
         * The meta object literal for the '<em><b>Local Low Available</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_LOW_AVAILABLE = eINSTANCE.getItem_LocalLowAvailable();

        /**
         * The meta object literal for the '<em><b>Local Low Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_LOW_ACK = eINSTANCE.getItem_LocalLowAck();

        /**
         * The meta object literal for the '<em><b>Local Low Preset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_LOW_PRESET = eINSTANCE.getItem_LocalLowPreset();

        /**
         * The meta object literal for the '<em><b>Local Low Low Available</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_LOW_LOW_AVAILABLE = eINSTANCE.getItem_LocalLowLowAvailable();

        /**
         * The meta object literal for the '<em><b>Local Low Low Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_LOW_LOW_ACK = eINSTANCE.getItem_LocalLowLowAck();

        /**
         * The meta object literal for the '<em><b>Local Low Low Preset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_LOW_LOW_PRESET = eINSTANCE.getItem_LocalLowLowPreset();

        /**
         * The meta object literal for the '<em><b>Remote Bool</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_BOOL = eINSTANCE.getItem_RemoteBool();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__INPUT = eINSTANCE.getItem_Input();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__OUTPUT = eINSTANCE.getItem_Output();

        /**
         * The meta object literal for the '<em><b>Local Bool</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_BOOL = eINSTANCE.getItem_LocalBool();

        /**
         * The meta object literal for the '<em><b>Local Scale Available</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_SCALE_AVAILABLE = eINSTANCE.getItem_LocalScaleAvailable();

        /**
         * The meta object literal for the '<em><b>Local Scale Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_SCALE_FACTOR = eINSTANCE.getItem_LocalScaleFactor();

        /**
         * The meta object literal for the '<em><b>Local Scale Offset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_SCALE_OFFSET = eINSTANCE.getItem_LocalScaleOffset();

        /**
         * The meta object literal for the '<em><b>List Monitor Preset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LIST_MONITOR_PRESET = eINSTANCE.getItem_ListMonitorPreset();

        /**
         * The meta object literal for the '<em><b>List Monitor List Is Alarm</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LIST_MONITOR_LIST_IS_ALARM = eINSTANCE.getItem_ListMonitorListIsAlarm();

        /**
         * The meta object literal for the '<em><b>List Monitor Ack Required</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LIST_MONITOR_ACK_REQUIRED = eINSTANCE.getItem_ListMonitorAckRequired();

        /**
         * The meta object literal for the '<em><b>List Monitor Items</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LIST_MONITOR_ITEMS = eINSTANCE.getItem_ListMonitorItems();

        /**
         * The meta object literal for the '<em><b>Debug Information</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DEBUG_INFORMATION = eINSTANCE.getItem_DebugInformation();

        /**
         * The meta object literal for the '<em><b>Local Bool Available</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_BOOL_AVAILABLE = eINSTANCE.getItem_LocalBoolAvailable();

        /**
         * The meta object literal for the '<em><b>Local Bool Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_BOOL_ACK = eINSTANCE.getItem_LocalBoolAck();

        /**
         * The meta object literal for the '<em><b>Ignore Summary</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__IGNORE_SUMMARY = eINSTANCE.getItem_IgnoreSummary();

        /**
         * The meta object literal for the '{@link com.inavare.vims.iolist.model.impl.SummaryGroupImpl <em>Summary Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.inavare.vims.iolist.model.impl.SummaryGroupImpl
         * @see com.inavare.vims.iolist.model.impl.ModelPackageImpl#getSummaryGroup()
         * @generated
         */
        EClass SUMMARY_GROUP = eINSTANCE.getSummaryGroup();

        /**
         * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUMMARY_GROUP__ITEMS = eINSTANCE.getSummaryGroup_Items();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUMMARY_GROUP__ID = eINSTANCE.getSummaryGroup_Id();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUMMARY_GROUP__LOCATION = eINSTANCE.getSummaryGroup_Location();

        /**
         * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUMMARY_GROUP__COMPONENT = eINSTANCE.getSummaryGroup_Component();

        /**
         * The meta object literal for the '{@link com.inavare.vims.iolist.model.impl.SummaryItemImpl <em>Summary Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.inavare.vims.iolist.model.impl.SummaryItemImpl
         * @see com.inavare.vims.iolist.model.impl.ModelPackageImpl#getSummaryItem()
         * @generated
         */
        EClass SUMMARY_ITEM = eINSTANCE.getSummaryItem();

        /**
         * The meta object literal for the '<em><b>Data Source Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUMMARY_ITEM__DATA_SOURCE_ID = eINSTANCE.getSummaryItem_DataSourceId();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUMMARY_ITEM__TYPE = eINSTANCE.getSummaryItem_Type();

        /**
         * The meta object literal for the '{@link com.inavare.vims.iolist.model.DataType <em>Data Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.inavare.vims.iolist.model.DataType
         * @see com.inavare.vims.iolist.model.impl.ModelPackageImpl#getDataType()
         * @generated
         */
        EEnum DATA_TYPE = eINSTANCE.getDataType();

    }

} //ModelPackage

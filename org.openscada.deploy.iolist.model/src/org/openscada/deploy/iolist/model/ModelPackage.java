/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

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
 * @see org.openscada.deploy.iolist.model.ModelFactory
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
    String eNS_URI = "http:///org/openscada/deploy/iolist/model.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.openscada.deploy.iolist.model";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelPackage eINSTANCE = org.openscada.deploy.iolist.model.impl.ModelPackageImpl.init();

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.ItemImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getItem()
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
     * The feature id for the '<em><b>Remote Bool Ack Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_BOOL_ACK_VALUE = 36;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__INPUT = 37;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__OUTPUT = 38;

    /**
     * The feature id for the '<em><b>Local Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_BOOL = 39;

    /**
     * The feature id for the '<em><b>Local Scale Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_SCALE_AVAILABLE = 40;

    /**
     * The feature id for the '<em><b>Local Scale Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_SCALE_FACTOR = 41;

    /**
     * The feature id for the '<em><b>Local Scale Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_SCALE_OFFSET = 42;

    /**
     * The feature id for the '<em><b>List Monitor Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LIST_MONITOR_PRESET = 43;

    /**
     * The feature id for the '<em><b>List Monitor List Is Alarm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LIST_MONITOR_LIST_IS_ALARM = 44;

    /**
     * The feature id for the '<em><b>List Monitor Ack Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LIST_MONITOR_ACK_REQUIRED = 45;

    /**
     * The feature id for the '<em><b>List Monitor Items</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LIST_MONITOR_ITEMS = 46;

    /**
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__DEBUG_INFORMATION = 47;

    /**
     * The feature id for the '<em><b>Local Bool Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_BOOL_AVAILABLE = 48;

    /**
     * The feature id for the '<em><b>Local Bool Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_BOOL_ACK = 49;

    /**
     * The feature id for the '<em><b>Ignore Summary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__IGNORE_SUMMARY = 50;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__BLOCK = 51;

    /**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__ENABLED = 52;

    /**
     * The feature id for the '<em><b>Hd Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__HD_STORAGE = 53;

    /**
     * The feature id for the '<em><b>Mapper</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__MAPPER = 54;

    /**
     * The number of structural features of the '<em>Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_FEATURE_COUNT = 55;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.SummaryGroupImpl <em>Summary Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.SummaryGroupImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getSummaryGroup()
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
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.SummaryItemImpl <em>Summary Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.SummaryItemImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getSummaryItem()
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
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl <em>Formula Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.FormulaItemImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getFormulaItem()
     * @generated
     */
    int FORMULA_ITEM = 3;

    /**
     * The feature id for the '<em><b>Device</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__DEVICE = ITEM__DEVICE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__NAME = ITEM__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__DATA_TYPE = ITEM__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__UNIT = ITEM__UNIT;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__ALIAS = ITEM__ALIAS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__DESCRIPTION = ITEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Default Chain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__DEFAULT_CHAIN = ITEM__DEFAULT_CHAIN;

    /**
     * The feature id for the '<em><b>Local Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_MIN = ITEM__LOCAL_MIN;

    /**
     * The feature id for the '<em><b>Local Min Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_MIN_ACK = ITEM__LOCAL_MIN_ACK;

    /**
     * The feature id for the '<em><b>Local Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_MAX = ITEM__LOCAL_MAX;

    /**
     * The feature id for the '<em><b>Local Max Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_MAX_ACK = ITEM__LOCAL_MAX_ACK;

    /**
     * The feature id for the '<em><b>Local High High Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_HIGH_HIGH_AVAILABLE = ITEM__LOCAL_HIGH_HIGH_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local High High Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_HIGH_HIGH_ACK = ITEM__LOCAL_HIGH_HIGH_ACK;

    /**
     * The feature id for the '<em><b>Local High High Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_HIGH_HIGH_PRESET = ITEM__LOCAL_HIGH_HIGH_PRESET;

    /**
     * The feature id for the '<em><b>Event Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__EVENT_COMMAND = ITEM__EVENT_COMMAND;

    /**
     * The feature id for the '<em><b>Local Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_MANUAL = ITEM__LOCAL_MANUAL;

    /**
     * The feature id for the '<em><b>Remote Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__REMOTE_MANUAL = ITEM__REMOTE_MANUAL;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__SYSTEM = ITEM__SYSTEM;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCATION = ITEM__LOCATION;

    /**
     * The feature id for the '<em><b>Component</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__COMPONENT = ITEM__COMPONENT;

    /**
     * The feature id for the '<em><b>Remote Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__REMOTE_MIN = ITEM__REMOTE_MIN;

    /**
     * The feature id for the '<em><b>Remote Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__REMOTE_MAX = ITEM__REMOTE_MAX;

    /**
     * The feature id for the '<em><b>Remote High High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__REMOTE_HIGH_HIGH = ITEM__REMOTE_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Remote High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__REMOTE_HIGH = ITEM__REMOTE_HIGH;

    /**
     * The feature id for the '<em><b>Remote Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__REMOTE_LOW = ITEM__REMOTE_LOW;

    /**
     * The feature id for the '<em><b>Remote Low Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__REMOTE_LOW_LOW = ITEM__REMOTE_LOW_LOW;

    /**
     * The feature id for the '<em><b>Local High Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_HIGH_AVAILABLE = ITEM__LOCAL_HIGH_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local High Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_HIGH_ACK = ITEM__LOCAL_HIGH_ACK;

    /**
     * The feature id for the '<em><b>Local High Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_HIGH_PRESET = ITEM__LOCAL_HIGH_PRESET;

    /**
     * The feature id for the '<em><b>Local Low Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_LOW_AVAILABLE = ITEM__LOCAL_LOW_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Low Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_LOW_ACK = ITEM__LOCAL_LOW_ACK;

    /**
     * The feature id for the '<em><b>Local Low Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_LOW_PRESET = ITEM__LOCAL_LOW_PRESET;

    /**
     * The feature id for the '<em><b>Local Low Low Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_LOW_LOW_AVAILABLE = ITEM__LOCAL_LOW_LOW_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Low Low Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_LOW_LOW_ACK = ITEM__LOCAL_LOW_LOW_ACK;

    /**
     * The feature id for the '<em><b>Local Low Low Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_LOW_LOW_PRESET = ITEM__LOCAL_LOW_LOW_PRESET;

    /**
     * The feature id for the '<em><b>Remote Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__REMOTE_BOOL = ITEM__REMOTE_BOOL;

    /**
     * The feature id for the '<em><b>Remote Bool Ack Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__REMOTE_BOOL_ACK_VALUE = ITEM__REMOTE_BOOL_ACK_VALUE;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__INPUT = ITEM__INPUT;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__OUTPUT = ITEM__OUTPUT;

    /**
     * The feature id for the '<em><b>Local Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_BOOL = ITEM__LOCAL_BOOL;

    /**
     * The feature id for the '<em><b>Local Scale Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_SCALE_AVAILABLE = ITEM__LOCAL_SCALE_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Scale Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_SCALE_FACTOR = ITEM__LOCAL_SCALE_FACTOR;

    /**
     * The feature id for the '<em><b>Local Scale Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_SCALE_OFFSET = ITEM__LOCAL_SCALE_OFFSET;

    /**
     * The feature id for the '<em><b>List Monitor Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LIST_MONITOR_PRESET = ITEM__LIST_MONITOR_PRESET;

    /**
     * The feature id for the '<em><b>List Monitor List Is Alarm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LIST_MONITOR_LIST_IS_ALARM = ITEM__LIST_MONITOR_LIST_IS_ALARM;

    /**
     * The feature id for the '<em><b>List Monitor Ack Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LIST_MONITOR_ACK_REQUIRED = ITEM__LIST_MONITOR_ACK_REQUIRED;

    /**
     * The feature id for the '<em><b>List Monitor Items</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LIST_MONITOR_ITEMS = ITEM__LIST_MONITOR_ITEMS;

    /**
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__DEBUG_INFORMATION = ITEM__DEBUG_INFORMATION;

    /**
     * The feature id for the '<em><b>Local Bool Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_BOOL_AVAILABLE = ITEM__LOCAL_BOOL_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Bool Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_BOOL_ACK = ITEM__LOCAL_BOOL_ACK;

    /**
     * The feature id for the '<em><b>Ignore Summary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__IGNORE_SUMMARY = ITEM__IGNORE_SUMMARY;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__BLOCK = ITEM__BLOCK;

    /**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__ENABLED = ITEM__ENABLED;

    /**
     * The feature id for the '<em><b>Hd Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__HD_STORAGE = ITEM__HD_STORAGE;

    /**
     * The feature id for the '<em><b>Mapper</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__MAPPER = ITEM__MAPPER;

    /**
     * The feature id for the '<em><b>Input Formula</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__INPUT_FORMULA = ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Formula</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__OUTPUT_FORMULA = ITEM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__INPUTS = ITEM_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Output Datasource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__OUTPUT_DATASOURCE_ID = ITEM_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Write Value Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__WRITE_VALUE_NAME = ITEM_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Init Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__INIT_SCRIPT = ITEM_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Output Datasource Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE = ITEM_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Script Modules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__SCRIPT_MODULES = ITEM_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Formula Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.FormulaInputImpl <em>Formula Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.FormulaInputImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getFormulaInput()
     * @generated
     */
    int FORMULA_INPUT = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INPUT__NAME = 0;

    /**
     * The feature id for the '<em><b>Datasource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INPUT__DATASOURCE_ID = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INPUT__TYPE = 2;

    /**
     * The number of structural features of the '<em>Formula Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INPUT_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.ScriptModuleImpl <em>Script Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.ScriptModuleImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptModule()
     * @generated
     */
    int SCRIPT_MODULE = 5;

    /**
     * The feature id for the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_MODULE__DATA = 0;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_MODULE__RESOURCE = 1;

    /**
     * The number of structural features of the '<em>Script Module</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_MODULE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.ModelImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getModel()
     * @generated
     */
    int MODEL = 6;

    /**
     * The feature id for the '<em><b>Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__ITEMS = 0;

    /**
     * The number of structural features of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl <em>Script Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.ScriptItemImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptItem()
     * @generated
     */
    int SCRIPT_ITEM = 7;

    /**
     * The feature id for the '<em><b>Device</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__DEVICE = ITEM__DEVICE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__NAME = ITEM__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__DATA_TYPE = ITEM__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__UNIT = ITEM__UNIT;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__ALIAS = ITEM__ALIAS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__DESCRIPTION = ITEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Default Chain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__DEFAULT_CHAIN = ITEM__DEFAULT_CHAIN;

    /**
     * The feature id for the '<em><b>Local Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_MIN = ITEM__LOCAL_MIN;

    /**
     * The feature id for the '<em><b>Local Min Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_MIN_ACK = ITEM__LOCAL_MIN_ACK;

    /**
     * The feature id for the '<em><b>Local Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_MAX = ITEM__LOCAL_MAX;

    /**
     * The feature id for the '<em><b>Local Max Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_MAX_ACK = ITEM__LOCAL_MAX_ACK;

    /**
     * The feature id for the '<em><b>Local High High Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_HIGH_HIGH_AVAILABLE = ITEM__LOCAL_HIGH_HIGH_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local High High Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_HIGH_HIGH_ACK = ITEM__LOCAL_HIGH_HIGH_ACK;

    /**
     * The feature id for the '<em><b>Local High High Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_HIGH_HIGH_PRESET = ITEM__LOCAL_HIGH_HIGH_PRESET;

    /**
     * The feature id for the '<em><b>Event Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__EVENT_COMMAND = ITEM__EVENT_COMMAND;

    /**
     * The feature id for the '<em><b>Local Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_MANUAL = ITEM__LOCAL_MANUAL;

    /**
     * The feature id for the '<em><b>Remote Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__REMOTE_MANUAL = ITEM__REMOTE_MANUAL;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__SYSTEM = ITEM__SYSTEM;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCATION = ITEM__LOCATION;

    /**
     * The feature id for the '<em><b>Component</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__COMPONENT = ITEM__COMPONENT;

    /**
     * The feature id for the '<em><b>Remote Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__REMOTE_MIN = ITEM__REMOTE_MIN;

    /**
     * The feature id for the '<em><b>Remote Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__REMOTE_MAX = ITEM__REMOTE_MAX;

    /**
     * The feature id for the '<em><b>Remote High High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__REMOTE_HIGH_HIGH = ITEM__REMOTE_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Remote High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__REMOTE_HIGH = ITEM__REMOTE_HIGH;

    /**
     * The feature id for the '<em><b>Remote Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__REMOTE_LOW = ITEM__REMOTE_LOW;

    /**
     * The feature id for the '<em><b>Remote Low Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__REMOTE_LOW_LOW = ITEM__REMOTE_LOW_LOW;

    /**
     * The feature id for the '<em><b>Local High Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_HIGH_AVAILABLE = ITEM__LOCAL_HIGH_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local High Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_HIGH_ACK = ITEM__LOCAL_HIGH_ACK;

    /**
     * The feature id for the '<em><b>Local High Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_HIGH_PRESET = ITEM__LOCAL_HIGH_PRESET;

    /**
     * The feature id for the '<em><b>Local Low Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_LOW_AVAILABLE = ITEM__LOCAL_LOW_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Low Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_LOW_ACK = ITEM__LOCAL_LOW_ACK;

    /**
     * The feature id for the '<em><b>Local Low Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_LOW_PRESET = ITEM__LOCAL_LOW_PRESET;

    /**
     * The feature id for the '<em><b>Local Low Low Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_LOW_LOW_AVAILABLE = ITEM__LOCAL_LOW_LOW_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Low Low Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_LOW_LOW_ACK = ITEM__LOCAL_LOW_LOW_ACK;

    /**
     * The feature id for the '<em><b>Local Low Low Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_LOW_LOW_PRESET = ITEM__LOCAL_LOW_LOW_PRESET;

    /**
     * The feature id for the '<em><b>Remote Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__REMOTE_BOOL = ITEM__REMOTE_BOOL;

    /**
     * The feature id for the '<em><b>Remote Bool Ack Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__REMOTE_BOOL_ACK_VALUE = ITEM__REMOTE_BOOL_ACK_VALUE;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__INPUT = ITEM__INPUT;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__OUTPUT = ITEM__OUTPUT;

    /**
     * The feature id for the '<em><b>Local Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_BOOL = ITEM__LOCAL_BOOL;

    /**
     * The feature id for the '<em><b>Local Scale Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_SCALE_AVAILABLE = ITEM__LOCAL_SCALE_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Scale Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_SCALE_FACTOR = ITEM__LOCAL_SCALE_FACTOR;

    /**
     * The feature id for the '<em><b>Local Scale Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_SCALE_OFFSET = ITEM__LOCAL_SCALE_OFFSET;

    /**
     * The feature id for the '<em><b>List Monitor Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LIST_MONITOR_PRESET = ITEM__LIST_MONITOR_PRESET;

    /**
     * The feature id for the '<em><b>List Monitor List Is Alarm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LIST_MONITOR_LIST_IS_ALARM = ITEM__LIST_MONITOR_LIST_IS_ALARM;

    /**
     * The feature id for the '<em><b>List Monitor Ack Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LIST_MONITOR_ACK_REQUIRED = ITEM__LIST_MONITOR_ACK_REQUIRED;

    /**
     * The feature id for the '<em><b>List Monitor Items</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LIST_MONITOR_ITEMS = ITEM__LIST_MONITOR_ITEMS;

    /**
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__DEBUG_INFORMATION = ITEM__DEBUG_INFORMATION;

    /**
     * The feature id for the '<em><b>Local Bool Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_BOOL_AVAILABLE = ITEM__LOCAL_BOOL_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Bool Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_BOOL_ACK = ITEM__LOCAL_BOOL_ACK;

    /**
     * The feature id for the '<em><b>Ignore Summary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__IGNORE_SUMMARY = ITEM__IGNORE_SUMMARY;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__BLOCK = ITEM__BLOCK;

    /**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__ENABLED = ITEM__ENABLED;

    /**
     * The feature id for the '<em><b>Hd Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__HD_STORAGE = ITEM__HD_STORAGE;

    /**
     * The feature id for the '<em><b>Mapper</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__MAPPER = ITEM__MAPPER;

    /**
     * The feature id for the '<em><b>Script Engine</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__SCRIPT_ENGINE = ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__INPUTS = ITEM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Init Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__INIT_SCRIPT = ITEM_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Update Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__UPDATE_SCRIPT = ITEM_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Timer Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__TIMER_SCRIPT = ITEM_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Timer Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__TIMER_PERIOD = ITEM_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__OUTPUTS = ITEM_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Write Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__WRITE_COMMAND = ITEM_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Script Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.ScriptOutputImpl <em>Script Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.ScriptOutputImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptOutput()
     * @generated
     */
    int SCRIPT_OUTPUT = 8;

    /**
     * The feature id for the '<em><b>Datasource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_OUTPUT__DATASOURCE_ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_OUTPUT__NAME = 1;

    /**
     * The number of structural features of the '<em>Script Output</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_OUTPUT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.MapperImpl <em>Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.MapperImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMapper()
     * @generated
     */
    int MAPPER = 9;

    /**
     * The feature id for the '<em><b>Mapper Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPER__MAPPER_ID = 0;

    /**
     * The feature id for the '<em><b>From Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPER__FROM_ATTRIBUTE = 1;

    /**
     * The feature id for the '<em><b>To Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPER__TO_ATTRIBUTE = 2;

    /**
     * The number of structural features of the '<em>Mapper</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPER_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.DataType
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getDataType()
     * @generated
     */
    int DATA_TYPE = 10;


    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.Item <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item</em>'.
     * @see org.openscada.deploy.iolist.model.Item
     * @generated
     */
    EClass getItem();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getDevice <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Device</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getDevice()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Device();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getName()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Name();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getDataType()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DataType();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getUnit()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Unit();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alias</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getAlias()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Alias();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getDescription()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Description();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isDefaultChain <em>Default Chain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Chain</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isDefaultChain()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DefaultChain();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalMin <em>Local Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Min</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalMin()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalMin();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalMinAck <em>Local Min Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Min Ack</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalMinAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalMinAck();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalMax <em>Local Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Max</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalMax()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalMax();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalMaxAck <em>Local Max Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Max Ack</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalMaxAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalMaxAck();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalHighHighAvailable <em>Local High High Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High High Available</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalHighHighAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighHighAvailable();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalHighHighAck <em>Local High High Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High High Ack</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalHighHighAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighHighAck();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalHighHighPreset <em>Local High High Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High High Preset</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalHighHighPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighHighPreset();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isEventCommand <em>Event Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Event Command</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isEventCommand()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_EventCommand();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalManual <em>Local Manual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Manual</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalManual()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalManual();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteManual <em>Remote Manual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Manual</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteManual()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteManual();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getSystem()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_System();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocation()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Location();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getComponent()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Component();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteMin <em>Remote Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Min</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteMin()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteMin();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteMax <em>Remote Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Max</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteMax()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteMax();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteHighHigh <em>Remote High High</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote High High</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteHighHigh()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteHighHigh();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteHigh <em>Remote High</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote High</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteHigh()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteHigh();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteLow <em>Remote Low</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Low</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteLow()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteLow();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteLowLow <em>Remote Low Low</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Low Low</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteLowLow()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteLowLow();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalHighAvailable <em>Local High Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High Available</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalHighAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighAvailable();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalHighAck <em>Local High Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High Ack</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalHighAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighAck();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalHighPreset <em>Local High Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local High Preset</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalHighPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalHighPreset();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalLowAvailable <em>Local Low Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Available</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalLowAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowAvailable();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalLowAck <em>Local Low Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Ack</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalLowAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowAck();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalLowPreset <em>Local Low Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Preset</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalLowPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowPreset();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalLowLowAvailable <em>Local Low Low Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Low Available</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalLowLowAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowLowAvailable();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalLowLowAck <em>Local Low Low Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Low Ack</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalLowLowAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowLowAck();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalLowLowPreset <em>Local Low Low Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Low Low Preset</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalLowLowPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalLowLowPreset();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteBool <em>Remote Bool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Bool</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteBool()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteBool();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getRemoteBoolAckValue <em>Remote Bool Ack Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Bool Ack Value</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getRemoteBoolAckValue()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteBoolAckValue();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isInput()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Input();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isOutput()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Output();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalBool <em>Local Bool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Bool</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalBool()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalBool();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalScaleAvailable <em>Local Scale Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Scale Available</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalScaleAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalScaleAvailable();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalScaleFactor <em>Local Scale Factor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Scale Factor</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalScaleFactor()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalScaleFactor();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalScaleOffset <em>Local Scale Offset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Scale Offset</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalScaleOffset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalScaleOffset();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isListMonitorPreset <em>List Monitor Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>List Monitor Preset</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isListMonitorPreset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_ListMonitorPreset();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isListMonitorListIsAlarm <em>List Monitor List Is Alarm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>List Monitor List Is Alarm</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isListMonitorListIsAlarm()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_ListMonitorListIsAlarm();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isListMonitorAckRequired <em>List Monitor Ack Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>List Monitor Ack Required</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isListMonitorAckRequired()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_ListMonitorAckRequired();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.deploy.iolist.model.Item#getListMonitorItems <em>List Monitor Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>List Monitor Items</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getListMonitorItems()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_ListMonitorItems();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getDebugInformation <em>Debug Information</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Debug Information</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getDebugInformation()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DebugInformation();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalBoolAvailable <em>Local Bool Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Bool Available</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalBoolAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalBoolAvailable();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalBoolAck <em>Local Bool Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Bool Ack</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalBoolAck()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalBoolAck();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isIgnoreSummary <em>Ignore Summary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ignore Summary</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isIgnoreSummary()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_IgnoreSummary();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isBlock <em>Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isBlock()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Block();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isEnabled <em>Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enabled</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isEnabled()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Enabled();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getHdStorage <em>Hd Storage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hd Storage</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getHdStorage()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_HdStorage();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.Item#getMapper <em>Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mapper</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getMapper()
     * @see #getItem()
     * @generated
     */
    EReference getItem_Mapper();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.SummaryGroup <em>Summary Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Summary Group</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup
     * @generated
     */
    EClass getSummaryGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.SummaryGroup#getItems <em>Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Items</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup#getItems()
     * @see #getSummaryGroup()
     * @generated
     */
    EReference getSummaryGroup_Items();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.SummaryGroup#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup#getId()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_Id();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.SummaryGroup#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup#getLocation()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_Location();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.SummaryGroup#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup#getComponent()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_Component();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.SummaryItem <em>Summary Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Summary Item</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryItem
     * @generated
     */
    EClass getSummaryItem();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.SummaryItem#getDataSourceId <em>Data Source Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Source Id</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryItem#getDataSourceId()
     * @see #getSummaryItem()
     * @generated
     */
    EAttribute getSummaryItem_DataSourceId();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.SummaryItem#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryItem#getType()
     * @see #getSummaryItem()
     * @generated
     */
    EAttribute getSummaryItem_Type();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.FormulaItem <em>Formula Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formula Item</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem
     * @generated
     */
    EClass getFormulaItem();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getInputFormula <em>Input Formula</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Formula</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getInputFormula()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_InputFormula();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputFormula <em>Output Formula</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Formula</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getOutputFormula()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_OutputFormula();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.FormulaItem#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inputs</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getInputs()
     * @see #getFormulaItem()
     * @generated
     */
    EReference getFormulaItem_Inputs();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceId <em>Output Datasource Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Datasource Id</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceId()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_OutputDatasourceId();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getWriteValueName <em>Write Value Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Write Value Name</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getWriteValueName()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_WriteValueName();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getInitScript <em>Init Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Init Script</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getInitScript()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_InitScript();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceType <em>Output Datasource Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Datasource Type</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceType()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_OutputDatasourceType();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.FormulaItem#getScriptModules <em>Script Modules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Script Modules</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getScriptModules()
     * @see #getFormulaItem()
     * @generated
     */
    EReference getFormulaItem_ScriptModules();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.FormulaInput <em>Formula Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formula Input</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaInput
     * @generated
     */
    EClass getFormulaInput();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaInput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaInput#getName()
     * @see #getFormulaInput()
     * @generated
     */
    EAttribute getFormulaInput_Name();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaInput#getDatasourceId <em>Datasource Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datasource Id</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaInput#getDatasourceId()
     * @see #getFormulaInput()
     * @generated
     */
    EAttribute getFormulaInput_DatasourceId();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaInput#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaInput#getType()
     * @see #getFormulaInput()
     * @generated
     */
    EAttribute getFormulaInput_Type();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.ScriptModule <em>Script Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Module</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptModule
     * @generated
     */
    EClass getScriptModule();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptModule#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptModule#getData()
     * @see #getScriptModule()
     * @generated
     */
    EAttribute getScriptModule_Data();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptModule#isResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptModule#isResource()
     * @see #getScriptModule()
     * @generated
     */
    EAttribute getScriptModule_Resource();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model</em>'.
     * @see org.openscada.deploy.iolist.model.Model
     * @generated
     */
    EClass getModel();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.Model#getItems <em>Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Items</em>'.
     * @see org.openscada.deploy.iolist.model.Model#getItems()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Items();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.ScriptItem <em>Script Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Item</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem
     * @generated
     */
    EClass getScriptItem();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getScriptEngine <em>Script Engine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script Engine</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getScriptEngine()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_ScriptEngine();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.ScriptItem#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inputs</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getInputs()
     * @see #getScriptItem()
     * @generated
     */
    EReference getScriptItem_Inputs();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getInitScript <em>Init Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Init Script</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getInitScript()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_InitScript();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getUpdateScript <em>Update Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Update Script</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getUpdateScript()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_UpdateScript();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getTimerScript <em>Timer Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timer Script</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getTimerScript()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_TimerScript();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getTimerPeriod <em>Timer Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timer Period</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getTimerPeriod()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_TimerPeriod();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.ScriptItem#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outputs</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getOutputs()
     * @see #getScriptItem()
     * @generated
     */
    EReference getScriptItem_Outputs();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getWriteCommand <em>Write Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Write Command</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getWriteCommand()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_WriteCommand();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.ScriptOutput <em>Script Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Output</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptOutput
     * @generated
     */
    EClass getScriptOutput();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptOutput#getDatasourceId <em>Datasource Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datasource Id</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptOutput#getDatasourceId()
     * @see #getScriptOutput()
     * @generated
     */
    EAttribute getScriptOutput_DatasourceId();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptOutput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptOutput#getName()
     * @see #getScriptOutput()
     * @generated
     */
    EAttribute getScriptOutput_Name();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.Mapper <em>Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapper</em>'.
     * @see org.openscada.deploy.iolist.model.Mapper
     * @generated
     */
    EClass getMapper();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Mapper#getMapperId <em>Mapper Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapper Id</em>'.
     * @see org.openscada.deploy.iolist.model.Mapper#getMapperId()
     * @see #getMapper()
     * @generated
     */
    EAttribute getMapper_MapperId();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Mapper#getFromAttribute <em>From Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From Attribute</em>'.
     * @see org.openscada.deploy.iolist.model.Mapper#getFromAttribute()
     * @see #getMapper()
     * @generated
     */
    EAttribute getMapper_FromAttribute();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Mapper#getToAttribute <em>To Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To Attribute</em>'.
     * @see org.openscada.deploy.iolist.model.Mapper#getToAttribute()
     * @see #getMapper()
     * @generated
     */
    EAttribute getMapper_ToAttribute();

    /**
     * Returns the meta object for enum '{@link org.openscada.deploy.iolist.model.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Data Type</em>'.
     * @see org.openscada.deploy.iolist.model.DataType
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
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ItemImpl <em>Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ItemImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getItem()
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
         * The meta object literal for the '<em><b>Remote Bool Ack Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_BOOL_ACK_VALUE = eINSTANCE.getItem_RemoteBoolAckValue();

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
         * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__BLOCK = eINSTANCE.getItem_Block();

        /**
         * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__ENABLED = eINSTANCE.getItem_Enabled();

        /**
         * The meta object literal for the '<em><b>Hd Storage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__HD_STORAGE = eINSTANCE.getItem_HdStorage();

        /**
         * The meta object literal for the '<em><b>Mapper</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__MAPPER = eINSTANCE.getItem_Mapper();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.SummaryGroupImpl <em>Summary Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.SummaryGroupImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getSummaryGroup()
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
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.SummaryItemImpl <em>Summary Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.SummaryItemImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getSummaryItem()
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
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl <em>Formula Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.FormulaItemImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getFormulaItem()
         * @generated
         */
        EClass FORMULA_ITEM = eINSTANCE.getFormulaItem();

        /**
         * The meta object literal for the '<em><b>Input Formula</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__INPUT_FORMULA = eINSTANCE.getFormulaItem_InputFormula();

        /**
         * The meta object literal for the '<em><b>Output Formula</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__OUTPUT_FORMULA = eINSTANCE.getFormulaItem_OutputFormula();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_ITEM__INPUTS = eINSTANCE.getFormulaItem_Inputs();

        /**
         * The meta object literal for the '<em><b>Output Datasource Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__OUTPUT_DATASOURCE_ID = eINSTANCE.getFormulaItem_OutputDatasourceId();

        /**
         * The meta object literal for the '<em><b>Write Value Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__WRITE_VALUE_NAME = eINSTANCE.getFormulaItem_WriteValueName();

        /**
         * The meta object literal for the '<em><b>Init Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__INIT_SCRIPT = eINSTANCE.getFormulaItem_InitScript();

        /**
         * The meta object literal for the '<em><b>Output Datasource Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE = eINSTANCE.getFormulaItem_OutputDatasourceType();

        /**
         * The meta object literal for the '<em><b>Script Modules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_ITEM__SCRIPT_MODULES = eINSTANCE.getFormulaItem_ScriptModules();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.FormulaInputImpl <em>Formula Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.FormulaInputImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getFormulaInput()
         * @generated
         */
        EClass FORMULA_INPUT = eINSTANCE.getFormulaInput();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_INPUT__NAME = eINSTANCE.getFormulaInput_Name();

        /**
         * The meta object literal for the '<em><b>Datasource Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_INPUT__DATASOURCE_ID = eINSTANCE.getFormulaInput_DatasourceId();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_INPUT__TYPE = eINSTANCE.getFormulaInput_Type();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ScriptModuleImpl <em>Script Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ScriptModuleImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptModule()
         * @generated
         */
        EClass SCRIPT_MODULE = eINSTANCE.getScriptModule();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_MODULE__DATA = eINSTANCE.getScriptModule_Data();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_MODULE__RESOURCE = eINSTANCE.getScriptModule_Resource();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ModelImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getModel()
         * @generated
         */
        EClass MODEL = eINSTANCE.getModel();

        /**
         * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__ITEMS = eINSTANCE.getModel_Items();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl <em>Script Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ScriptItemImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptItem()
         * @generated
         */
        EClass SCRIPT_ITEM = eINSTANCE.getScriptItem();

        /**
         * The meta object literal for the '<em><b>Script Engine</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__SCRIPT_ENGINE = eINSTANCE.getScriptItem_ScriptEngine();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT_ITEM__INPUTS = eINSTANCE.getScriptItem_Inputs();

        /**
         * The meta object literal for the '<em><b>Init Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__INIT_SCRIPT = eINSTANCE.getScriptItem_InitScript();

        /**
         * The meta object literal for the '<em><b>Update Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__UPDATE_SCRIPT = eINSTANCE.getScriptItem_UpdateScript();

        /**
         * The meta object literal for the '<em><b>Timer Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__TIMER_SCRIPT = eINSTANCE.getScriptItem_TimerScript();

        /**
         * The meta object literal for the '<em><b>Timer Period</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__TIMER_PERIOD = eINSTANCE.getScriptItem_TimerPeriod();

        /**
         * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT_ITEM__OUTPUTS = eINSTANCE.getScriptItem_Outputs();

        /**
         * The meta object literal for the '<em><b>Write Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__WRITE_COMMAND = eINSTANCE.getScriptItem_WriteCommand();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ScriptOutputImpl <em>Script Output</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ScriptOutputImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptOutput()
         * @generated
         */
        EClass SCRIPT_OUTPUT = eINSTANCE.getScriptOutput();

        /**
         * The meta object literal for the '<em><b>Datasource Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_OUTPUT__DATASOURCE_ID = eINSTANCE.getScriptOutput_DatasourceId();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_OUTPUT__NAME = eINSTANCE.getScriptOutput_Name();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.MapperImpl <em>Mapper</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.MapperImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMapper()
         * @generated
         */
        EClass MAPPER = eINSTANCE.getMapper();

        /**
         * The meta object literal for the '<em><b>Mapper Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPER__MAPPER_ID = eINSTANCE.getMapper_MapperId();

        /**
         * The meta object literal for the '<em><b>From Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPER__FROM_ATTRIBUTE = eINSTANCE.getMapper_FromAttribute();

        /**
         * The meta object literal for the '<em><b>To Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPER__TO_ATTRIBUTE = eINSTANCE.getMapper_ToAttribute();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.DataType <em>Data Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.DataType
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getDataType()
         * @generated
         */
        EEnum DATA_TYPE = eINSTANCE.getDataType();

    }

} //ModelPackage

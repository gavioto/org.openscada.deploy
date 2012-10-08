/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
    ModelPackage eINSTANCE = org.openscada.deploy.iolist.model.impl.ModelPackageImpl.init ();

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
     * The feature id for the '<em><b>Event Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__EVENT_COMMAND = 7;

    /**
     * The feature id for the '<em><b>Local Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_MANUAL = 8;

    /**
     * The feature id for the '<em><b>Remote Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_MANUAL = 9;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__SYSTEM = 10;

    /**
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__HIERARCHY = 11;

    /**
     * The feature id for the '<em><b>Remote Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_MIN = 12;

    /**
     * The feature id for the '<em><b>Remote Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_MAX = 13;

    /**
     * The feature id for the '<em><b>Remote High High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_HIGH_HIGH = 14;

    /**
     * The feature id for the '<em><b>Remote High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_HIGH = 15;

    /**
     * The feature id for the '<em><b>Remote Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_LOW = 16;

    /**
     * The feature id for the '<em><b>Remote Low Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_LOW_LOW = 17;

    /**
     * The feature id for the '<em><b>Remote Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_BOOL = 18;

    /**
     * The feature id for the '<em><b>Remote Bool Ack Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__REMOTE_BOOL_ACK_VALUE = 19;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__INPUT = 20;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__OUTPUT = 21;

    /**
     * The feature id for the '<em><b>Local Scale Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_SCALE_AVAILABLE = 22;

    /**
     * The feature id for the '<em><b>Local Scale Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_SCALE_FACTOR = 23;

    /**
     * The feature id for the '<em><b>Local Scale Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_SCALE_OFFSET = 24;

    /**
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__DEBUG_INFORMATION = 25;

    /**
     * The feature id for the '<em><b>Ignore Summary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__IGNORE_SUMMARY = 26;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__BLOCK = 27;

    /**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__ENABLED = 28;

    /**
     * The feature id for the '<em><b>Hd Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__HD_STORAGE = 29;

    /**
     * The feature id for the '<em><b>Mapper</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__MAPPER = 30;

    /**
     * The feature id for the '<em><b>Simulation Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__SIMULATION_VALUE = 31;

    /**
     * The feature id for the '<em><b>Rounding Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__ROUNDING_AVAILABLE = 32;

    /**
     * The feature id for the '<em><b>Rounding Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__ROUNDING_VALUE = 33;

    /**
     * The feature id for the '<em><b>Local High High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_HIGH_HIGH = 34;

    /**
     * The feature id for the '<em><b>Local High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_HIGH = 35;

    /**
     * The feature id for the '<em><b>Local Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_LOW = 36;

    /**
     * The feature id for the '<em><b>Local Low Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_LOW_LOW = 37;

    /**
     * The feature id for the '<em><b>Local Min</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_MIN = 38;

    /**
     * The feature id for the '<em><b>Local Max</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_MAX = 39;

    /**
     * The feature id for the '<em><b>Local List Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_LIST_MONITOR = 40;

    /**
     * The feature id for the '<em><b>Local Boolean Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__LOCAL_BOOLEAN_MONITOR = 41;

    /**
     * The feature id for the '<em><b>Default Monitor Demote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__DEFAULT_MONITOR_DEMOTE = 42;

    /**
     * The number of structural features of the '<em>Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_FEATURE_COUNT = 43;

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
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP__ID = 0;

    /**
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP__HIERARCHY = 1;

    /**
     * The feature id for the '<em><b>Data Source Ids</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP__DATA_SOURCE_IDS = 2;

    /**
     * The feature id for the '<em><b>Retain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP__RETAIN = 3;

    /**
     * The number of structural features of the '<em>Summary Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUMMARY_GROUP_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl <em>Formula Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.FormulaItemImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getFormulaItem()
     * @generated
     */
    int FORMULA_ITEM = 2;

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
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__HIERARCHY = ITEM__HIERARCHY;

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
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__DEBUG_INFORMATION = ITEM__DEBUG_INFORMATION;

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
     * The feature id for the '<em><b>Simulation Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__SIMULATION_VALUE = ITEM__SIMULATION_VALUE;

    /**
     * The feature id for the '<em><b>Rounding Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__ROUNDING_AVAILABLE = ITEM__ROUNDING_AVAILABLE;

    /**
     * The feature id for the '<em><b>Rounding Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__ROUNDING_VALUE = ITEM__ROUNDING_VALUE;

    /**
     * The feature id for the '<em><b>Local High High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_HIGH_HIGH = ITEM__LOCAL_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Local High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_HIGH = ITEM__LOCAL_HIGH;

    /**
     * The feature id for the '<em><b>Local Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_LOW = ITEM__LOCAL_LOW;

    /**
     * The feature id for the '<em><b>Local Low Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_LOW_LOW = ITEM__LOCAL_LOW_LOW;

    /**
     * The feature id for the '<em><b>Local Min</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_MIN = ITEM__LOCAL_MIN;

    /**
     * The feature id for the '<em><b>Local Max</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_MAX = ITEM__LOCAL_MAX;

    /**
     * The feature id for the '<em><b>Local List Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_LIST_MONITOR = ITEM__LOCAL_LIST_MONITOR;

    /**
     * The feature id for the '<em><b>Local Boolean Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__LOCAL_BOOLEAN_MONITOR = ITEM__LOCAL_BOOLEAN_MONITOR;

    /**
     * The feature id for the '<em><b>Default Monitor Demote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ITEM__DEFAULT_MONITOR_DEMOTE = ITEM__DEFAULT_MONITOR_DEMOTE;

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
    int FORMULA_INPUT = 3;

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
    int SCRIPT_MODULE = 4;

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
    int MODEL = 5;

    /**
     * The feature id for the '<em><b>Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__ITEMS = 0;

    /**
     * The feature id for the '<em><b>Averages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__AVERAGES = 1;

    /**
     * The feature id for the '<em><b>Moving Averages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__MOVING_AVERAGES = 2;

    /**
     * The feature id for the '<em><b>Summaries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__SUMMARIES = 3;

    /**
     * The number of structural features of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl <em>Script Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.ScriptItemImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptItem()
     * @generated
     */
    int SCRIPT_ITEM = 6;

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
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__HIERARCHY = ITEM__HIERARCHY;

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
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__DEBUG_INFORMATION = ITEM__DEBUG_INFORMATION;

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
     * The feature id for the '<em><b>Simulation Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__SIMULATION_VALUE = ITEM__SIMULATION_VALUE;

    /**
     * The feature id for the '<em><b>Rounding Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__ROUNDING_AVAILABLE = ITEM__ROUNDING_AVAILABLE;

    /**
     * The feature id for the '<em><b>Rounding Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__ROUNDING_VALUE = ITEM__ROUNDING_VALUE;

    /**
     * The feature id for the '<em><b>Local High High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_HIGH_HIGH = ITEM__LOCAL_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Local High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_HIGH = ITEM__LOCAL_HIGH;

    /**
     * The feature id for the '<em><b>Local Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_LOW = ITEM__LOCAL_LOW;

    /**
     * The feature id for the '<em><b>Local Low Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_LOW_LOW = ITEM__LOCAL_LOW_LOW;

    /**
     * The feature id for the '<em><b>Local Min</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_MIN = ITEM__LOCAL_MIN;

    /**
     * The feature id for the '<em><b>Local Max</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_MAX = ITEM__LOCAL_MAX;

    /**
     * The feature id for the '<em><b>Local List Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_LIST_MONITOR = ITEM__LOCAL_LIST_MONITOR;

    /**
     * The feature id for the '<em><b>Local Boolean Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__LOCAL_BOOLEAN_MONITOR = ITEM__LOCAL_BOOLEAN_MONITOR;

    /**
     * The feature id for the '<em><b>Default Monitor Demote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_ITEM__DEFAULT_MONITOR_DEMOTE = ITEM__DEFAULT_MONITOR_DEMOTE;

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
    int SCRIPT_OUTPUT = 7;

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
    int MAPPER = 8;

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
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.MonitorImpl <em>Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.MonitorImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMonitor()
     * @generated
     */
    int MONITOR = 9;

    /**
     * The feature id for the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITOR__ACTIVE = 0;

    /**
     * The number of structural features of the '<em>Monitor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITOR_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.BasicMonitorImpl <em>Basic Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.BasicMonitorImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getBasicMonitor()
     * @generated
     */
    int BASIC_MONITOR = 19;

    /**
     * The feature id for the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_MONITOR__ACTIVE = MONITOR__ACTIVE;

    /**
     * The feature id for the '<em><b>Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_MONITOR__ACK = MONITOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_MONITOR__SEVERITY = MONITOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Basic Monitor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_MONITOR_FEATURE_COUNT = MONITOR_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.LevelMonitorImpl <em>Level Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.LevelMonitorImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getLevelMonitor()
     * @generated
     */
    int LEVEL_MONITOR = 10;

    /**
     * The feature id for the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_MONITOR__ACTIVE = BASIC_MONITOR__ACTIVE;

    /**
     * The feature id for the '<em><b>Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_MONITOR__ACK = BASIC_MONITOR__ACK;

    /**
     * The feature id for the '<em><b>Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_MONITOR__SEVERITY = BASIC_MONITOR__SEVERITY;

    /**
     * The feature id for the '<em><b>Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_MONITOR__PRESET = BASIC_MONITOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Level Monitor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_MONITOR_FEATURE_COUNT = BASIC_MONITOR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.ListMonitorImpl <em>List Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.ListMonitorImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getListMonitor()
     * @generated
     */
    int LIST_MONITOR = 11;

    /**
     * The feature id for the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_MONITOR__ACTIVE = MONITOR__ACTIVE;

    /**
     * The feature id for the '<em><b>Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_MONITOR__ENTRIES = MONITOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_MONITOR__DEFAULT_ACK = MONITOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Default Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_MONITOR__DEFAULT_SEVERITY = MONITOR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>List Monitor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_MONITOR_FEATURE_COUNT = MONITOR_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.BooleanMonitorImpl <em>Boolean Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.BooleanMonitorImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getBooleanMonitor()
     * @generated
     */
    int BOOLEAN_MONITOR = 12;

    /**
     * The feature id for the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_MONITOR__ACTIVE = BASIC_MONITOR__ACTIVE;

    /**
     * The feature id for the '<em><b>Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_MONITOR__ACK = BASIC_MONITOR__ACK;

    /**
     * The feature id for the '<em><b>Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_MONITOR__SEVERITY = BASIC_MONITOR__SEVERITY;

    /**
     * The feature id for the '<em><b>Ok Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_MONITOR__OK_VALUE = BASIC_MONITOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Boolean Monitor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_MONITOR_FEATURE_COUNT = BASIC_MONITOR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.AverageImpl <em>Average</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.AverageImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getAverage()
     * @generated
     */
    int AVERAGE = 13;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE__ID = 0;

    /**
     * The feature id for the '<em><b>Sources</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE__SOURCES = 1;

    /**
     * The feature id for the '<em><b>Percent Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE__PERCENT_REQUIRED = 2;

    /**
     * The number of structural features of the '<em>Average</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.AverageItemImpl <em>Average Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.AverageItemImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getAverageItem()
     * @generated
     */
    int AVERAGE_ITEM = 14;

    /**
     * The feature id for the '<em><b>Device</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__DEVICE = ITEM__DEVICE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__NAME = ITEM__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__DATA_TYPE = ITEM__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__UNIT = ITEM__UNIT;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__ALIAS = ITEM__ALIAS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__DESCRIPTION = ITEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Default Chain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__DEFAULT_CHAIN = ITEM__DEFAULT_CHAIN;

    /**
     * The feature id for the '<em><b>Event Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__EVENT_COMMAND = ITEM__EVENT_COMMAND;

    /**
     * The feature id for the '<em><b>Local Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_MANUAL = ITEM__LOCAL_MANUAL;

    /**
     * The feature id for the '<em><b>Remote Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__REMOTE_MANUAL = ITEM__REMOTE_MANUAL;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__SYSTEM = ITEM__SYSTEM;

    /**
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__HIERARCHY = ITEM__HIERARCHY;

    /**
     * The feature id for the '<em><b>Remote Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__REMOTE_MIN = ITEM__REMOTE_MIN;

    /**
     * The feature id for the '<em><b>Remote Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__REMOTE_MAX = ITEM__REMOTE_MAX;

    /**
     * The feature id for the '<em><b>Remote High High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__REMOTE_HIGH_HIGH = ITEM__REMOTE_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Remote High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__REMOTE_HIGH = ITEM__REMOTE_HIGH;

    /**
     * The feature id for the '<em><b>Remote Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__REMOTE_LOW = ITEM__REMOTE_LOW;

    /**
     * The feature id for the '<em><b>Remote Low Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__REMOTE_LOW_LOW = ITEM__REMOTE_LOW_LOW;

    /**
     * The feature id for the '<em><b>Remote Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__REMOTE_BOOL = ITEM__REMOTE_BOOL;

    /**
     * The feature id for the '<em><b>Remote Bool Ack Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__REMOTE_BOOL_ACK_VALUE = ITEM__REMOTE_BOOL_ACK_VALUE;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__INPUT = ITEM__INPUT;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__OUTPUT = ITEM__OUTPUT;

    /**
     * The feature id for the '<em><b>Local Scale Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_SCALE_AVAILABLE = ITEM__LOCAL_SCALE_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Scale Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_SCALE_FACTOR = ITEM__LOCAL_SCALE_FACTOR;

    /**
     * The feature id for the '<em><b>Local Scale Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_SCALE_OFFSET = ITEM__LOCAL_SCALE_OFFSET;

    /**
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__DEBUG_INFORMATION = ITEM__DEBUG_INFORMATION;

    /**
     * The feature id for the '<em><b>Ignore Summary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__IGNORE_SUMMARY = ITEM__IGNORE_SUMMARY;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__BLOCK = ITEM__BLOCK;

    /**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__ENABLED = ITEM__ENABLED;

    /**
     * The feature id for the '<em><b>Hd Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__HD_STORAGE = ITEM__HD_STORAGE;

    /**
     * The feature id for the '<em><b>Mapper</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__MAPPER = ITEM__MAPPER;

    /**
     * The feature id for the '<em><b>Simulation Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__SIMULATION_VALUE = ITEM__SIMULATION_VALUE;

    /**
     * The feature id for the '<em><b>Rounding Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__ROUNDING_AVAILABLE = ITEM__ROUNDING_AVAILABLE;

    /**
     * The feature id for the '<em><b>Rounding Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__ROUNDING_VALUE = ITEM__ROUNDING_VALUE;

    /**
     * The feature id for the '<em><b>Local High High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_HIGH_HIGH = ITEM__LOCAL_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Local High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_HIGH = ITEM__LOCAL_HIGH;

    /**
     * The feature id for the '<em><b>Local Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_LOW = ITEM__LOCAL_LOW;

    /**
     * The feature id for the '<em><b>Local Low Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_LOW_LOW = ITEM__LOCAL_LOW_LOW;

    /**
     * The feature id for the '<em><b>Local Min</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_MIN = ITEM__LOCAL_MIN;

    /**
     * The feature id for the '<em><b>Local Max</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_MAX = ITEM__LOCAL_MAX;

    /**
     * The feature id for the '<em><b>Local List Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_LIST_MONITOR = ITEM__LOCAL_LIST_MONITOR;

    /**
     * The feature id for the '<em><b>Local Boolean Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__LOCAL_BOOLEAN_MONITOR = ITEM__LOCAL_BOOLEAN_MONITOR;

    /**
     * The feature id for the '<em><b>Default Monitor Demote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__DEFAULT_MONITOR_DEMOTE = ITEM__DEFAULT_MONITOR_DEMOTE;

    /**
     * The feature id for the '<em><b>Average</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__AVERAGE = ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM__TYPE = ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Average Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVERAGE_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.ConstantItemImpl <em>Constant Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.ConstantItemImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getConstantItem()
     * @generated
     */
    int CONSTANT_ITEM = 15;

    /**
     * The feature id for the '<em><b>Device</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__DEVICE = ITEM__DEVICE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__NAME = ITEM__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__DATA_TYPE = ITEM__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__UNIT = ITEM__UNIT;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__ALIAS = ITEM__ALIAS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__DESCRIPTION = ITEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Default Chain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__DEFAULT_CHAIN = ITEM__DEFAULT_CHAIN;

    /**
     * The feature id for the '<em><b>Event Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__EVENT_COMMAND = ITEM__EVENT_COMMAND;

    /**
     * The feature id for the '<em><b>Local Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_MANUAL = ITEM__LOCAL_MANUAL;

    /**
     * The feature id for the '<em><b>Remote Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__REMOTE_MANUAL = ITEM__REMOTE_MANUAL;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__SYSTEM = ITEM__SYSTEM;

    /**
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__HIERARCHY = ITEM__HIERARCHY;

    /**
     * The feature id for the '<em><b>Remote Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__REMOTE_MIN = ITEM__REMOTE_MIN;

    /**
     * The feature id for the '<em><b>Remote Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__REMOTE_MAX = ITEM__REMOTE_MAX;

    /**
     * The feature id for the '<em><b>Remote High High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__REMOTE_HIGH_HIGH = ITEM__REMOTE_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Remote High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__REMOTE_HIGH = ITEM__REMOTE_HIGH;

    /**
     * The feature id for the '<em><b>Remote Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__REMOTE_LOW = ITEM__REMOTE_LOW;

    /**
     * The feature id for the '<em><b>Remote Low Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__REMOTE_LOW_LOW = ITEM__REMOTE_LOW_LOW;

    /**
     * The feature id for the '<em><b>Remote Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__REMOTE_BOOL = ITEM__REMOTE_BOOL;

    /**
     * The feature id for the '<em><b>Remote Bool Ack Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__REMOTE_BOOL_ACK_VALUE = ITEM__REMOTE_BOOL_ACK_VALUE;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__INPUT = ITEM__INPUT;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__OUTPUT = ITEM__OUTPUT;

    /**
     * The feature id for the '<em><b>Local Scale Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_SCALE_AVAILABLE = ITEM__LOCAL_SCALE_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Scale Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_SCALE_FACTOR = ITEM__LOCAL_SCALE_FACTOR;

    /**
     * The feature id for the '<em><b>Local Scale Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_SCALE_OFFSET = ITEM__LOCAL_SCALE_OFFSET;

    /**
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__DEBUG_INFORMATION = ITEM__DEBUG_INFORMATION;

    /**
     * The feature id for the '<em><b>Ignore Summary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__IGNORE_SUMMARY = ITEM__IGNORE_SUMMARY;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__BLOCK = ITEM__BLOCK;

    /**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__ENABLED = ITEM__ENABLED;

    /**
     * The feature id for the '<em><b>Hd Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__HD_STORAGE = ITEM__HD_STORAGE;

    /**
     * The feature id for the '<em><b>Mapper</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__MAPPER = ITEM__MAPPER;

    /**
     * The feature id for the '<em><b>Simulation Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__SIMULATION_VALUE = ITEM__SIMULATION_VALUE;

    /**
     * The feature id for the '<em><b>Rounding Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__ROUNDING_AVAILABLE = ITEM__ROUNDING_AVAILABLE;

    /**
     * The feature id for the '<em><b>Rounding Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__ROUNDING_VALUE = ITEM__ROUNDING_VALUE;

    /**
     * The feature id for the '<em><b>Local High High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_HIGH_HIGH = ITEM__LOCAL_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Local High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_HIGH = ITEM__LOCAL_HIGH;

    /**
     * The feature id for the '<em><b>Local Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_LOW = ITEM__LOCAL_LOW;

    /**
     * The feature id for the '<em><b>Local Low Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_LOW_LOW = ITEM__LOCAL_LOW_LOW;

    /**
     * The feature id for the '<em><b>Local Min</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_MIN = ITEM__LOCAL_MIN;

    /**
     * The feature id for the '<em><b>Local Max</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_MAX = ITEM__LOCAL_MAX;

    /**
     * The feature id for the '<em><b>Local List Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_LIST_MONITOR = ITEM__LOCAL_LIST_MONITOR;

    /**
     * The feature id for the '<em><b>Local Boolean Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__LOCAL_BOOLEAN_MONITOR = ITEM__LOCAL_BOOLEAN_MONITOR;

    /**
     * The feature id for the '<em><b>Default Monitor Demote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM__DEFAULT_MONITOR_DEMOTE = ITEM__DEFAULT_MONITOR_DEMOTE;

    /**
     * The number of structural features of the '<em>Constant Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.MovingAverageItemImpl <em>Moving Average Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.MovingAverageItemImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMovingAverageItem()
     * @generated
     */
    int MOVING_AVERAGE_ITEM = 16;

    /**
     * The feature id for the '<em><b>Device</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__DEVICE = ITEM__DEVICE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__NAME = ITEM__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__DATA_TYPE = ITEM__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__UNIT = ITEM__UNIT;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__ALIAS = ITEM__ALIAS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__DESCRIPTION = ITEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Default Chain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__DEFAULT_CHAIN = ITEM__DEFAULT_CHAIN;

    /**
     * The feature id for the '<em><b>Event Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__EVENT_COMMAND = ITEM__EVENT_COMMAND;

    /**
     * The feature id for the '<em><b>Local Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_MANUAL = ITEM__LOCAL_MANUAL;

    /**
     * The feature id for the '<em><b>Remote Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__REMOTE_MANUAL = ITEM__REMOTE_MANUAL;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__SYSTEM = ITEM__SYSTEM;

    /**
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__HIERARCHY = ITEM__HIERARCHY;

    /**
     * The feature id for the '<em><b>Remote Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__REMOTE_MIN = ITEM__REMOTE_MIN;

    /**
     * The feature id for the '<em><b>Remote Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__REMOTE_MAX = ITEM__REMOTE_MAX;

    /**
     * The feature id for the '<em><b>Remote High High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__REMOTE_HIGH_HIGH = ITEM__REMOTE_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Remote High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__REMOTE_HIGH = ITEM__REMOTE_HIGH;

    /**
     * The feature id for the '<em><b>Remote Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__REMOTE_LOW = ITEM__REMOTE_LOW;

    /**
     * The feature id for the '<em><b>Remote Low Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__REMOTE_LOW_LOW = ITEM__REMOTE_LOW_LOW;

    /**
     * The feature id for the '<em><b>Remote Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__REMOTE_BOOL = ITEM__REMOTE_BOOL;

    /**
     * The feature id for the '<em><b>Remote Bool Ack Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__REMOTE_BOOL_ACK_VALUE = ITEM__REMOTE_BOOL_ACK_VALUE;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__INPUT = ITEM__INPUT;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__OUTPUT = ITEM__OUTPUT;

    /**
     * The feature id for the '<em><b>Local Scale Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_SCALE_AVAILABLE = ITEM__LOCAL_SCALE_AVAILABLE;

    /**
     * The feature id for the '<em><b>Local Scale Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_SCALE_FACTOR = ITEM__LOCAL_SCALE_FACTOR;

    /**
     * The feature id for the '<em><b>Local Scale Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_SCALE_OFFSET = ITEM__LOCAL_SCALE_OFFSET;

    /**
     * The feature id for the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__DEBUG_INFORMATION = ITEM__DEBUG_INFORMATION;

    /**
     * The feature id for the '<em><b>Ignore Summary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__IGNORE_SUMMARY = ITEM__IGNORE_SUMMARY;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__BLOCK = ITEM__BLOCK;

    /**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__ENABLED = ITEM__ENABLED;

    /**
     * The feature id for the '<em><b>Hd Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__HD_STORAGE = ITEM__HD_STORAGE;

    /**
     * The feature id for the '<em><b>Mapper</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__MAPPER = ITEM__MAPPER;

    /**
     * The feature id for the '<em><b>Simulation Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__SIMULATION_VALUE = ITEM__SIMULATION_VALUE;

    /**
     * The feature id for the '<em><b>Rounding Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__ROUNDING_AVAILABLE = ITEM__ROUNDING_AVAILABLE;

    /**
     * The feature id for the '<em><b>Rounding Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__ROUNDING_VALUE = ITEM__ROUNDING_VALUE;

    /**
     * The feature id for the '<em><b>Local High High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_HIGH_HIGH = ITEM__LOCAL_HIGH_HIGH;

    /**
     * The feature id for the '<em><b>Local High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_HIGH = ITEM__LOCAL_HIGH;

    /**
     * The feature id for the '<em><b>Local Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_LOW = ITEM__LOCAL_LOW;

    /**
     * The feature id for the '<em><b>Local Low Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_LOW_LOW = ITEM__LOCAL_LOW_LOW;

    /**
     * The feature id for the '<em><b>Local Min</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_MIN = ITEM__LOCAL_MIN;

    /**
     * The feature id for the '<em><b>Local Max</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_MAX = ITEM__LOCAL_MAX;

    /**
     * The feature id for the '<em><b>Local List Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_LIST_MONITOR = ITEM__LOCAL_LIST_MONITOR;

    /**
     * The feature id for the '<em><b>Local Boolean Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__LOCAL_BOOLEAN_MONITOR = ITEM__LOCAL_BOOLEAN_MONITOR;

    /**
     * The feature id for the '<em><b>Default Monitor Demote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__DEFAULT_MONITOR_DEMOTE = ITEM__DEFAULT_MONITOR_DEMOTE;

    /**
     * The feature id for the '<em><b>Average</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__AVERAGE = ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM__TYPE = ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Moving Average Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.MovingAverageImpl <em>Moving Average</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.MovingAverageImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMovingAverage()
     * @generated
     */
    int MOVING_AVERAGE = 17;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE__ID = 0;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE__SOURCE = 1;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE__TRIGGER = 2;

    /**
     * The feature id for the '<em><b>Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE__RANGE = 3;

    /**
     * The feature id for the '<em><b>Null Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE__NULL_RANGE = 4;

    /**
     * The number of structural features of the '<em>Moving Average</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVING_AVERAGE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.impl.ListMonitorEntryImpl <em>List Monitor Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.impl.ListMonitorEntryImpl
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getListMonitorEntry()
     * @generated
     */
    int LIST_MONITOR_ENTRY = 18;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_MONITOR_ENTRY__VALUE = 0;

    /**
     * The feature id for the '<em><b>Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_MONITOR_ENTRY__SEVERITY = 1;

    /**
     * The feature id for the '<em><b>Require Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_MONITOR_ENTRY__REQUIRE_ACK = 2;

    /**
     * The number of structural features of the '<em>List Monitor Entry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_MONITOR_ENTRY_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.DataType
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getDataType()
     * @generated
     */
    int DATA_TYPE = 20;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.Rounding <em>Rounding</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.Rounding
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getRounding()
     * @generated
     */
    int ROUNDING = 21;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.AverageReferenceType <em>Average Reference Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.AverageReferenceType
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getAverageReferenceType()
     * @generated
     */
    int AVERAGE_REFERENCE_TYPE = 22;

    /**
     * The meta object id for the '{@link org.openscada.deploy.iolist.model.MovingAverageReferenceType <em>Moving Average Reference Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.MovingAverageReferenceType
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMovingAverageReferenceType()
     * @generated
     */
    int MOVING_AVERAGE_REFERENCE_TYPE = 23;

    /**
     * The meta object id for the '<em>List Severity</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getListSeverity()
     * @generated
     */
    int LIST_SEVERITY = 25;

    /**
     * The meta object id for the '<em>Severity</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.ae.Severity
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getSeverity()
     * @generated
     */
    int SEVERITY = 26;

    /**
     * The meta object id for the '<em>Variant</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.core.Variant
     * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getVariant()
     * @generated
     */
    int VARIANT = 24;

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.Item <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item</em>'.
     * @see org.openscada.deploy.iolist.model.Item
     * @generated
     */
    EClass getItem ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getDevice <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Device</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getDevice()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Device ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getName()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Name ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getDataType()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DataType ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getUnit()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Unit ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alias</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getAlias()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Alias ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getDescription()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Description ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isDefaultChain <em>Default Chain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Chain</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isDefaultChain()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DefaultChain ();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.deploy.iolist.model.Item#getLocalMin <em>Local Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local Min</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalMin()
     * @see #getItem()
     * @generated
     */
    EReference getItem_LocalMin ();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.deploy.iolist.model.Item#getLocalMax <em>Local Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local Max</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalMax()
     * @see #getItem()
     * @generated
     */
    EReference getItem_LocalMax ();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.deploy.iolist.model.Item#getLocalListMonitor <em>Local List Monitor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local List Monitor</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalListMonitor()
     * @see #getItem()
     * @generated
     */
    EReference getItem_LocalListMonitor ();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.deploy.iolist.model.Item#getLocalBooleanMonitor <em>Local Boolean Monitor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local Boolean Monitor</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalBooleanMonitor()
     * @see #getItem()
     * @generated
     */
    EReference getItem_LocalBooleanMonitor ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getDefaultMonitorDemote <em>Default Monitor Demote</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Monitor Demote</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getDefaultMonitorDemote()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DefaultMonitorDemote ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isEventCommand <em>Event Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Event Command</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isEventCommand()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_EventCommand ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalManual <em>Local Manual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Manual</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalManual()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalManual ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteManual <em>Remote Manual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Manual</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteManual()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteManual ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getSystem()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_System ();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.deploy.iolist.model.Item#getHierarchy <em>Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Hierarchy</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getHierarchy()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Hierarchy ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteMin <em>Remote Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Min</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteMin()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteMin ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteMax <em>Remote Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Max</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteMax()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteMax ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteHighHigh <em>Remote High High</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote High High</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteHighHigh()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteHighHigh ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteHigh <em>Remote High</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote High</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteHigh()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteHigh ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteLow <em>Remote Low</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Low</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteLow()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteLow ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteLowLow <em>Remote Low Low</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Low Low</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteLowLow()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteLowLow ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRemoteBool <em>Remote Bool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Bool</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRemoteBool()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteBool ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getRemoteBoolAckValue <em>Remote Bool Ack Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Bool Ack Value</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getRemoteBoolAckValue()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RemoteBoolAckValue ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isInput()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Input ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isOutput()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Output ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isLocalScaleAvailable <em>Local Scale Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Scale Available</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isLocalScaleAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalScaleAvailable ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalScaleFactor <em>Local Scale Factor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Scale Factor</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalScaleFactor()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalScaleFactor ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getLocalScaleOffset <em>Local Scale Offset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Scale Offset</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalScaleOffset()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_LocalScaleOffset ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getDebugInformation <em>Debug Information</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Debug Information</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getDebugInformation()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_DebugInformation ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isIgnoreSummary <em>Ignore Summary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ignore Summary</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isIgnoreSummary()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_IgnoreSummary ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isBlock <em>Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isBlock()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Block ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isEnabled <em>Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enabled</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isEnabled()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Enabled ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getHdStorage <em>Hd Storage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hd Storage</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getHdStorage()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_HdStorage ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.Item#getMapper <em>Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mapper</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getMapper()
     * @see #getItem()
     * @generated
     */
    EReference getItem_Mapper ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getSimulationValue <em>Simulation Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Simulation Value</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getSimulationValue()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_SimulationValue ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#isRoundingAvailable <em>Rounding Available</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rounding Available</em>'.
     * @see org.openscada.deploy.iolist.model.Item#isRoundingAvailable()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RoundingAvailable ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Item#getRoundingValue <em>Rounding Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rounding Value</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getRoundingValue()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_RoundingValue ();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.deploy.iolist.model.Item#getLocalHighHigh <em>Local High High</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local High High</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalHighHigh()
     * @see #getItem()
     * @generated
     */
    EReference getItem_LocalHighHigh ();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.deploy.iolist.model.Item#getLocalHigh <em>Local High</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local High</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalHigh()
     * @see #getItem()
     * @generated
     */
    EReference getItem_LocalHigh ();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.deploy.iolist.model.Item#getLocalLow <em>Local Low</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local Low</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalLow()
     * @see #getItem()
     * @generated
     */
    EReference getItem_LocalLow ();

    /**
     * Returns the meta object for the containment reference '{@link org.openscada.deploy.iolist.model.Item#getLocalLowLow <em>Local Low Low</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local Low Low</em>'.
     * @see org.openscada.deploy.iolist.model.Item#getLocalLowLow()
     * @see #getItem()
     * @generated
     */
    EReference getItem_LocalLowLow ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.SummaryGroup <em>Summary Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Summary Group</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup
     * @generated
     */
    EClass getSummaryGroup ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.SummaryGroup#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup#getId()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_Id ();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.deploy.iolist.model.SummaryGroup#getHierarchy <em>Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Hierarchy</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup#getHierarchy()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_Hierarchy ();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.deploy.iolist.model.SummaryGroup#getDataSourceIds <em>Data Source Ids</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Data Source Ids</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup#getDataSourceIds()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_DataSourceIds ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.SummaryGroup#isRetain <em>Retain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Retain</em>'.
     * @see org.openscada.deploy.iolist.model.SummaryGroup#isRetain()
     * @see #getSummaryGroup()
     * @generated
     */
    EAttribute getSummaryGroup_Retain ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.FormulaItem <em>Formula Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formula Item</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem
     * @generated
     */
    EClass getFormulaItem ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getInputFormula <em>Input Formula</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Formula</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getInputFormula()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_InputFormula ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputFormula <em>Output Formula</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Formula</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getOutputFormula()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_OutputFormula ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.FormulaItem#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inputs</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getInputs()
     * @see #getFormulaItem()
     * @generated
     */
    EReference getFormulaItem_Inputs ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceId <em>Output Datasource Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Datasource Id</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceId()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_OutputDatasourceId ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getWriteValueName <em>Write Value Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Write Value Name</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getWriteValueName()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_WriteValueName ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getInitScript <em>Init Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Init Script</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getInitScript()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_InitScript ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceType <em>Output Datasource Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Datasource Type</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceType()
     * @see #getFormulaItem()
     * @generated
     */
    EAttribute getFormulaItem_OutputDatasourceType ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.FormulaItem#getScriptModules <em>Script Modules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Script Modules</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaItem#getScriptModules()
     * @see #getFormulaItem()
     * @generated
     */
    EReference getFormulaItem_ScriptModules ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.FormulaInput <em>Formula Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formula Input</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaInput
     * @generated
     */
    EClass getFormulaInput ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaInput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaInput#getName()
     * @see #getFormulaInput()
     * @generated
     */
    EAttribute getFormulaInput_Name ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaInput#getDatasourceId <em>Datasource Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datasource Id</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaInput#getDatasourceId()
     * @see #getFormulaInput()
     * @generated
     */
    EAttribute getFormulaInput_DatasourceId ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.FormulaInput#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.openscada.deploy.iolist.model.FormulaInput#getType()
     * @see #getFormulaInput()
     * @generated
     */
    EAttribute getFormulaInput_Type ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.ScriptModule <em>Script Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Module</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptModule
     * @generated
     */
    EClass getScriptModule ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptModule#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptModule#getData()
     * @see #getScriptModule()
     * @generated
     */
    EAttribute getScriptModule_Data ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptModule#isResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptModule#isResource()
     * @see #getScriptModule()
     * @generated
     */
    EAttribute getScriptModule_Resource ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model</em>'.
     * @see org.openscada.deploy.iolist.model.Model
     * @generated
     */
    EClass getModel ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.Model#getItems <em>Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Items</em>'.
     * @see org.openscada.deploy.iolist.model.Model#getItems()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Items ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.Model#getAverages <em>Averages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Averages</em>'.
     * @see org.openscada.deploy.iolist.model.Model#getAverages()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Averages ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.Model#getMovingAverages <em>Moving Averages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Moving Averages</em>'.
     * @see org.openscada.deploy.iolist.model.Model#getMovingAverages()
     * @see #getModel()
     * @generated
     */
    EReference getModel_MovingAverages ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.Model#getSummaries <em>Summaries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Summaries</em>'.
     * @see org.openscada.deploy.iolist.model.Model#getSummaries()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Summaries ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.ScriptItem <em>Script Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Item</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem
     * @generated
     */
    EClass getScriptItem ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getScriptEngine <em>Script Engine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script Engine</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getScriptEngine()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_ScriptEngine ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.ScriptItem#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inputs</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getInputs()
     * @see #getScriptItem()
     * @generated
     */
    EReference getScriptItem_Inputs ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getInitScript <em>Init Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Init Script</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getInitScript()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_InitScript ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getUpdateScript <em>Update Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Update Script</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getUpdateScript()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_UpdateScript ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getTimerScript <em>Timer Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timer Script</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getTimerScript()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_TimerScript ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getTimerPeriod <em>Timer Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timer Period</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getTimerPeriod()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_TimerPeriod ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.ScriptItem#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outputs</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getOutputs()
     * @see #getScriptItem()
     * @generated
     */
    EReference getScriptItem_Outputs ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptItem#getWriteCommand <em>Write Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Write Command</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptItem#getWriteCommand()
     * @see #getScriptItem()
     * @generated
     */
    EAttribute getScriptItem_WriteCommand ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.ScriptOutput <em>Script Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Output</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptOutput
     * @generated
     */
    EClass getScriptOutput ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptOutput#getDatasourceId <em>Datasource Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datasource Id</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptOutput#getDatasourceId()
     * @see #getScriptOutput()
     * @generated
     */
    EAttribute getScriptOutput_DatasourceId ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ScriptOutput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.openscada.deploy.iolist.model.ScriptOutput#getName()
     * @see #getScriptOutput()
     * @generated
     */
    EAttribute getScriptOutput_Name ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.Mapper <em>Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapper</em>'.
     * @see org.openscada.deploy.iolist.model.Mapper
     * @generated
     */
    EClass getMapper ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Mapper#getMapperId <em>Mapper Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapper Id</em>'.
     * @see org.openscada.deploy.iolist.model.Mapper#getMapperId()
     * @see #getMapper()
     * @generated
     */
    EAttribute getMapper_MapperId ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Mapper#getFromAttribute <em>From Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From Attribute</em>'.
     * @see org.openscada.deploy.iolist.model.Mapper#getFromAttribute()
     * @see #getMapper()
     * @generated
     */
    EAttribute getMapper_FromAttribute ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Mapper#getToAttribute <em>To Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To Attribute</em>'.
     * @see org.openscada.deploy.iolist.model.Mapper#getToAttribute()
     * @see #getMapper()
     * @generated
     */
    EAttribute getMapper_ToAttribute ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.Monitor <em>Monitor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Monitor</em>'.
     * @see org.openscada.deploy.iolist.model.Monitor
     * @generated
     */
    EClass getMonitor ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Monitor#isActive <em>Active</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Active</em>'.
     * @see org.openscada.deploy.iolist.model.Monitor#isActive()
     * @see #getMonitor()
     * @generated
     */
    EAttribute getMonitor_Active ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.LevelMonitor <em>Level Monitor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Level Monitor</em>'.
     * @see org.openscada.deploy.iolist.model.LevelMonitor
     * @generated
     */
    EClass getLevelMonitor ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.LevelMonitor#getPreset <em>Preset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Preset</em>'.
     * @see org.openscada.deploy.iolist.model.LevelMonitor#getPreset()
     * @see #getLevelMonitor()
     * @generated
     */
    EAttribute getLevelMonitor_Preset ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.ListMonitor <em>List Monitor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>List Monitor</em>'.
     * @see org.openscada.deploy.iolist.model.ListMonitor
     * @generated
     */
    EClass getListMonitor ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.deploy.iolist.model.ListMonitor#getEntries <em>Entries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entries</em>'.
     * @see org.openscada.deploy.iolist.model.ListMonitor#getEntries()
     * @see #getListMonitor()
     * @generated
     */
    EReference getListMonitor_Entries ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ListMonitor#isDefaultAck <em>Default Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Ack</em>'.
     * @see org.openscada.deploy.iolist.model.ListMonitor#isDefaultAck()
     * @see #getListMonitor()
     * @generated
     */
    EAttribute getListMonitor_DefaultAck ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ListMonitor#getDefaultSeverity <em>Default Severity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Severity</em>'.
     * @see org.openscada.deploy.iolist.model.ListMonitor#getDefaultSeverity()
     * @see #getListMonitor()
     * @generated
     */
    EAttribute getListMonitor_DefaultSeverity ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.BooleanMonitor <em>Boolean Monitor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Monitor</em>'.
     * @see org.openscada.deploy.iolist.model.BooleanMonitor
     * @generated
     */
    EClass getBooleanMonitor ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.BooleanMonitor#isOkValue <em>Ok Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ok Value</em>'.
     * @see org.openscada.deploy.iolist.model.BooleanMonitor#isOkValue()
     * @see #getBooleanMonitor()
     * @generated
     */
    EAttribute getBooleanMonitor_OkValue ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.Average <em>Average</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Average</em>'.
     * @see org.openscada.deploy.iolist.model.Average
     * @generated
     */
    EClass getAverage ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Average#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.openscada.deploy.iolist.model.Average#getId()
     * @see #getAverage()
     * @generated
     */
    EAttribute getAverage_Id ();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.deploy.iolist.model.Average#getSources <em>Sources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Sources</em>'.
     * @see org.openscada.deploy.iolist.model.Average#getSources()
     * @see #getAverage()
     * @generated
     */
    EAttribute getAverage_Sources ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.Average#getPercentRequired <em>Percent Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Percent Required</em>'.
     * @see org.openscada.deploy.iolist.model.Average#getPercentRequired()
     * @see #getAverage()
     * @generated
     */
    EAttribute getAverage_PercentRequired ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.AverageItem <em>Average Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Average Item</em>'.
     * @see org.openscada.deploy.iolist.model.AverageItem
     * @generated
     */
    EClass getAverageItem ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.deploy.iolist.model.AverageItem#getAverage <em>Average</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Average</em>'.
     * @see org.openscada.deploy.iolist.model.AverageItem#getAverage()
     * @see #getAverageItem()
     * @generated
     */
    EReference getAverageItem_Average ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.AverageItem#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.openscada.deploy.iolist.model.AverageItem#getType()
     * @see #getAverageItem()
     * @generated
     */
    EAttribute getAverageItem_Type ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.ConstantItem <em>Constant Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constant Item</em>'.
     * @see org.openscada.deploy.iolist.model.ConstantItem
     * @generated
     */
    EClass getConstantItem ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.MovingAverageItem <em>Moving Average Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Moving Average Item</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverageItem
     * @generated
     */
    EClass getMovingAverageItem ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.deploy.iolist.model.MovingAverageItem#getAverage <em>Average</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Average</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverageItem#getAverage()
     * @see #getMovingAverageItem()
     * @generated
     */
    EReference getMovingAverageItem_Average ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.MovingAverageItem#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverageItem#getType()
     * @see #getMovingAverageItem()
     * @generated
     */
    EAttribute getMovingAverageItem_Type ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.MovingAverage <em>Moving Average</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Moving Average</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverage
     * @generated
     */
    EClass getMovingAverage ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.MovingAverage#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverage#getId()
     * @see #getMovingAverage()
     * @generated
     */
    EAttribute getMovingAverage_Id ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.MovingAverage#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverage#getSource()
     * @see #getMovingAverage()
     * @generated
     */
    EAttribute getMovingAverage_Source ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.MovingAverage#getTrigger <em>Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trigger</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverage#getTrigger()
     * @see #getMovingAverage()
     * @generated
     */
    EAttribute getMovingAverage_Trigger ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.MovingAverage#getRange <em>Range</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Range</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverage#getRange()
     * @see #getMovingAverage()
     * @generated
     */
    EAttribute getMovingAverage_Range ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.MovingAverage#getNullRange <em>Null Range</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Null Range</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverage#getNullRange()
     * @see #getMovingAverage()
     * @generated
     */
    EAttribute getMovingAverage_NullRange ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.ListMonitorEntry <em>List Monitor Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>List Monitor Entry</em>'.
     * @see org.openscada.deploy.iolist.model.ListMonitorEntry
     * @generated
     */
    EClass getListMonitorEntry ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ListMonitorEntry#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.openscada.deploy.iolist.model.ListMonitorEntry#getValue()
     * @see #getListMonitorEntry()
     * @generated
     */
    EAttribute getListMonitorEntry_Value ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ListMonitorEntry#getSeverity <em>Severity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Severity</em>'.
     * @see org.openscada.deploy.iolist.model.ListMonitorEntry#getSeverity()
     * @see #getListMonitorEntry()
     * @generated
     */
    EAttribute getListMonitorEntry_Severity ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.ListMonitorEntry#getRequireAck <em>Require Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Require Ack</em>'.
     * @see org.openscada.deploy.iolist.model.ListMonitorEntry#getRequireAck()
     * @see #getListMonitorEntry()
     * @generated
     */
    EAttribute getListMonitorEntry_RequireAck ();

    /**
     * Returns the meta object for class '{@link org.openscada.deploy.iolist.model.BasicMonitor <em>Basic Monitor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Monitor</em>'.
     * @see org.openscada.deploy.iolist.model.BasicMonitor
     * @generated
     */
    EClass getBasicMonitor ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.BasicMonitor#isAck <em>Ack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ack</em>'.
     * @see org.openscada.deploy.iolist.model.BasicMonitor#isAck()
     * @see #getBasicMonitor()
     * @generated
     */
    EAttribute getBasicMonitor_Ack ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.deploy.iolist.model.BasicMonitor#getSeverity <em>Severity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Severity</em>'.
     * @see org.openscada.deploy.iolist.model.BasicMonitor#getSeverity()
     * @see #getBasicMonitor()
     * @generated
     */
    EAttribute getBasicMonitor_Severity ();

    /**
     * Returns the meta object for enum '{@link org.openscada.deploy.iolist.model.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Data Type</em>'.
     * @see org.openscada.deploy.iolist.model.DataType
     * @generated
     */
    EEnum getDataType ();

    /**
     * Returns the meta object for enum '{@link org.openscada.deploy.iolist.model.Rounding <em>Rounding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Rounding</em>'.
     * @see org.openscada.deploy.iolist.model.Rounding
     * @generated
     */
    EEnum getRounding ();

    /**
     * Returns the meta object for enum '{@link org.openscada.deploy.iolist.model.AverageReferenceType <em>Average Reference Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Average Reference Type</em>'.
     * @see org.openscada.deploy.iolist.model.AverageReferenceType
     * @generated
     */
    EEnum getAverageReferenceType ();

    /**
     * Returns the meta object for enum '{@link org.openscada.deploy.iolist.model.MovingAverageReferenceType <em>Moving Average Reference Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Moving Average Reference Type</em>'.
     * @see org.openscada.deploy.iolist.model.MovingAverageReferenceType
     * @generated
     */
    EEnum getMovingAverageReferenceType ();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>List Severity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>List Severity</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="enumeration='OK INFORMATION WARNING ALARM ERROR'"
     * @generated
     */
    EDataType getListSeverity ();

    /**
     * Returns the meta object for data type '{@link org.openscada.ae.Severity <em>Severity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Severity</em>'.
     * @see org.openscada.ae.Severity
     * @model instanceClass="org.openscada.ae.Severity"
     *        extendedMetaData="enumeration='INFORMATION WARNING ALARM ERROR'"
     * @generated
     */
    EDataType getSeverity ();

    /**
     * Returns the meta object for data type '{@link org.openscada.core.Variant <em>Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Variant</em>'.
     * @see org.openscada.core.Variant
     * @model instanceClass="org.openscada.core.Variant"
     * @generated
     */
    EDataType getVariant ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelFactory getModelFactory ();

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
        EClass ITEM = eINSTANCE.getItem ();

        /**
         * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DEVICE = eINSTANCE.getItem_Device ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__NAME = eINSTANCE.getItem_Name ();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DATA_TYPE = eINSTANCE.getItem_DataType ();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__UNIT = eINSTANCE.getItem_Unit ();

        /**
         * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__ALIAS = eINSTANCE.getItem_Alias ();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DESCRIPTION = eINSTANCE.getItem_Description ();

        /**
         * The meta object literal for the '<em><b>Default Chain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DEFAULT_CHAIN = eINSTANCE.getItem_DefaultChain ();

        /**
         * The meta object literal for the '<em><b>Local Min</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__LOCAL_MIN = eINSTANCE.getItem_LocalMin ();

        /**
         * The meta object literal for the '<em><b>Local Max</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__LOCAL_MAX = eINSTANCE.getItem_LocalMax ();

        /**
         * The meta object literal for the '<em><b>Local List Monitor</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__LOCAL_LIST_MONITOR = eINSTANCE.getItem_LocalListMonitor ();

        /**
         * The meta object literal for the '<em><b>Local Boolean Monitor</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__LOCAL_BOOLEAN_MONITOR = eINSTANCE.getItem_LocalBooleanMonitor ();

        /**
         * The meta object literal for the '<em><b>Default Monitor Demote</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DEFAULT_MONITOR_DEMOTE = eINSTANCE.getItem_DefaultMonitorDemote ();

        /**
         * The meta object literal for the '<em><b>Event Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__EVENT_COMMAND = eINSTANCE.getItem_EventCommand ();

        /**
         * The meta object literal for the '<em><b>Local Manual</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_MANUAL = eINSTANCE.getItem_LocalManual ();

        /**
         * The meta object literal for the '<em><b>Remote Manual</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_MANUAL = eINSTANCE.getItem_RemoteManual ();

        /**
         * The meta object literal for the '<em><b>System</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__SYSTEM = eINSTANCE.getItem_System ();

        /**
         * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__HIERARCHY = eINSTANCE.getItem_Hierarchy ();

        /**
         * The meta object literal for the '<em><b>Remote Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_MIN = eINSTANCE.getItem_RemoteMin ();

        /**
         * The meta object literal for the '<em><b>Remote Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_MAX = eINSTANCE.getItem_RemoteMax ();

        /**
         * The meta object literal for the '<em><b>Remote High High</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_HIGH_HIGH = eINSTANCE.getItem_RemoteHighHigh ();

        /**
         * The meta object literal for the '<em><b>Remote High</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_HIGH = eINSTANCE.getItem_RemoteHigh ();

        /**
         * The meta object literal for the '<em><b>Remote Low</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_LOW = eINSTANCE.getItem_RemoteLow ();

        /**
         * The meta object literal for the '<em><b>Remote Low Low</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_LOW_LOW = eINSTANCE.getItem_RemoteLowLow ();

        /**
         * The meta object literal for the '<em><b>Remote Bool</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_BOOL = eINSTANCE.getItem_RemoteBool ();

        /**
         * The meta object literal for the '<em><b>Remote Bool Ack Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__REMOTE_BOOL_ACK_VALUE = eINSTANCE.getItem_RemoteBoolAckValue ();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__INPUT = eINSTANCE.getItem_Input ();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__OUTPUT = eINSTANCE.getItem_Output ();

        /**
         * The meta object literal for the '<em><b>Local Scale Available</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_SCALE_AVAILABLE = eINSTANCE.getItem_LocalScaleAvailable ();

        /**
         * The meta object literal for the '<em><b>Local Scale Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_SCALE_FACTOR = eINSTANCE.getItem_LocalScaleFactor ();

        /**
         * The meta object literal for the '<em><b>Local Scale Offset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__LOCAL_SCALE_OFFSET = eINSTANCE.getItem_LocalScaleOffset ();

        /**
         * The meta object literal for the '<em><b>Debug Information</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__DEBUG_INFORMATION = eINSTANCE.getItem_DebugInformation ();

        /**
         * The meta object literal for the '<em><b>Ignore Summary</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__IGNORE_SUMMARY = eINSTANCE.getItem_IgnoreSummary ();

        /**
         * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__BLOCK = eINSTANCE.getItem_Block ();

        /**
         * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__ENABLED = eINSTANCE.getItem_Enabled ();

        /**
         * The meta object literal for the '<em><b>Hd Storage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__HD_STORAGE = eINSTANCE.getItem_HdStorage ();

        /**
         * The meta object literal for the '<em><b>Mapper</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__MAPPER = eINSTANCE.getItem_Mapper ();

        /**
         * The meta object literal for the '<em><b>Simulation Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__SIMULATION_VALUE = eINSTANCE.getItem_SimulationValue ();

        /**
         * The meta object literal for the '<em><b>Rounding Available</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__ROUNDING_AVAILABLE = eINSTANCE.getItem_RoundingAvailable ();

        /**
         * The meta object literal for the '<em><b>Rounding Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__ROUNDING_VALUE = eINSTANCE.getItem_RoundingValue ();

        /**
         * The meta object literal for the '<em><b>Local High High</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__LOCAL_HIGH_HIGH = eINSTANCE.getItem_LocalHighHigh ();

        /**
         * The meta object literal for the '<em><b>Local High</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__LOCAL_HIGH = eINSTANCE.getItem_LocalHigh ();

        /**
         * The meta object literal for the '<em><b>Local Low</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__LOCAL_LOW = eINSTANCE.getItem_LocalLow ();

        /**
         * The meta object literal for the '<em><b>Local Low Low</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__LOCAL_LOW_LOW = eINSTANCE.getItem_LocalLowLow ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.SummaryGroupImpl <em>Summary Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.SummaryGroupImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getSummaryGroup()
         * @generated
         */
        EClass SUMMARY_GROUP = eINSTANCE.getSummaryGroup ();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUMMARY_GROUP__ID = eINSTANCE.getSummaryGroup_Id ();

        /**
         * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUMMARY_GROUP__HIERARCHY = eINSTANCE.getSummaryGroup_Hierarchy ();

        /**
         * The meta object literal for the '<em><b>Data Source Ids</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUMMARY_GROUP__DATA_SOURCE_IDS = eINSTANCE.getSummaryGroup_DataSourceIds ();

        /**
         * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUMMARY_GROUP__RETAIN = eINSTANCE.getSummaryGroup_Retain ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl <em>Formula Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.FormulaItemImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getFormulaItem()
         * @generated
         */
        EClass FORMULA_ITEM = eINSTANCE.getFormulaItem ();

        /**
         * The meta object literal for the '<em><b>Input Formula</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__INPUT_FORMULA = eINSTANCE.getFormulaItem_InputFormula ();

        /**
         * The meta object literal for the '<em><b>Output Formula</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__OUTPUT_FORMULA = eINSTANCE.getFormulaItem_OutputFormula ();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_ITEM__INPUTS = eINSTANCE.getFormulaItem_Inputs ();

        /**
         * The meta object literal for the '<em><b>Output Datasource Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__OUTPUT_DATASOURCE_ID = eINSTANCE.getFormulaItem_OutputDatasourceId ();

        /**
         * The meta object literal for the '<em><b>Write Value Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__WRITE_VALUE_NAME = eINSTANCE.getFormulaItem_WriteValueName ();

        /**
         * The meta object literal for the '<em><b>Init Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__INIT_SCRIPT = eINSTANCE.getFormulaItem_InitScript ();

        /**
         * The meta object literal for the '<em><b>Output Datasource Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE = eINSTANCE.getFormulaItem_OutputDatasourceType ();

        /**
         * The meta object literal for the '<em><b>Script Modules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_ITEM__SCRIPT_MODULES = eINSTANCE.getFormulaItem_ScriptModules ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.FormulaInputImpl <em>Formula Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.FormulaInputImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getFormulaInput()
         * @generated
         */
        EClass FORMULA_INPUT = eINSTANCE.getFormulaInput ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_INPUT__NAME = eINSTANCE.getFormulaInput_Name ();

        /**
         * The meta object literal for the '<em><b>Datasource Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_INPUT__DATASOURCE_ID = eINSTANCE.getFormulaInput_DatasourceId ();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_INPUT__TYPE = eINSTANCE.getFormulaInput_Type ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ScriptModuleImpl <em>Script Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ScriptModuleImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptModule()
         * @generated
         */
        EClass SCRIPT_MODULE = eINSTANCE.getScriptModule ();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_MODULE__DATA = eINSTANCE.getScriptModule_Data ();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_MODULE__RESOURCE = eINSTANCE.getScriptModule_Resource ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ModelImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getModel()
         * @generated
         */
        EClass MODEL = eINSTANCE.getModel ();

        /**
         * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__ITEMS = eINSTANCE.getModel_Items ();

        /**
         * The meta object literal for the '<em><b>Averages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__AVERAGES = eINSTANCE.getModel_Averages ();

        /**
         * The meta object literal for the '<em><b>Moving Averages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__MOVING_AVERAGES = eINSTANCE.getModel_MovingAverages ();

        /**
         * The meta object literal for the '<em><b>Summaries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__SUMMARIES = eINSTANCE.getModel_Summaries ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl <em>Script Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ScriptItemImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptItem()
         * @generated
         */
        EClass SCRIPT_ITEM = eINSTANCE.getScriptItem ();

        /**
         * The meta object literal for the '<em><b>Script Engine</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__SCRIPT_ENGINE = eINSTANCE.getScriptItem_ScriptEngine ();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT_ITEM__INPUTS = eINSTANCE.getScriptItem_Inputs ();

        /**
         * The meta object literal for the '<em><b>Init Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__INIT_SCRIPT = eINSTANCE.getScriptItem_InitScript ();

        /**
         * The meta object literal for the '<em><b>Update Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__UPDATE_SCRIPT = eINSTANCE.getScriptItem_UpdateScript ();

        /**
         * The meta object literal for the '<em><b>Timer Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__TIMER_SCRIPT = eINSTANCE.getScriptItem_TimerScript ();

        /**
         * The meta object literal for the '<em><b>Timer Period</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__TIMER_PERIOD = eINSTANCE.getScriptItem_TimerPeriod ();

        /**
         * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT_ITEM__OUTPUTS = eINSTANCE.getScriptItem_Outputs ();

        /**
         * The meta object literal for the '<em><b>Write Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_ITEM__WRITE_COMMAND = eINSTANCE.getScriptItem_WriteCommand ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ScriptOutputImpl <em>Script Output</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ScriptOutputImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getScriptOutput()
         * @generated
         */
        EClass SCRIPT_OUTPUT = eINSTANCE.getScriptOutput ();

        /**
         * The meta object literal for the '<em><b>Datasource Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_OUTPUT__DATASOURCE_ID = eINSTANCE.getScriptOutput_DatasourceId ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_OUTPUT__NAME = eINSTANCE.getScriptOutput_Name ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.MapperImpl <em>Mapper</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.MapperImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMapper()
         * @generated
         */
        EClass MAPPER = eINSTANCE.getMapper ();

        /**
         * The meta object literal for the '<em><b>Mapper Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPER__MAPPER_ID = eINSTANCE.getMapper_MapperId ();

        /**
         * The meta object literal for the '<em><b>From Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPER__FROM_ATTRIBUTE = eINSTANCE.getMapper_FromAttribute ();

        /**
         * The meta object literal for the '<em><b>To Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPER__TO_ATTRIBUTE = eINSTANCE.getMapper_ToAttribute ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.MonitorImpl <em>Monitor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.MonitorImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMonitor()
         * @generated
         */
        EClass MONITOR = eINSTANCE.getMonitor ();

        /**
         * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MONITOR__ACTIVE = eINSTANCE.getMonitor_Active ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.LevelMonitorImpl <em>Level Monitor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.LevelMonitorImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getLevelMonitor()
         * @generated
         */
        EClass LEVEL_MONITOR = eINSTANCE.getLevelMonitor ();

        /**
         * The meta object literal for the '<em><b>Preset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LEVEL_MONITOR__PRESET = eINSTANCE.getLevelMonitor_Preset ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ListMonitorImpl <em>List Monitor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ListMonitorImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getListMonitor()
         * @generated
         */
        EClass LIST_MONITOR = eINSTANCE.getListMonitor ();

        /**
         * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIST_MONITOR__ENTRIES = eINSTANCE.getListMonitor_Entries ();

        /**
         * The meta object literal for the '<em><b>Default Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIST_MONITOR__DEFAULT_ACK = eINSTANCE.getListMonitor_DefaultAck ();

        /**
         * The meta object literal for the '<em><b>Default Severity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIST_MONITOR__DEFAULT_SEVERITY = eINSTANCE.getListMonitor_DefaultSeverity ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.BooleanMonitorImpl <em>Boolean Monitor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.BooleanMonitorImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getBooleanMonitor()
         * @generated
         */
        EClass BOOLEAN_MONITOR = eINSTANCE.getBooleanMonitor ();

        /**
         * The meta object literal for the '<em><b>Ok Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOLEAN_MONITOR__OK_VALUE = eINSTANCE.getBooleanMonitor_OkValue ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.AverageImpl <em>Average</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.AverageImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getAverage()
         * @generated
         */
        EClass AVERAGE = eINSTANCE.getAverage ();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AVERAGE__ID = eINSTANCE.getAverage_Id ();

        /**
         * The meta object literal for the '<em><b>Sources</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AVERAGE__SOURCES = eINSTANCE.getAverage_Sources ();

        /**
         * The meta object literal for the '<em><b>Percent Required</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AVERAGE__PERCENT_REQUIRED = eINSTANCE.getAverage_PercentRequired ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.AverageItemImpl <em>Average Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.AverageItemImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getAverageItem()
         * @generated
         */
        EClass AVERAGE_ITEM = eINSTANCE.getAverageItem ();

        /**
         * The meta object literal for the '<em><b>Average</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AVERAGE_ITEM__AVERAGE = eINSTANCE.getAverageItem_Average ();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AVERAGE_ITEM__TYPE = eINSTANCE.getAverageItem_Type ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ConstantItemImpl <em>Constant Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ConstantItemImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getConstantItem()
         * @generated
         */
        EClass CONSTANT_ITEM = eINSTANCE.getConstantItem ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.MovingAverageItemImpl <em>Moving Average Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.MovingAverageItemImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMovingAverageItem()
         * @generated
         */
        EClass MOVING_AVERAGE_ITEM = eINSTANCE.getMovingAverageItem ();

        /**
         * The meta object literal for the '<em><b>Average</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MOVING_AVERAGE_ITEM__AVERAGE = eINSTANCE.getMovingAverageItem_Average ();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVING_AVERAGE_ITEM__TYPE = eINSTANCE.getMovingAverageItem_Type ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.MovingAverageImpl <em>Moving Average</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.MovingAverageImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMovingAverage()
         * @generated
         */
        EClass MOVING_AVERAGE = eINSTANCE.getMovingAverage ();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVING_AVERAGE__ID = eINSTANCE.getMovingAverage_Id ();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVING_AVERAGE__SOURCE = eINSTANCE.getMovingAverage_Source ();

        /**
         * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVING_AVERAGE__TRIGGER = eINSTANCE.getMovingAverage_Trigger ();

        /**
         * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVING_AVERAGE__RANGE = eINSTANCE.getMovingAverage_Range ();

        /**
         * The meta object literal for the '<em><b>Null Range</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVING_AVERAGE__NULL_RANGE = eINSTANCE.getMovingAverage_NullRange ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.ListMonitorEntryImpl <em>List Monitor Entry</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.ListMonitorEntryImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getListMonitorEntry()
         * @generated
         */
        EClass LIST_MONITOR_ENTRY = eINSTANCE.getListMonitorEntry ();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIST_MONITOR_ENTRY__VALUE = eINSTANCE.getListMonitorEntry_Value ();

        /**
         * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIST_MONITOR_ENTRY__SEVERITY = eINSTANCE.getListMonitorEntry_Severity ();

        /**
         * The meta object literal for the '<em><b>Require Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIST_MONITOR_ENTRY__REQUIRE_ACK = eINSTANCE.getListMonitorEntry_RequireAck ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.impl.BasicMonitorImpl <em>Basic Monitor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.impl.BasicMonitorImpl
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getBasicMonitor()
         * @generated
         */
        EClass BASIC_MONITOR = eINSTANCE.getBasicMonitor ();

        /**
         * The meta object literal for the '<em><b>Ack</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_MONITOR__ACK = eINSTANCE.getBasicMonitor_Ack ();

        /**
         * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_MONITOR__SEVERITY = eINSTANCE.getBasicMonitor_Severity ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.DataType <em>Data Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.DataType
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getDataType()
         * @generated
         */
        EEnum DATA_TYPE = eINSTANCE.getDataType ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.Rounding <em>Rounding</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.Rounding
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getRounding()
         * @generated
         */
        EEnum ROUNDING = eINSTANCE.getRounding ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.AverageReferenceType <em>Average Reference Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.AverageReferenceType
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getAverageReferenceType()
         * @generated
         */
        EEnum AVERAGE_REFERENCE_TYPE = eINSTANCE.getAverageReferenceType ();

        /**
         * The meta object literal for the '{@link org.openscada.deploy.iolist.model.MovingAverageReferenceType <em>Moving Average Reference Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.deploy.iolist.model.MovingAverageReferenceType
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getMovingAverageReferenceType()
         * @generated
         */
        EEnum MOVING_AVERAGE_REFERENCE_TYPE = eINSTANCE.getMovingAverageReferenceType ();

        /**
         * The meta object literal for the '<em>List Severity</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getListSeverity()
         * @generated
         */
        EDataType LIST_SEVERITY = eINSTANCE.getListSeverity ();

        /**
         * The meta object literal for the '<em>Severity</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.ae.Severity
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getSeverity()
         * @generated
         */
        EDataType SEVERITY = eINSTANCE.getSeverity ();

        /**
         * The meta object literal for the '<em>Variant</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.core.Variant
         * @see org.openscada.deploy.iolist.model.impl.ModelPackageImpl#getVariant()
         * @generated
         */
        EDataType VARIANT = eINSTANCE.getVariant ();

    }

} //ModelPackage

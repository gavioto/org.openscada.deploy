/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.deploy.iolist.model.BooleanMonitor;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.LevelMonitor;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.Rounding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isDefaultChain <em>Default Chain</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isEventCommand <em>Event Command</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalManual <em>Local Manual</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteManual <em>Remote Manual</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteMin <em>Remote Min</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteMax <em>Remote Max</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteHighHigh <em>Remote High High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteHigh <em>Remote High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteLow <em>Remote Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteLowLow <em>Remote Low Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteBool <em>Remote Bool</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getRemoteBoolAckValue <em>Remote Bool Ack Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isInput <em>Input</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalScaleAvailable <em>Local Scale Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalScaleFactor <em>Local Scale Factor</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalScaleOffset <em>Local Scale Offset</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getDebugInformation <em>Debug Information</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isIgnoreSummary <em>Ignore Summary</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isBlock <em>Block</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getHdStorage <em>Hd Storage</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getMapper <em>Mapper</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getSimulationValue <em>Simulation Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRoundingAvailable <em>Rounding Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getRoundingValue <em>Rounding Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalHighHigh <em>Local High High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalHigh <em>Local High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalLow <em>Local Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalLowLow <em>Local Low Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalMin <em>Local Min</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalMax <em>Local Max</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalListMonitor <em>Local List Monitor</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalBooleanMonitor <em>Local Boolean Monitor</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getDefaultMonitorDemote <em>Default Monitor Demote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends EObjectImpl implements Item
{
    /**
     * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDevice()
     * @generated
     * @ordered
     */
    protected static final String DEVICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDevice()
     * @generated
     * @ordered
     */
    protected String device = DEVICE_EDEFAULT;

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
     * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected static final DataType DATA_TYPE_EDEFAULT = DataType.VARIANT;

    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected DataType dataType = DATA_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected static final String UNIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected String unit = UNIT_EDEFAULT;

    /**
     * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected static final String ALIAS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected String alias = ALIAS_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #isDefaultChain() <em>Default Chain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDefaultChain()
     * @generated
     * @ordered
     */
    protected static final boolean DEFAULT_CHAIN_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isDefaultChain() <em>Default Chain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDefaultChain()
     * @generated
     * @ordered
     */
    protected boolean defaultChain = DEFAULT_CHAIN_EDEFAULT;

    /**
     * The default value of the '{@link #isEventCommand() <em>Event Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEventCommand()
     * @generated
     * @ordered
     */
    protected static final boolean EVENT_COMMAND_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isEventCommand() <em>Event Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEventCommand()
     * @generated
     * @ordered
     */
    protected boolean eventCommand = EVENT_COMMAND_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalManual() <em>Local Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalManual()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_MANUAL_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isLocalManual() <em>Local Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalManual()
     * @generated
     * @ordered
     */
    protected boolean localManual = LOCAL_MANUAL_EDEFAULT;

    /**
     * The default value of the '{@link #isRemoteManual() <em>Remote Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteManual()
     * @generated
     * @ordered
     */
    protected static final boolean REMOTE_MANUAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRemoteManual() <em>Remote Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteManual()
     * @generated
     * @ordered
     */
    protected boolean remoteManual = REMOTE_MANUAL_EDEFAULT;

    /**
     * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSystem()
     * @generated
     * @ordered
     */
    protected static final String SYSTEM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSystem()
     * @generated
     * @ordered
     */
    protected String system = SYSTEM_EDEFAULT;

    /**
     * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHierarchy()
     * @generated
     * @ordered
     */
    protected EList<String> hierarchy;

    /**
     * The default value of the '{@link #isRemoteMin() <em>Remote Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteMin()
     * @generated
     * @ordered
     */
    protected static final boolean REMOTE_MIN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRemoteMin() <em>Remote Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteMin()
     * @generated
     * @ordered
     */
    protected boolean remoteMin = REMOTE_MIN_EDEFAULT;

    /**
     * The default value of the '{@link #isRemoteMax() <em>Remote Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteMax()
     * @generated
     * @ordered
     */
    protected static final boolean REMOTE_MAX_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRemoteMax() <em>Remote Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteMax()
     * @generated
     * @ordered
     */
    protected boolean remoteMax = REMOTE_MAX_EDEFAULT;

    /**
     * The default value of the '{@link #isRemoteHighHigh() <em>Remote High High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteHighHigh()
     * @generated
     * @ordered
     */
    protected static final boolean REMOTE_HIGH_HIGH_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRemoteHighHigh() <em>Remote High High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteHighHigh()
     * @generated
     * @ordered
     */
    protected boolean remoteHighHigh = REMOTE_HIGH_HIGH_EDEFAULT;

    /**
     * The default value of the '{@link #isRemoteHigh() <em>Remote High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteHigh()
     * @generated
     * @ordered
     */
    protected static final boolean REMOTE_HIGH_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRemoteHigh() <em>Remote High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteHigh()
     * @generated
     * @ordered
     */
    protected boolean remoteHigh = REMOTE_HIGH_EDEFAULT;

    /**
     * The default value of the '{@link #isRemoteLow() <em>Remote Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteLow()
     * @generated
     * @ordered
     */
    protected static final boolean REMOTE_LOW_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRemoteLow() <em>Remote Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteLow()
     * @generated
     * @ordered
     */
    protected boolean remoteLow = REMOTE_LOW_EDEFAULT;

    /**
     * The default value of the '{@link #isRemoteLowLow() <em>Remote Low Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteLowLow()
     * @generated
     * @ordered
     */
    protected static final boolean REMOTE_LOW_LOW_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRemoteLowLow() <em>Remote Low Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteLowLow()
     * @generated
     * @ordered
     */
    protected boolean remoteLowLow = REMOTE_LOW_LOW_EDEFAULT;

    /**
     * The default value of the '{@link #isRemoteBool() <em>Remote Bool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteBool()
     * @generated
     * @ordered
     */
    protected static final boolean REMOTE_BOOL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRemoteBool() <em>Remote Bool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRemoteBool()
     * @generated
     * @ordered
     */
    protected boolean remoteBool = REMOTE_BOOL_EDEFAULT;

    /**
     * The default value of the '{@link #getRemoteBoolAckValue() <em>Remote Bool Ack Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteBoolAckValue()
     * @generated
     * @ordered
     */
    protected static final Boolean REMOTE_BOOL_ACK_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemoteBoolAckValue() <em>Remote Bool Ack Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteBoolAckValue()
     * @generated
     * @ordered
     */
    protected Boolean remoteBoolAckValue = REMOTE_BOOL_ACK_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #isInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInput()
     * @generated
     * @ordered
     */
    protected static final boolean INPUT_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInput()
     * @generated
     * @ordered
     */
    protected boolean input = INPUT_EDEFAULT;

    /**
     * The default value of the '{@link #isOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOutput()
     * @generated
     * @ordered
     */
    protected static final boolean OUTPUT_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOutput()
     * @generated
     * @ordered
     */
    protected boolean output = OUTPUT_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalScaleAvailable() <em>Local Scale Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalScaleAvailable()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_SCALE_AVAILABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocalScaleAvailable() <em>Local Scale Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalScaleAvailable()
     * @generated
     * @ordered
     */
    protected boolean localScaleAvailable = LOCAL_SCALE_AVAILABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalScaleFactor() <em>Local Scale Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalScaleFactor()
     * @generated
     * @ordered
     */
    protected static final Double LOCAL_SCALE_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalScaleFactor() <em>Local Scale Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalScaleFactor()
     * @generated
     * @ordered
     */
    protected Double localScaleFactor = LOCAL_SCALE_FACTOR_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalScaleOffset() <em>Local Scale Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalScaleOffset()
     * @generated
     * @ordered
     */
    protected static final Double LOCAL_SCALE_OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalScaleOffset() <em>Local Scale Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalScaleOffset()
     * @generated
     * @ordered
     */
    protected Double localScaleOffset = LOCAL_SCALE_OFFSET_EDEFAULT;

    /**
     * The default value of the '{@link #getDebugInformation() <em>Debug Information</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDebugInformation()
     * @generated
     * @ordered
     */
    protected static final String DEBUG_INFORMATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDebugInformation() <em>Debug Information</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDebugInformation()
     * @generated
     * @ordered
     */
    protected String debugInformation = DEBUG_INFORMATION_EDEFAULT;

    /**
     * The default value of the '{@link #isIgnoreSummary() <em>Ignore Summary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIgnoreSummary()
     * @generated
     * @ordered
     */
    protected static final boolean IGNORE_SUMMARY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIgnoreSummary() <em>Ignore Summary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIgnoreSummary()
     * @generated
     * @ordered
     */
    protected boolean ignoreSummary = IGNORE_SUMMARY_EDEFAULT;

    /**
     * The default value of the '{@link #isBlock() <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBlock()
     * @generated
     * @ordered
     */
    protected static final boolean BLOCK_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isBlock() <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBlock()
     * @generated
     * @ordered
     */
    protected boolean block = BLOCK_EDEFAULT;

    /**
     * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnabled()
     * @generated
     * @ordered
     */
    protected static final boolean ENABLED_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnabled()
     * @generated
     * @ordered
     */
    protected boolean enabled = ENABLED_EDEFAULT;

    /**
     * The default value of the '{@link #getHdStorage() <em>Hd Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHdStorage()
     * @generated
     * @ordered
     */
    protected static final String HD_STORAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHdStorage() <em>Hd Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHdStorage()
     * @generated
     * @ordered
     */
    protected String hdStorage = HD_STORAGE_EDEFAULT;

    /**
     * The cached value of the '{@link #getMapper() <em>Mapper</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMapper()
     * @generated
     * @ordered
     */
    protected EList<Mapper> mapper;

    /**
     * The default value of the '{@link #getSimulationValue() <em>Simulation Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSimulationValue()
     * @generated
     * @ordered
     */
    protected static final String SIMULATION_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSimulationValue() <em>Simulation Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSimulationValue()
     * @generated
     * @ordered
     */
    protected String simulationValue = SIMULATION_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #isRoundingAvailable() <em>Rounding Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRoundingAvailable()
     * @generated
     * @ordered
     */
    protected static final boolean ROUNDING_AVAILABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRoundingAvailable() <em>Rounding Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRoundingAvailable()
     * @generated
     * @ordered
     */
    protected boolean roundingAvailable = ROUNDING_AVAILABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getRoundingValue() <em>Rounding Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoundingValue()
     * @generated
     * @ordered
     */
    protected static final Rounding ROUNDING_VALUE_EDEFAULT = Rounding.NONE;

    /**
     * The cached value of the '{@link #getRoundingValue() <em>Rounding Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoundingValue()
     * @generated
     * @ordered
     */
    protected Rounding roundingValue = ROUNDING_VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getLocalHighHigh() <em>Local High High</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalHighHigh()
     * @generated
     * @ordered
     */
    protected LevelMonitor localHighHigh;

    /**
     * The cached value of the '{@link #getLocalHigh() <em>Local High</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalHigh()
     * @generated
     * @ordered
     */
    protected LevelMonitor localHigh;

    /**
     * The cached value of the '{@link #getLocalLow() <em>Local Low</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalLow()
     * @generated
     * @ordered
     */
    protected LevelMonitor localLow;

    /**
     * The cached value of the '{@link #getLocalLowLow() <em>Local Low Low</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalLowLow()
     * @generated
     * @ordered
     */
    protected LevelMonitor localLowLow;

    /**
     * The cached value of the '{@link #getLocalMin() <em>Local Min</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalMin()
     * @generated
     * @ordered
     */
    protected LevelMonitor localMin;

    /**
     * The cached value of the '{@link #getLocalMax() <em>Local Max</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalMax()
     * @generated
     * @ordered
     */
    protected LevelMonitor localMax;

    /**
     * The cached value of the '{@link #getLocalListMonitor() <em>Local List Monitor</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalListMonitor()
     * @generated
     * @ordered
     */
    protected ListMonitor localListMonitor;

    /**
     * The cached value of the '{@link #getLocalBooleanMonitor() <em>Local Boolean Monitor</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalBooleanMonitor()
     * @generated
     * @ordered
     */
    protected BooleanMonitor localBooleanMonitor;

    /**
     * The default value of the '{@link #getDefaultMonitorDemote() <em>Default Monitor Demote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultMonitorDemote()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_MONITOR_DEMOTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultMonitorDemote() <em>Default Monitor Demote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultMonitorDemote()
     * @generated
     * @ordered
     */
    protected String defaultMonitorDemote = DEFAULT_MONITOR_DEMOTE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ItemImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ModelPackage.Literals.ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDevice ()
    {
        return device;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDevice ( String newDevice )
    {
        String oldDevice = device;
        device = newDevice;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__DEVICE, oldDevice, device ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName ()
    {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName ( String newName )
    {
        String oldName = name;
        name = newName;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType getDataType ()
    {
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataType ( DataType newDataType )
    {
        DataType oldDataType = dataType;
        dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__DATA_TYPE, oldDataType, dataType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUnit ()
    {
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnit ( String newUnit )
    {
        String oldUnit = unit;
        unit = newUnit;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__UNIT, oldUnit, unit ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias ()
    {
        return alias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias ( String newAlias )
    {
        String oldAlias = alias;
        alias = newAlias;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__ALIAS, oldAlias, alias ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription ()
    {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription ( String newDescription )
    {
        String oldDescription = description;
        description = newDescription;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__DESCRIPTION, oldDescription, description ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDefaultChain ()
    {
        return defaultChain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultChain ( boolean newDefaultChain )
    {
        boolean oldDefaultChain = defaultChain;
        defaultChain = newDefaultChain;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__DEFAULT_CHAIN, oldDefaultChain, defaultChain ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LevelMonitor getLocalMin ()
    {
        return localMin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalMin ( LevelMonitor newLocalMin, NotificationChain msgs )
    {
        LevelMonitor oldLocalMin = localMin;
        localMin = newLocalMin;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_MIN, oldLocalMin, newLocalMin );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalMin ( LevelMonitor newLocalMin )
    {
        if ( newLocalMin != localMin )
        {
            NotificationChain msgs = null;
            if ( localMin != null )
                msgs = ( (InternalEObject)localMin ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_MIN, null, msgs );
            if ( newLocalMin != null )
                msgs = ( (InternalEObject)newLocalMin ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_MIN, null, msgs );
            msgs = basicSetLocalMin ( newLocalMin, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_MIN, newLocalMin, newLocalMin ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LevelMonitor getLocalMax ()
    {
        return localMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalMax ( LevelMonitor newLocalMax, NotificationChain msgs )
    {
        LevelMonitor oldLocalMax = localMax;
        localMax = newLocalMax;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_MAX, oldLocalMax, newLocalMax );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalMax ( LevelMonitor newLocalMax )
    {
        if ( newLocalMax != localMax )
        {
            NotificationChain msgs = null;
            if ( localMax != null )
                msgs = ( (InternalEObject)localMax ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_MAX, null, msgs );
            if ( newLocalMax != null )
                msgs = ( (InternalEObject)newLocalMax ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_MAX, null, msgs );
            msgs = basicSetLocalMax ( newLocalMax, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_MAX, newLocalMax, newLocalMax ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListMonitor getLocalListMonitor ()
    {
        return localListMonitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalListMonitor ( ListMonitor newLocalListMonitor, NotificationChain msgs )
    {
        ListMonitor oldLocalListMonitor = localListMonitor;
        localListMonitor = newLocalListMonitor;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_LIST_MONITOR, oldLocalListMonitor, newLocalListMonitor );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalListMonitor ( ListMonitor newLocalListMonitor )
    {
        if ( newLocalListMonitor != localListMonitor )
        {
            NotificationChain msgs = null;
            if ( localListMonitor != null )
                msgs = ( (InternalEObject)localListMonitor ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_LIST_MONITOR, null, msgs );
            if ( newLocalListMonitor != null )
                msgs = ( (InternalEObject)newLocalListMonitor ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_LIST_MONITOR, null, msgs );
            msgs = basicSetLocalListMonitor ( newLocalListMonitor, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_LIST_MONITOR, newLocalListMonitor, newLocalListMonitor ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BooleanMonitor getLocalBooleanMonitor ()
    {
        return localBooleanMonitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalBooleanMonitor ( BooleanMonitor newLocalBooleanMonitor, NotificationChain msgs )
    {
        BooleanMonitor oldLocalBooleanMonitor = localBooleanMonitor;
        localBooleanMonitor = newLocalBooleanMonitor;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR, oldLocalBooleanMonitor, newLocalBooleanMonitor );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalBooleanMonitor ( BooleanMonitor newLocalBooleanMonitor )
    {
        if ( newLocalBooleanMonitor != localBooleanMonitor )
        {
            NotificationChain msgs = null;
            if ( localBooleanMonitor != null )
                msgs = ( (InternalEObject)localBooleanMonitor ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR, null, msgs );
            if ( newLocalBooleanMonitor != null )
                msgs = ( (InternalEObject)newLocalBooleanMonitor ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR, null, msgs );
            msgs = basicSetLocalBooleanMonitor ( newLocalBooleanMonitor, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR, newLocalBooleanMonitor, newLocalBooleanMonitor ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultMonitorDemote ()
    {
        return defaultMonitorDemote;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultMonitorDemote ( String newDefaultMonitorDemote )
    {
        String oldDefaultMonitorDemote = defaultMonitorDemote;
        defaultMonitorDemote = newDefaultMonitorDemote;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__DEFAULT_MONITOR_DEMOTE, oldDefaultMonitorDemote, defaultMonitorDemote ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEventCommand ()
    {
        return eventCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventCommand ( boolean newEventCommand )
    {
        boolean oldEventCommand = eventCommand;
        eventCommand = newEventCommand;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__EVENT_COMMAND, oldEventCommand, eventCommand ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalManual ()
    {
        return localManual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalManual ( boolean newLocalManual )
    {
        boolean oldLocalManual = localManual;
        localManual = newLocalManual;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_MANUAL, oldLocalManual, localManual ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteManual ()
    {
        return remoteManual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteManual ( boolean newRemoteManual )
    {
        boolean oldRemoteManual = remoteManual;
        remoteManual = newRemoteManual;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__REMOTE_MANUAL, oldRemoteManual, remoteManual ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSystem ()
    {
        return system;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSystem ( String newSystem )
    {
        String oldSystem = system;
        system = newSystem;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__SYSTEM, oldSystem, system ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getHierarchy ()
    {
        if ( hierarchy == null )
        {
            hierarchy = new EDataTypeEList<String> ( String.class, this, ModelPackage.ITEM__HIERARCHY );
        }
        return hierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteMin ()
    {
        return remoteMin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteMin ( boolean newRemoteMin )
    {
        boolean oldRemoteMin = remoteMin;
        remoteMin = newRemoteMin;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__REMOTE_MIN, oldRemoteMin, remoteMin ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteMax ()
    {
        return remoteMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteMax ( boolean newRemoteMax )
    {
        boolean oldRemoteMax = remoteMax;
        remoteMax = newRemoteMax;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__REMOTE_MAX, oldRemoteMax, remoteMax ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteHighHigh ()
    {
        return remoteHighHigh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteHighHigh ( boolean newRemoteHighHigh )
    {
        boolean oldRemoteHighHigh = remoteHighHigh;
        remoteHighHigh = newRemoteHighHigh;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__REMOTE_HIGH_HIGH, oldRemoteHighHigh, remoteHighHigh ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteHigh ()
    {
        return remoteHigh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteHigh ( boolean newRemoteHigh )
    {
        boolean oldRemoteHigh = remoteHigh;
        remoteHigh = newRemoteHigh;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__REMOTE_HIGH, oldRemoteHigh, remoteHigh ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteLow ()
    {
        return remoteLow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteLow ( boolean newRemoteLow )
    {
        boolean oldRemoteLow = remoteLow;
        remoteLow = newRemoteLow;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__REMOTE_LOW, oldRemoteLow, remoteLow ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteLowLow ()
    {
        return remoteLowLow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteLowLow ( boolean newRemoteLowLow )
    {
        boolean oldRemoteLowLow = remoteLowLow;
        remoteLowLow = newRemoteLowLow;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__REMOTE_LOW_LOW, oldRemoteLowLow, remoteLowLow ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteBool ()
    {
        return remoteBool;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteBool ( boolean newRemoteBool )
    {
        boolean oldRemoteBool = remoteBool;
        remoteBool = newRemoteBool;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__REMOTE_BOOL, oldRemoteBool, remoteBool ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getRemoteBoolAckValue ()
    {
        return remoteBoolAckValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteBoolAckValue ( Boolean newRemoteBoolAckValue )
    {
        Boolean oldRemoteBoolAckValue = remoteBoolAckValue;
        remoteBoolAckValue = newRemoteBoolAckValue;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE, oldRemoteBoolAckValue, remoteBoolAckValue ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInput ()
    {
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInput ( boolean newInput )
    {
        boolean oldInput = input;
        input = newInput;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__INPUT, oldInput, input ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOutput ()
    {
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutput ( boolean newOutput )
    {
        boolean oldOutput = output;
        output = newOutput;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__OUTPUT, oldOutput, output ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalScaleAvailable ()
    {
        return localScaleAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalScaleAvailable ( boolean newLocalScaleAvailable )
    {
        boolean oldLocalScaleAvailable = localScaleAvailable;
        localScaleAvailable = newLocalScaleAvailable;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE, oldLocalScaleAvailable, localScaleAvailable ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalScaleFactor ()
    {
        return localScaleFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalScaleFactor ( Double newLocalScaleFactor )
    {
        Double oldLocalScaleFactor = localScaleFactor;
        localScaleFactor = newLocalScaleFactor;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_SCALE_FACTOR, oldLocalScaleFactor, localScaleFactor ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalScaleOffset ()
    {
        return localScaleOffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalScaleOffset ( Double newLocalScaleOffset )
    {
        Double oldLocalScaleOffset = localScaleOffset;
        localScaleOffset = newLocalScaleOffset;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_SCALE_OFFSET, oldLocalScaleOffset, localScaleOffset ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDebugInformation ()
    {
        return debugInformation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDebugInformation ( String newDebugInformation )
    {
        String oldDebugInformation = debugInformation;
        debugInformation = newDebugInformation;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__DEBUG_INFORMATION, oldDebugInformation, debugInformation ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIgnoreSummary ()
    {
        return ignoreSummary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIgnoreSummary ( boolean newIgnoreSummary )
    {
        boolean oldIgnoreSummary = ignoreSummary;
        ignoreSummary = newIgnoreSummary;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__IGNORE_SUMMARY, oldIgnoreSummary, ignoreSummary ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBlock ()
    {
        return block;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBlock ( boolean newBlock )
    {
        boolean oldBlock = block;
        block = newBlock;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__BLOCK, oldBlock, block ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEnabled ()
    {
        return enabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnabled ( boolean newEnabled )
    {
        boolean oldEnabled = enabled;
        enabled = newEnabled;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__ENABLED, oldEnabled, enabled ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHdStorage ()
    {
        return hdStorage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHdStorage ( String newHdStorage )
    {
        String oldHdStorage = hdStorage;
        hdStorage = newHdStorage;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__HD_STORAGE, oldHdStorage, hdStorage ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Mapper> getMapper ()
    {
        if ( mapper == null )
        {
            mapper = new EObjectContainmentEList<Mapper> ( Mapper.class, this, ModelPackage.ITEM__MAPPER );
        }
        return mapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSimulationValue ()
    {
        return simulationValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimulationValue ( String newSimulationValue )
    {
        String oldSimulationValue = simulationValue;
        simulationValue = newSimulationValue;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__SIMULATION_VALUE, oldSimulationValue, simulationValue ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRoundingAvailable ()
    {
        return roundingAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoundingAvailable ( boolean newRoundingAvailable )
    {
        boolean oldRoundingAvailable = roundingAvailable;
        roundingAvailable = newRoundingAvailable;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__ROUNDING_AVAILABLE, oldRoundingAvailable, roundingAvailable ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rounding getRoundingValue ()
    {
        return roundingValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoundingValue ( Rounding newRoundingValue )
    {
        Rounding oldRoundingValue = roundingValue;
        roundingValue = newRoundingValue == null ? ROUNDING_VALUE_EDEFAULT : newRoundingValue;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__ROUNDING_VALUE, oldRoundingValue, roundingValue ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LevelMonitor getLocalHighHigh ()
    {
        return localHighHigh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalHighHigh ( LevelMonitor newLocalHighHigh, NotificationChain msgs )
    {
        LevelMonitor oldLocalHighHigh = localHighHigh;
        localHighHigh = newLocalHighHigh;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH_HIGH, oldLocalHighHigh, newLocalHighHigh );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalHighHigh ( LevelMonitor newLocalHighHigh )
    {
        if ( newLocalHighHigh != localHighHigh )
        {
            NotificationChain msgs = null;
            if ( localHighHigh != null )
                msgs = ( (InternalEObject)localHighHigh ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_HIGH_HIGH, null, msgs );
            if ( newLocalHighHigh != null )
                msgs = ( (InternalEObject)newLocalHighHigh ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_HIGH_HIGH, null, msgs );
            msgs = basicSetLocalHighHigh ( newLocalHighHigh, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH_HIGH, newLocalHighHigh, newLocalHighHigh ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LevelMonitor getLocalHigh ()
    {
        return localHigh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalHigh ( LevelMonitor newLocalHigh, NotificationChain msgs )
    {
        LevelMonitor oldLocalHigh = localHigh;
        localHigh = newLocalHigh;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH, oldLocalHigh, newLocalHigh );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalHigh ( LevelMonitor newLocalHigh )
    {
        if ( newLocalHigh != localHigh )
        {
            NotificationChain msgs = null;
            if ( localHigh != null )
                msgs = ( (InternalEObject)localHigh ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_HIGH, null, msgs );
            if ( newLocalHigh != null )
                msgs = ( (InternalEObject)newLocalHigh ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_HIGH, null, msgs );
            msgs = basicSetLocalHigh ( newLocalHigh, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH, newLocalHigh, newLocalHigh ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LevelMonitor getLocalLow ()
    {
        return localLow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalLow ( LevelMonitor newLocalLow, NotificationChain msgs )
    {
        LevelMonitor oldLocalLow = localLow;
        localLow = newLocalLow;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW, oldLocalLow, newLocalLow );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalLow ( LevelMonitor newLocalLow )
    {
        if ( newLocalLow != localLow )
        {
            NotificationChain msgs = null;
            if ( localLow != null )
                msgs = ( (InternalEObject)localLow ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_LOW, null, msgs );
            if ( newLocalLow != null )
                msgs = ( (InternalEObject)newLocalLow ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_LOW, null, msgs );
            msgs = basicSetLocalLow ( newLocalLow, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW, newLocalLow, newLocalLow ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LevelMonitor getLocalLowLow ()
    {
        return localLowLow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalLowLow ( LevelMonitor newLocalLowLow, NotificationChain msgs )
    {
        LevelMonitor oldLocalLowLow = localLowLow;
        localLowLow = newLocalLowLow;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW_LOW, oldLocalLowLow, newLocalLowLow );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalLowLow ( LevelMonitor newLocalLowLow )
    {
        if ( newLocalLowLow != localLowLow )
        {
            NotificationChain msgs = null;
            if ( localLowLow != null )
                msgs = ( (InternalEObject)localLowLow ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_LOW_LOW, null, msgs );
            if ( newLocalLowLow != null )
                msgs = ( (InternalEObject)newLocalLowLow ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.ITEM__LOCAL_LOW_LOW, null, msgs );
            msgs = basicSetLocalLowLow ( newLocalLowLow, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW_LOW, newLocalLowLow, newLocalLowLow ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( InternalEObject otherEnd, int featureID, NotificationChain msgs )
    {
        switch ( featureID )
        {
            case ModelPackage.ITEM__MAPPER:
                return ( (InternalEList<?>)getMapper () ).basicRemove ( otherEnd, msgs );
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH:
                return basicSetLocalHighHigh ( null, msgs );
            case ModelPackage.ITEM__LOCAL_HIGH:
                return basicSetLocalHigh ( null, msgs );
            case ModelPackage.ITEM__LOCAL_LOW:
                return basicSetLocalLow ( null, msgs );
            case ModelPackage.ITEM__LOCAL_LOW_LOW:
                return basicSetLocalLowLow ( null, msgs );
            case ModelPackage.ITEM__LOCAL_MIN:
                return basicSetLocalMin ( null, msgs );
            case ModelPackage.ITEM__LOCAL_MAX:
                return basicSetLocalMax ( null, msgs );
            case ModelPackage.ITEM__LOCAL_LIST_MONITOR:
                return basicSetLocalListMonitor ( null, msgs );
            case ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR:
                return basicSetLocalBooleanMonitor ( null, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
            case ModelPackage.ITEM__DEVICE:
                return getDevice ();
            case ModelPackage.ITEM__NAME:
                return getName ();
            case ModelPackage.ITEM__DATA_TYPE:
                return getDataType ();
            case ModelPackage.ITEM__UNIT:
                return getUnit ();
            case ModelPackage.ITEM__ALIAS:
                return getAlias ();
            case ModelPackage.ITEM__DESCRIPTION:
                return getDescription ();
            case ModelPackage.ITEM__DEFAULT_CHAIN:
                return isDefaultChain ();
            case ModelPackage.ITEM__EVENT_COMMAND:
                return isEventCommand ();
            case ModelPackage.ITEM__LOCAL_MANUAL:
                return isLocalManual ();
            case ModelPackage.ITEM__REMOTE_MANUAL:
                return isRemoteManual ();
            case ModelPackage.ITEM__SYSTEM:
                return getSystem ();
            case ModelPackage.ITEM__HIERARCHY:
                return getHierarchy ();
            case ModelPackage.ITEM__REMOTE_MIN:
                return isRemoteMin ();
            case ModelPackage.ITEM__REMOTE_MAX:
                return isRemoteMax ();
            case ModelPackage.ITEM__REMOTE_HIGH_HIGH:
                return isRemoteHighHigh ();
            case ModelPackage.ITEM__REMOTE_HIGH:
                return isRemoteHigh ();
            case ModelPackage.ITEM__REMOTE_LOW:
                return isRemoteLow ();
            case ModelPackage.ITEM__REMOTE_LOW_LOW:
                return isRemoteLowLow ();
            case ModelPackage.ITEM__REMOTE_BOOL:
                return isRemoteBool ();
            case ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE:
                return getRemoteBoolAckValue ();
            case ModelPackage.ITEM__INPUT:
                return isInput ();
            case ModelPackage.ITEM__OUTPUT:
                return isOutput ();
            case ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE:
                return isLocalScaleAvailable ();
            case ModelPackage.ITEM__LOCAL_SCALE_FACTOR:
                return getLocalScaleFactor ();
            case ModelPackage.ITEM__LOCAL_SCALE_OFFSET:
                return getLocalScaleOffset ();
            case ModelPackage.ITEM__DEBUG_INFORMATION:
                return getDebugInformation ();
            case ModelPackage.ITEM__IGNORE_SUMMARY:
                return isIgnoreSummary ();
            case ModelPackage.ITEM__BLOCK:
                return isBlock ();
            case ModelPackage.ITEM__ENABLED:
                return isEnabled ();
            case ModelPackage.ITEM__HD_STORAGE:
                return getHdStorage ();
            case ModelPackage.ITEM__MAPPER:
                return getMapper ();
            case ModelPackage.ITEM__SIMULATION_VALUE:
                return getSimulationValue ();
            case ModelPackage.ITEM__ROUNDING_AVAILABLE:
                return isRoundingAvailable ();
            case ModelPackage.ITEM__ROUNDING_VALUE:
                return getRoundingValue ();
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH:
                return getLocalHighHigh ();
            case ModelPackage.ITEM__LOCAL_HIGH:
                return getLocalHigh ();
            case ModelPackage.ITEM__LOCAL_LOW:
                return getLocalLow ();
            case ModelPackage.ITEM__LOCAL_LOW_LOW:
                return getLocalLowLow ();
            case ModelPackage.ITEM__LOCAL_MIN:
                return getLocalMin ();
            case ModelPackage.ITEM__LOCAL_MAX:
                return getLocalMax ();
            case ModelPackage.ITEM__LOCAL_LIST_MONITOR:
                return getLocalListMonitor ();
            case ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR:
                return getLocalBooleanMonitor ();
            case ModelPackage.ITEM__DEFAULT_MONITOR_DEMOTE:
                return getDefaultMonitorDemote ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case ModelPackage.ITEM__DEVICE:
                setDevice ( (String)newValue );
                return;
            case ModelPackage.ITEM__NAME:
                setName ( (String)newValue );
                return;
            case ModelPackage.ITEM__DATA_TYPE:
                setDataType ( (DataType)newValue );
                return;
            case ModelPackage.ITEM__UNIT:
                setUnit ( (String)newValue );
                return;
            case ModelPackage.ITEM__ALIAS:
                setAlias ( (String)newValue );
                return;
            case ModelPackage.ITEM__DESCRIPTION:
                setDescription ( (String)newValue );
                return;
            case ModelPackage.ITEM__DEFAULT_CHAIN:
                setDefaultChain ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__EVENT_COMMAND:
                setEventCommand ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_MANUAL:
                setLocalManual ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__REMOTE_MANUAL:
                setRemoteManual ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__SYSTEM:
                setSystem ( (String)newValue );
                return;
            case ModelPackage.ITEM__HIERARCHY:
                getHierarchy ().clear ();
                getHierarchy ().addAll ( (Collection<? extends String>)newValue );
                return;
            case ModelPackage.ITEM__REMOTE_MIN:
                setRemoteMin ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__REMOTE_MAX:
                setRemoteMax ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__REMOTE_HIGH_HIGH:
                setRemoteHighHigh ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__REMOTE_HIGH:
                setRemoteHigh ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__REMOTE_LOW:
                setRemoteLow ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__REMOTE_LOW_LOW:
                setRemoteLowLow ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__REMOTE_BOOL:
                setRemoteBool ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE:
                setRemoteBoolAckValue ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__INPUT:
                setInput ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__OUTPUT:
                setOutput ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE:
                setLocalScaleAvailable ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_FACTOR:
                setLocalScaleFactor ( (Double)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_OFFSET:
                setLocalScaleOffset ( (Double)newValue );
                return;
            case ModelPackage.ITEM__DEBUG_INFORMATION:
                setDebugInformation ( (String)newValue );
                return;
            case ModelPackage.ITEM__IGNORE_SUMMARY:
                setIgnoreSummary ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__BLOCK:
                setBlock ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__ENABLED:
                setEnabled ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__HD_STORAGE:
                setHdStorage ( (String)newValue );
                return;
            case ModelPackage.ITEM__MAPPER:
                getMapper ().clear ();
                getMapper ().addAll ( (Collection<? extends Mapper>)newValue );
                return;
            case ModelPackage.ITEM__SIMULATION_VALUE:
                setSimulationValue ( (String)newValue );
                return;
            case ModelPackage.ITEM__ROUNDING_AVAILABLE:
                setRoundingAvailable ( (Boolean)newValue );
                return;
            case ModelPackage.ITEM__ROUNDING_VALUE:
                setRoundingValue ( (Rounding)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH:
                setLocalHighHigh ( (LevelMonitor)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_HIGH:
                setLocalHigh ( (LevelMonitor)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_LOW:
                setLocalLow ( (LevelMonitor)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_LOW_LOW:
                setLocalLowLow ( (LevelMonitor)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_MIN:
                setLocalMin ( (LevelMonitor)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_MAX:
                setLocalMax ( (LevelMonitor)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_LIST_MONITOR:
                setLocalListMonitor ( (ListMonitor)newValue );
                return;
            case ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR:
                setLocalBooleanMonitor ( (BooleanMonitor)newValue );
                return;
            case ModelPackage.ITEM__DEFAULT_MONITOR_DEMOTE:
                setDefaultMonitorDemote ( (String)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
            case ModelPackage.ITEM__DEVICE:
                setDevice ( DEVICE_EDEFAULT );
                return;
            case ModelPackage.ITEM__NAME:
                setName ( NAME_EDEFAULT );
                return;
            case ModelPackage.ITEM__DATA_TYPE:
                setDataType ( DATA_TYPE_EDEFAULT );
                return;
            case ModelPackage.ITEM__UNIT:
                setUnit ( UNIT_EDEFAULT );
                return;
            case ModelPackage.ITEM__ALIAS:
                setAlias ( ALIAS_EDEFAULT );
                return;
            case ModelPackage.ITEM__DESCRIPTION:
                setDescription ( DESCRIPTION_EDEFAULT );
                return;
            case ModelPackage.ITEM__DEFAULT_CHAIN:
                setDefaultChain ( DEFAULT_CHAIN_EDEFAULT );
                return;
            case ModelPackage.ITEM__EVENT_COMMAND:
                setEventCommand ( EVENT_COMMAND_EDEFAULT );
                return;
            case ModelPackage.ITEM__LOCAL_MANUAL:
                setLocalManual ( LOCAL_MANUAL_EDEFAULT );
                return;
            case ModelPackage.ITEM__REMOTE_MANUAL:
                setRemoteManual ( REMOTE_MANUAL_EDEFAULT );
                return;
            case ModelPackage.ITEM__SYSTEM:
                setSystem ( SYSTEM_EDEFAULT );
                return;
            case ModelPackage.ITEM__HIERARCHY:
                getHierarchy ().clear ();
                return;
            case ModelPackage.ITEM__REMOTE_MIN:
                setRemoteMin ( REMOTE_MIN_EDEFAULT );
                return;
            case ModelPackage.ITEM__REMOTE_MAX:
                setRemoteMax ( REMOTE_MAX_EDEFAULT );
                return;
            case ModelPackage.ITEM__REMOTE_HIGH_HIGH:
                setRemoteHighHigh ( REMOTE_HIGH_HIGH_EDEFAULT );
                return;
            case ModelPackage.ITEM__REMOTE_HIGH:
                setRemoteHigh ( REMOTE_HIGH_EDEFAULT );
                return;
            case ModelPackage.ITEM__REMOTE_LOW:
                setRemoteLow ( REMOTE_LOW_EDEFAULT );
                return;
            case ModelPackage.ITEM__REMOTE_LOW_LOW:
                setRemoteLowLow ( REMOTE_LOW_LOW_EDEFAULT );
                return;
            case ModelPackage.ITEM__REMOTE_BOOL:
                setRemoteBool ( REMOTE_BOOL_EDEFAULT );
                return;
            case ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE:
                setRemoteBoolAckValue ( REMOTE_BOOL_ACK_VALUE_EDEFAULT );
                return;
            case ModelPackage.ITEM__INPUT:
                setInput ( INPUT_EDEFAULT );
                return;
            case ModelPackage.ITEM__OUTPUT:
                setOutput ( OUTPUT_EDEFAULT );
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE:
                setLocalScaleAvailable ( LOCAL_SCALE_AVAILABLE_EDEFAULT );
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_FACTOR:
                setLocalScaleFactor ( LOCAL_SCALE_FACTOR_EDEFAULT );
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_OFFSET:
                setLocalScaleOffset ( LOCAL_SCALE_OFFSET_EDEFAULT );
                return;
            case ModelPackage.ITEM__DEBUG_INFORMATION:
                setDebugInformation ( DEBUG_INFORMATION_EDEFAULT );
                return;
            case ModelPackage.ITEM__IGNORE_SUMMARY:
                setIgnoreSummary ( IGNORE_SUMMARY_EDEFAULT );
                return;
            case ModelPackage.ITEM__BLOCK:
                setBlock ( BLOCK_EDEFAULT );
                return;
            case ModelPackage.ITEM__ENABLED:
                setEnabled ( ENABLED_EDEFAULT );
                return;
            case ModelPackage.ITEM__HD_STORAGE:
                setHdStorage ( HD_STORAGE_EDEFAULT );
                return;
            case ModelPackage.ITEM__MAPPER:
                getMapper ().clear ();
                return;
            case ModelPackage.ITEM__SIMULATION_VALUE:
                setSimulationValue ( SIMULATION_VALUE_EDEFAULT );
                return;
            case ModelPackage.ITEM__ROUNDING_AVAILABLE:
                setRoundingAvailable ( ROUNDING_AVAILABLE_EDEFAULT );
                return;
            case ModelPackage.ITEM__ROUNDING_VALUE:
                setRoundingValue ( ROUNDING_VALUE_EDEFAULT );
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH:
                setLocalHighHigh ( (LevelMonitor)null );
                return;
            case ModelPackage.ITEM__LOCAL_HIGH:
                setLocalHigh ( (LevelMonitor)null );
                return;
            case ModelPackage.ITEM__LOCAL_LOW:
                setLocalLow ( (LevelMonitor)null );
                return;
            case ModelPackage.ITEM__LOCAL_LOW_LOW:
                setLocalLowLow ( (LevelMonitor)null );
                return;
            case ModelPackage.ITEM__LOCAL_MIN:
                setLocalMin ( (LevelMonitor)null );
                return;
            case ModelPackage.ITEM__LOCAL_MAX:
                setLocalMax ( (LevelMonitor)null );
                return;
            case ModelPackage.ITEM__LOCAL_LIST_MONITOR:
                setLocalListMonitor ( (ListMonitor)null );
                return;
            case ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR:
                setLocalBooleanMonitor ( (BooleanMonitor)null );
                return;
            case ModelPackage.ITEM__DEFAULT_MONITOR_DEMOTE:
                setDefaultMonitorDemote ( DEFAULT_MONITOR_DEMOTE_EDEFAULT );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case ModelPackage.ITEM__DEVICE:
                return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals ( device );
            case ModelPackage.ITEM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals ( name );
            case ModelPackage.ITEM__DATA_TYPE:
                return dataType != DATA_TYPE_EDEFAULT;
            case ModelPackage.ITEM__UNIT:
                return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals ( unit );
            case ModelPackage.ITEM__ALIAS:
                return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals ( alias );
            case ModelPackage.ITEM__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals ( description );
            case ModelPackage.ITEM__DEFAULT_CHAIN:
                return defaultChain != DEFAULT_CHAIN_EDEFAULT;
            case ModelPackage.ITEM__EVENT_COMMAND:
                return eventCommand != EVENT_COMMAND_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_MANUAL:
                return localManual != LOCAL_MANUAL_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_MANUAL:
                return remoteManual != REMOTE_MANUAL_EDEFAULT;
            case ModelPackage.ITEM__SYSTEM:
                return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals ( system );
            case ModelPackage.ITEM__HIERARCHY:
                return hierarchy != null && !hierarchy.isEmpty ();
            case ModelPackage.ITEM__REMOTE_MIN:
                return remoteMin != REMOTE_MIN_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_MAX:
                return remoteMax != REMOTE_MAX_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_HIGH_HIGH:
                return remoteHighHigh != REMOTE_HIGH_HIGH_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_HIGH:
                return remoteHigh != REMOTE_HIGH_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_LOW:
                return remoteLow != REMOTE_LOW_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_LOW_LOW:
                return remoteLowLow != REMOTE_LOW_LOW_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_BOOL:
                return remoteBool != REMOTE_BOOL_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE:
                return REMOTE_BOOL_ACK_VALUE_EDEFAULT == null ? remoteBoolAckValue != null : !REMOTE_BOOL_ACK_VALUE_EDEFAULT.equals ( remoteBoolAckValue );
            case ModelPackage.ITEM__INPUT:
                return input != INPUT_EDEFAULT;
            case ModelPackage.ITEM__OUTPUT:
                return output != OUTPUT_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE:
                return localScaleAvailable != LOCAL_SCALE_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_SCALE_FACTOR:
                return LOCAL_SCALE_FACTOR_EDEFAULT == null ? localScaleFactor != null : !LOCAL_SCALE_FACTOR_EDEFAULT.equals ( localScaleFactor );
            case ModelPackage.ITEM__LOCAL_SCALE_OFFSET:
                return LOCAL_SCALE_OFFSET_EDEFAULT == null ? localScaleOffset != null : !LOCAL_SCALE_OFFSET_EDEFAULT.equals ( localScaleOffset );
            case ModelPackage.ITEM__DEBUG_INFORMATION:
                return DEBUG_INFORMATION_EDEFAULT == null ? debugInformation != null : !DEBUG_INFORMATION_EDEFAULT.equals ( debugInformation );
            case ModelPackage.ITEM__IGNORE_SUMMARY:
                return ignoreSummary != IGNORE_SUMMARY_EDEFAULT;
            case ModelPackage.ITEM__BLOCK:
                return block != BLOCK_EDEFAULT;
            case ModelPackage.ITEM__ENABLED:
                return enabled != ENABLED_EDEFAULT;
            case ModelPackage.ITEM__HD_STORAGE:
                return HD_STORAGE_EDEFAULT == null ? hdStorage != null : !HD_STORAGE_EDEFAULT.equals ( hdStorage );
            case ModelPackage.ITEM__MAPPER:
                return mapper != null && !mapper.isEmpty ();
            case ModelPackage.ITEM__SIMULATION_VALUE:
                return SIMULATION_VALUE_EDEFAULT == null ? simulationValue != null : !SIMULATION_VALUE_EDEFAULT.equals ( simulationValue );
            case ModelPackage.ITEM__ROUNDING_AVAILABLE:
                return roundingAvailable != ROUNDING_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__ROUNDING_VALUE:
                return roundingValue != ROUNDING_VALUE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH:
                return localHighHigh != null;
            case ModelPackage.ITEM__LOCAL_HIGH:
                return localHigh != null;
            case ModelPackage.ITEM__LOCAL_LOW:
                return localLow != null;
            case ModelPackage.ITEM__LOCAL_LOW_LOW:
                return localLowLow != null;
            case ModelPackage.ITEM__LOCAL_MIN:
                return localMin != null;
            case ModelPackage.ITEM__LOCAL_MAX:
                return localMax != null;
            case ModelPackage.ITEM__LOCAL_LIST_MONITOR:
                return localListMonitor != null;
            case ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR:
                return localBooleanMonitor != null;
            case ModelPackage.ITEM__DEFAULT_MONITOR_DEMOTE:
                return DEFAULT_MONITOR_DEMOTE_EDEFAULT == null ? defaultMonitorDemote != null : !DEFAULT_MONITOR_DEMOTE_EDEFAULT.equals ( defaultMonitorDemote );
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
            return super.toString ();

        StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (device: " );
        result.append ( device );
        result.append ( ", name: " );
        result.append ( name );
        result.append ( ", dataType: " );
        result.append ( dataType );
        result.append ( ", unit: " );
        result.append ( unit );
        result.append ( ", alias: " );
        result.append ( alias );
        result.append ( ", description: " );
        result.append ( description );
        result.append ( ", defaultChain: " );
        result.append ( defaultChain );
        result.append ( ", eventCommand: " );
        result.append ( eventCommand );
        result.append ( ", localManual: " );
        result.append ( localManual );
        result.append ( ", remoteManual: " );
        result.append ( remoteManual );
        result.append ( ", system: " );
        result.append ( system );
        result.append ( ", hierarchy: " );
        result.append ( hierarchy );
        result.append ( ", remoteMin: " );
        result.append ( remoteMin );
        result.append ( ", remoteMax: " );
        result.append ( remoteMax );
        result.append ( ", remoteHighHigh: " );
        result.append ( remoteHighHigh );
        result.append ( ", remoteHigh: " );
        result.append ( remoteHigh );
        result.append ( ", remoteLow: " );
        result.append ( remoteLow );
        result.append ( ", remoteLowLow: " );
        result.append ( remoteLowLow );
        result.append ( ", remoteBool: " );
        result.append ( remoteBool );
        result.append ( ", remoteBoolAckValue: " );
        result.append ( remoteBoolAckValue );
        result.append ( ", input: " );
        result.append ( input );
        result.append ( ", output: " );
        result.append ( output );
        result.append ( ", localScaleAvailable: " );
        result.append ( localScaleAvailable );
        result.append ( ", localScaleFactor: " );
        result.append ( localScaleFactor );
        result.append ( ", localScaleOffset: " );
        result.append ( localScaleOffset );
        result.append ( ", debugInformation: " );
        result.append ( debugInformation );
        result.append ( ", ignoreSummary: " );
        result.append ( ignoreSummary );
        result.append ( ", block: " );
        result.append ( block );
        result.append ( ", enabled: " );
        result.append ( enabled );
        result.append ( ", hdStorage: " );
        result.append ( hdStorage );
        result.append ( ", simulationValue: " );
        result.append ( simulationValue );
        result.append ( ", roundingAvailable: " );
        result.append ( roundingAvailable );
        result.append ( ", roundingValue: " );
        result.append ( roundingValue );
        result.append ( ", defaultMonitorDemote: " );
        result.append ( defaultMonitorDemote );
        result.append ( ')' );
        return result.toString ();
    }

} //ItemImpl

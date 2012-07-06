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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.Item;
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
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalMin <em>Local Min</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalMinAvailable <em>Local Min Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalMinAck <em>Local Min Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalMax <em>Local Max</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalMaxAvailable <em>Local Max Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalMaxAck <em>Local Max Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalHighHighAvailable <em>Local High High Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalHighHighAck <em>Local High High Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalHighHighPreset <em>Local High High Preset</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isEventCommand <em>Event Command</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalManual <em>Local Manual</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteManual <em>Remote Manual</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteMin <em>Remote Min</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteMax <em>Remote Max</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteHighHigh <em>Remote High High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteHigh <em>Remote High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteLow <em>Remote Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteLowLow <em>Remote Low Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalHighAvailable <em>Local High Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalHighAck <em>Local High Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalHighPreset <em>Local High Preset</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalLowAvailable <em>Local Low Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalLowAck <em>Local Low Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalLowPreset <em>Local Low Preset</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalLowLowAvailable <em>Local Low Low Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalLowLowAck <em>Local Low Low Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalLowLowPreset <em>Local Low Low Preset</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRemoteBool <em>Remote Bool</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getRemoteBoolAckValue <em>Remote Bool Ack Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isInput <em>Input</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalBool <em>Local Bool</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalScaleAvailable <em>Local Scale Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalScaleFactor <em>Local Scale Factor</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getLocalScaleOffset <em>Local Scale Offset</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isListMonitorPreset <em>List Monitor Preset</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isListMonitorListIsAlarm <em>List Monitor List Is Alarm</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isListMonitorAckRequired <em>List Monitor Ack Required</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getListMonitorItems <em>List Monitor Items</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getDebugInformation <em>Debug Information</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalBoolAvailable <em>Local Bool Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isLocalBoolAck <em>Local Bool Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isIgnoreSummary <em>Ignore Summary</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isBlock <em>Block</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getHdStorage <em>Hd Storage</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getMapper <em>Mapper</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getSimulationValue <em>Simulation Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#isRoundingAvailable <em>Rounding Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ItemImpl#getRoundingValue <em>Rounding Value</em>}</li>
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
     * The default value of the '{@link #getLocalMin() <em>Local Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalMin()
     * @generated
     * @ordered
     */
    protected static final Double LOCAL_MIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalMin() <em>Local Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalMin()
     * @generated
     * @ordered
     */
    protected Double localMin = LOCAL_MIN_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalMinAvailable() <em>Local Min Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalMinAvailable()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_MIN_AVAILABLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isLocalMinAvailable() <em>Local Min Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalMinAvailable()
     * @generated
     * @ordered
     */
    protected boolean localMinAvailable = LOCAL_MIN_AVAILABLE_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalMinAck() <em>Local Min Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalMinAck()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_MIN_ACK_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isLocalMinAck() <em>Local Min Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalMinAck()
     * @generated
     * @ordered
     */
    protected boolean localMinAck = LOCAL_MIN_ACK_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalMax() <em>Local Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalMax()
     * @generated
     * @ordered
     */
    protected static final Double LOCAL_MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalMax() <em>Local Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalMax()
     * @generated
     * @ordered
     */
    protected Double localMax = LOCAL_MAX_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalMaxAvailable() <em>Local Max Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalMaxAvailable()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_MAX_AVAILABLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isLocalMaxAvailable() <em>Local Max Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalMaxAvailable()
     * @generated
     * @ordered
     */
    protected boolean localMaxAvailable = LOCAL_MAX_AVAILABLE_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalMaxAck() <em>Local Max Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalMaxAck()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_MAX_ACK_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isLocalMaxAck() <em>Local Max Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalMaxAck()
     * @generated
     * @ordered
     */
    protected boolean localMaxAck = LOCAL_MAX_ACK_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalHighHighAvailable() <em>Local High High Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalHighHighAvailable()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_HIGH_HIGH_AVAILABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocalHighHighAvailable() <em>Local High High Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalHighHighAvailable()
     * @generated
     * @ordered
     */
    protected boolean localHighHighAvailable = LOCAL_HIGH_HIGH_AVAILABLE_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalHighHighAck() <em>Local High High Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalHighHighAck()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_HIGH_HIGH_ACK_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isLocalHighHighAck() <em>Local High High Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalHighHighAck()
     * @generated
     * @ordered
     */
    protected boolean localHighHighAck = LOCAL_HIGH_HIGH_ACK_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalHighHighPreset() <em>Local High High Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalHighHighPreset()
     * @generated
     * @ordered
     */
    protected static final Double LOCAL_HIGH_HIGH_PRESET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalHighHighPreset() <em>Local High High Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalHighHighPreset()
     * @generated
     * @ordered
     */
    protected Double localHighHighPreset = LOCAL_HIGH_HIGH_PRESET_EDEFAULT;

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
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected String location = LOCATION_EDEFAULT;

    /**
     * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponent()
     * @generated
     * @ordered
     */
    protected static final String COMPONENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponent()
     * @generated
     * @ordered
     */
    protected String component = COMPONENT_EDEFAULT;

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
     * The default value of the '{@link #isLocalHighAvailable() <em>Local High Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalHighAvailable()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_HIGH_AVAILABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocalHighAvailable() <em>Local High Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalHighAvailable()
     * @generated
     * @ordered
     */
    protected boolean localHighAvailable = LOCAL_HIGH_AVAILABLE_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalHighAck() <em>Local High Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalHighAck()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_HIGH_ACK_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocalHighAck() <em>Local High Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalHighAck()
     * @generated
     * @ordered
     */
    protected boolean localHighAck = LOCAL_HIGH_ACK_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalHighPreset() <em>Local High Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalHighPreset()
     * @generated
     * @ordered
     */
    protected static final Double LOCAL_HIGH_PRESET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalHighPreset() <em>Local High Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalHighPreset()
     * @generated
     * @ordered
     */
    protected Double localHighPreset = LOCAL_HIGH_PRESET_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalLowAvailable() <em>Local Low Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalLowAvailable()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_LOW_AVAILABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocalLowAvailable() <em>Local Low Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalLowAvailable()
     * @generated
     * @ordered
     */
    protected boolean localLowAvailable = LOCAL_LOW_AVAILABLE_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalLowAck() <em>Local Low Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalLowAck()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_LOW_ACK_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocalLowAck() <em>Local Low Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalLowAck()
     * @generated
     * @ordered
     */
    protected boolean localLowAck = LOCAL_LOW_ACK_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalLowPreset() <em>Local Low Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalLowPreset()
     * @generated
     * @ordered
     */
    protected static final Double LOCAL_LOW_PRESET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalLowPreset() <em>Local Low Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalLowPreset()
     * @generated
     * @ordered
     */
    protected Double localLowPreset = LOCAL_LOW_PRESET_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalLowLowAvailable() <em>Local Low Low Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalLowLowAvailable()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_LOW_LOW_AVAILABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocalLowLowAvailable() <em>Local Low Low Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalLowLowAvailable()
     * @generated
     * @ordered
     */
    protected boolean localLowLowAvailable = LOCAL_LOW_LOW_AVAILABLE_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalLowLowAck() <em>Local Low Low Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalLowLowAck()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_LOW_LOW_ACK_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isLocalLowLowAck() <em>Local Low Low Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalLowLowAck()
     * @generated
     * @ordered
     */
    protected boolean localLowLowAck = LOCAL_LOW_LOW_ACK_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalLowLowPreset() <em>Local Low Low Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalLowLowPreset()
     * @generated
     * @ordered
     */
    protected static final Double LOCAL_LOW_LOW_PRESET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalLowLowPreset() <em>Local Low Low Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalLowLowPreset()
     * @generated
     * @ordered
     */
    protected Double localLowLowPreset = LOCAL_LOW_LOW_PRESET_EDEFAULT;

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
     * The default value of the '{@link #getLocalBool() <em>Local Bool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalBool()
     * @generated
     * @ordered
     */
    protected static final Boolean LOCAL_BOOL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalBool() <em>Local Bool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalBool()
     * @generated
     * @ordered
     */
    protected Boolean localBool = LOCAL_BOOL_EDEFAULT;

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
     * The default value of the '{@link #isListMonitorPreset() <em>List Monitor Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isListMonitorPreset()
     * @generated
     * @ordered
     */
    protected static final boolean LIST_MONITOR_PRESET_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isListMonitorPreset() <em>List Monitor Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isListMonitorPreset()
     * @generated
     * @ordered
     */
    protected boolean listMonitorPreset = LIST_MONITOR_PRESET_EDEFAULT;

    /**
     * The default value of the '{@link #isListMonitorListIsAlarm() <em>List Monitor List Is Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isListMonitorListIsAlarm()
     * @generated
     * @ordered
     */
    protected static final boolean LIST_MONITOR_LIST_IS_ALARM_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isListMonitorListIsAlarm() <em>List Monitor List Is Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isListMonitorListIsAlarm()
     * @generated
     * @ordered
     */
    protected boolean listMonitorListIsAlarm = LIST_MONITOR_LIST_IS_ALARM_EDEFAULT;

    /**
     * The default value of the '{@link #isListMonitorAckRequired() <em>List Monitor Ack Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isListMonitorAckRequired()
     * @generated
     * @ordered
     */
    protected static final boolean LIST_MONITOR_ACK_REQUIRED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isListMonitorAckRequired() <em>List Monitor Ack Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isListMonitorAckRequired()
     * @generated
     * @ordered
     */
    protected boolean listMonitorAckRequired = LIST_MONITOR_ACK_REQUIRED_EDEFAULT;

    /**
     * The cached value of the '{@link #getListMonitorItems() <em>List Monitor Items</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListMonitorItems()
     * @generated
     * @ordered
     */
    protected EList<String> listMonitorItems;

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
     * The default value of the '{@link #isLocalBoolAvailable() <em>Local Bool Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalBoolAvailable()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_BOOL_AVAILABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocalBoolAvailable() <em>Local Bool Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalBoolAvailable()
     * @generated
     * @ordered
     */
    protected boolean localBoolAvailable = LOCAL_BOOL_AVAILABLE_EDEFAULT;

    /**
     * The default value of the '{@link #isLocalBoolAck() <em>Local Bool Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalBoolAck()
     * @generated
     * @ordered
     */
    protected static final boolean LOCAL_BOOL_ACK_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocalBoolAck() <em>Local Bool Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocalBoolAck()
     * @generated
     * @ordered
     */
    protected boolean localBoolAck = LOCAL_BOOL_ACK_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ItemImpl()
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
        return ModelPackage.Literals.ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDevice()
    {
        return device;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDevice(String newDevice)
    {
        String oldDevice = device;
        device = newDevice;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__DEVICE, oldDevice, device));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType getDataType()
    {
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataType(DataType newDataType)
    {
        DataType oldDataType = dataType;
        dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__DATA_TYPE, oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUnit()
    {
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnit(String newUnit)
    {
        String oldUnit = unit;
        unit = newUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__UNIT, oldUnit, unit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias()
    {
        return alias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias)
    {
        String oldAlias = alias;
        alias = newAlias;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__ALIAS, oldAlias, alias));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription)
    {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDefaultChain()
    {
        return defaultChain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultChain(boolean newDefaultChain)
    {
        boolean oldDefaultChain = defaultChain;
        defaultChain = newDefaultChain;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__DEFAULT_CHAIN, oldDefaultChain, defaultChain));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalMin()
    {
        return localMin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalMin(Double newLocalMin)
    {
        Double oldLocalMin = localMin;
        localMin = newLocalMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_MIN, oldLocalMin, localMin));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalMinAvailable()
    {
        return localMinAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalMinAvailable(boolean newLocalMinAvailable)
    {
        boolean oldLocalMinAvailable = localMinAvailable;
        localMinAvailable = newLocalMinAvailable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_MIN_AVAILABLE, oldLocalMinAvailable, localMinAvailable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalMinAck()
    {
        return localMinAck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalMinAck(boolean newLocalMinAck)
    {
        boolean oldLocalMinAck = localMinAck;
        localMinAck = newLocalMinAck;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_MIN_ACK, oldLocalMinAck, localMinAck));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalMax()
    {
        return localMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalMax(Double newLocalMax)
    {
        Double oldLocalMax = localMax;
        localMax = newLocalMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_MAX, oldLocalMax, localMax));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalMaxAvailable()
    {
        return localMaxAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalMaxAvailable(boolean newLocalMaxAvailable)
    {
        boolean oldLocalMaxAvailable = localMaxAvailable;
        localMaxAvailable = newLocalMaxAvailable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_MAX_AVAILABLE, oldLocalMaxAvailable, localMaxAvailable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalMaxAck()
    {
        return localMaxAck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalMaxAck(boolean newLocalMaxAck)
    {
        boolean oldLocalMaxAck = localMaxAck;
        localMaxAck = newLocalMaxAck;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_MAX_ACK, oldLocalMaxAck, localMaxAck));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalHighHighAvailable()
    {
        return localHighHighAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalHighHighAvailable(boolean newLocalHighHighAvailable)
    {
        boolean oldLocalHighHighAvailable = localHighHighAvailable;
        localHighHighAvailable = newLocalHighHighAvailable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH_HIGH_AVAILABLE, oldLocalHighHighAvailable, localHighHighAvailable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalHighHighAck()
    {
        return localHighHighAck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalHighHighAck(boolean newLocalHighHighAck)
    {
        boolean oldLocalHighHighAck = localHighHighAck;
        localHighHighAck = newLocalHighHighAck;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH_HIGH_ACK, oldLocalHighHighAck, localHighHighAck));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalHighHighPreset()
    {
        return localHighHighPreset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalHighHighPreset(Double newLocalHighHighPreset)
    {
        Double oldLocalHighHighPreset = localHighHighPreset;
        localHighHighPreset = newLocalHighHighPreset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH_HIGH_PRESET, oldLocalHighHighPreset, localHighHighPreset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEventCommand()
    {
        return eventCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventCommand(boolean newEventCommand)
    {
        boolean oldEventCommand = eventCommand;
        eventCommand = newEventCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__EVENT_COMMAND, oldEventCommand, eventCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalManual()
    {
        return localManual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalManual(boolean newLocalManual)
    {
        boolean oldLocalManual = localManual;
        localManual = newLocalManual;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_MANUAL, oldLocalManual, localManual));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteManual()
    {
        return remoteManual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteManual(boolean newRemoteManual)
    {
        boolean oldRemoteManual = remoteManual;
        remoteManual = newRemoteManual;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__REMOTE_MANUAL, oldRemoteManual, remoteManual));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSystem()
    {
        return system;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSystem(String newSystem)
    {
        String oldSystem = system;
        system = newSystem;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__SYSTEM, oldSystem, system));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(String newLocation)
    {
        String oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getComponent()
    {
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComponent(String newComponent)
    {
        String oldComponent = component;
        component = newComponent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__COMPONENT, oldComponent, component));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteMin()
    {
        return remoteMin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteMin(boolean newRemoteMin)
    {
        boolean oldRemoteMin = remoteMin;
        remoteMin = newRemoteMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__REMOTE_MIN, oldRemoteMin, remoteMin));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteMax()
    {
        return remoteMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteMax(boolean newRemoteMax)
    {
        boolean oldRemoteMax = remoteMax;
        remoteMax = newRemoteMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__REMOTE_MAX, oldRemoteMax, remoteMax));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteHighHigh()
    {
        return remoteHighHigh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteHighHigh(boolean newRemoteHighHigh)
    {
        boolean oldRemoteHighHigh = remoteHighHigh;
        remoteHighHigh = newRemoteHighHigh;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__REMOTE_HIGH_HIGH, oldRemoteHighHigh, remoteHighHigh));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteHigh()
    {
        return remoteHigh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteHigh(boolean newRemoteHigh)
    {
        boolean oldRemoteHigh = remoteHigh;
        remoteHigh = newRemoteHigh;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__REMOTE_HIGH, oldRemoteHigh, remoteHigh));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteLow()
    {
        return remoteLow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteLow(boolean newRemoteLow)
    {
        boolean oldRemoteLow = remoteLow;
        remoteLow = newRemoteLow;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__REMOTE_LOW, oldRemoteLow, remoteLow));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteLowLow()
    {
        return remoteLowLow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteLowLow(boolean newRemoteLowLow)
    {
        boolean oldRemoteLowLow = remoteLowLow;
        remoteLowLow = newRemoteLowLow;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__REMOTE_LOW_LOW, oldRemoteLowLow, remoteLowLow));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalHighAvailable()
    {
        return localHighAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalHighAvailable(boolean newLocalHighAvailable)
    {
        boolean oldLocalHighAvailable = localHighAvailable;
        localHighAvailable = newLocalHighAvailable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH_AVAILABLE, oldLocalHighAvailable, localHighAvailable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalHighAck()
    {
        return localHighAck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalHighAck(boolean newLocalHighAck)
    {
        boolean oldLocalHighAck = localHighAck;
        localHighAck = newLocalHighAck;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH_ACK, oldLocalHighAck, localHighAck));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalHighPreset()
    {
        return localHighPreset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalHighPreset(Double newLocalHighPreset)
    {
        Double oldLocalHighPreset = localHighPreset;
        localHighPreset = newLocalHighPreset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_HIGH_PRESET, oldLocalHighPreset, localHighPreset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalLowAvailable()
    {
        return localLowAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalLowAvailable(boolean newLocalLowAvailable)
    {
        boolean oldLocalLowAvailable = localLowAvailable;
        localLowAvailable = newLocalLowAvailable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW_AVAILABLE, oldLocalLowAvailable, localLowAvailable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalLowAck()
    {
        return localLowAck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalLowAck(boolean newLocalLowAck)
    {
        boolean oldLocalLowAck = localLowAck;
        localLowAck = newLocalLowAck;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW_ACK, oldLocalLowAck, localLowAck));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalLowPreset()
    {
        return localLowPreset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalLowPreset(Double newLocalLowPreset)
    {
        Double oldLocalLowPreset = localLowPreset;
        localLowPreset = newLocalLowPreset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW_PRESET, oldLocalLowPreset, localLowPreset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalLowLowAvailable()
    {
        return localLowLowAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalLowLowAvailable(boolean newLocalLowLowAvailable)
    {
        boolean oldLocalLowLowAvailable = localLowLowAvailable;
        localLowLowAvailable = newLocalLowLowAvailable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW_LOW_AVAILABLE, oldLocalLowLowAvailable, localLowLowAvailable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalLowLowAck()
    {
        return localLowLowAck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalLowLowAck(boolean newLocalLowLowAck)
    {
        boolean oldLocalLowLowAck = localLowLowAck;
        localLowLowAck = newLocalLowLowAck;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW_LOW_ACK, oldLocalLowLowAck, localLowLowAck));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalLowLowPreset()
    {
        return localLowLowPreset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalLowLowPreset(Double newLocalLowLowPreset)
    {
        Double oldLocalLowLowPreset = localLowLowPreset;
        localLowLowPreset = newLocalLowLowPreset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_LOW_LOW_PRESET, oldLocalLowLowPreset, localLowLowPreset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRemoteBool()
    {
        return remoteBool;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteBool(boolean newRemoteBool)
    {
        boolean oldRemoteBool = remoteBool;
        remoteBool = newRemoteBool;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__REMOTE_BOOL, oldRemoteBool, remoteBool));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getRemoteBoolAckValue()
    {
        return remoteBoolAckValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteBoolAckValue(Boolean newRemoteBoolAckValue)
    {
        Boolean oldRemoteBoolAckValue = remoteBoolAckValue;
        remoteBoolAckValue = newRemoteBoolAckValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE, oldRemoteBoolAckValue, remoteBoolAckValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInput()
    {
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInput(boolean newInput)
    {
        boolean oldInput = input;
        input = newInput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__INPUT, oldInput, input));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOutput()
    {
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutput(boolean newOutput)
    {
        boolean oldOutput = output;
        output = newOutput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__OUTPUT, oldOutput, output));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getLocalBool()
    {
        return localBool;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalBool(Boolean newLocalBool)
    {
        Boolean oldLocalBool = localBool;
        localBool = newLocalBool;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_BOOL, oldLocalBool, localBool));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalScaleAvailable()
    {
        return localScaleAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalScaleAvailable(boolean newLocalScaleAvailable)
    {
        boolean oldLocalScaleAvailable = localScaleAvailable;
        localScaleAvailable = newLocalScaleAvailable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE, oldLocalScaleAvailable, localScaleAvailable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalScaleFactor()
    {
        return localScaleFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalScaleFactor(Double newLocalScaleFactor)
    {
        Double oldLocalScaleFactor = localScaleFactor;
        localScaleFactor = newLocalScaleFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_SCALE_FACTOR, oldLocalScaleFactor, localScaleFactor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getLocalScaleOffset()
    {
        return localScaleOffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalScaleOffset(Double newLocalScaleOffset)
    {
        Double oldLocalScaleOffset = localScaleOffset;
        localScaleOffset = newLocalScaleOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_SCALE_OFFSET, oldLocalScaleOffset, localScaleOffset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isListMonitorPreset()
    {
        return listMonitorPreset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListMonitorPreset(boolean newListMonitorPreset)
    {
        boolean oldListMonitorPreset = listMonitorPreset;
        listMonitorPreset = newListMonitorPreset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LIST_MONITOR_PRESET, oldListMonitorPreset, listMonitorPreset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isListMonitorListIsAlarm()
    {
        return listMonitorListIsAlarm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListMonitorListIsAlarm(boolean newListMonitorListIsAlarm)
    {
        boolean oldListMonitorListIsAlarm = listMonitorListIsAlarm;
        listMonitorListIsAlarm = newListMonitorListIsAlarm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LIST_MONITOR_LIST_IS_ALARM, oldListMonitorListIsAlarm, listMonitorListIsAlarm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isListMonitorAckRequired()
    {
        return listMonitorAckRequired;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListMonitorAckRequired(boolean newListMonitorAckRequired)
    {
        boolean oldListMonitorAckRequired = listMonitorAckRequired;
        listMonitorAckRequired = newListMonitorAckRequired;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LIST_MONITOR_ACK_REQUIRED, oldListMonitorAckRequired, listMonitorAckRequired));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getListMonitorItems()
    {
        if (listMonitorItems == null)
        {
            listMonitorItems = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.ITEM__LIST_MONITOR_ITEMS);
        }
        return listMonitorItems;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDebugInformation()
    {
        return debugInformation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDebugInformation(String newDebugInformation)
    {
        String oldDebugInformation = debugInformation;
        debugInformation = newDebugInformation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__DEBUG_INFORMATION, oldDebugInformation, debugInformation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalBoolAvailable()
    {
        return localBoolAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalBoolAvailable(boolean newLocalBoolAvailable)
    {
        boolean oldLocalBoolAvailable = localBoolAvailable;
        localBoolAvailable = newLocalBoolAvailable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_BOOL_AVAILABLE, oldLocalBoolAvailable, localBoolAvailable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocalBoolAck()
    {
        return localBoolAck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalBoolAck(boolean newLocalBoolAck)
    {
        boolean oldLocalBoolAck = localBoolAck;
        localBoolAck = newLocalBoolAck;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__LOCAL_BOOL_ACK, oldLocalBoolAck, localBoolAck));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIgnoreSummary()
    {
        return ignoreSummary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIgnoreSummary(boolean newIgnoreSummary)
    {
        boolean oldIgnoreSummary = ignoreSummary;
        ignoreSummary = newIgnoreSummary;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__IGNORE_SUMMARY, oldIgnoreSummary, ignoreSummary));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBlock()
    {
        return block;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBlock(boolean newBlock)
    {
        boolean oldBlock = block;
        block = newBlock;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__BLOCK, oldBlock, block));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEnabled()
    {
        return enabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnabled(boolean newEnabled)
    {
        boolean oldEnabled = enabled;
        enabled = newEnabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__ENABLED, oldEnabled, enabled));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHdStorage()
    {
        return hdStorage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHdStorage(String newHdStorage)
    {
        String oldHdStorage = hdStorage;
        hdStorage = newHdStorage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__HD_STORAGE, oldHdStorage, hdStorage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Mapper> getMapper()
    {
        if (mapper == null)
        {
            mapper = new EObjectContainmentEList<Mapper>(Mapper.class, this, ModelPackage.ITEM__MAPPER);
        }
        return mapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSimulationValue()
    {
        return simulationValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimulationValue(String newSimulationValue)
    {
        String oldSimulationValue = simulationValue;
        simulationValue = newSimulationValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__SIMULATION_VALUE, oldSimulationValue, simulationValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRoundingAvailable()
    {
        return roundingAvailable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoundingAvailable(boolean newRoundingAvailable)
    {
        boolean oldRoundingAvailable = roundingAvailable;
        roundingAvailable = newRoundingAvailable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__ROUNDING_AVAILABLE, oldRoundingAvailable, roundingAvailable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rounding getRoundingValue()
    {
        return roundingValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoundingValue(Rounding newRoundingValue)
    {
        Rounding oldRoundingValue = roundingValue;
        roundingValue = newRoundingValue == null ? ROUNDING_VALUE_EDEFAULT : newRoundingValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__ROUNDING_VALUE, oldRoundingValue, roundingValue));
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
            case ModelPackage.ITEM__MAPPER:
                return ((InternalEList<?>)getMapper()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.ITEM__DEVICE:
                return getDevice();
            case ModelPackage.ITEM__NAME:
                return getName();
            case ModelPackage.ITEM__DATA_TYPE:
                return getDataType();
            case ModelPackage.ITEM__UNIT:
                return getUnit();
            case ModelPackage.ITEM__ALIAS:
                return getAlias();
            case ModelPackage.ITEM__DESCRIPTION:
                return getDescription();
            case ModelPackage.ITEM__DEFAULT_CHAIN:
                return isDefaultChain();
            case ModelPackage.ITEM__LOCAL_MIN:
                return getLocalMin();
            case ModelPackage.ITEM__LOCAL_MIN_AVAILABLE:
                return isLocalMinAvailable();
            case ModelPackage.ITEM__LOCAL_MIN_ACK:
                return isLocalMinAck();
            case ModelPackage.ITEM__LOCAL_MAX:
                return getLocalMax();
            case ModelPackage.ITEM__LOCAL_MAX_AVAILABLE:
                return isLocalMaxAvailable();
            case ModelPackage.ITEM__LOCAL_MAX_ACK:
                return isLocalMaxAck();
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_AVAILABLE:
                return isLocalHighHighAvailable();
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_ACK:
                return isLocalHighHighAck();
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_PRESET:
                return getLocalHighHighPreset();
            case ModelPackage.ITEM__EVENT_COMMAND:
                return isEventCommand();
            case ModelPackage.ITEM__LOCAL_MANUAL:
                return isLocalManual();
            case ModelPackage.ITEM__REMOTE_MANUAL:
                return isRemoteManual();
            case ModelPackage.ITEM__SYSTEM:
                return getSystem();
            case ModelPackage.ITEM__LOCATION:
                return getLocation();
            case ModelPackage.ITEM__COMPONENT:
                return getComponent();
            case ModelPackage.ITEM__REMOTE_MIN:
                return isRemoteMin();
            case ModelPackage.ITEM__REMOTE_MAX:
                return isRemoteMax();
            case ModelPackage.ITEM__REMOTE_HIGH_HIGH:
                return isRemoteHighHigh();
            case ModelPackage.ITEM__REMOTE_HIGH:
                return isRemoteHigh();
            case ModelPackage.ITEM__REMOTE_LOW:
                return isRemoteLow();
            case ModelPackage.ITEM__REMOTE_LOW_LOW:
                return isRemoteLowLow();
            case ModelPackage.ITEM__LOCAL_HIGH_AVAILABLE:
                return isLocalHighAvailable();
            case ModelPackage.ITEM__LOCAL_HIGH_ACK:
                return isLocalHighAck();
            case ModelPackage.ITEM__LOCAL_HIGH_PRESET:
                return getLocalHighPreset();
            case ModelPackage.ITEM__LOCAL_LOW_AVAILABLE:
                return isLocalLowAvailable();
            case ModelPackage.ITEM__LOCAL_LOW_ACK:
                return isLocalLowAck();
            case ModelPackage.ITEM__LOCAL_LOW_PRESET:
                return getLocalLowPreset();
            case ModelPackage.ITEM__LOCAL_LOW_LOW_AVAILABLE:
                return isLocalLowLowAvailable();
            case ModelPackage.ITEM__LOCAL_LOW_LOW_ACK:
                return isLocalLowLowAck();
            case ModelPackage.ITEM__LOCAL_LOW_LOW_PRESET:
                return getLocalLowLowPreset();
            case ModelPackage.ITEM__REMOTE_BOOL:
                return isRemoteBool();
            case ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE:
                return getRemoteBoolAckValue();
            case ModelPackage.ITEM__INPUT:
                return isInput();
            case ModelPackage.ITEM__OUTPUT:
                return isOutput();
            case ModelPackage.ITEM__LOCAL_BOOL:
                return getLocalBool();
            case ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE:
                return isLocalScaleAvailable();
            case ModelPackage.ITEM__LOCAL_SCALE_FACTOR:
                return getLocalScaleFactor();
            case ModelPackage.ITEM__LOCAL_SCALE_OFFSET:
                return getLocalScaleOffset();
            case ModelPackage.ITEM__LIST_MONITOR_PRESET:
                return isListMonitorPreset();
            case ModelPackage.ITEM__LIST_MONITOR_LIST_IS_ALARM:
                return isListMonitorListIsAlarm();
            case ModelPackage.ITEM__LIST_MONITOR_ACK_REQUIRED:
                return isListMonitorAckRequired();
            case ModelPackage.ITEM__LIST_MONITOR_ITEMS:
                return getListMonitorItems();
            case ModelPackage.ITEM__DEBUG_INFORMATION:
                return getDebugInformation();
            case ModelPackage.ITEM__LOCAL_BOOL_AVAILABLE:
                return isLocalBoolAvailable();
            case ModelPackage.ITEM__LOCAL_BOOL_ACK:
                return isLocalBoolAck();
            case ModelPackage.ITEM__IGNORE_SUMMARY:
                return isIgnoreSummary();
            case ModelPackage.ITEM__BLOCK:
                return isBlock();
            case ModelPackage.ITEM__ENABLED:
                return isEnabled();
            case ModelPackage.ITEM__HD_STORAGE:
                return getHdStorage();
            case ModelPackage.ITEM__MAPPER:
                return getMapper();
            case ModelPackage.ITEM__SIMULATION_VALUE:
                return getSimulationValue();
            case ModelPackage.ITEM__ROUNDING_AVAILABLE:
                return isRoundingAvailable();
            case ModelPackage.ITEM__ROUNDING_VALUE:
                return getRoundingValue();
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
            case ModelPackage.ITEM__DEVICE:
                setDevice((String)newValue);
                return;
            case ModelPackage.ITEM__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.ITEM__DATA_TYPE:
                setDataType((DataType)newValue);
                return;
            case ModelPackage.ITEM__UNIT:
                setUnit((String)newValue);
                return;
            case ModelPackage.ITEM__ALIAS:
                setAlias((String)newValue);
                return;
            case ModelPackage.ITEM__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case ModelPackage.ITEM__DEFAULT_CHAIN:
                setDefaultChain((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_MIN:
                setLocalMin((Double)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_MIN_AVAILABLE:
                setLocalMinAvailable((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_MIN_ACK:
                setLocalMinAck((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_MAX:
                setLocalMax((Double)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_MAX_AVAILABLE:
                setLocalMaxAvailable((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_MAX_ACK:
                setLocalMaxAck((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_AVAILABLE:
                setLocalHighHighAvailable((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_ACK:
                setLocalHighHighAck((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_PRESET:
                setLocalHighHighPreset((Double)newValue);
                return;
            case ModelPackage.ITEM__EVENT_COMMAND:
                setEventCommand((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_MANUAL:
                setLocalManual((Boolean)newValue);
                return;
            case ModelPackage.ITEM__REMOTE_MANUAL:
                setRemoteManual((Boolean)newValue);
                return;
            case ModelPackage.ITEM__SYSTEM:
                setSystem((String)newValue);
                return;
            case ModelPackage.ITEM__LOCATION:
                setLocation((String)newValue);
                return;
            case ModelPackage.ITEM__COMPONENT:
                setComponent((String)newValue);
                return;
            case ModelPackage.ITEM__REMOTE_MIN:
                setRemoteMin((Boolean)newValue);
                return;
            case ModelPackage.ITEM__REMOTE_MAX:
                setRemoteMax((Boolean)newValue);
                return;
            case ModelPackage.ITEM__REMOTE_HIGH_HIGH:
                setRemoteHighHigh((Boolean)newValue);
                return;
            case ModelPackage.ITEM__REMOTE_HIGH:
                setRemoteHigh((Boolean)newValue);
                return;
            case ModelPackage.ITEM__REMOTE_LOW:
                setRemoteLow((Boolean)newValue);
                return;
            case ModelPackage.ITEM__REMOTE_LOW_LOW:
                setRemoteLowLow((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_AVAILABLE:
                setLocalHighAvailable((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_ACK:
                setLocalHighAck((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_PRESET:
                setLocalHighPreset((Double)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_AVAILABLE:
                setLocalLowAvailable((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_ACK:
                setLocalLowAck((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_PRESET:
                setLocalLowPreset((Double)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_LOW_AVAILABLE:
                setLocalLowLowAvailable((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_LOW_ACK:
                setLocalLowLowAck((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_LOW_PRESET:
                setLocalLowLowPreset((Double)newValue);
                return;
            case ModelPackage.ITEM__REMOTE_BOOL:
                setRemoteBool((Boolean)newValue);
                return;
            case ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE:
                setRemoteBoolAckValue((Boolean)newValue);
                return;
            case ModelPackage.ITEM__INPUT:
                setInput((Boolean)newValue);
                return;
            case ModelPackage.ITEM__OUTPUT:
                setOutput((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_BOOL:
                setLocalBool((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE:
                setLocalScaleAvailable((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_FACTOR:
                setLocalScaleFactor((Double)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_OFFSET:
                setLocalScaleOffset((Double)newValue);
                return;
            case ModelPackage.ITEM__LIST_MONITOR_PRESET:
                setListMonitorPreset((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LIST_MONITOR_LIST_IS_ALARM:
                setListMonitorListIsAlarm((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LIST_MONITOR_ACK_REQUIRED:
                setListMonitorAckRequired((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LIST_MONITOR_ITEMS:
                getListMonitorItems().clear();
                getListMonitorItems().addAll((Collection<? extends String>)newValue);
                return;
            case ModelPackage.ITEM__DEBUG_INFORMATION:
                setDebugInformation((String)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_BOOL_AVAILABLE:
                setLocalBoolAvailable((Boolean)newValue);
                return;
            case ModelPackage.ITEM__LOCAL_BOOL_ACK:
                setLocalBoolAck((Boolean)newValue);
                return;
            case ModelPackage.ITEM__IGNORE_SUMMARY:
                setIgnoreSummary((Boolean)newValue);
                return;
            case ModelPackage.ITEM__BLOCK:
                setBlock((Boolean)newValue);
                return;
            case ModelPackage.ITEM__ENABLED:
                setEnabled((Boolean)newValue);
                return;
            case ModelPackage.ITEM__HD_STORAGE:
                setHdStorage((String)newValue);
                return;
            case ModelPackage.ITEM__MAPPER:
                getMapper().clear();
                getMapper().addAll((Collection<? extends Mapper>)newValue);
                return;
            case ModelPackage.ITEM__SIMULATION_VALUE:
                setSimulationValue((String)newValue);
                return;
            case ModelPackage.ITEM__ROUNDING_AVAILABLE:
                setRoundingAvailable((Boolean)newValue);
                return;
            case ModelPackage.ITEM__ROUNDING_VALUE:
                setRoundingValue((Rounding)newValue);
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
            case ModelPackage.ITEM__DEVICE:
                setDevice(DEVICE_EDEFAULT);
                return;
            case ModelPackage.ITEM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.ITEM__DATA_TYPE:
                setDataType(DATA_TYPE_EDEFAULT);
                return;
            case ModelPackage.ITEM__UNIT:
                setUnit(UNIT_EDEFAULT);
                return;
            case ModelPackage.ITEM__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case ModelPackage.ITEM__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case ModelPackage.ITEM__DEFAULT_CHAIN:
                setDefaultChain(DEFAULT_CHAIN_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_MIN:
                setLocalMin(LOCAL_MIN_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_MIN_AVAILABLE:
                setLocalMinAvailable(LOCAL_MIN_AVAILABLE_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_MIN_ACK:
                setLocalMinAck(LOCAL_MIN_ACK_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_MAX:
                setLocalMax(LOCAL_MAX_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_MAX_AVAILABLE:
                setLocalMaxAvailable(LOCAL_MAX_AVAILABLE_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_MAX_ACK:
                setLocalMaxAck(LOCAL_MAX_ACK_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_AVAILABLE:
                setLocalHighHighAvailable(LOCAL_HIGH_HIGH_AVAILABLE_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_ACK:
                setLocalHighHighAck(LOCAL_HIGH_HIGH_ACK_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_PRESET:
                setLocalHighHighPreset(LOCAL_HIGH_HIGH_PRESET_EDEFAULT);
                return;
            case ModelPackage.ITEM__EVENT_COMMAND:
                setEventCommand(EVENT_COMMAND_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_MANUAL:
                setLocalManual(LOCAL_MANUAL_EDEFAULT);
                return;
            case ModelPackage.ITEM__REMOTE_MANUAL:
                setRemoteManual(REMOTE_MANUAL_EDEFAULT);
                return;
            case ModelPackage.ITEM__SYSTEM:
                setSystem(SYSTEM_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCATION:
                setLocation(LOCATION_EDEFAULT);
                return;
            case ModelPackage.ITEM__COMPONENT:
                setComponent(COMPONENT_EDEFAULT);
                return;
            case ModelPackage.ITEM__REMOTE_MIN:
                setRemoteMin(REMOTE_MIN_EDEFAULT);
                return;
            case ModelPackage.ITEM__REMOTE_MAX:
                setRemoteMax(REMOTE_MAX_EDEFAULT);
                return;
            case ModelPackage.ITEM__REMOTE_HIGH_HIGH:
                setRemoteHighHigh(REMOTE_HIGH_HIGH_EDEFAULT);
                return;
            case ModelPackage.ITEM__REMOTE_HIGH:
                setRemoteHigh(REMOTE_HIGH_EDEFAULT);
                return;
            case ModelPackage.ITEM__REMOTE_LOW:
                setRemoteLow(REMOTE_LOW_EDEFAULT);
                return;
            case ModelPackage.ITEM__REMOTE_LOW_LOW:
                setRemoteLowLow(REMOTE_LOW_LOW_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_AVAILABLE:
                setLocalHighAvailable(LOCAL_HIGH_AVAILABLE_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_ACK:
                setLocalHighAck(LOCAL_HIGH_ACK_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_HIGH_PRESET:
                setLocalHighPreset(LOCAL_HIGH_PRESET_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_AVAILABLE:
                setLocalLowAvailable(LOCAL_LOW_AVAILABLE_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_ACK:
                setLocalLowAck(LOCAL_LOW_ACK_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_PRESET:
                setLocalLowPreset(LOCAL_LOW_PRESET_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_LOW_AVAILABLE:
                setLocalLowLowAvailable(LOCAL_LOW_LOW_AVAILABLE_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_LOW_ACK:
                setLocalLowLowAck(LOCAL_LOW_LOW_ACK_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_LOW_LOW_PRESET:
                setLocalLowLowPreset(LOCAL_LOW_LOW_PRESET_EDEFAULT);
                return;
            case ModelPackage.ITEM__REMOTE_BOOL:
                setRemoteBool(REMOTE_BOOL_EDEFAULT);
                return;
            case ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE:
                setRemoteBoolAckValue(REMOTE_BOOL_ACK_VALUE_EDEFAULT);
                return;
            case ModelPackage.ITEM__INPUT:
                setInput(INPUT_EDEFAULT);
                return;
            case ModelPackage.ITEM__OUTPUT:
                setOutput(OUTPUT_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_BOOL:
                setLocalBool(LOCAL_BOOL_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE:
                setLocalScaleAvailable(LOCAL_SCALE_AVAILABLE_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_FACTOR:
                setLocalScaleFactor(LOCAL_SCALE_FACTOR_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_SCALE_OFFSET:
                setLocalScaleOffset(LOCAL_SCALE_OFFSET_EDEFAULT);
                return;
            case ModelPackage.ITEM__LIST_MONITOR_PRESET:
                setListMonitorPreset(LIST_MONITOR_PRESET_EDEFAULT);
                return;
            case ModelPackage.ITEM__LIST_MONITOR_LIST_IS_ALARM:
                setListMonitorListIsAlarm(LIST_MONITOR_LIST_IS_ALARM_EDEFAULT);
                return;
            case ModelPackage.ITEM__LIST_MONITOR_ACK_REQUIRED:
                setListMonitorAckRequired(LIST_MONITOR_ACK_REQUIRED_EDEFAULT);
                return;
            case ModelPackage.ITEM__LIST_MONITOR_ITEMS:
                getListMonitorItems().clear();
                return;
            case ModelPackage.ITEM__DEBUG_INFORMATION:
                setDebugInformation(DEBUG_INFORMATION_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_BOOL_AVAILABLE:
                setLocalBoolAvailable(LOCAL_BOOL_AVAILABLE_EDEFAULT);
                return;
            case ModelPackage.ITEM__LOCAL_BOOL_ACK:
                setLocalBoolAck(LOCAL_BOOL_ACK_EDEFAULT);
                return;
            case ModelPackage.ITEM__IGNORE_SUMMARY:
                setIgnoreSummary(IGNORE_SUMMARY_EDEFAULT);
                return;
            case ModelPackage.ITEM__BLOCK:
                setBlock(BLOCK_EDEFAULT);
                return;
            case ModelPackage.ITEM__ENABLED:
                setEnabled(ENABLED_EDEFAULT);
                return;
            case ModelPackage.ITEM__HD_STORAGE:
                setHdStorage(HD_STORAGE_EDEFAULT);
                return;
            case ModelPackage.ITEM__MAPPER:
                getMapper().clear();
                return;
            case ModelPackage.ITEM__SIMULATION_VALUE:
                setSimulationValue(SIMULATION_VALUE_EDEFAULT);
                return;
            case ModelPackage.ITEM__ROUNDING_AVAILABLE:
                setRoundingAvailable(ROUNDING_AVAILABLE_EDEFAULT);
                return;
            case ModelPackage.ITEM__ROUNDING_VALUE:
                setRoundingValue(ROUNDING_VALUE_EDEFAULT);
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
            case ModelPackage.ITEM__DEVICE:
                return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
            case ModelPackage.ITEM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.ITEM__DATA_TYPE:
                return dataType != DATA_TYPE_EDEFAULT;
            case ModelPackage.ITEM__UNIT:
                return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
            case ModelPackage.ITEM__ALIAS:
                return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
            case ModelPackage.ITEM__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case ModelPackage.ITEM__DEFAULT_CHAIN:
                return defaultChain != DEFAULT_CHAIN_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_MIN:
                return LOCAL_MIN_EDEFAULT == null ? localMin != null : !LOCAL_MIN_EDEFAULT.equals(localMin);
            case ModelPackage.ITEM__LOCAL_MIN_AVAILABLE:
                return localMinAvailable != LOCAL_MIN_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_MIN_ACK:
                return localMinAck != LOCAL_MIN_ACK_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_MAX:
                return LOCAL_MAX_EDEFAULT == null ? localMax != null : !LOCAL_MAX_EDEFAULT.equals(localMax);
            case ModelPackage.ITEM__LOCAL_MAX_AVAILABLE:
                return localMaxAvailable != LOCAL_MAX_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_MAX_ACK:
                return localMaxAck != LOCAL_MAX_ACK_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_AVAILABLE:
                return localHighHighAvailable != LOCAL_HIGH_HIGH_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_ACK:
                return localHighHighAck != LOCAL_HIGH_HIGH_ACK_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH_PRESET:
                return LOCAL_HIGH_HIGH_PRESET_EDEFAULT == null ? localHighHighPreset != null : !LOCAL_HIGH_HIGH_PRESET_EDEFAULT.equals(localHighHighPreset);
            case ModelPackage.ITEM__EVENT_COMMAND:
                return eventCommand != EVENT_COMMAND_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_MANUAL:
                return localManual != LOCAL_MANUAL_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_MANUAL:
                return remoteManual != REMOTE_MANUAL_EDEFAULT;
            case ModelPackage.ITEM__SYSTEM:
                return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
            case ModelPackage.ITEM__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
            case ModelPackage.ITEM__COMPONENT:
                return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
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
            case ModelPackage.ITEM__LOCAL_HIGH_AVAILABLE:
                return localHighAvailable != LOCAL_HIGH_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_HIGH_ACK:
                return localHighAck != LOCAL_HIGH_ACK_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_HIGH_PRESET:
                return LOCAL_HIGH_PRESET_EDEFAULT == null ? localHighPreset != null : !LOCAL_HIGH_PRESET_EDEFAULT.equals(localHighPreset);
            case ModelPackage.ITEM__LOCAL_LOW_AVAILABLE:
                return localLowAvailable != LOCAL_LOW_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_LOW_ACK:
                return localLowAck != LOCAL_LOW_ACK_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_LOW_PRESET:
                return LOCAL_LOW_PRESET_EDEFAULT == null ? localLowPreset != null : !LOCAL_LOW_PRESET_EDEFAULT.equals(localLowPreset);
            case ModelPackage.ITEM__LOCAL_LOW_LOW_AVAILABLE:
                return localLowLowAvailable != LOCAL_LOW_LOW_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_LOW_LOW_ACK:
                return localLowLowAck != LOCAL_LOW_LOW_ACK_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_LOW_LOW_PRESET:
                return LOCAL_LOW_LOW_PRESET_EDEFAULT == null ? localLowLowPreset != null : !LOCAL_LOW_LOW_PRESET_EDEFAULT.equals(localLowLowPreset);
            case ModelPackage.ITEM__REMOTE_BOOL:
                return remoteBool != REMOTE_BOOL_EDEFAULT;
            case ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE:
                return REMOTE_BOOL_ACK_VALUE_EDEFAULT == null ? remoteBoolAckValue != null : !REMOTE_BOOL_ACK_VALUE_EDEFAULT.equals(remoteBoolAckValue);
            case ModelPackage.ITEM__INPUT:
                return input != INPUT_EDEFAULT;
            case ModelPackage.ITEM__OUTPUT:
                return output != OUTPUT_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_BOOL:
                return LOCAL_BOOL_EDEFAULT == null ? localBool != null : !LOCAL_BOOL_EDEFAULT.equals(localBool);
            case ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE:
                return localScaleAvailable != LOCAL_SCALE_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_SCALE_FACTOR:
                return LOCAL_SCALE_FACTOR_EDEFAULT == null ? localScaleFactor != null : !LOCAL_SCALE_FACTOR_EDEFAULT.equals(localScaleFactor);
            case ModelPackage.ITEM__LOCAL_SCALE_OFFSET:
                return LOCAL_SCALE_OFFSET_EDEFAULT == null ? localScaleOffset != null : !LOCAL_SCALE_OFFSET_EDEFAULT.equals(localScaleOffset);
            case ModelPackage.ITEM__LIST_MONITOR_PRESET:
                return listMonitorPreset != LIST_MONITOR_PRESET_EDEFAULT;
            case ModelPackage.ITEM__LIST_MONITOR_LIST_IS_ALARM:
                return listMonitorListIsAlarm != LIST_MONITOR_LIST_IS_ALARM_EDEFAULT;
            case ModelPackage.ITEM__LIST_MONITOR_ACK_REQUIRED:
                return listMonitorAckRequired != LIST_MONITOR_ACK_REQUIRED_EDEFAULT;
            case ModelPackage.ITEM__LIST_MONITOR_ITEMS:
                return listMonitorItems != null && !listMonitorItems.isEmpty();
            case ModelPackage.ITEM__DEBUG_INFORMATION:
                return DEBUG_INFORMATION_EDEFAULT == null ? debugInformation != null : !DEBUG_INFORMATION_EDEFAULT.equals(debugInformation);
            case ModelPackage.ITEM__LOCAL_BOOL_AVAILABLE:
                return localBoolAvailable != LOCAL_BOOL_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__LOCAL_BOOL_ACK:
                return localBoolAck != LOCAL_BOOL_ACK_EDEFAULT;
            case ModelPackage.ITEM__IGNORE_SUMMARY:
                return ignoreSummary != IGNORE_SUMMARY_EDEFAULT;
            case ModelPackage.ITEM__BLOCK:
                return block != BLOCK_EDEFAULT;
            case ModelPackage.ITEM__ENABLED:
                return enabled != ENABLED_EDEFAULT;
            case ModelPackage.ITEM__HD_STORAGE:
                return HD_STORAGE_EDEFAULT == null ? hdStorage != null : !HD_STORAGE_EDEFAULT.equals(hdStorage);
            case ModelPackage.ITEM__MAPPER:
                return mapper != null && !mapper.isEmpty();
            case ModelPackage.ITEM__SIMULATION_VALUE:
                return SIMULATION_VALUE_EDEFAULT == null ? simulationValue != null : !SIMULATION_VALUE_EDEFAULT.equals(simulationValue);
            case ModelPackage.ITEM__ROUNDING_AVAILABLE:
                return roundingAvailable != ROUNDING_AVAILABLE_EDEFAULT;
            case ModelPackage.ITEM__ROUNDING_VALUE:
                return roundingValue != ROUNDING_VALUE_EDEFAULT;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (device: ");
        result.append(device);
        result.append(", name: ");
        result.append(name);
        result.append(", dataType: ");
        result.append(dataType);
        result.append(", unit: ");
        result.append(unit);
        result.append(", alias: ");
        result.append(alias);
        result.append(", description: ");
        result.append(description);
        result.append(", defaultChain: ");
        result.append(defaultChain);
        result.append(", localMin: ");
        result.append(localMin);
        result.append(", localMinAvailable: ");
        result.append(localMinAvailable);
        result.append(", localMinAck: ");
        result.append(localMinAck);
        result.append(", localMax: ");
        result.append(localMax);
        result.append(", localMaxAvailable: ");
        result.append(localMaxAvailable);
        result.append(", localMaxAck: ");
        result.append(localMaxAck);
        result.append(", localHighHighAvailable: ");
        result.append(localHighHighAvailable);
        result.append(", localHighHighAck: ");
        result.append(localHighHighAck);
        result.append(", localHighHighPreset: ");
        result.append(localHighHighPreset);
        result.append(", eventCommand: ");
        result.append(eventCommand);
        result.append(", localManual: ");
        result.append(localManual);
        result.append(", remoteManual: ");
        result.append(remoteManual);
        result.append(", system: ");
        result.append(system);
        result.append(", location: ");
        result.append(location);
        result.append(", component: ");
        result.append(component);
        result.append(", remoteMin: ");
        result.append(remoteMin);
        result.append(", remoteMax: ");
        result.append(remoteMax);
        result.append(", remoteHighHigh: ");
        result.append(remoteHighHigh);
        result.append(", remoteHigh: ");
        result.append(remoteHigh);
        result.append(", remoteLow: ");
        result.append(remoteLow);
        result.append(", remoteLowLow: ");
        result.append(remoteLowLow);
        result.append(", localHighAvailable: ");
        result.append(localHighAvailable);
        result.append(", localHighAck: ");
        result.append(localHighAck);
        result.append(", localHighPreset: ");
        result.append(localHighPreset);
        result.append(", localLowAvailable: ");
        result.append(localLowAvailable);
        result.append(", localLowAck: ");
        result.append(localLowAck);
        result.append(", localLowPreset: ");
        result.append(localLowPreset);
        result.append(", localLowLowAvailable: ");
        result.append(localLowLowAvailable);
        result.append(", localLowLowAck: ");
        result.append(localLowLowAck);
        result.append(", localLowLowPreset: ");
        result.append(localLowLowPreset);
        result.append(", remoteBool: ");
        result.append(remoteBool);
        result.append(", remoteBoolAckValue: ");
        result.append(remoteBoolAckValue);
        result.append(", input: ");
        result.append(input);
        result.append(", output: ");
        result.append(output);
        result.append(", localBool: ");
        result.append(localBool);
        result.append(", localScaleAvailable: ");
        result.append(localScaleAvailable);
        result.append(", localScaleFactor: ");
        result.append(localScaleFactor);
        result.append(", localScaleOffset: ");
        result.append(localScaleOffset);
        result.append(", listMonitorPreset: ");
        result.append(listMonitorPreset);
        result.append(", listMonitorListIsAlarm: ");
        result.append(listMonitorListIsAlarm);
        result.append(", listMonitorAckRequired: ");
        result.append(listMonitorAckRequired);
        result.append(", listMonitorItems: ");
        result.append(listMonitorItems);
        result.append(", debugInformation: ");
        result.append(debugInformation);
        result.append(", localBoolAvailable: ");
        result.append(localBoolAvailable);
        result.append(", localBoolAck: ");
        result.append(localBoolAck);
        result.append(", ignoreSummary: ");
        result.append(ignoreSummary);
        result.append(", block: ");
        result.append(block);
        result.append(", enabled: ");
        result.append(enabled);
        result.append(", hdStorage: ");
        result.append(hdStorage);
        result.append(", simulationValue: ");
        result.append(simulationValue);
        result.append(", roundingAvailable: ");
        result.append(roundingAvailable);
        result.append(", roundingValue: ");
        result.append(roundingValue);
        result.append(')');
        return result.toString();
    }

} //ItemImpl

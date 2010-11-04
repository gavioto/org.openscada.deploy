/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.inavare.vims.iolist.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getDevice <em>Device</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getName <em>Name</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getUnit <em>Unit</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getDescription <em>Description</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isDefaultChain <em>Default Chain</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocalMin <em>Local Min</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalMinAck <em>Local Min Ack</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocalMax <em>Local Max</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalMaxAck <em>Local Max Ack</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalHighHighAvailable <em>Local High High Available</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalHighHighAck <em>Local High High Ack</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocalHighHighPreset <em>Local High High Preset</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isEventCommand <em>Event Command</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalManual <em>Local Manual</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isRemoteManual <em>Remote Manual</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getSystem <em>System</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocation <em>Location</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getComponent <em>Component</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isRemoteMin <em>Remote Min</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isRemoteMax <em>Remote Max</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isRemoteHighHigh <em>Remote High High</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isRemoteHigh <em>Remote High</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isRemoteLow <em>Remote Low</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isRemoteLowLow <em>Remote Low Low</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalHighAvailable <em>Local High Available</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalHighAck <em>Local High Ack</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocalHighPreset <em>Local High Preset</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalLowAvailable <em>Local Low Available</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalLowAck <em>Local Low Ack</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocalLowPreset <em>Local Low Preset</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalLowLowAvailable <em>Local Low Low Available</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalLowLowAck <em>Local Low Low Ack</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocalLowLowPreset <em>Local Low Low Preset</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isRemoteBool <em>Remote Bool</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isInput <em>Input</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isOutput <em>Output</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocalBool <em>Local Bool</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalScaleAvailable <em>Local Scale Available</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocalScaleFactor <em>Local Scale Factor</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getLocalScaleOffset <em>Local Scale Offset</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isListMonitorPreset <em>List Monitor Preset</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isListMonitorListIsAlarm <em>List Monitor List Is Alarm</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isListMonitorAckRequired <em>List Monitor Ack Required</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getListMonitorItems <em>List Monitor Items</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#getDebugInformation <em>Debug Information</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalBoolAvailable <em>Local Bool Available</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isLocalBoolAck <em>Local Bool Ack</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.Item#isIgnoreSummary <em>Ignore Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.inavare.vims.iolist.model.ModelPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject
{
    /**
     * Returns the value of the '<em><b>Device</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Device</em>' attribute.
     * @see #setDevice(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_Device()
     * @model required="true"
     * @generated
     */
    String getDevice();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getDevice <em>Device</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Device</em>' attribute.
     * @see #getDevice()
     * @generated
     */
    void setDevice(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' attribute.
     * The literals are from the enumeration {@link com.inavare.vims.iolist.model.DataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' attribute.
     * @see com.inavare.vims.iolist.model.DataType
     * @see #setDataType(DataType)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_DataType()
     * @model
     * @generated
     */
    DataType getDataType();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getDataType <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' attribute.
     * @see com.inavare.vims.iolist.model.DataType
     * @see #getDataType()
     * @generated
     */
    void setDataType(DataType value);

    /**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see #setUnit(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_Unit()
     * @model
     * @generated
     */
    String getUnit();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #getUnit()
     * @generated
     */
    void setUnit(String value);

    /**
     * Returns the value of the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alias</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alias</em>' attribute.
     * @see #setAlias(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_Alias()
     * @model extendedMetaData="namespace=''"
     * @generated
     */
    String getAlias();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getAlias <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alias</em>' attribute.
     * @see #getAlias()
     * @generated
     */
    void setAlias(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Default Chain</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Chain</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Chain</em>' attribute.
     * @see #setDefaultChain(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_DefaultChain()
     * @model default="true"
     * @generated
     */
    boolean isDefaultChain();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isDefaultChain <em>Default Chain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Chain</em>' attribute.
     * @see #isDefaultChain()
     * @generated
     */
    void setDefaultChain(boolean value);

    /**
     * Returns the value of the '<em><b>Local Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Min</em>' attribute.
     * @see #setLocalMin(Double)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalMin()
     * @model
     * @generated
     */
    Double getLocalMin();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocalMin <em>Local Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Min</em>' attribute.
     * @see #getLocalMin()
     * @generated
     */
    void setLocalMin(Double value);

    /**
     * Returns the value of the '<em><b>Local Min Ack</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Min Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Min Ack</em>' attribute.
     * @see #setLocalMinAck(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalMinAck()
     * @model default="true" required="true"
     * @generated
     */
    boolean isLocalMinAck();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalMinAck <em>Local Min Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Min Ack</em>' attribute.
     * @see #isLocalMinAck()
     * @generated
     */
    void setLocalMinAck(boolean value);

    /**
     * Returns the value of the '<em><b>Local Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Max</em>' attribute.
     * @see #setLocalMax(Double)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalMax()
     * @model
     * @generated
     */
    Double getLocalMax();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocalMax <em>Local Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Max</em>' attribute.
     * @see #getLocalMax()
     * @generated
     */
    void setLocalMax(Double value);

    /**
     * Returns the value of the '<em><b>Local Max Ack</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Max Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Max Ack</em>' attribute.
     * @see #setLocalMaxAck(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalMaxAck()
     * @model default="true" required="true"
     * @generated
     */
    boolean isLocalMaxAck();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalMaxAck <em>Local Max Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Max Ack</em>' attribute.
     * @see #isLocalMaxAck()
     * @generated
     */
    void setLocalMaxAck(boolean value);

    /**
     * Returns the value of the '<em><b>Local High High Available</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local High High Available</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local High High Available</em>' attribute.
     * @see #setLocalHighHighAvailable(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalHighHighAvailable()
     * @model default="false" required="true"
     * @generated
     */
    boolean isLocalHighHighAvailable();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalHighHighAvailable <em>Local High High Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local High High Available</em>' attribute.
     * @see #isLocalHighHighAvailable()
     * @generated
     */
    void setLocalHighHighAvailable(boolean value);

    /**
     * Returns the value of the '<em><b>Local High High Ack</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local High High Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local High High Ack</em>' attribute.
     * @see #setLocalHighHighAck(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalHighHighAck()
     * @model default="true" required="true"
     * @generated
     */
    boolean isLocalHighHighAck();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalHighHighAck <em>Local High High Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local High High Ack</em>' attribute.
     * @see #isLocalHighHighAck()
     * @generated
     */
    void setLocalHighHighAck(boolean value);

    /**
     * Returns the value of the '<em><b>Local High High Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local High High Preset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local High High Preset</em>' attribute.
     * @see #setLocalHighHighPreset(Double)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalHighHighPreset()
     * @model
     * @generated
     */
    Double getLocalHighHighPreset();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocalHighHighPreset <em>Local High High Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local High High Preset</em>' attribute.
     * @see #getLocalHighHighPreset()
     * @generated
     */
    void setLocalHighHighPreset(Double value);

    /**
     * Returns the value of the '<em><b>Event Command</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Command</em>' attribute.
     * @see #setEventCommand(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_EventCommand()
     * @model default="false" required="true"
     * @generated
     */
    boolean isEventCommand();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isEventCommand <em>Event Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Command</em>' attribute.
     * @see #isEventCommand()
     * @generated
     */
    void setEventCommand(boolean value);

    /**
     * Returns the value of the '<em><b>Local Manual</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Manual</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Manual</em>' attribute.
     * @see #setLocalManual(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalManual()
     * @model default="true" required="true"
     * @generated
     */
    boolean isLocalManual();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalManual <em>Local Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Manual</em>' attribute.
     * @see #isLocalManual()
     * @generated
     */
    void setLocalManual(boolean value);

    /**
     * Returns the value of the '<em><b>Remote Manual</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Manual</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Manual</em>' attribute.
     * @see #setRemoteManual(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_RemoteManual()
     * @model default="false" required="true"
     * @generated
     */
    boolean isRemoteManual();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isRemoteManual <em>Remote Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Manual</em>' attribute.
     * @see #isRemoteManual()
     * @generated
     */
    void setRemoteManual(boolean value);

    /**
     * Returns the value of the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>System</em>' attribute.
     * @see #setSystem(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_System()
     * @model
     * @generated
     */
    String getSystem();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getSystem <em>System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System</em>' attribute.
     * @see #getSystem()
     * @generated
     */
    void setSystem(String value);

    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_Location()
     * @model
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
    void setLocation(String value);

    /**
     * Returns the value of the '<em><b>Component</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' attribute.
     * @see #setComponent(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_Component()
     * @model
     * @generated
     */
    String getComponent();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getComponent <em>Component</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component</em>' attribute.
     * @see #getComponent()
     * @generated
     */
    void setComponent(String value);

    /**
     * Returns the value of the '<em><b>Remote Min</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Min</em>' attribute.
     * @see #setRemoteMin(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_RemoteMin()
     * @model default="false" required="true"
     * @generated
     */
    boolean isRemoteMin();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isRemoteMin <em>Remote Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Min</em>' attribute.
     * @see #isRemoteMin()
     * @generated
     */
    void setRemoteMin(boolean value);

    /**
     * Returns the value of the '<em><b>Remote Max</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Max</em>' attribute.
     * @see #setRemoteMax(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_RemoteMax()
     * @model default="false" required="true"
     * @generated
     */
    boolean isRemoteMax();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isRemoteMax <em>Remote Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Max</em>' attribute.
     * @see #isRemoteMax()
     * @generated
     */
    void setRemoteMax(boolean value);

    /**
     * Returns the value of the '<em><b>Remote High High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote High High</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote High High</em>' attribute.
     * @see #setRemoteHighHigh(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_RemoteHighHigh()
     * @model required="true"
     * @generated
     */
    boolean isRemoteHighHigh();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isRemoteHighHigh <em>Remote High High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote High High</em>' attribute.
     * @see #isRemoteHighHigh()
     * @generated
     */
    void setRemoteHighHigh(boolean value);

    /**
     * Returns the value of the '<em><b>Remote High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote High</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote High</em>' attribute.
     * @see #setRemoteHigh(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_RemoteHigh()
     * @model required="true"
     * @generated
     */
    boolean isRemoteHigh();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isRemoteHigh <em>Remote High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote High</em>' attribute.
     * @see #isRemoteHigh()
     * @generated
     */
    void setRemoteHigh(boolean value);

    /**
     * Returns the value of the '<em><b>Remote Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Low</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Low</em>' attribute.
     * @see #setRemoteLow(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_RemoteLow()
     * @model required="true"
     * @generated
     */
    boolean isRemoteLow();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isRemoteLow <em>Remote Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Low</em>' attribute.
     * @see #isRemoteLow()
     * @generated
     */
    void setRemoteLow(boolean value);

    /**
     * Returns the value of the '<em><b>Remote Low Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Low Low</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Low Low</em>' attribute.
     * @see #setRemoteLowLow(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_RemoteLowLow()
     * @model required="true"
     * @generated
     */
    boolean isRemoteLowLow();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isRemoteLowLow <em>Remote Low Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Low Low</em>' attribute.
     * @see #isRemoteLowLow()
     * @generated
     */
    void setRemoteLowLow(boolean value);

    /**
     * Returns the value of the '<em><b>Local High Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local High Available</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local High Available</em>' attribute.
     * @see #setLocalHighAvailable(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalHighAvailable()
     * @model required="true"
     * @generated
     */
    boolean isLocalHighAvailable();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalHighAvailable <em>Local High Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local High Available</em>' attribute.
     * @see #isLocalHighAvailable()
     * @generated
     */
    void setLocalHighAvailable(boolean value);

    /**
     * Returns the value of the '<em><b>Local High Ack</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local High Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local High Ack</em>' attribute.
     * @see #setLocalHighAck(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalHighAck()
     * @model default="false" required="true"
     * @generated
     */
    boolean isLocalHighAck();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalHighAck <em>Local High Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local High Ack</em>' attribute.
     * @see #isLocalHighAck()
     * @generated
     */
    void setLocalHighAck(boolean value);

    /**
     * Returns the value of the '<em><b>Local High Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local High Preset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local High Preset</em>' attribute.
     * @see #setLocalHighPreset(Double)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalHighPreset()
     * @model
     * @generated
     */
    Double getLocalHighPreset();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocalHighPreset <em>Local High Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local High Preset</em>' attribute.
     * @see #getLocalHighPreset()
     * @generated
     */
    void setLocalHighPreset(Double value);

    /**
     * Returns the value of the '<em><b>Local Low Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Low Available</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Low Available</em>' attribute.
     * @see #setLocalLowAvailable(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalLowAvailable()
     * @model required="true"
     * @generated
     */
    boolean isLocalLowAvailable();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalLowAvailable <em>Local Low Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Low Available</em>' attribute.
     * @see #isLocalLowAvailable()
     * @generated
     */
    void setLocalLowAvailable(boolean value);

    /**
     * Returns the value of the '<em><b>Local Low Ack</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Low Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Low Ack</em>' attribute.
     * @see #setLocalLowAck(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalLowAck()
     * @model default="false" required="true"
     * @generated
     */
    boolean isLocalLowAck();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalLowAck <em>Local Low Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Low Ack</em>' attribute.
     * @see #isLocalLowAck()
     * @generated
     */
    void setLocalLowAck(boolean value);

    /**
     * Returns the value of the '<em><b>Local Low Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Low Preset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Low Preset</em>' attribute.
     * @see #setLocalLowPreset(Double)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalLowPreset()
     * @model
     * @generated
     */
    Double getLocalLowPreset();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocalLowPreset <em>Local Low Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Low Preset</em>' attribute.
     * @see #getLocalLowPreset()
     * @generated
     */
    void setLocalLowPreset(Double value);

    /**
     * Returns the value of the '<em><b>Local Low Low Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Low Low Available</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Low Low Available</em>' attribute.
     * @see #setLocalLowLowAvailable(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalLowLowAvailable()
     * @model required="true"
     * @generated
     */
    boolean isLocalLowLowAvailable();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalLowLowAvailable <em>Local Low Low Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Low Low Available</em>' attribute.
     * @see #isLocalLowLowAvailable()
     * @generated
     */
    void setLocalLowLowAvailable(boolean value);

    /**
     * Returns the value of the '<em><b>Local Low Low Ack</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Low Low Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Low Low Ack</em>' attribute.
     * @see #setLocalLowLowAck(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalLowLowAck()
     * @model default="true" required="true"
     * @generated
     */
    boolean isLocalLowLowAck();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalLowLowAck <em>Local Low Low Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Low Low Ack</em>' attribute.
     * @see #isLocalLowLowAck()
     * @generated
     */
    void setLocalLowLowAck(boolean value);

    /**
     * Returns the value of the '<em><b>Local Low Low Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Low Low Preset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Low Low Preset</em>' attribute.
     * @see #setLocalLowLowPreset(Double)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalLowLowPreset()
     * @model
     * @generated
     */
    Double getLocalLowLowPreset();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocalLowLowPreset <em>Local Low Low Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Low Low Preset</em>' attribute.
     * @see #getLocalLowLowPreset()
     * @generated
     */
    void setLocalLowLowPreset(Double value);

    /**
     * Returns the value of the '<em><b>Remote Bool</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Bool</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Bool</em>' attribute.
     * @see #setRemoteBool(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_RemoteBool()
     * @model default="false" required="true"
     * @generated
     */
    boolean isRemoteBool();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isRemoteBool <em>Remote Bool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Bool</em>' attribute.
     * @see #isRemoteBool()
     * @generated
     */
    void setRemoteBool(boolean value);

    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #setInput(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_Input()
     * @model default="true" required="true"
     * @generated
     */
    boolean isInput();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #isInput()
     * @generated
     */
    void setInput(boolean value);

    /**
     * Returns the value of the '<em><b>Output</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' attribute.
     * @see #setOutput(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_Output()
     * @model default="true" required="true"
     * @generated
     */
    boolean isOutput();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' attribute.
     * @see #isOutput()
     * @generated
     */
    void setOutput(boolean value);

    /**
     * Returns the value of the '<em><b>Local Bool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Bool</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Bool</em>' attribute.
     * @see #setLocalBool(Boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalBool()
     * @model
     * @generated
     */
    Boolean getLocalBool();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocalBool <em>Local Bool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Bool</em>' attribute.
     * @see #getLocalBool()
     * @generated
     */
    void setLocalBool(Boolean value);

    /**
     * Returns the value of the '<em><b>Local Scale Available</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Scale Available</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Scale Available</em>' attribute.
     * @see #setLocalScaleAvailable(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalScaleAvailable()
     * @model required="true"
     * @generated
     */
    boolean isLocalScaleAvailable();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalScaleAvailable <em>Local Scale Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Scale Available</em>' attribute.
     * @see #isLocalScaleAvailable()
     * @generated
     */
    void setLocalScaleAvailable(boolean value);

    /**
     * Returns the value of the '<em><b>Local Scale Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Scale Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Scale Factor</em>' attribute.
     * @see #setLocalScaleFactor(Double)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalScaleFactor()
     * @model
     * @generated
     */
    Double getLocalScaleFactor();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocalScaleFactor <em>Local Scale Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Scale Factor</em>' attribute.
     * @see #getLocalScaleFactor()
     * @generated
     */
    void setLocalScaleFactor(Double value);

    /**
     * Returns the value of the '<em><b>Local Scale Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Scale Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Scale Offset</em>' attribute.
     * @see #setLocalScaleOffset(Double)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalScaleOffset()
     * @model
     * @generated
     */
    Double getLocalScaleOffset();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getLocalScaleOffset <em>Local Scale Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Scale Offset</em>' attribute.
     * @see #getLocalScaleOffset()
     * @generated
     */
    void setLocalScaleOffset(Double value);

    /**
     * Returns the value of the '<em><b>List Monitor Preset</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>List Monitor Preset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List Monitor Preset</em>' attribute.
     * @see #setListMonitorPreset(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_ListMonitorPreset()
     * @model default="false"
     * @generated
     */
    boolean isListMonitorPreset();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isListMonitorPreset <em>List Monitor Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>List Monitor Preset</em>' attribute.
     * @see #isListMonitorPreset()
     * @generated
     */
    void setListMonitorPreset(boolean value);

    /**
     * Returns the value of the '<em><b>List Monitor List Is Alarm</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>List Monitor List Is Alarm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List Monitor List Is Alarm</em>' attribute.
     * @see #setListMonitorListIsAlarm(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_ListMonitorListIsAlarm()
     * @model default="true"
     * @generated
     */
    boolean isListMonitorListIsAlarm();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isListMonitorListIsAlarm <em>List Monitor List Is Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>List Monitor List Is Alarm</em>' attribute.
     * @see #isListMonitorListIsAlarm()
     * @generated
     */
    void setListMonitorListIsAlarm(boolean value);

    /**
     * Returns the value of the '<em><b>List Monitor Ack Required</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>List Monitor Ack Required</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List Monitor Ack Required</em>' attribute.
     * @see #setListMonitorAckRequired(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_ListMonitorAckRequired()
     * @model default="false" required="true"
     * @generated
     */
    boolean isListMonitorAckRequired();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isListMonitorAckRequired <em>List Monitor Ack Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>List Monitor Ack Required</em>' attribute.
     * @see #isListMonitorAckRequired()
     * @generated
     */
    void setListMonitorAckRequired(boolean value);

    /**
     * Returns the value of the '<em><b>List Monitor Items</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>List Monitor Items</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List Monitor Items</em>' attribute list.
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_ListMonitorItems()
     * @model
     * @generated
     */
    EList<String> getListMonitorItems();

    /**
     * Returns the value of the '<em><b>Debug Information</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Debug Information</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Debug Information</em>' attribute.
     * @see #setDebugInformation(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_DebugInformation()
     * @model transient="true"
     * @generated
     */
    String getDebugInformation();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#getDebugInformation <em>Debug Information</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Debug Information</em>' attribute.
     * @see #getDebugInformation()
     * @generated
     */
    void setDebugInformation(String value);

    /**
     * Returns the value of the '<em><b>Local Bool Available</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Bool Available</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Bool Available</em>' attribute.
     * @see #setLocalBoolAvailable(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalBoolAvailable()
     * @model default="false" required="true"
     * @generated
     */
    boolean isLocalBoolAvailable();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalBoolAvailable <em>Local Bool Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Bool Available</em>' attribute.
     * @see #isLocalBoolAvailable()
     * @generated
     */
    void setLocalBoolAvailable(boolean value);

    /**
     * Returns the value of the '<em><b>Local Bool Ack</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Bool Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Bool Ack</em>' attribute.
     * @see #setLocalBoolAck(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_LocalBoolAck()
     * @model default="false" required="true"
     * @generated
     */
    boolean isLocalBoolAck();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isLocalBoolAck <em>Local Bool Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Bool Ack</em>' attribute.
     * @see #isLocalBoolAck()
     * @generated
     */
    void setLocalBoolAck(boolean value);

    /**
     * Returns the value of the '<em><b>Ignore Summary</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ignore Summary</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ignore Summary</em>' attribute.
     * @see #setIgnoreSummary(boolean)
     * @see com.inavare.vims.iolist.model.ModelPackage#getItem_IgnoreSummary()
     * @model default="false"
     * @generated
     */
    boolean isIgnoreSummary();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.Item#isIgnoreSummary <em>Ignore Summary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ignore Summary</em>' attribute.
     * @see #isIgnoreSummary()
     * @generated
     */
    void setIgnoreSummary(boolean value);

} // Item
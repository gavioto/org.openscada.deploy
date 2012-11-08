/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

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
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getDevice <em>Device</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getName <em>Name</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getAttributeSummaryLevel <em>Attribute Summary Level</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isEventCommand <em>Event Command</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isLocalManual <em>Local Manual</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isRemoteManual <em>Remote Manual</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getSystem <em>System</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isRemoteMin <em>Remote Min</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isRemoteMax <em>Remote Max</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isRemoteHighHigh <em>Remote High High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isRemoteHigh <em>Remote High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isRemoteLow <em>Remote Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isRemoteLowLow <em>Remote Low Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isRemoteBool <em>Remote Bool</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getRemoteBoolAckValue <em>Remote Bool Ack Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isInput <em>Input</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isOutput <em>Output</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isLocalScaleAvailable <em>Local Scale Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalScaleFactor <em>Local Scale Factor</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalScaleOffset <em>Local Scale Offset</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getDebugInformation <em>Debug Information</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isIgnoreSummary <em>Ignore Summary</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isBlock <em>Block</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getHdStorage <em>Hd Storage</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getMapper <em>Mapper</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getSimulationValue <em>Simulation Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#isRoundingAvailable <em>Rounding Available</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getRoundingValue <em>Rounding Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalHighHigh <em>Local High High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalHigh <em>Local High</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalLow <em>Local Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalLowLow <em>Local Low Low</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalMin <em>Local Min</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalMax <em>Local Max</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalListMonitor <em>Local List Monitor</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getLocalBooleanMonitor <em>Local Boolean Monitor</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Item#getDefaultMonitorDemote <em>Default Monitor Demote</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getItem()
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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Device()
     * @model required="true"
     * @generated
     */
    String getDevice ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getDevice <em>Device</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Device</em>' attribute.
     * @see #getDevice()
     * @generated
     */
    void setDevice ( String value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Name()
     * @model unique="false"
     * @generated
     */
    String getName ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName ( String value );

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.openscada.deploy.iolist.model.DataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.DataType
     * @see #setDataType(DataType)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_DataType()
     * @model
     * @generated
     */
    DataType getDataType ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getDataType <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.DataType
     * @see #getDataType()
     * @generated
     */
    void setDataType ( DataType value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Unit()
     * @model
     * @generated
     */
    String getUnit ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #getUnit()
     * @generated
     */
    void setUnit ( String value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Alias()
     * @model id="true"
     *        extendedMetaData="namespace=''"
     * @generated
     */
    String getAlias ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getAlias <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alias</em>' attribute.
     * @see #getAlias()
     * @generated
     */
    void setAlias ( String value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Description()
     * @model
     * @generated
     */
    String getDescription ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription ( String value );

    /**
     * Returns the value of the '<em><b>Attribute Summary Level</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If unset the attributes will not be summarized. If set the level specifies how often the item is re-imported.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Attribute Summary Level</em>' attribute.
     * @see #setAttributeSummaryLevel(int)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_AttributeSummaryLevel()
     * @model default="0"
     * @generated
     */
    int getAttributeSummaryLevel ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getAttributeSummaryLevel <em>Attribute Summary Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute Summary Level</em>' attribute.
     * @see #getAttributeSummaryLevel()
     * @generated
     */
    void setAttributeSummaryLevel ( int value );

    /**
     * Returns the value of the '<em><b>Local Min</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Min</em>' containment reference.
     * @see #setLocalMin(LevelMonitor)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalMin()
     * @model containment="true"
     * @generated
     */
    LevelMonitor getLocalMin ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalMin <em>Local Min</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Min</em>' containment reference.
     * @see #getLocalMin()
     * @generated
     */
    void setLocalMin ( LevelMonitor value );

    /**
     * Returns the value of the '<em><b>Local Max</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Max</em>' containment reference.
     * @see #setLocalMax(LevelMonitor)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalMax()
     * @model containment="true"
     * @generated
     */
    LevelMonitor getLocalMax ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalMax <em>Local Max</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Max</em>' containment reference.
     * @see #getLocalMax()
     * @generated
     */
    void setLocalMax ( LevelMonitor value );

    /**
     * Returns the value of the '<em><b>Local List Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local List Monitor</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local List Monitor</em>' containment reference.
     * @see #setLocalListMonitor(ListMonitor)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalListMonitor()
     * @model containment="true"
     * @generated
     */
    ListMonitor getLocalListMonitor ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalListMonitor <em>Local List Monitor</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local List Monitor</em>' containment reference.
     * @see #getLocalListMonitor()
     * @generated
     */
    void setLocalListMonitor ( ListMonitor value );

    /**
     * Returns the value of the '<em><b>Local Boolean Monitor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Boolean Monitor</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Boolean Monitor</em>' containment reference.
     * @see #setLocalBooleanMonitor(BooleanMonitor)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalBooleanMonitor()
     * @model containment="true"
     * @generated
     */
    BooleanMonitor getLocalBooleanMonitor ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalBooleanMonitor <em>Local Boolean Monitor</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Boolean Monitor</em>' containment reference.
     * @see #getLocalBooleanMonitor()
     * @generated
     */
    void setLocalBooleanMonitor ( BooleanMonitor value );

    /**
     * Returns the value of the '<em><b>Default Monitor Demote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Monitor Demote</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Monitor Demote</em>' attribute.
     * @see #setDefaultMonitorDemote(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_DefaultMonitorDemote()
     * @model
     * @generated
     */
    String getDefaultMonitorDemote ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getDefaultMonitorDemote <em>Default Monitor Demote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Monitor Demote</em>' attribute.
     * @see #getDefaultMonitorDemote()
     * @generated
     */
    void setDefaultMonitorDemote ( String value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_EventCommand()
     * @model default="false" required="true"
     * @generated
     */
    boolean isEventCommand ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isEventCommand <em>Event Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Command</em>' attribute.
     * @see #isEventCommand()
     * @generated
     */
    void setEventCommand ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalManual()
     * @model default="true" required="true"
     * @generated
     */
    boolean isLocalManual ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isLocalManual <em>Local Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Manual</em>' attribute.
     * @see #isLocalManual()
     * @generated
     */
    void setLocalManual ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RemoteManual()
     * @model default="false" required="true"
     * @generated
     */
    boolean isRemoteManual ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isRemoteManual <em>Remote Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Manual</em>' attribute.
     * @see #isRemoteManual()
     * @generated
     */
    void setRemoteManual ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_System()
     * @model
     * @generated
     */
    String getSystem ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getSystem <em>System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System</em>' attribute.
     * @see #getSystem()
     * @generated
     */
    void setSystem ( String value );

    /**
     * Returns the value of the '<em><b>Hierarchy</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hierarchy</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hierarchy</em>' attribute list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Hierarchy()
     * @model unique="false"
     * @generated
     */
    EList<String> getHierarchy ();

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RemoteMin()
     * @model default="false" required="true"
     * @generated
     */
    boolean isRemoteMin ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isRemoteMin <em>Remote Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Min</em>' attribute.
     * @see #isRemoteMin()
     * @generated
     */
    void setRemoteMin ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RemoteMax()
     * @model default="false" required="true"
     * @generated
     */
    boolean isRemoteMax ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isRemoteMax <em>Remote Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Max</em>' attribute.
     * @see #isRemoteMax()
     * @generated
     */
    void setRemoteMax ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RemoteHighHigh()
     * @model required="true"
     * @generated
     */
    boolean isRemoteHighHigh ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isRemoteHighHigh <em>Remote High High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote High High</em>' attribute.
     * @see #isRemoteHighHigh()
     * @generated
     */
    void setRemoteHighHigh ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RemoteHigh()
     * @model required="true"
     * @generated
     */
    boolean isRemoteHigh ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isRemoteHigh <em>Remote High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote High</em>' attribute.
     * @see #isRemoteHigh()
     * @generated
     */
    void setRemoteHigh ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RemoteLow()
     * @model required="true"
     * @generated
     */
    boolean isRemoteLow ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isRemoteLow <em>Remote Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Low</em>' attribute.
     * @see #isRemoteLow()
     * @generated
     */
    void setRemoteLow ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RemoteLowLow()
     * @model required="true"
     * @generated
     */
    boolean isRemoteLowLow ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isRemoteLowLow <em>Remote Low Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Low Low</em>' attribute.
     * @see #isRemoteLowLow()
     * @generated
     */
    void setRemoteLowLow ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RemoteBool()
     * @model default="false" required="true"
     * @generated
     */
    boolean isRemoteBool ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isRemoteBool <em>Remote Bool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Bool</em>' attribute.
     * @see #isRemoteBool()
     * @generated
     */
    void setRemoteBool ( boolean value );

    /**
     * Returns the value of the '<em><b>Remote Bool Ack Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Bool Ack Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Bool Ack Value</em>' attribute.
     * @see #setRemoteBoolAckValue(Boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RemoteBoolAckValue()
     * @model
     * @generated
     */
    Boolean getRemoteBoolAckValue ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getRemoteBoolAckValue <em>Remote Bool Ack Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Bool Ack Value</em>' attribute.
     * @see #getRemoteBoolAckValue()
     * @generated
     */
    void setRemoteBoolAckValue ( Boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Input()
     * @model default="true" required="true"
     * @generated
     */
    boolean isInput ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #isInput()
     * @generated
     */
    void setInput ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Output()
     * @model default="true" required="true"
     * @generated
     */
    boolean isOutput ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' attribute.
     * @see #isOutput()
     * @generated
     */
    void setOutput ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalScaleAvailable()
     * @model required="true"
     * @generated
     */
    boolean isLocalScaleAvailable ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isLocalScaleAvailable <em>Local Scale Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Scale Available</em>' attribute.
     * @see #isLocalScaleAvailable()
     * @generated
     */
    void setLocalScaleAvailable ( boolean value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalScaleFactor()
     * @model
     * @generated
     */
    Double getLocalScaleFactor ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalScaleFactor <em>Local Scale Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Scale Factor</em>' attribute.
     * @see #getLocalScaleFactor()
     * @generated
     */
    void setLocalScaleFactor ( Double value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalScaleOffset()
     * @model
     * @generated
     */
    Double getLocalScaleOffset ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalScaleOffset <em>Local Scale Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Scale Offset</em>' attribute.
     * @see #getLocalScaleOffset()
     * @generated
     */
    void setLocalScaleOffset ( Double value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_DebugInformation()
     * @model transient="true"
     * @generated
     */
    String getDebugInformation ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getDebugInformation <em>Debug Information</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Debug Information</em>' attribute.
     * @see #getDebugInformation()
     * @generated
     */
    void setDebugInformation ( String value );

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_IgnoreSummary()
     * @model default="false"
     * @generated
     */
    boolean isIgnoreSummary ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isIgnoreSummary <em>Ignore Summary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ignore Summary</em>' attribute.
     * @see #isIgnoreSummary()
     * @generated
     */
    void setIgnoreSummary ( boolean value );

    /**
     * Returns the value of the '<em><b>Block</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Block</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Block</em>' attribute.
     * @see #setBlock(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Block()
     * @model default="true" required="true"
     * @generated
     */
    boolean isBlock ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isBlock <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Block</em>' attribute.
     * @see #isBlock()
     * @generated
     */
    void setBlock ( boolean value );

    /**
     * Returns the value of the '<em><b>Enabled</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enabled</em>' attribute.
     * @see #setEnabled(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Enabled()
     * @model default="true" required="true"
     * @generated
     */
    boolean isEnabled ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #isEnabled()
     * @generated
     */
    void setEnabled ( boolean value );

    /**
     * Returns the value of the '<em><b>Hd Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hd Storage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hd Storage</em>' attribute.
     * @see #setHdStorage(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_HdStorage()
     * @model
     * @generated
     */
    String getHdStorage ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getHdStorage <em>Hd Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hd Storage</em>' attribute.
     * @see #getHdStorage()
     * @generated
     */
    void setHdStorage ( String value );

    /**
     * Returns the value of the '<em><b>Mapper</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.Mapper}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapper</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapper</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_Mapper()
     * @model containment="true"
     * @generated
     */
    EList<Mapper> getMapper ();

    /**
     * Returns the value of the '<em><b>Simulation Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Simulation Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Simulation Value</em>' attribute.
     * @see #setSimulationValue(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_SimulationValue()
     * @model
     * @generated
     */
    String getSimulationValue ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getSimulationValue <em>Simulation Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simulation Value</em>' attribute.
     * @see #getSimulationValue()
     * @generated
     */
    void setSimulationValue ( String value );

    /**
     * Returns the value of the '<em><b>Rounding Available</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rounding Available</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rounding Available</em>' attribute.
     * @see #setRoundingAvailable(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RoundingAvailable()
     * @model default="false"
     * @generated
     */
    boolean isRoundingAvailable ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#isRoundingAvailable <em>Rounding Available</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rounding Available</em>' attribute.
     * @see #isRoundingAvailable()
     * @generated
     */
    void setRoundingAvailable ( boolean value );

    /**
     * Returns the value of the '<em><b>Rounding Value</b></em>' attribute.
     * The default value is <code>"NONE"</code>.
     * The literals are from the enumeration {@link org.openscada.deploy.iolist.model.Rounding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rounding Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rounding Value</em>' attribute.
     * @see org.openscada.deploy.iolist.model.Rounding
     * @see #setRoundingValue(Rounding)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_RoundingValue()
     * @model default="NONE"
     * @generated
     */
    Rounding getRoundingValue ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getRoundingValue <em>Rounding Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rounding Value</em>' attribute.
     * @see org.openscada.deploy.iolist.model.Rounding
     * @see #getRoundingValue()
     * @generated
     */
    void setRoundingValue ( Rounding value );

    /**
     * Returns the value of the '<em><b>Local High High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local High High</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local High High</em>' containment reference.
     * @see #setLocalHighHigh(LevelMonitor)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalHighHigh()
     * @model containment="true"
     * @generated
     */
    LevelMonitor getLocalHighHigh ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalHighHigh <em>Local High High</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local High High</em>' containment reference.
     * @see #getLocalHighHigh()
     * @generated
     */
    void setLocalHighHigh ( LevelMonitor value );

    /**
     * Returns the value of the '<em><b>Local High</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local High</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local High</em>' containment reference.
     * @see #setLocalHigh(LevelMonitor)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalHigh()
     * @model containment="true"
     * @generated
     */
    LevelMonitor getLocalHigh ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalHigh <em>Local High</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local High</em>' containment reference.
     * @see #getLocalHigh()
     * @generated
     */
    void setLocalHigh ( LevelMonitor value );

    /**
     * Returns the value of the '<em><b>Local Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Low</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Low</em>' containment reference.
     * @see #setLocalLow(LevelMonitor)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalLow()
     * @model containment="true"
     * @generated
     */
    LevelMonitor getLocalLow ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalLow <em>Local Low</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Low</em>' containment reference.
     * @see #getLocalLow()
     * @generated
     */
    void setLocalLow ( LevelMonitor value );

    /**
     * Returns the value of the '<em><b>Local Low Low</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Low Low</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Low Low</em>' containment reference.
     * @see #setLocalLowLow(LevelMonitor)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getItem_LocalLowLow()
     * @model containment="true"
     * @generated
     */
    LevelMonitor getLocalLowLow ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Item#getLocalLowLow <em>Local Low Low</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Low Low</em>' containment reference.
     * @see #getLocalLowLow()
     * @generated
     */
    void setLocalLowLow ( LevelMonitor value );

} // Item

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.scada.core.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Monitor Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.ListMonitorEntry#getValue <em>Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ListMonitorEntry#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ListMonitorEntry#getRequireAck <em>Require Ack</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitorEntry()
 * @model
 * @generated
 */
public interface ListMonitorEntry extends EObject
{
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(Variant)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitorEntry_Value()
     * @model dataType="org.openscada.deploy.iolist.model.Variant" required="true"
     * @generated
     */
    Variant getValue ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ListMonitorEntry#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue ( Variant value );

    /**
     * Returns the value of the '<em><b>Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Severity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Severity</em>' attribute.
     * @see #setSeverity(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitorEntry_Severity()
     * @model dataType="org.openscada.deploy.iolist.model.ListSeverity"
     * @generated
     */
    String getSeverity ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ListMonitorEntry#getSeverity <em>Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Severity</em>' attribute.
     * @see #getSeverity()
     * @generated
     */
    void setSeverity ( String value );

    /**
     * Returns the value of the '<em><b>Require Ack</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Require Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Require Ack</em>' attribute.
     * @see #setRequireAck(Boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitorEntry_RequireAck()
     * @model
     * @generated
     */
    Boolean getRequireAck ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ListMonitorEntry#getRequireAck <em>Require Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Require Ack</em>' attribute.
     * @see #getRequireAck()
     * @generated
     */
    void setRequireAck ( Boolean value );

} // ListMonitorEntry

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.scada.ae.data.Severity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.BasicMonitor#isAck <em>Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.BasicMonitor#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getBasicMonitor()
 * @model abstract="true"
 * @generated
 */
public interface BasicMonitor extends Monitor
{
    /**
     * Returns the value of the '<em><b>Ack</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ack</em>' attribute.
     * @see #setAck(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getBasicMonitor_Ack()
     * @model default="true" required="true"
     * @generated
     */
    boolean isAck ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.BasicMonitor#isAck <em>Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ack</em>' attribute.
     * @see #isAck()
     * @generated
     */
    void setAck ( boolean value );

    /**
     * Returns the value of the '<em><b>Severity</b></em>' attribute.
     * The default value is <code>"ERROR"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Severity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Severity</em>' attribute.
     * @see #setSeverity(Severity)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getBasicMonitor_Severity()
     * @model default="ERROR" dataType="org.openscada.deploy.iolist.model.Severity" required="true"
     * @generated
     */
    Severity getSeverity ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.BasicMonitor#getSeverity <em>Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Severity</em>' attribute.
     * @see #getSeverity()
     * @generated
     */
    void setSeverity ( Severity value );

} // BasicMonitor

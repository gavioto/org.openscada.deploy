/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.ListMonitor#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ListMonitor#isDefaultAck <em>Default Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ListMonitor#getDefaultSeverity <em>Default Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitor()
 * @model
 * @generated
 */
public interface ListMonitor extends Monitor
{
    /**
     * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.ListMonitorEntry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entries</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitor_Entries()
     * @model containment="true"
     * @generated
     */
    EList<ListMonitorEntry> getEntries ();

    /**
     * Returns the value of the '<em><b>Default Ack</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Ack</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Ack</em>' attribute.
     * @see #setDefaultAck(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitor_DefaultAck()
     * @model default="false" required="true"
     * @generated
     */
    boolean isDefaultAck ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ListMonitor#isDefaultAck <em>Default Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Ack</em>' attribute.
     * @see #isDefaultAck()
     * @generated
     */
    void setDefaultAck ( boolean value );

    /**
     * Returns the value of the '<em><b>Default Severity</b></em>' attribute.
     * The default value is <code>"OK"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Severity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Severity</em>' attribute.
     * @see #setDefaultSeverity(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitor_DefaultSeverity()
     * @model default="OK" dataType="org.openscada.deploy.iolist.model.ListSeverity" required="true"
     * @generated
     */
    String getDefaultSeverity ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ListMonitor#getDefaultSeverity <em>Default Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Severity</em>' attribute.
     * @see #getDefaultSeverity()
     * @generated
     */
    void setDefaultSeverity ( String value );

} // ListMonitor

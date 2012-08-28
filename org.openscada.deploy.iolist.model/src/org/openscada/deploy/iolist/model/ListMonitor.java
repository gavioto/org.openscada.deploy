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
 *   <li>{@link org.openscada.deploy.iolist.model.ListMonitor#getValues <em>Values</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ListMonitor#isListIsAlarm <em>List Is Alarm</em>}</li>
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
     * Returns the value of the '<em><b>Values</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Values</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' attribute list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitor_Values()
     * @model
     * @generated
     */
    EList<String> getValues();

    /**
     * Returns the value of the '<em><b>List Is Alarm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>List Is Alarm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List Is Alarm</em>' attribute.
     * @see #setListIsAlarm(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getListMonitor_ListIsAlarm()
     * @model required="true"
     * @generated
     */
    boolean isListIsAlarm();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ListMonitor#isListIsAlarm <em>List Is Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>List Is Alarm</em>' attribute.
     * @see #isListIsAlarm()
     * @generated
     */
    void setListIsAlarm(boolean value);

} // ListMonitor

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.Monitor#isActive <em>Active</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Monitor#isSuppressEvents <em>Suppress Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getMonitor()
 * @model abstract="true"
 * @generated
 */
public interface Monitor extends EObject
{
    /**
     * Returns the value of the '<em><b>Active</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active</em>' attribute.
     * @see #setActive(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMonitor_Active()
     * @model default="true" required="true"
     * @generated
     */
    boolean isActive ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Monitor#isActive <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Active</em>' attribute.
     * @see #isActive()
     * @generated
     */
    void setActive ( boolean value );

    /**
     * Returns the value of the '<em><b>Suppress Events</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Suppress Events</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Suppress Events</em>' attribute.
     * @see #setSuppressEvents(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMonitor_SuppressEvents()
     * @model default="false"
     * @generated
     */
    boolean isSuppressEvents ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Monitor#isSuppressEvents <em>Suppress Events</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Suppress Events</em>' attribute.
     * @see #isSuppressEvents()
     * @generated
     */
    void setSuppressEvents ( boolean value );

} // Monitor

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.BooleanMonitor#isOkValue <em>Ok Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getBooleanMonitor()
 * @model
 * @generated
 */
public interface BooleanMonitor extends Monitor
{
    /**
     * Returns the value of the '<em><b>Ok Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ok Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ok Value</em>' attribute.
     * @see #setOkValue(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getBooleanMonitor_OkValue()
     * @model required="true"
     * @generated
     */
    boolean isOkValue ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.BooleanMonitor#isOkValue <em>Ok Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ok Value</em>' attribute.
     * @see #isOkValue()
     * @generated
     */
    void setOkValue ( boolean value );

} // BooleanMonitor

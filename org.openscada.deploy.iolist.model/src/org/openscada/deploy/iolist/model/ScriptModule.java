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
 * A representation of the model object '<em><b>Script Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptModule#getData <em>Data</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptModule#isResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptModule()
 * @model
 * @generated
 */
public interface ScriptModule extends EObject
{
    /**
     * Returns the value of the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' attribute.
     * @see #setData(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptModule_Data()
     * @model required="true"
     * @generated
     */
    String getData();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ScriptModule#getData <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' attribute.
     * @see #getData()
     * @generated
     */
    void setData(String value);

    /**
     * Returns the value of the '<em><b>Resource</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' attribute.
     * @see #setResource(boolean)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptModule_Resource()
     * @model default="false" required="true"
     * @generated
     */
    boolean isResource();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ScriptModule#isResource <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' attribute.
     * @see #isResource()
     * @generated
     */
    void setResource(boolean value);

} // ScriptModule

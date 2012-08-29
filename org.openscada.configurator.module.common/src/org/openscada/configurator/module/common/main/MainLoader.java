/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.main;

import org.openscada.configuration.model.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.main.MainLoader#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.main.MainPackage#getMainLoader()
 * @model
 * @generated
 */
public interface MainLoader extends Module
{
    /**
     * Returns the value of the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File</em>' attribute.
     * @see #setFile(String)
     * @see org.openscada.configurator.module.common.main.MainPackage#getMainLoader_File()
     * @model required="true"
     * @generated
     */
    String getFile ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.main.MainLoader#getFile <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File</em>' attribute.
     * @see #getFile()
     * @generated
     */
    void setFile ( String value );

} // MainLoader

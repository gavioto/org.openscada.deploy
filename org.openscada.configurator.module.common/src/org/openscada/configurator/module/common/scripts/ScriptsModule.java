/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.scripts;

import org.openscada.configuration.model.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.scripts.ScriptsModule#getScriptsFile <em>Scripts File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.scripts.ScriptsPackage#getScriptsModule()
 * @model
 * @generated
 */
public interface ScriptsModule extends Module
{

    /**
     * Returns the value of the '<em><b>Scripts File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scripts File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scripts File</em>' attribute.
     * @see #setScriptsFile(String)
     * @see org.openscada.configurator.module.common.scripts.ScriptsPackage#getScriptsModule_ScriptsFile()
     * @model required="true"
     * @generated
     */
    String getScriptsFile ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.scripts.ScriptsModule#getScriptsFile <em>Scripts File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scripts File</em>' attribute.
     * @see #getScriptsFile()
     * @generated
     */
    void setScriptsFile ( String value );
} // ScriptsModule

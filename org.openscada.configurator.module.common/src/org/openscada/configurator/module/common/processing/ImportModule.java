/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing;

import org.openscada.configuration.model.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.processing.ImportModule#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.processing.ProcessingPackage#getImportModule()
 * @model
 * @generated
 */
public interface ImportModule extends Module
{
    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see org.openscada.configurator.module.common.processing.ProcessingPackage#getImportModule_Path()
     * @model required="true"
     * @generated
     */
    String getPath ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.processing.ImportModule#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath ( String value );

} // ImportModule

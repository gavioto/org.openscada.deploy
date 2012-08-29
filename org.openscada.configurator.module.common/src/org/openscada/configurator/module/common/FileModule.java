/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common;

import org.eclipse.emf.common.util.EList;
import org.openscada.configuration.model.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.FileModule#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.CommonPackage#getFileModule()
 * @model
 * @generated
 */
public interface FileModule extends Module
{
    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute list.
     * @see org.openscada.configurator.module.common.CommonPackage#getFileModule_Path()
     * @model
     * @generated
     */
    EList<String> getPath ();

} // FileModule

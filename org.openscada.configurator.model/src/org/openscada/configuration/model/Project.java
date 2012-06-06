/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.Project#getJsonBase <em>Json Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configuration.model.ConfiguratorPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
{
    /**
     * Returns the value of the '<em><b>Json Base</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Json Base</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Json Base</em>' attribute list.
     * @see org.openscada.configuration.model.ConfiguratorPackage#getProject_JsonBase()
     * @model
     * @generated
     */
    EList<String> getJsonBase ();

} // Project

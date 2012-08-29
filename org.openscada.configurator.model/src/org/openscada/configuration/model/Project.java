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
 *   <li>{@link org.openscada.configuration.model.Project#getMainConfiguration <em>Main Configuration</em>}</li>
 *   <li>{@link org.openscada.configuration.model.Project#getJsonBase <em>Json Base</em>}</li>
 *   <li>{@link org.openscada.configuration.model.Project#getOutputBase <em>Output Base</em>}</li>
 *   <li>{@link org.openscada.configuration.model.Project#getModules <em>Modules</em>}</li>
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
     * Returns the value of the '<em><b>Main Configuration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Main Configuration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The location of the "main.ods" file.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Main Configuration</em>' attribute.
     * @see #setMainConfiguration(String)
     * @see org.openscada.configuration.model.ConfiguratorPackage#getProject_MainConfiguration()
     * @model required="true"
     * @generated
     */
    String getMainConfiguration ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.model.Project#getMainConfiguration <em>Main Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Main Configuration</em>' attribute.
     * @see #getMainConfiguration()
     * @generated
     */
    void setMainConfiguration ( String value );

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

    /**
     * Returns the value of the '<em><b>Output Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Base</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Base</em>' attribute.
     * @see #setOutputBase(String)
     * @see org.openscada.configuration.model.ConfiguratorPackage#getProject_OutputBase()
     * @model required="true"
     * @generated
     */
    String getOutputBase ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.model.Project#getOutputBase <em>Output Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Base</em>' attribute.
     * @see #getOutputBase()
     * @generated
     */
    void setOutputBase ( String value );

    /**
     * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configuration.model.Module}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modules</em>' containment reference list.
     * @see org.openscada.configuration.model.ConfiguratorPackage#getProject_Modules()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Module> getModules ();

} // Project

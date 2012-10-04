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
 *   <li>{@link org.openscada.configuration.model.Project#getSlots <em>Slots</em>}</li>
 *   <li>{@link org.openscada.configuration.model.Project#getProcessors <em>Processors</em>}</li>
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
     * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configuration.model.ConfigurationSlot}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slots</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slots</em>' containment reference list.
     * @see org.openscada.configuration.model.ConfiguratorPackage#getProject_Slots()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<ConfigurationSlot> getSlots ();

    /**
     * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configuration.model.Processor}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processors</em>' containment reference list.
     * @see org.openscada.configuration.model.ConfiguratorPackage#getProject_Processors()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Processor> getProcessors ();

} // Project

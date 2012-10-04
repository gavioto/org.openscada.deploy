/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.ModuleProcessor#getModules <em>Modules</em>}</li>
 *   <li>{@link org.openscada.configuration.model.ModuleProcessor#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configuration.model.ConfiguratorPackage#getModuleProcessor()
 * @model
 * @generated
 */
public interface ModuleProcessor extends Processor
{
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
     * @see org.openscada.configuration.model.ConfiguratorPackage#getModuleProcessor_Modules()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Module> getModules ();

    /**
     * Returns the value of the '<em><b>Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slot</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slot</em>' reference.
     * @see #setSlot(AtlantisConfigurationSlot)
     * @see org.openscada.configuration.model.ConfiguratorPackage#getModuleProcessor_Slot()
     * @model required="true"
     * @generated
     */
    AtlantisConfigurationSlot getSlot ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.model.ModuleProcessor#getSlot <em>Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Slot</em>' reference.
     * @see #getSlot()
     * @generated
     */
    void setSlot ( AtlantisConfigurationSlot value );

} // ModuleProcessor

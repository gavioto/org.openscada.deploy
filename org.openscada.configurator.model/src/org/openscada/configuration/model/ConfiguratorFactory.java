/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.model.ConfiguratorPackage
 * @generated
 */
public interface ConfiguratorFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConfiguratorFactory eINSTANCE = org.openscada.configuration.model.impl.ConfiguratorFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Project</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Project</em>'.
     * @generated
     */
    Project createProject ();

    /**
     * Returns a new object of class '<em>Atlantis Configuration Slot</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Atlantis Configuration Slot</em>'.
     * @generated
     */
    AtlantisConfigurationSlot createAtlantisConfigurationSlot ();

    /**
     * Returns a new object of class '<em>Module Processor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module Processor</em>'.
     * @generated
     */
    ModuleProcessor createModuleProcessor ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ConfiguratorPackage getConfiguratorPackage ();

} //ConfiguratorFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openscada.configuration.model.ConfiguratorPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.model.master.MasterFactory
 * @model kind="package"
 * @generated
 */
public interface MasterPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "master";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Deploy/Configurator/Master";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "master";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MasterPackage eINSTANCE = org.openscada.configuration.model.master.impl.MasterPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.master.impl.AtlantisConfigurationSlotImpl <em>Atlantis Configuration Slot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.master.impl.AtlantisConfigurationSlotImpl
     * @see org.openscada.configuration.model.master.impl.MasterPackageImpl#getAtlantisConfigurationSlot()
     * @generated
     */
    int ATLANTIS_CONFIGURATION_SLOT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATLANTIS_CONFIGURATION_SLOT__ID = ConfiguratorPackage.GENERIC_MASTER_CONFIGURATION_SLOT__ID;

    /**
     * The feature id for the '<em><b>Json Base</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATLANTIS_CONFIGURATION_SLOT__JSON_BASE = ConfiguratorPackage.GENERIC_MASTER_CONFIGURATION_SLOT__JSON_BASE;

    /**
     * The feature id for the '<em><b>Base Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATLANTIS_CONFIGURATION_SLOT__BASE_DIRECTORY = ConfiguratorPackage.GENERIC_MASTER_CONFIGURATION_SLOT__BASE_DIRECTORY;

    /**
     * The number of structural features of the '<em>Atlantis Configuration Slot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATLANTIS_CONFIGURATION_SLOT_FEATURE_COUNT = ConfiguratorPackage.GENERIC_MASTER_CONFIGURATION_SLOT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.master.Module <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.master.Module
     * @see org.openscada.configuration.model.master.impl.MasterPackageImpl#getModule()
     * @generated
     */
    int MODULE = 1;

    /**
     * The number of structural features of the '<em>Module</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.master.impl.ModuleProcessorImpl <em>Module Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.master.impl.ModuleProcessorImpl
     * @see org.openscada.configuration.model.master.impl.MasterPackageImpl#getModuleProcessor()
     * @generated
     */
    int MODULE_PROCESSOR = 2;

    /**
     * The feature id for the '<em><b>Modules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROCESSOR__MODULES = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROCESSOR__SLOT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Module Processor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROCESSOR_FEATURE_COUNT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 2;

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.master.AtlantisConfigurationSlot <em>Atlantis Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Atlantis Configuration Slot</em>'.
     * @see org.openscada.configuration.model.master.AtlantisConfigurationSlot
     * @generated
     */
    EClass getAtlantisConfigurationSlot ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.master.Module <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module</em>'.
     * @see org.openscada.configuration.model.master.Module
     * @generated
     */
    EClass getModule ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.master.ModuleProcessor <em>Module Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Processor</em>'.
     * @see org.openscada.configuration.model.master.ModuleProcessor
     * @generated
     */
    EClass getModuleProcessor ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configuration.model.master.ModuleProcessor#getModules <em>Modules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Modules</em>'.
     * @see org.openscada.configuration.model.master.ModuleProcessor#getModules()
     * @see #getModuleProcessor()
     * @generated
     */
    EReference getModuleProcessor_Modules ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configuration.model.master.ModuleProcessor#getSlot <em>Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Slot</em>'.
     * @see org.openscada.configuration.model.master.ModuleProcessor#getSlot()
     * @see #getModuleProcessor()
     * @generated
     */
    EReference getModuleProcessor_Slot ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MasterFactory getMasterFactory ();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.master.impl.AtlantisConfigurationSlotImpl <em>Atlantis Configuration Slot</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.master.impl.AtlantisConfigurationSlotImpl
         * @see org.openscada.configuration.model.master.impl.MasterPackageImpl#getAtlantisConfigurationSlot()
         * @generated
         */
        EClass ATLANTIS_CONFIGURATION_SLOT = eINSTANCE.getAtlantisConfigurationSlot ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.master.Module <em>Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.master.Module
         * @see org.openscada.configuration.model.master.impl.MasterPackageImpl#getModule()
         * @generated
         */
        EClass MODULE = eINSTANCE.getModule ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.master.impl.ModuleProcessorImpl <em>Module Processor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.master.impl.ModuleProcessorImpl
         * @see org.openscada.configuration.model.master.impl.MasterPackageImpl#getModuleProcessor()
         * @generated
         */
        EClass MODULE_PROCESSOR = eINSTANCE.getModuleProcessor ();

        /**
         * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODULE_PROCESSOR__MODULES = eINSTANCE.getModuleProcessor_Modules ();

        /**
         * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODULE_PROCESSOR__SLOT = eINSTANCE.getModuleProcessor_Slot ();

    }

} //MasterPackage

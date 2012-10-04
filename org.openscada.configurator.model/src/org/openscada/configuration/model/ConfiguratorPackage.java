/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.openscada.configuration.model.ConfiguratorFactory
 * @model kind="package"
 * @generated
 */
public interface ConfiguratorPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "model";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Deploy/Configurator";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "configurator";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConfiguratorPackage eINSTANCE = org.openscada.configuration.model.impl.ConfiguratorPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.impl.ProjectImpl
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getProject()
     * @generated
     */
    int PROJECT = 0;

    /**
     * The feature id for the '<em><b>Slots</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__SLOTS = 0;

    /**
     * The feature id for the '<em><b>Processors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__PROCESSORS = 1;

    /**
     * The number of structural features of the '<em>Project</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.Module <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.Module
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getModule()
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
     * The meta object id for the '{@link org.openscada.configuration.model.ConfigurationSlot <em>Configuration Slot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.ConfigurationSlot
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getConfigurationSlot()
     * @generated
     */
    int CONFIGURATION_SLOT = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_SLOT__ID = 0;

    /**
     * The number of structural features of the '<em>Configuration Slot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_SLOT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.impl.GenericConfigurationSlotImpl <em>Generic Configuration Slot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.impl.GenericConfigurationSlotImpl
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getGenericConfigurationSlot()
     * @generated
     */
    int GENERIC_CONFIGURATION_SLOT = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_CONFIGURATION_SLOT__ID = CONFIGURATION_SLOT__ID;

    /**
     * The feature id for the '<em><b>Json Base</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_CONFIGURATION_SLOT__JSON_BASE = CONFIGURATION_SLOT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Base Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_CONFIGURATION_SLOT__BASE_DIRECTORY = CONFIGURATION_SLOT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Generic Configuration Slot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_CONFIGURATION_SLOT_FEATURE_COUNT = CONFIGURATION_SLOT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.impl.AtlantisConfigurationSlotImpl <em>Atlantis Configuration Slot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.impl.AtlantisConfigurationSlotImpl
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getAtlantisConfigurationSlot()
     * @generated
     */
    int ATLANTIS_CONFIGURATION_SLOT = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATLANTIS_CONFIGURATION_SLOT__ID = GENERIC_CONFIGURATION_SLOT__ID;

    /**
     * The feature id for the '<em><b>Json Base</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATLANTIS_CONFIGURATION_SLOT__JSON_BASE = GENERIC_CONFIGURATION_SLOT__JSON_BASE;

    /**
     * The feature id for the '<em><b>Base Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATLANTIS_CONFIGURATION_SLOT__BASE_DIRECTORY = GENERIC_CONFIGURATION_SLOT__BASE_DIRECTORY;

    /**
     * The number of structural features of the '<em>Atlantis Configuration Slot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATLANTIS_CONFIGURATION_SLOT_FEATURE_COUNT = GENERIC_CONFIGURATION_SLOT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.Processor <em>Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.Processor
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getProcessor()
     * @generated
     */
    int PROCESSOR = 4;

    /**
     * The number of structural features of the '<em>Processor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.impl.ModuleProcessorImpl <em>Module Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.impl.ModuleProcessorImpl
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getModuleProcessor()
     * @generated
     */
    int MODULE_PROCESSOR = 5;

    /**
     * The feature id for the '<em><b>Modules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROCESSOR__MODULES = PROCESSOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROCESSOR__SLOT = PROCESSOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Module Processor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROCESSOR_FEATURE_COUNT = PROCESSOR_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '<em>Configuration</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.Configuration
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getConfiguration()
     * @generated
     */
    int CONFIGURATION = 7;

    /**
     * The meta object id for the '<em>Generic Configuration</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.GenericConfiguration
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getGenericConfiguration()
     * @generated
     */
    int GENERIC_CONFIGURATION = 8;

    /**
     * The meta object id for the '<em>Exception</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Exception
     * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getException()
     * @generated
     */
    int EXCEPTION = 9;

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.Project <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Project</em>'.
     * @see org.openscada.configuration.model.Project
     * @generated
     */
    EClass getProject ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configuration.model.Project#getSlots <em>Slots</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Slots</em>'.
     * @see org.openscada.configuration.model.Project#getSlots()
     * @see #getProject()
     * @generated
     */
    EReference getProject_Slots ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configuration.model.Project#getProcessors <em>Processors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Processors</em>'.
     * @see org.openscada.configuration.model.Project#getProcessors()
     * @see #getProject()
     * @generated
     */
    EReference getProject_Processors ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.Module <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module</em>'.
     * @see org.openscada.configuration.model.Module
     * @generated
     */
    EClass getModule ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.ConfigurationSlot <em>Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Configuration Slot</em>'.
     * @see org.openscada.configuration.model.ConfigurationSlot
     * @generated
     */
    EClass getConfigurationSlot ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.model.ConfigurationSlot#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.openscada.configuration.model.ConfigurationSlot#getId()
     * @see #getConfigurationSlot()
     * @generated
     */
    EAttribute getConfigurationSlot_Id ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.AtlantisConfigurationSlot <em>Atlantis Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Atlantis Configuration Slot</em>'.
     * @see org.openscada.configuration.model.AtlantisConfigurationSlot
     * @generated
     */
    EClass getAtlantisConfigurationSlot ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.Processor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor</em>'.
     * @see org.openscada.configuration.model.Processor
     * @generated
     */
    EClass getProcessor ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.ModuleProcessor <em>Module Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Processor</em>'.
     * @see org.openscada.configuration.model.ModuleProcessor
     * @generated
     */
    EClass getModuleProcessor ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configuration.model.ModuleProcessor#getModules <em>Modules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Modules</em>'.
     * @see org.openscada.configuration.model.ModuleProcessor#getModules()
     * @see #getModuleProcessor()
     * @generated
     */
    EReference getModuleProcessor_Modules ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configuration.model.ModuleProcessor#getSlot <em>Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Slot</em>'.
     * @see org.openscada.configuration.model.ModuleProcessor#getSlot()
     * @see #getModuleProcessor()
     * @generated
     */
    EReference getModuleProcessor_Slot ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.GenericConfigurationSlot <em>Generic Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic Configuration Slot</em>'.
     * @see org.openscada.configuration.model.GenericConfigurationSlot
     * @generated
     */
    EClass getGenericConfigurationSlot ();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.configuration.model.GenericConfigurationSlot#getJsonBase <em>Json Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Json Base</em>'.
     * @see org.openscada.configuration.model.GenericConfigurationSlot#getJsonBase()
     * @see #getGenericConfigurationSlot()
     * @generated
     */
    EAttribute getGenericConfigurationSlot_JsonBase ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.model.GenericConfigurationSlot#getBaseDirectory <em>Base Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base Directory</em>'.
     * @see org.openscada.configuration.model.GenericConfigurationSlot#getBaseDirectory()
     * @see #getGenericConfigurationSlot()
     * @generated
     */
    EAttribute getGenericConfigurationSlot_BaseDirectory ();

    /**
     * Returns the meta object for data type '{@link org.openscada.configurator.Configuration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Configuration</em>'.
     * @see org.openscada.configurator.Configuration
     * @model instanceClass="org.openscada.configurator.Configuration" serializeable="false"
     * @generated
     */
    EDataType getConfiguration ();

    /**
     * Returns the meta object for data type '{@link org.openscada.configurator.GenericConfiguration <em>Generic Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Generic Configuration</em>'.
     * @see org.openscada.configurator.GenericConfiguration
     * @model instanceClass="org.openscada.configurator.GenericConfiguration" serializeable="false"
     * @generated
     */
    EDataType getGenericConfiguration ();

    /**
     * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Exception</em>'.
     * @see java.lang.Exception
     * @model instanceClass="java.lang.Exception"
     * @generated
     */
    EDataType getException ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ConfiguratorFactory getConfiguratorFactory ();

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
         * The meta object literal for the '{@link org.openscada.configuration.model.impl.ProjectImpl <em>Project</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.impl.ProjectImpl
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getProject()
         * @generated
         */
        EClass PROJECT = eINSTANCE.getProject ();

        /**
         * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROJECT__SLOTS = eINSTANCE.getProject_Slots ();

        /**
         * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROJECT__PROCESSORS = eINSTANCE.getProject_Processors ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.Module <em>Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.Module
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getModule()
         * @generated
         */
        EClass MODULE = eINSTANCE.getModule ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.ConfigurationSlot <em>Configuration Slot</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.ConfigurationSlot
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getConfigurationSlot()
         * @generated
         */
        EClass CONFIGURATION_SLOT = eINSTANCE.getConfigurationSlot ();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIGURATION_SLOT__ID = eINSTANCE.getConfigurationSlot_Id ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.impl.AtlantisConfigurationSlotImpl <em>Atlantis Configuration Slot</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.impl.AtlantisConfigurationSlotImpl
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getAtlantisConfigurationSlot()
         * @generated
         */
        EClass ATLANTIS_CONFIGURATION_SLOT = eINSTANCE.getAtlantisConfigurationSlot ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.Processor <em>Processor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.Processor
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getProcessor()
         * @generated
         */
        EClass PROCESSOR = eINSTANCE.getProcessor ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.impl.ModuleProcessorImpl <em>Module Processor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.impl.ModuleProcessorImpl
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getModuleProcessor()
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

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.impl.GenericConfigurationSlotImpl <em>Generic Configuration Slot</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.impl.GenericConfigurationSlotImpl
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getGenericConfigurationSlot()
         * @generated
         */
        EClass GENERIC_CONFIGURATION_SLOT = eINSTANCE.getGenericConfigurationSlot ();

        /**
         * The meta object literal for the '<em><b>Json Base</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_CONFIGURATION_SLOT__JSON_BASE = eINSTANCE.getGenericConfigurationSlot_JsonBase ();

        /**
         * The meta object literal for the '<em><b>Base Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_CONFIGURATION_SLOT__BASE_DIRECTORY = eINSTANCE.getGenericConfigurationSlot_BaseDirectory ();

        /**
         * The meta object literal for the '<em>Configuration</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.Configuration
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getConfiguration()
         * @generated
         */
        EDataType CONFIGURATION = eINSTANCE.getConfiguration ();

        /**
         * The meta object literal for the '<em>Generic Configuration</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.GenericConfiguration
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getGenericConfiguration()
         * @generated
         */
        EDataType GENERIC_CONFIGURATION = eINSTANCE.getGenericConfiguration ();

        /**
         * The meta object literal for the '<em>Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Exception
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getException()
         * @generated
         */
        EDataType EXCEPTION = eINSTANCE.getException ();

    }

} //ConfiguratorPackage

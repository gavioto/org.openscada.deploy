/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.openscada.configuration.model.hd.HdFactory
 * @model kind="package"
 * @generated
 */
public interface HdPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "hd";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Deploy/Configurator/HD";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "hd";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HdPackage eINSTANCE = org.openscada.configuration.model.hd.impl.HdPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.hd.impl.ConfigurationSlotImpl <em>Configuration Slot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.hd.impl.ConfigurationSlotImpl
     * @see org.openscada.configuration.model.hd.impl.HdPackageImpl#getConfigurationSlot()
     * @generated
     */
    int CONFIGURATION_SLOT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_SLOT__ID = ConfiguratorPackage.GENERIC_MASTER_CONFIGURATION_SLOT__ID;

    /**
     * The feature id for the '<em><b>Json Base</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_SLOT__JSON_BASE = ConfiguratorPackage.GENERIC_MASTER_CONFIGURATION_SLOT__JSON_BASE;

    /**
     * The feature id for the '<em><b>Base Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_SLOT__BASE_DIRECTORY = ConfiguratorPackage.GENERIC_MASTER_CONFIGURATION_SLOT__BASE_DIRECTORY;

    /**
     * The feature id for the '<em><b>Master Connection Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_SLOT__MASTER_CONNECTION_URI = ConfiguratorPackage.GENERIC_MASTER_CONFIGURATION_SLOT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Configuration Slot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_SLOT_FEATURE_COUNT = ConfiguratorPackage.GENERIC_MASTER_CONFIGURATION_SLOT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.hd.impl.StorageCommandGeneratorImpl <em>Storage Command Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.hd.impl.StorageCommandGeneratorImpl
     * @see org.openscada.configuration.model.hd.impl.HdPackageImpl#getStorageCommandGenerator()
     * @generated
     */
    int STORAGE_COMMAND_GENERATOR = 1;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORAGE_COMMAND_GENERATOR__SLOT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Storage Command Generator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORAGE_COMMAND_GENERATOR_FEATURE_COUNT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.openscada.configuration.model.hd.impl.HDItemGeneratorImpl <em>HD Item Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.hd.impl.HDItemGeneratorImpl
     * @see org.openscada.configuration.model.hd.impl.HdPackageImpl#getHDItemGenerator()
     * @generated
     */
    int HD_ITEM_GENERATOR = 2;

    /**
     * The feature id for the '<em><b>Hd Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HD_ITEM_GENERATOR__HD_SLOT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Da Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HD_ITEM_GENERATOR__DA_SLOT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>HD Item Generator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HD_ITEM_GENERATOR_FEATURE_COUNT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 2;

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.hd.ConfigurationSlot <em>Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Configuration Slot</em>'.
     * @see org.openscada.configuration.model.hd.ConfigurationSlot
     * @generated
     */
    EClass getConfigurationSlot ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.model.hd.ConfigurationSlot#getMasterConnectionUri <em>Master Connection Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Master Connection Uri</em>'.
     * @see org.openscada.configuration.model.hd.ConfigurationSlot#getMasterConnectionUri()
     * @see #getConfigurationSlot()
     * @generated
     */
    EAttribute getConfigurationSlot_MasterConnectionUri ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.hd.StorageCommandGenerator <em>Storage Command Generator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Storage Command Generator</em>'.
     * @see org.openscada.configuration.model.hd.StorageCommandGenerator
     * @generated
     */
    EClass getStorageCommandGenerator ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configuration.model.hd.StorageCommandGenerator#getSlot <em>Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Slot</em>'.
     * @see org.openscada.configuration.model.hd.StorageCommandGenerator#getSlot()
     * @see #getStorageCommandGenerator()
     * @generated
     */
    EReference getStorageCommandGenerator_Slot ();

    /**
     * Returns the meta object for class '{@link org.openscada.configuration.model.hd.HDItemGenerator <em>HD Item Generator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>HD Item Generator</em>'.
     * @see org.openscada.configuration.model.hd.HDItemGenerator
     * @generated
     */
    EClass getHDItemGenerator ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configuration.model.hd.HDItemGenerator#getHdSlot <em>Hd Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Hd Slot</em>'.
     * @see org.openscada.configuration.model.hd.HDItemGenerator#getHdSlot()
     * @see #getHDItemGenerator()
     * @generated
     */
    EReference getHDItemGenerator_HdSlot ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configuration.model.hd.HDItemGenerator#getDaSlot <em>Da Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Da Slot</em>'.
     * @see org.openscada.configuration.model.hd.HDItemGenerator#getDaSlot()
     * @see #getHDItemGenerator()
     * @generated
     */
    EReference getHDItemGenerator_DaSlot ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    HdFactory getHdFactory ();

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
         * The meta object literal for the '{@link org.openscada.configuration.model.hd.impl.ConfigurationSlotImpl <em>Configuration Slot</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.hd.impl.ConfigurationSlotImpl
         * @see org.openscada.configuration.model.hd.impl.HdPackageImpl#getConfigurationSlot()
         * @generated
         */
        EClass CONFIGURATION_SLOT = eINSTANCE.getConfigurationSlot ();

        /**
         * The meta object literal for the '<em><b>Master Connection Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIGURATION_SLOT__MASTER_CONNECTION_URI = eINSTANCE.getConfigurationSlot_MasterConnectionUri ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.hd.impl.StorageCommandGeneratorImpl <em>Storage Command Generator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.hd.impl.StorageCommandGeneratorImpl
         * @see org.openscada.configuration.model.hd.impl.HdPackageImpl#getStorageCommandGenerator()
         * @generated
         */
        EClass STORAGE_COMMAND_GENERATOR = eINSTANCE.getStorageCommandGenerator ();

        /**
         * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STORAGE_COMMAND_GENERATOR__SLOT = eINSTANCE.getStorageCommandGenerator_Slot ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.hd.impl.HDItemGeneratorImpl <em>HD Item Generator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.hd.impl.HDItemGeneratorImpl
         * @see org.openscada.configuration.model.hd.impl.HdPackageImpl#getHDItemGenerator()
         * @generated
         */
        EClass HD_ITEM_GENERATOR = eINSTANCE.getHDItemGenerator ();

        /**
         * The meta object literal for the '<em><b>Hd Slot</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HD_ITEM_GENERATOR__HD_SLOT = eINSTANCE.getHDItemGenerator_HdSlot ();

        /**
         * The meta object literal for the '<em><b>Da Slot</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HD_ITEM_GENERATOR__DA_SLOT = eINSTANCE.getHDItemGenerator_DaSlot ();

    }

} //HdPackage

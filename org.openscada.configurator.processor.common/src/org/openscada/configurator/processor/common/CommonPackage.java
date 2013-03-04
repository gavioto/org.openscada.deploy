/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.openscada.configurator.processor.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "common";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configurator/Processors/Common";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "common";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CommonPackage eINSTANCE = org.openscada.configurator.processor.common.impl.CommonPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.impl.StoreConfigurationSlotProcessorImpl <em>Store Configuration Slot Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.impl.StoreConfigurationSlotProcessorImpl
     * @see org.openscada.configurator.processor.common.impl.CommonPackageImpl#getStoreConfigurationSlotProcessor()
     * @generated
     */
    int STORE_CONFIGURATION_SLOT_PROCESSOR = 0;

    /**
     * The feature id for the '<em><b>Slots</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_CONFIGURATION_SLOT_PROCESSOR__SLOTS = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Store Configuration Slot Processor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_CONFIGURATION_SLOT_PROCESSOR_FEATURE_COUNT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '<em>Pattern</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.regex.Pattern
     * @see org.openscada.configurator.processor.common.impl.CommonPackageImpl#getPattern()
     * @generated
     */
    int PATTERN = 1;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.StoreConfigurationSlotProcessor <em>Store Configuration Slot Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Store Configuration Slot Processor</em>'.
     * @see org.openscada.configurator.processor.common.StoreConfigurationSlotProcessor
     * @generated
     */
    EClass getStoreConfigurationSlotProcessor ();

    /**
     * Returns the meta object for the reference list '{@link org.openscada.configurator.processor.common.StoreConfigurationSlotProcessor#getSlots <em>Slots</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Slots</em>'.
     * @see org.openscada.configurator.processor.common.StoreConfigurationSlotProcessor#getSlots()
     * @see #getStoreConfigurationSlotProcessor()
     * @generated
     */
    EReference getStoreConfigurationSlotProcessor_Slots ();

    /**
     * Returns the meta object for data type '{@link java.util.regex.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Pattern</em>'.
     * @see java.util.regex.Pattern
     * @model instanceClass="java.util.regex.Pattern"
     * @generated
     */
    EDataType getPattern ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CommonFactory getCommonFactory ();

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
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.impl.StoreConfigurationSlotProcessorImpl <em>Store Configuration Slot Processor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.impl.StoreConfigurationSlotProcessorImpl
         * @see org.openscada.configurator.processor.common.impl.CommonPackageImpl#getStoreConfigurationSlotProcessor()
         * @generated
         */
        EClass STORE_CONFIGURATION_SLOT_PROCESSOR = eINSTANCE.getStoreConfigurationSlotProcessor ();

        /**
         * The meta object literal for the '<em><b>Slots</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STORE_CONFIGURATION_SLOT_PROCESSOR__SLOTS = eINSTANCE.getStoreConfigurationSlotProcessor_Slots ();

        /**
         * The meta object literal for the '<em>Pattern</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.regex.Pattern
         * @see org.openscada.configurator.processor.common.impl.CommonPackageImpl#getPattern()
         * @generated
         */
        EDataType PATTERN = eINSTANCE.getPattern ();

    }

} //CommonPackage

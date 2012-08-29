/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
 * @see org.openscada.configurator.module.common.network.NetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "network";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configurator/Modules/Common/Network";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "network";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NetworkPackage eINSTANCE = org.openscada.configurator.module.common.network.impl.NetworkPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.network.impl.NetworkModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.network.impl.NetworkModuleImpl
     * @see org.openscada.configurator.module.common.network.impl.NetworkPackageImpl#getNetworkModule()
     * @generated
     */
    int NETWORK_MODULE = 0;

    /**
     * The feature id for the '<em><b>Network File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_MODULE__NETWORK_FILE = ConfiguratorPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_MODULE__PREFIX = ConfiguratorPackage.MODULE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Module</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_MODULE_FEATURE_COUNT = ConfiguratorPackage.MODULE_FEATURE_COUNT + 2;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.network.NetworkModule <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module</em>'.
     * @see org.openscada.configurator.module.common.network.NetworkModule
     * @generated
     */
    EClass getNetworkModule ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.network.NetworkModule#getNetworkFile <em>Network File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Network File</em>'.
     * @see org.openscada.configurator.module.common.network.NetworkModule#getNetworkFile()
     * @see #getNetworkModule()
     * @generated
     */
    EAttribute getNetworkModule_NetworkFile ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.network.NetworkModule#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see org.openscada.configurator.module.common.network.NetworkModule#getPrefix()
     * @see #getNetworkModule()
     * @generated
     */
    EAttribute getNetworkModule_Prefix ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    NetworkFactory getNetworkFactory ();

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
         * The meta object literal for the '{@link org.openscada.configurator.module.common.network.impl.NetworkModuleImpl <em>Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.network.impl.NetworkModuleImpl
         * @see org.openscada.configurator.module.common.network.impl.NetworkPackageImpl#getNetworkModule()
         * @generated
         */
        EClass NETWORK_MODULE = eINSTANCE.getNetworkModule ();

        /**
         * The meta object literal for the '<em><b>Network File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NETWORK_MODULE__NETWORK_FILE = eINSTANCE.getNetworkModule_NetworkFile ();

        /**
         * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NETWORK_MODULE__PREFIX = eINSTANCE.getNetworkModule_Prefix ();

    }

} //NetworkPackage

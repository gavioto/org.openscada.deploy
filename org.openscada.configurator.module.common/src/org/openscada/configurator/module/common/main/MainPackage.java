/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.main;

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
 * @see org.openscada.configurator.module.common.main.MainFactory
 * @model kind="package"
 * @generated
 */
public interface MainPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "main";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configurator/Modules/Common/Main";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "main";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MainPackage eINSTANCE = org.openscada.configurator.module.common.main.impl.MainPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.main.impl.MainLoaderImpl <em>Loader</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.main.impl.MainLoaderImpl
     * @see org.openscada.configurator.module.common.main.impl.MainPackageImpl#getMainLoader()
     * @generated
     */
    int MAIN_LOADER = 0;

    /**
     * The feature id for the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAIN_LOADER__FILE = ConfiguratorPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Loader</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAIN_LOADER_FEATURE_COUNT = ConfiguratorPackage.MODULE_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.main.MainLoader <em>Loader</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Loader</em>'.
     * @see org.openscada.configurator.module.common.main.MainLoader
     * @generated
     */
    EClass getMainLoader ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.main.MainLoader#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File</em>'.
     * @see org.openscada.configurator.module.common.main.MainLoader#getFile()
     * @see #getMainLoader()
     * @generated
     */
    EAttribute getMainLoader_File ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MainFactory getMainFactory ();

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
         * The meta object literal for the '{@link org.openscada.configurator.module.common.main.impl.MainLoaderImpl <em>Loader</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.main.impl.MainLoaderImpl
         * @see org.openscada.configurator.module.common.main.impl.MainPackageImpl#getMainLoader()
         * @generated
         */
        EClass MAIN_LOADER = eINSTANCE.getMainLoader ();

        /**
         * The meta object literal for the '<em><b>File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAIN_LOADER__FILE = eINSTANCE.getMainLoader_File ();

    }

} //MainPackage

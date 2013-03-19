/**
 */
package org.openscada.configurator.processor.common.main;

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
 * @see org.openscada.configurator.processor.common.main.MainFactory
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
    String eNS_URI = "http://openscada.org/Configurator/Processors/Common/Main";

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
    MainPackage eINSTANCE = org.openscada.configurator.processor.common.main.impl.MainPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.main.impl.AuthorizationLoaderImpl <em>Authorization Loader</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.main.impl.AuthorizationLoaderImpl
     * @see org.openscada.configurator.processor.common.main.impl.MainPackageImpl#getAuthorizationLoader()
     * @generated
     */
    int AUTHORIZATION_LOADER = 0;

    /**
     * The feature id for the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_LOADER__FILE = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_LOADER__SLOT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Authorization Loader</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_LOADER_FEATURE_COUNT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.main.impl.SecurityLoaderImpl <em>Security Loader</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.main.impl.SecurityLoaderImpl
     * @see org.openscada.configurator.processor.common.main.impl.MainPackageImpl#getSecurityLoader()
     * @generated
     */
    int SECURITY_LOADER = 1;

    /**
     * The feature id for the '<em><b>Rules</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_LOADER__RULES = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_LOADER__SLOT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Security Loader</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_LOADER_FEATURE_COUNT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 2;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.main.AuthorizationLoader <em>Authorization Loader</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Authorization Loader</em>'.
     * @see org.openscada.configurator.processor.common.main.AuthorizationLoader
     * @generated
     */
    EClass getAuthorizationLoader ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.main.AuthorizationLoader#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File</em>'.
     * @see org.openscada.configurator.processor.common.main.AuthorizationLoader#getFile()
     * @see #getAuthorizationLoader()
     * @generated
     */
    EAttribute getAuthorizationLoader_File ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configurator.processor.common.main.AuthorizationLoader#getSlot <em>Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Slot</em>'.
     * @see org.openscada.configurator.processor.common.main.AuthorizationLoader#getSlot()
     * @see #getAuthorizationLoader()
     * @generated
     */
    EReference getAuthorizationLoader_Slot ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.main.SecurityLoader <em>Security Loader</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Security Loader</em>'.
     * @see org.openscada.configurator.processor.common.main.SecurityLoader
     * @generated
     */
    EClass getSecurityLoader ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configurator.processor.common.main.SecurityLoader#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Rules</em>'.
     * @see org.openscada.configurator.processor.common.main.SecurityLoader#getRules()
     * @see #getSecurityLoader()
     * @generated
     */
    EReference getSecurityLoader_Rules ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configurator.processor.common.main.SecurityLoader#getSlot <em>Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Slot</em>'.
     * @see org.openscada.configurator.processor.common.main.SecurityLoader#getSlot()
     * @see #getSecurityLoader()
     * @generated
     */
    EReference getSecurityLoader_Slot ();

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
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.main.impl.AuthorizationLoaderImpl <em>Authorization Loader</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.main.impl.AuthorizationLoaderImpl
         * @see org.openscada.configurator.processor.common.main.impl.MainPackageImpl#getAuthorizationLoader()
         * @generated
         */
        EClass AUTHORIZATION_LOADER = eINSTANCE.getAuthorizationLoader ();

        /**
         * The meta object literal for the '<em><b>File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AUTHORIZATION_LOADER__FILE = eINSTANCE.getAuthorizationLoader_File ();

        /**
         * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTHORIZATION_LOADER__SLOT = eINSTANCE.getAuthorizationLoader_Slot ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.main.impl.SecurityLoaderImpl <em>Security Loader</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.main.impl.SecurityLoaderImpl
         * @see org.openscada.configurator.processor.common.main.impl.MainPackageImpl#getSecurityLoader()
         * @generated
         */
        EClass SECURITY_LOADER = eINSTANCE.getSecurityLoader ();

        /**
         * The meta object literal for the '<em><b>Rules</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SECURITY_LOADER__RULES = eINSTANCE.getSecurityLoader_Rules ();

        /**
         * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SECURITY_LOADER__SLOT = eINSTANCE.getSecurityLoader_Slot ();

    }

} //MainPackage

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
     * The feature id for the '<em><b>Main Configuration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__MAIN_CONFIGURATION = 0;

    /**
     * The feature id for the '<em><b>Json Base</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__JSON_BASE = 1;

    /**
     * The feature id for the '<em><b>Output Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__OUTPUT_BASE = 2;

    /**
     * The feature id for the '<em><b>Script Override Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__SCRIPT_OVERRIDE_DIRECTORY = 3;

    /**
     * The feature id for the '<em><b>Legacy Base Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__LEGACY_BASE_DIRECTORY = 4;

    /**
     * The feature id for the '<em><b>Io List File</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__IO_LIST_FILE = 5;

    /**
     * The feature id for the '<em><b>Modules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__MODULES = 6;

    /**
     * The feature id for the '<em><b>Generated Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__GENERATED_DIRECTORY = 7;

    /**
     * The number of structural features of the '<em>Project</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_FEATURE_COUNT = 8;

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
     * Returns the meta object for class '{@link org.openscada.configuration.model.Project <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Project</em>'.
     * @see org.openscada.configuration.model.Project
     * @generated
     */
    EClass getProject ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.model.Project#getMainConfiguration <em>Main Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Main Configuration</em>'.
     * @see org.openscada.configuration.model.Project#getMainConfiguration()
     * @see #getProject()
     * @generated
     */
    EAttribute getProject_MainConfiguration ();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.configuration.model.Project#getJsonBase <em>Json Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Json Base</em>'.
     * @see org.openscada.configuration.model.Project#getJsonBase()
     * @see #getProject()
     * @generated
     */
    EAttribute getProject_JsonBase ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.model.Project#getOutputBase <em>Output Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Base</em>'.
     * @see org.openscada.configuration.model.Project#getOutputBase()
     * @see #getProject()
     * @generated
     */
    EAttribute getProject_OutputBase ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.model.Project#getScriptOverrideDirectory <em>Script Override Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script Override Directory</em>'.
     * @see org.openscada.configuration.model.Project#getScriptOverrideDirectory()
     * @see #getProject()
     * @generated
     */
    EAttribute getProject_ScriptOverrideDirectory ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.model.Project#getLegacyBaseDirectory <em>Legacy Base Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Legacy Base Directory</em>'.
     * @see org.openscada.configuration.model.Project#getLegacyBaseDirectory()
     * @see #getProject()
     * @generated
     */
    EAttribute getProject_LegacyBaseDirectory ();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.configuration.model.Project#getIoListFile <em>Io List File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Io List File</em>'.
     * @see org.openscada.configuration.model.Project#getIoListFile()
     * @see #getProject()
     * @generated
     */
    EAttribute getProject_IoListFile ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configuration.model.Project#getModules <em>Modules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Modules</em>'.
     * @see org.openscada.configuration.model.Project#getModules()
     * @see #getProject()
     * @generated
     */
    EReference getProject_Modules ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configuration.model.Project#getGeneratedDirectory <em>Generated Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Generated Directory</em>'.
     * @see org.openscada.configuration.model.Project#getGeneratedDirectory()
     * @see #getProject()
     * @generated
     */
    EAttribute getProject_GeneratedDirectory ();

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
         * The meta object literal for the '<em><b>Main Configuration</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT__MAIN_CONFIGURATION = eINSTANCE.getProject_MainConfiguration ();

        /**
         * The meta object literal for the '<em><b>Json Base</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT__JSON_BASE = eINSTANCE.getProject_JsonBase ();

        /**
         * The meta object literal for the '<em><b>Output Base</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT__OUTPUT_BASE = eINSTANCE.getProject_OutputBase ();

        /**
         * The meta object literal for the '<em><b>Script Override Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT__SCRIPT_OVERRIDE_DIRECTORY = eINSTANCE.getProject_ScriptOverrideDirectory ();

        /**
         * The meta object literal for the '<em><b>Legacy Base Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT__LEGACY_BASE_DIRECTORY = eINSTANCE.getProject_LegacyBaseDirectory ();

        /**
         * The meta object literal for the '<em><b>Io List File</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT__IO_LIST_FILE = eINSTANCE.getProject_IoListFile ();

        /**
         * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROJECT__MODULES = eINSTANCE.getProject_Modules ();

        /**
         * The meta object literal for the '<em><b>Generated Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT__GENERATED_DIRECTORY = eINSTANCE.getProject_GeneratedDirectory ();

        /**
         * The meta object literal for the '{@link org.openscada.configuration.model.Module <em>Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configuration.model.Module
         * @see org.openscada.configuration.model.impl.ConfiguratorPackageImpl#getModule()
         * @generated
         */
        EClass MODULE = eINSTANCE.getModule ();

    }

} //ConfiguratorPackage

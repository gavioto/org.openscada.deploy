/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.scripts;

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
 * @see org.openscada.configurator.module.common.scripts.ScriptsFactory
 * @model kind="package"
 * @generated
 */
public interface ScriptsPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "scripts";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configurator/Modules/Common/Scripts";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "scripts";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScriptsPackage eINSTANCE = org.openscada.configurator.module.common.scripts.impl.ScriptsPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.scripts.impl.ScriptsModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.scripts.impl.ScriptsModuleImpl
     * @see org.openscada.configurator.module.common.scripts.impl.ScriptsPackageImpl#getScriptsModule()
     * @generated
     */
    int SCRIPTS_MODULE = 0;

    /**
     * The number of structural features of the '<em>Module</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPTS_MODULE_FEATURE_COUNT = ConfiguratorPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.scripts.impl.LegacyFormulaModuleImpl <em>Legacy Formula Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.scripts.impl.LegacyFormulaModuleImpl
     * @see org.openscada.configurator.module.common.scripts.impl.ScriptsPackageImpl#getLegacyFormulaModule()
     * @generated
     */
    int LEGACY_FORMULA_MODULE = 1;

    /**
     * The feature id for the '<em><b>Formula File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEGACY_FORMULA_MODULE__FORMULA_FILE = ConfiguratorPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Legacy Formula Module</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEGACY_FORMULA_MODULE_FEATURE_COUNT = ConfiguratorPackage.MODULE_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.scripts.ScriptsModule <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module</em>'.
     * @see org.openscada.configurator.module.common.scripts.ScriptsModule
     * @generated
     */
    EClass getScriptsModule ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.scripts.LegacyFormulaModule <em>Legacy Formula Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Legacy Formula Module</em>'.
     * @see org.openscada.configurator.module.common.scripts.LegacyFormulaModule
     * @generated
     */
    EClass getLegacyFormulaModule ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.scripts.LegacyFormulaModule#getFormulaFile <em>Formula File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Formula File</em>'.
     * @see org.openscada.configurator.module.common.scripts.LegacyFormulaModule#getFormulaFile()
     * @see #getLegacyFormulaModule()
     * @generated
     */
    EAttribute getLegacyFormulaModule_FormulaFile ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ScriptsFactory getScriptsFactory ();

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
         * The meta object literal for the '{@link org.openscada.configurator.module.common.scripts.impl.ScriptsModuleImpl <em>Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.scripts.impl.ScriptsModuleImpl
         * @see org.openscada.configurator.module.common.scripts.impl.ScriptsPackageImpl#getScriptsModule()
         * @generated
         */
        EClass SCRIPTS_MODULE = eINSTANCE.getScriptsModule ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.scripts.impl.LegacyFormulaModuleImpl <em>Legacy Formula Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.scripts.impl.LegacyFormulaModuleImpl
         * @see org.openscada.configurator.module.common.scripts.impl.ScriptsPackageImpl#getLegacyFormulaModule()
         * @generated
         */
        EClass LEGACY_FORMULA_MODULE = eINSTANCE.getLegacyFormulaModule ();

        /**
         * The meta object literal for the '<em><b>Formula File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LEGACY_FORMULA_MODULE__FORMULA_FILE = eINSTANCE.getLegacyFormulaModule_FormulaFile ();

    }

} //ScriptsPackage

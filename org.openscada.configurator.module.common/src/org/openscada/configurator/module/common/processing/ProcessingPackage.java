/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configurator.module.common.CommonPackage;

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
 * @see org.openscada.configurator.module.common.processing.ProcessingFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessingPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "processing";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configurator/Modules/Common/Processing";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "processing";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ProcessingPackage eINSTANCE = org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.processing.impl.ImportModuleImpl <em>Import Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.processing.impl.ImportModuleImpl
     * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getImportModule()
     * @generated
     */
    int IMPORT_MODULE = 0;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_MODULE__PATH = ConfiguratorPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Import Module</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_MODULE_FEATURE_COUNT = ConfiguratorPackage.MODULE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.processing.impl.OverrideListModuleImpl <em>Override List Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.processing.impl.OverrideListModuleImpl
     * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getOverrideListModule()
     * @generated
     */
    int OVERRIDE_LIST_MODULE = 1;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_LIST_MODULE__PATH = CommonPackage.FILE_MODULE__PATH;

    /**
     * The number of structural features of the '<em>Override List Module</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_LIST_MODULE_FEATURE_COUNT = CommonPackage.FILE_MODULE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.processing.impl.ImportListModuleImpl <em>Import List Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.processing.impl.ImportListModuleImpl
     * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getImportListModule()
     * @generated
     */
    int IMPORT_LIST_MODULE = 2;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_LIST_MODULE__PATH = CommonPackage.FILE_MODULE__PATH;

    /**
     * The number of structural features of the '<em>Import List Module</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_LIST_MODULE_FEATURE_COUNT = CommonPackage.FILE_MODULE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.processing.impl.ScriptOverridesImpl <em>Script Overrides</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.processing.impl.ScriptOverridesImpl
     * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getScriptOverrides()
     * @generated
     */
    int SCRIPT_OVERRIDES = 3;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_OVERRIDES__PATH = CommonPackage.FILE_MODULE__PATH;

    /**
     * The number of structural features of the '<em>Script Overrides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_OVERRIDES_FEATURE_COUNT = CommonPackage.FILE_MODULE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.processing.impl.RemoveInactiveImpl <em>Remove Inactive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.processing.impl.RemoveInactiveImpl
     * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getRemoveInactive()
     * @generated
     */
    int REMOVE_INACTIVE = 4;

    /**
     * The number of structural features of the '<em>Remove Inactive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOVE_INACTIVE_FEATURE_COUNT = ConfiguratorPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.processing.ImportModule <em>Import Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import Module</em>'.
     * @see org.openscada.configurator.module.common.processing.ImportModule
     * @generated
     */
    EClass getImportModule ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.processing.OverrideListModule <em>Override List Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Override List Module</em>'.
     * @see org.openscada.configurator.module.common.processing.OverrideListModule
     * @generated
     */
    EClass getOverrideListModule ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.processing.ImportListModule <em>Import List Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import List Module</em>'.
     * @see org.openscada.configurator.module.common.processing.ImportListModule
     * @generated
     */
    EClass getImportListModule ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.processing.ScriptOverrides <em>Script Overrides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Overrides</em>'.
     * @see org.openscada.configurator.module.common.processing.ScriptOverrides
     * @generated
     */
    EClass getScriptOverrides ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.processing.RemoveInactive <em>Remove Inactive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remove Inactive</em>'.
     * @see org.openscada.configurator.module.common.processing.RemoveInactive
     * @generated
     */
    EClass getRemoveInactive ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ProcessingFactory getProcessingFactory ();

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
         * The meta object literal for the '{@link org.openscada.configurator.module.common.processing.impl.ImportModuleImpl <em>Import Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.processing.impl.ImportModuleImpl
         * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getImportModule()
         * @generated
         */
        EClass IMPORT_MODULE = eINSTANCE.getImportModule ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.processing.impl.OverrideListModuleImpl <em>Override List Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.processing.impl.OverrideListModuleImpl
         * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getOverrideListModule()
         * @generated
         */
        EClass OVERRIDE_LIST_MODULE = eINSTANCE.getOverrideListModule ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.processing.impl.ImportListModuleImpl <em>Import List Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.processing.impl.ImportListModuleImpl
         * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getImportListModule()
         * @generated
         */
        EClass IMPORT_LIST_MODULE = eINSTANCE.getImportListModule ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.processing.impl.ScriptOverridesImpl <em>Script Overrides</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.processing.impl.ScriptOverridesImpl
         * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getScriptOverrides()
         * @generated
         */
        EClass SCRIPT_OVERRIDES = eINSTANCE.getScriptOverrides ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.processing.impl.RemoveInactiveImpl <em>Remove Inactive</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.processing.impl.RemoveInactiveImpl
         * @see org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl#getRemoveInactive()
         * @generated
         */
        EClass REMOVE_INACTIVE = eINSTANCE.getRemoveInactive ();

    }

} //ProcessingPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.openscada.configuration.model.master.MasterPackage;

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
 * @see org.openscada.configurator.module.common.output.OutputFactory
 * @model kind="package"
 * @generated
 */
public interface OutputPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "output";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configurator/Modules/Common/Output";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "output";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    OutputPackage eINSTANCE = org.openscada.configurator.module.common.output.impl.OutputPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.output.impl.OutputAveragesImpl <em>Averages</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.output.impl.OutputAveragesImpl
     * @see org.openscada.configurator.module.common.output.impl.OutputPackageImpl#getOutputAverages()
     * @generated
     */
    int OUTPUT_AVERAGES = 0;

    /**
     * The number of structural features of the '<em>Averages</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_AVERAGES_FEATURE_COUNT = MasterPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.output.impl.OutputItemsImpl <em>Items</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.output.impl.OutputItemsImpl
     * @see org.openscada.configurator.module.common.output.impl.OutputPackageImpl#getOutputItems()
     * @generated
     */
    int OUTPUT_ITEMS = 1;

    /**
     * The number of structural features of the '<em>Items</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_ITEMS_FEATURE_COUNT = MasterPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.output.impl.OutputSummariesImpl <em>Summaries</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.output.impl.OutputSummariesImpl
     * @see org.openscada.configurator.module.common.output.impl.OutputPackageImpl#getOutputSummaries()
     * @generated
     */
    int OUTPUT_SUMMARIES = 2;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SUMMARIES__PREFIX = MasterPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Suffix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SUMMARIES__SUFFIX = MasterPackage.MODULE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Summaries</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SUMMARIES_FEATURE_COUNT = MasterPackage.MODULE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.output.impl.OutputGlobalSummariesImpl <em>Global Summaries</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.output.impl.OutputGlobalSummariesImpl
     * @see org.openscada.configurator.module.common.output.impl.OutputPackageImpl#getOutputGlobalSummaries()
     * @generated
     */
    int OUTPUT_GLOBAL_SUMMARIES = 3;

    /**
     * The number of structural features of the '<em>Global Summaries</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_GLOBAL_SUMMARIES_FEATURE_COUNT = MasterPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.output.OutputAverages <em>Averages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Averages</em>'.
     * @see org.openscada.configurator.module.common.output.OutputAverages
     * @generated
     */
    EClass getOutputAverages ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.output.OutputItems <em>Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Items</em>'.
     * @see org.openscada.configurator.module.common.output.OutputItems
     * @generated
     */
    EClass getOutputItems ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.output.OutputSummaries <em>Summaries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Summaries</em>'.
     * @see org.openscada.configurator.module.common.output.OutputSummaries
     * @generated
     */
    EClass getOutputSummaries ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.output.OutputSummaries#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see org.openscada.configurator.module.common.output.OutputSummaries#getPrefix()
     * @see #getOutputSummaries()
     * @generated
     */
    EAttribute getOutputSummaries_Prefix ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.output.OutputSummaries#getSuffix <em>Suffix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Suffix</em>'.
     * @see org.openscada.configurator.module.common.output.OutputSummaries#getSuffix()
     * @see #getOutputSummaries()
     * @generated
     */
    EAttribute getOutputSummaries_Suffix ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.output.OutputGlobalSummaries <em>Global Summaries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Summaries</em>'.
     * @see org.openscada.configurator.module.common.output.OutputGlobalSummaries
     * @generated
     */
    EClass getOutputGlobalSummaries ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    OutputFactory getOutputFactory ();

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
         * The meta object literal for the '{@link org.openscada.configurator.module.common.output.impl.OutputAveragesImpl <em>Averages</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.output.impl.OutputAveragesImpl
         * @see org.openscada.configurator.module.common.output.impl.OutputPackageImpl#getOutputAverages()
         * @generated
         */
        EClass OUTPUT_AVERAGES = eINSTANCE.getOutputAverages ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.output.impl.OutputItemsImpl <em>Items</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.output.impl.OutputItemsImpl
         * @see org.openscada.configurator.module.common.output.impl.OutputPackageImpl#getOutputItems()
         * @generated
         */
        EClass OUTPUT_ITEMS = eINSTANCE.getOutputItems ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.output.impl.OutputSummariesImpl <em>Summaries</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.output.impl.OutputSummariesImpl
         * @see org.openscada.configurator.module.common.output.impl.OutputPackageImpl#getOutputSummaries()
         * @generated
         */
        EClass OUTPUT_SUMMARIES = eINSTANCE.getOutputSummaries ();

        /**
         * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_SUMMARIES__PREFIX = eINSTANCE.getOutputSummaries_Prefix ();

        /**
         * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_SUMMARIES__SUFFIX = eINSTANCE.getOutputSummaries_Suffix ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.output.impl.OutputGlobalSummariesImpl <em>Global Summaries</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.output.impl.OutputGlobalSummariesImpl
         * @see org.openscada.configurator.module.common.output.impl.OutputPackageImpl#getOutputGlobalSummaries()
         * @generated
         */
        EClass OUTPUT_GLOBAL_SUMMARIES = eINSTANCE.getOutputGlobalSummaries ();

    }

} //OutputPackage

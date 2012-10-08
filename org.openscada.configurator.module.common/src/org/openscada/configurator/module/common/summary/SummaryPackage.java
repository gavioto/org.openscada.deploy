/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary;

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
 * @see org.openscada.configurator.module.common.summary.SummaryFactory
 * @model kind="package"
 * @generated
 */
public interface SummaryPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "summary";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configurator/Modules/Common/Summary";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "summary";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SummaryPackage eINSTANCE = org.openscada.configurator.module.common.summary.impl.SummaryPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.summary.impl.GenerateSummariesImpl <em>Generate Summaries</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.summary.impl.GenerateSummariesImpl
     * @see org.openscada.configurator.module.common.summary.impl.SummaryPackageImpl#getGenerateSummaries()
     * @generated
     */
    int GENERATE_SUMMARIES = 0;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATE_SUMMARIES__PREFIX = MasterPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Suffix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATE_SUMMARIES__SUFFIX = MasterPackage.MODULE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Generate Summaries</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATE_SUMMARIES_FEATURE_COUNT = MasterPackage.MODULE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.summary.impl.CleanupSummariesImpl <em>Cleanup Summaries</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.summary.impl.CleanupSummariesImpl
     * @see org.openscada.configurator.module.common.summary.impl.SummaryPackageImpl#getCleanupSummaries()
     * @generated
     */
    int CLEANUP_SUMMARIES = 1;

    /**
     * The feature id for the '<em><b>Required Items</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLEANUP_SUMMARIES__REQUIRED_ITEMS = MasterPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Cleanup Summaries</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLEANUP_SUMMARIES_FEATURE_COUNT = MasterPackage.MODULE_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.summary.GenerateSummaries <em>Generate Summaries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generate Summaries</em>'.
     * @see org.openscada.configurator.module.common.summary.GenerateSummaries
     * @generated
     */
    EClass getGenerateSummaries ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.summary.GenerateSummaries#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see org.openscada.configurator.module.common.summary.GenerateSummaries#getPrefix()
     * @see #getGenerateSummaries()
     * @generated
     */
    EAttribute getGenerateSummaries_Prefix ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.summary.GenerateSummaries#getSuffix <em>Suffix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Suffix</em>'.
     * @see org.openscada.configurator.module.common.summary.GenerateSummaries#getSuffix()
     * @see #getGenerateSummaries()
     * @generated
     */
    EAttribute getGenerateSummaries_Suffix ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.summary.CleanupSummaries <em>Cleanup Summaries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cleanup Summaries</em>'.
     * @see org.openscada.configurator.module.common.summary.CleanupSummaries
     * @generated
     */
    EClass getCleanupSummaries ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.summary.CleanupSummaries#getRequiredItems <em>Required Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Required Items</em>'.
     * @see org.openscada.configurator.module.common.summary.CleanupSummaries#getRequiredItems()
     * @see #getCleanupSummaries()
     * @generated
     */
    EAttribute getCleanupSummaries_RequiredItems ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SummaryFactory getSummaryFactory ();

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
         * The meta object literal for the '{@link org.openscada.configurator.module.common.summary.impl.GenerateSummariesImpl <em>Generate Summaries</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.summary.impl.GenerateSummariesImpl
         * @see org.openscada.configurator.module.common.summary.impl.SummaryPackageImpl#getGenerateSummaries()
         * @generated
         */
        EClass GENERATE_SUMMARIES = eINSTANCE.getGenerateSummaries ();

        /**
         * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERATE_SUMMARIES__PREFIX = eINSTANCE.getGenerateSummaries_Prefix ();

        /**
         * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERATE_SUMMARIES__SUFFIX = eINSTANCE.getGenerateSummaries_Suffix ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.summary.impl.CleanupSummariesImpl <em>Cleanup Summaries</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.summary.impl.CleanupSummariesImpl
         * @see org.openscada.configurator.module.common.summary.impl.SummaryPackageImpl#getCleanupSummaries()
         * @generated
         */
        EClass CLEANUP_SUMMARIES = eINSTANCE.getCleanupSummaries ();

        /**
         * The meta object literal for the '<em><b>Required Items</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLEANUP_SUMMARIES__REQUIRED_ITEMS = eINSTANCE.getCleanupSummaries_RequiredItems ();

    }

} //SummaryPackage

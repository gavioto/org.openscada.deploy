/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global;

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
 * @see org.openscada.configurator.processor.common.global.GlobalFactory
 * @model kind="package"
 * @generated
 */
public interface GlobalPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "global";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configurator/Processors/Common/Global";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "global";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GlobalPackage eINSTANCE = org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl <em>Transform Site To Global</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl
     * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getTransformSiteToGlobal()
     * @generated
     */
    int TRANSFORM_SITE_TO_GLOBAL = 0;

    /**
     * The feature id for the '<em><b>Global Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sites</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__SITES = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Transform Site To Global</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL_FEATURE_COUNT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.global.impl.SiteImpl <em>Site</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.global.impl.SiteImpl
     * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getSite()
     * @generated
     */
    int SITE = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITE__ID = 0;

    /**
     * The feature id for the '<em><b>Connection Da</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITE__CONNECTION_DA = 1;

    /**
     * The feature id for the '<em><b>Connection Ae</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITE__CONNECTION_AE = 2;

    /**
     * The feature id for the '<em><b>Site Output Dir</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITE__SITE_OUTPUT_DIR = 3;

    /**
     * The number of structural features of the '<em>Site</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITE_FEATURE_COUNT = 4;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal <em>Transform Site To Global</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transform Site To Global</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal
     * @generated
     */
    EClass getTransformSiteToGlobal ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getGlobalSlot <em>Global Slot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Global Slot</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getGlobalSlot()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EReference getTransformSiteToGlobal_GlobalSlot ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSites <em>Sites</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sites</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSites()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EReference getTransformSiteToGlobal_Sites ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.global.Site <em>Site</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Site</em>'.
     * @see org.openscada.configurator.processor.common.global.Site
     * @generated
     */
    EClass getSite ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.Site#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.openscada.configurator.processor.common.global.Site#getId()
     * @see #getSite()
     * @generated
     */
    EAttribute getSite_Id ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.Site#getConnectionDa <em>Connection Da</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Da</em>'.
     * @see org.openscada.configurator.processor.common.global.Site#getConnectionDa()
     * @see #getSite()
     * @generated
     */
    EAttribute getSite_ConnectionDa ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.Site#getConnectionAe <em>Connection Ae</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Ae</em>'.
     * @see org.openscada.configurator.processor.common.global.Site#getConnectionAe()
     * @see #getSite()
     * @generated
     */
    EAttribute getSite_ConnectionAe ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.Site#getSiteOutputDir <em>Site Output Dir</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Site Output Dir</em>'.
     * @see org.openscada.configurator.processor.common.global.Site#getSiteOutputDir()
     * @see #getSite()
     * @generated
     */
    EAttribute getSite_SiteOutputDir ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    GlobalFactory getGlobalFactory ();

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
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl <em>Transform Site To Global</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl
         * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getTransformSiteToGlobal()
         * @generated
         */
        EClass TRANSFORM_SITE_TO_GLOBAL = eINSTANCE.getTransformSiteToGlobal ();

        /**
         * The meta object literal for the '<em><b>Global Slot</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT = eINSTANCE.getTransformSiteToGlobal_GlobalSlot ();

        /**
         * The meta object literal for the '<em><b>Sites</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSFORM_SITE_TO_GLOBAL__SITES = eINSTANCE.getTransformSiteToGlobal_Sites ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.global.impl.SiteImpl <em>Site</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.global.impl.SiteImpl
         * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getSite()
         * @generated
         */
        EClass SITE = eINSTANCE.getSite ();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SITE__ID = eINSTANCE.getSite_Id ();

        /**
         * The meta object literal for the '<em><b>Connection Da</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SITE__CONNECTION_DA = eINSTANCE.getSite_ConnectionDa ();

        /**
         * The meta object literal for the '<em><b>Connection Ae</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SITE__CONNECTION_AE = eINSTANCE.getSite_ConnectionAe ();

        /**
         * The meta object literal for the '<em><b>Site Output Dir</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SITE__SITE_OUTPUT_DIR = eINSTANCE.getSite_SiteOutputDir ();

    }

} //GlobalPackage

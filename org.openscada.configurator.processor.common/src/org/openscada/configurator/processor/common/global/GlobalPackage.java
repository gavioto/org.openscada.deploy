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
     * The feature id for the '<em><b>Connection Id Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Hierarchy Prefix</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Connection Item State Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Connection Item String State Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Summary Item Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Summary Item Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Selector</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__SELECTOR = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL__QUERIES = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Transform Site To Global</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_SITE_TO_GLOBAL_FEATURE_COUNT = ConfiguratorPackage.PROCESSOR_FEATURE_COUNT + 10;

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
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITE__HIERARCHY = 4;

    /**
     * The number of structural features of the '<em>Site</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.global.impl.ItemSelectorImpl <em>Item Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.global.impl.ItemSelectorImpl
     * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getItemSelector()
     * @generated
     */
    int ITEM_SELECTOR = 2;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_SELECTOR__PATTERN = 0;

    /**
     * The number of structural features of the '<em>Item Selector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_SELECTOR_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.global.impl.ExcludeImpl <em>Exclude</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.global.impl.ExcludeImpl
     * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getExclude()
     * @generated
     */
    int EXCLUDE = 3;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUDE__PATTERN = ITEM_SELECTOR__PATTERN;

    /**
     * The number of structural features of the '<em>Exclude</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUDE_FEATURE_COUNT = ITEM_SELECTOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.global.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.global.impl.IncludeImpl
     * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getInclude()
     * @generated
     */
    int INCLUDE = 4;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE__PATTERN = ITEM_SELECTOR__PATTERN;

    /**
     * The number of structural features of the '<em>Include</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_FEATURE_COUNT = ITEM_SELECTOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.global.impl.QueryImportImpl <em>Query Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.global.impl.QueryImportImpl
     * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getQueryImport()
     * @generated
     */
    int QUERY_IMPORT = 5;

    /**
     * The feature id for the '<em><b>Local Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY_IMPORT__LOCAL_NAME = 0;

    /**
     * The feature id for the '<em><b>Include Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY_IMPORT__INCLUDE_LOCAL = 1;

    /**
     * The feature id for the '<em><b>Remote Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY_IMPORT__REMOTE_NAME = 2;

    /**
     * The number of structural features of the '<em>Query Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY_IMPORT_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.global.impl.MonitorQueryImportImpl <em>Monitor Query Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.global.impl.MonitorQueryImportImpl
     * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getMonitorQueryImport()
     * @generated
     */
    int MONITOR_QUERY_IMPORT = 6;

    /**
     * The feature id for the '<em><b>Local Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITOR_QUERY_IMPORT__LOCAL_NAME = QUERY_IMPORT__LOCAL_NAME;

    /**
     * The feature id for the '<em><b>Include Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITOR_QUERY_IMPORT__INCLUDE_LOCAL = QUERY_IMPORT__INCLUDE_LOCAL;

    /**
     * The feature id for the '<em><b>Remote Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITOR_QUERY_IMPORT__REMOTE_NAME = QUERY_IMPORT__REMOTE_NAME;

    /**
     * The number of structural features of the '<em>Monitor Query Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITOR_QUERY_IMPORT_FEATURE_COUNT = QUERY_IMPORT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.processor.common.global.impl.EventQueryImportImpl <em>Event Query Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.processor.common.global.impl.EventQueryImportImpl
     * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getEventQueryImport()
     * @generated
     */
    int EVENT_QUERY_IMPORT = 7;

    /**
     * The feature id for the '<em><b>Local Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_QUERY_IMPORT__LOCAL_NAME = QUERY_IMPORT__LOCAL_NAME;

    /**
     * The feature id for the '<em><b>Include Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_QUERY_IMPORT__INCLUDE_LOCAL = QUERY_IMPORT__INCLUDE_LOCAL;

    /**
     * The feature id for the '<em><b>Remote Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_QUERY_IMPORT__REMOTE_NAME = QUERY_IMPORT__REMOTE_NAME;

    /**
     * The feature id for the '<em><b>Local Pool Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_QUERY_IMPORT__LOCAL_POOL_SIZE = QUERY_IMPORT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Event Query Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_QUERY_IMPORT_FEATURE_COUNT = QUERY_IMPORT_FEATURE_COUNT + 1;

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
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionIdFormat <em>Connection Id Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Id Format</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionIdFormat()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EAttribute getTransformSiteToGlobal_ConnectionIdFormat ();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getHierarchyPrefix <em>Hierarchy Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Hierarchy Prefix</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getHierarchyPrefix()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EAttribute getTransformSiteToGlobal_HierarchyPrefix ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionItemStateFormat <em>Connection Item State Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Item State Format</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionItemStateFormat()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EAttribute getTransformSiteToGlobal_ConnectionItemStateFormat ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionItemStringStateFormat <em>Connection Item String State Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Item String State Format</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionItemStringStateFormat()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EAttribute getTransformSiteToGlobal_ConnectionItemStringStateFormat ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSummaryItemPattern <em>Summary Item Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Summary Item Pattern</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSummaryItemPattern()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EAttribute getTransformSiteToGlobal_SummaryItemPattern ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSummaryItemFormat <em>Summary Item Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Summary Item Format</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSummaryItemFormat()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EAttribute getTransformSiteToGlobal_SummaryItemFormat ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Selector</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSelector()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EReference getTransformSiteToGlobal_Selector ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getQueries <em>Queries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Queries</em>'.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getQueries()
     * @see #getTransformSiteToGlobal()
     * @generated
     */
    EReference getTransformSiteToGlobal_Queries ();

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
     * Returns the meta object for the attribute list '{@link org.openscada.configurator.processor.common.global.Site#getHierarchy <em>Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Hierarchy</em>'.
     * @see org.openscada.configurator.processor.common.global.Site#getHierarchy()
     * @see #getSite()
     * @generated
     */
    EAttribute getSite_Hierarchy ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.global.ItemSelector <em>Item Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Selector</em>'.
     * @see org.openscada.configurator.processor.common.global.ItemSelector
     * @generated
     */
    EClass getItemSelector ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.ItemSelector#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern</em>'.
     * @see org.openscada.configurator.processor.common.global.ItemSelector#getPattern()
     * @see #getItemSelector()
     * @generated
     */
    EAttribute getItemSelector_Pattern ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.global.Exclude <em>Exclude</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exclude</em>'.
     * @see org.openscada.configurator.processor.common.global.Exclude
     * @generated
     */
    EClass getExclude ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.global.Include <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Include</em>'.
     * @see org.openscada.configurator.processor.common.global.Include
     * @generated
     */
    EClass getInclude ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.global.QueryImport <em>Query Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Query Import</em>'.
     * @see org.openscada.configurator.processor.common.global.QueryImport
     * @generated
     */
    EClass getQueryImport ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.QueryImport#getLocalName <em>Local Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Name</em>'.
     * @see org.openscada.configurator.processor.common.global.QueryImport#getLocalName()
     * @see #getQueryImport()
     * @generated
     */
    EAttribute getQueryImport_LocalName ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.QueryImport#isIncludeLocal <em>Include Local</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Include Local</em>'.
     * @see org.openscada.configurator.processor.common.global.QueryImport#isIncludeLocal()
     * @see #getQueryImport()
     * @generated
     */
    EAttribute getQueryImport_IncludeLocal ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.QueryImport#getRemoteName <em>Remote Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Name</em>'.
     * @see org.openscada.configurator.processor.common.global.QueryImport#getRemoteName()
     * @see #getQueryImport()
     * @generated
     */
    EAttribute getQueryImport_RemoteName ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.global.MonitorQueryImport <em>Monitor Query Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Monitor Query Import</em>'.
     * @see org.openscada.configurator.processor.common.global.MonitorQueryImport
     * @generated
     */
    EClass getMonitorQueryImport ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.processor.common.global.EventQueryImport <em>Event Query Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Query Import</em>'.
     * @see org.openscada.configurator.processor.common.global.EventQueryImport
     * @generated
     */
    EClass getEventQueryImport ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.processor.common.global.EventQueryImport#getLocalPoolSize <em>Local Pool Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Pool Size</em>'.
     * @see org.openscada.configurator.processor.common.global.EventQueryImport#getLocalPoolSize()
     * @see #getEventQueryImport()
     * @generated
     */
    EAttribute getEventQueryImport_LocalPoolSize ();

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
         * The meta object literal for the '<em><b>Connection Id Format</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT = eINSTANCE.getTransformSiteToGlobal_ConnectionIdFormat ();

        /**
         * The meta object literal for the '<em><b>Hierarchy Prefix</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX = eINSTANCE.getTransformSiteToGlobal_HierarchyPrefix ();

        /**
         * The meta object literal for the '<em><b>Connection Item State Format</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT = eINSTANCE.getTransformSiteToGlobal_ConnectionItemStateFormat ();

        /**
         * The meta object literal for the '<em><b>Connection Item String State Format</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT = eINSTANCE.getTransformSiteToGlobal_ConnectionItemStringStateFormat ();

        /**
         * The meta object literal for the '<em><b>Summary Item Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN = eINSTANCE.getTransformSiteToGlobal_SummaryItemPattern ();

        /**
         * The meta object literal for the '<em><b>Summary Item Format</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT = eINSTANCE.getTransformSiteToGlobal_SummaryItemFormat ();

        /**
         * The meta object literal for the '<em><b>Selector</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSFORM_SITE_TO_GLOBAL__SELECTOR = eINSTANCE.getTransformSiteToGlobal_Selector ();

        /**
         * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSFORM_SITE_TO_GLOBAL__QUERIES = eINSTANCE.getTransformSiteToGlobal_Queries ();

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

        /**
         * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SITE__HIERARCHY = eINSTANCE.getSite_Hierarchy ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.global.impl.ItemSelectorImpl <em>Item Selector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.global.impl.ItemSelectorImpl
         * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getItemSelector()
         * @generated
         */
        EClass ITEM_SELECTOR = eINSTANCE.getItemSelector ();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_SELECTOR__PATTERN = eINSTANCE.getItemSelector_Pattern ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.global.impl.ExcludeImpl <em>Exclude</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.global.impl.ExcludeImpl
         * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getExclude()
         * @generated
         */
        EClass EXCLUDE = eINSTANCE.getExclude ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.global.impl.IncludeImpl <em>Include</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.global.impl.IncludeImpl
         * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getInclude()
         * @generated
         */
        EClass INCLUDE = eINSTANCE.getInclude ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.global.impl.QueryImportImpl <em>Query Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.global.impl.QueryImportImpl
         * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getQueryImport()
         * @generated
         */
        EClass QUERY_IMPORT = eINSTANCE.getQueryImport ();

        /**
         * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUERY_IMPORT__LOCAL_NAME = eINSTANCE.getQueryImport_LocalName ();

        /**
         * The meta object literal for the '<em><b>Include Local</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUERY_IMPORT__INCLUDE_LOCAL = eINSTANCE.getQueryImport_IncludeLocal ();

        /**
         * The meta object literal for the '<em><b>Remote Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUERY_IMPORT__REMOTE_NAME = eINSTANCE.getQueryImport_RemoteName ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.global.impl.MonitorQueryImportImpl <em>Monitor Query Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.global.impl.MonitorQueryImportImpl
         * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getMonitorQueryImport()
         * @generated
         */
        EClass MONITOR_QUERY_IMPORT = eINSTANCE.getMonitorQueryImport ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.processor.common.global.impl.EventQueryImportImpl <em>Event Query Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.processor.common.global.impl.EventQueryImportImpl
         * @see org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl#getEventQueryImport()
         * @generated
         */
        EClass EVENT_QUERY_IMPORT = eINSTANCE.getEventQueryImport ();

        /**
         * The meta object literal for the '<em><b>Local Pool Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_QUERY_IMPORT__LOCAL_POOL_SIZE = eINSTANCE.getEventQueryImport_LocalPoolSize ();

    }

} //GlobalPackage

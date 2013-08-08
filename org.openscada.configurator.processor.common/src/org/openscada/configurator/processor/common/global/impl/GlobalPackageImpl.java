/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.master.MasterPackage;
import org.openscada.configuration.security.SecurityPackage;
import org.openscada.configurator.processor.common.CommonPackage;
import org.openscada.configurator.processor.common.global.AePullConfiguration;
import org.openscada.configurator.processor.common.global.EventQueryImport;
import org.openscada.configurator.processor.common.global.Exclude;
import org.openscada.configurator.processor.common.global.GlobalFactory;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.Include;
import org.openscada.configurator.processor.common.global.ItemSelector;
import org.openscada.configurator.processor.common.global.MonitorQueryImport;
import org.openscada.configurator.processor.common.global.PropertyEntry;
import org.openscada.configurator.processor.common.global.QueryImport;
import org.openscada.configurator.processor.common.global.Site;
import org.openscada.configurator.processor.common.global.TransformSiteToGlobal;
import org.openscada.configurator.processor.common.impl.CommonPackageImpl;
import org.openscada.configurator.processor.common.main.MainPackage;
import org.openscada.configurator.processor.common.main.impl.MainPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalPackageImpl extends EPackageImpl implements GlobalPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transformSiteToGlobalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass siteEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass itemSelectorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass excludeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass includeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass queryImportEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass monitorQueryImportEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventQueryImportEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass aePullConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEntryEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private GlobalPackageImpl ()
    {
        super ( eNS_URI, GlobalFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link GlobalPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static GlobalPackage init ()
    {
        if ( isInited )
            return (GlobalPackage)EPackage.Registry.INSTANCE.getEPackage ( GlobalPackage.eNS_URI );

        // Obtain or create and register package
        GlobalPackageImpl theGlobalPackage = (GlobalPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof GlobalPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new GlobalPackageImpl () );

        isInited = true;

        // Initialize simple dependencies
        ConfiguratorPackage.eINSTANCE.eClass ();
        SecurityPackage.eINSTANCE.eClass ();

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) : CommonPackage.eINSTANCE );
        MainPackageImpl theMainPackage = (MainPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) : MainPackage.eINSTANCE );

        // Create package meta-data objects
        theGlobalPackage.createPackageContents ();
        theCommonPackage.createPackageContents ();
        theMainPackage.createPackageContents ();

        // Initialize created meta-data
        theGlobalPackage.initializePackageContents ();
        theCommonPackage.initializePackageContents ();
        theMainPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theGlobalPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( GlobalPackage.eNS_URI, theGlobalPackage );
        return theGlobalPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTransformSiteToGlobal ()
    {
        return transformSiteToGlobalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransformSiteToGlobal_GlobalSlot ()
    {
        return (EReference)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransformSiteToGlobal_Sites ()
    {
        return (EReference)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransformSiteToGlobal_ConnectionIdFormat ()
    {
        return (EAttribute)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransformSiteToGlobal_HierarchyPrefix ()
    {
        return (EAttribute)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransformSiteToGlobal_ConnectionItemStateFormat ()
    {
        return (EAttribute)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransformSiteToGlobal_ConnectionItemStringStateFormat ()
    {
        return (EAttribute)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransformSiteToGlobal_SummaryItemPattern ()
    {
        return (EAttribute)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransformSiteToGlobal_SummaryItemFormat ()
    {
        return (EAttribute)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransformSiteToGlobal_Selector ()
    {
        return (EReference)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransformSiteToGlobal_Queries ()
    {
        return (EReference)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransformSiteToGlobal_AePullConfiguration ()
    {
        return (EReference)transformSiteToGlobalEClass.getEStructuralFeatures ().get ( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSite ()
    {
        return siteEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSite_Id ()
    {
        return (EAttribute)siteEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSite_ConnectionDa ()
    {
        return (EAttribute)siteEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSite_ConnectionAe ()
    {
        return (EAttribute)siteEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSite_SiteOutputDir ()
    {
        return (EAttribute)siteEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSite_Hierarchy ()
    {
        return (EAttribute)siteEClass.getEStructuralFeatures ().get ( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSite_AknPattern ()
    {
        return (EAttribute)siteEClass.getEStructuralFeatures ().get ( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getItemSelector ()
    {
        return itemSelectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItemSelector_Pattern ()
    {
        return (EAttribute)itemSelectorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExclude ()
    {
        return excludeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInclude ()
    {
        return includeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQueryImport ()
    {
        return queryImportEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQueryImport_LocalName ()
    {
        return (EAttribute)queryImportEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQueryImport_IncludeLocal ()
    {
        return (EAttribute)queryImportEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQueryImport_RemoteName ()
    {
        return (EAttribute)queryImportEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMonitorQueryImport ()
    {
        return monitorQueryImportEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventQueryImport ()
    {
        return eventQueryImportEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventQueryImport_LocalPoolSize ()
    {
        return (EAttribute)eventQueryImportEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAePullConfiguration ()
    {
        return aePullConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAePullConfiguration_DriverName ()
    {
        return (EAttribute)aePullConfigurationEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAePullConfiguration_CustomSelectSql ()
    {
        return (EAttribute)aePullConfigurationEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAePullConfiguration_CustomDeleteSql ()
    {
        return (EAttribute)aePullConfigurationEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAePullConfiguration_Delay ()
    {
        return (EAttribute)aePullConfigurationEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAePullConfiguration_Properties ()
    {
        return (EReference)aePullConfigurationEClass.getEStructuralFeatures ().get ( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyEntry ()
    {
        return propertyEntryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyEntry_Key ()
    {
        return (EAttribute)propertyEntryEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyEntry_Value ()
    {
        return (EAttribute)propertyEntryEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalFactory getGlobalFactory ()
    {
        return (GlobalFactory)getEFactoryInstance ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents ()
    {
        if ( isCreated )
            return;
        isCreated = true;

        // Create classes and their features
        transformSiteToGlobalEClass = createEClass ( TRANSFORM_SITE_TO_GLOBAL );
        createEReference ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT );
        createEReference ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__SITES );
        createEAttribute ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT );
        createEAttribute ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX );
        createEAttribute ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT );
        createEAttribute ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT );
        createEAttribute ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN );
        createEAttribute ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT );
        createEReference ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__SELECTOR );
        createEReference ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__QUERIES );
        createEReference ( transformSiteToGlobalEClass, TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION );

        siteEClass = createEClass ( SITE );
        createEAttribute ( siteEClass, SITE__ID );
        createEAttribute ( siteEClass, SITE__CONNECTION_DA );
        createEAttribute ( siteEClass, SITE__CONNECTION_AE );
        createEAttribute ( siteEClass, SITE__SITE_OUTPUT_DIR );
        createEAttribute ( siteEClass, SITE__HIERARCHY );
        createEAttribute ( siteEClass, SITE__AKN_PATTERN );

        itemSelectorEClass = createEClass ( ITEM_SELECTOR );
        createEAttribute ( itemSelectorEClass, ITEM_SELECTOR__PATTERN );

        excludeEClass = createEClass ( EXCLUDE );

        includeEClass = createEClass ( INCLUDE );

        queryImportEClass = createEClass ( QUERY_IMPORT );
        createEAttribute ( queryImportEClass, QUERY_IMPORT__LOCAL_NAME );
        createEAttribute ( queryImportEClass, QUERY_IMPORT__INCLUDE_LOCAL );
        createEAttribute ( queryImportEClass, QUERY_IMPORT__REMOTE_NAME );

        monitorQueryImportEClass = createEClass ( MONITOR_QUERY_IMPORT );

        eventQueryImportEClass = createEClass ( EVENT_QUERY_IMPORT );
        createEAttribute ( eventQueryImportEClass, EVENT_QUERY_IMPORT__LOCAL_POOL_SIZE );

        aePullConfigurationEClass = createEClass ( AE_PULL_CONFIGURATION );
        createEAttribute ( aePullConfigurationEClass, AE_PULL_CONFIGURATION__DRIVER_NAME );
        createEAttribute ( aePullConfigurationEClass, AE_PULL_CONFIGURATION__CUSTOM_SELECT_SQL );
        createEAttribute ( aePullConfigurationEClass, AE_PULL_CONFIGURATION__CUSTOM_DELETE_SQL );
        createEAttribute ( aePullConfigurationEClass, AE_PULL_CONFIGURATION__DELAY );
        createEReference ( aePullConfigurationEClass, AE_PULL_CONFIGURATION__PROPERTIES );

        propertyEntryEClass = createEClass ( PROPERTY_ENTRY );
        createEAttribute ( propertyEntryEClass, PROPERTY_ENTRY__KEY );
        createEAttribute ( propertyEntryEClass, PROPERTY_ENTRY__VALUE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents ()
    {
        if ( isInitialized )
            return;
        isInitialized = true;

        // Initialize package
        setName ( eNAME );
        setNsPrefix ( eNS_PREFIX );
        setNsURI ( eNS_URI );

        // Obtain other dependent packages
        ConfiguratorPackage theConfiguratorPackage = (ConfiguratorPackage)EPackage.Registry.INSTANCE.getEPackage ( ConfiguratorPackage.eNS_URI );
        MasterPackage theMasterPackage = (MasterPackage)EPackage.Registry.INSTANCE.getEPackage ( MasterPackage.eNS_URI );
        CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        transformSiteToGlobalEClass.getESuperTypes ().add ( theConfiguratorPackage.getProcessor () );
        excludeEClass.getESuperTypes ().add ( this.getItemSelector () );
        includeEClass.getESuperTypes ().add ( this.getItemSelector () );
        monitorQueryImportEClass.getESuperTypes ().add ( this.getQueryImport () );
        eventQueryImportEClass.getESuperTypes ().add ( this.getQueryImport () );

        // Initialize classes and features; add operations and parameters
        initEClass ( transformSiteToGlobalEClass, TransformSiteToGlobal.class, "TransformSiteToGlobal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getTransformSiteToGlobal_GlobalSlot (), theMasterPackage.getAtlantisConfigurationSlot (), null, "globalSlot", null, 1, 1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getTransformSiteToGlobal_Sites (), this.getSite (), null, "sites", null, 0, -1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getTransformSiteToGlobal_ConnectionIdFormat (), ecorePackage.getEString (), "connectionIdFormat", "site.master.%s.%s", 1, 1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getTransformSiteToGlobal_HierarchyPrefix (), ecorePackage.getEString (), "hierarchyPrefix", null, 0, -1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getTransformSiteToGlobal_ConnectionItemStateFormat (), ecorePackage.getEString (), "connectionItemStateFormat", null, 0, 1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getTransformSiteToGlobal_ConnectionItemStringStateFormat (), ecorePackage.getEString (), "connectionItemStringStateFormat", null, 0, 1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getTransformSiteToGlobal_SummaryItemPattern (), theCommonPackage.getPattern (), "summaryItemPattern", null, 1, 1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getTransformSiteToGlobal_SummaryItemFormat (), ecorePackage.getEString (), "summaryItemFormat", null, 1, 1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getTransformSiteToGlobal_Selector (), this.getItemSelector (), null, "selector", null, 0, -1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getTransformSiteToGlobal_Queries (), this.getQueryImport (), null, "queries", null, 0, -1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getTransformSiteToGlobal_AePullConfiguration (), this.getAePullConfiguration (), null, "aePullConfiguration", null, 0, 1, TransformSiteToGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( siteEClass, Site.class, "Site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getSite_Id (), ecorePackage.getEString (), "id", null, 1, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSite_ConnectionDa (), ecorePackage.getEString (), "connectionDa", null, 1, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSite_ConnectionAe (), ecorePackage.getEString (), "connectionAe", null, 1, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSite_SiteOutputDir (), ecorePackage.getEString (), "siteOutputDir", null, 1, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSite_Hierarchy (), ecorePackage.getEString (), "hierarchy", null, 0, -1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSite_AknPattern (), theCommonPackage.getPattern (), "aknPattern", null, 0, -1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( itemSelectorEClass, ItemSelector.class, "ItemSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getItemSelector_Pattern (), theCommonPackage.getPattern (), "pattern", null, 1, 1, ItemSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( excludeEClass, Exclude.class, "Exclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( queryImportEClass, QueryImport.class, "QueryImport", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getQueryImport_LocalName (), ecorePackage.getEString (), "localName", null, 1, 1, QueryImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getQueryImport_IncludeLocal (), ecorePackage.getEBoolean (), "includeLocal", null, 1, 1, QueryImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getQueryImport_RemoteName (), ecorePackage.getEString (), "remoteName", null, 1, 1, QueryImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( monitorQueryImportEClass, MonitorQueryImport.class, "MonitorQueryImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( eventQueryImportEClass, EventQueryImport.class, "EventQueryImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getEventQueryImport_LocalPoolSize (), ecorePackage.getEInt (), "localPoolSize", "10000", 1, 1, EventQueryImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( aePullConfigurationEClass, AePullConfiguration.class, "AePullConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getAePullConfiguration_DriverName (), ecorePackage.getEString (), "driverName", null, 1, 1, AePullConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getAePullConfiguration_CustomSelectSql (), ecorePackage.getEString (), "customSelectSql", null, 0, 1, AePullConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getAePullConfiguration_CustomDeleteSql (), ecorePackage.getEString (), "customDeleteSql", null, 0, 1, AePullConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getAePullConfiguration_Delay (), ecorePackage.getEIntegerObject (), "delay", null, 0, 1, AePullConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getAePullConfiguration_Properties (), this.getPropertyEntry (), null, "properties", null, 0, -1, AePullConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( propertyEntryEClass, PropertyEntry.class, "PropertyEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getPropertyEntry_Key (), ecorePackage.getEString (), "key", null, 1, 1, PropertyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getPropertyEntry_Value (), ecorePackage.getEString (), "value", null, 1, 1, PropertyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
    }

} //GlobalPackageImpl

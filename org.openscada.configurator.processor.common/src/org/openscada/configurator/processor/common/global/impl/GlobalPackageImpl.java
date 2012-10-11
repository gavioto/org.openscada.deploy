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
import org.openscada.configurator.processor.common.CommonPackage;
import org.openscada.configurator.processor.common.global.Exclude;
import org.openscada.configurator.processor.common.global.GlobalFactory;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.Include;
import org.openscada.configurator.processor.common.global.ItemSelector;
import org.openscada.configurator.processor.common.global.Site;
import org.openscada.configurator.processor.common.global.TransformSiteToGlobal;
import org.openscada.configurator.processor.common.impl.CommonPackageImpl;

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

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) : CommonPackage.eINSTANCE );

        // Create package meta-data objects
        theGlobalPackage.createPackageContents ();
        theCommonPackage.createPackageContents ();

        // Initialize created meta-data
        theGlobalPackage.initializePackageContents ();
        theCommonPackage.initializePackageContents ();

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

        siteEClass = createEClass ( SITE );
        createEAttribute ( siteEClass, SITE__ID );
        createEAttribute ( siteEClass, SITE__CONNECTION_DA );
        createEAttribute ( siteEClass, SITE__CONNECTION_AE );
        createEAttribute ( siteEClass, SITE__SITE_OUTPUT_DIR );
        createEAttribute ( siteEClass, SITE__HIERARCHY );

        itemSelectorEClass = createEClass ( ITEM_SELECTOR );
        createEAttribute ( itemSelectorEClass, ITEM_SELECTOR__PATTERN );

        excludeEClass = createEClass ( EXCLUDE );

        includeEClass = createEClass ( INCLUDE );
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

        initEClass ( siteEClass, Site.class, "Site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getSite_Id (), ecorePackage.getEString (), "id", null, 1, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSite_ConnectionDa (), ecorePackage.getEString (), "connectionDa", null, 1, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSite_ConnectionAe (), ecorePackage.getEString (), "connectionAe", null, 1, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSite_SiteOutputDir (), ecorePackage.getEString (), "siteOutputDir", null, 1, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSite_Hierarchy (), ecorePackage.getEString (), "hierarchy", null, 0, -1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( itemSelectorEClass, ItemSelector.class, "ItemSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getItemSelector_Pattern (), theCommonPackage.getPattern (), "pattern", null, 1, 1, ItemSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( excludeEClass, Exclude.class, "Exclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
    }

} //GlobalPackageImpl

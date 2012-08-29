/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configurator.module.common.CommonPackage;
import org.openscada.configurator.module.common.impl.CommonPackageImpl;
import org.openscada.configurator.module.common.main.MainPackage;
import org.openscada.configurator.module.common.main.impl.MainPackageImpl;
import org.openscada.configurator.module.common.network.NetworkPackage;
import org.openscada.configurator.module.common.network.impl.NetworkPackageImpl;
import org.openscada.configurator.module.common.processing.ImportListModule;
import org.openscada.configurator.module.common.processing.ImportModule;
import org.openscada.configurator.module.common.processing.OverrideListModule;
import org.openscada.configurator.module.common.processing.ProcessingFactory;
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.RemoveInactive;
import org.openscada.configurator.module.common.processing.ScriptOverrides;
import org.openscada.configurator.module.common.scripts.ScriptsPackage;
import org.openscada.configurator.module.common.scripts.impl.ScriptsPackageImpl;
import org.openscada.configurator.module.common.summary.SummaryPackage;
import org.openscada.configurator.module.common.summary.impl.SummaryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingPackageImpl extends EPackageImpl implements ProcessingPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass importModuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass overrideListModuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass importListModuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptOverridesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass removeInactiveEClass = null;

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
     * @see org.openscada.configurator.module.common.processing.ProcessingPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ProcessingPackageImpl ()
    {
        super ( eNS_URI, ProcessingFactory.eINSTANCE );
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
     * <p>This method is used to initialize {@link ProcessingPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ProcessingPackage init ()
    {
        if ( isInited )
            return (ProcessingPackage)EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI );

        // Obtain or create and register package
        ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new ProcessingPackageImpl () );

        isInited = true;

        // Initialize simple dependencies
        ConfiguratorPackage.eINSTANCE.eClass ();

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) : CommonPackage.eINSTANCE );
        NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) : NetworkPackage.eINSTANCE );
        ScriptsPackageImpl theScriptsPackage = (ScriptsPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) instanceof ScriptsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) : ScriptsPackage.eINSTANCE );
        SummaryPackageImpl theSummaryPackage = (SummaryPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) instanceof SummaryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) : SummaryPackage.eINSTANCE );
        MainPackageImpl theMainPackage = (MainPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) : MainPackage.eINSTANCE );

        // Create package meta-data objects
        theProcessingPackage.createPackageContents ();
        theCommonPackage.createPackageContents ();
        theNetworkPackage.createPackageContents ();
        theScriptsPackage.createPackageContents ();
        theSummaryPackage.createPackageContents ();
        theMainPackage.createPackageContents ();

        // Initialize created meta-data
        theProcessingPackage.initializePackageContents ();
        theCommonPackage.initializePackageContents ();
        theNetworkPackage.initializePackageContents ();
        theScriptsPackage.initializePackageContents ();
        theSummaryPackage.initializePackageContents ();
        theMainPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theProcessingPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( ProcessingPackage.eNS_URI, theProcessingPackage );
        return theProcessingPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImportModule ()
    {
        return importModuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOverrideListModule ()
    {
        return overrideListModuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImportListModule ()
    {
        return importListModuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScriptOverrides ()
    {
        return scriptOverridesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoveInactive ()
    {
        return removeInactiveEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessingFactory getProcessingFactory ()
    {
        return (ProcessingFactory)getEFactoryInstance ();
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
        importModuleEClass = createEClass ( IMPORT_MODULE );

        overrideListModuleEClass = createEClass ( OVERRIDE_LIST_MODULE );

        importListModuleEClass = createEClass ( IMPORT_LIST_MODULE );

        scriptOverridesEClass = createEClass ( SCRIPT_OVERRIDES );

        removeInactiveEClass = createEClass ( REMOVE_INACTIVE );
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
        CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        importModuleEClass.getESuperTypes ().add ( theConfiguratorPackage.getModule () );
        importModuleEClass.getESuperTypes ().add ( theCommonPackage.getFileModule () );
        overrideListModuleEClass.getESuperTypes ().add ( theCommonPackage.getFileModule () );
        importListModuleEClass.getESuperTypes ().add ( theCommonPackage.getFileModule () );
        scriptOverridesEClass.getESuperTypes ().add ( theCommonPackage.getFileModule () );
        removeInactiveEClass.getESuperTypes ().add ( theConfiguratorPackage.getModule () );

        // Initialize classes and features; add operations and parameters
        initEClass ( importModuleEClass, ImportModule.class, "ImportModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( overrideListModuleEClass, OverrideListModule.class, "OverrideListModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( importListModuleEClass, ImportListModule.class, "ImportListModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( scriptOverridesEClass, ScriptOverrides.class, "ScriptOverrides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( removeInactiveEClass, RemoveInactive.class, "RemoveInactive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
    }

} //ProcessingPackageImpl

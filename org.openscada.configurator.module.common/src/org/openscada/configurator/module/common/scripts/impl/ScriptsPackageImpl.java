/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.scripts.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configurator.module.common.CommonPackage;
import org.openscada.configurator.module.common.impl.CommonPackageImpl;
import org.openscada.configurator.module.common.main.MainPackage;
import org.openscada.configurator.module.common.main.impl.MainPackageImpl;
import org.openscada.configurator.module.common.marker.MarkerPackage;
import org.openscada.configurator.module.common.marker.impl.MarkerPackageImpl;
import org.openscada.configurator.module.common.network.NetworkPackage;
import org.openscada.configurator.module.common.network.impl.NetworkPackageImpl;
import org.openscada.configurator.module.common.output.OutputPackage;
import org.openscada.configurator.module.common.output.impl.OutputPackageImpl;
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl;
import org.openscada.configurator.module.common.scripts.LegacyFormulaModule;
import org.openscada.configurator.module.common.scripts.ScriptsFactory;
import org.openscada.configurator.module.common.scripts.ScriptsModule;
import org.openscada.configurator.module.common.scripts.ScriptsMonitorModule;
import org.openscada.configurator.module.common.scripts.ScriptsPackage;
import org.openscada.configurator.module.common.summary.SummaryPackage;
import org.openscada.configurator.module.common.summary.impl.SummaryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptsPackageImpl extends EPackageImpl implements ScriptsPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptsModuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass legacyFormulaModuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptsMonitorModuleEClass = null;

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
     * @see org.openscada.configurator.module.common.scripts.ScriptsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ScriptsPackageImpl ()
    {
        super ( eNS_URI, ScriptsFactory.eINSTANCE );
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
     * <p>This method is used to initialize {@link ScriptsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ScriptsPackage init ()
    {
        if ( isInited )
            return (ScriptsPackage)EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI );

        // Obtain or create and register package
        ScriptsPackageImpl theScriptsPackage = (ScriptsPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof ScriptsPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new ScriptsPackageImpl () );

        isInited = true;

        // Initialize simple dependencies
        ConfiguratorPackage.eINSTANCE.eClass ();

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) : CommonPackage.eINSTANCE );
        NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) : NetworkPackage.eINSTANCE );
        ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) : ProcessingPackage.eINSTANCE );
        SummaryPackageImpl theSummaryPackage = (SummaryPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) instanceof SummaryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) : SummaryPackage.eINSTANCE );
        MainPackageImpl theMainPackage = (MainPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) : MainPackage.eINSTANCE );
        MarkerPackageImpl theMarkerPackage = (MarkerPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MarkerPackage.eNS_URI ) instanceof MarkerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MarkerPackage.eNS_URI ) : MarkerPackage.eINSTANCE );
        OutputPackageImpl theOutputPackage = (OutputPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( OutputPackage.eNS_URI ) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( OutputPackage.eNS_URI ) : OutputPackage.eINSTANCE );

        // Create package meta-data objects
        theScriptsPackage.createPackageContents ();
        theCommonPackage.createPackageContents ();
        theNetworkPackage.createPackageContents ();
        theProcessingPackage.createPackageContents ();
        theSummaryPackage.createPackageContents ();
        theMainPackage.createPackageContents ();
        theMarkerPackage.createPackageContents ();
        theOutputPackage.createPackageContents ();

        // Initialize created meta-data
        theScriptsPackage.initializePackageContents ();
        theCommonPackage.initializePackageContents ();
        theNetworkPackage.initializePackageContents ();
        theProcessingPackage.initializePackageContents ();
        theSummaryPackage.initializePackageContents ();
        theMainPackage.initializePackageContents ();
        theMarkerPackage.initializePackageContents ();
        theOutputPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theScriptsPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( ScriptsPackage.eNS_URI, theScriptsPackage );
        return theScriptsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScriptsModule ()
    {
        return scriptsModuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScriptsModule_ScriptsFile ()
    {
        return (EAttribute)scriptsModuleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLegacyFormulaModule ()
    {
        return legacyFormulaModuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLegacyFormulaModule_FormulaFile ()
    {
        return (EAttribute)legacyFormulaModuleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScriptsMonitorModule ()
    {
        return scriptsMonitorModuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptsFactory getScriptsFactory ()
    {
        return (ScriptsFactory)getEFactoryInstance ();
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
        scriptsModuleEClass = createEClass ( SCRIPTS_MODULE );
        createEAttribute ( scriptsModuleEClass, SCRIPTS_MODULE__SCRIPTS_FILE );

        legacyFormulaModuleEClass = createEClass ( LEGACY_FORMULA_MODULE );
        createEAttribute ( legacyFormulaModuleEClass, LEGACY_FORMULA_MODULE__FORMULA_FILE );

        scriptsMonitorModuleEClass = createEClass ( SCRIPTS_MONITOR_MODULE );
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
        scriptsModuleEClass.getESuperTypes ().add ( theConfiguratorPackage.getModule () );
        legacyFormulaModuleEClass.getESuperTypes ().add ( theConfiguratorPackage.getModule () );
        scriptsMonitorModuleEClass.getESuperTypes ().add ( theCommonPackage.getFileModule () );

        // Initialize classes and features; add operations and parameters
        initEClass ( scriptsModuleEClass, ScriptsModule.class, "ScriptsModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getScriptsModule_ScriptsFile (), ecorePackage.getEString (), "scriptsFile", null, 1, 1, ScriptsModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( legacyFormulaModuleEClass, LegacyFormulaModule.class, "LegacyFormulaModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getLegacyFormulaModule_FormulaFile (), ecorePackage.getEString (), "formulaFile", null, 1, 1, LegacyFormulaModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( scriptsMonitorModuleEClass, ScriptsMonitorModule.class, "ScriptsMonitorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
    }

} //ScriptsPackageImpl

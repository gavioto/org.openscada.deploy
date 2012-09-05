/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary.impl;

import org.eclipse.emf.ecore.EAttribute;
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
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.impl.ProcessingPackageImpl;
import org.openscada.configurator.module.common.scripts.ScriptsPackage;
import org.openscada.configurator.module.common.scripts.impl.ScriptsPackageImpl;
import org.openscada.configurator.module.common.summary.GenerateSummaries;
import org.openscada.configurator.module.common.summary.SummaryFactory;
import org.openscada.configurator.module.common.summary.SummaryFileLoader;
import org.openscada.configurator.module.common.summary.SummaryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SummaryPackageImpl extends EPackageImpl implements SummaryPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass summaryFileLoaderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass generateSummariesEClass = null;

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
     * @see org.openscada.configurator.module.common.summary.SummaryPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SummaryPackageImpl ()
    {
        super ( eNS_URI, SummaryFactory.eINSTANCE );
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
     * <p>This method is used to initialize {@link SummaryPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SummaryPackage init ()
    {
        if ( isInited )
            return (SummaryPackage)EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI );

        // Obtain or create and register package
        SummaryPackageImpl theSummaryPackage = (SummaryPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof SummaryPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new SummaryPackageImpl () );

        isInited = true;

        // Initialize simple dependencies
        ConfiguratorPackage.eINSTANCE.eClass ();

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) : CommonPackage.eINSTANCE );
        NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) : NetworkPackage.eINSTANCE );
        ScriptsPackageImpl theScriptsPackage = (ScriptsPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) instanceof ScriptsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) : ScriptsPackage.eINSTANCE );
        ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) : ProcessingPackage.eINSTANCE );
        MainPackageImpl theMainPackage = (MainPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) : MainPackage.eINSTANCE );

        // Create package meta-data objects
        theSummaryPackage.createPackageContents ();
        theCommonPackage.createPackageContents ();
        theNetworkPackage.createPackageContents ();
        theScriptsPackage.createPackageContents ();
        theProcessingPackage.createPackageContents ();
        theMainPackage.createPackageContents ();

        // Initialize created meta-data
        theSummaryPackage.initializePackageContents ();
        theCommonPackage.initializePackageContents ();
        theNetworkPackage.initializePackageContents ();
        theScriptsPackage.initializePackageContents ();
        theProcessingPackage.initializePackageContents ();
        theMainPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theSummaryPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( SummaryPackage.eNS_URI, theSummaryPackage );
        return theSummaryPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSummaryFileLoader ()
    {
        return summaryFileLoaderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryFileLoader_RequiredItems ()
    {
        return (EAttribute)summaryFileLoaderEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryFileLoader_Prefix ()
    {
        return (EAttribute)summaryFileLoaderEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenerateSummaries ()
    {
        return generateSummariesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenerateSummaries_RequiredItems ()
    {
        return (EAttribute)generateSummariesEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SummaryFactory getSummaryFactory ()
    {
        return (SummaryFactory)getEFactoryInstance ();
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
        summaryFileLoaderEClass = createEClass ( SUMMARY_FILE_LOADER );
        createEAttribute ( summaryFileLoaderEClass, SUMMARY_FILE_LOADER__REQUIRED_ITEMS );
        createEAttribute ( summaryFileLoaderEClass, SUMMARY_FILE_LOADER__PREFIX );

        generateSummariesEClass = createEClass ( GENERATE_SUMMARIES );
        createEAttribute ( generateSummariesEClass, GENERATE_SUMMARIES__REQUIRED_ITEMS );
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
        CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI );
        ConfiguratorPackage theConfiguratorPackage = (ConfiguratorPackage)EPackage.Registry.INSTANCE.getEPackage ( ConfiguratorPackage.eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        summaryFileLoaderEClass.getESuperTypes ().add ( theCommonPackage.getFileModule () );
        generateSummariesEClass.getESuperTypes ().add ( theConfiguratorPackage.getModule () );

        // Initialize classes and features; add operations and parameters
        initEClass ( summaryFileLoaderEClass, SummaryFileLoader.class, "SummaryFileLoader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getSummaryFileLoader_RequiredItems (), ecorePackage.getEInt (), "requiredItems", "2", 1, 1, SummaryFileLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSummaryFileLoader_Prefix (), ecorePackage.getEString (), "prefix", null, 0, 1, SummaryFileLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( generateSummariesEClass, GenerateSummaries.class, "GenerateSummaries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getGenerateSummaries_RequiredItems (), ecorePackage.getEInt (), "requiredItems", "2", 1, 1, GenerateSummaries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
    }

} //SummaryPackageImpl

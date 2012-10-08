/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.master.MasterPackage;
import org.openscada.configurator.module.common.CommonFactory;
import org.openscada.configurator.module.common.CommonPackage;
import org.openscada.configurator.module.common.FileModule;
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
public class CommonPackageImpl extends EPackageImpl implements CommonPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileModuleEClass = null;

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
     * @see org.openscada.configurator.module.common.CommonPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CommonPackageImpl ()
    {
        super ( eNS_URI, CommonFactory.eINSTANCE );
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
     * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CommonPackage init ()
    {
        if ( isInited )
            return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI );

        // Obtain or create and register package
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new CommonPackageImpl () );

        isInited = true;

        // Initialize simple dependencies
        ConfiguratorPackage.eINSTANCE.eClass ();

        // Obtain or create and register interdependencies
        NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) : NetworkPackage.eINSTANCE );
        ScriptsPackageImpl theScriptsPackage = (ScriptsPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) instanceof ScriptsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) : ScriptsPackage.eINSTANCE );
        ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) : ProcessingPackage.eINSTANCE );
        SummaryPackageImpl theSummaryPackage = (SummaryPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) instanceof SummaryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) : SummaryPackage.eINSTANCE );
        MainPackageImpl theMainPackage = (MainPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) : MainPackage.eINSTANCE );
        MarkerPackageImpl theMarkerPackage = (MarkerPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MarkerPackage.eNS_URI ) instanceof MarkerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MarkerPackage.eNS_URI ) : MarkerPackage.eINSTANCE );
        OutputPackageImpl theOutputPackage = (OutputPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( OutputPackage.eNS_URI ) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( OutputPackage.eNS_URI ) : OutputPackage.eINSTANCE );

        // Create package meta-data objects
        theCommonPackage.createPackageContents ();
        theNetworkPackage.createPackageContents ();
        theScriptsPackage.createPackageContents ();
        theProcessingPackage.createPackageContents ();
        theSummaryPackage.createPackageContents ();
        theMainPackage.createPackageContents ();
        theMarkerPackage.createPackageContents ();
        theOutputPackage.createPackageContents ();

        // Initialize created meta-data
        theCommonPackage.initializePackageContents ();
        theNetworkPackage.initializePackageContents ();
        theScriptsPackage.initializePackageContents ();
        theProcessingPackage.initializePackageContents ();
        theSummaryPackage.initializePackageContents ();
        theMainPackage.initializePackageContents ();
        theMarkerPackage.initializePackageContents ();
        theOutputPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theCommonPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( CommonPackage.eNS_URI, theCommonPackage );
        return theCommonPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileModule ()
    {
        return fileModuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileModule_Path ()
    {
        return (EAttribute)fileModuleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommonFactory getCommonFactory ()
    {
        return (CommonFactory)getEFactoryInstance ();
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
        fileModuleEClass = createEClass ( FILE_MODULE );
        createEAttribute ( fileModuleEClass, FILE_MODULE__PATH );
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
        NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI );
        ScriptsPackage theScriptsPackage = (ScriptsPackage)EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI );
        ProcessingPackage theProcessingPackage = (ProcessingPackage)EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI );
        SummaryPackage theSummaryPackage = (SummaryPackage)EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI );
        MainPackage theMainPackage = (MainPackage)EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI );
        MarkerPackage theMarkerPackage = (MarkerPackage)EPackage.Registry.INSTANCE.getEPackage ( MarkerPackage.eNS_URI );
        OutputPackage theOutputPackage = (OutputPackage)EPackage.Registry.INSTANCE.getEPackage ( OutputPackage.eNS_URI );
        MasterPackage theMasterPackage = (MasterPackage)EPackage.Registry.INSTANCE.getEPackage ( MasterPackage.eNS_URI );

        // Add subpackages
        getESubpackages ().add ( theNetworkPackage );
        getESubpackages ().add ( theScriptsPackage );
        getESubpackages ().add ( theProcessingPackage );
        getESubpackages ().add ( theSummaryPackage );
        getESubpackages ().add ( theMainPackage );
        getESubpackages ().add ( theMarkerPackage );
        getESubpackages ().add ( theOutputPackage );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        fileModuleEClass.getESuperTypes ().add ( theMasterPackage.getModule () );

        // Initialize classes and features; add operations and parameters
        initEClass ( fileModuleEClass, FileModule.class, "FileModule", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getFileModule_Path (), ecorePackage.getEString (), "path", null, 0, -1, FileModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        // Create resource
        createResource ( eNS_URI );
    }

} //CommonPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.network.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.master.MasterPackage;
import org.openscada.configurator.module.common.CommonPackage;
import org.openscada.configurator.module.common.impl.CommonPackageImpl;
import org.openscada.configurator.module.common.main.MainPackage;
import org.openscada.configurator.module.common.main.impl.MainPackageImpl;
import org.openscada.configurator.module.common.marker.MarkerPackage;
import org.openscada.configurator.module.common.marker.impl.MarkerPackageImpl;
import org.openscada.configurator.module.common.network.NetworkFactory;
import org.openscada.configurator.module.common.network.NetworkModule;
import org.openscada.configurator.module.common.network.NetworkPackage;
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
public class NetworkPackageImpl extends EPackageImpl implements NetworkPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass networkModuleEClass = null;

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
     * @see org.openscada.configurator.module.common.network.NetworkPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private NetworkPackageImpl ()
    {
        super ( eNS_URI, NetworkFactory.eINSTANCE );
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
     * <p>This method is used to initialize {@link NetworkPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static NetworkPackage init ()
    {
        if ( isInited )
            return (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI );

        // Obtain or create and register package
        NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new NetworkPackageImpl () );

        isInited = true;

        // Initialize simple dependencies
        ConfiguratorPackage.eINSTANCE.eClass ();

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) : CommonPackage.eINSTANCE );
        ScriptsPackageImpl theScriptsPackage = (ScriptsPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) instanceof ScriptsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) : ScriptsPackage.eINSTANCE );
        ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) : ProcessingPackage.eINSTANCE );
        SummaryPackageImpl theSummaryPackage = (SummaryPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) instanceof SummaryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) : SummaryPackage.eINSTANCE );
        MainPackageImpl theMainPackage = (MainPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) : MainPackage.eINSTANCE );
        MarkerPackageImpl theMarkerPackage = (MarkerPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MarkerPackage.eNS_URI ) instanceof MarkerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MarkerPackage.eNS_URI ) : MarkerPackage.eINSTANCE );
        OutputPackageImpl theOutputPackage = (OutputPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( OutputPackage.eNS_URI ) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( OutputPackage.eNS_URI ) : OutputPackage.eINSTANCE );

        // Create package meta-data objects
        theNetworkPackage.createPackageContents ();
        theCommonPackage.createPackageContents ();
        theScriptsPackage.createPackageContents ();
        theProcessingPackage.createPackageContents ();
        theSummaryPackage.createPackageContents ();
        theMainPackage.createPackageContents ();
        theMarkerPackage.createPackageContents ();
        theOutputPackage.createPackageContents ();

        // Initialize created meta-data
        theNetworkPackage.initializePackageContents ();
        theCommonPackage.initializePackageContents ();
        theScriptsPackage.initializePackageContents ();
        theProcessingPackage.initializePackageContents ();
        theSummaryPackage.initializePackageContents ();
        theMainPackage.initializePackageContents ();
        theMarkerPackage.initializePackageContents ();
        theOutputPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theNetworkPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( NetworkPackage.eNS_URI, theNetworkPackage );
        return theNetworkPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNetworkModule ()
    {
        return networkModuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNetworkModule_NetworkFile ()
    {
        return (EAttribute)networkModuleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNetworkModule_Prefix ()
    {
        return (EAttribute)networkModuleEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkFactory getNetworkFactory ()
    {
        return (NetworkFactory)getEFactoryInstance ();
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
        networkModuleEClass = createEClass ( NETWORK_MODULE );
        createEAttribute ( networkModuleEClass, NETWORK_MODULE__NETWORK_FILE );
        createEAttribute ( networkModuleEClass, NETWORK_MODULE__PREFIX );
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
        MasterPackage theMasterPackage = (MasterPackage)EPackage.Registry.INSTANCE.getEPackage ( MasterPackage.eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        networkModuleEClass.getESuperTypes ().add ( theMasterPackage.getModule () );

        // Initialize classes and features; add operations and parameters
        initEClass ( networkModuleEClass, NetworkModule.class, "NetworkModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getNetworkModule_NetworkFile (), ecorePackage.getEString (), "networkFile", "", 0, 1, NetworkModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getNetworkModule_Prefix (), ecorePackage.getEString (), "prefix", null, 1, 1, NetworkModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
    }

} //NetworkPackageImpl

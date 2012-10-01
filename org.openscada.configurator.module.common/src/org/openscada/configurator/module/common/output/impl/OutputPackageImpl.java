/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
import org.openscada.configurator.module.common.output.OutputAverages;
import org.openscada.configurator.module.common.output.OutputFactory;
import org.openscada.configurator.module.common.output.OutputGlobalSummaries;
import org.openscada.configurator.module.common.output.OutputItems;
import org.openscada.configurator.module.common.output.OutputPackage;
import org.openscada.configurator.module.common.output.OutputSummaries;
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
public class OutputPackageImpl extends EPackageImpl implements OutputPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputAveragesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputItemsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputSummariesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputGlobalSummariesEClass = null;

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
     * @see org.openscada.configurator.module.common.output.OutputPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private OutputPackageImpl ()
    {
        super ( eNS_URI, OutputFactory.eINSTANCE );
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
     * <p>This method is used to initialize {@link OutputPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static OutputPackage init ()
    {
        if ( isInited )
            return (OutputPackage)EPackage.Registry.INSTANCE.getEPackage ( OutputPackage.eNS_URI );

        // Obtain or create and register package
        OutputPackageImpl theOutputPackage = (OutputPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new OutputPackageImpl () );

        isInited = true;

        // Initialize simple dependencies
        ConfiguratorPackage.eINSTANCE.eClass ();

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) : CommonPackage.eINSTANCE );
        NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( NetworkPackage.eNS_URI ) : NetworkPackage.eINSTANCE );
        ScriptsPackageImpl theScriptsPackage = (ScriptsPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) instanceof ScriptsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ScriptsPackage.eNS_URI ) : ScriptsPackage.eINSTANCE );
        ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ProcessingPackage.eNS_URI ) : ProcessingPackage.eINSTANCE );
        SummaryPackageImpl theSummaryPackage = (SummaryPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) instanceof SummaryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( SummaryPackage.eNS_URI ) : SummaryPackage.eINSTANCE );
        MainPackageImpl theMainPackage = (MainPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI ) : MainPackage.eINSTANCE );
        MarkerPackageImpl theMarkerPackage = (MarkerPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( MarkerPackage.eNS_URI ) instanceof MarkerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( MarkerPackage.eNS_URI ) : MarkerPackage.eINSTANCE );

        // Create package meta-data objects
        theOutputPackage.createPackageContents ();
        theCommonPackage.createPackageContents ();
        theNetworkPackage.createPackageContents ();
        theScriptsPackage.createPackageContents ();
        theProcessingPackage.createPackageContents ();
        theSummaryPackage.createPackageContents ();
        theMainPackage.createPackageContents ();
        theMarkerPackage.createPackageContents ();

        // Initialize created meta-data
        theOutputPackage.initializePackageContents ();
        theCommonPackage.initializePackageContents ();
        theNetworkPackage.initializePackageContents ();
        theScriptsPackage.initializePackageContents ();
        theProcessingPackage.initializePackageContents ();
        theSummaryPackage.initializePackageContents ();
        theMainPackage.initializePackageContents ();
        theMarkerPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theOutputPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( OutputPackage.eNS_URI, theOutputPackage );
        return theOutputPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputAverages ()
    {
        return outputAveragesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputItems ()
    {
        return outputItemsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputSummaries ()
    {
        return outputSummariesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputGlobalSummaries ()
    {
        return outputGlobalSummariesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputFactory getOutputFactory ()
    {
        return (OutputFactory)getEFactoryInstance ();
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
        outputAveragesEClass = createEClass ( OUTPUT_AVERAGES );

        outputItemsEClass = createEClass ( OUTPUT_ITEMS );

        outputSummariesEClass = createEClass ( OUTPUT_SUMMARIES );

        outputGlobalSummariesEClass = createEClass ( OUTPUT_GLOBAL_SUMMARIES );
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        outputAveragesEClass.getESuperTypes ().add ( theConfiguratorPackage.getModule () );
        outputItemsEClass.getESuperTypes ().add ( theConfiguratorPackage.getModule () );
        outputSummariesEClass.getESuperTypes ().add ( theConfiguratorPackage.getModule () );
        outputGlobalSummariesEClass.getESuperTypes ().add ( theConfiguratorPackage.getModule () );

        // Initialize classes and features; add operations and parameters
        initEClass ( outputAveragesEClass, OutputAverages.class, "OutputAverages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        EOperation op = addEOperation ( outputAveragesEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getConfiguration (), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( outputItemsEClass, OutputItems.class, "OutputItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        op = addEOperation ( outputItemsEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getConfiguration (), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( outputSummariesEClass, OutputSummaries.class, "OutputSummaries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        op = addEOperation ( outputSummariesEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getConfiguration (), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( outputGlobalSummariesEClass, OutputGlobalSummaries.class, "OutputGlobalSummaries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        op = addEOperation ( outputGlobalSummariesEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getConfiguration (), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );
    }

} //OutputPackageImpl

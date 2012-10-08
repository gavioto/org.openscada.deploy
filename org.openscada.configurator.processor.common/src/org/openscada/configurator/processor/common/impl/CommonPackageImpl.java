/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openscada.configuration.model.ConfiguratorPackage;

import org.openscada.configurator.processor.common.CommonFactory;
import org.openscada.configurator.processor.common.CommonPackage;
import org.openscada.configurator.processor.common.StoreConfigurationSlotProcessor;

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
    private EClass storeConfigurationSlotProcessorEClass = null;

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
     * @see org.openscada.configurator.processor.common.CommonPackage#eNS_URI
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

        // Create package meta-data objects
        theCommonPackage.createPackageContents ();

        // Initialize created meta-data
        theCommonPackage.initializePackageContents ();

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
    public EClass getStoreConfigurationSlotProcessor ()
    {
        return storeConfigurationSlotProcessorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStoreConfigurationSlotProcessor_Slots ()
    {
        return (EReference)storeConfigurationSlotProcessorEClass.getEStructuralFeatures ().get ( 0 );
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
        storeConfigurationSlotProcessorEClass = createEClass ( STORE_CONFIGURATION_SLOT_PROCESSOR );
        createEReference ( storeConfigurationSlotProcessorEClass, STORE_CONFIGURATION_SLOT_PROCESSOR__SLOTS );
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
        storeConfigurationSlotProcessorEClass.getESuperTypes ().add ( theConfiguratorPackage.getProcessor () );

        // Initialize classes and features; add operations and parameters
        initEClass ( storeConfigurationSlotProcessorEClass, StoreConfigurationSlotProcessor.class, "StoreConfigurationSlotProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getStoreConfigurationSlotProcessor_Slots (), theConfiguratorPackage.getConfigurationSlot (), null, "slots", null, 0, -1, StoreConfigurationSlotProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        EOperation op = addEOperation ( storeConfigurationSlotProcessorEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEException ( op, theConfiguratorPackage.getException () );

        // Create resource
        createResource ( eNS_URI );
    }

} //CommonPackageImpl

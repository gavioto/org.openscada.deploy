/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.hd.HdPackage;
import org.openscada.configuration.model.hd.impl.HdPackageImpl;
import org.openscada.configuration.model.impl.ConfiguratorPackageImpl;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;
import org.openscada.configuration.model.master.MasterFactory;
import org.openscada.configuration.model.master.MasterPackage;
import org.openscada.configuration.model.master.Module;
import org.openscada.configuration.model.master.ModuleProcessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterPackageImpl extends EPackageImpl implements MasterPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass atlantisConfigurationSlotEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleProcessorEClass = null;

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
     * @see org.openscada.configuration.model.master.MasterPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MasterPackageImpl ()
    {
        super ( eNS_URI, MasterFactory.eINSTANCE );
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
     * <p>This method is used to initialize {@link MasterPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MasterPackage init ()
    {
        if ( isInited )
            return (MasterPackage)EPackage.Registry.INSTANCE.getEPackage ( MasterPackage.eNS_URI );

        // Obtain or create and register package
        MasterPackageImpl theMasterPackage = (MasterPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof MasterPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new MasterPackageImpl () );

        isInited = true;

        // Obtain or create and register interdependencies
        ConfiguratorPackageImpl theConfiguratorPackage = (ConfiguratorPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ConfiguratorPackage.eNS_URI ) instanceof ConfiguratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ConfiguratorPackage.eNS_URI ) : ConfiguratorPackage.eINSTANCE );
        HdPackageImpl theHdPackage = (HdPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( HdPackage.eNS_URI ) instanceof HdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( HdPackage.eNS_URI ) : HdPackage.eINSTANCE );

        // Create package meta-data objects
        theMasterPackage.createPackageContents ();
        theConfiguratorPackage.createPackageContents ();
        theHdPackage.createPackageContents ();

        // Initialize created meta-data
        theMasterPackage.initializePackageContents ();
        theConfiguratorPackage.initializePackageContents ();
        theHdPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theMasterPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( MasterPackage.eNS_URI, theMasterPackage );
        return theMasterPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAtlantisConfigurationSlot ()
    {
        return atlantisConfigurationSlotEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModule ()
    {
        return moduleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModuleProcessor ()
    {
        return moduleProcessorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModuleProcessor_Modules ()
    {
        return (EReference)moduleProcessorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModuleProcessor_Slot ()
    {
        return (EReference)moduleProcessorEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MasterFactory getMasterFactory ()
    {
        return (MasterFactory)getEFactoryInstance ();
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
        atlantisConfigurationSlotEClass = createEClass ( ATLANTIS_CONFIGURATION_SLOT );

        moduleEClass = createEClass ( MODULE );

        moduleProcessorEClass = createEClass ( MODULE_PROCESSOR );
        createEReference ( moduleProcessorEClass, MODULE_PROCESSOR__MODULES );
        createEReference ( moduleProcessorEClass, MODULE_PROCESSOR__SLOT );
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
        atlantisConfigurationSlotEClass.getESuperTypes ().add ( theConfiguratorPackage.getGenericMasterConfigurationSlot () );
        moduleProcessorEClass.getESuperTypes ().add ( theConfiguratorPackage.getProcessor () );

        // Initialize classes and features; add operations and parameters
        initEClass ( atlantisConfigurationSlotEClass, AtlantisConfigurationSlot.class, "AtlantisConfigurationSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        addEOperation ( atlantisConfigurationSlotEClass, theConfiguratorPackage.getConfiguration (), "getConfigurationData", 1, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( moduleEClass, Module.class, "Module", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        EOperation op = addEOperation ( moduleEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getConfiguration (), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, theConfiguratorPackage.getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( moduleProcessorEClass, ModuleProcessor.class, "ModuleProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getModuleProcessor_Modules (), this.getModule (), null, "modules", null, 0, -1, ModuleProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getModuleProcessor_Slot (), this.getAtlantisConfigurationSlot (), null, "slot", null, 1, 1, ModuleProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        getModuleProcessor_Slot ().getEKeys ().add ( theConfiguratorPackage.getConfigurationSlot_Id () );
    }

} //MasterPackageImpl

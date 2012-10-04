/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.AtlantisConfigurationSlot;
import org.openscada.configuration.model.ConfigurationSlot;
import org.openscada.configuration.model.ConfiguratorFactory;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.GenericConfigurationSlot;
import org.openscada.configuration.model.Module;
import org.openscada.configuration.model.ModuleProcessor;
import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.GenericConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConfiguratorPackageImpl extends EPackageImpl implements ConfiguratorPackage
{
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass projectEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass moduleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass configurationSlotEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass atlantisConfigurationSlotEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass processorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass moduleProcessorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass genericConfigurationSlotEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType configurationEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType genericConfigurationEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the registered package, if one
     * already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.openscada.configuration.model.ConfiguratorPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ConfiguratorPackageImpl ()
    {
        super ( eNS_URI, ConfiguratorFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * <p>
     * This method is used to initialize {@link ConfiguratorPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to
     * obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ConfiguratorPackage init ()
    {
        if ( isInited )
        {
            return (ConfiguratorPackage)EPackage.Registry.INSTANCE.getEPackage ( ConfiguratorPackage.eNS_URI );
        }

        // Obtain or create and register package
        final ConfiguratorPackageImpl theConfiguratorPackage = (ConfiguratorPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof ConfiguratorPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new ConfiguratorPackageImpl () );

        isInited = true;

        // Create package meta-data objects
        theConfiguratorPackage.createPackageContents ();

        // Initialize created meta-data
        theConfiguratorPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theConfiguratorPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( ConfiguratorPackage.eNS_URI, theConfiguratorPackage );
        return theConfiguratorPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProject ()
    {
        return this.projectEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getProject_Slots ()
    {
        return (EReference)this.projectEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getProject_Processors ()
    {
        return (EReference)this.projectEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getModule ()
    {
        return this.moduleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getConfigurationSlot ()
    {
        return this.configurationSlotEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getConfigurationSlot_Id ()
    {
        return (EAttribute)this.configurationSlotEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getAtlantisConfigurationSlot ()
    {
        return this.atlantisConfigurationSlotEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProcessor ()
    {
        return this.processorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getModuleProcessor ()
    {
        return this.moduleProcessorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getModuleProcessor_Modules ()
    {
        return (EReference)this.moduleProcessorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getModuleProcessor_Slot ()
    {
        return (EReference)this.moduleProcessorEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getGenericConfigurationSlot ()
    {
        return this.genericConfigurationSlotEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getGenericConfigurationSlot_JsonBase ()
    {
        return (EAttribute)this.genericConfigurationSlotEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getConfiguration ()
    {
        return this.configurationEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getGenericConfiguration ()
    {
        return this.genericConfigurationEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ConfiguratorFactory getConfiguratorFactory ()
    {
        return (ConfiguratorFactory)getEFactoryInstance ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents ()
    {
        if ( this.isCreated )
        {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.projectEClass = createEClass ( PROJECT );
        createEReference ( this.projectEClass, PROJECT__SLOTS );
        createEReference ( this.projectEClass, PROJECT__PROCESSORS );

        this.moduleEClass = createEClass ( MODULE );

        this.configurationSlotEClass = createEClass ( CONFIGURATION_SLOT );
        createEAttribute ( this.configurationSlotEClass, CONFIGURATION_SLOT__ID );

        this.atlantisConfigurationSlotEClass = createEClass ( ATLANTIS_CONFIGURATION_SLOT );

        this.processorEClass = createEClass ( PROCESSOR );

        this.moduleProcessorEClass = createEClass ( MODULE_PROCESSOR );
        createEReference ( this.moduleProcessorEClass, MODULE_PROCESSOR__MODULES );
        createEReference ( this.moduleProcessorEClass, MODULE_PROCESSOR__SLOT );

        this.genericConfigurationSlotEClass = createEClass ( GENERIC_CONFIGURATION_SLOT );
        createEAttribute ( this.genericConfigurationSlotEClass, GENERIC_CONFIGURATION_SLOT__JSON_BASE );

        // Create data types
        this.configurationEDataType = createEDataType ( CONFIGURATION );
        this.genericConfigurationEDataType = createEDataType ( GENERIC_CONFIGURATION );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents ()
    {
        if ( this.isInitialized )
        {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        setName ( eNAME );
        setNsPrefix ( eNS_PREFIX );
        setNsURI ( eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.atlantisConfigurationSlotEClass.getESuperTypes ().add ( getGenericConfigurationSlot () );
        this.moduleProcessorEClass.getESuperTypes ().add ( getProcessor () );
        this.genericConfigurationSlotEClass.getESuperTypes ().add ( getConfigurationSlot () );

        // Initialize classes and features; add operations and parameters
        initEClass ( this.projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getProject_Slots (), getConfigurationSlot (), null, "slots", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getProject_Processors (), getProcessor (), null, "processors", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( this.moduleEClass, Module.class, "Module", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        EOperation op = addEOperation ( this.moduleEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, getConfiguration (), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( this.configurationSlotEClass, ConfigurationSlot.class, "ConfigurationSlot", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getConfigurationSlot_Id (), this.ecorePackage.getEString (), "id", null, 1, 1, ConfigurationSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( this.atlantisConfigurationSlotEClass, AtlantisConfigurationSlot.class, "AtlantisConfigurationSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        addEOperation ( this.atlantisConfigurationSlotEClass, getConfiguration (), "getConfigurationData", 1, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( this.processorEClass, Processor.class, "Processor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        op = addEOperation ( this.processorEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( this.moduleProcessorEClass, ModuleProcessor.class, "ModuleProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getModuleProcessor_Modules (), getModule (), null, "modules", null, 0, -1, ModuleProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getModuleProcessor_Slot (), getAtlantisConfigurationSlot (), null, "slot", null, 1, 1, ModuleProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( this.genericConfigurationSlotEClass, GenericConfigurationSlot.class, "GenericConfigurationSlot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getGenericConfigurationSlot_JsonBase (), this.ecorePackage.getEString (), "jsonBase", null, 0, -1, GenericConfigurationSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        op = addEOperation ( this.genericConfigurationSlotEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, getGenericConfiguration (), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED );

        // Initialize data types
        initEDataType ( this.configurationEDataType, Configuration.class, "Configuration", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType ( this.genericConfigurationEDataType, GenericConfiguration.class, "GenericConfiguration", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );

        // Create resource
        createResource ( eNS_URI );
    }

} //ConfiguratorPackageImpl

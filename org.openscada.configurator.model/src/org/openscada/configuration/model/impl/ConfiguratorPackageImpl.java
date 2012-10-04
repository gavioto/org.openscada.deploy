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
import org.openscada.configuration.model.hd.HdPackage;
import org.openscada.configuration.model.hd.impl.HdPackageImpl;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.GenericConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ConfiguratorPackageImpl extends EPackageImpl implements ConfiguratorPackage
{
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass projectEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass configurationSlotEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass atlantisConfigurationSlotEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass processorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleProcessorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass genericConfigurationSlotEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType configurationEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType genericConfigurationEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType exceptionEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ConfiguratorPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ConfiguratorPackage init ()
    {
        if ( isInited )
            return (ConfiguratorPackage)EPackage.Registry.INSTANCE.getEPackage ( ConfiguratorPackage.eNS_URI );

        // Obtain or create and register package
        ConfiguratorPackageImpl theConfiguratorPackage = (ConfiguratorPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof ConfiguratorPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new ConfiguratorPackageImpl () );

        isInited = true;

        // Obtain or create and register interdependencies
        HdPackageImpl theHdPackage = (HdPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( HdPackage.eNS_URI ) instanceof HdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( HdPackage.eNS_URI ) : HdPackage.eINSTANCE );

        // Create package meta-data objects
        theConfiguratorPackage.createPackageContents ();
        theHdPackage.createPackageContents ();

        // Initialize created meta-data
        theConfiguratorPackage.initializePackageContents ();
        theHdPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theConfiguratorPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( ConfiguratorPackage.eNS_URI, theConfiguratorPackage );
        return theConfiguratorPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProject ()
    {
        return projectEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProject_Slots ()
    {
        return (EReference)projectEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProject_Processors ()
    {
        return (EReference)projectEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModule ()
    {
        return moduleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConfigurationSlot ()
    {
        return configurationSlotEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConfigurationSlot_Id ()
    {
        return (EAttribute)configurationSlotEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAtlantisConfigurationSlot ()
    {
        return atlantisConfigurationSlotEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessor ()
    {
        return processorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleProcessor ()
    {
        return moduleProcessorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleProcessor_Modules ()
    {
        return (EReference)moduleProcessorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleProcessor_Slot ()
    {
        return (EReference)moduleProcessorEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGenericConfigurationSlot ()
    {
        return genericConfigurationSlotEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGenericConfigurationSlot_JsonBase ()
    {
        return (EAttribute)genericConfigurationSlotEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericConfigurationSlot_BaseDirectory ()
    {
        return (EAttribute)genericConfigurationSlotEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getConfiguration ()
    {
        return configurationEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getGenericConfiguration ()
    {
        return genericConfigurationEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getException ()
    {
        return exceptionEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfiguratorFactory getConfiguratorFactory ()
    {
        return (ConfiguratorFactory)getEFactoryInstance ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents ()
    {
        if ( isCreated )
            return;
        isCreated = true;

        // Create classes and their features
        projectEClass = createEClass ( PROJECT );
        createEReference ( projectEClass, PROJECT__SLOTS );
        createEReference ( projectEClass, PROJECT__PROCESSORS );

        moduleEClass = createEClass ( MODULE );

        configurationSlotEClass = createEClass ( CONFIGURATION_SLOT );
        createEAttribute ( configurationSlotEClass, CONFIGURATION_SLOT__ID );

        atlantisConfigurationSlotEClass = createEClass ( ATLANTIS_CONFIGURATION_SLOT );

        processorEClass = createEClass ( PROCESSOR );

        moduleProcessorEClass = createEClass ( MODULE_PROCESSOR );
        createEReference ( moduleProcessorEClass, MODULE_PROCESSOR__MODULES );
        createEReference ( moduleProcessorEClass, MODULE_PROCESSOR__SLOT );

        genericConfigurationSlotEClass = createEClass ( GENERIC_CONFIGURATION_SLOT );
        createEAttribute ( genericConfigurationSlotEClass, GENERIC_CONFIGURATION_SLOT__JSON_BASE );
        createEAttribute ( genericConfigurationSlotEClass, GENERIC_CONFIGURATION_SLOT__BASE_DIRECTORY );

        // Create data types
        configurationEDataType = createEDataType ( CONFIGURATION );
        genericConfigurationEDataType = createEDataType ( GENERIC_CONFIGURATION );
        exceptionEDataType = createEDataType ( EXCEPTION );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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
        HdPackage theHdPackage = (HdPackage)EPackage.Registry.INSTANCE.getEPackage ( HdPackage.eNS_URI );

        // Add subpackages
        getESubpackages ().add ( theHdPackage );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        atlantisConfigurationSlotEClass.getESuperTypes ().add ( this.getGenericConfigurationSlot () );
        moduleProcessorEClass.getESuperTypes ().add ( this.getProcessor () );
        genericConfigurationSlotEClass.getESuperTypes ().add ( this.getConfigurationSlot () );

        // Initialize classes and features; add operations and parameters
        initEClass ( projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getProject_Slots (), this.getConfigurationSlot (), null, "slots", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getProject_Processors (), this.getProcessor (), null, "processors", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( moduleEClass, Module.class, "Module", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        EOperation op = addEOperation ( moduleEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, this.getConfiguration (), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, this.getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( configurationSlotEClass, ConfigurationSlot.class, "ConfigurationSlot", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getConfigurationSlot_Id (), ecorePackage.getEString (), "id", null, 1, 1, ConfigurationSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        op = addEOperation ( configurationSlotEClass, null, "store", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEException ( op, this.getException () );

        initEClass ( atlantisConfigurationSlotEClass, AtlantisConfigurationSlot.class, "AtlantisConfigurationSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        addEOperation ( atlantisConfigurationSlotEClass, this.getConfiguration (), "getConfigurationData", 1, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( processorEClass, Processor.class, "Processor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        op = addEOperation ( processorEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, this.getProject (), "project", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( moduleProcessorEClass, ModuleProcessor.class, "ModuleProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getModuleProcessor_Modules (), this.getModule (), null, "modules", null, 0, -1, ModuleProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getModuleProcessor_Slot (), this.getAtlantisConfigurationSlot (), null, "slot", null, 1, 1, ModuleProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        getModuleProcessor_Slot ().getEKeys ().add ( this.getConfigurationSlot_Id () );

        initEClass ( genericConfigurationSlotEClass, GenericConfigurationSlot.class, "GenericConfigurationSlot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getGenericConfigurationSlot_JsonBase (), ecorePackage.getEString (), "jsonBase", null, 0, -1, GenericConfigurationSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getGenericConfigurationSlot_BaseDirectory (), ecorePackage.getEString (), "baseDirectory", null, 1, 1, GenericConfigurationSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        op = addEOperation ( genericConfigurationSlotEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, this.getGenericConfiguration (), "configuration", 0, 1, IS_UNIQUE, IS_ORDERED );

        // Initialize data types
        initEDataType ( configurationEDataType, Configuration.class, "Configuration", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType ( genericConfigurationEDataType, GenericConfiguration.class, "GenericConfiguration", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType ( exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );

        // Create resource
        createResource ( eNS_URI );
    }

} //ConfiguratorPackageImpl

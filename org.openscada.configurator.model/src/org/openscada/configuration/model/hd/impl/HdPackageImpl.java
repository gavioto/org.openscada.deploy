/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.hd.ConfigurationSlot;
import org.openscada.configuration.model.hd.HDItemGenerator;
import org.openscada.configuration.model.hd.HdFactory;
import org.openscada.configuration.model.hd.HdPackage;
import org.openscada.configuration.model.hd.StorageCommandGenerator;
import org.openscada.configuration.model.impl.ConfiguratorPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HdPackageImpl extends EPackageImpl implements HdPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass configurationSlotEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass storageCommandGeneratorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hdItemGeneratorEClass = null;

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
     * @see org.openscada.configuration.model.hd.HdPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private HdPackageImpl ()
    {
        super ( eNS_URI, HdFactory.eINSTANCE );
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
     * <p>This method is used to initialize {@link HdPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static HdPackage init ()
    {
        if ( isInited )
            return (HdPackage)EPackage.Registry.INSTANCE.getEPackage ( HdPackage.eNS_URI );

        // Obtain or create and register package
        HdPackageImpl theHdPackage = (HdPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof HdPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new HdPackageImpl () );

        isInited = true;

        // Obtain or create and register interdependencies
        ConfiguratorPackageImpl theConfiguratorPackage = (ConfiguratorPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( ConfiguratorPackage.eNS_URI ) instanceof ConfiguratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( ConfiguratorPackage.eNS_URI ) : ConfiguratorPackage.eINSTANCE );

        // Create package meta-data objects
        theHdPackage.createPackageContents ();
        theConfiguratorPackage.createPackageContents ();

        // Initialize created meta-data
        theHdPackage.initializePackageContents ();
        theConfiguratorPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theHdPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( HdPackage.eNS_URI, theHdPackage );
        return theHdPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConfigurationSlot ()
    {
        return configurationSlotEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigurationSlot_MasterConnectionUri ()
    {
        return (EAttribute)configurationSlotEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStorageCommandGenerator ()
    {
        return storageCommandGeneratorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStorageCommandGenerator_Slot ()
    {
        return (EReference)storageCommandGeneratorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHDItemGenerator ()
    {
        return hdItemGeneratorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHDItemGenerator_HdSlot ()
    {
        return (EReference)hdItemGeneratorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHDItemGenerator_DaSlot ()
    {
        return (EReference)hdItemGeneratorEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HdFactory getHdFactory ()
    {
        return (HdFactory)getEFactoryInstance ();
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
        configurationSlotEClass = createEClass ( CONFIGURATION_SLOT );
        createEAttribute ( configurationSlotEClass, CONFIGURATION_SLOT__MASTER_CONNECTION_URI );

        storageCommandGeneratorEClass = createEClass ( STORAGE_COMMAND_GENERATOR );
        createEReference ( storageCommandGeneratorEClass, STORAGE_COMMAND_GENERATOR__SLOT );

        hdItemGeneratorEClass = createEClass ( HD_ITEM_GENERATOR );
        createEReference ( hdItemGeneratorEClass, HD_ITEM_GENERATOR__HD_SLOT );
        createEReference ( hdItemGeneratorEClass, HD_ITEM_GENERATOR__DA_SLOT );
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
        configurationSlotEClass.getESuperTypes ().add ( theConfiguratorPackage.getGenericConfigurationSlot () );
        storageCommandGeneratorEClass.getESuperTypes ().add ( theConfiguratorPackage.getProcessor () );
        hdItemGeneratorEClass.getESuperTypes ().add ( theConfiguratorPackage.getProcessor () );

        // Initialize classes and features; add operations and parameters
        initEClass ( configurationSlotEClass, ConfigurationSlot.class, "ConfigurationSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getConfigurationSlot_MasterConnectionUri (), ecorePackage.getEString (), "masterConnectionUri", null, 1, 1, ConfigurationSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        addEOperation ( configurationSlotEClass, theConfiguratorPackage.getGenericConfiguration (), "getConfigurationData", 1, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( storageCommandGeneratorEClass, StorageCommandGenerator.class, "StorageCommandGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getStorageCommandGenerator_Slot (), this.getConfigurationSlot (), null, "slot", null, 1, 1, StorageCommandGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( hdItemGeneratorEClass, HDItemGenerator.class, "HDItemGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getHDItemGenerator_HdSlot (), this.getConfigurationSlot (), null, "hdSlot", null, 1, 1, HDItemGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getHDItemGenerator_DaSlot (), theConfiguratorPackage.getAtlantisConfigurationSlot (), null, "daSlot", null, 1, 1, HDItemGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
    }

} //HdPackageImpl

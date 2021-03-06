/**
 */
package org.openscada.configurator.processor.common.main.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configurator.processor.common.CommonPackage;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.impl.GlobalPackageImpl;
import org.openscada.configurator.processor.common.impl.CommonPackageImpl;
import org.openscada.configurator.processor.common.main.AuthorizationLoader;
import org.openscada.configurator.processor.common.main.MainFactory;
import org.openscada.configurator.processor.common.main.MainPackage;
import org.openscada.configurator.processor.common.main.SecurityLoader;
import org.openscada.configurator.sec.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass authorizationLoaderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass securityLoaderEClass = null;

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
     * @see org.openscada.configurator.processor.common.main.MainPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MainPackageImpl ()
    {
        super ( eNS_URI, MainFactory.eINSTANCE );
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
     * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MainPackage init ()
    {
        if ( isInited )
            return (MainPackage)EPackage.Registry.INSTANCE.getEPackage ( MainPackage.eNS_URI );

        // Obtain or create and register package
        MainPackageImpl theMainPackage = (MainPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new MainPackageImpl () );

        isInited = true;

        // Initialize simple dependencies
        ConfiguratorPackage.eINSTANCE.eClass ();
        SecurityPackage.eINSTANCE.eClass ();

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( CommonPackage.eNS_URI ) : CommonPackage.eINSTANCE );
        GlobalPackageImpl theGlobalPackage = (GlobalPackageImpl) ( EPackage.Registry.INSTANCE.getEPackage ( GlobalPackage.eNS_URI ) instanceof GlobalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage ( GlobalPackage.eNS_URI ) : GlobalPackage.eINSTANCE );

        // Create package meta-data objects
        theMainPackage.createPackageContents ();
        theCommonPackage.createPackageContents ();
        theGlobalPackage.createPackageContents ();

        // Initialize created meta-data
        theMainPackage.initializePackageContents ();
        theCommonPackage.initializePackageContents ();
        theGlobalPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theMainPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( MainPackage.eNS_URI, theMainPackage );
        return theMainPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAuthorizationLoader ()
    {
        return authorizationLoaderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAuthorizationLoader_File ()
    {
        return (EAttribute)authorizationLoaderEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAuthorizationLoader_Slot ()
    {
        return (EReference)authorizationLoaderEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSecurityLoader ()
    {
        return securityLoaderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecurityLoader_Rules ()
    {
        return (EReference)securityLoaderEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecurityLoader_Slot ()
    {
        return (EReference)securityLoaderEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MainFactory getMainFactory ()
    {
        return (MainFactory)getEFactoryInstance ();
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
        authorizationLoaderEClass = createEClass ( AUTHORIZATION_LOADER );
        createEAttribute ( authorizationLoaderEClass, AUTHORIZATION_LOADER__FILE );
        createEReference ( authorizationLoaderEClass, AUTHORIZATION_LOADER__SLOT );

        securityLoaderEClass = createEClass ( SECURITY_LOADER );
        createEReference ( securityLoaderEClass, SECURITY_LOADER__RULES );
        createEReference ( securityLoaderEClass, SECURITY_LOADER__SLOT );
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
        SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage ( SecurityPackage.eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        authorizationLoaderEClass.getESuperTypes ().add ( theConfiguratorPackage.getProcessor () );
        securityLoaderEClass.getESuperTypes ().add ( theConfiguratorPackage.getProcessor () );

        // Initialize classes and features; add operations and parameters
        initEClass ( authorizationLoaderEClass, AuthorizationLoader.class, "AuthorizationLoader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getAuthorizationLoader_File (), ecorePackage.getEString (), "file", null, 1, 1, AuthorizationLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getAuthorizationLoader_Slot (), theConfiguratorPackage.getGenericMasterConfigurationSlot (), null, "slot", null, 0, 1, AuthorizationLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( securityLoaderEClass, SecurityLoader.class, "SecurityLoader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getSecurityLoader_Rules (), theSecurityPackage.getRules (), null, "rules", null, 1, 1, SecurityLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getSecurityLoader_Slot (), theConfiguratorPackage.getGenericMasterConfigurationSlot (), null, "slot", null, 0, -1, SecurityLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
    }

} //MainPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configuration.model.ConfiguratorFactory;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.Parent;
import org.openscada.configuration.model.Project;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parentEClass = null;

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
    public EAttribute getProject_JsonBase ()
    {
        return (EAttribute)projectEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParent ()
    {
        return parentEClass;
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
        createEAttribute ( projectEClass, PROJECT__JSON_BASE );

        parentEClass = createEClass ( PARENT );
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass ( projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getProject_JsonBase (), ecorePackage.getEString (), "jsonBase", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( parentEClass, Parent.class, "Parent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        // Create resource
        createResource ( eNS_URI );
    }

} //ConfiguratorPackageImpl

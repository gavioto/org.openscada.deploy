/**
 */
package org.openscada.configurator.processor.common.main.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configurator.processor.common.main.AuthorizationLoader;
import org.openscada.configurator.processor.common.main.MainFactory;
import org.openscada.configurator.processor.common.main.MainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainFactoryImpl extends EFactoryImpl implements MainFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MainFactory init ()
    {
        try
        {
            MainFactory theMainFactory = (MainFactory)EPackage.Registry.INSTANCE.getEFactory ( "http://openscada.org/Configurator/Processors/Common/Main" );
            if ( theMainFactory != null )
            {
                return theMainFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new MainFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MainFactoryImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create ( EClass eClass )
    {
        switch ( eClass.getClassifierID () )
        {
            case MainPackage.AUTHORIZATION_LOADER:
                return createAuthorizationLoader ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AuthorizationLoader createAuthorizationLoader ()
    {
        AuthorizationLoaderImpl authorizationLoader = new AuthorizationLoaderImpl ();
        return authorizationLoader;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MainPackage getMainPackage ()
    {
        return (MainPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MainPackage getPackage ()
    {
        return MainPackage.eINSTANCE;
    }

} //MainFactoryImpl

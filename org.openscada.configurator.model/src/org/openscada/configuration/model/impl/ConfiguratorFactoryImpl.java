/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configuration.model.ConfiguratorFactory;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.DefaultGenericMasterConfiguration;
import org.openscada.configuration.model.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfiguratorFactoryImpl extends EFactoryImpl implements ConfiguratorFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ConfiguratorFactory init ()
    {
        try
        {
            ConfiguratorFactory theConfiguratorFactory = (ConfiguratorFactory)EPackage.Registry.INSTANCE.getEFactory ( ConfiguratorPackage.eNS_URI );
            if ( theConfiguratorFactory != null )
            {
                return theConfiguratorFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new ConfiguratorFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfiguratorFactoryImpl ()
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
            case ConfiguratorPackage.PROJECT:
                return createProject ();
            case ConfiguratorPackage.DEFAULT_GENERIC_MASTER_CONFIGURATION:
                return createDefaultGenericMasterConfiguration ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString ( EDataType eDataType, String initialValue )
    {
        switch ( eDataType.getClassifierID () )
        {
            case ConfiguratorPackage.EXCEPTION:
                return createExceptionFromString ( eDataType, initialValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString ( EDataType eDataType, Object instanceValue )
    {
        switch ( eDataType.getClassifierID () )
        {
            case ConfiguratorPackage.EXCEPTION:
                return convertExceptionToString ( eDataType, instanceValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Project createProject ()
    {
        ProjectImpl project = new ProjectImpl ();
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultGenericMasterConfiguration createDefaultGenericMasterConfiguration ()
    {
        DefaultGenericMasterConfigurationImpl defaultGenericMasterConfiguration = new DefaultGenericMasterConfigurationImpl ();
        return defaultGenericMasterConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Exception createExceptionFromString ( EDataType eDataType, String initialValue )
    {
        return (Exception)super.createFromString ( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExceptionToString ( EDataType eDataType, Object instanceValue )
    {
        return super.convertToString ( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfiguratorPackage getConfiguratorPackage ()
    {
        return (ConfiguratorPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ConfiguratorPackage getPackage ()
    {
        return ConfiguratorPackage.eINSTANCE;
    }

} //ConfiguratorFactoryImpl

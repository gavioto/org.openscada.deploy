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
import org.openscada.configuration.model.AtlantisConfigurationSlot;
import org.openscada.configuration.model.ConfiguratorFactory;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.ModuleProcessor;
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
            ConfiguratorFactory theConfiguratorFactory = (ConfiguratorFactory)EPackage.Registry.INSTANCE.getEFactory ( "http://openscada.org/Deploy/Configurator" );
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
            case ConfiguratorPackage.ATLANTIS_CONFIGURATION_SLOT:
                return createAtlantisConfigurationSlot ();
            case ConfiguratorPackage.MODULE_PROCESSOR:
                return createModuleProcessor ();
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
    public AtlantisConfigurationSlot createAtlantisConfigurationSlot ()
    {
        AtlantisConfigurationSlotImpl atlantisConfigurationSlot = new AtlantisConfigurationSlotImpl ();
        return atlantisConfigurationSlot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleProcessor createModuleProcessor ()
    {
        ModuleProcessorImpl moduleProcessor = new ModuleProcessorImpl ();
        return moduleProcessor;
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

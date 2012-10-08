/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;
import org.openscada.configuration.model.master.MasterFactory;
import org.openscada.configuration.model.master.MasterPackage;
import org.openscada.configuration.model.master.ModuleProcessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterFactoryImpl extends EFactoryImpl implements MasterFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MasterFactory init ()
    {
        try
        {
            MasterFactory theMasterFactory = (MasterFactory)EPackage.Registry.INSTANCE.getEFactory ( "http://openscada.org/Deploy/Configurator/Master" );
            if ( theMasterFactory != null )
            {
                return theMasterFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new MasterFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MasterFactoryImpl ()
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
            case MasterPackage.ATLANTIS_CONFIGURATION_SLOT:
                return createAtlantisConfigurationSlot ();
            case MasterPackage.MODULE_PROCESSOR:
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
    public MasterPackage getMasterPackage ()
    {
        return (MasterPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MasterPackage getPackage ()
    {
        return MasterPackage.eINSTANCE;
    }

} //MasterFactoryImpl

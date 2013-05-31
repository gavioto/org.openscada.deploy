/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configuration.model.hd.ConfigurationSlot;
import org.openscada.configuration.model.hd.HDItemGenerator;
import org.openscada.configuration.model.hd.HdFactory;
import org.openscada.configuration.model.hd.HdPackage;
import org.openscada.configuration.model.hd.StorageCommandGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HdFactoryImpl extends EFactoryImpl implements HdFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static HdFactory init ()
    {
        try
        {
            HdFactory theHdFactory = (HdFactory)EPackage.Registry.INSTANCE.getEFactory ( HdPackage.eNS_URI );
            if ( theHdFactory != null )
            {
                return theHdFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new HdFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HdFactoryImpl ()
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
            case HdPackage.CONFIGURATION_SLOT:
                return createConfigurationSlot ();
            case HdPackage.STORAGE_COMMAND_GENERATOR:
                return createStorageCommandGenerator ();
            case HdPackage.HD_ITEM_GENERATOR:
                return createHDItemGenerator ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigurationSlot createConfigurationSlot ()
    {
        ConfigurationSlotImpl configurationSlot = new ConfigurationSlotImpl ();
        return configurationSlot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StorageCommandGenerator createStorageCommandGenerator ()
    {
        StorageCommandGeneratorImpl storageCommandGenerator = new StorageCommandGeneratorImpl ();
        return storageCommandGenerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDItemGenerator createHDItemGenerator ()
    {
        HDItemGeneratorImpl hdItemGenerator = new HDItemGeneratorImpl ();
        return hdItemGenerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HdPackage getHdPackage ()
    {
        return (HdPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static HdPackage getPackage ()
    {
        return HdPackage.eINSTANCE;
    }

} //HdFactoryImpl

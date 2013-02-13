/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openscada.configuration.model.GenericConfigurationSlot;
import org.openscada.configuration.model.GenericMasterConfigurationSlot;
import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.hd.ConfigurationSlot;
import org.openscada.configuration.model.hd.HDItemGenerator;
import org.openscada.configuration.model.hd.HdPackage;
import org.openscada.configuration.model.hd.StorageCommandGenerator;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.model.hd.HdPackage
 * @generated
 */
public class HdAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static HdPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HdAdapterFactory ()
    {
        if ( modelPackage == null )
        {
            modelPackage = HdPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType ( Object object )
    {
        if ( object == modelPackage )
        {
            return true;
        }
        if ( object instanceof EObject )
        {
            return ( (EObject)object ).eClass ().getEPackage () == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HdSwitch<Adapter> modelSwitch = new HdSwitch<Adapter> () {
        @Override
        public Adapter caseConfigurationSlot ( ConfigurationSlot object )
        {
            return createConfigurationSlotAdapter ();
        }

        @Override
        public Adapter caseStorageCommandGenerator ( StorageCommandGenerator object )
        {
            return createStorageCommandGeneratorAdapter ();
        }

        @Override
        public Adapter caseHDItemGenerator ( HDItemGenerator object )
        {
            return createHDItemGeneratorAdapter ();
        }

        @Override
        public Adapter caseConfigurator_ConfigurationSlot ( org.openscada.configuration.model.ConfigurationSlot object )
        {
            return createConfigurator_ConfigurationSlotAdapter ();
        }

        @Override
        public Adapter caseGenericConfigurationSlot ( GenericConfigurationSlot object )
        {
            return createGenericConfigurationSlotAdapter ();
        }

        @Override
        public Adapter caseGenericMasterConfigurationSlot ( GenericMasterConfigurationSlot object )
        {
            return createGenericMasterConfigurationSlotAdapter ();
        }

        @Override
        public Adapter caseProcessor ( Processor object )
        {
            return createProcessorAdapter ();
        }

        @Override
        public Adapter defaultCase ( EObject object )
        {
            return createEObjectAdapter ();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter ( Notifier target )
    {
        return modelSwitch.doSwitch ( (EObject)target );
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.hd.ConfigurationSlot <em>Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.hd.ConfigurationSlot
     * @generated
     */
    public Adapter createConfigurationSlotAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.hd.StorageCommandGenerator <em>Storage Command Generator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.hd.StorageCommandGenerator
     * @generated
     */
    public Adapter createStorageCommandGeneratorAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.hd.HDItemGenerator <em>HD Item Generator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.hd.HDItemGenerator
     * @generated
     */
    public Adapter createHDItemGeneratorAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.ConfigurationSlot <em>Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.ConfigurationSlot
     * @generated
     */
    public Adapter createConfigurator_ConfigurationSlotAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.GenericConfigurationSlot <em>Generic Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.GenericConfigurationSlot
     * @generated
     */
    public Adapter createGenericConfigurationSlotAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.GenericMasterConfigurationSlot <em>Generic Master Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.GenericMasterConfigurationSlot
     * @generated
     */
    public Adapter createGenericMasterConfigurationSlotAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.Processor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.Processor
     * @generated
     */
    public Adapter createProcessorAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter ()
    {
        return null;
    }

} //HdAdapterFactory

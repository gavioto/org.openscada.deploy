/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openscada.configuration.model.ConfigurationSlot;
import org.openscada.configuration.model.GenericConfigurationSlot;
import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;
import org.openscada.configuration.model.master.MasterPackage;
import org.openscada.configuration.model.master.Module;
import org.openscada.configuration.model.master.ModuleProcessor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.model.master.MasterPackage
 * @generated
 */
public class MasterAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MasterPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MasterAdapterFactory ()
    {
        if ( modelPackage == null )
        {
            modelPackage = MasterPackage.eINSTANCE;
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
    protected MasterSwitch<Adapter> modelSwitch = new MasterSwitch<Adapter> () {
        @Override
        public Adapter caseAtlantisConfigurationSlot ( AtlantisConfigurationSlot object )
        {
            return createAtlantisConfigurationSlotAdapter ();
        }

        @Override
        public Adapter caseModule ( Module object )
        {
            return createModuleAdapter ();
        }

        @Override
        public Adapter caseModuleProcessor ( ModuleProcessor object )
        {
            return createModuleProcessorAdapter ();
        }

        @Override
        public Adapter caseConfigurationSlot ( ConfigurationSlot object )
        {
            return createConfigurationSlotAdapter ();
        }

        @Override
        public Adapter caseGenericConfigurationSlot ( GenericConfigurationSlot object )
        {
            return createGenericConfigurationSlotAdapter ();
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
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.master.AtlantisConfigurationSlot <em>Atlantis Configuration Slot</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.master.AtlantisConfigurationSlot
     * @generated
     */
    public Adapter createAtlantisConfigurationSlotAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.master.Module <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.master.Module
     * @generated
     */
    public Adapter createModuleAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.master.ModuleProcessor <em>Module Processor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.master.ModuleProcessor
     * @generated
     */
    public Adapter createModuleProcessorAdapter ()
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
    public Adapter createConfigurationSlotAdapter ()
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

} //MasterAdapterFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openscada.configuration.model.Module;
import org.openscada.configurator.module.common.FileModule;
import org.openscada.configurator.module.common.processing.*;
import org.openscada.configurator.module.common.processing.ImportListModule;
import org.openscada.configurator.module.common.processing.ImportModule;
import org.openscada.configurator.module.common.processing.OverrideListModule;
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.RemoveInactive;
import org.openscada.configurator.module.common.processing.ScriptOverrides;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.module.common.processing.ProcessingPackage
 * @generated
 */
public class ProcessingAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ProcessingPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessingAdapterFactory ()
    {
        if ( modelPackage == null )
        {
            modelPackage = ProcessingPackage.eINSTANCE;
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
    protected ProcessingSwitch<Adapter> modelSwitch = new ProcessingSwitch<Adapter> () {
        @Override
        public Adapter caseImportModule ( ImportModule object )
        {
            return createImportModuleAdapter ();
        }

        @Override
        public Adapter caseOverrideListModule ( OverrideListModule object )
        {
            return createOverrideListModuleAdapter ();
        }

        @Override
        public Adapter caseImportListModule ( ImportListModule object )
        {
            return createImportListModuleAdapter ();
        }

        @Override
        public Adapter caseScriptOverrides ( ScriptOverrides object )
        {
            return createScriptOverridesAdapter ();
        }

        @Override
        public Adapter caseRemoveInactive ( RemoveInactive object )
        {
            return createRemoveInactiveAdapter ();
        }

        @Override
        public Adapter caseModule ( Module object )
        {
            return createModuleAdapter ();
        }

        @Override
        public Adapter caseFileModule ( FileModule object )
        {
            return createFileModuleAdapter ();
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
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.module.common.processing.ImportModule <em>Import Module</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.module.common.processing.ImportModule
     * @generated
     */
    public Adapter createImportModuleAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.module.common.processing.OverrideListModule <em>Override List Module</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.module.common.processing.OverrideListModule
     * @generated
     */
    public Adapter createOverrideListModuleAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.module.common.processing.ImportListModule <em>Import List Module</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.module.common.processing.ImportListModule
     * @generated
     */
    public Adapter createImportListModuleAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.module.common.processing.ScriptOverrides <em>Script Overrides</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.module.common.processing.ScriptOverrides
     * @generated
     */
    public Adapter createScriptOverridesAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.module.common.processing.RemoveInactive <em>Remove Inactive</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.module.common.processing.RemoveInactive
     * @generated
     */
    public Adapter createRemoveInactiveAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.module.common.FileModule <em>File Module</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.module.common.FileModule
     * @generated
     */
    public Adapter createFileModuleAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configuration.model.Module <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configuration.model.Module
     * @generated
     */
    public Adapter createModuleAdapter ()
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

} //ProcessingAdapterFactory

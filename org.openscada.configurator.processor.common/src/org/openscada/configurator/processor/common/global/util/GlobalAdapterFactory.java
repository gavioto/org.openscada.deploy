/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openscada.configuration.model.Processor;
import org.openscada.configurator.processor.common.global.AePullConfiguration;
import org.openscada.configurator.processor.common.global.EventQueryImport;
import org.openscada.configurator.processor.common.global.Exclude;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.Include;
import org.openscada.configurator.processor.common.global.ItemSelector;
import org.openscada.configurator.processor.common.global.MonitorQueryImport;
import org.openscada.configurator.processor.common.global.PropertyEntry;
import org.openscada.configurator.processor.common.global.QueryImport;
import org.openscada.configurator.processor.common.global.Site;
import org.openscada.configurator.processor.common.global.TransformSiteToGlobal;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.processor.common.global.GlobalPackage
 * @generated
 */
public class GlobalAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static GlobalPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalAdapterFactory ()
    {
        if ( modelPackage == null )
        {
            modelPackage = GlobalPackage.eINSTANCE;
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
    protected GlobalSwitch<Adapter> modelSwitch = new GlobalSwitch<Adapter> () {
        @Override
        public Adapter caseTransformSiteToGlobal ( TransformSiteToGlobal object )
        {
            return createTransformSiteToGlobalAdapter ();
        }

        @Override
        public Adapter caseSite ( Site object )
        {
            return createSiteAdapter ();
        }

        @Override
        public Adapter caseItemSelector ( ItemSelector object )
        {
            return createItemSelectorAdapter ();
        }

        @Override
        public Adapter caseExclude ( Exclude object )
        {
            return createExcludeAdapter ();
        }

        @Override
        public Adapter caseInclude ( Include object )
        {
            return createIncludeAdapter ();
        }

        @Override
        public Adapter caseQueryImport ( QueryImport object )
        {
            return createQueryImportAdapter ();
        }

        @Override
        public Adapter caseMonitorQueryImport ( MonitorQueryImport object )
        {
            return createMonitorQueryImportAdapter ();
        }

        @Override
        public Adapter caseEventQueryImport ( EventQueryImport object )
        {
            return createEventQueryImportAdapter ();
        }

        @Override
        public Adapter caseAePullConfiguration ( AePullConfiguration object )
        {
            return createAePullConfigurationAdapter ();
        }

        @Override
        public Adapter casePropertyEntry ( PropertyEntry object )
        {
            return createPropertyEntryAdapter ();
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
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal <em>Transform Site To Global</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.TransformSiteToGlobal
     * @generated
     */
    public Adapter createTransformSiteToGlobalAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.Site <em>Site</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.Site
     * @generated
     */
    public Adapter createSiteAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.ItemSelector <em>Item Selector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.ItemSelector
     * @generated
     */
    public Adapter createItemSelectorAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.Exclude <em>Exclude</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.Exclude
     * @generated
     */
    public Adapter createExcludeAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.Include <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.Include
     * @generated
     */
    public Adapter createIncludeAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.QueryImport <em>Query Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.QueryImport
     * @generated
     */
    public Adapter createQueryImportAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.MonitorQueryImport <em>Monitor Query Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.MonitorQueryImport
     * @generated
     */
    public Adapter createMonitorQueryImportAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.EventQueryImport <em>Event Query Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.EventQueryImport
     * @generated
     */
    public Adapter createEventQueryImportAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.AePullConfiguration <em>Ae Pull Configuration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.AePullConfiguration
     * @generated
     */
    public Adapter createAePullConfigurationAdapter ()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.openscada.configurator.processor.common.global.PropertyEntry <em>Property Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.openscada.configurator.processor.common.global.PropertyEntry
     * @generated
     */
    public Adapter createPropertyEntryAdapter ()
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

} //GlobalAdapterFactory

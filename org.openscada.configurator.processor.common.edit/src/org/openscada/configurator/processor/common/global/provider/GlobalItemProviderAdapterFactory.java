/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.util.ConfiguratorSwitch;
import org.openscada.configurator.processor.common.global.GlobalFactory;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.util.GlobalAdapterFactory;
import org.openscada.configurator.processor.common.provider.ProcessorsEditPlugin;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalItemProviderAdapterFactory extends GlobalAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
{
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier ();

    /**
     * This helps manage the child creation extenders.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager ( ProcessorsEditPlugin.INSTANCE, GlobalPackage.eNS_URI );

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object> ();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalItemProviderAdapterFactory ()
    {
        supportedTypes.add ( IEditingDomainItemProvider.class );
        supportedTypes.add ( IStructuredItemContentProvider.class );
        supportedTypes.add ( ITreeItemContentProvider.class );
        supportedTypes.add ( IItemLabelProvider.class );
        supportedTypes.add ( IItemPropertySource.class );
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformSiteToGlobalItemProvider transformSiteToGlobalItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformSiteToGlobalAdapter ()
    {
        if ( transformSiteToGlobalItemProvider == null )
        {
            transformSiteToGlobalItemProvider = new TransformSiteToGlobalItemProvider ( this );
        }

        return transformSiteToGlobalItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configurator.processor.common.global.Site} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SiteItemProvider siteItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configurator.processor.common.global.Site}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSiteAdapter ()
    {
        if ( siteItemProvider == null )
        {
            siteItemProvider = new SiteItemProvider ( this );
        }

        return siteItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configurator.processor.common.global.Exclude} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcludeItemProvider excludeItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configurator.processor.common.global.Exclude}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createExcludeAdapter ()
    {
        if ( excludeItemProvider == null )
        {
            excludeItemProvider = new ExcludeItemProvider ( this );
        }

        return excludeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configurator.processor.common.global.Include} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IncludeItemProvider includeItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configurator.processor.common.global.Include}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIncludeAdapter ()
    {
        if ( includeItemProvider == null )
        {
            includeItemProvider = new IncludeItemProvider ( this );
        }

        return includeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configurator.processor.common.global.MonitorQueryImport} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MonitorQueryImportItemProvider monitorQueryImportItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configurator.processor.common.global.MonitorQueryImport}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMonitorQueryImportAdapter ()
    {
        if ( monitorQueryImportItemProvider == null )
        {
            monitorQueryImportItemProvider = new MonitorQueryImportItemProvider ( this );
        }

        return monitorQueryImportItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configurator.processor.common.global.EventQueryImport} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventQueryImportItemProvider eventQueryImportItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configurator.processor.common.global.EventQueryImport}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEventQueryImportAdapter ()
    {
        if ( eventQueryImportItemProvider == null )
        {
            eventQueryImportItemProvider = new EventQueryImportItemProvider ( this );
        }

        return eventQueryImportItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configurator.processor.common.global.AePullConfiguration} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AePullConfigurationItemProvider aePullConfigurationItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configurator.processor.common.global.AePullConfiguration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAePullConfigurationAdapter ()
    {
        if ( aePullConfigurationItemProvider == null )
        {
            aePullConfigurationItemProvider = new AePullConfigurationItemProvider ( this );
        }

        return aePullConfigurationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configurator.processor.common.global.PropertyEntry} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyEntryItemProvider propertyEntryItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configurator.processor.common.global.PropertyEntry}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPropertyEntryAdapter ()
    {
        if ( propertyEntryItemProvider == null )
        {
            propertyEntryItemProvider = new PropertyEntryItemProvider ( this );
        }

        return propertyEntryItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory ()
    {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory ();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory ( ComposedAdapterFactory parentAdapterFactory )
    {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType ( Object type )
    {
        return supportedTypes.contains ( type ) || super.isFactoryForType ( type );
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt ( Notifier notifier, Object type )
    {
        return super.adapt ( notifier, this );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt ( Object object, Object type )
    {
        if ( isFactoryForType ( type ) )
        {
            Object adapter = super.adapt ( object, type );
            if ( ! ( type instanceof Class<?> ) || ( ( (Class<?>)type ).isInstance ( adapter ) ) )
            {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders ()
    {
        return childCreationExtenderManager.getChildCreationExtenders ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection<?> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
    {
        return childCreationExtenderManager.getNewChildDescriptors ( object, editingDomain );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator ()
    {
        return childCreationExtenderManager;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener ( INotifyChangedListener notifyChangedListener )
    {
        changeNotifier.addListener ( notifyChangedListener );
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener ( INotifyChangedListener notifyChangedListener )
    {
        changeNotifier.removeListener ( notifyChangedListener );
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged ( Notification notification )
    {
        changeNotifier.fireNotifyChanged ( notification );

        if ( parentAdapterFactory != null )
        {
            parentAdapterFactory.fireNotifyChanged ( notification );
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose ()
    {
        if ( transformSiteToGlobalItemProvider != null )
            transformSiteToGlobalItemProvider.dispose ();
        if ( siteItemProvider != null )
            siteItemProvider.dispose ();
        if ( excludeItemProvider != null )
            excludeItemProvider.dispose ();
        if ( includeItemProvider != null )
            includeItemProvider.dispose ();
        if ( monitorQueryImportItemProvider != null )
            monitorQueryImportItemProvider.dispose ();
        if ( eventQueryImportItemProvider != null )
            eventQueryImportItemProvider.dispose ();
        if ( aePullConfigurationItemProvider != null )
            aePullConfigurationItemProvider.dispose ();
        if ( propertyEntryItemProvider != null )
            propertyEntryItemProvider.dispose ();
    }

    /**
     * A child creation extender for the {@link ConfiguratorPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class ConfiguratorChildCreationExtender implements IChildCreationExtender
    {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends ConfiguratorSwitch<Object>
        {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch ( List<Object> newChildDescriptors, EditingDomain editingDomain )
            {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseProject ( Project object )
            {
                newChildDescriptors.add ( createChildParameter ( ConfiguratorPackage.Literals.PROJECT__PROCESSORS, GlobalFactory.eINSTANCE.createTransformSiteToGlobal () ) );

                return null;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter ( Object feature, Object child )
            {
                return new CommandParameter ( null, feature, child );
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Collection<Object> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
        {
            ArrayList<Object> result = new ArrayList<Object> ();
            new CreationSwitch ( result, editingDomain ).doSwitch ( (EObject)object );
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResourceLocator getResourceLocator ()
        {
            return ProcessorsEditPlugin.INSTANCE;
        }
    }

}

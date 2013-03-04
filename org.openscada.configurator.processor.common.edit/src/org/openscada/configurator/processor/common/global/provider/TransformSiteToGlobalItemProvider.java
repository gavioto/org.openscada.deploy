/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.openscada.configurator.processor.common.global.GlobalFactory;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.TransformSiteToGlobal;

/**
 * This is the item provider adapter for a {@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformSiteToGlobalItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformSiteToGlobalItemProvider ( AdapterFactory adapterFactory )
    {
        super ( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors ( Object object )
    {
        if ( itemPropertyDescriptors == null )
        {
            super.getPropertyDescriptors ( object );

            addGlobalSlotPropertyDescriptor ( object );
            addConnectionIdFormatPropertyDescriptor ( object );
            addHierarchyPrefixPropertyDescriptor ( object );
            addConnectionItemStateFormatPropertyDescriptor ( object );
            addConnectionItemStringStateFormatPropertyDescriptor ( object );
            addSummaryItemPatternPropertyDescriptor ( object );
            addSummaryItemFormatPropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Global Slot feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGlobalSlotPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_TransformSiteToGlobal_globalSlot_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_TransformSiteToGlobal_globalSlot_feature", "_UI_TransformSiteToGlobal_type" ), GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT, true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Connection Id Format feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionIdFormatPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_TransformSiteToGlobal_connectionIdFormat_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_TransformSiteToGlobal_connectionIdFormat_feature", "_UI_TransformSiteToGlobal_type" ), GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hierarchy Prefix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHierarchyPrefixPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_TransformSiteToGlobal_hierarchyPrefix_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_TransformSiteToGlobal_hierarchyPrefix_feature", "_UI_TransformSiteToGlobal_type" ), GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Connection Item State Format feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionItemStateFormatPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_TransformSiteToGlobal_connectionItemStateFormat_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_TransformSiteToGlobal_connectionItemStateFormat_feature", "_UI_TransformSiteToGlobal_type" ), GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Connection Item String State Format feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionItemStringStateFormatPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_TransformSiteToGlobal_connectionItemStringStateFormat_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_TransformSiteToGlobal_connectionItemStringStateFormat_feature", "_UI_TransformSiteToGlobal_type" ), GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Summary Item Pattern feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSummaryItemPatternPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_TransformSiteToGlobal_summaryItemPattern_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_TransformSiteToGlobal_summaryItemPattern_feature", "_UI_TransformSiteToGlobal_type" ), GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Summary Item Format feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSummaryItemFormatPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_TransformSiteToGlobal_summaryItemFormat_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_TransformSiteToGlobal_summaryItemFormat_feature", "_UI_TransformSiteToGlobal_type" ), GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures ( Object object )
    {
        if ( childrenFeatures == null )
        {
            super.getChildrenFeatures ( object );
            childrenFeatures.add ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__SITES );
            childrenFeatures.add ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__SELECTOR );
            childrenFeatures.add ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__QUERIES );
            childrenFeatures.add ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature ( Object object, Object child )
    {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature ( object, child );
    }

    /**
     * This returns TransformSiteToGlobal.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/TransformSiteToGlobal" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText ( Object object )
    {
        String label = ( (TransformSiteToGlobal)object ).getConnectionIdFormat ();
        return label == null || label.length () == 0 ? getString ( "_UI_TransformSiteToGlobal_type" ) : getString ( "_UI_TransformSiteToGlobal_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged ( Notification notification )
    {
        updateChildren ( notification );

        switch ( notification.getFeatureID ( TransformSiteToGlobal.class ) )
        {
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT:
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX:
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT:
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT:
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN:
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), false, true ) );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SELECTOR:
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__QUERIES:
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), true, false ) );
                return;
        }
        super.notifyChanged ( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors ( Collection<Object> newChildDescriptors, Object object )
    {
        super.collectNewChildDescriptors ( newChildDescriptors, object );

        newChildDescriptors.add ( createChildParameter ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__SITES, GlobalFactory.eINSTANCE.createSite () ) );

        newChildDescriptors.add ( createChildParameter ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__SELECTOR, GlobalFactory.eINSTANCE.createExclude () ) );

        newChildDescriptors.add ( createChildParameter ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__SELECTOR, GlobalFactory.eINSTANCE.createInclude () ) );

        newChildDescriptors.add ( createChildParameter ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__QUERIES, GlobalFactory.eINSTANCE.createMonitorQueryImport () ) );

        newChildDescriptors.add ( createChildParameter ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__QUERIES, GlobalFactory.eINSTANCE.createEventQueryImport () ) );

        newChildDescriptors.add ( createChildParameter ( GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION, GlobalFactory.eINSTANCE.createAePullConfiguration () ) );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator ()
    {
        return ( (IChildCreationExtender)adapterFactory ).getResourceLocator ();
    }

}

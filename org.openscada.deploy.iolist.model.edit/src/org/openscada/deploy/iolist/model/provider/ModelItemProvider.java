/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * This is the item provider adapter for a {@link org.openscada.deploy.iolist.model.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelItemProvider ( AdapterFactory adapterFactory )
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add ( ModelPackage.Literals.MODEL__ITEMS );
            childrenFeatures.add ( ModelPackage.Literals.MODEL__AVERAGES );
            childrenFeatures.add ( ModelPackage.Literals.MODEL__MOVING_AVERAGES );
            childrenFeatures.add ( ModelPackage.Literals.MODEL__ROOT_SUMMARY );
            childrenFeatures.add ( ModelPackage.Literals.MODEL__PLAIN_SUMMARY );
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
     * This returns Model.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/Model" ) );
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
        return getString ( "_UI_Model_type" );
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

        switch ( notification.getFeatureID ( Model.class ) )
        {
            case ModelPackage.MODEL__ITEMS:
            case ModelPackage.MODEL__AVERAGES:
            case ModelPackage.MODEL__MOVING_AVERAGES:
            case ModelPackage.MODEL__ROOT_SUMMARY:
            case ModelPackage.MODEL__PLAIN_SUMMARY:
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

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__ITEMS, ModelFactory.eINSTANCE.createItem () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__ITEMS, ModelFactory.eINSTANCE.createFormulaItem () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__ITEMS, ModelFactory.eINSTANCE.createScriptItem () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__ITEMS, ModelFactory.eINSTANCE.createAverageItem () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__ITEMS, ModelFactory.eINSTANCE.createConstantItem () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__ITEMS, ModelFactory.eINSTANCE.createMovingAverageItem () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__AVERAGES, ModelFactory.eINSTANCE.createAverage () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__MOVING_AVERAGES, ModelFactory.eINSTANCE.createMovingAverage () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__ROOT_SUMMARY, ModelFactory.eINSTANCE.createHierarchySummaryGroup () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.MODEL__PLAIN_SUMMARY, ModelFactory.eINSTANCE.createPlainSummaryGroup () ) );
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
        return IolistEditPlugin.INSTANCE;
    }

}

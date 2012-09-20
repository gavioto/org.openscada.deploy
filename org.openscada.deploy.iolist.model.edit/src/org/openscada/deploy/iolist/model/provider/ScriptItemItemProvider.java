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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.ScriptItem;

/**
 * This is the item provider adapter for a {@link org.openscada.deploy.iolist.model.ScriptItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptItemItemProvider extends ItemItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptItemItemProvider ( AdapterFactory adapterFactory )
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

            addScriptEnginePropertyDescriptor ( object );
            addInitScriptPropertyDescriptor ( object );
            addUpdateScriptPropertyDescriptor ( object );
            addTimerScriptPropertyDescriptor ( object );
            addTimerPeriodPropertyDescriptor ( object );
            addWriteCommandPropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Script Engine feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScriptEnginePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_ScriptItem_scriptEngine_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_ScriptItem_scriptEngine_feature", "_UI_ScriptItem_type" ), ModelPackage.Literals.SCRIPT_ITEM__SCRIPT_ENGINE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Init Script feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitScriptPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_ScriptItem_initScript_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_ScriptItem_initScript_feature", "_UI_ScriptItem_type" ), ModelPackage.Literals.SCRIPT_ITEM__INIT_SCRIPT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Update Script feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpdateScriptPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_ScriptItem_updateScript_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_ScriptItem_updateScript_feature", "_UI_ScriptItem_type" ), ModelPackage.Literals.SCRIPT_ITEM__UPDATE_SCRIPT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Timer Script feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimerScriptPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_ScriptItem_timerScript_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_ScriptItem_timerScript_feature", "_UI_ScriptItem_type" ), ModelPackage.Literals.SCRIPT_ITEM__TIMER_SCRIPT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Timer Period feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimerPeriodPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_ScriptItem_timerPeriod_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_ScriptItem_timerPeriod_feature", "_UI_ScriptItem_type" ), ModelPackage.Literals.SCRIPT_ITEM__TIMER_PERIOD, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Write Command feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWriteCommandPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_ScriptItem_writeCommand_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_ScriptItem_writeCommand_feature", "_UI_ScriptItem_type" ), ModelPackage.Literals.SCRIPT_ITEM__WRITE_COMMAND, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
            childrenFeatures.add ( ModelPackage.Literals.SCRIPT_ITEM__INPUTS );
            childrenFeatures.add ( ModelPackage.Literals.SCRIPT_ITEM__OUTPUTS );
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
     * This returns ScriptItem.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/ScriptItem" ) );
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
        String label = ( (ScriptItem)object ).getAlias ();
        return label == null || label.length () == 0 ? getString ( "_UI_ScriptItem_type" ) : getString ( "_UI_ScriptItem_type" ) + " " + label;
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

        switch ( notification.getFeatureID ( ScriptItem.class ) )
        {
            case ModelPackage.SCRIPT_ITEM__SCRIPT_ENGINE:
            case ModelPackage.SCRIPT_ITEM__INIT_SCRIPT:
            case ModelPackage.SCRIPT_ITEM__UPDATE_SCRIPT:
            case ModelPackage.SCRIPT_ITEM__TIMER_SCRIPT:
            case ModelPackage.SCRIPT_ITEM__TIMER_PERIOD:
            case ModelPackage.SCRIPT_ITEM__WRITE_COMMAND:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), false, true ) );
                return;
            case ModelPackage.SCRIPT_ITEM__INPUTS:
            case ModelPackage.SCRIPT_ITEM__OUTPUTS:
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

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.SCRIPT_ITEM__INPUTS, ModelFactory.eINSTANCE.createFormulaInput () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.SCRIPT_ITEM__OUTPUTS, ModelFactory.eINSTANCE.createScriptOutput () ) );
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText ( Object owner, Object feature, Object child, Collection<?> selection )
    {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == ModelPackage.Literals.ITEM__LOCAL_HIGH_HIGH || childFeature == ModelPackage.Literals.ITEM__LOCAL_HIGH || childFeature == ModelPackage.Literals.ITEM__LOCAL_LOW || childFeature == ModelPackage.Literals.ITEM__LOCAL_LOW_LOW || childFeature == ModelPackage.Literals.ITEM__LOCAL_MIN || childFeature == ModelPackage.Literals.ITEM__LOCAL_MAX;

        if ( qualify )
        {
            return getString ( "_UI_CreateChild_text2", new Object[] { getTypeText ( childObject ), getFeatureText ( childFeature ), getTypeText ( owner ) } );
        }
        return super.getCreateChildText ( owner, feature, child, selection );
    }

}

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

import org.openscada.deploy.iolist.model.FormulaItem;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * This is the item provider adapter for a {@link org.openscada.deploy.iolist.model.FormulaItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FormulaItemItemProvider extends ItemItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaItemItemProvider ( AdapterFactory adapterFactory )
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

            addInputFormulaPropertyDescriptor ( object );
            addOutputFormulaPropertyDescriptor ( object );
            addOutputDatasourceIdPropertyDescriptor ( object );
            addWriteValueNamePropertyDescriptor ( object );
            addInitScriptPropertyDescriptor ( object );
            addOutputDatasourceTypePropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Input Formula feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputFormulaPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_FormulaItem_inputFormula_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_FormulaItem_inputFormula_feature", "_UI_FormulaItem_type" ), ModelPackage.Literals.FORMULA_ITEM__INPUT_FORMULA, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Output Formula feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputFormulaPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_FormulaItem_outputFormula_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_FormulaItem_outputFormula_feature", "_UI_FormulaItem_type" ), ModelPackage.Literals.FORMULA_ITEM__OUTPUT_FORMULA, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Output Datasource Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputDatasourceIdPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_FormulaItem_outputDatasourceId_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_FormulaItem_outputDatasourceId_feature", "_UI_FormulaItem_type" ), ModelPackage.Literals.FORMULA_ITEM__OUTPUT_DATASOURCE_ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Write Value Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWriteValueNamePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_FormulaItem_writeValueName_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_FormulaItem_writeValueName_feature", "_UI_FormulaItem_type" ), ModelPackage.Literals.FORMULA_ITEM__WRITE_VALUE_NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Init Script feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitScriptPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_FormulaItem_initScript_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_FormulaItem_initScript_feature", "_UI_FormulaItem_type" ), ModelPackage.Literals.FORMULA_ITEM__INIT_SCRIPT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Output Datasource Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputDatasourceTypePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_FormulaItem_outputDatasourceType_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_FormulaItem_outputDatasourceType_feature", "_UI_FormulaItem_type" ), ModelPackage.Literals.FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
            childrenFeatures.add ( ModelPackage.Literals.FORMULA_ITEM__INPUTS );
            childrenFeatures.add ( ModelPackage.Literals.FORMULA_ITEM__SCRIPT_MODULES );
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
     * This returns FormulaItem.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/FormulaItem" ) );
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
        String label = ( (FormulaItem)object ).getName ();
        return label == null || label.length () == 0 ? getString ( "_UI_FormulaItem_type" ) : getString ( "_UI_FormulaItem_type" ) + " " + label;
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

        switch ( notification.getFeatureID ( FormulaItem.class ) )
        {
            case ModelPackage.FORMULA_ITEM__INPUT_FORMULA:
            case ModelPackage.FORMULA_ITEM__OUTPUT_FORMULA:
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_ID:
            case ModelPackage.FORMULA_ITEM__WRITE_VALUE_NAME:
            case ModelPackage.FORMULA_ITEM__INIT_SCRIPT:
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), false, true ) );
                return;
            case ModelPackage.FORMULA_ITEM__INPUTS:
            case ModelPackage.FORMULA_ITEM__SCRIPT_MODULES:
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

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.FORMULA_ITEM__INPUTS, ModelFactory.eINSTANCE.createFormulaInput () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.FORMULA_ITEM__SCRIPT_MODULES, ModelFactory.eINSTANCE.createScriptModule () ) );
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

        boolean qualify = childFeature == ModelPackage.Literals.ITEM__LOCAL_HIGH_HIGH || childFeature == ModelPackage.Literals.ITEM__LOCAL_HIGH || childFeature == ModelPackage.Literals.ITEM__LOCAL_LOW || childFeature == ModelPackage.Literals.ITEM__LOCAL_LOW_LOW;

        if ( qualify )
        {
            return getString ( "_UI_CreateChild_text2", new Object[] { getTypeText ( childObject ), getFeatureText ( childFeature ), getTypeText ( owner ) } );
        }
        return super.getCreateChildText ( owner, feature, child, selection );
    }

}

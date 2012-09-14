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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * This is the item provider adapter for a {@link org.openscada.deploy.iolist.model.Item} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemItemProvider ( AdapterFactory adapterFactory )
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

            addDevicePropertyDescriptor ( object );
            addNamePropertyDescriptor ( object );
            addDataTypePropertyDescriptor ( object );
            addUnitPropertyDescriptor ( object );
            addAliasPropertyDescriptor ( object );
            addDescriptionPropertyDescriptor ( object );
            addDefaultChainPropertyDescriptor ( object );
            addEventCommandPropertyDescriptor ( object );
            addLocalManualPropertyDescriptor ( object );
            addRemoteManualPropertyDescriptor ( object );
            addSystemPropertyDescriptor ( object );
            addHierarchyPropertyDescriptor ( object );
            addRemoteMinPropertyDescriptor ( object );
            addRemoteMaxPropertyDescriptor ( object );
            addRemoteHighHighPropertyDescriptor ( object );
            addRemoteHighPropertyDescriptor ( object );
            addRemoteLowPropertyDescriptor ( object );
            addRemoteLowLowPropertyDescriptor ( object );
            addRemoteBoolPropertyDescriptor ( object );
            addRemoteBoolAckValuePropertyDescriptor ( object );
            addInputPropertyDescriptor ( object );
            addOutputPropertyDescriptor ( object );
            addLocalScaleAvailablePropertyDescriptor ( object );
            addLocalScaleFactorPropertyDescriptor ( object );
            addLocalScaleOffsetPropertyDescriptor ( object );
            addDebugInformationPropertyDescriptor ( object );
            addIgnoreSummaryPropertyDescriptor ( object );
            addBlockPropertyDescriptor ( object );
            addEnabledPropertyDescriptor ( object );
            addHdStoragePropertyDescriptor ( object );
            addSimulationValuePropertyDescriptor ( object );
            addRoundingAvailablePropertyDescriptor ( object );
            addRoundingValuePropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Device feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDevicePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_device_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_device_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__DEVICE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_basePropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_name_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_name_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_basePropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Data Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataTypePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_dataType_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_dataType_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__DATA_TYPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_basePropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnitPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_unit_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_unit_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__UNIT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_infoPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Alias feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAliasPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_alias_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_alias_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__ALIAS, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_basePropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDescriptionPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_description_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_description_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__DESCRIPTION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_basePropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Default Chain feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefaultChainPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_defaultChain_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_defaultChain_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__DEFAULT_CHAIN, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Event Command feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEventCommandPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_eventCommand_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_eventCommand_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__EVENT_COMMAND, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Local Manual feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocalManualPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_localManual_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_localManual_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__LOCAL_MANUAL, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Remote Manual feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteManualPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_remoteManual_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_remoteManual_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__REMOTE_MANUAL, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the System feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSystemPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_system_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_system_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__SYSTEM, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_infoPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Hierarchy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHierarchyPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_hierarchy_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_hierarchy_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__HIERARCHY, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_infoPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Remote Min feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteMinPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_remoteMin_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_remoteMin_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__REMOTE_MIN, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_remoteMonitoringPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Remote Max feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteMaxPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_remoteMax_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_remoteMax_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__REMOTE_MAX, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_remoteMonitoringPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Remote High High feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteHighHighPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_remoteHighHigh_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_remoteHighHigh_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__REMOTE_HIGH_HIGH, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_remoteMonitoringPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Remote High feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteHighPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_remoteHigh_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_remoteHigh_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__REMOTE_HIGH, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_remoteMonitoringPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Remote Low feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteLowPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_remoteLow_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_remoteLow_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__REMOTE_LOW, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_remoteMonitoringPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Remote Low Low feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteLowLowPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_remoteLowLow_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_remoteLowLow_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__REMOTE_LOW_LOW, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_remoteMonitoringPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Remote Bool feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteBoolPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_remoteBool_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_remoteBool_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__REMOTE_BOOL, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_remoteMonitoringPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Remote Bool Ack Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteBoolAckValuePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_remoteBoolAckValue_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_remoteBoolAckValue_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__REMOTE_BOOL_ACK_VALUE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_remoteMonitoringPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Input feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_input_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_input_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__INPUT, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_infoPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Output feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_output_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_output_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__OUTPUT, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_infoPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Local Scale Available feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocalScaleAvailablePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_localScaleAvailable_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_localScaleAvailable_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__LOCAL_SCALE_AVAILABLE, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Local Scale Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocalScaleFactorPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_localScaleFactor_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_localScaleFactor_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__LOCAL_SCALE_FACTOR, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Local Scale Offset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocalScaleOffsetPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_localScaleOffset_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_localScaleOffset_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__LOCAL_SCALE_OFFSET, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Debug Information feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDebugInformationPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_debugInformation_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_debugInformation_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__DEBUG_INFORMATION, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ignore Summary feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIgnoreSummaryPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_ignoreSummary_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_ignoreSummary_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__IGNORE_SUMMARY, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Block feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBlockPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_block_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_block_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__BLOCK, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Enabled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnabledPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_enabled_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_enabled_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__ENABLED, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Hd Storage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHdStoragePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_hdStorage_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_hdStorage_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__HD_STORAGE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Simulation Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSimulationValuePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_simulationValue_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_simulationValue_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__SIMULATION_VALUE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rounding Available feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRoundingAvailablePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_roundingAvailable_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_roundingAvailable_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__ROUNDING_AVAILABLE, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
    }

    /**
     * This adds a property descriptor for the Rounding Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRoundingValuePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Item_roundingValue_feature" ), getString ( "_UI_PropertyDescriptor_description", "_UI_Item_roundingValue_feature", "_UI_Item_type" ), ModelPackage.Literals.ITEM__ROUNDING_VALUE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_processingPropertyCategory" ), null ) );
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
            childrenFeatures.add ( ModelPackage.Literals.ITEM__MAPPER );
            childrenFeatures.add ( ModelPackage.Literals.ITEM__LOCAL_HIGH_HIGH );
            childrenFeatures.add ( ModelPackage.Literals.ITEM__LOCAL_HIGH );
            childrenFeatures.add ( ModelPackage.Literals.ITEM__LOCAL_LOW );
            childrenFeatures.add ( ModelPackage.Literals.ITEM__LOCAL_LOW_LOW );
            childrenFeatures.add ( ModelPackage.Literals.ITEM__LOCAL_LIST_MONITOR );
            childrenFeatures.add ( ModelPackage.Literals.ITEM__LOCAL_BOOLEAN_MONITOR );
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
     * This returns Item.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/Item" ) );
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
        String label = ( (Item)object ).getAlias ();
        return label == null || label.length () == 0 ? getString ( "_UI_Item_type" ) : getString ( "_UI_Item_type" ) + " " + label;
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

        switch ( notification.getFeatureID ( Item.class ) )
        {
            case ModelPackage.ITEM__DEVICE:
            case ModelPackage.ITEM__NAME:
            case ModelPackage.ITEM__DATA_TYPE:
            case ModelPackage.ITEM__UNIT:
            case ModelPackage.ITEM__ALIAS:
            case ModelPackage.ITEM__DESCRIPTION:
            case ModelPackage.ITEM__DEFAULT_CHAIN:
            case ModelPackage.ITEM__EVENT_COMMAND:
            case ModelPackage.ITEM__LOCAL_MANUAL:
            case ModelPackage.ITEM__REMOTE_MANUAL:
            case ModelPackage.ITEM__SYSTEM:
            case ModelPackage.ITEM__HIERARCHY:
            case ModelPackage.ITEM__REMOTE_MIN:
            case ModelPackage.ITEM__REMOTE_MAX:
            case ModelPackage.ITEM__REMOTE_HIGH_HIGH:
            case ModelPackage.ITEM__REMOTE_HIGH:
            case ModelPackage.ITEM__REMOTE_LOW:
            case ModelPackage.ITEM__REMOTE_LOW_LOW:
            case ModelPackage.ITEM__REMOTE_BOOL:
            case ModelPackage.ITEM__REMOTE_BOOL_ACK_VALUE:
            case ModelPackage.ITEM__INPUT:
            case ModelPackage.ITEM__OUTPUT:
            case ModelPackage.ITEM__LOCAL_SCALE_AVAILABLE:
            case ModelPackage.ITEM__LOCAL_SCALE_FACTOR:
            case ModelPackage.ITEM__LOCAL_SCALE_OFFSET:
            case ModelPackage.ITEM__DEBUG_INFORMATION:
            case ModelPackage.ITEM__IGNORE_SUMMARY:
            case ModelPackage.ITEM__BLOCK:
            case ModelPackage.ITEM__ENABLED:
            case ModelPackage.ITEM__HD_STORAGE:
            case ModelPackage.ITEM__SIMULATION_VALUE:
            case ModelPackage.ITEM__ROUNDING_AVAILABLE:
            case ModelPackage.ITEM__ROUNDING_VALUE:
            case ModelPackage.ITEM__LOCAL_MIN:
            case ModelPackage.ITEM__LOCAL_MAX:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), false, true ) );
                return;
            case ModelPackage.ITEM__MAPPER:
            case ModelPackage.ITEM__LOCAL_HIGH_HIGH:
            case ModelPackage.ITEM__LOCAL_HIGH:
            case ModelPackage.ITEM__LOCAL_LOW:
            case ModelPackage.ITEM__LOCAL_LOW_LOW:
            case ModelPackage.ITEM__LOCAL_LIST_MONITOR:
            case ModelPackage.ITEM__LOCAL_BOOLEAN_MONITOR:
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

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.ITEM__MAPPER, ModelFactory.eINSTANCE.createMapper () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.ITEM__LOCAL_HIGH_HIGH, ModelFactory.eINSTANCE.createLevelMonitor () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.ITEM__LOCAL_HIGH, ModelFactory.eINSTANCE.createLevelMonitor () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.ITEM__LOCAL_LOW, ModelFactory.eINSTANCE.createLevelMonitor () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.ITEM__LOCAL_LOW_LOW, ModelFactory.eINSTANCE.createLevelMonitor () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.ITEM__LOCAL_LIST_MONITOR, ModelFactory.eINSTANCE.createListMonitor () ) );

        newChildDescriptors.add ( createChildParameter ( ModelPackage.Literals.ITEM__LOCAL_BOOLEAN_MONITOR, ModelFactory.eINSTANCE.createBooleanMonitor () ) );
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

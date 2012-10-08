/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.openscada.configuration.model.ConfigurationSlot;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.processor.common.CommonPackage;
import org.openscada.configurator.processor.common.StoreConfigurationSlotProcessor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Store Configuration Slot Processor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.impl.StoreConfigurationSlotProcessorImpl#getSlots <em>Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoreConfigurationSlotProcessorImpl extends EObjectImpl implements StoreConfigurationSlotProcessor
{
    /**
     * The cached value of the '{@link #getSlots() <em>Slots</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlots()
     * @generated
     * @ordered
     */
    protected EList<ConfigurationSlot> slots;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected StoreConfigurationSlotProcessorImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return CommonPackage.Literals.STORE_CONFIGURATION_SLOT_PROCESSOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConfigurationSlot> getSlots ()
    {
        if ( slots == null )
        {
            slots = new EObjectResolvingEList<ConfigurationSlot> ( ConfigurationSlot.class, this, CommonPackage.STORE_CONFIGURATION_SLOT_PROCESSOR__SLOTS );
        }
        return slots;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void process ( Project project ) throws Exception
    {
        for ( ConfigurationSlot slot : getSlots () )
        {
            slot.store ();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
            case CommonPackage.STORE_CONFIGURATION_SLOT_PROCESSOR__SLOTS:
                return getSlots ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case CommonPackage.STORE_CONFIGURATION_SLOT_PROCESSOR__SLOTS:
                getSlots ().clear ();
                getSlots ().addAll ( (Collection<? extends ConfigurationSlot>)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
            case CommonPackage.STORE_CONFIGURATION_SLOT_PROCESSOR__SLOTS:
                getSlots ().clear ();
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case CommonPackage.STORE_CONFIGURATION_SLOT_PROCESSOR__SLOTS:
                return slots != null && !slots.isEmpty ();
        }
        return super.eIsSet ( featureID );
    }

} //StoreConfigurationSlotProcessorImpl

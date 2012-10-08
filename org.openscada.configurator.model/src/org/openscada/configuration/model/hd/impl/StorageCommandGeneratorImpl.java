/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.hd.ConfigurationSlot;
import org.openscada.configuration.model.hd.HdPackage;
import org.openscada.configuration.model.hd.StorageCommandGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Storage Command Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.hd.impl.StorageCommandGeneratorImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StorageCommandGeneratorImpl extends EObjectImpl implements StorageCommandGenerator
{
    /**
     * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSlot()
     * @generated
     * @ordered
     */
    protected ConfigurationSlot slot;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected StorageCommandGeneratorImpl ()
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
        return HdPackage.Literals.STORAGE_COMMAND_GENERATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfigurationSlot getSlot ()
    {
        if ( slot != null && slot.eIsProxy () )
        {
            InternalEObject oldSlot = (InternalEObject)slot;
            slot = (ConfigurationSlot)eResolveProxy ( oldSlot );
            if ( slot != oldSlot )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, HdPackage.STORAGE_COMMAND_GENERATOR__SLOT, oldSlot, slot ) );
            }
        }
        return slot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ConfigurationSlot basicGetSlot ()
    {
        return slot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSlot ( ConfigurationSlot newSlot )
    {
        ConfigurationSlot oldSlot = slot;
        slot = newSlot;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, HdPackage.STORAGE_COMMAND_GENERATOR__SLOT, oldSlot, slot ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Project project )
    {
        System.out.println ( "START" );
        final Map<String, Map<String, String>> hdFactory = getSlot ().getConfigurationData ().getData ().get ( "historical.item.factory" );
        if ( hdFactory == null )
        {
            System.out.println ( "EMPTY" );
            return;
        }
        for ( final String key : hdFactory.keySet () )
        {
            System.out.println ( String.format ( "addHDStorage %s 3600000 2160", key ) );
        }
        System.out.println ( "END" );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
            case HdPackage.STORAGE_COMMAND_GENERATOR__SLOT:
                if ( resolve )
                    return getSlot ();
                return basicGetSlot ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case HdPackage.STORAGE_COMMAND_GENERATOR__SLOT:
                setSlot ( (ConfigurationSlot)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
            case HdPackage.STORAGE_COMMAND_GENERATOR__SLOT:
                setSlot ( (ConfigurationSlot)null );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case HdPackage.STORAGE_COMMAND_GENERATOR__SLOT:
                return slot != null;
        }
        return super.eIsSet ( featureID );
    }

} //StorageCommandGeneratorImpl

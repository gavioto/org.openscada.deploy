/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.GenericConfigurationSlot;
import org.openscada.configurator.GenericConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Generic Configuration Slot</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openscada.configuration.model.impl.GenericConfigurationSlotImpl#getId <em>Id</em>}</li>
 * <li>{@link org.openscada.configuration.model.impl.GenericConfigurationSlotImpl#getJsonBase <em>Json Base</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class GenericConfigurationSlotImpl extends EObjectImpl implements GenericConfigurationSlot
{
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getJsonBase() <em>Json Base</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getJsonBase()
     * @generated
     * @ordered
     */
    protected EList<String> jsonBase;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected GenericConfigurationSlotImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ConfiguratorPackage.Literals.GENERIC_CONFIGURATION_SLOT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getId ()
    {
        return this.id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setId ( final String newId )
    {
        final String oldId = this.id;
        this.id = newId;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID, oldId, this.id ) );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<String> getJsonBase ()
    {
        if ( this.jsonBase == null )
        {
            this.jsonBase = new EDataTypeUniqueEList<String> ( String.class, this, ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE );
        }
        return this.jsonBase;
    }

    /**
     * Initialize the generic configuration
     * 
     * @generated NOT
     */
    @Override
    public void initialize ( final GenericConfiguration configuration )
    {
        for ( final String uri : getJsonBase () )
        {
            System.out.println ( "*** 0 - Loading base json file: " + uri );
            configuration.loadData ( uri );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet ( final int featureID, final boolean resolve, final boolean coreType )
    {
        switch ( featureID )
        {
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID:
                return getId ();
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE:
                return getJsonBase ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( final int featureID, final Object newValue )
    {
        switch ( featureID )
        {
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID:
                setId ( (String)newValue );
                return;
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE:
                getJsonBase ().clear ();
                getJsonBase ().addAll ( (Collection<? extends String>)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset ( final int featureID )
    {
        switch ( featureID )
        {
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID:
                setId ( ID_EDEFAULT );
                return;
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE:
                getJsonBase ().clear ();
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet ( final int featureID )
    {
        switch ( featureID )
        {
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID:
                return ID_EDEFAULT == null ? this.id != null : !ID_EDEFAULT.equals ( this.id );
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE:
                return this.jsonBase != null && !this.jsonBase.isEmpty ();
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
        {
            return super.toString ();
        }

        final StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (id: " );
        result.append ( this.id );
        result.append ( ", jsonBase: " );
        result.append ( this.jsonBase );
        result.append ( ')' );
        return result.toString ();
    }

} //GenericConfigurationSlotImpl

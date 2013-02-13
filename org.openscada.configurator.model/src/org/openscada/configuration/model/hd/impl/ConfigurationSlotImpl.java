/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openscada.configuration.model.hd.ConfigurationSlot;
import org.openscada.configuration.model.hd.HdPackage;
import org.openscada.configuration.model.impl.GenericMasterConfigurationSlotImpl;
import org.openscada.configurator.GenericConfiguration;
import org.openscada.configurator.GenericMasterConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Configuration Slot</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.hd.impl.ConfigurationSlotImpl#getMasterConnectionUri <em>Master Connection Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationSlotImpl extends GenericMasterConfigurationSlotImpl implements ConfigurationSlot
{
    /**
     * The default value of the '{@link #getMasterConnectionUri() <em>Master Connection Uri</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMasterConnectionUri()
     * @generated
     * @ordered
     */
    protected static final String MASTER_CONNECTION_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMasterConnectionUri() <em>Master Connection Uri</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMasterConnectionUri()
     * @generated
     * @ordered
     */
    protected String masterConnectionUri = MASTER_CONNECTION_URI_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ConfigurationSlotImpl ()
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
        return HdPackage.Literals.CONFIGURATION_SLOT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMasterConnectionUri ()
    {
        return masterConnectionUri;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMasterConnectionUri ( String newMasterConnectionUri )
    {
        String oldMasterConnectionUri = masterConnectionUri;
        masterConnectionUri = newMasterConnectionUri;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, HdPackage.CONFIGURATION_SLOT__MASTER_CONNECTION_URI, oldMasterConnectionUri, masterConnectionUri ) );
    }

    /**
     * @generated NOT
     */
    private GenericMasterConfiguration configuration;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public GenericMasterConfiguration getConfigurationData ()
    {
        if ( this.configuration == null )
        {
            this.configuration = new GenericMasterConfiguration ();
            initialize ( this.configuration );
        }
        return this.configuration;
    }

    @Override
    public void initialize ( final GenericConfiguration configuration )
    {
        super.initialize ( configuration );

        final Map<String, String> data = new HashMap<String, String> ();
        data.put ( "connection.uri", getMasterConnectionUri () );
        configuration.addData ( "da.connection", "master", data );
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
            case HdPackage.CONFIGURATION_SLOT__MASTER_CONNECTION_URI:
                return getMasterConnectionUri ();
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
            case HdPackage.CONFIGURATION_SLOT__MASTER_CONNECTION_URI:
                setMasterConnectionUri ( (String)newValue );
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
            case HdPackage.CONFIGURATION_SLOT__MASTER_CONNECTION_URI:
                setMasterConnectionUri ( MASTER_CONNECTION_URI_EDEFAULT );
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
            case HdPackage.CONFIGURATION_SLOT__MASTER_CONNECTION_URI:
                return MASTER_CONNECTION_URI_EDEFAULT == null ? masterConnectionUri != null : !MASTER_CONNECTION_URI_EDEFAULT.equals ( masterConnectionUri );
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
            return super.toString ();

        StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (masterConnectionUri: " );
        result.append ( masterConnectionUri );
        result.append ( ')' );
        return result.toString ();
    }

} //ConfigurationSlotImpl

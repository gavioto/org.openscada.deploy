/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.network.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configurator.ConfiguratorModule;
import org.openscada.configuration.model.impl.ModuleImpl;

import org.openscada.configurator.module.common.network.NetworkModule;
import org.openscada.configurator.module.common.network.NetworkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.network.impl.NetworkModuleImpl#getNetworkFile <em>Network File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkModuleImpl extends EObjectImpl implements NetworkModule
{
    /**
     * The default value of the '{@link #getNetworkFile() <em>Network File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNetworkFile()
     * @generated
     * @ordered
     */
    protected static final String NETWORK_FILE_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getNetworkFile() <em>Network File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNetworkFile()
     * @generated
     * @ordered
     */
    protected String networkFile = NETWORK_FILE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NetworkModuleImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return NetworkPackage.Literals.NETWORK_MODULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNetworkFile ()
    {
        return networkFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNetworkFile ( String newNetworkFile )
    {
        String oldNetworkFile = networkFile;
        networkFile = newNetworkFile;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, NetworkPackage.NETWORK_MODULE__NETWORK_FILE, oldNetworkFile, networkFile ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfiguratorModule createModule ()
    {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException ();
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                return getNetworkFile ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                setNetworkFile ( (String)newValue );
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                setNetworkFile ( NETWORK_FILE_EDEFAULT );
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                return NETWORK_FILE_EDEFAULT == null ? networkFile != null : !NETWORK_FILE_EDEFAULT.equals ( networkFile );
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
            return super.toString ();

        StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (networkFile: " );
        result.append ( networkFile );
        result.append ( ')' );
        return result.toString ();
    }

} //NetworkModuleImpl

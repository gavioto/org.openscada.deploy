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
import org.openscada.configuration.model.Project;
import org.openscada.configurator.module.common.network.NetworkModule;
import org.openscada.configurator.module.common.network.NetworkPackage;
import org.openscada.configurator.module.common.network.handler.Application;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openscada.configurator.module.common.network.impl.NetworkModuleImpl#getNetworkFile <em>Network File</em>}</li>
 * <li>{@link org.openscada.configurator.module.common.network.impl.NetworkModuleImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class NetworkModuleImpl extends EObjectImpl implements NetworkModule
{
    /**
     * The default value of the '{@link #getNetworkFile() <em>Network File</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNetworkFile()
     * @generated
     * @ordered
     */
    protected static final String NETWORK_FILE_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getNetworkFile() <em>Network File</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNetworkFile()
     * @generated
     * @ordered
     */
    protected String networkFile = NETWORK_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NetworkModuleImpl ()
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
        return NetworkPackage.Literals.NETWORK_MODULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getNetworkFile ()
    {
        return this.networkFile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNetworkFile ( final String newNetworkFile )
    {
        final String oldNetworkFile = this.networkFile;
        this.networkFile = newNetworkFile;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, NetworkPackage.NETWORK_MODULE__NETWORK_FILE, oldNetworkFile, this.networkFile ) );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getPrefix ()
    {
        return this.prefix;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPrefix ( final String newPrefix )
    {
        final String oldPrefix = this.prefix;
        this.prefix = newPrefix;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, NetworkPackage.NETWORK_MODULE__PREFIX, oldPrefix, this.prefix ) );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Project project )
    {
        Application.process ( project, this );
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                return getNetworkFile ();
            case NetworkPackage.NETWORK_MODULE__PREFIX:
                return getPrefix ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet ( final int featureID, final Object newValue )
    {
        switch ( featureID )
        {
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                setNetworkFile ( (String)newValue );
                return;
            case NetworkPackage.NETWORK_MODULE__PREFIX:
                setPrefix ( (String)newValue );
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                setNetworkFile ( NETWORK_FILE_EDEFAULT );
                return;
            case NetworkPackage.NETWORK_MODULE__PREFIX:
                setPrefix ( PREFIX_EDEFAULT );
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                return NETWORK_FILE_EDEFAULT == null ? this.networkFile != null : !NETWORK_FILE_EDEFAULT.equals ( this.networkFile );
            case NetworkPackage.NETWORK_MODULE__PREFIX:
                return PREFIX_EDEFAULT == null ? this.prefix != null : !PREFIX_EDEFAULT.equals ( this.prefix );
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
        result.append ( " (networkFile: " );
        result.append ( this.networkFile );
        result.append ( ", prefix: " );
        result.append ( this.prefix );
        result.append ( ')' );
        return result.toString ();
    }

} //NetworkModuleImpl

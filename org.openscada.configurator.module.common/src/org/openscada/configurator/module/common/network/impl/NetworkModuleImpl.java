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
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.network.NetworkModule;
import org.openscada.configurator.module.common.network.NetworkPackage;
import org.openscada.configurator.module.common.network.handler.Application;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.network.impl.NetworkModuleImpl#getNetworkFile <em>Network File</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.network.impl.NetworkModuleImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.network.impl.NetworkModuleImpl#getOverrideGeneratedFile <em>Override Generated File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkModuleImpl extends EObjectImpl implements NetworkModule
{
    /**
     * The default value of the '{@link #getNetworkFile() <em>Network File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getNetworkFile()
     * @generated
     * @ordered
     */
    protected static final String NETWORK_FILE_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getNetworkFile() <em>Network File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getNetworkFile()
     * @generated
     * @ordered
     */
    protected String networkFile = NETWORK_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * The default value of the '{@link #getOverrideGeneratedFile() <em>Override Generated File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOverrideGeneratedFile()
     * @generated
     * @ordered
     */
    protected static final String OVERRIDE_GENERATED_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOverrideGeneratedFile() <em>Override Generated File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOverrideGeneratedFile()
     * @generated
     * @ordered
     */
    protected String overrideGeneratedFile = OVERRIDE_GENERATED_FILE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected NetworkModuleImpl ()
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
        return NetworkPackage.Literals.NETWORK_MODULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNetworkFile ()
    {
        return networkFile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNetworkFile ( String newNetworkFile )
    {
        String oldNetworkFile = networkFile;
        networkFile = newNetworkFile;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, NetworkPackage.NETWORK_MODULE__NETWORK_FILE, oldNetworkFile, networkFile ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPrefix ()
    {
        return prefix;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrefix ( String newPrefix )
    {
        String oldPrefix = prefix;
        prefix = newPrefix;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, NetworkPackage.NETWORK_MODULE__PREFIX, oldPrefix, prefix ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOverrideGeneratedFile ()
    {
        return overrideGeneratedFile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOverrideGeneratedFile ( String newOverrideGeneratedFile )
    {
        String oldOverrideGeneratedFile = overrideGeneratedFile;
        overrideGeneratedFile = newOverrideGeneratedFile;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, NetworkPackage.NETWORK_MODULE__OVERRIDE_GENERATED_FILE, oldOverrideGeneratedFile, overrideGeneratedFile ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Configuration cfg, final Project project )
    {
        Application.process ( project, this );
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                return getNetworkFile ();
            case NetworkPackage.NETWORK_MODULE__PREFIX:
                return getPrefix ();
            case NetworkPackage.NETWORK_MODULE__OVERRIDE_GENERATED_FILE:
                return getOverrideGeneratedFile ();
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                setNetworkFile ( (String)newValue );
                return;
            case NetworkPackage.NETWORK_MODULE__PREFIX:
                setPrefix ( (String)newValue );
                return;
            case NetworkPackage.NETWORK_MODULE__OVERRIDE_GENERATED_FILE:
                setOverrideGeneratedFile ( (String)newValue );
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                setNetworkFile ( NETWORK_FILE_EDEFAULT );
                return;
            case NetworkPackage.NETWORK_MODULE__PREFIX:
                setPrefix ( PREFIX_EDEFAULT );
                return;
            case NetworkPackage.NETWORK_MODULE__OVERRIDE_GENERATED_FILE:
                setOverrideGeneratedFile ( OVERRIDE_GENERATED_FILE_EDEFAULT );
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
            case NetworkPackage.NETWORK_MODULE__NETWORK_FILE:
                return NETWORK_FILE_EDEFAULT == null ? networkFile != null : !NETWORK_FILE_EDEFAULT.equals ( networkFile );
            case NetworkPackage.NETWORK_MODULE__PREFIX:
                return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals ( prefix );
            case NetworkPackage.NETWORK_MODULE__OVERRIDE_GENERATED_FILE:
                return OVERRIDE_GENERATED_FILE_EDEFAULT == null ? overrideGeneratedFile != null : !OVERRIDE_GENERATED_FILE_EDEFAULT.equals ( overrideGeneratedFile );
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
        result.append ( " (networkFile: " );
        result.append ( networkFile );
        result.append ( ", prefix: " );
        result.append ( prefix );
        result.append ( ", overrideGeneratedFile: " );
        result.append ( overrideGeneratedFile );
        result.append ( ')' );
        return result.toString ();
    }

} //NetworkModuleImpl

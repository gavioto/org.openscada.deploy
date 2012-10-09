/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.Site;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.SiteImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.SiteImpl#getConnectionDa <em>Connection Da</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.SiteImpl#getConnectionAe <em>Connection Ae</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.SiteImpl#getSiteOutputDir <em>Site Output Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiteImpl extends EObjectImpl implements Site
{
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getConnectionDa() <em>Connection Da</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionDa()
     * @generated
     * @ordered
     */
    protected static final String CONNECTION_DA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectionDa() <em>Connection Da</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionDa()
     * @generated
     * @ordered
     */
    protected String connectionDa = CONNECTION_DA_EDEFAULT;

    /**
     * The default value of the '{@link #getConnectionAe() <em>Connection Ae</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionAe()
     * @generated
     * @ordered
     */
    protected static final String CONNECTION_AE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectionAe() <em>Connection Ae</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionAe()
     * @generated
     * @ordered
     */
    protected String connectionAe = CONNECTION_AE_EDEFAULT;

    /**
     * The default value of the '{@link #getSiteOutputDir() <em>Site Output Dir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSiteOutputDir()
     * @generated
     * @ordered
     */
    protected static final String SITE_OUTPUT_DIR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSiteOutputDir() <em>Site Output Dir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSiteOutputDir()
     * @generated
     * @ordered
     */
    protected String siteOutputDir = SITE_OUTPUT_DIR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SiteImpl ()
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
        return GlobalPackage.Literals.SITE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId ()
    {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId ( String newId )
    {
        String oldId = id;
        id = newId;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.SITE__ID, oldId, id ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConnectionDa ()
    {
        return connectionDa;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionDa ( String newConnectionDa )
    {
        String oldConnectionDa = connectionDa;
        connectionDa = newConnectionDa;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.SITE__CONNECTION_DA, oldConnectionDa, connectionDa ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConnectionAe ()
    {
        return connectionAe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionAe ( String newConnectionAe )
    {
        String oldConnectionAe = connectionAe;
        connectionAe = newConnectionAe;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.SITE__CONNECTION_AE, oldConnectionAe, connectionAe ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSiteOutputDir ()
    {
        return siteOutputDir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSiteOutputDir ( String newSiteOutputDir )
    {
        String oldSiteOutputDir = siteOutputDir;
        siteOutputDir = newSiteOutputDir;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.SITE__SITE_OUTPUT_DIR, oldSiteOutputDir, siteOutputDir ) );
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
            case GlobalPackage.SITE__ID:
                return getId ();
            case GlobalPackage.SITE__CONNECTION_DA:
                return getConnectionDa ();
            case GlobalPackage.SITE__CONNECTION_AE:
                return getConnectionAe ();
            case GlobalPackage.SITE__SITE_OUTPUT_DIR:
                return getSiteOutputDir ();
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
            case GlobalPackage.SITE__ID:
                setId ( (String)newValue );
                return;
            case GlobalPackage.SITE__CONNECTION_DA:
                setConnectionDa ( (String)newValue );
                return;
            case GlobalPackage.SITE__CONNECTION_AE:
                setConnectionAe ( (String)newValue );
                return;
            case GlobalPackage.SITE__SITE_OUTPUT_DIR:
                setSiteOutputDir ( (String)newValue );
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
            case GlobalPackage.SITE__ID:
                setId ( ID_EDEFAULT );
                return;
            case GlobalPackage.SITE__CONNECTION_DA:
                setConnectionDa ( CONNECTION_DA_EDEFAULT );
                return;
            case GlobalPackage.SITE__CONNECTION_AE:
                setConnectionAe ( CONNECTION_AE_EDEFAULT );
                return;
            case GlobalPackage.SITE__SITE_OUTPUT_DIR:
                setSiteOutputDir ( SITE_OUTPUT_DIR_EDEFAULT );
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
            case GlobalPackage.SITE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals ( id );
            case GlobalPackage.SITE__CONNECTION_DA:
                return CONNECTION_DA_EDEFAULT == null ? connectionDa != null : !CONNECTION_DA_EDEFAULT.equals ( connectionDa );
            case GlobalPackage.SITE__CONNECTION_AE:
                return CONNECTION_AE_EDEFAULT == null ? connectionAe != null : !CONNECTION_AE_EDEFAULT.equals ( connectionAe );
            case GlobalPackage.SITE__SITE_OUTPUT_DIR:
                return SITE_OUTPUT_DIR_EDEFAULT == null ? siteOutputDir != null : !SITE_OUTPUT_DIR_EDEFAULT.equals ( siteOutputDir );
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
        result.append ( " (id: " );
        result.append ( id );
        result.append ( ", connectionDa: " );
        result.append ( connectionDa );
        result.append ( ", connectionAe: " );
        result.append ( connectionAe );
        result.append ( ", siteOutputDir: " );
        result.append ( siteOutputDir );
        result.append ( ')' );
        return result.toString ();
    }

} //SiteImpl

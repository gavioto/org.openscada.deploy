/**
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2013 Jens Reimann (ctron@dentrassi.de)
 * 
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 * 
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 * 
 */
package org.openscada.configurator.sec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openscada.configurator.sec.CA;
import org.openscada.configurator.sec.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.impl.CAImpl#getCertificateUrl <em>Certificate Url</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.impl.CAImpl#getCrlUrl <em>Crl Url</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.impl.CAImpl#getReloadDelay <em>Reload Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CAImpl extends EObjectImpl implements CA
{
    /**
     * The default value of the '{@link #getCertificateUrl() <em>Certificate Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCertificateUrl()
     * @generated
     * @ordered
     */
    protected static final String CERTIFICATE_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCertificateUrl() <em>Certificate Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCertificateUrl()
     * @generated
     * @ordered
     */
    protected String certificateUrl = CERTIFICATE_URL_EDEFAULT;

    /**
     * The cached value of the '{@link #getCrlUrl() <em>Crl Url</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrlUrl()
     * @generated
     * @ordered
     */
    protected EList<String> crlUrl;

    /**
     * The default value of the '{@link #getReloadDelay() <em>Reload Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReloadDelay()
     * @generated
     * @ordered
     */
    protected static final int RELOAD_DELAY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getReloadDelay() <em>Reload Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReloadDelay()
     * @generated
     * @ordered
     */
    protected int reloadDelay = RELOAD_DELAY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CAImpl ()
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
        return SecurityPackage.Literals.CA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCertificateUrl ()
    {
        return certificateUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCertificateUrl ( String newCertificateUrl )
    {
        String oldCertificateUrl = certificateUrl;
        certificateUrl = newCertificateUrl;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.CA__CERTIFICATE_URL, oldCertificateUrl, certificateUrl ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getCrlUrl ()
    {
        if ( crlUrl == null )
        {
            crlUrl = new EDataTypeUniqueEList<String> ( String.class, this, SecurityPackage.CA__CRL_URL );
        }
        return crlUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReloadDelay ()
    {
        return reloadDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReloadDelay ( int newReloadDelay )
    {
        int oldReloadDelay = reloadDelay;
        reloadDelay = newReloadDelay;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.CA__RELOAD_DELAY, oldReloadDelay, reloadDelay ) );
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
            case SecurityPackage.CA__CERTIFICATE_URL:
                return getCertificateUrl ();
            case SecurityPackage.CA__CRL_URL:
                return getCrlUrl ();
            case SecurityPackage.CA__RELOAD_DELAY:
                return getReloadDelay ();
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
            case SecurityPackage.CA__CERTIFICATE_URL:
                setCertificateUrl ( (String)newValue );
                return;
            case SecurityPackage.CA__CRL_URL:
                getCrlUrl ().clear ();
                getCrlUrl ().addAll ( (Collection<? extends String>)newValue );
                return;
            case SecurityPackage.CA__RELOAD_DELAY:
                setReloadDelay ( (Integer)newValue );
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
            case SecurityPackage.CA__CERTIFICATE_URL:
                setCertificateUrl ( CERTIFICATE_URL_EDEFAULT );
                return;
            case SecurityPackage.CA__CRL_URL:
                getCrlUrl ().clear ();
                return;
            case SecurityPackage.CA__RELOAD_DELAY:
                setReloadDelay ( RELOAD_DELAY_EDEFAULT );
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
            case SecurityPackage.CA__CERTIFICATE_URL:
                return CERTIFICATE_URL_EDEFAULT == null ? certificateUrl != null : !CERTIFICATE_URL_EDEFAULT.equals ( certificateUrl );
            case SecurityPackage.CA__CRL_URL:
                return crlUrl != null && !crlUrl.isEmpty ();
            case SecurityPackage.CA__RELOAD_DELAY:
                return reloadDelay != RELOAD_DELAY_EDEFAULT;
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
        result.append ( " (certificateUrl: " );
        result.append ( certificateUrl );
        result.append ( ", crlUrl: " );
        result.append ( crlUrl );
        result.append ( ", reloadDelay: " );
        result.append ( reloadDelay );
        result.append ( ')' );
        return result.toString ();
    }

} //CAImpl

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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.configurator.sec.CA;
import org.openscada.configurator.sec.SecurityPackage;
import org.openscada.configurator.sec.SignatureRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.impl.SignatureRuleImpl#getTrustedCertificationAuthority <em>Trusted Certification Authority</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.impl.SignatureRuleImpl#isIndentXml <em>Indent Xml</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureRuleImpl extends PreFilterRuleImpl implements SignatureRule
{
    /**
     * The cached value of the '{@link #getTrustedCertificationAuthority() <em>Trusted Certification Authority</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrustedCertificationAuthority()
     * @generated
     * @ordered
     */
    protected EList<CA> trustedCertificationAuthority;

    /**
     * The default value of the '{@link #isIndentXml() <em>Indent Xml</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIndentXml()
     * @generated
     * @ordered
     */
    protected static final boolean INDENT_XML_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIndentXml() <em>Indent Xml</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIndentXml()
     * @generated
     * @ordered
     */
    protected boolean indentXml = INDENT_XML_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SignatureRuleImpl ()
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
        return SecurityPackage.Literals.SIGNATURE_RULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CA> getTrustedCertificationAuthority ()
    {
        if ( trustedCertificationAuthority == null )
        {
            trustedCertificationAuthority = new EObjectContainmentEList.Resolving<CA> ( CA.class, this, SecurityPackage.SIGNATURE_RULE__TRUSTED_CERTIFICATION_AUTHORITY );
        }
        return trustedCertificationAuthority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIndentXml ()
    {
        return indentXml;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIndentXml ( boolean newIndentXml )
    {
        boolean oldIndentXml = indentXml;
        indentXml = newIndentXml;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.SIGNATURE_RULE__INDENT_XML, oldIndentXml, indentXml ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( InternalEObject otherEnd, int featureID, NotificationChain msgs )
    {
        switch ( featureID )
        {
            case SecurityPackage.SIGNATURE_RULE__TRUSTED_CERTIFICATION_AUTHORITY:
                return ( (InternalEList<?>)getTrustedCertificationAuthority () ).basicRemove ( otherEnd, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
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
            case SecurityPackage.SIGNATURE_RULE__TRUSTED_CERTIFICATION_AUTHORITY:
                return getTrustedCertificationAuthority ();
            case SecurityPackage.SIGNATURE_RULE__INDENT_XML:
                return isIndentXml ();
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
            case SecurityPackage.SIGNATURE_RULE__TRUSTED_CERTIFICATION_AUTHORITY:
                getTrustedCertificationAuthority ().clear ();
                getTrustedCertificationAuthority ().addAll ( (Collection<? extends CA>)newValue );
                return;
            case SecurityPackage.SIGNATURE_RULE__INDENT_XML:
                setIndentXml ( (Boolean)newValue );
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
            case SecurityPackage.SIGNATURE_RULE__TRUSTED_CERTIFICATION_AUTHORITY:
                getTrustedCertificationAuthority ().clear ();
                return;
            case SecurityPackage.SIGNATURE_RULE__INDENT_XML:
                setIndentXml ( INDENT_XML_EDEFAULT );
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
            case SecurityPackage.SIGNATURE_RULE__TRUSTED_CERTIFICATION_AUTHORITY:
                return trustedCertificationAuthority != null && !trustedCertificationAuthority.isEmpty ();
            case SecurityPackage.SIGNATURE_RULE__INDENT_XML:
                return indentXml != INDENT_XML_EDEFAULT;
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
        result.append ( " (indentXml: " );
        result.append ( indentXml );
        result.append ( ')' );
        return result.toString ();
    }

    @Override
    public String getRuleType ()
    {
        return "signature";
    }

} //SignatureRuleImpl

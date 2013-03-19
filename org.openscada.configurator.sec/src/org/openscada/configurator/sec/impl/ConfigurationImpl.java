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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configurator.sec.Configuration;
import org.openscada.configurator.sec.Rules;
import org.openscada.configurator.sec.Scripts;
import org.openscada.configurator.sec.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.impl.ConfigurationImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.impl.ConfigurationImpl#getScripts <em>Scripts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration
{
    /**
     * The cached value of the '{@link #getRules() <em>Rules</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRules()
     * @generated
     * @ordered
     */
    protected Rules rules;

    /**
     * The cached value of the '{@link #getScripts() <em>Scripts</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScripts()
     * @generated
     * @ordered
     */
    protected Scripts scripts;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigurationImpl ()
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
        return SecurityPackage.Literals.CONFIGURATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rules getRules ()
    {
        if ( rules != null && rules.eIsProxy () )
        {
            InternalEObject oldRules = (InternalEObject)rules;
            rules = (Rules)eResolveProxy ( oldRules );
            if ( rules != oldRules )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, SecurityPackage.CONFIGURATION__RULES, oldRules, rules ) );
            }
        }
        return rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rules basicGetRules ()
    {
        return rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRules ( Rules newRules )
    {
        Rules oldRules = rules;
        rules = newRules;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.CONFIGURATION__RULES, oldRules, rules ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scripts getScripts ()
    {
        if ( scripts != null && scripts.eIsProxy () )
        {
            InternalEObject oldScripts = (InternalEObject)scripts;
            scripts = (Scripts)eResolveProxy ( oldScripts );
            if ( scripts != oldScripts )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, SecurityPackage.CONFIGURATION__SCRIPTS, oldScripts, scripts ) );
            }
        }
        return scripts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scripts basicGetScripts ()
    {
        return scripts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScripts ( Scripts newScripts )
    {
        Scripts oldScripts = scripts;
        scripts = newScripts;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.CONFIGURATION__SCRIPTS, oldScripts, scripts ) );
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
            case SecurityPackage.CONFIGURATION__RULES:
                if ( resolve )
                    return getRules ();
                return basicGetRules ();
            case SecurityPackage.CONFIGURATION__SCRIPTS:
                if ( resolve )
                    return getScripts ();
                return basicGetScripts ();
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
            case SecurityPackage.CONFIGURATION__RULES:
                setRules ( (Rules)newValue );
                return;
            case SecurityPackage.CONFIGURATION__SCRIPTS:
                setScripts ( (Scripts)newValue );
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
            case SecurityPackage.CONFIGURATION__RULES:
                setRules ( (Rules)null );
                return;
            case SecurityPackage.CONFIGURATION__SCRIPTS:
                setScripts ( (Scripts)null );
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
            case SecurityPackage.CONFIGURATION__RULES:
                return rules != null;
            case SecurityPackage.CONFIGURATION__SCRIPTS:
                return scripts != null;
        }
        return super.eIsSet ( featureID );
    }

} //ConfigurationImpl

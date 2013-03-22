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
import org.openscada.configurator.sec.LogonRule;
import org.openscada.configurator.sec.Script;
import org.openscada.configurator.sec.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logon Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.impl.LogonRuleImpl#getPostProcessor <em>Post Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogonRuleImpl extends RuleImpl implements LogonRule
{
    /**
     * The cached value of the '{@link #getPostProcessor() <em>Post Processor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostProcessor()
     * @generated
     * @ordered
     */
    protected Script postProcessor;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LogonRuleImpl ()
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
        return SecurityPackage.Literals.LOGON_RULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getPostProcessor ()
    {
        if ( postProcessor != null && postProcessor.eIsProxy () )
        {
            InternalEObject oldPostProcessor = (InternalEObject)postProcessor;
            postProcessor = (Script)eResolveProxy ( oldPostProcessor );
            if ( postProcessor != oldPostProcessor )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, SecurityPackage.LOGON_RULE__POST_PROCESSOR, oldPostProcessor, postProcessor ) );
            }
        }
        return postProcessor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script basicGetPostProcessor ()
    {
        return postProcessor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPostProcessor ( Script newPostProcessor )
    {
        Script oldPostProcessor = postProcessor;
        postProcessor = newPostProcessor;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.LOGON_RULE__POST_PROCESSOR, oldPostProcessor, postProcessor ) );
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
            case SecurityPackage.LOGON_RULE__POST_PROCESSOR:
                if ( resolve )
                    return getPostProcessor ();
                return basicGetPostProcessor ();
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
            case SecurityPackage.LOGON_RULE__POST_PROCESSOR:
                setPostProcessor ( (Script)newValue );
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
            case SecurityPackage.LOGON_RULE__POST_PROCESSOR:
                setPostProcessor ( (Script)null );
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
            case SecurityPackage.LOGON_RULE__POST_PROCESSOR:
                return postProcessor != null;
        }
        return super.eIsSet ( featureID );
    }

    @Override
    public String getRuleType ()
    {
        return "logon";
    }

} //LogonRuleImpl

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
import org.openscada.configurator.sec.Script;
import org.openscada.configurator.sec.ScriptRule;
import org.openscada.configurator.sec.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.impl.ScriptRuleImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.impl.ScriptRuleImpl#getCallbackScript <em>Callback Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptRuleImpl extends PreFilterRuleImpl implements ScriptRule
{
    /**
     * The cached value of the '{@link #getScript() <em>Script</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScript()
     * @generated
     * @ordered
     */
    protected Script script;

    /**
     * The cached value of the '{@link #getCallbackScript() <em>Callback Script</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallbackScript()
     * @generated
     * @ordered
     */
    protected Script callbackScript;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScriptRuleImpl ()
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
        return SecurityPackage.Literals.SCRIPT_RULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Script getScript ()
    {
        if ( script != null && script.eIsProxy () )
        {
            InternalEObject oldScript = (InternalEObject)script;
            script = (Script)eResolveProxy ( oldScript );
            if ( script != oldScript )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, SecurityPackage.SCRIPT_RULE__SCRIPT, oldScript, script ) );
            }
        }
        return script;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script basicGetScript ()
    {
        return script;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScript ( Script newScript )
    {
        Script oldScript = script;
        script = newScript;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.SCRIPT_RULE__SCRIPT, oldScript, script ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Script getCallbackScript ()
    {
        if ( callbackScript != null && callbackScript.eIsProxy () )
        {
            InternalEObject oldCallbackScript = (InternalEObject)callbackScript;
            callbackScript = (Script)eResolveProxy ( oldCallbackScript );
            if ( callbackScript != oldCallbackScript )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, SecurityPackage.SCRIPT_RULE__CALLBACK_SCRIPT, oldCallbackScript, callbackScript ) );
            }
        }
        return callbackScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script basicGetCallbackScript ()
    {
        return callbackScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCallbackScript ( Script newCallbackScript )
    {
        Script oldCallbackScript = callbackScript;
        callbackScript = newCallbackScript;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.SCRIPT_RULE__CALLBACK_SCRIPT, oldCallbackScript, callbackScript ) );
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
            case SecurityPackage.SCRIPT_RULE__SCRIPT:
                if ( resolve )
                    return getScript ();
                return basicGetScript ();
            case SecurityPackage.SCRIPT_RULE__CALLBACK_SCRIPT:
                if ( resolve )
                    return getCallbackScript ();
                return basicGetCallbackScript ();
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
            case SecurityPackage.SCRIPT_RULE__SCRIPT:
                setScript ( (Script)newValue );
                return;
            case SecurityPackage.SCRIPT_RULE__CALLBACK_SCRIPT:
                setCallbackScript ( (Script)newValue );
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
            case SecurityPackage.SCRIPT_RULE__SCRIPT:
                setScript ( (Script)null );
                return;
            case SecurityPackage.SCRIPT_RULE__CALLBACK_SCRIPT:
                setCallbackScript ( (Script)null );
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
            case SecurityPackage.SCRIPT_RULE__SCRIPT:
                return script != null;
            case SecurityPackage.SCRIPT_RULE__CALLBACK_SCRIPT:
                return callbackScript != null;
        }
        return super.eIsSet ( featureID );
    }

    @Override
    public String getRuleType ()
    {
        return "script";
    }

} //ScriptRuleImpl

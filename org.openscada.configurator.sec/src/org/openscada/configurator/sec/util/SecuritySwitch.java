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
package org.openscada.configurator.sec.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openscada.configurator.sec.CA;
import org.openscada.configurator.sec.Configuration;
import org.openscada.configurator.sec.GenericScript;
import org.openscada.configurator.sec.JavaScript;
import org.openscada.configurator.sec.LogonRule;
import org.openscada.configurator.sec.PreFilterRule;
import org.openscada.configurator.sec.Rule;
import org.openscada.configurator.sec.Rules;
import org.openscada.configurator.sec.Script;
import org.openscada.configurator.sec.ScriptRule;
import org.openscada.configurator.sec.SecurityPackage;
import org.openscada.configurator.sec.SignatureRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.sec.SecurityPackage
 * @generated
 */
public class SecuritySwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SecurityPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecuritySwitch ()
    {
        if ( modelPackage == null )
        {
            modelPackage = SecurityPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor ( EPackage ePackage )
    {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch ( int classifierID, EObject theEObject )
    {
        switch ( classifierID )
        {
            case SecurityPackage.RULE:
            {
                Rule rule = (Rule)theEObject;
                T result = caseRule ( rule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.SCRIPT_RULE:
            {
                ScriptRule scriptRule = (ScriptRule)theEObject;
                T result = caseScriptRule ( scriptRule );
                if ( result == null )
                    result = casePreFilterRule ( scriptRule );
                if ( result == null )
                    result = caseRule ( scriptRule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.LOGON_RULE:
            {
                LogonRule logonRule = (LogonRule)theEObject;
                T result = caseLogonRule ( logonRule );
                if ( result == null )
                    result = casePreFilterRule ( logonRule );
                if ( result == null )
                    result = caseRule ( logonRule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.SIGNATURE_RULE:
            {
                SignatureRule signatureRule = (SignatureRule)theEObject;
                T result = caseSignatureRule ( signatureRule );
                if ( result == null )
                    result = casePreFilterRule ( signatureRule );
                if ( result == null )
                    result = caseRule ( signatureRule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.PRE_FILTER_RULE:
            {
                PreFilterRule preFilterRule = (PreFilterRule)theEObject;
                T result = casePreFilterRule ( preFilterRule );
                if ( result == null )
                    result = caseRule ( preFilterRule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.SCRIPT:
            {
                Script script = (Script)theEObject;
                T result = caseScript ( script );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.JAVA_SCRIPT:
            {
                JavaScript javaScript = (JavaScript)theEObject;
                T result = caseJavaScript ( javaScript );
                if ( result == null )
                    result = caseScript ( javaScript );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.GENERIC_SCRIPT:
            {
                GenericScript genericScript = (GenericScript)theEObject;
                T result = caseGenericScript ( genericScript );
                if ( result == null )
                    result = caseScript ( genericScript );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.CONFIGURATION:
            {
                Configuration configuration = (Configuration)theEObject;
                T result = caseConfiguration ( configuration );
                if ( result == null )
                    result = caseRules ( configuration );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.RULES:
            {
                Rules rules = (Rules)theEObject;
                T result = caseRules ( rules );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.CA:
            {
                CA ca = (CA)theEObject;
                T result = caseCA ( ca );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRule ( Rule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScriptRule ( ScriptRule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Logon Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Logon Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogonRule ( LogonRule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Signature Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Signature Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSignatureRule ( SignatureRule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pre Filter Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pre Filter Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePreFilterRule ( PreFilterRule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScript ( Script object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Java Script</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Script</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavaScript ( JavaScript object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic Script</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic Script</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericScript ( GenericScript object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfiguration ( Configuration object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rules</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rules</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRules ( Rules object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CA</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CA</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCA ( CA object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase ( EObject object )
    {
        return null;
    }

} //SecuritySwitch

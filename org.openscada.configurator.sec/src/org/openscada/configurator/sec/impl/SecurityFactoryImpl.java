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

import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configurator.sec.Configuration;
import org.openscada.configurator.sec.GenericScript;
import org.openscada.configurator.sec.JavaScript;
import org.openscada.configurator.sec.LogonRule;
import org.openscada.configurator.sec.Rules;
import org.openscada.configurator.sec.ScriptRule;
import org.openscada.configurator.sec.Scripts;
import org.openscada.configurator.sec.SecurityFactory;
import org.openscada.configurator.sec.SecurityPackage;
import org.openscada.configurator.sec.SignatureRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityFactoryImpl extends EFactoryImpl implements SecurityFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SecurityFactory init ()
    {
        try
        {
            SecurityFactory theSecurityFactory = (SecurityFactory)EPackage.Registry.INSTANCE.getEFactory ( "urn:openscada:configurator:sec" );
            if ( theSecurityFactory != null )
            {
                return theSecurityFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new SecurityFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecurityFactoryImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create ( EClass eClass )
    {
        switch ( eClass.getClassifierID () )
        {
            case SecurityPackage.SCRIPT_RULE:
                return createScriptRule ();
            case SecurityPackage.LOGON_RULE:
                return createLogonRule ();
            case SecurityPackage.SIGNATURE_RULE:
                return createSignatureRule ();
            case SecurityPackage.JAVA_SCRIPT:
                return createJavaScript ();
            case SecurityPackage.GENERIC_SCRIPT:
                return createGenericScript ();
            case SecurityPackage.RULES:
                return createRules ();
            case SecurityPackage.SCRIPTS:
                return createScripts ();
            case SecurityPackage.CONFIGURATION:
                return createConfiguration ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString ( EDataType eDataType, String initialValue )
    {
        switch ( eDataType.getClassifierID () )
        {
            case SecurityPackage.PATTERN:
                return createPatternFromString ( eDataType, initialValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString ( EDataType eDataType, Object instanceValue )
    {
        switch ( eDataType.getClassifierID () )
        {
            case SecurityPackage.PATTERN:
                return convertPatternToString ( eDataType, instanceValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScriptRule createScriptRule ()
    {
        ScriptRuleImpl scriptRule = new ScriptRuleImpl ();
        return scriptRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LogonRule createLogonRule ()
    {
        LogonRuleImpl logonRule = new LogonRuleImpl ();
        return logonRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SignatureRule createSignatureRule ()
    {
        SignatureRuleImpl signatureRule = new SignatureRuleImpl ();
        return signatureRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaScript createJavaScript ()
    {
        JavaScriptImpl javaScript = new JavaScriptImpl ();
        return javaScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericScript createGenericScript ()
    {
        GenericScriptImpl genericScript = new GenericScriptImpl ();
        return genericScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rules createRules ()
    {
        RulesImpl rules = new RulesImpl ();
        return rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scripts createScripts ()
    {
        ScriptsImpl scripts = new ScriptsImpl ();
        return scripts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Configuration createConfiguration ()
    {
        ConfigurationImpl configuration = new ConfigurationImpl ();
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Pattern createPatternFromString ( final EDataType eDataType, final String initialValue )
    {
        return Pattern.compile ( initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPatternToString ( EDataType eDataType, Object instanceValue )
    {
        return super.convertToString ( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SecurityPackage getSecurityPackage ()
    {
        return (SecurityPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SecurityPackage getPackage ()
    {
        return SecurityPackage.eINSTANCE;
    }

} //SecurityFactoryImpl

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.configurator.sec.Configuration;
import org.openscada.configurator.sec.GenericScript;
import org.openscada.configurator.sec.JavaScript;
import org.openscada.configurator.sec.LogonRule;
import org.openscada.configurator.sec.PreFilterRule;
import org.openscada.configurator.sec.Rule;
import org.openscada.configurator.sec.Rules;
import org.openscada.configurator.sec.Script;
import org.openscada.configurator.sec.ScriptRule;
import org.openscada.configurator.sec.SecurityFactory;
import org.openscada.configurator.sec.SecurityPackage;
import org.openscada.configurator.sec.SignatureRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptRuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass logonRuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass signatureRuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass preFilterRuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass javaScriptEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genericScriptEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass configurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rulesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass caEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType patternEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.openscada.configurator.sec.SecurityPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SecurityPackageImpl ()
    {
        super ( eNS_URI, SecurityFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SecurityPackage init ()
    {
        if ( isInited )
            return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage ( SecurityPackage.eNS_URI );

        // Obtain or create and register package
        SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new SecurityPackageImpl () );

        isInited = true;

        // Create package meta-data objects
        theSecurityPackage.createPackageContents ();

        // Initialize created meta-data
        theSecurityPackage.initializePackageContents ();

        // Mark meta-data to indicate it can't be changed
        theSecurityPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( SecurityPackage.eNS_URI, theSecurityPackage );
        return theSecurityPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRule ()
    {
        return ruleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRule_Id ()
    {
        return (EAttribute)ruleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScriptRule ()
    {
        return scriptRuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getScriptRule_Script ()
    {
        return (EReference)scriptRuleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getScriptRule_CallbackScript ()
    {
        return (EReference)scriptRuleEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLogonRule ()
    {
        return logonRuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignatureRule ()
    {
        return signatureRuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignatureRule_TrustedCertificationAuthority ()
    {
        return (EReference)signatureRuleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignatureRule_IndentXml ()
    {
        return (EAttribute)signatureRuleEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPreFilterRule ()
    {
        return preFilterRuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPreFilterRule_IdFilter ()
    {
        return (EAttribute)preFilterRuleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPreFilterRule_TypeFilter ()
    {
        return (EAttribute)preFilterRuleEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPreFilterRule_ActionFilter ()
    {
        return (EAttribute)preFilterRuleEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScript ()
    {
        return scriptEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScript_Source ()
    {
        return (EAttribute)scriptEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJavaScript ()
    {
        return javaScriptEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenericScript ()
    {
        return genericScriptEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericScript_Type ()
    {
        return (EAttribute)genericScriptEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConfiguration ()
    {
        return configurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConfiguration_Scripts ()
    {
        return (EReference)configurationEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRules ()
    {
        return rulesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRules_Rules ()
    {
        return (EReference)rulesEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRules_Name ()
    {
        return (EAttribute)rulesEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCA ()
    {
        return caEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCA_CertificateUrl ()
    {
        return (EAttribute)caEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCA_CrlUrl ()
    {
        return (EAttribute)caEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCA_ReloadDelay ()
    {
        return (EAttribute)caEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPattern ()
    {
        return patternEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecurityFactory getSecurityFactory ()
    {
        return (SecurityFactory)getEFactoryInstance ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents ()
    {
        if ( isCreated )
            return;
        isCreated = true;

        // Create classes and their features
        ruleEClass = createEClass ( RULE );
        createEAttribute ( ruleEClass, RULE__ID );

        scriptRuleEClass = createEClass ( SCRIPT_RULE );
        createEReference ( scriptRuleEClass, SCRIPT_RULE__SCRIPT );
        createEReference ( scriptRuleEClass, SCRIPT_RULE__CALLBACK_SCRIPT );

        logonRuleEClass = createEClass ( LOGON_RULE );

        signatureRuleEClass = createEClass ( SIGNATURE_RULE );
        createEReference ( signatureRuleEClass, SIGNATURE_RULE__TRUSTED_CERTIFICATION_AUTHORITY );
        createEAttribute ( signatureRuleEClass, SIGNATURE_RULE__INDENT_XML );

        preFilterRuleEClass = createEClass ( PRE_FILTER_RULE );
        createEAttribute ( preFilterRuleEClass, PRE_FILTER_RULE__ID_FILTER );
        createEAttribute ( preFilterRuleEClass, PRE_FILTER_RULE__TYPE_FILTER );
        createEAttribute ( preFilterRuleEClass, PRE_FILTER_RULE__ACTION_FILTER );

        scriptEClass = createEClass ( SCRIPT );
        createEAttribute ( scriptEClass, SCRIPT__SOURCE );

        javaScriptEClass = createEClass ( JAVA_SCRIPT );

        genericScriptEClass = createEClass ( GENERIC_SCRIPT );
        createEAttribute ( genericScriptEClass, GENERIC_SCRIPT__TYPE );

        configurationEClass = createEClass ( CONFIGURATION );
        createEReference ( configurationEClass, CONFIGURATION__SCRIPTS );

        rulesEClass = createEClass ( RULES );
        createEReference ( rulesEClass, RULES__RULES );
        createEAttribute ( rulesEClass, RULES__NAME );

        caEClass = createEClass ( CA );
        createEAttribute ( caEClass, CA__CERTIFICATE_URL );
        createEAttribute ( caEClass, CA__CRL_URL );
        createEAttribute ( caEClass, CA__RELOAD_DELAY );

        // Create data types
        patternEDataType = createEDataType ( PATTERN );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents ()
    {
        if ( isInitialized )
            return;
        isInitialized = true;

        // Initialize package
        setName ( eNAME );
        setNsPrefix ( eNS_PREFIX );
        setNsURI ( eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        scriptRuleEClass.getESuperTypes ().add ( this.getPreFilterRule () );
        logonRuleEClass.getESuperTypes ().add ( this.getPreFilterRule () );
        signatureRuleEClass.getESuperTypes ().add ( this.getPreFilterRule () );
        preFilterRuleEClass.getESuperTypes ().add ( this.getRule () );
        javaScriptEClass.getESuperTypes ().add ( this.getScript () );
        genericScriptEClass.getESuperTypes ().add ( this.getScript () );
        configurationEClass.getESuperTypes ().add ( this.getRules () );

        // Initialize classes and features; add operations and parameters
        initEClass ( ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getRule_Id (), ecorePackage.getEString (), "id", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        addEOperation ( ruleEClass, ecorePackage.getEString (), "getRuleType", 1, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( scriptRuleEClass, ScriptRule.class, "ScriptRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getScriptRule_Script (), this.getScript (), null, "script", null, 0, 1, ScriptRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getScriptRule_CallbackScript (), this.getScript (), null, "callbackScript", null, 0, 1, ScriptRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( logonRuleEClass, LogonRule.class, "LogonRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( signatureRuleEClass, SignatureRule.class, "SignatureRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getSignatureRule_TrustedCertificationAuthority (), this.getCA (), null, "trustedCertificationAuthority", null, 0, -1, SignatureRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSignatureRule_IndentXml (), ecorePackage.getEBoolean (), "indentXml", "false", 1, 1, SignatureRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( preFilterRuleEClass, PreFilterRule.class, "PreFilterRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getPreFilterRule_IdFilter (), this.getPattern (), "idFilter", null, 0, 1, PreFilterRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getPreFilterRule_TypeFilter (), this.getPattern (), "typeFilter", null, 0, 1, PreFilterRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getPreFilterRule_ActionFilter (), this.getPattern (), "actionFilter", null, 0, 1, PreFilterRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( scriptEClass, Script.class, "Script", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getScript_Source (), ecorePackage.getEString (), "source", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        addEOperation ( scriptEClass, ecorePackage.getEString (), "getType", 1, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( javaScriptEClass, JavaScript.class, "JavaScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( genericScriptEClass, GenericScript.class, "GenericScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getGenericScript_Type (), ecorePackage.getEString (), "type", "JavaScript", 1, 1, GenericScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getConfiguration_Scripts (), this.getScript (), null, "scripts", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( rulesEClass, Rules.class, "Rules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getRules_Rules (), this.getRule (), null, "rules", null, 0, -1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getRules_Name (), ecorePackage.getEString (), "name", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( caEClass, org.openscada.configurator.sec.CA.class, "CA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getCA_CertificateUrl (), ecorePackage.getEString (), "certificateUrl", null, 1, 1, org.openscada.configurator.sec.CA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getCA_CrlUrl (), ecorePackage.getEString (), "crlUrl", null, 0, -1, org.openscada.configurator.sec.CA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getCA_ReloadDelay (), ecorePackage.getEInt (), "reloadDelay", null, 0, 1, org.openscada.configurator.sec.CA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        // Initialize data types
        initEDataType ( patternEDataType, Pattern.class, "Pattern", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );

        // Create resource
        createResource ( eNS_URI );
    }

} //SecurityPackageImpl

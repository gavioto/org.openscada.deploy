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
package org.openscada.configurator.sec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.sec.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "sec";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:openscada:configurator:sec";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "sec";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SecurityPackage eINSTANCE = org.openscada.configurator.sec.impl.SecurityPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.RuleImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getRule()
     * @generated
     */
    int RULE = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__ID = 0;

    /**
     * The feature id for the '<em><b>Id Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__ID_FILTER = 1;

    /**
     * The feature id for the '<em><b>Action Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__ACTION_FILTER = 2;

    /**
     * The feature id for the '<em><b>Type Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__TYPE_FILTER = 3;

    /**
     * The feature id for the '<em><b>Filter Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__FILTER_SCRIPT = 4;

    /**
     * The number of structural features of the '<em>Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.ScriptRuleImpl <em>Script Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.ScriptRuleImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getScriptRule()
     * @generated
     */
    int SCRIPT_RULE = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__ID = RULE__ID;

    /**
     * The feature id for the '<em><b>Id Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__ID_FILTER = RULE__ID_FILTER;

    /**
     * The feature id for the '<em><b>Action Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__ACTION_FILTER = RULE__ACTION_FILTER;

    /**
     * The feature id for the '<em><b>Type Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__TYPE_FILTER = RULE__TYPE_FILTER;

    /**
     * The feature id for the '<em><b>Filter Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__FILTER_SCRIPT = RULE__FILTER_SCRIPT;

    /**
     * The feature id for the '<em><b>Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__SCRIPT = RULE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Callback Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__CALLBACK_SCRIPT = RULE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Script Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.LogonRuleImpl <em>Logon Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.LogonRuleImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getLogonRule()
     * @generated
     */
    int LOGON_RULE = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE__ID = RULE__ID;

    /**
     * The feature id for the '<em><b>Id Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE__ID_FILTER = RULE__ID_FILTER;

    /**
     * The feature id for the '<em><b>Action Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE__ACTION_FILTER = RULE__ACTION_FILTER;

    /**
     * The feature id for the '<em><b>Type Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE__TYPE_FILTER = RULE__TYPE_FILTER;

    /**
     * The feature id for the '<em><b>Filter Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE__FILTER_SCRIPT = RULE__FILTER_SCRIPT;

    /**
     * The number of structural features of the '<em>Logon Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.SignatureRuleImpl <em>Signature Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.SignatureRuleImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getSignatureRule()
     * @generated
     */
    int SIGNATURE_RULE = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__ID = RULE__ID;

    /**
     * The feature id for the '<em><b>Id Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__ID_FILTER = RULE__ID_FILTER;

    /**
     * The feature id for the '<em><b>Action Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__ACTION_FILTER = RULE__ACTION_FILTER;

    /**
     * The feature id for the '<em><b>Type Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__TYPE_FILTER = RULE__TYPE_FILTER;

    /**
     * The feature id for the '<em><b>Filter Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__FILTER_SCRIPT = RULE__FILTER_SCRIPT;

    /**
     * The feature id for the '<em><b>Trusted Certification Authority</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__TRUSTED_CERTIFICATION_AUTHORITY = RULE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Indent Xml</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__INDENT_XML = RULE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Signature Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.ScriptImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getScript()
     * @generated
     */
    int SCRIPT = 4;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__SOURCE = 0;

    /**
     * The number of structural features of the '<em>Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.JavaScriptImpl <em>Java Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.JavaScriptImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getJavaScript()
     * @generated
     */
    int JAVA_SCRIPT = 5;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_SCRIPT__SOURCE = SCRIPT__SOURCE;

    /**
     * The number of structural features of the '<em>Java Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.GenericScriptImpl <em>Generic Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.GenericScriptImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getGenericScript()
     * @generated
     */
    int GENERIC_SCRIPT = 6;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCRIPT__SOURCE = SCRIPT__SOURCE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCRIPT__TYPE = SCRIPT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Generic Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.RulesImpl <em>Rules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.RulesImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getRules()
     * @generated
     */
    int RULES = 8;

    /**
     * The feature id for the '<em><b>Rules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES__RULES = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES__NAME = 1;

    /**
     * The number of structural features of the '<em>Rules</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.ConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.ConfigurationImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getConfiguration()
     * @generated
     */
    int CONFIGURATION = 7;

    /**
     * The feature id for the '<em><b>Rules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION__RULES = RULES__RULES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION__NAME = RULES__NAME;

    /**
     * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION__SCRIPTS = RULES_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_FEATURE_COUNT = RULES_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.CAImpl <em>CA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.CAImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getCA()
     * @generated
     */
    int CA = 9;

    /**
     * The feature id for the '<em><b>Certificate Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CA__CERTIFICATE_URL = 0;

    /**
     * The feature id for the '<em><b>Crl Url</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CA__CRL_URL = 1;

    /**
     * The feature id for the '<em><b>Reload Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CA__RELOAD_DELAY = 2;

    /**
     * The number of structural features of the '<em>CA</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CA_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '<em>Pattern</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.regex.Pattern
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getPattern()
     * @generated
     */
    int PATTERN = 10;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.Rule <em>Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule</em>'.
     * @see org.openscada.configurator.sec.Rule
     * @generated
     */
    EClass getRule ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.Rule#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.openscada.configurator.sec.Rule#getId()
     * @see #getRule()
     * @generated
     */
    EAttribute getRule_Id ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.Rule#getIdFilter <em>Id Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id Filter</em>'.
     * @see org.openscada.configurator.sec.Rule#getIdFilter()
     * @see #getRule()
     * @generated
     */
    EAttribute getRule_IdFilter ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.Rule#getActionFilter <em>Action Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Action Filter</em>'.
     * @see org.openscada.configurator.sec.Rule#getActionFilter()
     * @see #getRule()
     * @generated
     */
    EAttribute getRule_ActionFilter ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.Rule#getTypeFilter <em>Type Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Filter</em>'.
     * @see org.openscada.configurator.sec.Rule#getTypeFilter()
     * @see #getRule()
     * @generated
     */
    EAttribute getRule_TypeFilter ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configurator.sec.Rule#getFilterScript <em>Filter Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Filter Script</em>'.
     * @see org.openscada.configurator.sec.Rule#getFilterScript()
     * @see #getRule()
     * @generated
     */
    EReference getRule_FilterScript ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.ScriptRule <em>Script Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Rule</em>'.
     * @see org.openscada.configurator.sec.ScriptRule
     * @generated
     */
    EClass getScriptRule ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configurator.sec.ScriptRule#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Script</em>'.
     * @see org.openscada.configurator.sec.ScriptRule#getScript()
     * @see #getScriptRule()
     * @generated
     */
    EReference getScriptRule_Script ();

    /**
     * Returns the meta object for the reference '{@link org.openscada.configurator.sec.ScriptRule#getCallbackScript <em>Callback Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Callback Script</em>'.
     * @see org.openscada.configurator.sec.ScriptRule#getCallbackScript()
     * @see #getScriptRule()
     * @generated
     */
    EReference getScriptRule_CallbackScript ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.LogonRule <em>Logon Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Logon Rule</em>'.
     * @see org.openscada.configurator.sec.LogonRule
     * @generated
     */
    EClass getLogonRule ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.SignatureRule <em>Signature Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signature Rule</em>'.
     * @see org.openscada.configurator.sec.SignatureRule
     * @generated
     */
    EClass getSignatureRule ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configurator.sec.SignatureRule#getTrustedCertificationAuthority <em>Trusted Certification Authority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Trusted Certification Authority</em>'.
     * @see org.openscada.configurator.sec.SignatureRule#getTrustedCertificationAuthority()
     * @see #getSignatureRule()
     * @generated
     */
    EReference getSignatureRule_TrustedCertificationAuthority ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.SignatureRule#isIndentXml <em>Indent Xml</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Indent Xml</em>'.
     * @see org.openscada.configurator.sec.SignatureRule#isIndentXml()
     * @see #getSignatureRule()
     * @generated
     */
    EAttribute getSignatureRule_IndentXml ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.Script <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script</em>'.
     * @see org.openscada.configurator.sec.Script
     * @generated
     */
    EClass getScript ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.Script#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.openscada.configurator.sec.Script#getSource()
     * @see #getScript()
     * @generated
     */
    EAttribute getScript_Source ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.JavaScript <em>Java Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Script</em>'.
     * @see org.openscada.configurator.sec.JavaScript
     * @generated
     */
    EClass getJavaScript ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.GenericScript <em>Generic Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic Script</em>'.
     * @see org.openscada.configurator.sec.GenericScript
     * @generated
     */
    EClass getGenericScript ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.GenericScript#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.openscada.configurator.sec.GenericScript#getType()
     * @see #getGenericScript()
     * @generated
     */
    EAttribute getGenericScript_Type ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.Configuration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Configuration</em>'.
     * @see org.openscada.configurator.sec.Configuration
     * @generated
     */
    EClass getConfiguration ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configurator.sec.Configuration#getScripts <em>Scripts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scripts</em>'.
     * @see org.openscada.configurator.sec.Configuration#getScripts()
     * @see #getConfiguration()
     * @generated
     */
    EReference getConfiguration_Scripts ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.Rules <em>Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rules</em>'.
     * @see org.openscada.configurator.sec.Rules
     * @generated
     */
    EClass getRules ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configurator.sec.Rules#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rules</em>'.
     * @see org.openscada.configurator.sec.Rules#getRules()
     * @see #getRules()
     * @generated
     */
    EReference getRules_Rules ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.Rules#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.openscada.configurator.sec.Rules#getName()
     * @see #getRules()
     * @generated
     */
    EAttribute getRules_Name ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.sec.CA <em>CA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CA</em>'.
     * @see org.openscada.configurator.sec.CA
     * @generated
     */
    EClass getCA ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.CA#getCertificateUrl <em>Certificate Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Certificate Url</em>'.
     * @see org.openscada.configurator.sec.CA#getCertificateUrl()
     * @see #getCA()
     * @generated
     */
    EAttribute getCA_CertificateUrl ();

    /**
     * Returns the meta object for the attribute list '{@link org.openscada.configurator.sec.CA#getCrlUrl <em>Crl Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Crl Url</em>'.
     * @see org.openscada.configurator.sec.CA#getCrlUrl()
     * @see #getCA()
     * @generated
     */
    EAttribute getCA_CrlUrl ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.CA#getReloadDelay <em>Reload Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reload Delay</em>'.
     * @see org.openscada.configurator.sec.CA#getReloadDelay()
     * @see #getCA()
     * @generated
     */
    EAttribute getCA_ReloadDelay ();

    /**
     * Returns the meta object for data type '{@link java.util.regex.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Pattern</em>'.
     * @see java.util.regex.Pattern
     * @model instanceClass="java.util.regex.Pattern"
     * @generated
     */
    EDataType getPattern ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SecurityFactory getSecurityFactory ();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.RuleImpl <em>Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.RuleImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getRule()
         * @generated
         */
        EClass RULE = eINSTANCE.getRule ();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE__ID = eINSTANCE.getRule_Id ();

        /**
         * The meta object literal for the '<em><b>Id Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE__ID_FILTER = eINSTANCE.getRule_IdFilter ();

        /**
         * The meta object literal for the '<em><b>Action Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE__ACTION_FILTER = eINSTANCE.getRule_ActionFilter ();

        /**
         * The meta object literal for the '<em><b>Type Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE__TYPE_FILTER = eINSTANCE.getRule_TypeFilter ();

        /**
         * The meta object literal for the '<em><b>Filter Script</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE__FILTER_SCRIPT = eINSTANCE.getRule_FilterScript ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.ScriptRuleImpl <em>Script Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.ScriptRuleImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getScriptRule()
         * @generated
         */
        EClass SCRIPT_RULE = eINSTANCE.getScriptRule ();

        /**
         * The meta object literal for the '<em><b>Script</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT_RULE__SCRIPT = eINSTANCE.getScriptRule_Script ();

        /**
         * The meta object literal for the '<em><b>Callback Script</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT_RULE__CALLBACK_SCRIPT = eINSTANCE.getScriptRule_CallbackScript ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.LogonRuleImpl <em>Logon Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.LogonRuleImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getLogonRule()
         * @generated
         */
        EClass LOGON_RULE = eINSTANCE.getLogonRule ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.SignatureRuleImpl <em>Signature Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.SignatureRuleImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getSignatureRule()
         * @generated
         */
        EClass SIGNATURE_RULE = eINSTANCE.getSignatureRule ();

        /**
         * The meta object literal for the '<em><b>Trusted Certification Authority</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNATURE_RULE__TRUSTED_CERTIFICATION_AUTHORITY = eINSTANCE.getSignatureRule_TrustedCertificationAuthority ();

        /**
         * The meta object literal for the '<em><b>Indent Xml</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIGNATURE_RULE__INDENT_XML = eINSTANCE.getSignatureRule_IndentXml ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.ScriptImpl <em>Script</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.ScriptImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getScript()
         * @generated
         */
        EClass SCRIPT = eINSTANCE.getScript ();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT__SOURCE = eINSTANCE.getScript_Source ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.JavaScriptImpl <em>Java Script</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.JavaScriptImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getJavaScript()
         * @generated
         */
        EClass JAVA_SCRIPT = eINSTANCE.getJavaScript ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.GenericScriptImpl <em>Generic Script</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.GenericScriptImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getGenericScript()
         * @generated
         */
        EClass GENERIC_SCRIPT = eINSTANCE.getGenericScript ();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_SCRIPT__TYPE = eINSTANCE.getGenericScript_Type ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.ConfigurationImpl <em>Configuration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.ConfigurationImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getConfiguration()
         * @generated
         */
        EClass CONFIGURATION = eINSTANCE.getConfiguration ();

        /**
         * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIGURATION__SCRIPTS = eINSTANCE.getConfiguration_Scripts ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.RulesImpl <em>Rules</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.RulesImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getRules()
         * @generated
         */
        EClass RULES = eINSTANCE.getRules ();

        /**
         * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES__RULES = eINSTANCE.getRules_Rules ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULES__NAME = eINSTANCE.getRules_Name ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.CAImpl <em>CA</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.CAImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getCA()
         * @generated
         */
        EClass CA = eINSTANCE.getCA ();

        /**
         * The meta object literal for the '<em><b>Certificate Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CA__CERTIFICATE_URL = eINSTANCE.getCA_CertificateUrl ();

        /**
         * The meta object literal for the '<em><b>Crl Url</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CA__CRL_URL = eINSTANCE.getCA_CrlUrl ();

        /**
         * The meta object literal for the '<em><b>Reload Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CA__RELOAD_DELAY = eINSTANCE.getCA_ReloadDelay ();

        /**
         * The meta object literal for the '<em>Pattern</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.regex.Pattern
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getPattern()
         * @generated
         */
        EDataType PATTERN = eINSTANCE.getPattern ();

    }

} //SecurityPackage

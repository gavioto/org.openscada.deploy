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
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__PRIORITY = 1;

    /**
     * The number of structural features of the '<em>Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.PreFilterRuleImpl <em>Pre Filter Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.PreFilterRuleImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getPreFilterRule()
     * @generated
     */
    int PRE_FILTER_RULE = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_FILTER_RULE__ID = RULE__ID;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_FILTER_RULE__PRIORITY = RULE__PRIORITY;

    /**
     * The feature id for the '<em><b>Id Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_FILTER_RULE__ID_FILTER = RULE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_FILTER_RULE__TYPE_FILTER = RULE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Action Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_FILTER_RULE__ACTION_FILTER = RULE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Pre Filter Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_FILTER_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

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
    int SCRIPT_RULE__ID = PRE_FILTER_RULE__ID;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__PRIORITY = PRE_FILTER_RULE__PRIORITY;

    /**
     * The feature id for the '<em><b>Id Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__ID_FILTER = PRE_FILTER_RULE__ID_FILTER;

    /**
     * The feature id for the '<em><b>Type Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__TYPE_FILTER = PRE_FILTER_RULE__TYPE_FILTER;

    /**
     * The feature id for the '<em><b>Action Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__ACTION_FILTER = PRE_FILTER_RULE__ACTION_FILTER;

    /**
     * The feature id for the '<em><b>Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__SCRIPT = PRE_FILTER_RULE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Callback Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE__CALLBACK_SCRIPT = PRE_FILTER_RULE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Script Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_RULE_FEATURE_COUNT = PRE_FILTER_RULE_FEATURE_COUNT + 2;

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
    int LOGON_RULE__ID = PRE_FILTER_RULE__ID;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE__PRIORITY = PRE_FILTER_RULE__PRIORITY;

    /**
     * The feature id for the '<em><b>Id Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE__ID_FILTER = PRE_FILTER_RULE__ID_FILTER;

    /**
     * The feature id for the '<em><b>Type Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE__TYPE_FILTER = PRE_FILTER_RULE__TYPE_FILTER;

    /**
     * The feature id for the '<em><b>Action Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE__ACTION_FILTER = PRE_FILTER_RULE__ACTION_FILTER;

    /**
     * The number of structural features of the '<em>Logon Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGON_RULE_FEATURE_COUNT = PRE_FILTER_RULE_FEATURE_COUNT + 0;

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
    int SIGNATURE_RULE__ID = PRE_FILTER_RULE__ID;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__PRIORITY = PRE_FILTER_RULE__PRIORITY;

    /**
     * The feature id for the '<em><b>Id Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__ID_FILTER = PRE_FILTER_RULE__ID_FILTER;

    /**
     * The feature id for the '<em><b>Type Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__TYPE_FILTER = PRE_FILTER_RULE__TYPE_FILTER;

    /**
     * The feature id for the '<em><b>Action Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE__ACTION_FILTER = PRE_FILTER_RULE__ACTION_FILTER;

    /**
     * The number of structural features of the '<em>Signature Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNATURE_RULE_FEATURE_COUNT = PRE_FILTER_RULE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openscada.configurator.sec.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.sec.impl.ScriptImpl
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getScript()
     * @generated
     */
    int SCRIPT = 5;

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
    int JAVA_SCRIPT = 6;

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
    int GENERIC_SCRIPT = 7;

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
     * The meta object id for the '<em>Pattern</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.regex.Pattern
     * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getPattern()
     * @generated
     */
    int PATTERN = 8;

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
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.Rule#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see org.openscada.configurator.sec.Rule#getPriority()
     * @see #getRule()
     * @generated
     */
    EAttribute getRule_Priority ();

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
     * Returns the meta object for class '{@link org.openscada.configurator.sec.PreFilterRule <em>Pre Filter Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pre Filter Rule</em>'.
     * @see org.openscada.configurator.sec.PreFilterRule
     * @generated
     */
    EClass getPreFilterRule ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.PreFilterRule#getIdFilter <em>Id Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id Filter</em>'.
     * @see org.openscada.configurator.sec.PreFilterRule#getIdFilter()
     * @see #getPreFilterRule()
     * @generated
     */
    EAttribute getPreFilterRule_IdFilter ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.PreFilterRule#getTypeFilter <em>Type Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Filter</em>'.
     * @see org.openscada.configurator.sec.PreFilterRule#getTypeFilter()
     * @see #getPreFilterRule()
     * @generated
     */
    EAttribute getPreFilterRule_TypeFilter ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.sec.PreFilterRule#getActionFilter <em>Action Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Action Filter</em>'.
     * @see org.openscada.configurator.sec.PreFilterRule#getActionFilter()
     * @see #getPreFilterRule()
     * @generated
     */
    EAttribute getPreFilterRule_ActionFilter ();

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
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE__PRIORITY = eINSTANCE.getRule_Priority ();

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
         * The meta object literal for the '{@link org.openscada.configurator.sec.impl.PreFilterRuleImpl <em>Pre Filter Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.sec.impl.PreFilterRuleImpl
         * @see org.openscada.configurator.sec.impl.SecurityPackageImpl#getPreFilterRule()
         * @generated
         */
        EClass PRE_FILTER_RULE = eINSTANCE.getPreFilterRule ();

        /**
         * The meta object literal for the '<em><b>Id Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRE_FILTER_RULE__ID_FILTER = eINSTANCE.getPreFilterRule_IdFilter ();

        /**
         * The meta object literal for the '<em><b>Type Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRE_FILTER_RULE__TYPE_FILTER = eINSTANCE.getPreFilterRule_TypeFilter ();

        /**
         * The meta object literal for the '<em><b>Action Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRE_FILTER_RULE__ACTION_FILTER = eINSTANCE.getPreFilterRule_ActionFilter ();

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

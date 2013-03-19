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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.ScriptRule#getScript <em>Script</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.ScriptRule#getCallbackScript <em>Callback Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.sec.SecurityPackage#getScriptRule()
 * @model
 * @generated
 */
public interface ScriptRule extends PreFilterRule
{

    /**
     * Returns the value of the '<em><b>Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script</em>' reference.
     * @see #setScript(Script)
     * @see org.openscada.configurator.sec.SecurityPackage#getScriptRule_Script()
     * @model
     * @generated
     */
    Script getScript ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.ScriptRule#getScript <em>Script</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script</em>' reference.
     * @see #getScript()
     * @generated
     */
    void setScript ( Script value );

    /**
     * Returns the value of the '<em><b>Callback Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Callback Script</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Callback Script</em>' reference.
     * @see #setCallbackScript(Script)
     * @see org.openscada.configurator.sec.SecurityPackage#getScriptRule_CallbackScript()
     * @model
     * @generated
     */
    Script getCallbackScript ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.ScriptRule#getCallbackScript <em>Callback Script</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Callback Script</em>' reference.
     * @see #getCallbackScript()
     * @generated
     */
    void setCallbackScript ( Script value );
} // ScriptRule

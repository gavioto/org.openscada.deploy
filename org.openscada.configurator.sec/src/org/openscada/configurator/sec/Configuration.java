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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.Configuration#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.Configuration#getScripts <em>Scripts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.sec.SecurityPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject
{
    /**
     * Returns the value of the '<em><b>Rules</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rules</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rules</em>' reference.
     * @see #setRules(Rules)
     * @see org.openscada.configurator.sec.SecurityPackage#getConfiguration_Rules()
     * @model
     * @generated
     */
    Rules getRules ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.Configuration#getRules <em>Rules</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rules</em>' reference.
     * @see #getRules()
     * @generated
     */
    void setRules ( Rules value );

    /**
     * Returns the value of the '<em><b>Scripts</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scripts</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scripts</em>' reference.
     * @see #setScripts(Scripts)
     * @see org.openscada.configurator.sec.SecurityPackage#getConfiguration_Scripts()
     * @model
     * @generated
     */
    Scripts getScripts ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.Configuration#getScripts <em>Scripts</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scripts</em>' reference.
     * @see #getScripts()
     * @generated
     */
    void setScripts ( Scripts value );

} // Configuration

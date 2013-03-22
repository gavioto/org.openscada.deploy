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
 * A representation of the model object '<em><b>Logon Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.LogonRule#getPostProcessor <em>Post Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.sec.SecurityPackage#getLogonRule()
 * @model
 * @generated
 */
public interface LogonRule extends Rule
{

    /**
     * Returns the value of the '<em><b>Post Processor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Post Processor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Post Processor</em>' reference.
     * @see #setPostProcessor(Script)
     * @see org.openscada.configurator.sec.SecurityPackage#getLogonRule_PostProcessor()
     * @model
     * @generated
     */
    Script getPostProcessor ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.LogonRule#getPostProcessor <em>Post Processor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Post Processor</em>' reference.
     * @see #getPostProcessor()
     * @generated
     */
    void setPostProcessor ( Script value );
} // LogonRule

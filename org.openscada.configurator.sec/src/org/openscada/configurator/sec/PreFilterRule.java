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

import java.util.regex.Pattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Filter Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.PreFilterRule#getIdFilter <em>Id Filter</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.PreFilterRule#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.PreFilterRule#getActionFilter <em>Action Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.sec.SecurityPackage#getPreFilterRule()
 * @model
 * @generated
 */
public interface PreFilterRule extends Rule
{
    /**
     * Returns the value of the '<em><b>Id Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Filter</em>' attribute.
     * @see #setIdFilter(Pattern)
     * @see org.openscada.configurator.sec.SecurityPackage#getPreFilterRule_IdFilter()
     * @model dataType="org.openscada.configurator.sec.Pattern"
     * @generated
     */
    Pattern getIdFilter ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.PreFilterRule#getIdFilter <em>Id Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Filter</em>' attribute.
     * @see #getIdFilter()
     * @generated
     */
    void setIdFilter ( Pattern value );

    /**
     * Returns the value of the '<em><b>Type Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Filter</em>' attribute.
     * @see #setTypeFilter(Pattern)
     * @see org.openscada.configurator.sec.SecurityPackage#getPreFilterRule_TypeFilter()
     * @model dataType="org.openscada.configurator.sec.Pattern"
     * @generated
     */
    Pattern getTypeFilter ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.PreFilterRule#getTypeFilter <em>Type Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Filter</em>' attribute.
     * @see #getTypeFilter()
     * @generated
     */
    void setTypeFilter ( Pattern value );

    /**
     * Returns the value of the '<em><b>Action Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action Filter</em>' attribute.
     * @see #setActionFilter(Pattern)
     * @see org.openscada.configurator.sec.SecurityPackage#getPreFilterRule_ActionFilter()
     * @model dataType="org.openscada.configurator.sec.Pattern"
     * @generated
     */
    Pattern getActionFilter ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.PreFilterRule#getActionFilter <em>Action Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action Filter</em>' attribute.
     * @see #getActionFilter()
     * @generated
     */
    void setActionFilter ( Pattern value );

} // PreFilterRule

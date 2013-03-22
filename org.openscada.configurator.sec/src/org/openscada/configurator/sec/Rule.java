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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.Rule#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.Rule#getIdFilter <em>Id Filter</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.Rule#getActionFilter <em>Action Filter</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.Rule#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.Rule#getFilterScript <em>Filter Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.sec.SecurityPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends EObject
{
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.openscada.configurator.sec.SecurityPackage#getRule_Id()
     * @model id="true" required="true"
     * @generated
     */
    String getId ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.Rule#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId ( String value );

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
     * @see org.openscada.configurator.sec.SecurityPackage#getRule_IdFilter()
     * @model dataType="org.openscada.configurator.sec.Pattern"
     * @generated
     */
    Pattern getIdFilter ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.Rule#getIdFilter <em>Id Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Filter</em>' attribute.
     * @see #getIdFilter()
     * @generated
     */
    void setIdFilter ( Pattern value );

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
     * @see org.openscada.configurator.sec.SecurityPackage#getRule_ActionFilter()
     * @model dataType="org.openscada.configurator.sec.Pattern"
     * @generated
     */
    Pattern getActionFilter ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.Rule#getActionFilter <em>Action Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action Filter</em>' attribute.
     * @see #getActionFilter()
     * @generated
     */
    void setActionFilter ( Pattern value );

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
     * @see org.openscada.configurator.sec.SecurityPackage#getRule_TypeFilter()
     * @model dataType="org.openscada.configurator.sec.Pattern"
     * @generated
     */
    Pattern getTypeFilter ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.Rule#getTypeFilter <em>Type Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Filter</em>' attribute.
     * @see #getTypeFilter()
     * @generated
     */
    void setTypeFilter ( Pattern value );

    /**
     * Returns the value of the '<em><b>Filter Script</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filter Script</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filter Script</em>' reference.
     * @see #setFilterScript(Script)
     * @see org.openscada.configurator.sec.SecurityPackage#getRule_FilterScript()
     * @model
     * @generated
     */
    Script getFilterScript ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.Rule#getFilterScript <em>Filter Script</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filter Script</em>' reference.
     * @see #getFilterScript()
     * @generated
     */
    void setFilterScript ( Script value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This method must return the type of the rule that the dereived implementation provides.
     * <!-- end-model-doc -->
     * @model kind="operation" required="true"
     * @generated
     */
    String getRuleType ();

} // Rule

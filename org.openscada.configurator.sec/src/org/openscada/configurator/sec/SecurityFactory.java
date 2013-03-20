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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.sec.SecurityPackage
 * @generated
 */
public interface SecurityFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SecurityFactory eINSTANCE = org.openscada.configurator.sec.impl.SecurityFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Script Rule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Script Rule</em>'.
     * @generated
     */
    ScriptRule createScriptRule ();

    /**
     * Returns a new object of class '<em>Logon Rule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Logon Rule</em>'.
     * @generated
     */
    LogonRule createLogonRule ();

    /**
     * Returns a new object of class '<em>Signature Rule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Signature Rule</em>'.
     * @generated
     */
    SignatureRule createSignatureRule ();

    /**
     * Returns a new object of class '<em>Java Script</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Java Script</em>'.
     * @generated
     */
    JavaScript createJavaScript ();

    /**
     * Returns a new object of class '<em>Generic Script</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic Script</em>'.
     * @generated
     */
    GenericScript createGenericScript ();

    /**
     * Returns a new object of class '<em>Configuration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Configuration</em>'.
     * @generated
     */
    Configuration createConfiguration ();

    /**
     * Returns a new object of class '<em>Rules</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rules</em>'.
     * @generated
     */
    Rules createRules ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SecurityPackage getSecurityPackage ();

} //SecurityFactory

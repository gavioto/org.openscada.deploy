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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.SignatureRule#getTrustedCertificationAuthority <em>Trusted Certification Authority</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.SignatureRule#isIndentXml <em>Indent Xml</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.sec.SecurityPackage#getSignatureRule()
 * @model
 * @generated
 */
public interface SignatureRule extends Rule
{

    /**
     * Returns the value of the '<em><b>Trusted Certification Authority</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configurator.sec.CA}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trusted Certification Authority</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trusted Certification Authority</em>' containment reference list.
     * @see org.openscada.configurator.sec.SecurityPackage#getSignatureRule_TrustedCertificationAuthority()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<CA> getTrustedCertificationAuthority ();

    /**
     * Returns the value of the '<em><b>Indent Xml</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indent Xml</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indent Xml</em>' attribute.
     * @see #setIndentXml(boolean)
     * @see org.openscada.configurator.sec.SecurityPackage#getSignatureRule_IndentXml()
     * @model default="false" required="true"
     * @generated
     */
    boolean isIndentXml ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.SignatureRule#isIndentXml <em>Indent Xml</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Indent Xml</em>' attribute.
     * @see #isIndentXml()
     * @generated
     */
    void setIndentXml ( boolean value );
} // SignatureRule

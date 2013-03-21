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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.CA#getCertificateUrl <em>Certificate Url</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.CA#getCrlUrl <em>Crl Url</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.CA#getReloadDelay <em>Reload Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.sec.SecurityPackage#getCA()
 * @model
 * @generated
 */
public interface CA extends EObject
{
    /**
     * Returns the value of the '<em><b>Certificate Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Certificate Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Certificate Url</em>' attribute.
     * @see #setCertificateUrl(String)
     * @see org.openscada.configurator.sec.SecurityPackage#getCA_CertificateUrl()
     * @model required="true"
     * @generated
     */
    String getCertificateUrl ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.CA#getCertificateUrl <em>Certificate Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Certificate Url</em>' attribute.
     * @see #getCertificateUrl()
     * @generated
     */
    void setCertificateUrl ( String value );

    /**
     * Returns the value of the '<em><b>Crl Url</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crl Url</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crl Url</em>' attribute list.
     * @see org.openscada.configurator.sec.SecurityPackage#getCA_CrlUrl()
     * @model
     * @generated
     */
    EList<String> getCrlUrl ();

    /**
     * Returns the value of the '<em><b>Reload Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The period time in milliseconds for reloading the CRLs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reload Delay</em>' attribute.
     * @see #setReloadDelay(int)
     * @see org.openscada.configurator.sec.SecurityPackage#getCA_ReloadDelay()
     * @model
     * @generated
     */
    int getReloadDelay ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.sec.CA#getReloadDelay <em>Reload Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reload Delay</em>' attribute.
     * @see #getReloadDelay()
     * @generated
     */
    void setReloadDelay ( int value );

} // CA

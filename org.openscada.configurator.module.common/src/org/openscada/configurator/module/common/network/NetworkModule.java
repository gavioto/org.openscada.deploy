/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.network;

import org.openscada.configuration.model.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.network.NetworkModule#getNetworkFile <em>Network File</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.network.NetworkModule#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.network.NetworkPackage#getNetworkModule()
 * @model
 * @generated
 */
public interface NetworkModule extends Module
{
    /**
     * Returns the value of the '<em><b>Network File</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Network File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Network File</em>' attribute.
     * @see #setNetworkFile(String)
     * @see org.openscada.configurator.module.common.network.NetworkPackage#getNetworkModule_NetworkFile()
     * @model default=""
     * @generated
     */
    String getNetworkFile ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.network.NetworkModule#getNetworkFile <em>Network File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Network File</em>' attribute.
     * @see #getNetworkFile()
     * @generated
     */
    void setNetworkFile ( String value );

    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #setPrefix(String)
     * @see org.openscada.configurator.module.common.network.NetworkPackage#getNetworkModule_Prefix()
     * @model required="true"
     * @generated
     */
    String getPrefix ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.network.NetworkModule#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #getPrefix()
     * @generated
     */
    void setPrefix ( String value );

} // NetworkModule

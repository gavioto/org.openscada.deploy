/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd;

import org.openscada.configuration.model.GenericConfigurationSlot;
import org.openscada.configurator.GenericConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.hd.ConfigurationSlot#getMasterConnectionUri <em>Master Connection Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configuration.model.hd.HdPackage#getConfigurationSlot()
 * @model
 * @generated
 */
public interface ConfigurationSlot extends GenericConfigurationSlot
{
    /**
     * Returns the value of the '<em><b>Master Connection Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Master Connection Uri</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Master Connection Uri</em>' attribute.
     * @see #setMasterConnectionUri(String)
     * @see org.openscada.configuration.model.hd.HdPackage#getConfigurationSlot_MasterConnectionUri()
     * @model required="true"
     * @generated
     */
    String getMasterConnectionUri ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.model.hd.ConfigurationSlot#getMasterConnectionUri <em>Master Connection Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Master Connection Uri</em>' attribute.
     * @see #getMasterConnectionUri()
     * @generated
     */
    void setMasterConnectionUri ( String value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.openscada.configuration.model.GenericConfiguration" required="true"
     * @generated
     */
    GenericConfiguration getConfigurationData ();

} // ConfigurationSlot

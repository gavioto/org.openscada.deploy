/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd;

import org.openscada.configuration.model.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Command Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.hd.StorageCommandGenerator#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configuration.model.hd.HdPackage#getStorageCommandGenerator()
 * @model
 * @generated
 */
public interface StorageCommandGenerator extends Processor
{
    /**
     * Returns the value of the '<em><b>Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slot</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slot</em>' reference.
     * @see #setSlot(ConfigurationSlot)
     * @see org.openscada.configuration.model.hd.HdPackage#getStorageCommandGenerator_Slot()
     * @model required="true"
     * @generated
     */
    ConfigurationSlot getSlot ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.model.hd.StorageCommandGenerator#getSlot <em>Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Slot</em>' reference.
     * @see #getSlot()
     * @generated
     */
    void setSlot ( ConfigurationSlot value );

} // StorageCommandGenerator

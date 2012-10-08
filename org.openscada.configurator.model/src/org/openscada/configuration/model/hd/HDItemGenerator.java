/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd;

import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HD Item Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.hd.HDItemGenerator#getHdSlot <em>Hd Slot</em>}</li>
 *   <li>{@link org.openscada.configuration.model.hd.HDItemGenerator#getDaSlot <em>Da Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configuration.model.hd.HdPackage#getHDItemGenerator()
 * @model
 * @generated
 */
public interface HDItemGenerator extends Processor
{
    /**
     * Returns the value of the '<em><b>Hd Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hd Slot</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hd Slot</em>' reference.
     * @see #setHdSlot(ConfigurationSlot)
     * @see org.openscada.configuration.model.hd.HdPackage#getHDItemGenerator_HdSlot()
     * @model required="true"
     * @generated
     */
    ConfigurationSlot getHdSlot ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.model.hd.HDItemGenerator#getHdSlot <em>Hd Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hd Slot</em>' reference.
     * @see #getHdSlot()
     * @generated
     */
    void setHdSlot ( ConfigurationSlot value );

    /**
     * Returns the value of the '<em><b>Da Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Da Slot</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Da Slot</em>' reference.
     * @see #setDaSlot(AtlantisConfigurationSlot)
     * @see org.openscada.configuration.model.hd.HdPackage#getHDItemGenerator_DaSlot()
     * @model required="true"
     * @generated
     */
    AtlantisConfigurationSlot getDaSlot ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.model.hd.HDItemGenerator#getDaSlot <em>Da Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Da Slot</em>' reference.
     * @see #getDaSlot()
     * @generated
     */
    void setDaSlot ( AtlantisConfigurationSlot value );

} // HDItemGenerator

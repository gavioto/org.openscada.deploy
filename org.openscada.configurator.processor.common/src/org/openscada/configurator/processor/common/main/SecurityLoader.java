/**
 */
package org.openscada.configurator.processor.common.main;

import org.openscada.configuration.model.GenericMasterConfigurationSlot;
import org.openscada.configuration.model.Processor;

import org.openscada.configurator.sec.Rules;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.main.SecurityLoader#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.main.SecurityLoader#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.main.MainPackage#getSecurityLoader()
 * @model
 * @generated
 */
public interface SecurityLoader extends Processor
{
    /**
     * Returns the value of the '<em><b>Rules</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rules</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rules</em>' reference.
     * @see #setRules(Rules)
     * @see org.openscada.configurator.processor.common.main.MainPackage#getSecurityLoader_Rules()
     * @model required="true"
     * @generated
     */
    Rules getRules ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.main.SecurityLoader#getRules <em>Rules</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rules</em>' reference.
     * @see #getRules()
     * @generated
     */
    void setRules ( Rules value );

    /**
     * Returns the value of the '<em><b>Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slot</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slot</em>' reference.
     * @see #setSlot(GenericMasterConfigurationSlot)
     * @see org.openscada.configurator.processor.common.main.MainPackage#getSecurityLoader_Slot()
     * @model
     * @generated
     */
    GenericMasterConfigurationSlot getSlot ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.main.SecurityLoader#getSlot <em>Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Slot</em>' reference.
     * @see #getSlot()
     * @generated
     */
    void setSlot ( GenericMasterConfigurationSlot value );

} // SecurityLoader

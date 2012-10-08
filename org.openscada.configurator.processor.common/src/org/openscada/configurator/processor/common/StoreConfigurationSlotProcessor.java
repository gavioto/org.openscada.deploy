/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common;

import org.eclipse.emf.common.util.EList;
import org.openscada.configuration.model.ConfigurationSlot;
import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Configuration Slot Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.StoreConfigurationSlotProcessor#getSlots <em>Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.CommonPackage#getStoreConfigurationSlotProcessor()
 * @model
 * @generated
 */
public interface StoreConfigurationSlotProcessor extends Processor
{

    /**
     * Returns the value of the '<em><b>Slots</b></em>' reference list.
     * The list contents are of type {@link org.openscada.configuration.model.ConfigurationSlot}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slots</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slots</em>' reference list.
     * @see org.openscada.configurator.processor.common.CommonPackage#getStoreConfigurationSlotProcessor_Slots()
     * @model
     * @generated
     */
    EList<ConfigurationSlot> getSlots ();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model exceptions="org.openscada.configuration.model.Exception"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for ( ConfigurationSlot slot : getSlots () )\n{\n\tSystem.out.println ( \" ** Storing slot: \" + slot );\n\tslot.store();\n}'"
     * @generated
     */
    void process ( Project project ) throws Exception;
} // StoreConfigurationSlotProcessor

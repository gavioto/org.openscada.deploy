/**
 */
package org.openscada.configuration.model;

import org.openscada.configurator.GenericMasterConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Master Configuration Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openscada.configuration.model.ConfiguratorPackage#getGenericMasterConfigurationSlot()
 * @model abstract="true"
 * @generated
 */
public interface GenericMasterConfigurationSlot extends GenericConfigurationSlot
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.openscada.configuration.model.GenericMasterConfiguration"
     * @generated
     */
    GenericMasterConfiguration getConfigurationData ();

} // GenericMasterConfigurationSlot

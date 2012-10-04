/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model;

import org.openscada.configurator.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atlantis Configuration Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openscada.configuration.model.ConfiguratorPackage#getAtlantisConfigurationSlot()
 * @model
 * @generated
 */
public interface AtlantisConfigurationSlot extends GenericConfigurationSlot
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.openscada.configuration.model.Configuration" required="true"
     * @generated
     */
    Configuration getConfigurationData ();

} // AtlantisConfigurationSlot

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master;

import org.openscada.configuration.model.GenericMasterConfigurationSlot;
import org.openscada.configurator.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atlantis Configuration Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openscada.configuration.model.master.MasterPackage#getAtlantisConfigurationSlot()
 * @model
 * @generated
 */
public interface AtlantisConfigurationSlot extends GenericMasterConfigurationSlot
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.openscada.configuration.model.Configuration" required="true"
     * @generated
     */
    Configuration getConfigurationData ();

} // AtlantisConfigurationSlot

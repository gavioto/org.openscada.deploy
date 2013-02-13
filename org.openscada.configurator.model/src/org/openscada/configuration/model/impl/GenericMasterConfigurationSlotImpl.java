/**
 */
package org.openscada.configuration.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.GenericMasterConfigurationSlot;
import org.openscada.configurator.GenericMasterConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '
 * <em><b>Generic Master Configuration Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class GenericMasterConfigurationSlotImpl extends GenericConfigurationSlotImpl implements GenericMasterConfigurationSlot
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericMasterConfigurationSlotImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ConfiguratorPackage.Literals.GENERIC_MASTER_CONFIGURATION_SLOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericMasterConfiguration getConfigurationData ()
    {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException ();
    }

} //GenericMasterConfigurationSlotImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master.impl;

import org.eclipse.emf.ecore.EClass;
import org.openscada.configuration.model.impl.GenericConfigurationSlotImpl;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;
import org.openscada.configuration.model.master.MasterPackage;
import org.openscada.configurator.Configuration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atlantis Configuration Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AtlantisConfigurationSlotImpl extends GenericConfigurationSlotImpl implements AtlantisConfigurationSlot
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AtlantisConfigurationSlotImpl ()
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
        return MasterPackage.Literals.ATLANTIS_CONFIGURATION_SLOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Configuration getConfigurationData ()
    {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException ();
    }

} //AtlantisConfigurationSlotImpl

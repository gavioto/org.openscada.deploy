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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Atlantis Configuration Slot</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AtlantisConfigurationSlotImpl extends GenericConfigurationSlotImpl implements AtlantisConfigurationSlot
{
    /**
     * @generated NOT
     */
    private Configuration configuration;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AtlantisConfigurationSlotImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return MasterPackage.Literals.ATLANTIS_CONFIGURATION_SLOT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public Configuration getConfigurationData ()
    {
        if ( this.configuration == null )
        {
            this.configuration = new Configuration ( System.out );
            initialize ( this.configuration );
        }
        return this.configuration;
    }

} //AtlantisConfigurationSlotImpl

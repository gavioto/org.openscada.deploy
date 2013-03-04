/**
 */
package org.openscada.configuration.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.DefaultGenericMasterConfiguration;
import org.openscada.configurator.GenericMasterConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '
 * <em><b>Default Generic Master Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DefaultGenericMasterConfigurationImpl extends GenericMasterConfigurationSlotImpl implements DefaultGenericMasterConfiguration
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefaultGenericMasterConfigurationImpl ()
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
        return ConfiguratorPackage.Literals.DEFAULT_GENERIC_MASTER_CONFIGURATION;
    }

    /**
     * @generated NOT
     */
    private GenericMasterConfiguration configuration;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public GenericMasterConfiguration getConfigurationData ()
    {
        if ( this.configuration == null )
        {
            this.configuration = new GenericMasterConfiguration ();
            initialize ( this.configuration );
        }
        return this.configuration;
    }

} //DefaultGenericMasterConfigurationImpl

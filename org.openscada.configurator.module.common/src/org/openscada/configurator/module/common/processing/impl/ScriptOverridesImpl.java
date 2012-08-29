/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.impl;

import org.eclipse.emf.ecore.EClass;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.impl.FileModuleImpl;
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.ScriptOverrides;
import org.openscada.configurator.module.common.processing.handler.ScriptOverridesHandler;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Script Overrides</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ScriptOverridesImpl extends FileModuleImpl implements ScriptOverrides
{
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ScriptOverridesImpl ()
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
        return ProcessingPackage.Literals.SCRIPT_OVERRIDES;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Configuration configuration, final Project project )
    {
        try
        {
            new ScriptOverridesHandler ().process ( configuration, project, this );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }

} //ScriptOverridesImpl

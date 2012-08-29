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
import org.openscada.configurator.module.common.processing.OverrideListModule;
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.handler.OverrideListHandler;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Override List Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OverrideListModuleImpl extends FileModuleImpl implements OverrideListModule
{
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected OverrideListModuleImpl ()
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
        return ProcessingPackage.Literals.OVERRIDE_LIST_MODULE;
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
            new OverrideListHandler ().process ( configuration, project, this );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }
} //OverrideListModuleImpl

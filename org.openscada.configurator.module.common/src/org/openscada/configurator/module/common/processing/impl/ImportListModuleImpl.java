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
import org.openscada.configurator.module.common.processing.ImportListModule;
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.handler.ImportListHandler;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Import List Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImportListModuleImpl extends FileModuleImpl implements ImportListModule
{
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ImportListModuleImpl ()
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
        return ProcessingPackage.Literals.IMPORT_LIST_MODULE;
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
            new ImportListHandler ().process ( configuration, project, this );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }

} //ImportListModuleImpl

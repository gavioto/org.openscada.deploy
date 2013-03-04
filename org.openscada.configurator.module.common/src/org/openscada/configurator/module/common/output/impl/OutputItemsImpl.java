/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.output.OutputItems;
import org.openscada.configurator.module.common.output.OutputPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Items</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OutputItemsImpl extends EObjectImpl implements OutputItems
{
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected OutputItemsImpl ()
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
        return OutputPackage.Literals.OUTPUT_ITEMS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void process ( Configuration configuration, Project project )
    {
        configuration.outputItems ();
    }

} //OutputItemsImpl

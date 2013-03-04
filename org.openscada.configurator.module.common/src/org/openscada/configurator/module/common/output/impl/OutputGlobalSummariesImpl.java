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
import org.openscada.configurator.module.common.output.OutputGlobalSummaries;
import org.openscada.configurator.module.common.output.OutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Summaries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OutputGlobalSummariesImpl extends EObjectImpl implements OutputGlobalSummaries
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputGlobalSummariesImpl ()
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
        return OutputPackage.Literals.OUTPUT_GLOBAL_SUMMARIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void process ( Configuration configuration, Project project )
    {
        configuration.outputGlobalSummaries ();
    }

} //OutputGlobalSummariesImpl

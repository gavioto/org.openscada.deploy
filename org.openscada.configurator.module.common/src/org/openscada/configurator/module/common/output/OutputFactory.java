/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.module.common.output.OutputPackage
 * @generated
 */
public interface OutputFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    OutputFactory eINSTANCE = org.openscada.configurator.module.common.output.impl.OutputFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Averages</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Averages</em>'.
     * @generated
     */
    OutputAverages createOutputAverages ();

    /**
     * Returns a new object of class '<em>Items</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Items</em>'.
     * @generated
     */
    OutputItems createOutputItems ();

    /**
     * Returns a new object of class '<em>Summaries</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Summaries</em>'.
     * @generated
     */
    OutputSummaries createOutputSummaries ();

    /**
     * Returns a new object of class '<em>Global Summaries</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Global Summaries</em>'.
     * @generated
     */
    OutputGlobalSummaries createOutputGlobalSummaries ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    OutputPackage getOutputPackage ();

} //OutputFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.module.common.summary.SummaryPackage
 * @generated
 */
public interface SummaryFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SummaryFactory eINSTANCE = org.openscada.configurator.module.common.summary.impl.SummaryFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>File Loader</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Loader</em>'.
     * @generated
     */
    SummaryFileLoader createSummaryFileLoader ();

    /**
     * Returns a new object of class '<em>Generate Summaries</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generate Summaries</em>'.
     * @generated
     */
    GenerateSummaries createGenerateSummaries ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SummaryPackage getSummaryPackage ();

} //SummaryFactory

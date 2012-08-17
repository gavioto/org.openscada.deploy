/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.scripts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.module.common.scripts.ScriptsPackage
 * @generated
 */
public interface ScriptsFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScriptsFactory eINSTANCE = org.openscada.configurator.module.common.scripts.impl.ScriptsFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Module</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module</em>'.
     * @generated
     */
    ScriptsModule createScriptsModule ();

    /**
     * Returns a new object of class '<em>Legacy Formula Module</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Legacy Formula Module</em>'.
     * @generated
     */
    LegacyFormulaModule createLegacyFormulaModule ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ScriptsPackage getScriptsPackage ();

} //ScriptsFactory

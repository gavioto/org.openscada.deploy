/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.module.common.processing.ProcessingPackage
 * @generated
 */
public interface ProcessingFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ProcessingFactory eINSTANCE = org.openscada.configurator.module.common.processing.impl.ProcessingFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Import Module</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Import Module</em>'.
     * @generated
     */
    ImportModule createImportModule ();

    /**
     * Returns a new object of class '<em>Override List Module</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Override List Module</em>'.
     * @generated
     */
    OverrideListModule createOverrideListModule ();

    /**
     * Returns a new object of class '<em>Import List Module</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Import List Module</em>'.
     * @generated
     */
    ImportListModule createImportListModule ();

    /**
     * Returns a new object of class '<em>Script Overrides</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Script Overrides</em>'.
     * @generated
     */
    ScriptOverrides createScriptOverrides ();

    /**
     * Returns a new object of class '<em>Remove Inactive</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remove Inactive</em>'.
     * @generated
     */
    RemoveInactive createRemoveInactive ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ProcessingPackage getProcessingPackage ();

} //ProcessingFactory

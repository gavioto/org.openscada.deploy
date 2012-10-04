/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.main;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.module.common.main.MainPackage
 * @generated
 */
public interface MainFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MainFactory eINSTANCE = org.openscada.configurator.module.common.main.impl.MainFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Loader</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Loader</em>'.
     * @generated
     */
    MainLoader createMainLoader ();

    /**
     * Returns a new object of class '<em>Validate Configuration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Validate Configuration</em>'.
     * @generated
     */
    ValidateConfiguration createValidateConfiguration ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MainPackage getMainPackage ();

} //MainFactory

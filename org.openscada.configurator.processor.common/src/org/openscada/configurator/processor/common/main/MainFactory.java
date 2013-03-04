/**
 */
package org.openscada.configurator.processor.common.main;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.processor.common.main.MainPackage
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
    MainFactory eINSTANCE = org.openscada.configurator.processor.common.main.impl.MainFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Authorization Loader</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Authorization Loader</em>'.
     * @generated
     */
    AuthorizationLoader createAuthorizationLoader ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MainPackage getMainPackage ();

} //MainFactory

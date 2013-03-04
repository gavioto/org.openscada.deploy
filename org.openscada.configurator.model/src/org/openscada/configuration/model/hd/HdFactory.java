/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configuration.model.hd.HdPackage
 * @generated
 */
public interface HdFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HdFactory eINSTANCE = org.openscada.configuration.model.hd.impl.HdFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Configuration Slot</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Configuration Slot</em>'.
     * @generated
     */
    ConfigurationSlot createConfigurationSlot ();

    /**
     * Returns a new object of class '<em>Storage Command Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Storage Command Generator</em>'.
     * @generated
     */
    StorageCommandGenerator createStorageCommandGenerator ();

    /**
     * Returns a new object of class '<em>HD Item Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>HD Item Generator</em>'.
     * @generated
     */
    HDItemGenerator createHDItemGenerator ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    HdPackage getHdPackage ();

} //HdFactory

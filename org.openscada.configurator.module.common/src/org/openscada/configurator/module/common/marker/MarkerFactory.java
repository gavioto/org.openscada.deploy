/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.marker;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.module.common.marker.MarkerPackage
 * @generated
 */
public interface MarkerFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MarkerFactory eINSTANCE = org.openscada.configurator.module.common.marker.impl.MarkerFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Level Marker Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Level Marker Generator</em>'.
     * @generated
     */
    LevelMarkerGenerator createLevelMarkerGenerator ();

    /**
     * Returns a new object of class '<em>Marker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Marker</em>'.
     * @generated
     */
    Marker createMarker ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MarkerPackage getMarkerPackage ();

} //MarkerFactory

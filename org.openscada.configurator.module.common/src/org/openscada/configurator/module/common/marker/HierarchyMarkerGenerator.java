/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.marker;

import org.eclipse.emf.common.util.EList;
import org.openscada.configuration.model.master.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy Marker Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.marker.HierarchyMarkerGenerator#getMarkerName <em>Marker Name</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.marker.HierarchyMarkerGenerator#getMarkers <em>Markers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.marker.MarkerPackage#getHierarchyMarkerGenerator()
 * @model
 * @generated
 */
public interface HierarchyMarkerGenerator extends Module
{
    /**
     * Returns the value of the '<em><b>Marker Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Marker Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Marker Name</em>' attribute.
     * @see #setMarkerName(String)
     * @see org.openscada.configurator.module.common.marker.MarkerPackage#getHierarchyMarkerGenerator_MarkerName()
     * @model required="true"
     * @generated
     */
    String getMarkerName ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.marker.HierarchyMarkerGenerator#getMarkerName <em>Marker Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Marker Name</em>' attribute.
     * @see #getMarkerName()
     * @generated
     */
    void setMarkerName ( String value );

    /**
     * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configurator.module.common.marker.Marker}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Markers</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Markers</em>' containment reference list.
     * @see org.openscada.configurator.module.common.marker.MarkerPackage#getHierarchyMarkerGenerator_Markers()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Marker> getMarkers ();

} // HierarchyMarkerGenerator

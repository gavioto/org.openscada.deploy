/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.LevelMonitor#getPreset <em>Preset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getLevelMonitor()
 * @model
 * @generated
 */
public interface LevelMonitor extends Monitor
{
    /**
     * Returns the value of the '<em><b>Preset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preset</em>' attribute.
     * @see #setPreset(Double)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getLevelMonitor_Preset()
     * @model
     * @generated
     */
    Double getPreset ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.LevelMonitor#getPreset <em>Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preset</em>' attribute.
     * @see #getPreset()
     * @generated
     */
    void setPreset ( Double value );

} // LevelMonitor

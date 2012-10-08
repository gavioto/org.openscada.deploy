/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output;

import org.openscada.configuration.model.master.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.output.WriteOutput#getBaseDirectory <em>Base Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.output.OutputPackage#getWriteOutput()
 * @model
 * @generated
 */
public interface WriteOutput extends Module
{
    /**
     * Returns the value of the '<em><b>Base Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Directory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Directory</em>' attribute.
     * @see #setBaseDirectory(String)
     * @see org.openscada.configurator.module.common.output.OutputPackage#getWriteOutput_BaseDirectory()
     * @model required="true"
     * @generated
     */
    String getBaseDirectory ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.output.WriteOutput#getBaseDirectory <em>Base Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Directory</em>' attribute.
     * @see #getBaseDirectory()
     * @generated
     */
    void setBaseDirectory ( String value );

} // WriteOutput

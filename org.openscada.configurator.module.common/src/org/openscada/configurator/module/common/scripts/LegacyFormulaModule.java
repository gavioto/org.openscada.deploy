/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.scripts;

import org.openscada.configuration.model.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Formula Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.scripts.LegacyFormulaModule#getFormulaFile <em>Formula File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.scripts.ScriptsPackage#getLegacyFormulaModule()
 * @model
 * @generated
 */
public interface LegacyFormulaModule extends Module
{
    /**
     * Returns the value of the '<em><b>Formula File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formula File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Formula File</em>' attribute.
     * @see #setFormulaFile(String)
     * @see org.openscada.configurator.module.common.scripts.ScriptsPackage#getLegacyFormulaModule_FormulaFile()
     * @model required="true"
     * @generated
     */
    String getFormulaFile ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.scripts.LegacyFormulaModule#getFormulaFile <em>Formula File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Formula File</em>' attribute.
     * @see #getFormulaFile()
     * @generated
     */
    void setFormulaFile ( String value );

} // LegacyFormulaModule

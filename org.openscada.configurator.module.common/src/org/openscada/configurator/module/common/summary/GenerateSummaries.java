/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary;

import java.util.regex.Pattern;

import org.openscada.configuration.model.master.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generate Summaries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.summary.GenerateSummaries#getSubItemPattern <em>Sub Item Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.summary.SummaryPackage#getGenerateSummaries()
 * @model
 * @generated
 */
public interface GenerateSummaries extends Module
{

    /**
     * Returns the value of the '<em><b>Sub Item Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Item Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Item Pattern</em>' attribute.
     * @see #setSubItemPattern(Pattern)
     * @see org.openscada.configurator.module.common.summary.SummaryPackage#getGenerateSummaries_SubItemPattern()
     * @model dataType="org.openscada.configurator.module.common.Pattern"
     * @generated
     */
    Pattern getSubItemPattern ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.summary.GenerateSummaries#getSubItemPattern <em>Sub Item Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Item Pattern</em>' attribute.
     * @see #getSubItemPattern()
     * @generated
     */
    void setSubItemPattern ( Pattern value );
} // GenerateSummaries

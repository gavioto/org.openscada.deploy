/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary;

import org.openscada.configuration.model.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generate Summaries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.summary.GenerateSummaries#getRequiredItems <em>Required Items</em>}</li>
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
     * Returns the value of the '<em><b>Required Items</b></em>' attribute.
     * The default value is <code>"2"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required Items</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Required Items</em>' attribute.
     * @see #setRequiredItems(int)
     * @see org.openscada.configurator.module.common.summary.SummaryPackage#getGenerateSummaries_RequiredItems()
     * @model default="2" required="true"
     * @generated
     */
    int getRequiredItems ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.summary.GenerateSummaries#getRequiredItems <em>Required Items</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Required Items</em>' attribute.
     * @see #getRequiredItems()
     * @generated
     */
    void setRequiredItems ( int value );
} // GenerateSummaries

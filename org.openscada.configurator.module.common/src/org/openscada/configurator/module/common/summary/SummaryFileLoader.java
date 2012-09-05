/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary;

import org.openscada.configurator.module.common.FileModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.summary.SummaryFileLoader#getRequiredItems <em>Required Items</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.summary.SummaryFileLoader#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.summary.SummaryPackage#getSummaryFileLoader()
 * @model
 * @generated
 */
public interface SummaryFileLoader extends FileModule
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
     * @see org.openscada.configurator.module.common.summary.SummaryPackage#getSummaryFileLoader_RequiredItems()
     * @model default="2" required="true"
     * @generated
     */
    int getRequiredItems ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.summary.SummaryFileLoader#getRequiredItems <em>Required Items</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Required Items</em>' attribute.
     * @see #getRequiredItems()
     * @generated
     */
    void setRequiredItems ( int value );

    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #setPrefix(String)
     * @see org.openscada.configurator.module.common.summary.SummaryPackage#getSummaryFileLoader_Prefix()
     * @model
     * @generated
     */
    String getPrefix ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.summary.SummaryFileLoader#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #getPrefix()
     * @generated
     */
    void setPrefix ( String value );
} // SummaryFileLoader

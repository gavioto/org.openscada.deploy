/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global;

import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.ItemSelector#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.global.GlobalPackage#getItemSelector()
 * @model abstract="true"
 * @generated
 */
public interface ItemSelector extends EObject
{
    /**
     * Returns the value of the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pattern</em>' attribute.
     * @see #setPattern(Pattern)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getItemSelector_Pattern()
     * @model dataType="org.openscada.configurator.processor.common.Pattern" required="true"
     * @generated
     */
    Pattern getPattern ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.ItemSelector#getPattern <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pattern</em>' attribute.
     * @see #getPattern()
     * @generated
     */
    void setPattern ( Pattern value );

} // ItemSelector

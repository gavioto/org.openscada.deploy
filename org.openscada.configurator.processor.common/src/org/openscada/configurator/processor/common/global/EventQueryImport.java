/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Query Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.EventQueryImport#getLocalPoolSize <em>Local Pool Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.global.GlobalPackage#getEventQueryImport()
 * @model
 * @generated
 */
public interface EventQueryImport extends QueryImport
{

    /**
     * Returns the value of the '<em><b>Local Pool Size</b></em>' attribute.
     * The default value is <code>"10000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Pool Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Pool Size</em>' attribute.
     * @see #setLocalPoolSize(int)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getEventQueryImport_LocalPoolSize()
     * @model default="10000" required="true"
     * @generated
     */
    int getLocalPoolSize ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.EventQueryImport#getLocalPoolSize <em>Local Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Pool Size</em>' attribute.
     * @see #getLocalPoolSize()
     * @generated
     */
    void setLocalPoolSize ( int value );
} // EventQueryImport

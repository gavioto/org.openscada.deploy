/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.QueryImport#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.QueryImport#isIncludeLocal <em>Include Local</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.QueryImport#getRemoteName <em>Remote Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.global.GlobalPackage#getQueryImport()
 * @model abstract="true"
 * @generated
 */
public interface QueryImport extends EObject
{
    /**
     * Returns the value of the '<em><b>Local Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Name</em>' attribute.
     * @see #setLocalName(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getQueryImport_LocalName()
     * @model required="true"
     * @generated
     */
    String getLocalName ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.QueryImport#getLocalName <em>Local Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Name</em>' attribute.
     * @see #getLocalName()
     * @generated
     */
    void setLocalName ( String value );

    /**
     * Returns the value of the '<em><b>Include Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Include Local</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Include Local</em>' attribute.
     * @see #setIncludeLocal(boolean)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getQueryImport_IncludeLocal()
     * @model required="true"
     * @generated
     */
    boolean isIncludeLocal ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.QueryImport#isIncludeLocal <em>Include Local</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Include Local</em>' attribute.
     * @see #isIncludeLocal()
     * @generated
     */
    void setIncludeLocal ( boolean value );

    /**
     * Returns the value of the '<em><b>Remote Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Name</em>' attribute.
     * @see #setRemoteName(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getQueryImport_RemoteName()
     * @model required="true"
     * @generated
     */
    String getRemoteName ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.QueryImport#getRemoteName <em>Remote Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Name</em>' attribute.
     * @see #getRemoteName()
     * @generated
     */
    void setRemoteName ( String value );

} // QueryImport

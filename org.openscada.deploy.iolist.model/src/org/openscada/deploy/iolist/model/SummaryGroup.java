/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summary Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.SummaryGroup#getItems <em>Items</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.SummaryGroup#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.SummaryGroup#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getSummaryGroup()
 * @model
 * @generated
 */
public interface SummaryGroup extends EObject
{
    /**
     * Returns the value of the '<em><b>Items</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.SummaryItem}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Items</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getSummaryGroup_Items()
     * @model containment="true"
     * @generated
     */
    EList<SummaryItem> getItems();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getSummaryGroup_Id()
     * @model id="true" required="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.SummaryGroup#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Hierarchy</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hierarchy</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hierarchy</em>' attribute list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getSummaryGroup_Hierarchy()
     * @model
     * @generated
     */
    EList<String> getHierarchy();

} // SummaryGroup

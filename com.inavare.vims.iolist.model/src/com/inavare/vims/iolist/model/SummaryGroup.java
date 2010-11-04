/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.inavare.vims.iolist.model;

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
 *   <li>{@link com.inavare.vims.iolist.model.SummaryGroup#getItems <em>Items</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.SummaryGroup#getId <em>Id</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.SummaryGroup#getLocation <em>Location</em>}</li>
 *   <li>{@link com.inavare.vims.iolist.model.SummaryGroup#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.inavare.vims.iolist.model.ModelPackage#getSummaryGroup()
 * @model
 * @generated
 */
public interface SummaryGroup extends EObject
{
    /**
     * Returns the value of the '<em><b>Items</b></em>' containment reference list.
     * The list contents are of type {@link com.inavare.vims.iolist.model.SummaryItem}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Items</em>' containment reference list.
     * @see com.inavare.vims.iolist.model.ModelPackage#getSummaryGroup_Items()
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
     * @see com.inavare.vims.iolist.model.ModelPackage#getSummaryGroup_Id()
     * @model id="true" required="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.SummaryGroup#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getSummaryGroup_Location()
     * @model
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.SummaryGroup#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
    void setLocation(String value);

    /**
     * Returns the value of the '<em><b>Component</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' attribute.
     * @see #setComponent(String)
     * @see com.inavare.vims.iolist.model.ModelPackage#getSummaryGroup_Component()
     * @model
     * @generated
     */
    String getComponent();

    /**
     * Sets the value of the '{@link com.inavare.vims.iolist.model.SummaryGroup#getComponent <em>Component</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component</em>' attribute.
     * @see #getComponent()
     * @generated
     */
    void setComponent(String value);

} // SummaryGroup

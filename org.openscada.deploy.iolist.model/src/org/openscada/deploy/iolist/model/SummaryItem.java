/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summary Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.SummaryItem#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.SummaryItem#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getSummaryItem()
 * @model
 * @generated
 */
public interface SummaryItem extends EObject
{
    /**
     * Returns the value of the '<em><b>Data Source Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Source Id</em>' attribute.
     * @see #setDataSourceId(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getSummaryItem_DataSourceId()
     * @model required="true"
     * @generated
     */
    String getDataSourceId ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.SummaryItem#getDataSourceId <em>Data Source Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Source Id</em>' attribute.
     * @see #getDataSourceId()
     * @generated
     */
    void setDataSourceId ( String value );

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getSummaryItem_Type()
     * @model required="true"
     * @generated
     */
    String getType ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.SummaryItem#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType ( String value );

} // SummaryItem

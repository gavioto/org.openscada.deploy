/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Average Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.AverageItem#getAverage <em>Average</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.AverageItem#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getAverageItem()
 * @model
 * @generated
 */
public interface AverageItem extends Item
{
    /**
     * Returns the value of the '<em><b>Average</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Average</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Average</em>' reference.
     * @see #setAverage(Average)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getAverageItem_Average()
     * @model keys="id" required="true"
     * @generated
     */
    Average getAverage ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.AverageItem#getAverage <em>Average</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Average</em>' reference.
     * @see #getAverage()
     * @generated
     */
    void setAverage ( Average value );

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"MEAN"</code>.
     * The literals are from the enumeration {@link org.openscada.deploy.iolist.model.AverageReferenceType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.AverageReferenceType
     * @see #setType(AverageReferenceType)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getAverageItem_Type()
     * @model default="MEAN"
     * @generated
     */
    AverageReferenceType getType ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.AverageItem#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.AverageReferenceType
     * @see #getType()
     * @generated
     */
    void setType ( AverageReferenceType value );

} // AverageItem

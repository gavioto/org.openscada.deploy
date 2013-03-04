/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moving Average Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.MovingAverageItem#getAverage <em>Average</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.MovingAverageItem#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getMovingAverageItem()
 * @model
 * @generated
 */
public interface MovingAverageItem extends Item
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
     * @see #setAverage(MovingAverage)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMovingAverageItem_Average()
     * @model keys="id" required="true"
     * @generated
     */
    MovingAverage getAverage ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.MovingAverageItem#getAverage <em>Average</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Average</em>' reference.
     * @see #getAverage()
     * @generated
     */
    void setAverage ( MovingAverage value );

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.openscada.deploy.iolist.model.MovingAverageReferenceType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.MovingAverageReferenceType
     * @see #setType(MovingAverageReferenceType)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMovingAverageItem_Type()
     * @model required="true"
     * @generated
     */
    MovingAverageReferenceType getType ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.MovingAverageItem#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.MovingAverageReferenceType
     * @see #getType()
     * @generated
     */
    void setType ( MovingAverageReferenceType value );

} // MovingAverageItem

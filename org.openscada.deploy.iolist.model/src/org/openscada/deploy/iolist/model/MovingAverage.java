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
 * A representation of the model object '<em><b>Moving Average</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.MovingAverage#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.MovingAverage#getSource <em>Source</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.MovingAverage#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.MovingAverage#getRange <em>Range</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.MovingAverage#getNullRange <em>Null Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getMovingAverage()
 * @model
 * @generated
 */
public interface MovingAverage extends EObject
{
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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMovingAverage_Id()
     * @model required="true"
     * @generated
     */
    String getId ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.MovingAverage#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId ( String value );

    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ID of the "datasource" to build the average from.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMovingAverage_Source()
     * @model required="true"
     * @generated
     */
    String getSource ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.MovingAverage#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource ( String value );

    /**
     * Returns the value of the '<em><b>Trigger</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A period time in seconds when the average will be updated although no value has changed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Trigger</em>' attribute.
     * @see #setTrigger(Long)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMovingAverage_Trigger()
     * @model
     * @generated
     */
    Long getTrigger ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.MovingAverage#getTrigger <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger</em>' attribute.
     * @see #getTrigger()
     * @generated
     */
    void setTrigger ( Long value );

    /**
     * Returns the value of the '<em><b>Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of seconds the average will be calculated for.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Range</em>' attribute.
     * @see #setRange(Long)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMovingAverage_Range()
     * @model
     * @generated
     */
    Long getRange ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.MovingAverage#getRange <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Range</em>' attribute.
     * @see #getRange()
     * @generated
     */
    void setRange ( Long value );

    /**
     * Returns the value of the '<em><b>Null Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of seconds the average must have recorded valid data in order to provide a valid (non-error) value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Null Range</em>' attribute.
     * @see #setNullRange(Long)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMovingAverage_NullRange()
     * @model
     * @generated
     */
    Long getNullRange ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.MovingAverage#getNullRange <em>Null Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Null Range</em>' attribute.
     * @see #getNullRange()
     * @generated
     */
    void setNullRange ( Long value );

} // MovingAverage

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
 * A representation of the model object '<em><b>Average</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.Average#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Average#getSources <em>Sources</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Average#getPercentRequired <em>Percent Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getAverage()
 * @model
 * @generated
 */
public interface Average extends EObject
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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getAverage_Id()
     * @model id="true" required="true"
     * @generated
     */
    String getId ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Average#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId ( String value );

    /**
     * Returns the value of the '<em><b>Sources</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sources</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sources</em>' attribute list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getAverage_Sources()
     * @model
     * @generated
     */
    EList<String> getSources ();

    /**
     * Returns the value of the '<em><b>Percent Required</b></em>' attribute.
     * The default value is <code>"1.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Percent Required</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Percent Required</em>' attribute.
     * @see #setPercentRequired(double)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getAverage_PercentRequired()
     * @model default="1.0"
     * @generated
     */
    double getPercentRequired ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Average#getPercentRequired <em>Percent Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Percent Required</em>' attribute.
     * @see #getPercentRequired()
     * @generated
     */
    void setPercentRequired ( double value );

} // Average

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
 * A representation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.Mapper#getMapperId <em>Mapper Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Mapper#getFromAttribute <em>From Attribute</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Mapper#getToAttribute <em>To Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getMapper()
 * @model
 * @generated
 */
public interface Mapper extends EObject
{
    /**
     * Returns the value of the '<em><b>Mapper Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapper Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapper Id</em>' attribute.
     * @see #setMapperId(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMapper_MapperId()
     * @model required="true"
     * @generated
     */
    String getMapperId();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Mapper#getMapperId <em>Mapper Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapper Id</em>' attribute.
     * @see #getMapperId()
     * @generated
     */
    void setMapperId(String value);

    /**
     * Returns the value of the '<em><b>From Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Attribute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Attribute</em>' attribute.
     * @see #setFromAttribute(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMapper_FromAttribute()
     * @model
     * @generated
     */
    String getFromAttribute();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Mapper#getFromAttribute <em>From Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Attribute</em>' attribute.
     * @see #getFromAttribute()
     * @generated
     */
    void setFromAttribute(String value);

    /**
     * Returns the value of the '<em><b>To Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Attribute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To Attribute</em>' attribute.
     * @see #setToAttribute(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getMapper_ToAttribute()
     * @model
     * @generated
     */
    String getToAttribute();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.Mapper#getToAttribute <em>To Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To Attribute</em>' attribute.
     * @see #getToAttribute()
     * @generated
     */
    void setToAttribute(String value);

} // Mapper

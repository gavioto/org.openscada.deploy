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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.Model#getItems <em>Items</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.Model#getAverages <em>Averages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
    /**
     * Returns the value of the '<em><b>Items</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.Item}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Items</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getModel_Items()
     * @model containment="true"
     * @generated
     */
    EList<Item> getItems ();

    /**
     * Returns the value of the '<em><b>Averages</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.Average}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Averages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Averages</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getModel_Averages()
     * @model containment="true"
     * @generated
     */
    EList<Average> getAverages ();

} // Model

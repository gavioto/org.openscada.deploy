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
 *   <li>{@link org.openscada.deploy.iolist.model.SummaryGroup#getDataSourceIds <em>Data Source Ids</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.SummaryGroup#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getSummaryGroup()
 * @model abstract="true"
 * @generated
 */
public interface SummaryGroup extends EObject
{
    /**
     * Returns the value of the '<em><b>Data Source Ids</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Source Ids</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Source Ids</em>' attribute list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getSummaryGroup_DataSourceIds()
     * @model
     * @generated
     */
    EList<String> getDataSourceIds ();

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
    EList<String> getHierarchy ();

} // SummaryGroup

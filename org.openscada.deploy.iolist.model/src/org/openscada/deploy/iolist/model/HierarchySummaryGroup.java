/**
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy Summary Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.HierarchySummaryGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.HierarchySummaryGroup#getParent <em>Parent</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.HierarchySummaryGroup#getChildren <em>Children</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.HierarchySummaryGroup#getWeakReferences <em>Weak References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getHierarchySummaryGroup()
 * @model
 * @generated
 */
public interface HierarchySummaryGroup extends SummaryGroup
{
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getHierarchySummaryGroup_Name()
     * @model required="true"
     * @generated
     */
    String getName ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.HierarchySummaryGroup#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName ( String value );

    /**
     * Returns the value of the '<em><b>Parent</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.openscada.deploy.iolist.model.HierarchySummaryGroup#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' container reference.
     * @see #setParent(HierarchySummaryGroup)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getHierarchySummaryGroup_Parent()
     * @see org.openscada.deploy.iolist.model.HierarchySummaryGroup#getChildren
     * @model opposite="children" transient="false"
     * @generated
     */
    HierarchySummaryGroup getParent ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.HierarchySummaryGroup#getParent <em>Parent</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' container reference.
     * @see #getParent()
     * @generated
     */
    void setParent ( HierarchySummaryGroup value );

    /**
     * Returns the value of the '<em><b>Children</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.HierarchySummaryGroup}.
     * It is bidirectional and its opposite is '{@link org.openscada.deploy.iolist.model.HierarchySummaryGroup#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getHierarchySummaryGroup_Children()
     * @see org.openscada.deploy.iolist.model.HierarchySummaryGroup#getParent
     * @model opposite="parent" containment="true"
     * @generated
     */
    EList<HierarchySummaryGroup> getChildren ();

    /**
     * Returns the value of the '<em><b>Weak References</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.WeakSummaryReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weak References</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weak References</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getHierarchySummaryGroup_WeakReferences()
     * @model containment="true"
     * @generated
     */
    EList<WeakSummaryReference> getWeakReferences ();

} // HierarchySummaryGroup

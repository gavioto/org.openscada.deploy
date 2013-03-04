/**
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weak Summary Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.WeakSummaryReference#getDataSourceId <em>Data Source Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getWeakSummaryReference()
 * @model
 * @generated
 */
public interface WeakSummaryReference extends EObject
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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getWeakSummaryReference_DataSourceId()
     * @model required="true"
     * @generated
     */
    String getDataSourceId ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.WeakSummaryReference#getDataSourceId <em>Data Source Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Source Id</em>' attribute.
     * @see #getDataSourceId()
     * @generated
     */
    void setDataSourceId ( String value );

} // WeakSummaryReference

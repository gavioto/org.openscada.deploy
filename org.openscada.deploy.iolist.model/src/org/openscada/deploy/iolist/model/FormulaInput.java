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
 * A representation of the model object '<em><b>Formula Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaInput#getName <em>Name</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaInput#getDatasourceId <em>Datasource Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaInput#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaInput()
 * @model
 * @generated
 */
public interface FormulaInput extends EObject
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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaInput_Name()
     * @model required="true"
     * @generated
     */
    String getName ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.FormulaInput#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName ( String value );

    /**
     * Returns the value of the '<em><b>Datasource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Datasource Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Datasource Id</em>' attribute.
     * @see #setDatasourceId(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaInput_DatasourceId()
     * @model required="true"
     * @generated
     */
    String getDatasourceId ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.FormulaInput#getDatasourceId <em>Datasource Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datasource Id</em>' attribute.
     * @see #getDatasourceId()
     * @generated
     */
    void setDatasourceId ( String value );

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.openscada.deploy.iolist.model.DataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.DataType
     * @see #setType(DataType)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaInput_Type()
     * @model required="true"
     * @generated
     */
    DataType getType ();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.FormulaInput#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.DataType
     * @see #getType()
     * @generated
     */
    void setType ( DataType value );

} // FormulaInput

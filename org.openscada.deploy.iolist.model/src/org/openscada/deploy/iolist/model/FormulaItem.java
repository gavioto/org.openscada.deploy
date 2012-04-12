/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaItem#getInputFormula <em>Input Formula</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputFormula <em>Output Formula</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaItem#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceId <em>Output Datasource Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaItem#getWriteValueName <em>Write Value Name</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaItem#getInitScript <em>Init Script</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceType <em>Output Datasource Type</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.FormulaItem#getScriptModules <em>Script Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaItem()
 * @model
 * @generated
 */
public interface FormulaItem extends Item
{
    /**
     * Returns the value of the '<em><b>Input Formula</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Formula</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Formula</em>' attribute.
     * @see #setInputFormula(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaItem_InputFormula()
     * @model
     * @generated
     */
    String getInputFormula();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.FormulaItem#getInputFormula <em>Input Formula</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Formula</em>' attribute.
     * @see #getInputFormula()
     * @generated
     */
    void setInputFormula(String value);

    /**
     * Returns the value of the '<em><b>Output Formula</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Formula</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Formula</em>' attribute.
     * @see #setOutputFormula(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaItem_OutputFormula()
     * @model
     * @generated
     */
    String getOutputFormula();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputFormula <em>Output Formula</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Formula</em>' attribute.
     * @see #getOutputFormula()
     * @generated
     */
    void setOutputFormula(String value);

    /**
     * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.FormulaInput}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaItem_Inputs()
     * @model containment="true"
     * @generated
     */
    EList<FormulaInput> getInputs();

    /**
     * Returns the value of the '<em><b>Output Datasource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Datasource Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Datasource Id</em>' attribute.
     * @see #setOutputDatasourceId(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaItem_OutputDatasourceId()
     * @model
     * @generated
     */
    String getOutputDatasourceId();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceId <em>Output Datasource Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Datasource Id</em>' attribute.
     * @see #getOutputDatasourceId()
     * @generated
     */
    void setOutputDatasourceId(String value);

    /**
     * Returns the value of the '<em><b>Write Value Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Write Value Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Write Value Name</em>' attribute.
     * @see #setWriteValueName(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaItem_WriteValueName()
     * @model
     * @generated
     */
    String getWriteValueName();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.FormulaItem#getWriteValueName <em>Write Value Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Write Value Name</em>' attribute.
     * @see #getWriteValueName()
     * @generated
     */
    void setWriteValueName(String value);

    /**
     * Returns the value of the '<em><b>Init Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Init Script</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Init Script</em>' attribute.
     * @see #setInitScript(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaItem_InitScript()
     * @model
     * @generated
     */
    String getInitScript();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.FormulaItem#getInitScript <em>Init Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Init Script</em>' attribute.
     * @see #getInitScript()
     * @generated
     */
    void setInitScript(String value);

    /**
     * Returns the value of the '<em><b>Output Datasource Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.openscada.deploy.iolist.model.DataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Datasource Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Datasource Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.DataType
     * @see #setOutputDatasourceType(DataType)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaItem_OutputDatasourceType()
     * @model
     * @generated
     */
    DataType getOutputDatasourceType();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.FormulaItem#getOutputDatasourceType <em>Output Datasource Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Datasource Type</em>' attribute.
     * @see org.openscada.deploy.iolist.model.DataType
     * @see #getOutputDatasourceType()
     * @generated
     */
    void setOutputDatasourceType(DataType value);

    /**
     * Returns the value of the '<em><b>Script Modules</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.ScriptModule}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script Modules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script Modules</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getFormulaItem_ScriptModules()
     * @model containment="true"
     * @generated
     */
    EList<ScriptModule> getScriptModules();

} // FormulaItem

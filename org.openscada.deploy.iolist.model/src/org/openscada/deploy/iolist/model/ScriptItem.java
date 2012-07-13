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
 * A representation of the model object '<em><b>Script Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptItem#getScriptEngine <em>Script Engine</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptItem#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptItem#getInitScript <em>Init Script</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptItem#getUpdateScript <em>Update Script</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptItem#getTimerScript <em>Timer Script</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptItem#getTimerPeriod <em>Timer Period</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptItem#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptItem#getWriteCommand <em>Write Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptItem()
 * @model
 * @generated
 */
public interface ScriptItem extends Item
{
    /**
     * Returns the value of the '<em><b>Script Engine</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script Engine</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script Engine</em>' attribute.
     * @see #setScriptEngine(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptItem_ScriptEngine()
     * @model
     * @generated
     */
    String getScriptEngine();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ScriptItem#getScriptEngine <em>Script Engine</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script Engine</em>' attribute.
     * @see #getScriptEngine()
     * @generated
     */
    void setScriptEngine(String value);

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptItem_Inputs()
     * @model containment="true"
     * @generated
     */
    EList<FormulaInput> getInputs();

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
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptItem_InitScript()
     * @model
     * @generated
     */
    String getInitScript();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ScriptItem#getInitScript <em>Init Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Init Script</em>' attribute.
     * @see #getInitScript()
     * @generated
     */
    void setInitScript(String value);

    /**
     * Returns the value of the '<em><b>Update Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Update Script</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Update Script</em>' attribute.
     * @see #setUpdateScript(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptItem_UpdateScript()
     * @model
     * @generated
     */
    String getUpdateScript();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ScriptItem#getUpdateScript <em>Update Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Update Script</em>' attribute.
     * @see #getUpdateScript()
     * @generated
     */
    void setUpdateScript(String value);

    /**
     * Returns the value of the '<em><b>Timer Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timer Script</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timer Script</em>' attribute.
     * @see #setTimerScript(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptItem_TimerScript()
     * @model
     * @generated
     */
    String getTimerScript();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ScriptItem#getTimerScript <em>Timer Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timer Script</em>' attribute.
     * @see #getTimerScript()
     * @generated
     */
    void setTimerScript(String value);

    /**
     * Returns the value of the '<em><b>Timer Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timer Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timer Period</em>' attribute.
     * @see #setTimerPeriod(Long)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptItem_TimerPeriod()
     * @model
     * @generated
     */
    Long getTimerPeriod();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ScriptItem#getTimerPeriod <em>Timer Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timer Period</em>' attribute.
     * @see #getTimerPeriod()
     * @generated
     */
    void setTimerPeriod(Long value);

    /**
     * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.deploy.iolist.model.ScriptOutput}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' containment reference list.
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptItem_Outputs()
     * @model containment="true"
     * @generated
     */
    EList<ScriptOutput> getOutputs();

    /**
     * Returns the value of the '<em><b>Write Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Write Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Write Command</em>' attribute.
     * @see #setWriteCommand(String)
     * @see org.openscada.deploy.iolist.model.ModelPackage#getScriptItem_WriteCommand()
     * @model
     * @generated
     */
    String getWriteCommand();

    /**
     * Sets the value of the '{@link org.openscada.deploy.iolist.model.ScriptItem#getWriteCommand <em>Write Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Write Command</em>' attribute.
     * @see #getWriteCommand()
     * @generated
     */
    void setWriteCommand(String value);

} // ScriptItem

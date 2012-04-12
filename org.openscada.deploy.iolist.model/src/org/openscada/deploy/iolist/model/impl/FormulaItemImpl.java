/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.FormulaInput;
import org.openscada.deploy.iolist.model.FormulaItem;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.ScriptModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl#getInputFormula <em>Input Formula</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl#getOutputFormula <em>Output Formula</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl#getOutputDatasourceId <em>Output Datasource Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl#getWriteValueName <em>Write Value Name</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl#getInitScript <em>Init Script</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl#getOutputDatasourceType <em>Output Datasource Type</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.FormulaItemImpl#getScriptModules <em>Script Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormulaItemImpl extends ItemImpl implements FormulaItem
{
    /**
     * The default value of the '{@link #getInputFormula() <em>Input Formula</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputFormula()
     * @generated
     * @ordered
     */
    protected static final String INPUT_FORMULA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInputFormula() <em>Input Formula</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputFormula()
     * @generated
     * @ordered
     */
    protected String inputFormula = INPUT_FORMULA_EDEFAULT;

    /**
     * The default value of the '{@link #getOutputFormula() <em>Output Formula</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputFormula()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_FORMULA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutputFormula() <em>Output Formula</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputFormula()
     * @generated
     * @ordered
     */
    protected String outputFormula = OUTPUT_FORMULA_EDEFAULT;

    /**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
    protected EList<FormulaInput> inputs;

    /**
     * The default value of the '{@link #getOutputDatasourceId() <em>Output Datasource Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputDatasourceId()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_DATASOURCE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutputDatasourceId() <em>Output Datasource Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputDatasourceId()
     * @generated
     * @ordered
     */
    protected String outputDatasourceId = OUTPUT_DATASOURCE_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getWriteValueName() <em>Write Value Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWriteValueName()
     * @generated
     * @ordered
     */
    protected static final String WRITE_VALUE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWriteValueName() <em>Write Value Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWriteValueName()
     * @generated
     * @ordered
     */
    protected String writeValueName = WRITE_VALUE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getInitScript() <em>Init Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitScript()
     * @generated
     * @ordered
     */
    protected static final String INIT_SCRIPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitScript() <em>Init Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitScript()
     * @generated
     * @ordered
     */
    protected String initScript = INIT_SCRIPT_EDEFAULT;

    /**
     * The default value of the '{@link #getOutputDatasourceType() <em>Output Datasource Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputDatasourceType()
     * @generated
     * @ordered
     */
    protected static final DataType OUTPUT_DATASOURCE_TYPE_EDEFAULT = DataType.VARIANT;

    /**
     * The cached value of the '{@link #getOutputDatasourceType() <em>Output Datasource Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputDatasourceType()
     * @generated
     * @ordered
     */
    protected DataType outputDatasourceType = OUTPUT_DATASOURCE_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getScriptModules() <em>Script Modules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptModules()
     * @generated
     * @ordered
     */
    protected EList<ScriptModule> scriptModules;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FormulaItemImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return ModelPackage.Literals.FORMULA_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInputFormula()
    {
        return inputFormula;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputFormula(String newInputFormula)
    {
        String oldInputFormula = inputFormula;
        inputFormula = newInputFormula;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULA_ITEM__INPUT_FORMULA, oldInputFormula, inputFormula));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOutputFormula()
    {
        return outputFormula;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputFormula(String newOutputFormula)
    {
        String oldOutputFormula = outputFormula;
        outputFormula = newOutputFormula;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULA_ITEM__OUTPUT_FORMULA, oldOutputFormula, outputFormula));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FormulaInput> getInputs()
    {
        if (inputs == null)
        {
            inputs = new EObjectContainmentEList<FormulaInput>(FormulaInput.class, this, ModelPackage.FORMULA_ITEM__INPUTS);
        }
        return inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOutputDatasourceId()
    {
        return outputDatasourceId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputDatasourceId(String newOutputDatasourceId)
    {
        String oldOutputDatasourceId = outputDatasourceId;
        outputDatasourceId = newOutputDatasourceId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_ID, oldOutputDatasourceId, outputDatasourceId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWriteValueName()
    {
        return writeValueName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWriteValueName(String newWriteValueName)
    {
        String oldWriteValueName = writeValueName;
        writeValueName = newWriteValueName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULA_ITEM__WRITE_VALUE_NAME, oldWriteValueName, writeValueName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInitScript()
    {
        return initScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitScript(String newInitScript)
    {
        String oldInitScript = initScript;
        initScript = newInitScript;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULA_ITEM__INIT_SCRIPT, oldInitScript, initScript));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType getOutputDatasourceType()
    {
        return outputDatasourceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputDatasourceType(DataType newOutputDatasourceType)
    {
        DataType oldOutputDatasourceType = outputDatasourceType;
        outputDatasourceType = newOutputDatasourceType == null ? OUTPUT_DATASOURCE_TYPE_EDEFAULT : newOutputDatasourceType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE, oldOutputDatasourceType, outputDatasourceType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptModule> getScriptModules()
    {
        if (scriptModules == null)
        {
            scriptModules = new EObjectContainmentEList<ScriptModule>(ScriptModule.class, this, ModelPackage.FORMULA_ITEM__SCRIPT_MODULES);
        }
        return scriptModules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case ModelPackage.FORMULA_ITEM__INPUTS:
                return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
            case ModelPackage.FORMULA_ITEM__SCRIPT_MODULES:
                return ((InternalEList<?>)getScriptModules()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case ModelPackage.FORMULA_ITEM__INPUT_FORMULA:
                return getInputFormula();
            case ModelPackage.FORMULA_ITEM__OUTPUT_FORMULA:
                return getOutputFormula();
            case ModelPackage.FORMULA_ITEM__INPUTS:
                return getInputs();
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_ID:
                return getOutputDatasourceId();
            case ModelPackage.FORMULA_ITEM__WRITE_VALUE_NAME:
                return getWriteValueName();
            case ModelPackage.FORMULA_ITEM__INIT_SCRIPT:
                return getInitScript();
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE:
                return getOutputDatasourceType();
            case ModelPackage.FORMULA_ITEM__SCRIPT_MODULES:
                return getScriptModules();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case ModelPackage.FORMULA_ITEM__INPUT_FORMULA:
                setInputFormula((String)newValue);
                return;
            case ModelPackage.FORMULA_ITEM__OUTPUT_FORMULA:
                setOutputFormula((String)newValue);
                return;
            case ModelPackage.FORMULA_ITEM__INPUTS:
                getInputs().clear();
                getInputs().addAll((Collection<? extends FormulaInput>)newValue);
                return;
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_ID:
                setOutputDatasourceId((String)newValue);
                return;
            case ModelPackage.FORMULA_ITEM__WRITE_VALUE_NAME:
                setWriteValueName((String)newValue);
                return;
            case ModelPackage.FORMULA_ITEM__INIT_SCRIPT:
                setInitScript((String)newValue);
                return;
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE:
                setOutputDatasourceType((DataType)newValue);
                return;
            case ModelPackage.FORMULA_ITEM__SCRIPT_MODULES:
                getScriptModules().clear();
                getScriptModules().addAll((Collection<? extends ScriptModule>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case ModelPackage.FORMULA_ITEM__INPUT_FORMULA:
                setInputFormula(INPUT_FORMULA_EDEFAULT);
                return;
            case ModelPackage.FORMULA_ITEM__OUTPUT_FORMULA:
                setOutputFormula(OUTPUT_FORMULA_EDEFAULT);
                return;
            case ModelPackage.FORMULA_ITEM__INPUTS:
                getInputs().clear();
                return;
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_ID:
                setOutputDatasourceId(OUTPUT_DATASOURCE_ID_EDEFAULT);
                return;
            case ModelPackage.FORMULA_ITEM__WRITE_VALUE_NAME:
                setWriteValueName(WRITE_VALUE_NAME_EDEFAULT);
                return;
            case ModelPackage.FORMULA_ITEM__INIT_SCRIPT:
                setInitScript(INIT_SCRIPT_EDEFAULT);
                return;
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE:
                setOutputDatasourceType(OUTPUT_DATASOURCE_TYPE_EDEFAULT);
                return;
            case ModelPackage.FORMULA_ITEM__SCRIPT_MODULES:
                getScriptModules().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case ModelPackage.FORMULA_ITEM__INPUT_FORMULA:
                return INPUT_FORMULA_EDEFAULT == null ? inputFormula != null : !INPUT_FORMULA_EDEFAULT.equals(inputFormula);
            case ModelPackage.FORMULA_ITEM__OUTPUT_FORMULA:
                return OUTPUT_FORMULA_EDEFAULT == null ? outputFormula != null : !OUTPUT_FORMULA_EDEFAULT.equals(outputFormula);
            case ModelPackage.FORMULA_ITEM__INPUTS:
                return inputs != null && !inputs.isEmpty();
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_ID:
                return OUTPUT_DATASOURCE_ID_EDEFAULT == null ? outputDatasourceId != null : !OUTPUT_DATASOURCE_ID_EDEFAULT.equals(outputDatasourceId);
            case ModelPackage.FORMULA_ITEM__WRITE_VALUE_NAME:
                return WRITE_VALUE_NAME_EDEFAULT == null ? writeValueName != null : !WRITE_VALUE_NAME_EDEFAULT.equals(writeValueName);
            case ModelPackage.FORMULA_ITEM__INIT_SCRIPT:
                return INIT_SCRIPT_EDEFAULT == null ? initScript != null : !INIT_SCRIPT_EDEFAULT.equals(initScript);
            case ModelPackage.FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE:
                return outputDatasourceType != OUTPUT_DATASOURCE_TYPE_EDEFAULT;
            case ModelPackage.FORMULA_ITEM__SCRIPT_MODULES:
                return scriptModules != null && !scriptModules.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (inputFormula: ");
        result.append(inputFormula);
        result.append(", outputFormula: ");
        result.append(outputFormula);
        result.append(", outputDatasourceId: ");
        result.append(outputDatasourceId);
        result.append(", writeValueName: ");
        result.append(writeValueName);
        result.append(", initScript: ");
        result.append(initScript);
        result.append(", outputDatasourceType: ");
        result.append(outputDatasourceType);
        result.append(')');
        return result.toString();
    }

} //FormulaItemImpl

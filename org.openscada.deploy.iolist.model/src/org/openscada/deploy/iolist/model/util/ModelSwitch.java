/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.openscada.deploy.iolist.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openscada.deploy.iolist.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelSwitch()
    {
        if (modelPackage == null)
        {
            modelPackage = ModelPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage)
    {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject)
    {
        switch (classifierID)
        {
            case ModelPackage.ITEM:
            {
                Item item = (Item)theEObject;
                T result = caseItem(item);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SUMMARY_GROUP:
            {
                SummaryGroup summaryGroup = (SummaryGroup)theEObject;
                T result = caseSummaryGroup(summaryGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SUMMARY_ITEM:
            {
                SummaryItem summaryItem = (SummaryItem)theEObject;
                T result = caseSummaryItem(summaryItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.FORMULA_ITEM:
            {
                FormulaItem formulaItem = (FormulaItem)theEObject;
                T result = caseFormulaItem(formulaItem);
                if (result == null) result = caseItem(formulaItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.FORMULA_INPUT:
            {
                FormulaInput formulaInput = (FormulaInput)theEObject;
                T result = caseFormulaInput(formulaInput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SCRIPT_MODULE:
            {
                ScriptModule scriptModule = (ScriptModule)theEObject;
                T result = caseScriptModule(scriptModule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.MODEL:
            {
                Model model = (Model)theEObject;
                T result = caseModel(model);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SCRIPT_ITEM:
            {
                ScriptItem scriptItem = (ScriptItem)theEObject;
                T result = caseScriptItem(scriptItem);
                if (result == null) result = caseItem(scriptItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SCRIPT_OUTPUT:
            {
                ScriptOutput scriptOutput = (ScriptOutput)theEObject;
                T result = caseScriptOutput(scriptOutput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.MAPPER:
            {
                Mapper mapper = (Mapper)theEObject;
                T result = caseMapper(mapper);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseItem(Item object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Summary Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Summary Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSummaryGroup(SummaryGroup object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Summary Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Summary Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSummaryItem(SummaryItem object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formula Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formula Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormulaItem(FormulaItem object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formula Input</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formula Input</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormulaInput(FormulaInput object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScriptModule(ScriptModule object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModel(Model object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScriptItem(ScriptItem object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script Output</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScriptOutput(ScriptOutput object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mapper</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mapper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMapper(Mapper object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object)
    {
        return null;
    }

} //ModelSwitch

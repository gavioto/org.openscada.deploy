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
import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.AverageItem;
import org.openscada.deploy.iolist.model.BasicMonitor;
import org.openscada.deploy.iolist.model.BooleanMonitor;
import org.openscada.deploy.iolist.model.ConstantItem;
import org.openscada.deploy.iolist.model.FormulaInput;
import org.openscada.deploy.iolist.model.FormulaItem;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.LevelMonitor;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.Monitor;
import org.openscada.deploy.iolist.model.MovingAverage;
import org.openscada.deploy.iolist.model.MovingAverageItem;
import org.openscada.deploy.iolist.model.ScriptItem;
import org.openscada.deploy.iolist.model.ScriptModule;
import org.openscada.deploy.iolist.model.ScriptOutput;
import org.openscada.deploy.iolist.model.SummaryGroup;
import org.openscada.deploy.iolist.model.SummaryItem;

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
    public ModelSwitch ()
    {
        if ( modelPackage == null )
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
    protected boolean isSwitchFor ( EPackage ePackage )
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
    protected T doSwitch ( int classifierID, EObject theEObject )
    {
        switch ( classifierID )
        {
            case ModelPackage.ITEM:
            {
                Item item = (Item)theEObject;
                T result = caseItem ( item );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.SUMMARY_GROUP:
            {
                SummaryGroup summaryGroup = (SummaryGroup)theEObject;
                T result = caseSummaryGroup ( summaryGroup );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.SUMMARY_ITEM:
            {
                SummaryItem summaryItem = (SummaryItem)theEObject;
                T result = caseSummaryItem ( summaryItem );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.FORMULA_ITEM:
            {
                FormulaItem formulaItem = (FormulaItem)theEObject;
                T result = caseFormulaItem ( formulaItem );
                if ( result == null )
                    result = caseItem ( formulaItem );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.FORMULA_INPUT:
            {
                FormulaInput formulaInput = (FormulaInput)theEObject;
                T result = caseFormulaInput ( formulaInput );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.SCRIPT_MODULE:
            {
                ScriptModule scriptModule = (ScriptModule)theEObject;
                T result = caseScriptModule ( scriptModule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.MODEL:
            {
                Model model = (Model)theEObject;
                T result = caseModel ( model );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.SCRIPT_ITEM:
            {
                ScriptItem scriptItem = (ScriptItem)theEObject;
                T result = caseScriptItem ( scriptItem );
                if ( result == null )
                    result = caseItem ( scriptItem );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.SCRIPT_OUTPUT:
            {
                ScriptOutput scriptOutput = (ScriptOutput)theEObject;
                T result = caseScriptOutput ( scriptOutput );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.MAPPER:
            {
                Mapper mapper = (Mapper)theEObject;
                T result = caseMapper ( mapper );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.MONITOR:
            {
                Monitor monitor = (Monitor)theEObject;
                T result = caseMonitor ( monitor );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.LEVEL_MONITOR:
            {
                LevelMonitor levelMonitor = (LevelMonitor)theEObject;
                T result = caseLevelMonitor ( levelMonitor );
                if ( result == null )
                    result = caseBasicMonitor ( levelMonitor );
                if ( result == null )
                    result = caseMonitor ( levelMonitor );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.LIST_MONITOR:
            {
                ListMonitor listMonitor = (ListMonitor)theEObject;
                T result = caseListMonitor ( listMonitor );
                if ( result == null )
                    result = caseMonitor ( listMonitor );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.BOOLEAN_MONITOR:
            {
                BooleanMonitor booleanMonitor = (BooleanMonitor)theEObject;
                T result = caseBooleanMonitor ( booleanMonitor );
                if ( result == null )
                    result = caseBasicMonitor ( booleanMonitor );
                if ( result == null )
                    result = caseMonitor ( booleanMonitor );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.AVERAGE:
            {
                Average average = (Average)theEObject;
                T result = caseAverage ( average );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.AVERAGE_ITEM:
            {
                AverageItem averageItem = (AverageItem)theEObject;
                T result = caseAverageItem ( averageItem );
                if ( result == null )
                    result = caseItem ( averageItem );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.CONSTANT_ITEM:
            {
                ConstantItem constantItem = (ConstantItem)theEObject;
                T result = caseConstantItem ( constantItem );
                if ( result == null )
                    result = caseItem ( constantItem );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.MOVING_AVERAGE_ITEM:
            {
                MovingAverageItem movingAverageItem = (MovingAverageItem)theEObject;
                T result = caseMovingAverageItem ( movingAverageItem );
                if ( result == null )
                    result = caseItem ( movingAverageItem );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.MOVING_AVERAGE:
            {
                MovingAverage movingAverage = (MovingAverage)theEObject;
                T result = caseMovingAverage ( movingAverage );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.LIST_MONITOR_ENTRY:
            {
                ListMonitorEntry listMonitorEntry = (ListMonitorEntry)theEObject;
                T result = caseListMonitorEntry ( listMonitorEntry );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ModelPackage.BASIC_MONITOR:
            {
                BasicMonitor basicMonitor = (BasicMonitor)theEObject;
                T result = caseBasicMonitor ( basicMonitor );
                if ( result == null )
                    result = caseMonitor ( basicMonitor );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
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
    public T caseItem ( Item object )
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
    public T caseSummaryGroup ( SummaryGroup object )
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
    public T caseSummaryItem ( SummaryItem object )
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
    public T caseFormulaItem ( FormulaItem object )
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
    public T caseFormulaInput ( FormulaInput object )
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
    public T caseScriptModule ( ScriptModule object )
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
    public T caseModel ( Model object )
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
    public T caseScriptItem ( ScriptItem object )
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
    public T caseScriptOutput ( ScriptOutput object )
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
    public T caseMapper ( Mapper object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monitor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monitor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonitor ( Monitor object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Level Monitor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Level Monitor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLevelMonitor ( LevelMonitor object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>List Monitor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>List Monitor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseListMonitor ( ListMonitor object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boolean Monitor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean Monitor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanMonitor ( BooleanMonitor object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Average</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Average</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAverage ( Average object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Average Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Average Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAverageItem ( AverageItem object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constant Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constant Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstantItem ( ConstantItem object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Moving Average Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Moving Average Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMovingAverageItem ( MovingAverageItem object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Moving Average</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Moving Average</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMovingAverage ( MovingAverage object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>List Monitor Entry</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>List Monitor Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseListMonitorEntry ( ListMonitorEntry object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Basic Monitor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Basic Monitor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasicMonitor ( BasicMonitor object )
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
    public T defaultCase ( EObject object )
    {
        return null;
    }

} //ModelSwitch

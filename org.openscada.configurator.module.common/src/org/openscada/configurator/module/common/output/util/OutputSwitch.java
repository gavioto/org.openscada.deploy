/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openscada.configuration.model.master.Module;
import org.openscada.configurator.module.common.output.OutputAverages;
import org.openscada.configurator.module.common.output.OutputGlobalSummaries;
import org.openscada.configurator.module.common.output.OutputItems;
import org.openscada.configurator.module.common.output.OutputPackage;
import org.openscada.configurator.module.common.output.OutputSummaries;
import org.openscada.configurator.module.common.output.WriteOutput;

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
 * @see org.openscada.configurator.module.common.output.OutputPackage
 * @generated
 */
public class OutputSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static OutputPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputSwitch ()
    {
        if ( modelPackage == null )
        {
            modelPackage = OutputPackage.eINSTANCE;
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
            case OutputPackage.OUTPUT_AVERAGES:
            {
                OutputAverages outputAverages = (OutputAverages)theEObject;
                T result = caseOutputAverages ( outputAverages );
                if ( result == null )
                    result = caseModule ( outputAverages );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case OutputPackage.OUTPUT_ITEMS:
            {
                OutputItems outputItems = (OutputItems)theEObject;
                T result = caseOutputItems ( outputItems );
                if ( result == null )
                    result = caseModule ( outputItems );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case OutputPackage.OUTPUT_SUMMARIES:
            {
                OutputSummaries outputSummaries = (OutputSummaries)theEObject;
                T result = caseOutputSummaries ( outputSummaries );
                if ( result == null )
                    result = caseModule ( outputSummaries );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case OutputPackage.OUTPUT_GLOBAL_SUMMARIES:
            {
                OutputGlobalSummaries outputGlobalSummaries = (OutputGlobalSummaries)theEObject;
                T result = caseOutputGlobalSummaries ( outputGlobalSummaries );
                if ( result == null )
                    result = caseModule ( outputGlobalSummaries );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case OutputPackage.WRITE_OUTPUT:
            {
                WriteOutput writeOutput = (WriteOutput)theEObject;
                T result = caseWriteOutput ( writeOutput );
                if ( result == null )
                    result = caseModule ( writeOutput );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Averages</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Averages</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputAverages ( OutputAverages object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Items</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Items</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputItems ( OutputItems object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Summaries</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Summaries</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputSummaries ( OutputSummaries object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global Summaries</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global Summaries</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputGlobalSummaries ( OutputGlobalSummaries object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Write Output</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Write Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWriteOutput ( WriteOutput object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModule ( Module object )
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

} //OutputSwitch

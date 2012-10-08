/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openscada.configuration.model.master.Module;
import org.openscada.configurator.module.common.FileModule;
import org.openscada.configurator.module.common.processing.ImportListModule;
import org.openscada.configurator.module.common.processing.ImportModule;
import org.openscada.configurator.module.common.processing.OverrideListModule;
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.RemoveInactive;
import org.openscada.configurator.module.common.processing.ScriptOverrides;

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
 * @see org.openscada.configurator.module.common.processing.ProcessingPackage
 * @generated
 */
public class ProcessingSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ProcessingPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessingSwitch ()
    {
        if ( modelPackage == null )
        {
            modelPackage = ProcessingPackage.eINSTANCE;
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
            case ProcessingPackage.IMPORT_MODULE:
            {
                ImportModule importModule = (ImportModule)theEObject;
                T result = caseImportModule ( importModule );
                if ( result == null )
                    result = caseFileModule ( importModule );
                if ( result == null )
                    result = caseModule ( importModule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ProcessingPackage.OVERRIDE_LIST_MODULE:
            {
                OverrideListModule overrideListModule = (OverrideListModule)theEObject;
                T result = caseOverrideListModule ( overrideListModule );
                if ( result == null )
                    result = caseFileModule ( overrideListModule );
                if ( result == null )
                    result = caseModule ( overrideListModule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ProcessingPackage.IMPORT_LIST_MODULE:
            {
                ImportListModule importListModule = (ImportListModule)theEObject;
                T result = caseImportListModule ( importListModule );
                if ( result == null )
                    result = caseFileModule ( importListModule );
                if ( result == null )
                    result = caseModule ( importListModule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ProcessingPackage.SCRIPT_OVERRIDES:
            {
                ScriptOverrides scriptOverrides = (ScriptOverrides)theEObject;
                T result = caseScriptOverrides ( scriptOverrides );
                if ( result == null )
                    result = caseFileModule ( scriptOverrides );
                if ( result == null )
                    result = caseModule ( scriptOverrides );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ProcessingPackage.REMOVE_INACTIVE:
            {
                RemoveInactive removeInactive = (RemoveInactive)theEObject;
                T result = caseRemoveInactive ( removeInactive );
                if ( result == null )
                    result = caseModule ( removeInactive );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Import Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Import Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImportModule ( ImportModule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Override List Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Override List Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverrideListModule ( OverrideListModule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Import List Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Import List Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImportListModule ( ImportListModule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script Overrides</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script Overrides</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScriptOverrides ( ScriptOverrides object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remove Inactive</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remove Inactive</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoveInactive ( RemoveInactive object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileModule ( FileModule object )
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

} //ProcessingSwitch

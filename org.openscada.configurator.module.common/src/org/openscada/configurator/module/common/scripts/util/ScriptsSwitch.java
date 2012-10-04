/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.scripts.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openscada.configuration.model.Module;
import org.openscada.configurator.module.common.FileModule;
import org.openscada.configurator.module.common.scripts.*;
import org.openscada.configurator.module.common.scripts.LegacyFormulaModule;
import org.openscada.configurator.module.common.scripts.ScriptsModule;
import org.openscada.configurator.module.common.scripts.ScriptsMonitorModule;
import org.openscada.configurator.module.common.scripts.ScriptsPackage;

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
 * @see org.openscada.configurator.module.common.scripts.ScriptsPackage
 * @generated
 */
public class ScriptsSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ScriptsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptsSwitch ()
    {
        if ( modelPackage == null )
        {
            modelPackage = ScriptsPackage.eINSTANCE;
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
            case ScriptsPackage.SCRIPTS_MODULE:
            {
                ScriptsModule scriptsModule = (ScriptsModule)theEObject;
                T result = caseScriptsModule ( scriptsModule );
                if ( result == null )
                    result = caseModule ( scriptsModule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ScriptsPackage.LEGACY_FORMULA_MODULE:
            {
                LegacyFormulaModule legacyFormulaModule = (LegacyFormulaModule)theEObject;
                T result = caseLegacyFormulaModule ( legacyFormulaModule );
                if ( result == null )
                    result = caseModule ( legacyFormulaModule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ScriptsPackage.SCRIPTS_MONITOR_MODULE:
            {
                ScriptsMonitorModule scriptsMonitorModule = (ScriptsMonitorModule)theEObject;
                T result = caseScriptsMonitorModule ( scriptsMonitorModule );
                if ( result == null )
                    result = caseFileModule ( scriptsMonitorModule );
                if ( result == null )
                    result = caseModule ( scriptsMonitorModule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
        }
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
    public T caseScriptsModule ( ScriptsModule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Legacy Formula Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Legacy Formula Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLegacyFormulaModule ( LegacyFormulaModule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monitor Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monitor Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScriptsMonitorModule ( ScriptsMonitorModule object )
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

} //ScriptsSwitch

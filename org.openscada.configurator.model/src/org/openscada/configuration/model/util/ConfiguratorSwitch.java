/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openscada.configuration.model.AtlantisConfigurationSlot;
import org.openscada.configuration.model.ConfigurationSlot;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.GenericConfigurationSlot;
import org.openscada.configuration.model.Module;
import org.openscada.configuration.model.ModuleProcessor;
import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.Project;

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
 * @see org.openscada.configuration.model.ConfiguratorPackage
 * @generated
 */
public class ConfiguratorSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ConfiguratorPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfiguratorSwitch ()
    {
        if ( modelPackage == null )
        {
            modelPackage = ConfiguratorPackage.eINSTANCE;
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
            case ConfiguratorPackage.PROJECT:
            {
                Project project = (Project)theEObject;
                T result = caseProject ( project );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ConfiguratorPackage.MODULE:
            {
                Module module = (Module)theEObject;
                T result = caseModule ( module );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ConfiguratorPackage.CONFIGURATION_SLOT:
            {
                ConfigurationSlot configurationSlot = (ConfigurationSlot)theEObject;
                T result = caseConfigurationSlot ( configurationSlot );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ConfiguratorPackage.ATLANTIS_CONFIGURATION_SLOT:
            {
                AtlantisConfigurationSlot atlantisConfigurationSlot = (AtlantisConfigurationSlot)theEObject;
                T result = caseAtlantisConfigurationSlot ( atlantisConfigurationSlot );
                if ( result == null )
                    result = caseGenericConfigurationSlot ( atlantisConfigurationSlot );
                if ( result == null )
                    result = caseConfigurationSlot ( atlantisConfigurationSlot );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ConfiguratorPackage.PROCESSOR:
            {
                Processor processor = (Processor)theEObject;
                T result = caseProcessor ( processor );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ConfiguratorPackage.MODULE_PROCESSOR:
            {
                ModuleProcessor moduleProcessor = (ModuleProcessor)theEObject;
                T result = caseModuleProcessor ( moduleProcessor );
                if ( result == null )
                    result = caseProcessor ( moduleProcessor );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT:
            {
                GenericConfigurationSlot genericConfigurationSlot = (GenericConfigurationSlot)theEObject;
                T result = caseGenericConfigurationSlot ( genericConfigurationSlot );
                if ( result == null )
                    result = caseConfigurationSlot ( genericConfigurationSlot );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Project</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProject ( Project object )
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
     * Returns the result of interpreting the object as an instance of '<em>Configuration Slot</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Configuration Slot</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigurationSlot ( ConfigurationSlot object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Atlantis Configuration Slot</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Atlantis Configuration Slot</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAtlantisConfigurationSlot ( AtlantisConfigurationSlot object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessor ( Processor object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Processor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Processor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleProcessor ( ModuleProcessor object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic Configuration Slot</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic Configuration Slot</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericConfigurationSlot ( GenericConfigurationSlot object )
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

} //ConfiguratorSwitch

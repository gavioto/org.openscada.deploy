/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openscada.configuration.model.GenericConfigurationSlot;
import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.hd.ConfigurationSlot;
import org.openscada.configuration.model.hd.HDItemGenerator;
import org.openscada.configuration.model.hd.HdPackage;
import org.openscada.configuration.model.hd.StorageCommandGenerator;

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
 * @see org.openscada.configuration.model.hd.HdPackage
 * @generated
 */
public class HdSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static HdPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HdSwitch ()
    {
        if ( modelPackage == null )
        {
            modelPackage = HdPackage.eINSTANCE;
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
            case HdPackage.CONFIGURATION_SLOT:
            {
                ConfigurationSlot configurationSlot = (ConfigurationSlot)theEObject;
                T result = caseConfigurationSlot ( configurationSlot );
                if ( result == null )
                    result = caseGenericConfigurationSlot ( configurationSlot );
                if ( result == null )
                    result = caseConfigurator_ConfigurationSlot ( configurationSlot );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case HdPackage.STORAGE_COMMAND_GENERATOR:
            {
                StorageCommandGenerator storageCommandGenerator = (StorageCommandGenerator)theEObject;
                T result = caseStorageCommandGenerator ( storageCommandGenerator );
                if ( result == null )
                    result = caseProcessor ( storageCommandGenerator );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case HdPackage.HD_ITEM_GENERATOR:
            {
                HDItemGenerator hdItemGenerator = (HDItemGenerator)theEObject;
                T result = caseHDItemGenerator ( hdItemGenerator );
                if ( result == null )
                    result = caseProcessor ( hdItemGenerator );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Storage Command Generator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Storage Command Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStorageCommandGenerator ( StorageCommandGenerator object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HD Item Generator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HD Item Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHDItemGenerator ( HDItemGenerator object )
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
    public T caseConfigurator_ConfigurationSlot ( org.openscada.configuration.model.ConfigurationSlot object )
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

} //HdSwitch

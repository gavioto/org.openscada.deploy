/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openscada.configuration.model.Processor;
import org.openscada.configurator.processor.common.global.EventQueryImport;
import org.openscada.configurator.processor.common.global.Exclude;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.Include;
import org.openscada.configurator.processor.common.global.ItemSelector;
import org.openscada.configurator.processor.common.global.MonitorQueryImport;
import org.openscada.configurator.processor.common.global.QueryImport;
import org.openscada.configurator.processor.common.global.Site;
import org.openscada.configurator.processor.common.global.TransformSiteToGlobal;

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
 * @see org.openscada.configurator.processor.common.global.GlobalPackage
 * @generated
 */
public class GlobalSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static GlobalPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalSwitch ()
    {
        if ( modelPackage == null )
        {
            modelPackage = GlobalPackage.eINSTANCE;
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
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL:
            {
                TransformSiteToGlobal transformSiteToGlobal = (TransformSiteToGlobal)theEObject;
                T result = caseTransformSiteToGlobal ( transformSiteToGlobal );
                if ( result == null )
                    result = caseProcessor ( transformSiteToGlobal );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case GlobalPackage.SITE:
            {
                Site site = (Site)theEObject;
                T result = caseSite ( site );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case GlobalPackage.ITEM_SELECTOR:
            {
                ItemSelector itemSelector = (ItemSelector)theEObject;
                T result = caseItemSelector ( itemSelector );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case GlobalPackage.EXCLUDE:
            {
                Exclude exclude = (Exclude)theEObject;
                T result = caseExclude ( exclude );
                if ( result == null )
                    result = caseItemSelector ( exclude );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case GlobalPackage.INCLUDE:
            {
                Include include = (Include)theEObject;
                T result = caseInclude ( include );
                if ( result == null )
                    result = caseItemSelector ( include );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case GlobalPackage.QUERY_IMPORT:
            {
                QueryImport queryImport = (QueryImport)theEObject;
                T result = caseQueryImport ( queryImport );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case GlobalPackage.MONITOR_QUERY_IMPORT:
            {
                MonitorQueryImport monitorQueryImport = (MonitorQueryImport)theEObject;
                T result = caseMonitorQueryImport ( monitorQueryImport );
                if ( result == null )
                    result = caseQueryImport ( monitorQueryImport );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case GlobalPackage.EVENT_QUERY_IMPORT:
            {
                EventQueryImport eventQueryImport = (EventQueryImport)theEObject;
                T result = caseEventQueryImport ( eventQueryImport );
                if ( result == null )
                    result = caseQueryImport ( eventQueryImport );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transform Site To Global</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transform Site To Global</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformSiteToGlobal ( TransformSiteToGlobal object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Site</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Site</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSite ( Site object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Item Selector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Item Selector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseItemSelector ( ItemSelector object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exclude</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exclude</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExclude ( Exclude object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Include</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInclude ( Include object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Query Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Query Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQueryImport ( QueryImport object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monitor Query Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monitor Query Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonitorQueryImport ( MonitorQueryImport object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Query Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Query Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventQueryImport ( EventQueryImport object )
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

} //GlobalSwitch

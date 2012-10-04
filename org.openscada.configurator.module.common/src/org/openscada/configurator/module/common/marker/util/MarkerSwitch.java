/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.marker.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openscada.configuration.model.Module;
import org.openscada.configurator.module.common.marker.HierarchyBlockGenerator;
import org.openscada.configurator.module.common.marker.HierarchyMarkerGenerator;
import org.openscada.configurator.module.common.marker.Marker;
import org.openscada.configurator.module.common.marker.MarkerPackage;

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
 * @see org.openscada.configurator.module.common.marker.MarkerPackage
 * @generated
 */
public class MarkerSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MarkerPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MarkerSwitch ()
    {
        if ( modelPackage == null )
        {
            modelPackage = MarkerPackage.eINSTANCE;
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
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR:
            {
                HierarchyMarkerGenerator hierarchyMarkerGenerator = (HierarchyMarkerGenerator)theEObject;
                T result = caseHierarchyMarkerGenerator ( hierarchyMarkerGenerator );
                if ( result == null )
                    result = caseModule ( hierarchyMarkerGenerator );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case MarkerPackage.MARKER:
            {
                Marker marker = (Marker)theEObject;
                T result = caseMarker ( marker );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case MarkerPackage.HIERARCHY_BLOCK_GENERATOR:
            {
                HierarchyBlockGenerator hierarchyBlockGenerator = (HierarchyBlockGenerator)theEObject;
                T result = caseHierarchyBlockGenerator ( hierarchyBlockGenerator );
                if ( result == null )
                    result = caseModule ( hierarchyBlockGenerator );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hierarchy Marker Generator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hierarchy Marker Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHierarchyMarkerGenerator ( HierarchyMarkerGenerator object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Marker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Marker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMarker ( Marker object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hierarchy Block Generator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hierarchy Block Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHierarchyBlockGenerator ( HierarchyBlockGenerator object )
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

} //MarkerSwitch

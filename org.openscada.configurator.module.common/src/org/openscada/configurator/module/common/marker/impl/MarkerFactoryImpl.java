/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.marker.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configurator.module.common.marker.HierarchyMarkerGenerator;
import org.openscada.configurator.module.common.marker.Marker;
import org.openscada.configurator.module.common.marker.MarkerFactory;
import org.openscada.configurator.module.common.marker.MarkerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkerFactoryImpl extends EFactoryImpl implements MarkerFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MarkerFactory init ()
    {
        try
        {
            MarkerFactory theMarkerFactory = (MarkerFactory)EPackage.Registry.INSTANCE.getEFactory ( "http://openscada.org/Configurator/Modules/Common/Marker" );
            if ( theMarkerFactory != null )
            {
                return theMarkerFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new MarkerFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MarkerFactoryImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create ( EClass eClass )
    {
        switch ( eClass.getClassifierID () )
        {
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR:
                return createHierarchyMarkerGenerator ();
            case MarkerPackage.MARKER:
                return createMarker ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HierarchyMarkerGenerator createHierarchyMarkerGenerator ()
    {
        HierarchyMarkerGeneratorImpl hierarchyMarkerGenerator = new HierarchyMarkerGeneratorImpl ();
        return hierarchyMarkerGenerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Marker createMarker ()
    {
        MarkerImpl marker = new MarkerImpl ();
        return marker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MarkerPackage getMarkerPackage ()
    {
        return (MarkerPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MarkerPackage getPackage ()
    {
        return MarkerPackage.eINSTANCE;
    }

} //MarkerFactoryImpl

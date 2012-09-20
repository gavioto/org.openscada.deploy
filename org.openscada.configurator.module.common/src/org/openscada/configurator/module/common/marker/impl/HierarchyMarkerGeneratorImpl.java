/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.marker.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.marker.HierarchyMarkerGenerator;
import org.openscada.configurator.module.common.marker.Marker;
import org.openscada.configurator.module.common.marker.MarkerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchy Marker Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.marker.impl.HierarchyMarkerGeneratorImpl#getMarkerName <em>Marker Name</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.marker.impl.HierarchyMarkerGeneratorImpl#getMarkers <em>Markers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierarchyMarkerGeneratorImpl extends EObjectImpl implements HierarchyMarkerGenerator
{
    /**
     * The default value of the '{@link #getMarkerName() <em>Marker Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMarkerName()
     * @generated
     * @ordered
     */
    protected static final String MARKER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMarkerName() <em>Marker Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMarkerName()
     * @generated
     * @ordered
     */
    protected String markerName = MARKER_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getMarkers() <em>Markers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMarkers()
     * @generated
     * @ordered
     */
    protected EList<Marker> markers;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HierarchyMarkerGeneratorImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return MarkerPackage.Literals.HIERARCHY_MARKER_GENERATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMarkerName ()
    {
        return markerName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMarkerName ( String newMarkerName )
    {
        String oldMarkerName = markerName;
        markerName = newMarkerName;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKER_NAME, oldMarkerName, markerName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Marker> getMarkers ()
    {
        if ( markers == null )
        {
            markers = new EObjectContainmentEList.Resolving<Marker> ( Marker.class, this, MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKERS );
        }
        return markers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void process ( Configuration configuration, Project project )
    {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( InternalEObject otherEnd, int featureID, NotificationChain msgs )
    {
        switch ( featureID )
        {
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKERS:
                return ( (InternalEList<?>)getMarkers () ).basicRemove ( otherEnd, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKER_NAME:
                return getMarkerName ();
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKERS:
                return getMarkers ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKER_NAME:
                setMarkerName ( (String)newValue );
                return;
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKERS:
                getMarkers ().clear ();
                getMarkers ().addAll ( (Collection<? extends Marker>)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKER_NAME:
                setMarkerName ( MARKER_NAME_EDEFAULT );
                return;
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKERS:
                getMarkers ().clear ();
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKER_NAME:
                return MARKER_NAME_EDEFAULT == null ? markerName != null : !MARKER_NAME_EDEFAULT.equals ( markerName );
            case MarkerPackage.HIERARCHY_MARKER_GENERATOR__MARKERS:
                return markers != null && !markers.isEmpty ();
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
            return super.toString ();

        StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (markerName: " );
        result.append ( markerName );
        result.append ( ')' );
        return result.toString ();
    }

} //HierarchyMarkerGeneratorImpl

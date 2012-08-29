/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openscada.deploy.iolist.model.LevelMonitor;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.LevelMonitorImpl#getPreset <em>Preset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LevelMonitorImpl extends MonitorImpl implements LevelMonitor
{
    /**
     * The default value of the '{@link #getPreset() <em>Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreset()
     * @generated
     * @ordered
     */
    protected static final Double PRESET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPreset() <em>Preset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreset()
     * @generated
     * @ordered
     */
    protected Double preset = PRESET_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LevelMonitorImpl ()
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
        return ModelPackage.Literals.LEVEL_MONITOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getPreset ()
    {
        return preset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreset ( Double newPreset )
    {
        Double oldPreset = preset;
        preset = newPreset;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.LEVEL_MONITOR__PRESET, oldPreset, preset ) );
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
            case ModelPackage.LEVEL_MONITOR__PRESET:
                return getPreset ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case ModelPackage.LEVEL_MONITOR__PRESET:
                setPreset ( (Double)newValue );
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
            case ModelPackage.LEVEL_MONITOR__PRESET:
                setPreset ( PRESET_EDEFAULT );
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
            case ModelPackage.LEVEL_MONITOR__PRESET:
                return PRESET_EDEFAULT == null ? preset != null : !PRESET_EDEFAULT.equals ( preset );
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
        result.append ( " (preset: " );
        result.append ( preset );
        result.append ( ')' );
        return result.toString ();
    }

} //LevelMonitorImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ListMonitorImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ListMonitorImpl#isListIsAlarm <em>List Is Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListMonitorImpl extends MonitorImpl implements ListMonitor
{
    /**
     * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValues()
     * @generated
     * @ordered
     */
    protected EList<String> values;

    /**
     * The default value of the '{@link #isListIsAlarm() <em>List Is Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isListIsAlarm()
     * @generated
     * @ordered
     */
    protected static final boolean LIST_IS_ALARM_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isListIsAlarm() <em>List Is Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isListIsAlarm()
     * @generated
     * @ordered
     */
    protected boolean listIsAlarm = LIST_IS_ALARM_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ListMonitorImpl ()
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
        return ModelPackage.Literals.LIST_MONITOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getValues ()
    {
        if ( values == null )
        {
            values = new EDataTypeUniqueEList<String> ( String.class, this, ModelPackage.LIST_MONITOR__VALUES );
        }
        return values;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isListIsAlarm ()
    {
        return listIsAlarm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListIsAlarm ( boolean newListIsAlarm )
    {
        boolean oldListIsAlarm = listIsAlarm;
        listIsAlarm = newListIsAlarm;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.LIST_MONITOR__LIST_IS_ALARM, oldListIsAlarm, listIsAlarm ) );
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
            case ModelPackage.LIST_MONITOR__VALUES:
                return getValues ();
            case ModelPackage.LIST_MONITOR__LIST_IS_ALARM:
                return isListIsAlarm ();
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
            case ModelPackage.LIST_MONITOR__VALUES:
                getValues ().clear ();
                getValues ().addAll ( (Collection<? extends String>)newValue );
                return;
            case ModelPackage.LIST_MONITOR__LIST_IS_ALARM:
                setListIsAlarm ( (Boolean)newValue );
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
            case ModelPackage.LIST_MONITOR__VALUES:
                getValues ().clear ();
                return;
            case ModelPackage.LIST_MONITOR__LIST_IS_ALARM:
                setListIsAlarm ( LIST_IS_ALARM_EDEFAULT );
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
            case ModelPackage.LIST_MONITOR__VALUES:
                return values != null && !values.isEmpty ();
            case ModelPackage.LIST_MONITOR__LIST_IS_ALARM:
                return listIsAlarm != LIST_IS_ALARM_EDEFAULT;
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
        result.append ( " (values: " );
        result.append ( values );
        result.append ( ", listIsAlarm: " );
        result.append ( listIsAlarm );
        result.append ( ')' );
        return result.toString ();
    }

} //ListMonitorImpl

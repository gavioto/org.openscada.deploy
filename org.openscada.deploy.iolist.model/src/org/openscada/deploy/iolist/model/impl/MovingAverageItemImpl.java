/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.MovingAverage;
import org.openscada.deploy.iolist.model.MovingAverageItem;
import org.openscada.deploy.iolist.model.MovingAverageReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moving Average Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MovingAverageItemImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MovingAverageItemImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovingAverageItemImpl extends ItemImpl implements MovingAverageItem
{
    /**
     * The cached value of the '{@link #getAverage() <em>Average</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAverage()
     * @generated
     * @ordered
     */
    protected MovingAverage average;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final MovingAverageReferenceType TYPE_EDEFAULT = MovingAverageReferenceType.MIN;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected MovingAverageReferenceType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MovingAverageItemImpl ()
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
        return ModelPackage.Literals.MOVING_AVERAGE_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovingAverage getAverage ()
    {
        if ( average != null && average.eIsProxy () )
        {
            InternalEObject oldAverage = (InternalEObject)average;
            average = (MovingAverage)eResolveProxy ( oldAverage );
            if ( average != oldAverage )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, ModelPackage.MOVING_AVERAGE_ITEM__AVERAGE, oldAverage, average ) );
            }
        }
        return average;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovingAverage basicGetAverage ()
    {
        return average;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAverage ( MovingAverage newAverage )
    {
        MovingAverage oldAverage = average;
        average = newAverage;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MOVING_AVERAGE_ITEM__AVERAGE, oldAverage, average ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovingAverageReferenceType getType ()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType ( MovingAverageReferenceType newType )
    {
        MovingAverageReferenceType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MOVING_AVERAGE_ITEM__TYPE, oldType, type ) );
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
            case ModelPackage.MOVING_AVERAGE_ITEM__AVERAGE:
                if ( resolve )
                    return getAverage ();
                return basicGetAverage ();
            case ModelPackage.MOVING_AVERAGE_ITEM__TYPE:
                return getType ();
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
            case ModelPackage.MOVING_AVERAGE_ITEM__AVERAGE:
                setAverage ( (MovingAverage)newValue );
                return;
            case ModelPackage.MOVING_AVERAGE_ITEM__TYPE:
                setType ( (MovingAverageReferenceType)newValue );
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
            case ModelPackage.MOVING_AVERAGE_ITEM__AVERAGE:
                setAverage ( (MovingAverage)null );
                return;
            case ModelPackage.MOVING_AVERAGE_ITEM__TYPE:
                setType ( TYPE_EDEFAULT );
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
            case ModelPackage.MOVING_AVERAGE_ITEM__AVERAGE:
                return average != null;
            case ModelPackage.MOVING_AVERAGE_ITEM__TYPE:
                return type != TYPE_EDEFAULT;
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
        result.append ( " (type: " );
        result.append ( type );
        result.append ( ')' );
        return result.toString ();
    }

} //MovingAverageItemImpl

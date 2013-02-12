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
import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.AverageItem;
import org.openscada.deploy.iolist.model.AverageReferenceType;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Average Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.AverageItemImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.AverageItemImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AverageItemImpl extends ItemImpl implements AverageItem
{
    /**
     * The cached value of the '{@link #getAverage() <em>Average</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAverage()
     * @generated
     * @ordered
     */
    protected Average average;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final AverageReferenceType TYPE_EDEFAULT = AverageReferenceType.MIN;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected AverageReferenceType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AverageItemImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ModelPackage.Literals.AVERAGE_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Average getAverage ()
    {
        if ( average != null && average.eIsProxy () )
        {
            InternalEObject oldAverage = (InternalEObject)average;
            average = (Average)eResolveProxy ( oldAverage );
            if ( average != oldAverage )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, ModelPackage.AVERAGE_ITEM__AVERAGE, oldAverage, average ) );
            }
        }
        return average;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Average basicGetAverage ()
    {
        return average;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAverage ( Average newAverage )
    {
        Average oldAverage = average;
        average = newAverage;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.AVERAGE_ITEM__AVERAGE, oldAverage, average ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AverageReferenceType getType ()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType ( AverageReferenceType newType )
    {
        AverageReferenceType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.AVERAGE_ITEM__TYPE, oldType, type ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
        case ModelPackage.AVERAGE_ITEM__AVERAGE:
            if ( resolve )
                return getAverage ();
            return basicGetAverage ();
        case ModelPackage.AVERAGE_ITEM__TYPE:
            return getType ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
        case ModelPackage.AVERAGE_ITEM__AVERAGE:
            setAverage ( (Average)newValue );
            return;
        case ModelPackage.AVERAGE_ITEM__TYPE:
            setType ( (AverageReferenceType)newValue );
            return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
        case ModelPackage.AVERAGE_ITEM__AVERAGE:
            setAverage ( (Average)null );
            return;
        case ModelPackage.AVERAGE_ITEM__TYPE:
            setType ( TYPE_EDEFAULT );
            return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
        case ModelPackage.AVERAGE_ITEM__AVERAGE:
            return average != null;
        case ModelPackage.AVERAGE_ITEM__TYPE:
            return type != TYPE_EDEFAULT;
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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

} //AverageItemImpl

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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.MovingAverage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moving Average</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MovingAverageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MovingAverageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MovingAverageImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MovingAverageImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MovingAverageImpl#getNullRange <em>Null Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovingAverageImpl extends EObjectImpl implements MovingAverage
{
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrigger()
     * @generated
     * @ordered
     */
    protected static final Long TRIGGER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrigger()
     * @generated
     * @ordered
     */
    protected Long trigger = TRIGGER_EDEFAULT;

    /**
     * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected static final Long RANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected Long range = RANGE_EDEFAULT;

    /**
     * The default value of the '{@link #getNullRange() <em>Null Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNullRange()
     * @generated
     * @ordered
     */
    protected static final Long NULL_RANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNullRange() <em>Null Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNullRange()
     * @generated
     * @ordered
     */
    protected Long nullRange = NULL_RANGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MovingAverageImpl ()
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
        return ModelPackage.Literals.MOVING_AVERAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId ()
    {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId ( String newId )
    {
        String oldId = id;
        id = newId;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MOVING_AVERAGE__ID, oldId, id ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSource ()
    {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource ( String newSource )
    {
        String oldSource = source;
        source = newSource;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MOVING_AVERAGE__SOURCE, oldSource, source ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Long getTrigger ()
    {
        return trigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrigger ( Long newTrigger )
    {
        Long oldTrigger = trigger;
        trigger = newTrigger;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MOVING_AVERAGE__TRIGGER, oldTrigger, trigger ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Long getRange ()
    {
        return range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRange ( Long newRange )
    {
        Long oldRange = range;
        range = newRange;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MOVING_AVERAGE__RANGE, oldRange, range ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Long getNullRange ()
    {
        return nullRange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNullRange ( Long newNullRange )
    {
        Long oldNullRange = nullRange;
        nullRange = newNullRange;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MOVING_AVERAGE__NULL_RANGE, oldNullRange, nullRange ) );
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
            case ModelPackage.MOVING_AVERAGE__ID:
                return getId ();
            case ModelPackage.MOVING_AVERAGE__SOURCE:
                return getSource ();
            case ModelPackage.MOVING_AVERAGE__TRIGGER:
                return getTrigger ();
            case ModelPackage.MOVING_AVERAGE__RANGE:
                return getRange ();
            case ModelPackage.MOVING_AVERAGE__NULL_RANGE:
                return getNullRange ();
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
            case ModelPackage.MOVING_AVERAGE__ID:
                setId ( (String)newValue );
                return;
            case ModelPackage.MOVING_AVERAGE__SOURCE:
                setSource ( (String)newValue );
                return;
            case ModelPackage.MOVING_AVERAGE__TRIGGER:
                setTrigger ( (Long)newValue );
                return;
            case ModelPackage.MOVING_AVERAGE__RANGE:
                setRange ( (Long)newValue );
                return;
            case ModelPackage.MOVING_AVERAGE__NULL_RANGE:
                setNullRange ( (Long)newValue );
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
            case ModelPackage.MOVING_AVERAGE__ID:
                setId ( ID_EDEFAULT );
                return;
            case ModelPackage.MOVING_AVERAGE__SOURCE:
                setSource ( SOURCE_EDEFAULT );
                return;
            case ModelPackage.MOVING_AVERAGE__TRIGGER:
                setTrigger ( TRIGGER_EDEFAULT );
                return;
            case ModelPackage.MOVING_AVERAGE__RANGE:
                setRange ( RANGE_EDEFAULT );
                return;
            case ModelPackage.MOVING_AVERAGE__NULL_RANGE:
                setNullRange ( NULL_RANGE_EDEFAULT );
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
            case ModelPackage.MOVING_AVERAGE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals ( id );
            case ModelPackage.MOVING_AVERAGE__SOURCE:
                return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals ( source );
            case ModelPackage.MOVING_AVERAGE__TRIGGER:
                return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals ( trigger );
            case ModelPackage.MOVING_AVERAGE__RANGE:
                return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals ( range );
            case ModelPackage.MOVING_AVERAGE__NULL_RANGE:
                return NULL_RANGE_EDEFAULT == null ? nullRange != null : !NULL_RANGE_EDEFAULT.equals ( nullRange );
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
        result.append ( " (id: " );
        result.append ( id );
        result.append ( ", source: " );
        result.append ( source );
        result.append ( ", trigger: " );
        result.append ( trigger );
        result.append ( ", range: " );
        result.append ( range );
        result.append ( ", nullRange: " );
        result.append ( nullRange );
        result.append ( ')' );
        return result.toString ();
    }

} //MovingAverageImpl

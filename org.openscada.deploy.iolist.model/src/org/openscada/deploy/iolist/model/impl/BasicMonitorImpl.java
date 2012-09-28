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
import org.openscada.ae.Severity;
import org.openscada.deploy.iolist.model.BasicMonitor;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Basic Monitor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.BasicMonitorImpl#isAck <em>Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.BasicMonitorImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BasicMonitorImpl extends MonitorImpl implements BasicMonitor
{
    /**
     * The default value of the '{@link #isAck() <em>Ack</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isAck()
     * @generated
     * @ordered
     */
    protected static final boolean ACK_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isAck() <em>Ack</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isAck()
     * @generated
     * @ordered
     */
    protected boolean ack = ACK_EDEFAULT;

    /**
     * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSeverity()
     * @generated
     * @ordered
     */
    protected static final Severity SEVERITY_EDEFAULT = (Severity)ModelFactory.eINSTANCE.createFromString ( ModelPackage.eINSTANCE.getSeverity (), "ERROR" );

    /**
     * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSeverity()
     * @generated
     * @ordered
     */
    protected Severity severity = SEVERITY_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BasicMonitorImpl ()
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
        return ModelPackage.Literals.BASIC_MONITOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isAck ()
    {
        return ack;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAck ( boolean newAck )
    {
        boolean oldAck = ack;
        ack = newAck;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.BASIC_MONITOR__ACK, oldAck, ack ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Severity getSeverity ()
    {
        return severity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeverity ( Severity newSeverity )
    {
        Severity oldSeverity = severity;
        severity = newSeverity;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.BASIC_MONITOR__SEVERITY, oldSeverity, severity ) );
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
        case ModelPackage.BASIC_MONITOR__ACK:
            return isAck ();
        case ModelPackage.BASIC_MONITOR__SEVERITY:
            return getSeverity ();
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
        case ModelPackage.BASIC_MONITOR__ACK:
            setAck ( (Boolean)newValue );
            return;
        case ModelPackage.BASIC_MONITOR__SEVERITY:
            setSeverity ( (Severity)newValue );
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
        case ModelPackage.BASIC_MONITOR__ACK:
            setAck ( ACK_EDEFAULT );
            return;
        case ModelPackage.BASIC_MONITOR__SEVERITY:
            setSeverity ( SEVERITY_EDEFAULT );
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
        case ModelPackage.BASIC_MONITOR__ACK:
            return ack != ACK_EDEFAULT;
        case ModelPackage.BASIC_MONITOR__SEVERITY:
            return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals ( severity );
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
        result.append ( " (ack: " );
        result.append ( ack );
        result.append ( ", severity: " );
        result.append ( severity );
        result.append ( ')' );
        return result.toString ();
    }

} //BasicMonitorImpl

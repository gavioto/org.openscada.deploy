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
import org.openscada.core.Variant;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>List Monitor Entry</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ListMonitorEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ListMonitorEntryImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ListMonitorEntryImpl#getRequireAck <em>Require Ack</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListMonitorEntryImpl extends EObjectImpl implements ListMonitorEntry
{
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Variant VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Variant value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSeverity()
     * @generated
     * @ordered
     */
    protected static final String SEVERITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSeverity()
     * @generated
     * @ordered
     */
    protected String severity = SEVERITY_EDEFAULT;

    /**
     * The default value of the '{@link #getRequireAck() <em>Require Ack</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRequireAck()
     * @generated
     * @ordered
     */
    protected static final Boolean REQUIRE_ACK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRequireAck() <em>Require Ack</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRequireAck()
     * @generated
     * @ordered
     */
    protected Boolean requireAck = REQUIRE_ACK_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ListMonitorEntryImpl ()
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
        return ModelPackage.Literals.LIST_MONITOR_ENTRY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Variant getValue ()
    {
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue ( Variant newValue )
    {
        Variant oldValue = value;
        value = newValue;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.LIST_MONITOR_ENTRY__VALUE, oldValue, value ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSeverity ()
    {
        return severity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeverity ( String newSeverity )
    {
        String oldSeverity = severity;
        severity = newSeverity;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.LIST_MONITOR_ENTRY__SEVERITY, oldSeverity, severity ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getRequireAck ()
    {
        return requireAck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequireAck ( Boolean newRequireAck )
    {
        Boolean oldRequireAck = requireAck;
        requireAck = newRequireAck;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.LIST_MONITOR_ENTRY__REQUIRE_ACK, oldRequireAck, requireAck ) );
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
            case ModelPackage.LIST_MONITOR_ENTRY__VALUE:
                return getValue ();
            case ModelPackage.LIST_MONITOR_ENTRY__SEVERITY:
                return getSeverity ();
            case ModelPackage.LIST_MONITOR_ENTRY__REQUIRE_ACK:
                return getRequireAck ();
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
            case ModelPackage.LIST_MONITOR_ENTRY__VALUE:
                setValue ( (Variant)newValue );
                return;
            case ModelPackage.LIST_MONITOR_ENTRY__SEVERITY:
                setSeverity ( (String)newValue );
                return;
            case ModelPackage.LIST_MONITOR_ENTRY__REQUIRE_ACK:
                setRequireAck ( (Boolean)newValue );
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
            case ModelPackage.LIST_MONITOR_ENTRY__VALUE:
                setValue ( VALUE_EDEFAULT );
                return;
            case ModelPackage.LIST_MONITOR_ENTRY__SEVERITY:
                setSeverity ( SEVERITY_EDEFAULT );
                return;
            case ModelPackage.LIST_MONITOR_ENTRY__REQUIRE_ACK:
                setRequireAck ( REQUIRE_ACK_EDEFAULT );
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
            case ModelPackage.LIST_MONITOR_ENTRY__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals ( value );
            case ModelPackage.LIST_MONITOR_ENTRY__SEVERITY:
                return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals ( severity );
            case ModelPackage.LIST_MONITOR_ENTRY__REQUIRE_ACK:
                return REQUIRE_ACK_EDEFAULT == null ? requireAck != null : !REQUIRE_ACK_EDEFAULT.equals ( requireAck );
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
        result.append ( " (value: " );
        result.append ( value );
        result.append ( ", severity: " );
        result.append ( severity );
        result.append ( ", requireAck: " );
        result.append ( requireAck );
        result.append ( ')' );
        return result.toString ();
    }

} //ListMonitorEntryImpl

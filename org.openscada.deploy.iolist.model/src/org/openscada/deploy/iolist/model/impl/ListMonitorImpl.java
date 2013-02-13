/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ListMonitorImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ListMonitorImpl#isDefaultAck <em>Default Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ListMonitorImpl#getDefaultSeverity <em>Default Severity</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ListMonitorImpl#getMessageAttribute <em>Message Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListMonitorImpl extends MonitorImpl implements ListMonitor
{
    /**
     * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntries()
     * @generated
     * @ordered
     */
    protected EList<ListMonitorEntry> entries;

    /**
     * The default value of the '{@link #isDefaultAck() <em>Default Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDefaultAck()
     * @generated
     * @ordered
     */
    protected static final boolean DEFAULT_ACK_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDefaultAck() <em>Default Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDefaultAck()
     * @generated
     * @ordered
     */
    protected boolean defaultAck = DEFAULT_ACK_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultSeverity() <em>Default Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultSeverity()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_SEVERITY_EDEFAULT = "OK";

    /**
     * The cached value of the '{@link #getDefaultSeverity() <em>Default Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultSeverity()
     * @generated
     * @ordered
     */
    protected String defaultSeverity = DEFAULT_SEVERITY_EDEFAULT;

    /**
     * The default value of the '{@link #getMessageAttribute() <em>Message Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageAttribute()
     * @generated
     * @ordered
     */
    protected static final String MESSAGE_ATTRIBUTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMessageAttribute() <em>Message Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageAttribute()
     * @generated
     * @ordered
     */
    protected String messageAttribute = MESSAGE_ATTRIBUTE_EDEFAULT;

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
    public EList<ListMonitorEntry> getEntries ()
    {
        if ( entries == null )
        {
            entries = new EObjectContainmentEList<ListMonitorEntry> ( ListMonitorEntry.class, this, ModelPackage.LIST_MONITOR__ENTRIES );
        }
        return entries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDefaultAck ()
    {
        return defaultAck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultAck ( boolean newDefaultAck )
    {
        boolean oldDefaultAck = defaultAck;
        defaultAck = newDefaultAck;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.LIST_MONITOR__DEFAULT_ACK, oldDefaultAck, defaultAck ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultSeverity ()
    {
        return defaultSeverity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultSeverity ( String newDefaultSeverity )
    {
        String oldDefaultSeverity = defaultSeverity;
        defaultSeverity = newDefaultSeverity;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.LIST_MONITOR__DEFAULT_SEVERITY, oldDefaultSeverity, defaultSeverity ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMessageAttribute ()
    {
        return messageAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageAttribute ( String newMessageAttribute )
    {
        String oldMessageAttribute = messageAttribute;
        messageAttribute = newMessageAttribute;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.LIST_MONITOR__MESSAGE_ATTRIBUTE, oldMessageAttribute, messageAttribute ) );
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
            case ModelPackage.LIST_MONITOR__ENTRIES:
                return ( (InternalEList<?>)getEntries () ).basicRemove ( otherEnd, msgs );
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
            case ModelPackage.LIST_MONITOR__ENTRIES:
                return getEntries ();
            case ModelPackage.LIST_MONITOR__DEFAULT_ACK:
                return isDefaultAck ();
            case ModelPackage.LIST_MONITOR__DEFAULT_SEVERITY:
                return getDefaultSeverity ();
            case ModelPackage.LIST_MONITOR__MESSAGE_ATTRIBUTE:
                return getMessageAttribute ();
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
            case ModelPackage.LIST_MONITOR__ENTRIES:
                getEntries ().clear ();
                getEntries ().addAll ( (Collection<? extends ListMonitorEntry>)newValue );
                return;
            case ModelPackage.LIST_MONITOR__DEFAULT_ACK:
                setDefaultAck ( (Boolean)newValue );
                return;
            case ModelPackage.LIST_MONITOR__DEFAULT_SEVERITY:
                setDefaultSeverity ( (String)newValue );
                return;
            case ModelPackage.LIST_MONITOR__MESSAGE_ATTRIBUTE:
                setMessageAttribute ( (String)newValue );
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
            case ModelPackage.LIST_MONITOR__ENTRIES:
                getEntries ().clear ();
                return;
            case ModelPackage.LIST_MONITOR__DEFAULT_ACK:
                setDefaultAck ( DEFAULT_ACK_EDEFAULT );
                return;
            case ModelPackage.LIST_MONITOR__DEFAULT_SEVERITY:
                setDefaultSeverity ( DEFAULT_SEVERITY_EDEFAULT );
                return;
            case ModelPackage.LIST_MONITOR__MESSAGE_ATTRIBUTE:
                setMessageAttribute ( MESSAGE_ATTRIBUTE_EDEFAULT );
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
            case ModelPackage.LIST_MONITOR__ENTRIES:
                return entries != null && !entries.isEmpty ();
            case ModelPackage.LIST_MONITOR__DEFAULT_ACK:
                return defaultAck != DEFAULT_ACK_EDEFAULT;
            case ModelPackage.LIST_MONITOR__DEFAULT_SEVERITY:
                return DEFAULT_SEVERITY_EDEFAULT == null ? defaultSeverity != null : !DEFAULT_SEVERITY_EDEFAULT.equals ( defaultSeverity );
            case ModelPackage.LIST_MONITOR__MESSAGE_ATTRIBUTE:
                return MESSAGE_ATTRIBUTE_EDEFAULT == null ? messageAttribute != null : !MESSAGE_ATTRIBUTE_EDEFAULT.equals ( messageAttribute );
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
        result.append ( " (defaultAck: " );
        result.append ( defaultAck );
        result.append ( ", defaultSeverity: " );
        result.append ( defaultSeverity );
        result.append ( ", messageAttribute: " );
        result.append ( messageAttribute );
        result.append ( ')' );
        return result.toString ();
    }

} //ListMonitorImpl

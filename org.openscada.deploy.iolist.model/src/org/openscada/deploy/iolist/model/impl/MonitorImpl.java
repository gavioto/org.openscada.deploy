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
import org.openscada.deploy.iolist.model.Monitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MonitorImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MonitorImpl#isAck <em>Ack</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MonitorImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MonitorImpl extends EObjectImpl implements Monitor
{
    /**
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean active = ACTIVE_EDEFAULT;

    /**
     * The default value of the '{@link #isAck() <em>Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAck()
     * @generated
     * @ordered
     */
    protected static final boolean ACK_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isAck() <em>Ack</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAck()
     * @generated
     * @ordered
     */
    protected boolean ack = ACK_EDEFAULT;

    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final String PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected String priority = PRIORITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MonitorImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return ModelPackage.Literals.MONITOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isActive()
    {
        return active;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActive(boolean newActive)
    {
        boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MONITOR__ACTIVE, oldActive, active));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAck()
    {
        return ack;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAck(boolean newAck)
    {
        boolean oldAck = ack;
        ack = newAck;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MONITOR__ACK, oldAck, ack));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPriority()
    {
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPriority(String newPriority)
    {
        String oldPriority = priority;
        priority = newPriority;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MONITOR__PRIORITY, oldPriority, priority));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case ModelPackage.MONITOR__ACTIVE:
                return isActive();
            case ModelPackage.MONITOR__ACK:
                return isAck();
            case ModelPackage.MONITOR__PRIORITY:
                return getPriority();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case ModelPackage.MONITOR__ACTIVE:
                setActive((Boolean)newValue);
                return;
            case ModelPackage.MONITOR__ACK:
                setAck((Boolean)newValue);
                return;
            case ModelPackage.MONITOR__PRIORITY:
                setPriority((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case ModelPackage.MONITOR__ACTIVE:
                setActive(ACTIVE_EDEFAULT);
                return;
            case ModelPackage.MONITOR__ACK:
                setAck(ACK_EDEFAULT);
                return;
            case ModelPackage.MONITOR__PRIORITY:
                setPriority(PRIORITY_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case ModelPackage.MONITOR__ACTIVE:
                return active != ACTIVE_EDEFAULT;
            case ModelPackage.MONITOR__ACK:
                return ack != ACK_EDEFAULT;
            case ModelPackage.MONITOR__PRIORITY:
                return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (active: ");
        result.append(active);
        result.append(", ack: ");
        result.append(ack);
        result.append(", priority: ");
        result.append(priority);
        result.append(')');
        return result.toString();
    }

} //MonitorImpl

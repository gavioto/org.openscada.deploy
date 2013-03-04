/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openscada.configurator.processor.common.global.EventQueryImport;
import org.openscada.configurator.processor.common.global.GlobalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Query Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.EventQueryImportImpl#getLocalPoolSize <em>Local Pool Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventQueryImportImpl extends QueryImportImpl implements EventQueryImport
{
    /**
     * The default value of the '{@link #getLocalPoolSize() <em>Local Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalPoolSize()
     * @generated
     * @ordered
     */
    protected static final int LOCAL_POOL_SIZE_EDEFAULT = 10000;

    /**
     * The cached value of the '{@link #getLocalPoolSize() <em>Local Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalPoolSize()
     * @generated
     * @ordered
     */
    protected int localPoolSize = LOCAL_POOL_SIZE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventQueryImportImpl ()
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
        return GlobalPackage.Literals.EVENT_QUERY_IMPORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLocalPoolSize ()
    {
        return localPoolSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalPoolSize ( int newLocalPoolSize )
    {
        int oldLocalPoolSize = localPoolSize;
        localPoolSize = newLocalPoolSize;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.EVENT_QUERY_IMPORT__LOCAL_POOL_SIZE, oldLocalPoolSize, localPoolSize ) );
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
            case GlobalPackage.EVENT_QUERY_IMPORT__LOCAL_POOL_SIZE:
                return getLocalPoolSize ();
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
            case GlobalPackage.EVENT_QUERY_IMPORT__LOCAL_POOL_SIZE:
                setLocalPoolSize ( (Integer)newValue );
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
            case GlobalPackage.EVENT_QUERY_IMPORT__LOCAL_POOL_SIZE:
                setLocalPoolSize ( LOCAL_POOL_SIZE_EDEFAULT );
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
            case GlobalPackage.EVENT_QUERY_IMPORT__LOCAL_POOL_SIZE:
                return localPoolSize != LOCAL_POOL_SIZE_EDEFAULT;
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
        result.append ( " (localPoolSize: " );
        result.append ( localPoolSize );
        result.append ( ')' );
        return result.toString ();
    }

} //EventQueryImportImpl

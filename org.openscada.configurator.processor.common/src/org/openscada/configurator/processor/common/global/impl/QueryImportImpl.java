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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.QueryImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.QueryImportImpl#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.QueryImportImpl#isIncludeLocal <em>Include Local</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.QueryImportImpl#getRemoteName <em>Remote Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QueryImportImpl extends EObjectImpl implements QueryImport
{
    /**
     * The default value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalName()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalName()
     * @generated
     * @ordered
     */
    protected String localName = LOCAL_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isIncludeLocal() <em>Include Local</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIncludeLocal()
     * @generated
     * @ordered
     */
    protected static final boolean INCLUDE_LOCAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIncludeLocal() <em>Include Local</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIncludeLocal()
     * @generated
     * @ordered
     */
    protected boolean includeLocal = INCLUDE_LOCAL_EDEFAULT;

    /**
     * The default value of the '{@link #getRemoteName() <em>Remote Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteName()
     * @generated
     * @ordered
     */
    protected static final String REMOTE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemoteName() <em>Remote Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteName()
     * @generated
     * @ordered
     */
    protected String remoteName = REMOTE_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QueryImportImpl ()
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
        return GlobalPackage.Literals.QUERY_IMPORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocalName ()
    {
        return localName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalName ( String newLocalName )
    {
        String oldLocalName = localName;
        localName = newLocalName;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.QUERY_IMPORT__LOCAL_NAME, oldLocalName, localName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIncludeLocal ()
    {
        return includeLocal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIncludeLocal ( boolean newIncludeLocal )
    {
        boolean oldIncludeLocal = includeLocal;
        includeLocal = newIncludeLocal;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.QUERY_IMPORT__INCLUDE_LOCAL, oldIncludeLocal, includeLocal ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRemoteName ()
    {
        return remoteName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoteName ( String newRemoteName )
    {
        String oldRemoteName = remoteName;
        remoteName = newRemoteName;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.QUERY_IMPORT__REMOTE_NAME, oldRemoteName, remoteName ) );
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
            case GlobalPackage.QUERY_IMPORT__LOCAL_NAME:
                return getLocalName ();
            case GlobalPackage.QUERY_IMPORT__INCLUDE_LOCAL:
                return isIncludeLocal ();
            case GlobalPackage.QUERY_IMPORT__REMOTE_NAME:
                return getRemoteName ();
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
            case GlobalPackage.QUERY_IMPORT__LOCAL_NAME:
                setLocalName ( (String)newValue );
                return;
            case GlobalPackage.QUERY_IMPORT__INCLUDE_LOCAL:
                setIncludeLocal ( (Boolean)newValue );
                return;
            case GlobalPackage.QUERY_IMPORT__REMOTE_NAME:
                setRemoteName ( (String)newValue );
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
            case GlobalPackage.QUERY_IMPORT__LOCAL_NAME:
                setLocalName ( LOCAL_NAME_EDEFAULT );
                return;
            case GlobalPackage.QUERY_IMPORT__INCLUDE_LOCAL:
                setIncludeLocal ( INCLUDE_LOCAL_EDEFAULT );
                return;
            case GlobalPackage.QUERY_IMPORT__REMOTE_NAME:
                setRemoteName ( REMOTE_NAME_EDEFAULT );
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
            case GlobalPackage.QUERY_IMPORT__LOCAL_NAME:
                return LOCAL_NAME_EDEFAULT == null ? localName != null : !LOCAL_NAME_EDEFAULT.equals ( localName );
            case GlobalPackage.QUERY_IMPORT__INCLUDE_LOCAL:
                return includeLocal != INCLUDE_LOCAL_EDEFAULT;
            case GlobalPackage.QUERY_IMPORT__REMOTE_NAME:
                return REMOTE_NAME_EDEFAULT == null ? remoteName != null : !REMOTE_NAME_EDEFAULT.equals ( remoteName );
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
        result.append ( " (localName: " );
        result.append ( localName );
        result.append ( ", includeLocal: " );
        result.append ( includeLocal );
        result.append ( ", remoteName: " );
        result.append ( remoteName );
        result.append ( ')' );
        return result.toString ();
    }

} //QueryImportImpl

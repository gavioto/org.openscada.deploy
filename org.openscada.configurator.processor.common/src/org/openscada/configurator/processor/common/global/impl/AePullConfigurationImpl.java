/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.configurator.processor.common.global.AePullConfiguration;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.PropertyEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ae Pull Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.AePullConfigurationImpl#getDriverName <em>Driver Name</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.AePullConfigurationImpl#getCustomSelectSql <em>Custom Select Sql</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.AePullConfigurationImpl#getCustomDeleteSql <em>Custom Delete Sql</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.AePullConfigurationImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.AePullConfigurationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AePullConfigurationImpl extends EObjectImpl implements AePullConfiguration
{
    /**
     * The default value of the '{@link #getDriverName() <em>Driver Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDriverName()
     * @generated
     * @ordered
     */
    protected static final String DRIVER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDriverName() <em>Driver Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDriverName()
     * @generated
     * @ordered
     */
    protected String driverName = DRIVER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCustomSelectSql() <em>Custom Select Sql</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomSelectSql()
     * @generated
     * @ordered
     */
    protected static final String CUSTOM_SELECT_SQL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomSelectSql() <em>Custom Select Sql</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomSelectSql()
     * @generated
     * @ordered
     */
    protected String customSelectSql = CUSTOM_SELECT_SQL_EDEFAULT;

    /**
     * The default value of the '{@link #getCustomDeleteSql() <em>Custom Delete Sql</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomDeleteSql()
     * @generated
     * @ordered
     */
    protected static final String CUSTOM_DELETE_SQL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomDeleteSql() <em>Custom Delete Sql</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomDeleteSql()
     * @generated
     * @ordered
     */
    protected String customDeleteSql = CUSTOM_DELETE_SQL_EDEFAULT;

    /**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected static final Integer DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected Integer delay = DELAY_EDEFAULT;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<PropertyEntry> properties;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AePullConfigurationImpl ()
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
        return GlobalPackage.Literals.AE_PULL_CONFIGURATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDriverName ()
    {
        return driverName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDriverName ( String newDriverName )
    {
        String oldDriverName = driverName;
        driverName = newDriverName;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.AE_PULL_CONFIGURATION__DRIVER_NAME, oldDriverName, driverName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCustomSelectSql ()
    {
        return customSelectSql;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCustomSelectSql ( String newCustomSelectSql )
    {
        String oldCustomSelectSql = customSelectSql;
        customSelectSql = newCustomSelectSql;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_SELECT_SQL, oldCustomSelectSql, customSelectSql ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCustomDeleteSql ()
    {
        return customDeleteSql;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCustomDeleteSql ( String newCustomDeleteSql )
    {
        String oldCustomDeleteSql = customDeleteSql;
        customDeleteSql = newCustomDeleteSql;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_DELETE_SQL, oldCustomDeleteSql, customDeleteSql ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getDelay ()
    {
        return delay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay ( Integer newDelay )
    {
        Integer oldDelay = delay;
        delay = newDelay;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.AE_PULL_CONFIGURATION__DELAY, oldDelay, delay ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PropertyEntry> getProperties ()
    {
        if ( properties == null )
        {
            properties = new EObjectContainmentEList<PropertyEntry> ( PropertyEntry.class, this, GlobalPackage.AE_PULL_CONFIGURATION__PROPERTIES );
        }
        return properties;
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
            case GlobalPackage.AE_PULL_CONFIGURATION__PROPERTIES:
                return ( (InternalEList<?>)getProperties () ).basicRemove ( otherEnd, msgs );
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
            case GlobalPackage.AE_PULL_CONFIGURATION__DRIVER_NAME:
                return getDriverName ();
            case GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_SELECT_SQL:
                return getCustomSelectSql ();
            case GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_DELETE_SQL:
                return getCustomDeleteSql ();
            case GlobalPackage.AE_PULL_CONFIGURATION__DELAY:
                return getDelay ();
            case GlobalPackage.AE_PULL_CONFIGURATION__PROPERTIES:
                return getProperties ();
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
            case GlobalPackage.AE_PULL_CONFIGURATION__DRIVER_NAME:
                setDriverName ( (String)newValue );
                return;
            case GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_SELECT_SQL:
                setCustomSelectSql ( (String)newValue );
                return;
            case GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_DELETE_SQL:
                setCustomDeleteSql ( (String)newValue );
                return;
            case GlobalPackage.AE_PULL_CONFIGURATION__DELAY:
                setDelay ( (Integer)newValue );
                return;
            case GlobalPackage.AE_PULL_CONFIGURATION__PROPERTIES:
                getProperties ().clear ();
                getProperties ().addAll ( (Collection<? extends PropertyEntry>)newValue );
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
            case GlobalPackage.AE_PULL_CONFIGURATION__DRIVER_NAME:
                setDriverName ( DRIVER_NAME_EDEFAULT );
                return;
            case GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_SELECT_SQL:
                setCustomSelectSql ( CUSTOM_SELECT_SQL_EDEFAULT );
                return;
            case GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_DELETE_SQL:
                setCustomDeleteSql ( CUSTOM_DELETE_SQL_EDEFAULT );
                return;
            case GlobalPackage.AE_PULL_CONFIGURATION__DELAY:
                setDelay ( DELAY_EDEFAULT );
                return;
            case GlobalPackage.AE_PULL_CONFIGURATION__PROPERTIES:
                getProperties ().clear ();
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
            case GlobalPackage.AE_PULL_CONFIGURATION__DRIVER_NAME:
                return DRIVER_NAME_EDEFAULT == null ? driverName != null : !DRIVER_NAME_EDEFAULT.equals ( driverName );
            case GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_SELECT_SQL:
                return CUSTOM_SELECT_SQL_EDEFAULT == null ? customSelectSql != null : !CUSTOM_SELECT_SQL_EDEFAULT.equals ( customSelectSql );
            case GlobalPackage.AE_PULL_CONFIGURATION__CUSTOM_DELETE_SQL:
                return CUSTOM_DELETE_SQL_EDEFAULT == null ? customDeleteSql != null : !CUSTOM_DELETE_SQL_EDEFAULT.equals ( customDeleteSql );
            case GlobalPackage.AE_PULL_CONFIGURATION__DELAY:
                return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals ( delay );
            case GlobalPackage.AE_PULL_CONFIGURATION__PROPERTIES:
                return properties != null && !properties.isEmpty ();
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
        result.append ( " (driverName: " );
        result.append ( driverName );
        result.append ( ", customSelectSql: " );
        result.append ( customSelectSql );
        result.append ( ", customDeleteSql: " );
        result.append ( customDeleteSql );
        result.append ( ", delay: " );
        result.append ( delay );
        result.append ( ')' );
        return result.toString ();
    }

} //AePullConfigurationImpl

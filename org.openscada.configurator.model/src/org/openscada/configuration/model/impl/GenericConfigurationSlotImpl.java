/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.impl;

import java.io.File;
import java.net.URL;
import java.util.Collection;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.GenericConfigurationSlot;
import org.openscada.configurator.GenericConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Generic Configuration Slot</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.impl.GenericConfigurationSlotImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.configuration.model.impl.GenericConfigurationSlotImpl#getJsonBase <em>Json Base</em>}</li>
 *   <li>{@link org.openscada.configuration.model.impl.GenericConfigurationSlotImpl#getBaseDirectory <em>Base Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenericConfigurationSlotImpl extends EObjectImpl implements GenericConfigurationSlot
{
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getJsonBase() <em>Json Base</em>}' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getJsonBase()
     * @generated
     * @ordered
     */
    protected EList<String> jsonBase;

    /**
     * The default value of the '{@link #getBaseDirectory() <em>Base Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseDirectory()
     * @generated
     * @ordered
     */
    protected static final String BASE_DIRECTORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBaseDirectory() <em>Base Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseDirectory()
     * @generated
     * @ordered
     */
    protected String baseDirectory = BASE_DIRECTORY_EDEFAULT;

    private GenericConfiguration configuration;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected GenericConfigurationSlotImpl ()
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
        return ConfiguratorPackage.Literals.GENERIC_CONFIGURATION_SLOT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId ()
    {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId ( String newId )
    {
        String oldId = id;
        id = newId;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID, oldId, id ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getJsonBase ()
    {
        if ( jsonBase == null )
        {
            jsonBase = new EDataTypeUniqueEList<String> ( String.class, this, ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE );
        }
        return jsonBase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBaseDirectory ()
    {
        return baseDirectory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBaseDirectory ( String newBaseDirectory )
    {
        String oldBaseDirectory = baseDirectory;
        baseDirectory = newBaseDirectory;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__BASE_DIRECTORY, oldBaseDirectory, baseDirectory ) );
    }

    /**
     * Initialize the generic configuration
     * 
     * @generated NOT
     */
    @Override
    public void initialize ( final GenericConfiguration configuration )
    {
        this.configuration = configuration;
        for ( final String uri : getJsonBase () )
        {
            System.out.println ( "*** 0 - Loading base json file: " + uri );
            configuration.loadData ( uri );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void store () throws Exception
    {
        this.configuration.write ( new File ( FileLocator.toFileURL ( new URL ( getBaseDirectory () ) ).getFile () ) );
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
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID:
                return getId ();
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE:
                return getJsonBase ();
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__BASE_DIRECTORY:
                return getBaseDirectory ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID:
                setId ( (String)newValue );
                return;
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE:
                getJsonBase ().clear ();
                getJsonBase ().addAll ( (Collection<? extends String>)newValue );
                return;
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__BASE_DIRECTORY:
                setBaseDirectory ( (String)newValue );
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
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID:
                setId ( ID_EDEFAULT );
                return;
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE:
                getJsonBase ().clear ();
                return;
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__BASE_DIRECTORY:
                setBaseDirectory ( BASE_DIRECTORY_EDEFAULT );
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
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals ( id );
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__JSON_BASE:
                return jsonBase != null && !jsonBase.isEmpty ();
            case ConfiguratorPackage.GENERIC_CONFIGURATION_SLOT__BASE_DIRECTORY:
                return BASE_DIRECTORY_EDEFAULT == null ? baseDirectory != null : !BASE_DIRECTORY_EDEFAULT.equals ( baseDirectory );
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
        result.append ( " (id: " );
        result.append ( id );
        result.append ( ", jsonBase: " );
        result.append ( jsonBase );
        result.append ( ", baseDirectory: " );
        result.append ( baseDirectory );
        result.append ( ')' );
        return result.toString ();
    }

} //GenericConfigurationSlotImpl

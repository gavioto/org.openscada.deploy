/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.main.impl;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.main.MainLoader;
import org.openscada.configurator.module.common.main.MainPackage;
import org.openscada.configurator.module.common.main.handler.MainLoaderHandler;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Loader</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.main.impl.MainLoaderImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainLoaderImpl extends EObjectImpl implements MainLoader
{
    /**
     * The default value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected static final String FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected String file = FILE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MainLoaderImpl ()
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
        return MainPackage.Literals.MAIN_LOADER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFile ()
    {
        return file;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFile ( String newFile )
    {
        String oldFile = file;
        file = newFile;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, MainPackage.MAIN_LOADER__FILE, oldFile, file ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Configuration configuration, final Project project )
    {
        try
        {
            MainLoaderHandler.loadBasics ( System.out, configuration, new File ( FileLocator.toFileURL ( new URL ( getFile () ) ).getFile () ) );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
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
            case MainPackage.MAIN_LOADER__FILE:
                return getFile ();
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
            case MainPackage.MAIN_LOADER__FILE:
                setFile ( (String)newValue );
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
            case MainPackage.MAIN_LOADER__FILE:
                setFile ( FILE_EDEFAULT );
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
            case MainPackage.MAIN_LOADER__FILE:
                return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals ( file );
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
        result.append ( " (file: " );
        result.append ( file );
        result.append ( ')' );
        return result.toString ();
    }

} //MainLoaderImpl

/**
 */
package org.openscada.configurator.processor.common.main.impl;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configuration.model.GenericMasterConfigurationSlot;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.data.DataLoaderOdfDom;
import org.openscada.configurator.loader.main.AuthorizationHandler;
import org.openscada.configurator.processor.common.main.AuthorizationLoader;
import org.openscada.configurator.processor.common.main.MainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.main.impl.AuthorizationLoaderImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.main.impl.AuthorizationLoaderImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorizationLoaderImpl extends EObjectImpl implements AuthorizationLoader
{
    /**
     * The default value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected static final String FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected String file = FILE_EDEFAULT;

    /**
     * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlot()
     * @generated
     * @ordered
     */
    protected GenericMasterConfigurationSlot slot;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuthorizationLoaderImpl ()
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
        return MainPackage.Literals.AUTHORIZATION_LOADER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFile ()
    {
        return file;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFile ( String newFile )
    {
        String oldFile = file;
        file = newFile;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, MainPackage.AUTHORIZATION_LOADER__FILE, oldFile, file ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenericMasterConfigurationSlot getSlot ()
    {
        if ( slot != null && slot.eIsProxy () )
        {
            InternalEObject oldSlot = (InternalEObject)slot;
            slot = (GenericMasterConfigurationSlot)eResolveProxy ( oldSlot );
            if ( slot != oldSlot )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, MainPackage.AUTHORIZATION_LOADER__SLOT, oldSlot, slot ) );
            }
        }
        return slot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericMasterConfigurationSlot basicGetSlot ()
    {
        return slot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSlot ( GenericMasterConfigurationSlot newSlot )
    {
        GenericMasterConfigurationSlot oldSlot = slot;
        slot = newSlot;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, MainPackage.AUTHORIZATION_LOADER__SLOT, oldSlot, slot ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Project project ) throws Exception
    {
        final DataLoaderOdfDom loader = new DataLoaderOdfDom ( new File ( FileLocator.toFileURL ( new URL ( getFile () ) ).getFile () ) );

        loader.load ( 1, new AuthorizationHandler ( getSlot ().getConfigurationData () ) );
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
            case MainPackage.AUTHORIZATION_LOADER__FILE:
                return getFile ();
            case MainPackage.AUTHORIZATION_LOADER__SLOT:
                if ( resolve )
                    return getSlot ();
                return basicGetSlot ();
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
            case MainPackage.AUTHORIZATION_LOADER__FILE:
                setFile ( (String)newValue );
                return;
            case MainPackage.AUTHORIZATION_LOADER__SLOT:
                setSlot ( (GenericMasterConfigurationSlot)newValue );
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
            case MainPackage.AUTHORIZATION_LOADER__FILE:
                setFile ( FILE_EDEFAULT );
                return;
            case MainPackage.AUTHORIZATION_LOADER__SLOT:
                setSlot ( (GenericMasterConfigurationSlot)null );
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
            case MainPackage.AUTHORIZATION_LOADER__FILE:
                return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals ( file );
            case MainPackage.AUTHORIZATION_LOADER__SLOT:
                return slot != null;
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
        result.append ( " (file: " );
        result.append ( file );
        result.append ( ')' );
        return result.toString ();
    }

} //AuthorizationLoaderImpl

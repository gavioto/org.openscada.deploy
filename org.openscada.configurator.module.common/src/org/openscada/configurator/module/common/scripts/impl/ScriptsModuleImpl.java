/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.scripts.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.scripts.ScriptsModule;
import org.openscada.configurator.module.common.scripts.ScriptsPackage;
import org.openscada.configurator.module.common.scripts.handler.ScriptLoader;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.scripts.impl.ScriptsModuleImpl#getScriptsFile <em>Scripts File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptsModuleImpl extends EObjectImpl implements ScriptsModule
{
    /**
     * The default value of the '{@link #getScriptsFile() <em>Scripts File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getScriptsFile()
     * @generated
     * @ordered
     */
    protected static final String SCRIPTS_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScriptsFile() <em>Scripts File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getScriptsFile()
     * @generated
     * @ordered
     */
    protected String scriptsFile = SCRIPTS_FILE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ScriptsModuleImpl ()
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
        return ScriptsPackage.Literals.SCRIPTS_MODULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getScriptsFile ()
    {
        return scriptsFile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScriptsFile ( String newScriptsFile )
    {
        String oldScriptsFile = scriptsFile;
        scriptsFile = newScriptsFile;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ScriptsPackage.SCRIPTS_MODULE__SCRIPTS_FILE, oldScriptsFile, scriptsFile ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Configuration configuration, final Project project )
    {
        ScriptLoader.loadScripts ( configuration, project, this );
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
            case ScriptsPackage.SCRIPTS_MODULE__SCRIPTS_FILE:
                return getScriptsFile ();
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
            case ScriptsPackage.SCRIPTS_MODULE__SCRIPTS_FILE:
                setScriptsFile ( (String)newValue );
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
            case ScriptsPackage.SCRIPTS_MODULE__SCRIPTS_FILE:
                setScriptsFile ( SCRIPTS_FILE_EDEFAULT );
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
            case ScriptsPackage.SCRIPTS_MODULE__SCRIPTS_FILE:
                return SCRIPTS_FILE_EDEFAULT == null ? scriptsFile != null : !SCRIPTS_FILE_EDEFAULT.equals ( scriptsFile );
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
        result.append ( " (scriptsFile: " );
        result.append ( scriptsFile );
        result.append ( ')' );
        return result.toString ();
    }

} //ScriptsModuleImpl

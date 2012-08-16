/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.impl.ProjectImpl#getMainConfiguration <em>Main Configuration</em>}</li>
 *   <li>{@link org.openscada.configuration.model.impl.ProjectImpl#getJsonBase <em>Json Base</em>}</li>
 *   <li>{@link org.openscada.configuration.model.impl.ProjectImpl#getOutputBase <em>Output Base</em>}</li>
 *   <li>{@link org.openscada.configuration.model.impl.ProjectImpl#getScriptOverrideDirectory <em>Script Override Directory</em>}</li>
 *   <li>{@link org.openscada.configuration.model.impl.ProjectImpl#getLegacyBaseDirectory <em>Legacy Base Directory</em>}</li>
 *   <li>{@link org.openscada.configuration.model.impl.ProjectImpl#getIoListFile <em>Io List File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project
{
    /**
     * The default value of the '{@link #getMainConfiguration() <em>Main Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMainConfiguration()
     * @generated
     * @ordered
     */
    protected static final String MAIN_CONFIGURATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMainConfiguration() <em>Main Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMainConfiguration()
     * @generated
     * @ordered
     */
    protected String mainConfiguration = MAIN_CONFIGURATION_EDEFAULT;

    /**
     * The cached value of the '{@link #getJsonBase() <em>Json Base</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJsonBase()
     * @generated
     * @ordered
     */
    protected EList<String> jsonBase;

    /**
     * The default value of the '{@link #getOutputBase() <em>Output Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputBase()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_BASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutputBase() <em>Output Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputBase()
     * @generated
     * @ordered
     */
    protected String outputBase = OUTPUT_BASE_EDEFAULT;

    /**
     * The default value of the '{@link #getScriptOverrideDirectory() <em>Script Override Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptOverrideDirectory()
     * @generated
     * @ordered
     */
    protected static final String SCRIPT_OVERRIDE_DIRECTORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScriptOverrideDirectory() <em>Script Override Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptOverrideDirectory()
     * @generated
     * @ordered
     */
    protected String scriptOverrideDirectory = SCRIPT_OVERRIDE_DIRECTORY_EDEFAULT;

    /**
     * The default value of the '{@link #getLegacyBaseDirectory() <em>Legacy Base Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLegacyBaseDirectory()
     * @generated
     * @ordered
     */
    protected static final String LEGACY_BASE_DIRECTORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLegacyBaseDirectory() <em>Legacy Base Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLegacyBaseDirectory()
     * @generated
     * @ordered
     */
    protected String legacyBaseDirectory = LEGACY_BASE_DIRECTORY_EDEFAULT;

    /**
     * The cached value of the '{@link #getIoListFile() <em>Io List File</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIoListFile()
     * @generated
     * @ordered
     */
    protected EList<String> ioListFile;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProjectImpl ()
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
        return ConfiguratorPackage.Literals.PROJECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMainConfiguration ()
    {
        return mainConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMainConfiguration ( String newMainConfiguration )
    {
        String oldMainConfiguration = mainConfiguration;
        mainConfiguration = newMainConfiguration;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ConfiguratorPackage.PROJECT__MAIN_CONFIGURATION, oldMainConfiguration, mainConfiguration ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getJsonBase ()
    {
        if ( jsonBase == null )
        {
            jsonBase = new EDataTypeUniqueEList<String> ( String.class, this, ConfiguratorPackage.PROJECT__JSON_BASE );
        }
        return jsonBase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOutputBase ()
    {
        return outputBase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputBase ( String newOutputBase )
    {
        String oldOutputBase = outputBase;
        outputBase = newOutputBase;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ConfiguratorPackage.PROJECT__OUTPUT_BASE, oldOutputBase, outputBase ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getScriptOverrideDirectory ()
    {
        return scriptOverrideDirectory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScriptOverrideDirectory ( String newScriptOverrideDirectory )
    {
        String oldScriptOverrideDirectory = scriptOverrideDirectory;
        scriptOverrideDirectory = newScriptOverrideDirectory;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ConfiguratorPackage.PROJECT__SCRIPT_OVERRIDE_DIRECTORY, oldScriptOverrideDirectory, scriptOverrideDirectory ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLegacyBaseDirectory ()
    {
        return legacyBaseDirectory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLegacyBaseDirectory ( String newLegacyBaseDirectory )
    {
        String oldLegacyBaseDirectory = legacyBaseDirectory;
        legacyBaseDirectory = newLegacyBaseDirectory;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ConfiguratorPackage.PROJECT__LEGACY_BASE_DIRECTORY, oldLegacyBaseDirectory, legacyBaseDirectory ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getIoListFile ()
    {
        if ( ioListFile == null )
        {
            ioListFile = new EDataTypeUniqueEList<String> ( String.class, this, ConfiguratorPackage.PROJECT__IO_LIST_FILE );
        }
        return ioListFile;
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
            case ConfiguratorPackage.PROJECT__MAIN_CONFIGURATION:
                return getMainConfiguration ();
            case ConfiguratorPackage.PROJECT__JSON_BASE:
                return getJsonBase ();
            case ConfiguratorPackage.PROJECT__OUTPUT_BASE:
                return getOutputBase ();
            case ConfiguratorPackage.PROJECT__SCRIPT_OVERRIDE_DIRECTORY:
                return getScriptOverrideDirectory ();
            case ConfiguratorPackage.PROJECT__LEGACY_BASE_DIRECTORY:
                return getLegacyBaseDirectory ();
            case ConfiguratorPackage.PROJECT__IO_LIST_FILE:
                return getIoListFile ();
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
            case ConfiguratorPackage.PROJECT__MAIN_CONFIGURATION:
                setMainConfiguration ( (String)newValue );
                return;
            case ConfiguratorPackage.PROJECT__JSON_BASE:
                getJsonBase ().clear ();
                getJsonBase ().addAll ( (Collection<? extends String>)newValue );
                return;
            case ConfiguratorPackage.PROJECT__OUTPUT_BASE:
                setOutputBase ( (String)newValue );
                return;
            case ConfiguratorPackage.PROJECT__SCRIPT_OVERRIDE_DIRECTORY:
                setScriptOverrideDirectory ( (String)newValue );
                return;
            case ConfiguratorPackage.PROJECT__LEGACY_BASE_DIRECTORY:
                setLegacyBaseDirectory ( (String)newValue );
                return;
            case ConfiguratorPackage.PROJECT__IO_LIST_FILE:
                getIoListFile ().clear ();
                getIoListFile ().addAll ( (Collection<? extends String>)newValue );
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
            case ConfiguratorPackage.PROJECT__MAIN_CONFIGURATION:
                setMainConfiguration ( MAIN_CONFIGURATION_EDEFAULT );
                return;
            case ConfiguratorPackage.PROJECT__JSON_BASE:
                getJsonBase ().clear ();
                return;
            case ConfiguratorPackage.PROJECT__OUTPUT_BASE:
                setOutputBase ( OUTPUT_BASE_EDEFAULT );
                return;
            case ConfiguratorPackage.PROJECT__SCRIPT_OVERRIDE_DIRECTORY:
                setScriptOverrideDirectory ( SCRIPT_OVERRIDE_DIRECTORY_EDEFAULT );
                return;
            case ConfiguratorPackage.PROJECT__LEGACY_BASE_DIRECTORY:
                setLegacyBaseDirectory ( LEGACY_BASE_DIRECTORY_EDEFAULT );
                return;
            case ConfiguratorPackage.PROJECT__IO_LIST_FILE:
                getIoListFile ().clear ();
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
            case ConfiguratorPackage.PROJECT__MAIN_CONFIGURATION:
                return MAIN_CONFIGURATION_EDEFAULT == null ? mainConfiguration != null : !MAIN_CONFIGURATION_EDEFAULT.equals ( mainConfiguration );
            case ConfiguratorPackage.PROJECT__JSON_BASE:
                return jsonBase != null && !jsonBase.isEmpty ();
            case ConfiguratorPackage.PROJECT__OUTPUT_BASE:
                return OUTPUT_BASE_EDEFAULT == null ? outputBase != null : !OUTPUT_BASE_EDEFAULT.equals ( outputBase );
            case ConfiguratorPackage.PROJECT__SCRIPT_OVERRIDE_DIRECTORY:
                return SCRIPT_OVERRIDE_DIRECTORY_EDEFAULT == null ? scriptOverrideDirectory != null : !SCRIPT_OVERRIDE_DIRECTORY_EDEFAULT.equals ( scriptOverrideDirectory );
            case ConfiguratorPackage.PROJECT__LEGACY_BASE_DIRECTORY:
                return LEGACY_BASE_DIRECTORY_EDEFAULT == null ? legacyBaseDirectory != null : !LEGACY_BASE_DIRECTORY_EDEFAULT.equals ( legacyBaseDirectory );
            case ConfiguratorPackage.PROJECT__IO_LIST_FILE:
                return ioListFile != null && !ioListFile.isEmpty ();
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
        result.append ( " (mainConfiguration: " );
        result.append ( mainConfiguration );
        result.append ( ", jsonBase: " );
        result.append ( jsonBase );
        result.append ( ", outputBase: " );
        result.append ( outputBase );
        result.append ( ", scriptOverrideDirectory: " );
        result.append ( scriptOverrideDirectory );
        result.append ( ", legacyBaseDirectory: " );
        result.append ( legacyBaseDirectory );
        result.append ( ", ioListFile: " );
        result.append ( ioListFile );
        result.append ( ')' );
        return result.toString ();
    }

} //ProjectImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.scripts.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.scripts.ScriptsMonitorModule;
import org.openscada.configurator.module.common.scripts.ScriptsPackage;
import org.openscada.configurator.module.common.scripts.handler.ScriptMonitorImporter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Monitor Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openscada.configurator.module.common.scripts.impl.ScriptsMonitorModuleImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ScriptsMonitorModuleImpl extends EObjectImpl implements ScriptsMonitorModule
{
    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected EList<String> path;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ScriptsMonitorModuleImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ScriptsPackage.Literals.SCRIPTS_MONITOR_MODULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<String> getPath ()
    {
        if ( this.path == null )
        {
            this.path = new EDataTypeUniqueEList<String> ( String.class, this, ScriptsPackage.SCRIPTS_MONITOR_MODULE__PATH );
        }
        return this.path;
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
            new ScriptMonitorImporter ().process ( configuration, project, this );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( "Failed to configure script monitors", e );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet ( final int featureID, final boolean resolve, final boolean coreType )
    {
        switch ( featureID )
        {
            case ScriptsPackage.SCRIPTS_MONITOR_MODULE__PATH:
                return getPath ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( final int featureID, final Object newValue )
    {
        switch ( featureID )
        {
            case ScriptsPackage.SCRIPTS_MONITOR_MODULE__PATH:
                getPath ().clear ();
                getPath ().addAll ( (Collection<? extends String>)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset ( final int featureID )
    {
        switch ( featureID )
        {
            case ScriptsPackage.SCRIPTS_MONITOR_MODULE__PATH:
                getPath ().clear ();
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet ( final int featureID )
    {
        switch ( featureID )
        {
            case ScriptsPackage.SCRIPTS_MONITOR_MODULE__PATH:
                return this.path != null && !this.path.isEmpty ();
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
        {
            return super.toString ();
        }

        final StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (path: " );
        result.append ( this.path );
        result.append ( ')' );
        return result.toString ();
    }

} //ScriptsMonitorModuleImpl

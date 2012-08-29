/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.CommonPackage;
import org.openscada.configurator.module.common.FileModule;
import org.openscada.configurator.module.common.processing.ImportModule;
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.handler.ImportHandler;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Import Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.processing.impl.ImportModuleImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportModuleImpl extends EObjectImpl implements ImportModule
{
    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected EList<String> path;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ImportModuleImpl ()
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
        return ProcessingPackage.Literals.IMPORT_MODULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getPath ()
    {
        if ( path == null )
        {
            path = new EDataTypeUniqueEList<String> ( String.class, this, ProcessingPackage.IMPORT_MODULE__PATH );
        }
        return path;
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
            new ImportHandler ().process ( configuration, project, this );
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
            case ProcessingPackage.IMPORT_MODULE__PATH:
                return getPath ();
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
            case ProcessingPackage.IMPORT_MODULE__PATH:
                getPath ().clear ();
                getPath ().addAll ( (Collection<? extends String>)newValue );
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
            case ProcessingPackage.IMPORT_MODULE__PATH:
                getPath ().clear ();
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
            case ProcessingPackage.IMPORT_MODULE__PATH:
                return path != null && !path.isEmpty ();
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID ( int derivedFeatureID, Class<?> baseClass )
    {
        if ( baseClass == FileModule.class )
        {
            switch ( derivedFeatureID )
            {
                case ProcessingPackage.IMPORT_MODULE__PATH:
                    return CommonPackage.FILE_MODULE__PATH;
                default:
                    return -1;
            }
        }
        return super.eBaseStructuralFeatureID ( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID ( int baseFeatureID, Class<?> baseClass )
    {
        if ( baseClass == FileModule.class )
        {
            switch ( baseFeatureID )
            {
                case CommonPackage.FILE_MODULE__PATH:
                    return ProcessingPackage.IMPORT_MODULE__PATH;
                default:
                    return -1;
            }
        }
        return super.eDerivedStructuralFeatureID ( baseFeatureID, baseClass );
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
        result.append ( " (path: " );
        result.append ( path );
        result.append ( ')' );
        return result.toString ();
    }

} //ImportModuleImpl

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
import org.openscada.configurator.module.common.scripts.LegacyFormulaModule;
import org.openscada.configurator.module.common.scripts.ScriptsPackage;
import org.openscada.configurator.module.common.scripts.handler.LegacyForumalsLoader;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Legacy Formula Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.scripts.impl.LegacyFormulaModuleImpl#getFormulaFile <em>Formula File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegacyFormulaModuleImpl extends EObjectImpl implements LegacyFormulaModule
{
    /**
     * The default value of the '{@link #getFormulaFile() <em>Formula File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFormulaFile()
     * @generated
     * @ordered
     */
    protected static final String FORMULA_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFormulaFile() <em>Formula File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFormulaFile()
     * @generated
     * @ordered
     */
    protected String formulaFile = FORMULA_FILE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected LegacyFormulaModuleImpl ()
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
        return ScriptsPackage.Literals.LEGACY_FORMULA_MODULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFormulaFile ()
    {
        return formulaFile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFormulaFile ( String newFormulaFile )
    {
        String oldFormulaFile = formulaFile;
        formulaFile = newFormulaFile;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ScriptsPackage.LEGACY_FORMULA_MODULE__FORMULA_FILE, oldFormulaFile, formulaFile ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Configuration cfg, final Project project )
    {
        LegacyForumalsLoader.loadScript ( cfg, project, this );
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
            case ScriptsPackage.LEGACY_FORMULA_MODULE__FORMULA_FILE:
                return getFormulaFile ();
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
            case ScriptsPackage.LEGACY_FORMULA_MODULE__FORMULA_FILE:
                setFormulaFile ( (String)newValue );
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
            case ScriptsPackage.LEGACY_FORMULA_MODULE__FORMULA_FILE:
                setFormulaFile ( FORMULA_FILE_EDEFAULT );
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
            case ScriptsPackage.LEGACY_FORMULA_MODULE__FORMULA_FILE:
                return FORMULA_FILE_EDEFAULT == null ? formulaFile != null : !FORMULA_FILE_EDEFAULT.equals ( formulaFile );
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
        result.append ( " (formulaFile: " );
        result.append ( formulaFile );
        result.append ( ')' );
        return result.toString ();
    }

} //LegacyFormulaModuleImpl

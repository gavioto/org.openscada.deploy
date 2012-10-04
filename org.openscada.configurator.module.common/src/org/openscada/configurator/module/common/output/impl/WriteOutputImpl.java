/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.output.OutputPackage;
import org.openscada.configurator.module.common.output.WriteOutput;
import org.openscada.configurator.module.common.output.handler.WriteHandler;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Write Output</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openscada.configurator.module.common.output.impl.WriteOutputImpl#getBaseDirectory <em>Base Directory</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WriteOutputImpl extends EObjectImpl implements WriteOutput
{
    /**
     * The default value of the '{@link #getBaseDirectory() <em>Base Directory</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBaseDirectory()
     * @generated
     * @ordered
     */
    protected static final String BASE_DIRECTORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBaseDirectory() <em>Base Directory</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBaseDirectory()
     * @generated
     * @ordered
     */
    protected String baseDirectory = BASE_DIRECTORY_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected WriteOutputImpl ()
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
        return OutputPackage.Literals.WRITE_OUTPUT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getBaseDirectory ()
    {
        return this.baseDirectory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setBaseDirectory ( final String newBaseDirectory )
    {
        final String oldBaseDirectory = this.baseDirectory;
        this.baseDirectory = newBaseDirectory;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, OutputPackage.WRITE_OUTPUT__BASE_DIRECTORY, oldBaseDirectory, this.baseDirectory ) );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Configuration configuration, final Project project )
    {
        new WriteHandler ().process ( configuration, this );
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
            case OutputPackage.WRITE_OUTPUT__BASE_DIRECTORY:
                return getBaseDirectory ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet ( final int featureID, final Object newValue )
    {
        switch ( featureID )
        {
            case OutputPackage.WRITE_OUTPUT__BASE_DIRECTORY:
                setBaseDirectory ( (String)newValue );
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
            case OutputPackage.WRITE_OUTPUT__BASE_DIRECTORY:
                setBaseDirectory ( BASE_DIRECTORY_EDEFAULT );
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
            case OutputPackage.WRITE_OUTPUT__BASE_DIRECTORY:
                return BASE_DIRECTORY_EDEFAULT == null ? this.baseDirectory != null : !BASE_DIRECTORY_EDEFAULT.equals ( this.baseDirectory );
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
        result.append ( " (baseDirectory: " );
        result.append ( this.baseDirectory );
        result.append ( ')' );
        return result.toString ();
    }

} //WriteOutputImpl

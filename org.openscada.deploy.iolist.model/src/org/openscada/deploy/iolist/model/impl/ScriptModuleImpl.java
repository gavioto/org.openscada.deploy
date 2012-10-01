/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.ScriptModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptModuleImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptModuleImpl#isResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptModuleImpl extends EObjectImpl implements ScriptModule
{
    /**
     * The default value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected static final String DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected String data = DATA_EDEFAULT;

    /**
     * The default value of the '{@link #isResource() <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isResource()
     * @generated
     * @ordered
     */
    protected static final boolean RESOURCE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isResource() <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isResource()
     * @generated
     * @ordered
     */
    protected boolean resource = RESOURCE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScriptModuleImpl ()
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
        return ModelPackage.Literals.SCRIPT_MODULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getData ()
    {
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setData ( String newData )
    {
        String oldData = data;
        data = newData;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_MODULE__DATA, oldData, data ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isResource ()
    {
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResource ( boolean newResource )
    {
        boolean oldResource = resource;
        resource = newResource;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_MODULE__RESOURCE, oldResource, resource ) );
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
        case ModelPackage.SCRIPT_MODULE__DATA:
            return getData ();
        case ModelPackage.SCRIPT_MODULE__RESOURCE:
            return isResource ();
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
        case ModelPackage.SCRIPT_MODULE__DATA:
            setData ( (String)newValue );
            return;
        case ModelPackage.SCRIPT_MODULE__RESOURCE:
            setResource ( (Boolean)newValue );
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
        case ModelPackage.SCRIPT_MODULE__DATA:
            setData ( DATA_EDEFAULT );
            return;
        case ModelPackage.SCRIPT_MODULE__RESOURCE:
            setResource ( RESOURCE_EDEFAULT );
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
        case ModelPackage.SCRIPT_MODULE__DATA:
            return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals ( data );
        case ModelPackage.SCRIPT_MODULE__RESOURCE:
            return resource != RESOURCE_EDEFAULT;
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
        result.append ( " (data: " );
        result.append ( data );
        result.append ( ", resource: " );
        result.append ( resource );
        result.append ( ')' );
        return result.toString ();
    }

} //ScriptModuleImpl

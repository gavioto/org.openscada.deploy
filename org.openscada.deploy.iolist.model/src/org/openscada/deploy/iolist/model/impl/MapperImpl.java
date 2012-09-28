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
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MapperImpl#getMapperId <em>Mapper Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MapperImpl#getFromAttribute <em>From Attribute</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.MapperImpl#getToAttribute <em>To Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapperImpl extends EObjectImpl implements Mapper
{
    /**
     * The default value of the '{@link #getMapperId() <em>Mapper Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMapperId()
     * @generated
     * @ordered
     */
    protected static final String MAPPER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMapperId() <em>Mapper Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMapperId()
     * @generated
     * @ordered
     */
    protected String mapperId = MAPPER_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getFromAttribute() <em>From Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromAttribute()
     * @generated
     * @ordered
     */
    protected static final String FROM_ATTRIBUTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFromAttribute() <em>From Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromAttribute()
     * @generated
     * @ordered
     */
    protected String fromAttribute = FROM_ATTRIBUTE_EDEFAULT;

    /**
     * The default value of the '{@link #getToAttribute() <em>To Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToAttribute()
     * @generated
     * @ordered
     */
    protected static final String TO_ATTRIBUTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToAttribute() <em>To Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToAttribute()
     * @generated
     * @ordered
     */
    protected String toAttribute = TO_ATTRIBUTE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MapperImpl ()
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
        return ModelPackage.Literals.MAPPER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMapperId ()
    {
        return mapperId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMapperId ( String newMapperId )
    {
        String oldMapperId = mapperId;
        mapperId = newMapperId;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MAPPER__MAPPER_ID, oldMapperId, mapperId ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFromAttribute ()
    {
        return fromAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFromAttribute ( String newFromAttribute )
    {
        String oldFromAttribute = fromAttribute;
        fromAttribute = newFromAttribute;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MAPPER__FROM_ATTRIBUTE, oldFromAttribute, fromAttribute ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getToAttribute ()
    {
        return toAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setToAttribute ( String newToAttribute )
    {
        String oldToAttribute = toAttribute;
        toAttribute = newToAttribute;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MAPPER__TO_ATTRIBUTE, oldToAttribute, toAttribute ) );
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
        case ModelPackage.MAPPER__MAPPER_ID:
            return getMapperId ();
        case ModelPackage.MAPPER__FROM_ATTRIBUTE:
            return getFromAttribute ();
        case ModelPackage.MAPPER__TO_ATTRIBUTE:
            return getToAttribute ();
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
        case ModelPackage.MAPPER__MAPPER_ID:
            setMapperId ( (String)newValue );
            return;
        case ModelPackage.MAPPER__FROM_ATTRIBUTE:
            setFromAttribute ( (String)newValue );
            return;
        case ModelPackage.MAPPER__TO_ATTRIBUTE:
            setToAttribute ( (String)newValue );
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
        case ModelPackage.MAPPER__MAPPER_ID:
            setMapperId ( MAPPER_ID_EDEFAULT );
            return;
        case ModelPackage.MAPPER__FROM_ATTRIBUTE:
            setFromAttribute ( FROM_ATTRIBUTE_EDEFAULT );
            return;
        case ModelPackage.MAPPER__TO_ATTRIBUTE:
            setToAttribute ( TO_ATTRIBUTE_EDEFAULT );
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
        case ModelPackage.MAPPER__MAPPER_ID:
            return MAPPER_ID_EDEFAULT == null ? mapperId != null : !MAPPER_ID_EDEFAULT.equals ( mapperId );
        case ModelPackage.MAPPER__FROM_ATTRIBUTE:
            return FROM_ATTRIBUTE_EDEFAULT == null ? fromAttribute != null : !FROM_ATTRIBUTE_EDEFAULT.equals ( fromAttribute );
        case ModelPackage.MAPPER__TO_ATTRIBUTE:
            return TO_ATTRIBUTE_EDEFAULT == null ? toAttribute != null : !TO_ATTRIBUTE_EDEFAULT.equals ( toAttribute );
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
        result.append ( " (mapperId: " );
        result.append ( mapperId );
        result.append ( ", fromAttribute: " );
        result.append ( fromAttribute );
        result.append ( ", toAttribute: " );
        result.append ( toAttribute );
        result.append ( ')' );
        return result.toString ();
    }

} //MapperImpl

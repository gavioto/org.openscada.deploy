/**
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2013 Jens Reimann (ctron@dentrassi.de)
 * 
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 * 
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 * 
 */
package org.openscada.configurator.sec.impl;

import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openscada.configurator.sec.PreFilterRule;
import org.openscada.configurator.sec.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Filter Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.sec.impl.PreFilterRuleImpl#getIdFilter <em>Id Filter</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.impl.PreFilterRuleImpl#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link org.openscada.configurator.sec.impl.PreFilterRuleImpl#getActionFilter <em>Action Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PreFilterRuleImpl extends RuleImpl implements PreFilterRule
{
    /**
     * The default value of the '{@link #getIdFilter() <em>Id Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdFilter()
     * @generated
     * @ordered
     */
    protected static final Pattern ID_FILTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdFilter() <em>Id Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdFilter()
     * @generated
     * @ordered
     */
    protected Pattern idFilter = ID_FILTER_EDEFAULT;

    /**
     * The default value of the '{@link #getTypeFilter() <em>Type Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeFilter()
     * @generated
     * @ordered
     */
    protected static final Pattern TYPE_FILTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTypeFilter() <em>Type Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeFilter()
     * @generated
     * @ordered
     */
    protected Pattern typeFilter = TYPE_FILTER_EDEFAULT;

    /**
     * The default value of the '{@link #getActionFilter() <em>Action Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionFilter()
     * @generated
     * @ordered
     */
    protected static final Pattern ACTION_FILTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActionFilter() <em>Action Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionFilter()
     * @generated
     * @ordered
     */
    protected Pattern actionFilter = ACTION_FILTER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PreFilterRuleImpl ()
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
        return SecurityPackage.Literals.PRE_FILTER_RULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pattern getIdFilter ()
    {
        return idFilter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdFilter ( Pattern newIdFilter )
    {
        Pattern oldIdFilter = idFilter;
        idFilter = newIdFilter;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.PRE_FILTER_RULE__ID_FILTER, oldIdFilter, idFilter ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pattern getTypeFilter ()
    {
        return typeFilter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypeFilter ( Pattern newTypeFilter )
    {
        Pattern oldTypeFilter = typeFilter;
        typeFilter = newTypeFilter;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.PRE_FILTER_RULE__TYPE_FILTER, oldTypeFilter, typeFilter ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pattern getActionFilter ()
    {
        return actionFilter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActionFilter ( Pattern newActionFilter )
    {
        Pattern oldActionFilter = actionFilter;
        actionFilter = newActionFilter;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SecurityPackage.PRE_FILTER_RULE__ACTION_FILTER, oldActionFilter, actionFilter ) );
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
            case SecurityPackage.PRE_FILTER_RULE__ID_FILTER:
                return getIdFilter ();
            case SecurityPackage.PRE_FILTER_RULE__TYPE_FILTER:
                return getTypeFilter ();
            case SecurityPackage.PRE_FILTER_RULE__ACTION_FILTER:
                return getActionFilter ();
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
            case SecurityPackage.PRE_FILTER_RULE__ID_FILTER:
                setIdFilter ( (Pattern)newValue );
                return;
            case SecurityPackage.PRE_FILTER_RULE__TYPE_FILTER:
                setTypeFilter ( (Pattern)newValue );
                return;
            case SecurityPackage.PRE_FILTER_RULE__ACTION_FILTER:
                setActionFilter ( (Pattern)newValue );
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
            case SecurityPackage.PRE_FILTER_RULE__ID_FILTER:
                setIdFilter ( ID_FILTER_EDEFAULT );
                return;
            case SecurityPackage.PRE_FILTER_RULE__TYPE_FILTER:
                setTypeFilter ( TYPE_FILTER_EDEFAULT );
                return;
            case SecurityPackage.PRE_FILTER_RULE__ACTION_FILTER:
                setActionFilter ( ACTION_FILTER_EDEFAULT );
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
            case SecurityPackage.PRE_FILTER_RULE__ID_FILTER:
                return ID_FILTER_EDEFAULT == null ? idFilter != null : !ID_FILTER_EDEFAULT.equals ( idFilter );
            case SecurityPackage.PRE_FILTER_RULE__TYPE_FILTER:
                return TYPE_FILTER_EDEFAULT == null ? typeFilter != null : !TYPE_FILTER_EDEFAULT.equals ( typeFilter );
            case SecurityPackage.PRE_FILTER_RULE__ACTION_FILTER:
                return ACTION_FILTER_EDEFAULT == null ? actionFilter != null : !ACTION_FILTER_EDEFAULT.equals ( actionFilter );
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
        result.append ( " (idFilter: " );
        result.append ( idFilter );
        result.append ( ", typeFilter: " );
        result.append ( typeFilter );
        result.append ( ", actionFilter: " );
        result.append ( actionFilter );
        result.append ( ')' );
        return result.toString ();
    }

} //PreFilterRuleImpl

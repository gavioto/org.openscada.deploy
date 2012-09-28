/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.summary.CleanupSummaries;
import org.openscada.configurator.module.common.summary.SummaryPackage;
import org.openscada.configurator.module.common.summary.handler.CleanupHandler;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cleanup Summaries</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openscada.configurator.module.common.summary.impl.CleanupSummariesImpl#getRequiredItems <em>Required Items</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CleanupSummariesImpl extends EObjectImpl implements CleanupSummaries
{
    /**
     * The default value of the '{@link #getRequiredItems() <em>Required Items</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRequiredItems()
     * @generated
     * @ordered
     */
    protected static final int REQUIRED_ITEMS_EDEFAULT = 2;

    /**
     * The cached value of the '{@link #getRequiredItems() <em>Required Items</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRequiredItems()
     * @generated
     * @ordered
     */
    protected int requiredItems = REQUIRED_ITEMS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CleanupSummariesImpl ()
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
        return SummaryPackage.Literals.CLEANUP_SUMMARIES;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getRequiredItems ()
    {
        return this.requiredItems;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRequiredItems ( final int newRequiredItems )
    {
        final int oldRequiredItems = this.requiredItems;
        this.requiredItems = newRequiredItems;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, SummaryPackage.CLEANUP_SUMMARIES__REQUIRED_ITEMS, oldRequiredItems, this.requiredItems ) );
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
        CleanupHandler.process ( configuration, project, this );
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
            case SummaryPackage.CLEANUP_SUMMARIES__REQUIRED_ITEMS:
                return getRequiredItems ();
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
            case SummaryPackage.CLEANUP_SUMMARIES__REQUIRED_ITEMS:
                setRequiredItems ( (Integer)newValue );
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
            case SummaryPackage.CLEANUP_SUMMARIES__REQUIRED_ITEMS:
                setRequiredItems ( REQUIRED_ITEMS_EDEFAULT );
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
            case SummaryPackage.CLEANUP_SUMMARIES__REQUIRED_ITEMS:
                return this.requiredItems != REQUIRED_ITEMS_EDEFAULT;
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
        result.append ( " (requiredItems: " );
        result.append ( this.requiredItems );
        result.append ( ')' );
        return result.toString ();
    }

} //CleanupSummariesImpl

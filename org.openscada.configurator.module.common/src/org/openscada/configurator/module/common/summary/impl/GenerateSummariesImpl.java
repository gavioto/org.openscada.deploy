/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary.impl;

import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.summary.GenerateSummaries;
import org.openscada.configurator.module.common.summary.SummaryPackage;
import org.openscada.configurator.module.common.summary.handler.SummaryGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Generate Summaries</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.summary.impl.GenerateSummariesImpl#getSubItemPattern <em>Sub Item Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenerateSummariesImpl extends EObjectImpl implements GenerateSummaries
{
    /**
     * The default value of the '{@link #getSubItemPattern() <em>Sub Item Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubItemPattern()
     * @generated
     * @ordered
     */
    protected static final Pattern SUB_ITEM_PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubItemPattern() <em>Sub Item Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubItemPattern()
     * @generated
     * @ordered
     */
    protected Pattern subItemPattern = SUB_ITEM_PATTERN_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected GenerateSummariesImpl ()
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
        return SummaryPackage.Literals.GENERATE_SUMMARIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pattern getSubItemPattern ()
    {
        return subItemPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubItemPattern ( Pattern newSubItemPattern )
    {
        Pattern oldSubItemPattern = subItemPattern;
        subItemPattern = newSubItemPattern;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN, oldSubItemPattern, subItemPattern ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Configuration configuration, final Project project )
    {
        new SummaryGenerator ( project, configuration, this ).generateSummaryAlarms ();
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
            case SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN:
                return getSubItemPattern ();
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
            case SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN:
                setSubItemPattern ( (Pattern)newValue );
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
            case SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN:
                setSubItemPattern ( SUB_ITEM_PATTERN_EDEFAULT );
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
            case SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN:
                return SUB_ITEM_PATTERN_EDEFAULT == null ? subItemPattern != null : !SUB_ITEM_PATTERN_EDEFAULT.equals ( subItemPattern );
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
        result.append ( " (subItemPattern: " );
        result.append ( subItemPattern );
        result.append ( ')' );
        return result.toString ();
    }

} //GenerateSummariesImpl

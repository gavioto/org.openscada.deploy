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
 * <li>
 * {@link org.openscada.configurator.module.common.summary.impl.GenerateSummariesImpl#getPrefix
 * <em>Prefix</em>}</li>
 * <li>
 * {@link org.openscada.configurator.module.common.summary.impl.GenerateSummariesImpl#getSuffix
 * <em>Suffix</em>}</li>
 * <li>
 * {@link org.openscada.configurator.module.common.summary.impl.GenerateSummariesImpl#getSubItemPattern
 * <em>Sub Item Pattern</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GenerateSummariesImpl extends EObjectImpl implements GenerateSummaries
{
    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}'
     * attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * The default value of the '{@link #getSuffix() <em>Suffix</em>}'
     * attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSuffix()
     * @generated
     * @ordered
     */
    protected static final String SUFFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSuffix()
     * @generated
     * @ordered
     */
    protected String suffix = SUFFIX_EDEFAULT;

    /**
     * The default value of the '{@link #getSubItemPattern()
     * <em>Sub Item Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSubItemPattern()
     * @generated
     * @ordered
     */
    protected static final Pattern SUB_ITEM_PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubItemPattern()
     * <em>Sub Item Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSubItemPattern()
     * @generated
     * @ordered
     */
    protected Pattern subItemPattern = SUB_ITEM_PATTERN_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected GenerateSummariesImpl ()
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
        return SummaryPackage.Literals.GENERATE_SUMMARIES;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getPrefix ()
    {
        return this.prefix;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPrefix ( final String newPrefix )
    {
        final String oldPrefix = this.prefix;
        this.prefix = newPrefix;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, SummaryPackage.GENERATE_SUMMARIES__PREFIX, oldPrefix, this.prefix ) );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getSuffix ()
    {
        return this.suffix;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSuffix ( final String newSuffix )
    {
        final String oldSuffix = this.suffix;
        this.suffix = newSuffix;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, SummaryPackage.GENERATE_SUMMARIES__SUFFIX, oldSuffix, this.suffix ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Pattern getSubItemPattern ()
    {
        return this.subItemPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSubItemPattern ( final Pattern newSubItemPattern )
    {
        final Pattern oldSubItemPattern = this.subItemPattern;
        this.subItemPattern = newSubItemPattern;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN, oldSubItemPattern, this.subItemPattern ) );
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
        new SummaryGenerator ( project, configuration, this ).generateSummaryAlarms ();
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
            case SummaryPackage.GENERATE_SUMMARIES__PREFIX:
                return getPrefix ();
            case SummaryPackage.GENERATE_SUMMARIES__SUFFIX:
                return getSuffix ();
            case SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN:
                return getSubItemPattern ();
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
            case SummaryPackage.GENERATE_SUMMARIES__PREFIX:
                setPrefix ( (String)newValue );
                return;
            case SummaryPackage.GENERATE_SUMMARIES__SUFFIX:
                setSuffix ( (String)newValue );
                return;
            case SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN:
                setSubItemPattern ( (Pattern)newValue );
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
            case SummaryPackage.GENERATE_SUMMARIES__PREFIX:
                setPrefix ( PREFIX_EDEFAULT );
                return;
            case SummaryPackage.GENERATE_SUMMARIES__SUFFIX:
                setSuffix ( SUFFIX_EDEFAULT );
                return;
            case SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN:
                setSubItemPattern ( SUB_ITEM_PATTERN_EDEFAULT );
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
            case SummaryPackage.GENERATE_SUMMARIES__PREFIX:
                return PREFIX_EDEFAULT == null ? this.prefix != null : !PREFIX_EDEFAULT.equals ( this.prefix );
            case SummaryPackage.GENERATE_SUMMARIES__SUFFIX:
                return SUFFIX_EDEFAULT == null ? this.suffix != null : !SUFFIX_EDEFAULT.equals ( this.suffix );
            case SummaryPackage.GENERATE_SUMMARIES__SUB_ITEM_PATTERN:
                return SUB_ITEM_PATTERN_EDEFAULT == null ? this.subItemPattern != null : !SUB_ITEM_PATTERN_EDEFAULT.equals ( this.subItemPattern );
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
        result.append ( " (prefix: " );
        result.append ( this.prefix );
        result.append ( ", suffix: " );
        result.append ( this.suffix );
        result.append ( ", subItemPattern: " );
        result.append ( this.subItemPattern );
        result.append ( ')' );
        return result.toString ();
    }

} //GenerateSummariesImpl

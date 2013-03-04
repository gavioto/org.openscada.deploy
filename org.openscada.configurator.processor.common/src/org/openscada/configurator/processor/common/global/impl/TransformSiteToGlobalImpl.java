/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.impl;

import java.util.Collection;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;
import org.openscada.configurator.processor.common.global.AePullConfiguration;
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.ItemSelector;
import org.openscada.configurator.processor.common.global.QueryImport;
import org.openscada.configurator.processor.common.global.Site;
import org.openscada.configurator.processor.common.global.TransformSiteToGlobal;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Transform Site To Global</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getGlobalSlot <em>Global Slot</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getSites <em>Sites</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getConnectionIdFormat <em>Connection Id Format</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getHierarchyPrefix <em>Hierarchy Prefix</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getConnectionItemStateFormat <em>Connection Item State Format</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getConnectionItemStringStateFormat <em>Connection Item String State Format</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getSummaryItemPattern <em>Summary Item Pattern</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getSummaryItemFormat <em>Summary Item Format</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getAePullConfiguration <em>Ae Pull Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformSiteToGlobalImpl extends EObjectImpl implements TransformSiteToGlobal
{
    /**
     * The cached value of the '{@link #getGlobalSlot() <em>Global Slot</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getGlobalSlot()
     * @generated
     * @ordered
     */
    protected AtlantisConfigurationSlot globalSlot;

    /**
     * The cached value of the '{@link #getSites() <em>Sites</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSites()
     * @generated
     * @ordered
     */
    protected EList<Site> sites;

    /**
     * The default value of the '{@link #getConnectionIdFormat() <em>Connection Id Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionIdFormat()
     * @generated
     * @ordered
     */
    protected static final String CONNECTION_ID_FORMAT_EDEFAULT = "site.master.%s.%s";

    /**
     * The cached value of the '{@link #getConnectionIdFormat() <em>Connection Id Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionIdFormat()
     * @generated
     * @ordered
     */
    protected String connectionIdFormat = CONNECTION_ID_FORMAT_EDEFAULT;

    /**
     * The cached value of the '{@link #getHierarchyPrefix() <em>Hierarchy Prefix</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHierarchyPrefix()
     * @generated
     * @ordered
     */
    protected EList<String> hierarchyPrefix;

    /**
     * The default value of the '{@link #getConnectionItemStateFormat() <em>Connection Item State Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionItemStateFormat()
     * @generated
     * @ordered
     */
    protected static final String CONNECTION_ITEM_STATE_FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectionItemStateFormat() <em>Connection Item State Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionItemStateFormat()
     * @generated
     * @ordered
     */
    protected String connectionItemStateFormat = CONNECTION_ITEM_STATE_FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #getConnectionItemStringStateFormat() <em>Connection Item String State Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionItemStringStateFormat()
     * @generated
     * @ordered
     */
    protected static final String CONNECTION_ITEM_STRING_STATE_FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectionItemStringStateFormat() <em>Connection Item String State Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionItemStringStateFormat()
     * @generated
     * @ordered
     */
    protected String connectionItemStringStateFormat = CONNECTION_ITEM_STRING_STATE_FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #getSummaryItemPattern() <em>Summary Item Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSummaryItemPattern()
     * @generated
     * @ordered
     */
    protected static final Pattern SUMMARY_ITEM_PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSummaryItemPattern() <em>Summary Item Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSummaryItemPattern()
     * @generated
     * @ordered
     */
    protected Pattern summaryItemPattern = SUMMARY_ITEM_PATTERN_EDEFAULT;

    /**
     * The default value of the '{@link #getSummaryItemFormat() <em>Summary Item Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSummaryItemFormat()
     * @generated
     * @ordered
     */
    protected static final String SUMMARY_ITEM_FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSummaryItemFormat() <em>Summary Item Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSummaryItemFormat()
     * @generated
     * @ordered
     */
    protected String summaryItemFormat = SUMMARY_ITEM_FORMAT_EDEFAULT;

    /**
     * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelector()
     * @generated
     * @ordered
     */
    protected EList<ItemSelector> selector;

    /**
     * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQueries()
     * @generated
     * @ordered
     */
    protected EList<QueryImport> queries;

    /**
     * The cached value of the '{@link #getAePullConfiguration() <em>Ae Pull Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAePullConfiguration()
     * @generated
     * @ordered
     */
    protected AePullConfiguration aePullConfiguration;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected TransformSiteToGlobalImpl ()
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
        return GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AtlantisConfigurationSlot getGlobalSlot ()
    {
        if ( globalSlot != null && globalSlot.eIsProxy () )
        {
            InternalEObject oldGlobalSlot = (InternalEObject)globalSlot;
            globalSlot = (AtlantisConfigurationSlot)eResolveProxy ( oldGlobalSlot );
            if ( globalSlot != oldGlobalSlot )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT, oldGlobalSlot, globalSlot ) );
            }
        }
        return globalSlot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AtlantisConfigurationSlot basicGetGlobalSlot ()
    {
        return globalSlot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGlobalSlot ( AtlantisConfigurationSlot newGlobalSlot )
    {
        AtlantisConfigurationSlot oldGlobalSlot = globalSlot;
        globalSlot = newGlobalSlot;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT, oldGlobalSlot, globalSlot ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Site> getSites ()
    {
        if ( sites == null )
        {
            sites = new EObjectContainmentEList<Site> ( Site.class, this, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES );
        }
        return sites;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConnectionIdFormat ()
    {
        return connectionIdFormat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionIdFormat ( String newConnectionIdFormat )
    {
        String oldConnectionIdFormat = connectionIdFormat;
        connectionIdFormat = newConnectionIdFormat;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT, oldConnectionIdFormat, connectionIdFormat ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getHierarchyPrefix ()
    {
        if ( hierarchyPrefix == null )
        {
            hierarchyPrefix = new EDataTypeUniqueEList<String> ( String.class, this, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX );
        }
        return hierarchyPrefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConnectionItemStateFormat ()
    {
        return connectionItemStateFormat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionItemStateFormat ( String newConnectionItemStateFormat )
    {
        String oldConnectionItemStateFormat = connectionItemStateFormat;
        connectionItemStateFormat = newConnectionItemStateFormat;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT, oldConnectionItemStateFormat, connectionItemStateFormat ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConnectionItemStringStateFormat ()
    {
        return connectionItemStringStateFormat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionItemStringStateFormat ( String newConnectionItemStringStateFormat )
    {
        String oldConnectionItemStringStateFormat = connectionItemStringStateFormat;
        connectionItemStringStateFormat = newConnectionItemStringStateFormat;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT, oldConnectionItemStringStateFormat, connectionItemStringStateFormat ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pattern getSummaryItemPattern ()
    {
        return summaryItemPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSummaryItemPattern ( Pattern newSummaryItemPattern )
    {
        Pattern oldSummaryItemPattern = summaryItemPattern;
        summaryItemPattern = newSummaryItemPattern;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN, oldSummaryItemPattern, summaryItemPattern ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSummaryItemFormat ()
    {
        return summaryItemFormat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSummaryItemFormat ( String newSummaryItemFormat )
    {
        String oldSummaryItemFormat = summaryItemFormat;
        summaryItemFormat = newSummaryItemFormat;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT, oldSummaryItemFormat, summaryItemFormat ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ItemSelector> getSelector ()
    {
        if ( selector == null )
        {
            selector = new EObjectContainmentEList<ItemSelector> ( ItemSelector.class, this, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SELECTOR );
        }
        return selector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QueryImport> getQueries ()
    {
        if ( queries == null )
        {
            queries = new EObjectContainmentEList<QueryImport> ( QueryImport.class, this, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__QUERIES );
        }
        return queries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AePullConfiguration getAePullConfiguration ()
    {
        return aePullConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAePullConfiguration ( AePullConfiguration newAePullConfiguration, NotificationChain msgs )
    {
        AePullConfiguration oldAePullConfiguration = aePullConfiguration;
        aePullConfiguration = newAePullConfiguration;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION, oldAePullConfiguration, newAePullConfiguration );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAePullConfiguration ( AePullConfiguration newAePullConfiguration )
    {
        if ( newAePullConfiguration != aePullConfiguration )
        {
            NotificationChain msgs = null;
            if ( aePullConfiguration != null )
                msgs = ( (InternalEObject)aePullConfiguration ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION, null, msgs );
            if ( newAePullConfiguration != null )
                msgs = ( (InternalEObject)newAePullConfiguration ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION, null, msgs );
            msgs = basicSetAePullConfiguration ( newAePullConfiguration, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION, newAePullConfiguration, newAePullConfiguration ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Project project ) throws Exception
    {
        new org.openscada.configurator.processor.common.global.handler.TransformSiteToGlobal ( this ).process ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( InternalEObject otherEnd, int featureID, NotificationChain msgs )
    {
        switch ( featureID )
        {
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                return ( (InternalEList<?>)getSites () ).basicRemove ( otherEnd, msgs );
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SELECTOR:
                return ( (InternalEList<?>)getSelector () ).basicRemove ( otherEnd, msgs );
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__QUERIES:
                return ( (InternalEList<?>)getQueries () ).basicRemove ( otherEnd, msgs );
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION:
                return basicSetAePullConfiguration ( null, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
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
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT:
                if ( resolve )
                    return getGlobalSlot ();
                return basicGetGlobalSlot ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                return getSites ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT:
                return getConnectionIdFormat ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX:
                return getHierarchyPrefix ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT:
                return getConnectionItemStateFormat ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT:
                return getConnectionItemStringStateFormat ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN:
                return getSummaryItemPattern ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT:
                return getSummaryItemFormat ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SELECTOR:
                return getSelector ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__QUERIES:
                return getQueries ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION:
                return getAePullConfiguration ();
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
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT:
                setGlobalSlot ( (AtlantisConfigurationSlot)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                getSites ().clear ();
                getSites ().addAll ( (Collection<? extends Site>)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT:
                setConnectionIdFormat ( (String)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX:
                getHierarchyPrefix ().clear ();
                getHierarchyPrefix ().addAll ( (Collection<? extends String>)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT:
                setConnectionItemStateFormat ( (String)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT:
                setConnectionItemStringStateFormat ( (String)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN:
                setSummaryItemPattern ( (Pattern)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT:
                setSummaryItemFormat ( (String)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SELECTOR:
                getSelector ().clear ();
                getSelector ().addAll ( (Collection<? extends ItemSelector>)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__QUERIES:
                getQueries ().clear ();
                getQueries ().addAll ( (Collection<? extends QueryImport>)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION:
                setAePullConfiguration ( (AePullConfiguration)newValue );
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
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT:
                setGlobalSlot ( (AtlantisConfigurationSlot)null );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                getSites ().clear ();
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT:
                setConnectionIdFormat ( CONNECTION_ID_FORMAT_EDEFAULT );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX:
                getHierarchyPrefix ().clear ();
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT:
                setConnectionItemStateFormat ( CONNECTION_ITEM_STATE_FORMAT_EDEFAULT );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT:
                setConnectionItemStringStateFormat ( CONNECTION_ITEM_STRING_STATE_FORMAT_EDEFAULT );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN:
                setSummaryItemPattern ( SUMMARY_ITEM_PATTERN_EDEFAULT );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT:
                setSummaryItemFormat ( SUMMARY_ITEM_FORMAT_EDEFAULT );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SELECTOR:
                getSelector ().clear ();
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__QUERIES:
                getQueries ().clear ();
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION:
                setAePullConfiguration ( (AePullConfiguration)null );
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
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT:
                return globalSlot != null;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                return sites != null && !sites.isEmpty ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ID_FORMAT:
                return CONNECTION_ID_FORMAT_EDEFAULT == null ? connectionIdFormat != null : !CONNECTION_ID_FORMAT_EDEFAULT.equals ( connectionIdFormat );
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__HIERARCHY_PREFIX:
                return hierarchyPrefix != null && !hierarchyPrefix.isEmpty ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STATE_FORMAT:
                return CONNECTION_ITEM_STATE_FORMAT_EDEFAULT == null ? connectionItemStateFormat != null : !CONNECTION_ITEM_STATE_FORMAT_EDEFAULT.equals ( connectionItemStateFormat );
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__CONNECTION_ITEM_STRING_STATE_FORMAT:
                return CONNECTION_ITEM_STRING_STATE_FORMAT_EDEFAULT == null ? connectionItemStringStateFormat != null : !CONNECTION_ITEM_STRING_STATE_FORMAT_EDEFAULT.equals ( connectionItemStringStateFormat );
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_PATTERN:
                return SUMMARY_ITEM_PATTERN_EDEFAULT == null ? summaryItemPattern != null : !SUMMARY_ITEM_PATTERN_EDEFAULT.equals ( summaryItemPattern );
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SUMMARY_ITEM_FORMAT:
                return SUMMARY_ITEM_FORMAT_EDEFAULT == null ? summaryItemFormat != null : !SUMMARY_ITEM_FORMAT_EDEFAULT.equals ( summaryItemFormat );
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SELECTOR:
                return selector != null && !selector.isEmpty ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__QUERIES:
                return queries != null && !queries.isEmpty ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__AE_PULL_CONFIGURATION:
                return aePullConfiguration != null;
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
        result.append ( " (connectionIdFormat: " );
        result.append ( connectionIdFormat );
        result.append ( ", hierarchyPrefix: " );
        result.append ( hierarchyPrefix );
        result.append ( ", connectionItemStateFormat: " );
        result.append ( connectionItemStateFormat );
        result.append ( ", connectionItemStringStateFormat: " );
        result.append ( connectionItemStringStateFormat );
        result.append ( ", summaryItemPattern: " );
        result.append ( summaryItemPattern );
        result.append ( ", summaryItemFormat: " );
        result.append ( summaryItemFormat );
        result.append ( ')' );
        return result.toString ();
    }

} //TransformSiteToGlobalImpl

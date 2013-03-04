/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global;

import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Site To Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Converts a site local configuration to a global centralized data hub configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getGlobalSlot <em>Global Slot</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSites <em>Sites</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionIdFormat <em>Connection Id Format</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getHierarchyPrefix <em>Hierarchy Prefix</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionItemStateFormat <em>Connection Item State Format</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionItemStringStateFormat <em>Connection Item String State Format</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSummaryItemPattern <em>Summary Item Pattern</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSummaryItemFormat <em>Summary Item Format</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getQueries <em>Queries</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getAePullConfiguration <em>Ae Pull Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal()
 * @model
 * @generated
 */
public interface TransformSiteToGlobal extends Processor
{
    /**
     * Returns the value of the '<em><b>Global Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Slot</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Slot</em>' reference.
     * @see #setGlobalSlot(AtlantisConfigurationSlot)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_GlobalSlot()
     * @model required="true"
     * @generated
     */
    AtlantisConfigurationSlot getGlobalSlot ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getGlobalSlot <em>Global Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global Slot</em>' reference.
     * @see #getGlobalSlot()
     * @generated
     */
    void setGlobalSlot ( AtlantisConfigurationSlot value );

    /**
     * Returns the value of the '<em><b>Sites</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configurator.processor.common.global.Site}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sites</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sites</em>' containment reference list.
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_Sites()
     * @model containment="true"
     * @generated
     */
    EList<Site> getSites ();

    /**
     * Returns the value of the '<em><b>Connection Id Format</b></em>' attribute.
     * The default value is <code>"site.master.%s.%s"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Id Format</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Id Format</em>' attribute.
     * @see #setConnectionIdFormat(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_ConnectionIdFormat()
     * @model default="site.master.%s.%s" required="true"
     * @generated
     */
    String getConnectionIdFormat ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionIdFormat <em>Connection Id Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Id Format</em>' attribute.
     * @see #getConnectionIdFormat()
     * @generated
     */
    void setConnectionIdFormat ( String value );

    /**
     * Returns the value of the '<em><b>Hierarchy Prefix</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hierarchy Prefix</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hierarchy Prefix</em>' attribute list.
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_HierarchyPrefix()
     * @model
     * @generated
     */
    EList<String> getHierarchyPrefix ();

    /**
     * Returns the value of the '<em><b>Connection Item State Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Item State Format</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Item State Format</em>' attribute.
     * @see #setConnectionItemStateFormat(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_ConnectionItemStateFormat()
     * @model
     * @generated
     */
    String getConnectionItemStateFormat ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionItemStateFormat <em>Connection Item State Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Item State Format</em>' attribute.
     * @see #getConnectionItemStateFormat()
     * @generated
     */
    void setConnectionItemStateFormat ( String value );

    /**
     * Returns the value of the '<em><b>Connection Item String State Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Item String State Format</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Item String State Format</em>' attribute.
     * @see #setConnectionItemStringStateFormat(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_ConnectionItemStringStateFormat()
     * @model
     * @generated
     */
    String getConnectionItemStringStateFormat ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getConnectionItemStringStateFormat <em>Connection Item String State Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Item String State Format</em>' attribute.
     * @see #getConnectionItemStringStateFormat()
     * @generated
     */
    void setConnectionItemStringStateFormat ( String value );

    /**
     * Returns the value of the '<em><b>Summary Item Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Summary Item Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The pattern used to detect site local summary items.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Summary Item Pattern</em>' attribute.
     * @see #setSummaryItemPattern(Pattern)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_SummaryItemPattern()
     * @model dataType="org.openscada.configurator.processor.common.Pattern" required="true"
     * @generated
     */
    Pattern getSummaryItemPattern ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSummaryItemPattern <em>Summary Item Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Summary Item Pattern</em>' attribute.
     * @see #getSummaryItemPattern()
     * @generated
     */
    void setSummaryItemPattern ( Pattern value );

    /**
     * Returns the value of the '<em><b>Summary Item Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The format string which will be used to generate global summary item names. 1 = site id, 2 = site local name
     * <!-- end-model-doc -->
     * @return the value of the '<em>Summary Item Format</em>' attribute.
     * @see #setSummaryItemFormat(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_SummaryItemFormat()
     * @model required="true"
     * @generated
     */
    String getSummaryItemFormat ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSummaryItemFormat <em>Summary Item Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Summary Item Format</em>' attribute.
     * @see #getSummaryItemFormat()
     * @generated
     */
    void setSummaryItemFormat ( String value );

    /**
     * Returns the value of the '<em><b>Selector</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configurator.processor.common.global.ItemSelector}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selector</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selector</em>' containment reference list.
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_Selector()
     * @model containment="true"
     * @generated
     */
    EList<ItemSelector> getSelector ();

    /**
     * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configurator.processor.common.global.QueryImport}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Queries</em>' containment reference list.
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_Queries()
     * @model containment="true"
     * @generated
     */
    EList<QueryImport> getQueries ();

    /**
     * Returns the value of the '<em><b>Ae Pull Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ae Pull Configuration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ae Pull Configuration</em>' containment reference.
     * @see #setAePullConfiguration(AePullConfiguration)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_AePullConfiguration()
     * @model containment="true"
     * @generated
     */
    AePullConfiguration getAePullConfiguration ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getAePullConfiguration <em>Ae Pull Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ae Pull Configuration</em>' containment reference.
     * @see #getAePullConfiguration()
     * @generated
     */
    void setAePullConfiguration ( AePullConfiguration value );

} // TransformSiteToGlobal

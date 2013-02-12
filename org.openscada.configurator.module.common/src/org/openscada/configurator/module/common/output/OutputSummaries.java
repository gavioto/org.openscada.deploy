/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output;

import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.master.Module;
import org.openscada.configurator.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summaries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.output.OutputSummaries#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.output.OutputSummaries#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.module.common.output.OutputPackage#getOutputSummaries()
 * @model
 * @generated
 */
public interface OutputSummaries extends Module
{
    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #setPrefix(String)
     * @see org.openscada.configurator.module.common.output.OutputPackage#getOutputSummaries_Prefix()
     * @model required="true"
     * @generated
     */
    String getPrefix ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.output.OutputSummaries#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #getPrefix()
     * @generated
     */
    void setPrefix ( String value );

    /**
     * Returns the value of the '<em><b>Suffix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Suffix</em>' attribute.
     * @see #setSuffix(String)
     * @see org.openscada.configurator.module.common.output.OutputPackage#getOutputSummaries_Suffix()
     * @model required="true"
     * @generated
     */
    String getSuffix ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.module.common.output.OutputSummaries#getSuffix <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Suffix</em>' attribute.
     * @see #getSuffix()
     * @generated
     */
    void setSuffix ( String value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model configurationDataType="org.openscada.configuration.model.Configuration"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='configuration.outputSummaries ( getPrefix(), getSuffix() );'"
     * @generated
     */
    void process ( Configuration configuration, Project project );

} // OutputSummaries

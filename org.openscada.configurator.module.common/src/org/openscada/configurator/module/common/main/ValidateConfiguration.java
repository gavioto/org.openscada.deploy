/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.main;

import org.openscada.configuration.model.Module;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validate Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openscada.configurator.module.common.main.MainPackage#getValidateConfiguration()
 * @model
 * @generated
 */
public interface ValidateConfiguration extends Module
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model configurationDataType="org.openscada.configuration.model.Configuration"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='configuration.validate();'"
     * @generated
     */
    void process ( Configuration configuration, Project project );

} // ValidateConfiguration

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master;

import org.eclipse.emf.ecore.EObject;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openscada.configuration.model.master.MasterPackage#getModule()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Module extends EObject
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model configurationDataType="org.openscada.configuration.model.Configuration"
     * @generated
     */
    void process ( Configuration configuration, Project project );

} // Module

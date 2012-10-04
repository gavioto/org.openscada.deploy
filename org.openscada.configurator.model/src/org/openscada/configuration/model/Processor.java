/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openscada.configuration.model.ConfiguratorPackage#getProcessor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Processor extends EObject
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void process ( Project project );

} // Processor

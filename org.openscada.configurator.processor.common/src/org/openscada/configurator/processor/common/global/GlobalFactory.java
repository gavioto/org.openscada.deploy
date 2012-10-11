/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.processor.common.global.GlobalPackage
 * @generated
 */
public interface GlobalFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GlobalFactory eINSTANCE = org.openscada.configurator.processor.common.global.impl.GlobalFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Transform Site To Global</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transform Site To Global</em>'.
     * @generated
     */
    TransformSiteToGlobal createTransformSiteToGlobal ();

    /**
     * Returns a new object of class '<em>Site</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Site</em>'.
     * @generated
     */
    Site createSite ();

    /**
     * Returns a new object of class '<em>Exclude</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exclude</em>'.
     * @generated
     */
    Exclude createExclude ();

    /**
     * Returns a new object of class '<em>Include</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Include</em>'.
     * @generated
     */
    Include createInclude ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    GlobalPackage getGlobalPackage ();

} //GlobalFactory

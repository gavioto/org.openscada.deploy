/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.network.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;
import org.openscada.configurator.module.common.scripts.tests.ScriptsTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Modules</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModulesAllTests extends TestSuite
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( suite () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Test suite ()
    {
        TestSuite suite = new ModulesAllTests ( "Modules Tests" );
        suite.addTest ( NetworkTests.suite () );
        suite.addTest ( ScriptsTests.suite () );
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModulesAllTests ( String name )
    {
        super ( name );
    }

} //ModulesAllTests

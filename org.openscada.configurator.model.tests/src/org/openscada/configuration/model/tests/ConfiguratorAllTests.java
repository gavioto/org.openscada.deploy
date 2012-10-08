/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.openscada.configuration.model.hd.tests.HdTests;
import org.openscada.configuration.model.master.tests.MasterTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Configurator</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfiguratorAllTests extends TestSuite
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
        TestSuite suite = new ConfiguratorAllTests ( "Configurator Tests" );
        suite.addTest ( ConfiguratorTests.suite () );
        suite.addTest ( HdTests.suite () );
        suite.addTest ( MasterTests.suite () );
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfiguratorAllTests ( String name )
    {
        super ( name );
    }

} //ConfiguratorAllTests

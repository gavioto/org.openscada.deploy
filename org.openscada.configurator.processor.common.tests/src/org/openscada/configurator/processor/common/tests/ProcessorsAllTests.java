/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.openscada.configurator.processor.common.global.tests.GlobalTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Processors</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorsAllTests extends TestSuite
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
        TestSuite suite = new ProcessorsAllTests ( "Processors Tests" );
        suite.addTest ( CommonTests.suite () );
        suite.addTest ( GlobalTests.suite () );
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorsAllTests ( String name )
    {
        super ( name );
    }

} //ProcessorsAllTests

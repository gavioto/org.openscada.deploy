/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>output</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputTests extends TestSuite
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
        TestSuite suite = new OutputTests ( "output Tests" );
        suite.addTestSuite ( OutputAveragesTest.class );
        suite.addTestSuite ( OutputItemsTest.class );
        suite.addTestSuite ( OutputSummariesTest.class );
        suite.addTestSuite ( OutputGlobalSummariesTest.class );
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputTests ( String name )
    {
        super ( name );
    }

} //OutputTests

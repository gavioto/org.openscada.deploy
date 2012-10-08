/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>master</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterTests extends TestSuite
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
        TestSuite suite = new MasterTests ( "master Tests" );
        suite.addTestSuite ( AtlantisConfigurationSlotTest.class );
        suite.addTestSuite ( ModuleProcessorTest.class );
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MasterTests ( String name )
    {
        super ( name );
    }

} //MasterTests

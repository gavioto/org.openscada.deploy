/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.tests;

import junit.textui.TestRunner;

import org.openscada.deploy.iolist.model.BooleanMonitor;
import org.openscada.deploy.iolist.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Monitor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanMonitorTest extends MonitorTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( BooleanMonitorTest.class );
    }

    /**
     * Constructs a new Boolean Monitor test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BooleanMonitorTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Boolean Monitor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected BooleanMonitor getFixture ()
    {
        return (BooleanMonitor)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( ModelFactory.eINSTANCE.createBooleanMonitor () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //BooleanMonitorTest

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.tests;

import junit.textui.TestRunner;

import org.openscada.configurator.processor.common.global.GlobalFactory;
import org.openscada.configurator.processor.common.global.MonitorQueryImport;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Monitor Query Import</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitorQueryImportTest extends QueryImportTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( MonitorQueryImportTest.class );
    }

    /**
     * Constructs a new Monitor Query Import test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonitorQueryImportTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Monitor Query Import test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected MonitorQueryImport getFixture ()
    {
        return (MonitorQueryImport)fixture;
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
        setFixture ( GlobalFactory.eINSTANCE.createMonitorQueryImport () );
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

} //MonitorQueryImportTest

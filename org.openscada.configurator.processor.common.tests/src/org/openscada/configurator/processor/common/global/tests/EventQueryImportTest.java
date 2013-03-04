/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.tests;

import junit.textui.TestRunner;

import org.openscada.configurator.processor.common.global.EventQueryImport;
import org.openscada.configurator.processor.common.global.GlobalFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Query Import</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventQueryImportTest extends QueryImportTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( EventQueryImportTest.class );
    }

    /**
     * Constructs a new Event Query Import test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventQueryImportTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Event Query Import test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EventQueryImport getFixture ()
    {
        return (EventQueryImport)fixture;
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
        setFixture ( GlobalFactory.eINSTANCE.createEventQueryImport () );
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

} //EventQueryImportTest

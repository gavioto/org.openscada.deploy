/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.configurator.processor.common.global.AePullConfiguration;
import org.openscada.configurator.processor.common.global.GlobalFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ae Pull Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AePullConfigurationTest extends TestCase
{

    /**
     * The fixture for this Ae Pull Configuration test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AePullConfiguration fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( AePullConfigurationTest.class );
    }

    /**
     * Constructs a new Ae Pull Configuration test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AePullConfigurationTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Ae Pull Configuration test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( AePullConfiguration fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Ae Pull Configuration test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AePullConfiguration getFixture ()
    {
        return fixture;
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
        setFixture ( GlobalFactory.eINSTANCE.createAePullConfiguration () );
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

} //AePullConfigurationTest

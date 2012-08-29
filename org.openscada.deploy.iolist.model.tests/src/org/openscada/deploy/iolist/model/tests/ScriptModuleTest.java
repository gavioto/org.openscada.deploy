/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ScriptModule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Script Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptModuleTest extends TestCase
{

    /**
     * The fixture for this Script Module test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScriptModule fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ScriptModuleTest.class );
    }

    /**
     * Constructs a new Script Module test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptModuleTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Script Module test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( ScriptModule fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Script Module test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScriptModule getFixture ()
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
        setFixture ( ModelFactory.eINSTANCE.createScriptModule () );
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

} //ScriptModuleTest

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.tests;

import junit.textui.TestRunner;

import org.openscada.configurator.module.common.processing.ProcessingFactory;
import org.openscada.configurator.module.common.processing.ScriptOverrides;
import org.openscada.configurator.module.common.tests.FileModuleTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Script Overrides</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptOverridesTest extends FileModuleTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ScriptOverridesTest.class );
    }

    /**
     * Constructs a new Script Overrides test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptOverridesTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Script Overrides test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ScriptOverrides getFixture ()
    {
        return (ScriptOverrides)fixture;
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
        setFixture ( ProcessingFactory.eINSTANCE.createScriptOverrides () );
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

} //ScriptOverridesTest

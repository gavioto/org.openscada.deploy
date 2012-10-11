/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.tests;

import junit.textui.TestRunner;

import org.openscada.configurator.processor.common.global.Exclude;
import org.openscada.configurator.processor.common.global.GlobalFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exclude</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcludeTest extends ItemSelectorTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ExcludeTest.class );
    }

    /**
     * Constructs a new Exclude test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcludeTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Exclude test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Exclude getFixture ()
    {
        return (Exclude)fixture;
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
        setFixture ( GlobalFactory.eINSTANCE.createExclude () );
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

} //ExcludeTest

/**
 */
package org.openscada.configuration.model.tests;

import junit.textui.TestRunner;

import org.openscada.configuration.model.ConfiguratorFactory;
import org.openscada.configuration.model.DefaultGenericMasterConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Default Generic Master Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultGenericMasterConfigurationTest extends GenericMasterConfigurationSlotTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( DefaultGenericMasterConfigurationTest.class );
    }

    /**
     * Constructs a new Default Generic Master Configuration test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultGenericMasterConfigurationTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Default Generic Master Configuration test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected DefaultGenericMasterConfiguration getFixture ()
    {
        return (DefaultGenericMasterConfiguration)fixture;
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
        setFixture ( ConfiguratorFactory.eINSTANCE.createDefaultGenericMasterConfiguration () );
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

} //DefaultGenericMasterConfigurationTest

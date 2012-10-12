/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.tests;

import junit.textui.TestRunner;

import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ScriptItem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Script Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.ScriptItem#addInput(java.lang.String, java.lang.String, org.openscada.deploy.iolist.model.DataType) <em>Add Input</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ScriptItemTest extends ItemTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ScriptItemTest.class );
    }

    /**
     * Constructs a new Script Item test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptItemTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Script Item test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ScriptItem getFixture ()
    {
        return (ScriptItem)fixture;
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
        setFixture ( ModelFactory.eINSTANCE.createScriptItem () );
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

    /**
     * Tests the '{@link org.openscada.deploy.iolist.model.ScriptItem#addInput(java.lang.String, java.lang.String, org.openscada.deploy.iolist.model.DataType) <em>Add Input</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.deploy.iolist.model.ScriptItem#addInput(java.lang.String, java.lang.String, org.openscada.deploy.iolist.model.DataType)
     * @generated
     */
    public void testAddInput__String_String_DataType ()
    {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail ();
    }

} //ScriptItemTest

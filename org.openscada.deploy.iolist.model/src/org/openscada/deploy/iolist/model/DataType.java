/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openscada.deploy.iolist.model.ModelPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator
{
    /**
     * The '<em><b>Variant</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VARIANT_VALUE
     * @generated
     * @ordered
     */
    VARIANT ( 0, "Variant", "VARIANT" ),

    /**
     * The '<em><b>Float</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLOAT_VALUE
     * @generated
     * @ordered
     */
    FLOAT ( 1, "Float", "FLOAT" ),

    /**
     * The '<em><b>String</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRING_VALUE
     * @generated
     * @ordered
     */
    STRING ( 2, "String", "STRING" ),

    /**
     * The '<em><b>Boolean</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOOLEAN_VALUE
     * @generated
     * @ordered
     */
    BOOLEAN ( 3, "Boolean", "BOOL" ),

    /**
     * The '<em><b>Integer</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTEGER_VALUE
     * @generated
     * @ordered
     */
    INTEGER ( 4, "Integer", "INT32" ),

    /**
     * The '<em><b>Long Integer</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LONG_INTEGER_VALUE
     * @generated
     * @ordered
     */
    LONG_INTEGER ( 5, "LongInteger", "INT64" );

    /**
     * The '<em><b>Variant</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Variant</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VARIANT
     * @model name="Variant" literal="VARIANT"
     * @generated
     * @ordered
     */
    public static final int VARIANT_VALUE = 0;

    /**
     * The '<em><b>Float</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FLOAT
     * @model name="Float" literal="FLOAT"
     * @generated
     * @ordered
     */
    public static final int FLOAT_VALUE = 1;

    /**
     * The '<em><b>String</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STRING
     * @model name="String" literal="STRING"
     * @generated
     * @ordered
     */
    public static final int STRING_VALUE = 2;

    /**
     * The '<em><b>Boolean</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BOOLEAN
     * @model name="Boolean" literal="BOOL"
     * @generated
     * @ordered
     */
    public static final int BOOLEAN_VALUE = 3;

    /**
     * The '<em><b>Integer</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTEGER
     * @model name="Integer" literal="INT32"
     * @generated
     * @ordered
     */
    public static final int INTEGER_VALUE = 4;

    /**
     * The '<em><b>Long Integer</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Long Integer</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LONG_INTEGER
     * @model name="LongInteger" literal="INT64"
     * @generated
     * @ordered
     */
    public static final int LONG_INTEGER_VALUE = 5;

    /**
     * An array of all the '<em><b>Data Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DataType[] VALUES_ARRAY = new DataType[] { VARIANT, FLOAT, STRING, BOOLEAN, INTEGER, LONG_INTEGER, };

    /**
     * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DataType> VALUES = Collections.unmodifiableList ( Arrays.asList ( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DataType get ( String literal )
    {
        for ( int i = 0; i < VALUES_ARRAY.length; ++i )
        {
            DataType result = VALUES_ARRAY[i];
            if ( result.toString ().equals ( literal ) )
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DataType getByName ( String name )
    {
        for ( int i = 0; i < VALUES_ARRAY.length; ++i )
        {
            DataType result = VALUES_ARRAY[i];
            if ( result.getName ().equals ( name ) )
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DataType get ( int value )
    {
        switch ( value )
        {
        case VARIANT_VALUE:
            return VARIANT;
        case FLOAT_VALUE:
            return FLOAT;
        case STRING_VALUE:
            return STRING;
        case BOOLEAN_VALUE:
            return BOOLEAN;
        case INTEGER_VALUE:
            return INTEGER;
        case LONG_INTEGER_VALUE:
            return LONG_INTEGER;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private DataType ( int value, String name, String literal )
    {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue ()
    {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName ()
    {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral ()
    {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString ()
    {
        return literal;
    }

} //DataType

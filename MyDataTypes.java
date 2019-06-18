package com.june13_2019.ds;

public class MyDataTypes{

    public void PrimitivDataType() {


        /************************************************************
         * Data Type	Default Value	Default size
         * boolean	    false	        1 bit
         * char	        '\u0000'	    2 byte
         * byte	        0	            1 byte
         * short	    0	            2 byte
         * int	        0	            4 byte
         * long	        0L	            8 byte
         * float	    0.0f	        4 byte
         * double	    0.0d	        8 byte
         *****************************************************/

        byte myNum=100;
        System.out.println( myNum );
        short myNum1=5000;
        System.out.println( myNum1 );
        int myNum2=100000;
        System.out.println( myNum2 );
        long myNum3=150_000_000_00L;
        System.out.println( myNum3 );
        float myNum4=5.75f;
        System.out.println( myNum4 );
        double myNum5=19.99d;
        System.out.println( myNum5 );
        float f1=35e3f;
        double d1=12E4d;
        System.out.println( f1 );
        System.out.println( d1 );
        boolean isJavaFun=true;
        boolean isFishTasty=false;
        System.out.println( isJavaFun );     // Outputs true
        System.out.println( isFishTasty );   // Outputs false
        char myGrade='B';
        System.out.println( myGrade );
        char a=65, b=66, c=67;
        System.out.println( a );
        System.out.println( b );
        System.out.println( c );

    }

    public void NonPrimitiveDataType() {

        /***************************************
         * Non-primitive data types are called reference types because they refer to objects.
         *
         * The main difference between primitive and non-primitive data types are:
         *
         * Primitive types are predefined (already defined) in Java. Non-primitive types are
         * created by the programmer and is not defined by Java (except for String).
         * Non-primitive types can be used to call methods to perform certain operations,
         * while primitive types cannot.
         * A primitive type has always a value, while non-primitive types can be null.
         * The size of a primitive type depends on the data type, while non-primitive types have all the same size.
         * Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.
         ****************************************/


        // String Types

        String txt="ABCDEFGHijklmNOPQRSTUVWXYZ";
        System.out.println( "The length of the txt string is: " + txt.length() );
        System.out.println( txt.toUpperCase() );   // Outputs
        System.out.println( txt.toLowerCase() );   // Outputs
        System.out.println( txt.indexOf( "ijkl" ) ); // Outputs


    }
}

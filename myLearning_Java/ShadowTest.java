/**
 *
 */
package com.june13_2019.ds.myLearning_Java;

/**
 * @author Narayan
 *  Inner Class definition
 */
public class ShadowTest{

    public int x=0;

    class FirstLevel{

        public int x=1;

        void methodInFirstLevel(int x) {
            System.out.println( "x = " + x );
            System.out.println( "this.x = " + this.x );
            System.out.println( "ShadowTest.this.x = " + ShadowTest.this.x );
        }
    }
}


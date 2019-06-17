package com.june13_2019.ds;

public class DynamicProgramming{

    public final static int LENGTH=10;
    /**********************************
     * Dynamic programming amounts to breaking down an optimization problem into
     * simpler sub-problems, and storing the solution to each sub-problem so that
     * each sub-problem is only solved once.
     *
     * Sub-problems are smaller versions of the original problem. In fact,
     * sub-problems often look like a reworded version of the original problem.
     * If formulated correctly, sub-problems build on each other in order to obtain
     * the solution to the original problem.
     *
     * dynamicFibonacci (n)
     *  1 if (n < 2)
     *  2 then return n
     *  3 if (F[n] is undefined)
     *  4 then F[n] = dynamicFibonacci (n - 1) + dynamicFibonacci (n - 2)
     *  5 return F[n]
     *
     *********************************/

    public static int dynamicCounter=0;
    public static int recursiveCounter=0;
    public static int[] memoized=new int[LENGTH + 1];

    public static int recursiveFibonacci(int n) {
        recursiveCounter++;
        if (n <= 1) return 1;
        return recursiveFibonacci( n - 1 ) + recursiveFibonacci( n - 2 );
    }

    public int dynamicFibonacci(int n) {
        dynamicCounter++;
        if (memoized[n] != 0) return memoized[n];
        int tmp=0;
        tmp=(n <= 1) ? 1 : dynamicFibonacci( n - 1 ) + dynamicFibonacci( n - 2 );
        memoized[n]=tmp;
        return tmp;

    }
}

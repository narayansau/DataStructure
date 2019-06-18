package com.june13_2019.ds;

/*************************
 * Recursion in computer science is a method of solving a problem where the solution
 * depends on solutions to smaller instances of the same problem (as opposed to iteration).
 * The approach can be applied to many types of problems, and recursion is one of the central
 * ideas of computer scienc
 */

public class Recursion{

    public long Factorial(long n) {
        return n == 0 ? 1 : n * Factorial( n - 1 );
    }

    public int Sum(int n) {
        return n == 1 ? 1 : (n + Sum( n - 1 ));
    }
}

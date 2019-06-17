package com.june13_2019.ds;

public class DivideAndConquer{

    /**************************************
     * Divide and Conquer is an algorithmic paradigm. A typical Divide and Conquer algorithm Divide
     * and Conquer is an algorithmic paradigm. A typical Divide and Conquer algorithm solves a
     * problem using following three steps.
     *
     * Divide: Break the given problem into subproblems of same type.
     * Conquer: Recursively solve these subproblems
     * Combine: Appropriately combine the answerssolves a problem using following three steps.
     *
     * Divide: Break the given problem into subproblems of same type.
     * Conquer: Recursively solve these subproblems
     * Combine: Appropriately combine the answers
     *
     *
     *
     *
     *****************************************************/

    public void FinfNuberByDivideAndConquor() {
        int arr[]={2, 3, 4, 10, 40};
        int n=arr.length;
        int x=10;
        int result=binarySearch( arr, x );
        if (result == -1)
            System.out.println( "Element not present" );
        else
            System.out.println( "Element found at "
                    + "index " + result );
    }

    // Returns index of x if it is present in arr[],
    // else return -1
    private int binarySearch(int arr[], int x) {
        int l=0, r=arr.length - 1;
        while (l <= r) {
            int m=l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l=m + 1;

                // If x is smaller, ignore right half
            else
                r=m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    public int DecreasAndConquor(int n) {

        /********************************
         * Plutarch says that Sertorius, in order to teach his soldiers that perseverance and wit
         * are better than brute force, had two horses brought before them, and set two men to pull
         * out their tails. One of the men was a burly Hercules, who tugged and tugged, but all to no
         * purpose; the other was a sharp, weasel-faced tailor, who plucked one hair at a time, amidst
         * roars of laughter, and soon left the tail quite bare.
         *
         * Decrease or reduce problem instance to smaller instance of the same problem and extend solution.
         * Conquer the problem by solving smaller instance of the problem.
         * Extend solution of smaller instance to obtain solution to original problem .
         * Basic idea of the decrease-and-conquer technique is based on exploiting the relationship between
         * a solution to a given instance of a problem and a solution to its smaller instance.
         * This approach is also known as incremental or inductive approach.
         *
         * problem : Sumf of first 10 number
         * Solution :
         *            10 + sum of first 9 number ;
         *            = 10 + 9 + sum of first 8 number
         *            ....
         *            ....
         *            ...
         *            =  10 + 9 + 8 + ....+ sum of fisrt number
         *            now sum of first number = 1;
         *
         */

        return (n == 1 ? 1 : (n + DecreasAndConquor( n - 1 )));
    }


}

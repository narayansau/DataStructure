/********************************************************
 * A greedy algorithm is an algorithmic paradigm that follows the problem solving heuristic
 * of making the locally optimal choice at each stage with the hope of finding a global optimum.
 *
 * In general, greedy algorithms have five components:
 *
 * A candidate set, from which a solution is created
 * A selection function, which chooses the best candidate to be added to the solution
 * A feasibility function, that is used to determine if a candidate can be used to contribute to a solution
 * An objective function, which assigns a value to a solution, or a partial solution, and
 * A solution function, which will indicate when we have discovered a complete solution
 *
 *
 *  Advantages and Disadvantages of Greedy Algorithm
 * Finding solution is quite easy with a greedy algorithm for a problem.
 * Analyzing the run time for greedy algorithms will generally be much easier
 * than for other techniques (like Divide and conquer).
 * The difficult part is that for greedy algorithms you have to work much harder to
 * understand correctness issues. Even with the correct algorithm, it is hard to prove
 * why it is correct. Proving that a greedy algorithm is correct is more of an art than a science.
 *
 * Examples
 * 4.1 Counting Coins
 * This problem is to count to a desired value by choosing the least possible
 * coins and the greedy approach forces the algorithm to pick the largest possible coin.
 * If we are provided coins of ₹1, ₹5, ₹10 and ₹20 (Yes, We've ₹20 coins :D) and we are asked to
 * count ₹36 then the greedy procedure will be −
 *
 * Select one ₹20 coin, the remaining count is 16
 * Then select one ₹10 coin, the remaining count is 6
 * Then select one ₹5 coin, the remaining count is 1
 * And finally, the selection of one ₹ 1 coins solves the problem
 */


package com.june13_2019.ds;

public class GreedyAlogorithm{

    int[][] coins={
            {20, 10},    //10 coin each with denomination  20
            {10, 10},                                 // 10
            {5, 10},                                   // 5
            {2, 10},                                    // 2
            {1, 10}                                  // 1

    };

    // count rs 36 with least no. of coins

    public void CountCoin() {
        int toCount, needToCountCoin = 72;
        int index=0;
        int remainder=0;
        int coinDenomination=0;
        boolean noMoreIterationNeeded=false;

        int[][] totalCount=new int[5][2];

        totalCount[0][0]=20;   //. Denomination 20
        totalCount[1][0]=10;    //. Denomination 10
        totalCount[2][0]=5;     //. Denomination 5
        totalCount[3][0]=2;     //. Denomination 2
        totalCount[4][0]=1;     //. Denomination 1
        toCount = needToCountCoin ;

        // Greedy algorithm trying to find the naximun with assumption sufficiemt coins are available
        System.out.println( "Total Money Need to count = " + toCount );

        do {

            coinDenomination=toCount / coins[index][0];

            toCount -= coinDenomination * coins[index][0];

            if (coinDenomination != 0)
                totalCount[index][1]=coinDenomination;

            if (toCount == 0)
                noMoreIterationNeeded=true;
            else
                index++;

            System.out.println( "After " + index  + "  iteration  money left " + toCount );


        }
        while ( ! noMoreIterationNeeded);

        System.out.printf( ". \n To count rs. %d  we need \n", needToCountCoin );
        for ( int i = 0 ; i< 5 ; i++ ) {
            if ( totalCount[i][1] !=0) {
                System.out.printf( ":  %d Notes of  Rs.  %d   Denomination  \n" , totalCount[i][1], totalCount[i][0]  );
            }

        }


    }
}

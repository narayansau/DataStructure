package com.june13_2019.ds;

import java.util.Arrays;

public class BruteForce{

    int[] a;

    @Override
    public String toString() {
        return "DesignTachnique{" +
                "a=" + Arrays.toString( a ) +
                '}';
    }

    public void  BruteForce() {

        /***********************
         * A brute force algorithm is basically a non-optimal way of performing a task.
         * You will perform the task, but generally your running time or space requirements
         * won't be as good as it could be.
         *
         * Suppose that you have a problem statement that is something like “where did I leave my keys in the house?”.
         * Imagine you do not remember at all where you left them. Imagine also that you don’t have a quick list of
         * possible, typical places where you left your keys, or that you checked those already.
         * In this scenario, there is no easy way to sub-divide the house into likely and unlikely places,
         * and there is no good way to quickly and shallowly check a room. So, you end up going through each room,
         * into each possible location that could contain your keys, on the bed, under the bed, in the fridge,
         * in the freezer, in the oven, in the microwave, in the couch, under the couch, etc.
         * This is effectively running a brute force algorithm over the possible locations where your keys could be.
         * We think of it theoretically as the “space of all possible solutions”, but limited in this case to
         * “spaces within the house.” If you were modeling this with code and data structures, you could describe
         * your house as a graph, where the pathways between rooms were edges, the rooms were interior nodes,
         * and the locations themselves were leaf nodes. In that example, a brute force algorithm would traverse
         * the entire graph, checking each node until it found them, like doing a depth first search or bread first
         * search on a tree. Systematic search techniques are mostly brute force algorithms, unless there’s
         * some way to discard possibilities.
         *  Let us try with an example of liner search.
         */

        a = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30};



        // Our task is tofind out 30.
        int findTragetNumber = 30;

        //Brute force solution
        if ( bruteForceSearch(a, findTragetNumber) )
            System.out.println(  " The number : " + findTragetNumber + " is present in the array : " +
                    toString());
        else
            System.out.println(  " The number : " + findTragetNumber + " is not foind  in the array : " +
                    toString());



    }

    private boolean bruteForceSearch(int[] a, int findTragetNumber) {
        boolean found = false;
        for ( int i = 0 ; i< a.length; i++) {
            found =   a[i] == findTragetNumber ? true : false ;
            if ( found ) return  found;

        }
        return found;
    }


}

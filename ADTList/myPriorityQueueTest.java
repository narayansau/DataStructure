/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public class myPriorityQueueTest{

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println( "Priority Queue Test\n" );

        System.out.println( "Enter size of priority queue " );

        PriorityQueueWithTask pq=new PriorityQueueWithTask( 30 );


        for (int i=1; i < 9; i++) {
            String s="My Job no:" + i;
            pq.insert( s, i * i );
        }

        pq.remove();
    }

}

/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public class arrayQueueImpl{

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        arrayQueue <Integer> myQueue=new arrayQueue <Integer>();


        Integer[] listQueue={0, 1, 1, 1, 1, 1, 1, 1, 1, 1};


        System.out.println( "Queue is started \n" );

        myQueue.arrayQueuefill( listQueue );

        myQueue.display();

        for (int i=1; i < 8; i++) myQueue.enqueue( i * i );
        myQueue.display();
        myQueue.dequeue();
        myQueue.display();
        myQueue.clear();

        myQueue.display();

    }

}

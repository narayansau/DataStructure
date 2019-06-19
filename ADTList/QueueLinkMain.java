/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */

public class QueueLinkMain<E>{

    public static void main(String[] args) {


        LQueue <Integer> myQueue=new LQueue <Integer>();

        myQueue.display();
        myQueue.enqueue( 5 );
        myQueue.display();


        for (int i=1; i < 10; i++)
            myQueue.enqueue( i * i );

        myQueue.display();
        myQueue.dequeue();
        myQueue.dequeue();

        //myQueue.pop();
        myQueue.display();

    }
}
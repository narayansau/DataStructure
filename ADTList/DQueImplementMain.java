/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public class DQueImplementMain{

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DQueuImplement <Integer> myDQue=new DQueuImplement <Integer>();


        myDQue.display();

        myDQue.addLast( 500 );
        myDQue.addFirst( 5 );
        myDQue.display();
        myDQue.addFirst( 10 );
        myDQue.addLast( 50 );
        myDQue.display();
        myDQue.getFirst();
        myDQue.getLast();
        myDQue.removeFirst();
        myDQue.removeLast();
        myDQue.display();

    }

}

package com.june13_2019.ds;

public class ArrayQueue<E> implements Queue <E>{

    private static final int MAXSIZE=10; // Maximum size of list
    private E[] listQueue; // Array holding list elements
    private int front, rear, size; // Number of list items now


    //Construcor
    public ArrayQueue() {
        front=size=0;
        rear=-1;
//for ( int i = 0 ; i< MAXSIZE ; i++) listQueue[i] = null;
    }

    @Override
    public E peek() {
        return front();
    }

    public void ArrayQueuefill(E[] listArray) {
        this.listQueue=listArray;
    }


    /*******************************************************
     * Returns the number of elements in the queue
     * @return int
     * @author Naraya Sau
     *******************************************************/
    @Override
    public int size() {
        return size;
    }

    /**********************************
     * Check whether the queue is empty
     * @return boolean
     ******************************************/
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**********************************
     * Check whether the queue is Full
     * @return boolean
     ******************************************/
    @Override
    public boolean isFull() {
        return rear == MAXSIZE;
    }

    /**************************
     * Inserts an element at the rear of the queue.
     * @param  e
     * @return
     * @author Narayan Sau
     ****************************************/
    @Override
    public void enqueue(E e) {
        if (size == MAXSIZE) return;
        listQueue[++rear]=e;
        size++;
    }

    /**
     * Returns, but does not remove, the first element of the queue (null if empty).
     *
     * @Exception EmptyQueueException
     */
    @Override
    public E first() {
        return front();
    }

    @Override
    public E front() {


        return (listQueue[front]);
    }

    /**
     * Removes and returns the first element of the queue (null if empty).
     */
    @Override
    public E dequeue() {
        if (front > rear) return null;
        size--;
        return (listQueue[front++]);
    }

    /**********************************************************
     *
     * @author Narayan Sau
     * @return null
     * Reinitialize the stack. The user is responsible for
     *      reclaiming the storage used by the stack elements.
     *
     **********************************************************/
    @Override
    public void clear() {
        front=size=0;
        rear=-1;
        for (int i=0; i < MAXSIZE; i++) listQueue[i]=null;
        return;
    }

    public void display() {
        String t;
        if (isEmpty()) t=" Queue is Empty";
        else t="Queue has data";
        String s="\n[ " + t + " ] Queue size :" + size + " Queue values [ ";
        for (int i=front; i <= size; i++) {
            s+=listQueue[i];
            s+=" ,";
        }
        ;
        s+="]\n";
        System.out.print( s );
    }
}

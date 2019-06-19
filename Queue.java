package com.june13_2019.ds;

public interface Queue<E>{


    /*******************************************************
     * Returns the number of elements in the queue
     * @param
     * @return int
     * @author Naraya Sau
     *******************************************************/

    public int size();

    /**********************************
     * Check whether the queue is empty
     * @param
     * @return boolean
     ******************************************/

    public boolean isEmpty();


    /**********************************
     * Check whether the queue is Full
     * @param
     * @return boolean
     ******************************************/

    boolean isFull();

    /**************************
     * Inserts an element at the rear of the queue.
     * @param  e
     * @return
     * @author Narayan Sau
     ****************************************/

    void enqueue(E e);

    /**
     * Returns, but does not remove, the first element of the queue (null if empty).
     *
     * @Exception EmptyQueueException
     */

    E first();

    E front();

    public E peek();

    /**
     * Removes and returns the first element of the queue (null if empty).
     */
    E dequeue();


    /**********************************************************
     *
     * @param
     * @author Narayan Sau
     * @return null
     * Reinitialize the stack. The user is responsible for
     *      reclaiming the storage used by the stack elements.
     *
     **********************************************************/

    public void clear();


}

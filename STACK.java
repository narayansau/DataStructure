package com.june13_2019.ds;

import java.util.EmptyStackException;

public interface STACK<E>{

    /**********************************************************
     * @param
     * @author Narayan Sau
     * @return null
     * Reinitialize the stack. The user is responsible for
     *      reclaiming the storage used by the stack elements.
     *
     **********************************************************/


    public void clear();

    /**********************************************************
     * @param  it
     * @author Narayan Sau
     * @return null
     * Push an element onto the top of the stack.
     *      @param it The element being pushed onto the stack.
     **********************************************************/


    public void push(E it);


    /**********************************************************
     * @param
     * @author Narayan Sau
     * @return E
     * Remove and return the element at the top of the stack.
     *      @return The element at the top of the stack.
     **********************************************************/


    public E pop() throws EmptyStackException;


    // Return TOP element

    public E top();

    /**
     * @return A copy of the top element.
     */

    public E topValue();

    /**
     * @return The number of elements in the stack.
     */

    public int size();

    // Check if the stack is empty

    public boolean isEmpty();
}

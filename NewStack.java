package com.june13_2019.ds;

import java.util.EmptyStackException;

public interface NewStack<E> extends STACK <E>{
    /**********************************************************
     * @param
     * @author Narayan Sau
     * @return NewStack
     * Reinitialize the stack. The user is responsible for
     *      reclaiming the storage used by the stack elements.
     *
     **********************************************************/


    public NewStack <E> newpush(E it);


    /**********************************************************
     * @param
     * @author Narayan Sau
     * @return E
     * Remove and return the element at the top of the stack.
     *      @return The element at the top of the stack.
     **********************************************************/


    public NewStack <E> newpop() throws EmptyStackException;


    // Return TOP element

    public NewStack <E> newtop();

    /**
     * @return A copy of the top element.
     */

    public NewStack <E> newtopValue();


}

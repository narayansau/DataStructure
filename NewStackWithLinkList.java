package com.june13_2019.ds;

import java.util.EmptyStackException;

public class NewStackWithLinkList<E> implements NewStack <E>{
    private static int size=0;
    private Node <E> top;

    public NewStackWithLinkList() {
        super();

    }

    @Override
    public int incSize() {
        return 0;
    }

    @Override
    public int decrSize() {
        return 0;
    }

    /**********************************************************
     *
     * @param it@author Narayan Sau
     * @return NewStack
     * Reinitialize the stack. The user is responsible for
     *      reclaiming the storage used by the stack elements.
     *
     **********************************************************/
    @Override
    public NewStackWithLinkList <E> newpush(E it) {
        push( it );
        return this;
    }

    /**********************************************************
     * @param  it
     * @author Narayan Sau
     * @return null
     * Push an element onto the top of the stack.
     **********************************************************/
    @Override
    public void push(E it) {

        // create a new node
        Node <E> newnode=new Node <E>( it, top );
        // pointtop to new node
        top=newnode;
        size++;

    }

    /**********************************************************
     * @author Narayan Sau
     * @return E
     * Remove and return the element at the top of the stack.
     *      @return The element at the top of the stack.
     **********************************************************/
    @Override
    public E pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        E temp=top.getElement();
        System.out.println( "top Value : " + temp + " is getting poped" );
        top=top.getNext();
        size--;
        return temp;
    }

    @Override
    public E top() {
        if (isEmpty()) throw new EmptyStackException();
        System.out.println( "Top of the stack is : " + size() + " And Value : " + top.getElement() );
        return top.getElement();
    }

    /**
     * @return A copy of the top element.
     */
    @Override
    public E topValue() {
        return top();
    }

    /*********************************************************
     * @author Narayan Sau
     * @return E
     * Remove and return the element at the top of the stack.
     *      @return The element at the top of the stack.
     **********************************************************/
    @Override
    public NewStackWithLinkList <E> newpop() throws EmptyStackException {
        E temp=pop();
        return this;
    }

    @Override
    public NewStackWithLinkList <E> newtop() {
        E temp=top();
        return this;
    }

    /**
     * @return A copy of the top element.
     */
    @Override
    public NewStackWithLinkList <E> newtopValue() {
        return newtop();
    }

    /**********************************************************
     * @author Narayan Sau
     * @return null
     * Reinitialize the stack. The user is responsible for
     *      reclaiming the storage used by the stack elements.
     *
     **********************************************************/
    @Override
    public void clear() {
        top=null;
    }

    /**
     * @return The number of elements in the stack.
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (top == null);
    }


    public NewStackWithLinkList display() {
        String t;
        if (isEmpty()) t=" Stack is Empty";
        else t="Stack has data";
        String s="\n[ " + t + " ] Stack size :" + size() + " Stack values [ ";
        Node <E> tempNode=top;
        while (tempNode != null) {
            s+=tempNode.getElement();

            tempNode=tempNode.getNext();

            s+=(tempNode == null ? " " : " , ");

        }


        s+="]\n";
        System.out.print( s );
        return this;
    }
}

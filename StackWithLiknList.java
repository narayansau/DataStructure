package com.june13_2019.ds;

import java.util.EmptyStackException;

public class StackWithLiknList<E> implements STACK <E>{

    private static int size=0;
    private Node <E> top;

    // Constructor an EMpty Stack...

    public StackWithLiknList() {
        this.top=null;
        this.size=0;
    }

    /**
     * *******************************************************
     *
     * @return null
     * Reinitialize the stack. The user is responsible for
     * reclaiming the storage used by the stack elements.
     * @author Narayan Sau
     **********************************************************/
    @Override
    public void clear() {

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


    public void display() {
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
    }
}

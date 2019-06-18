package com.june13_2019.ds;

public class arrayStack<E> implements STACK <E>{

    private static final int MAXSIZE=10; // Maximum size of list
    private E[] listStack; // Array holding list elements
    private int top; // Number of list items now


    public arrayStack() {
        top=-1;
    }

    public void arrayStackfill(E[] listArray) {
        this.listStack=listArray;
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
        top=-1;

    }

    /**********************************************************
     * @param  it
     * @author Narayan Sau
     * @return null
     * Push an element onto the top of the stack.
     **********************************************************/
    @Override
    public void push(E it) {

        if (top == (MAXSIZE - 1))
            System.out.println( "Stack is full \n" );
        else
            listStack[++top]=it;

    }

    /**********************************************************
     * @author Narayan Sau
     * @return E
     * Remove and return the element at the top of the stack.
     *      @return The element at the top of the stack.
     **********************************************************/
    @Override
    public E pop() {


        if (top == -1) return null;
        System.out.println( "top Value : " + listStack[top] + " is getting poped" );
        return (listStack[top--]);

    }

    @Override
    public E top() {

        if (top == -1)
            return null;
        System.out.println( "Top of the stack is : " + size() + " And Value : " + listStack[top] );
        return (listStack[top]);
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
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }


    public void display() {
        String t;
        if (isEmpty()) t=" Stack is Empty";
        else t="Stack has data";
        String s="\n[ " + t + " ] Stack size :" + size() + " Stack values [ ";
        for (int i=top; i >= 0; i--) {


            s+=listStack[i];
            s+=(i == 0 ? " " : " , ");
        }
        
        s+="]\n";
        System.out.print( s );
    }
}

package com.june13_2019.ds.ADTList;

public class arrayStack<E> implements Stack <E>{

    private static final int MAXSIZE=10; // Maximum size of list
    private E[] listStack; // Array holding list elements
    private int top; // Number of list items now


    public arrayStack() {

        top=0;

    }

    public void arrayStackfill(E[] listArray) {

        this.listStack=listArray;
    }


    @Override
    public void clear() {
        // TODO Auto-generated method stub
        top=0;

    }

    @Override
    public void push(E it) {
        // TODO Auto-generated method stub
        if (top == MAXSIZE) System.out.println( "Stack is full \n" );


        listStack[top++]=it;


    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        if (top == 0) return null;
        System.out.println( "top Value  : " + listStack[top - 1] + " is getting poped" );
        return (listStack[top--]);
    }

    @Override
    public E top() {
        // TODO Auto-generated method stub
        if (top == 0)
            return null;
        System.out.println( "Top of the stack is : " + size() + " And Value : " + listStack[top - 1] );
        return (listStack[top - 1]);

    }

    @Override
    public E topValue() {
        // TODO Auto-generated method stub
        return top();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return top;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (top == 0);
    }

    public void display() {

        String t;

        if (isEmpty()) t=" Stack is Empty";
        else t="Stack has data";

        String s="\n[ " + t + " ] Stack size :" + size() + " Stack values [ ";

        for (int i=top - 1; i >= 0; i--) {
            s+=listStack[i];
            s+=" ,";

        }
        ;
        s+="]\n";
        System.out.print( s );
    }

}

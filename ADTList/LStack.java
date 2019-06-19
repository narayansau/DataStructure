package com.june13_2019.ds.ADTList;


class LStack<E> implements Stack <E>{

//class LStack<E> implements Stack<E> {

    private Link <E> top; // Pointer to first element
    private int size; // Number of elements

    //Constructors
    public LStack() {
        top=null;
        size=0;
    }

    public LStack(int size) {
        top=null;
        size=0;
    }

    // Reinitialize stack
    public void clear() {
        top=null;
        size=0;
    }

    public void push(E it) { // Put "it" on stack
        top=new Link <E>( it, top );
        size++;
    }

    public E pop() { // Remove "it" from stack
        assert top != null : "Stack is empty";
        E it=top.element();
        top=top.next();
        size--;
        return it;
    }

    public E topValue() { // Return top value
        assert top != null : "Stack is empty";
        return top.element();
    }

    public int length() {
        return size;
    } // Return length

    @Override
    public E top() {
        // TODO Auto-generated method stub
        return topValue();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return length();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (size == 0);
    }

    public void display() {

        String t;

        if (isEmpty()) t=" Stack is Empty";
        else t="Stack has data";

        String s="\n[ " + t + " ] Stack size :" + size + " Stack values [ ";

        Link <E> temp;
        temp=top;
        while (temp != null) {
            s+=temp.element();

            if (temp.next() != null) s+=" ,";

            temp=temp.next();

        }
        ;
        s+="]\n";
        System.out.print( s );
    }

}

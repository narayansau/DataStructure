package com.june13_2019.ds.ADTList;

public class arrayQueue<E> implements Queue <E>{

    private static final int MAXSIZE=10; // Maximum size of list
    private E[] listQueue; // Array holding list elements
    private int front, rear, size; // Number of list items now

    //Construcor
    public arrayQueue() {
        front=size=0;
        rear=-1;
        //for ( int i = 0 ; i< MAXSIZE ; i++) listQueue[i] = null;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        front=size=0;
        rear=-1;
        for (int i=0; i < MAXSIZE; i++) listQueue[i]=null;
        return;
    }

    @Override
    public void enqueue(E it) {
        // TODO Auto-generated method stub
        if (size == MAXSIZE) return;
        rear++;
        listQueue[rear]=it;
        size++;


    }

    @Override
    public E dequeue() {
        // TODO Auto-generated method stub
        if (front > rear) return null;
        size--;
        return (listQueue[front++]);

    }

    public E frontValue() {
        // TODO Auto-generated method stub
        return (listQueue[front]);
    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        return (size);
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return frontValue();
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return (rear == MAXSIZE);
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return ((rear - front) <= 0);
    }

    public void arrayQueuefill(E[] listArray) {

        this.listQueue=listArray;
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

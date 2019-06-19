package com.june13_2019.ds.ADTList;

//Array-based queue implementation
class AQueue<E> implements Queue <E>{

    private static final int defaultSize=10;
    private int maxSize; // Maximum size of queue
    private int front; // Index of front element
    private int rear; // Index of rear element
    private E[] listArray; // Array holding queue elements

    //Constructors
    AQueue() {
        this( defaultSize );
    }

    @SuppressWarnings("unchecked")
        // For generic array
    AQueue(int size) {
        maxSize=size + 1;
        rear=0;
        front=1;
        listArray=(E[]) new Object[maxSize]; // Create listArray
    }

    public void clear() // Reinitialize
    {
        rear=0;
        front=1;
    }

    public void enqueue(E it) { // Put "it" in queue
        assert ((rear + 2) % maxSize) != front : "Queue is full";
        rear=(rear + 1) % maxSize; // Circular increment
        listArray[rear]=it;
    }

    public E dequeue() { // Take element out of queue
        assert length() != 0 : "Queue is empty";
        E it=listArray[front];
        front=(front + 1) % maxSize; // Circular increment
        return it;
    }

    public E frontValue() { // Get front value
        assert length() != 0 : "Queue is empty";
        return listArray[front];
    }

    public int length() // Return length
    {
        return ((rear + maxSize) - front + 1) % maxSize;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
}

package com.june13_2019.ds.ADTList;

class AStackWithMain<E> implements Stack <E>{

    private static final int defaultSize=10;
    private int maxSize; // Maximum size of stack
    private int top; // Index for top Object
    private E[] listArray; // Array holding stack

    // Constructors
    AStackWithMain() {
        this( defaultSize );
    }

    @SuppressWarnings("unchecked")
        // Generic array allocation
    AStackWithMain(int size) {
        maxSize=size;
        top=0;
        listArray=(E[]) new Object[size]; // Create listArray
    }

    /**
     * @param maxSize
     * @param top
     * @param listArray
     */
    public AStackWithMain(int maxSize, int top, E[] listArray) {
        this.maxSize=maxSize;
        this.top=top;
        this.listArray=listArray;
    }

    /**
     * @return the defaultsize
     */
    public static int getDefaultsize() {
        return defaultSize;
    }

    public static void main(String[] args) {
        Object o;
        AStackWithMain <Integer> A=new AStackWithMain <Integer>();
        A.status( " New ArrayStack <Integer> A", null );
        A.push( 7 );
        A.status( " Push 7 ", null );

    }

    public void clear() // Reinitialize stack
    {
        top=0;
    }

    public void push(E it) { // Push "it" onto stack
        assert top != maxSize : "Stack is full";
        listArray[top++]=it;
    }

    public E pop() { // Pop top element
        assert top != 0 : "Stack is empty";
        return listArray[--top];
    }

    public E topValue() { // Return top element
        assert top != 0 : "Stack is empty";
        return listArray[top - 1];
    }

    public int length() {
        return top;
    } // Return length

    @Override
    public E top() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @return the maxSize
     */
    public int getMaxSize() {
        return maxSize;
    }

    /**
     * @param maxSize the maxSize to set
     */
    public void setMaxSize(int maxSize) {
        this.maxSize=maxSize;
    }

    /**
     * @return the top
     */
    public int getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(int top) {
        this.top=top;
    }

    /**
     * @return the listArray
     */
    public E[] getListArray() {
        return listArray;
    }

    /**
     * @param listArray the listArray to set
     */
    public void setListArray(E[] listArray) {
        this.listArray=listArray;
    }

    public void status(String op, Object element) {
        System.out.print( "------>" + op );
        System.out.println( " Returns " + element );
        System.out.println( " Result : size =  " + size() + " ,isEMpty "
                + isEmpty() );

        System.out.println( " stack:  " + this );
    }
}
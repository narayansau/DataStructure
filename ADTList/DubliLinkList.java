package com.june13_2019.ds.ADTList;

public class DubliLinkList<E> implements List <E>{

    protected DoublyLink <E> curr; // Access to current element
    int cnt; // Size of list
    private DoublyLink <E> head; // Pointer to list header
    private DoublyLink <E> tail; // Pointer to last element

    public DubliLinkList() {
        // TODO Auto-generated constructor stub

        curr=tail=head=new DoublyLink <E>( null, null ); // Create header
        cnt=0;
    }


    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public void insert(E item) {
        // TODO Auto-generated method stub

    }

    @Override
    public void append(E item) {
        // TODO Auto-generated method stub

    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void moveToStart() {
        // TODO Auto-generated method stub

    }

    @Override
    public void moveToEnd() {
        // TODO Auto-generated method stub

    }

    @Override
    public void prev() {
        // TODO Auto-generated method stub

    }

    @Override
    public void next() {
        // TODO Auto-generated method stub

    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int currPos() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void moveToPos(int pos) {
        // TODO Auto-generated method stub

    }

    @Override
    public E getValue() {
        // TODO Auto-generated method stub
        return null;
    }

}

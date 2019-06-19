package com.june13_2019.ds;

/**
 * @author Narayan
 * Doubly link list node
 */
public class Nodes{
    protected int data;
    protected Nodes next, prev;

    /* Constructor */
    public Nodes() {
        next=null;
        prev=null;
        data=0;
    }

    /* Constructor */
    public Nodes(int d, Nodes n, Nodes p) {
        data=d;
        next=n;
        prev=p;
    }

    /* Funtion to get link to next node */
    public Nodes getLinkNext() {
        return next;
    }

    /* Function to set link to next node */
    public void setLinkNext(Nodes n) {
        next=n;
    }

    /* Function to get link to previous node */
    public Nodes getLinkPrev() {
        return prev;
    }

    /* Function to set link to previous node */
    public void setLinkPrev(Nodes p) {
        prev=p;
    }

    /* Function to get data from node */
    public int getData() {
        return data;
    }

    /* Function to set data to node */
    public void setData(int d) {
        data=d;
    }
}


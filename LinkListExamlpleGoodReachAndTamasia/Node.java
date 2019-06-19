package com.june13_2019.ds.LinkListExamlpleGoodReachAndTamasia;

public class Node{
    @SuppressWarnings("unused")
    private String element;
    private Node nexti;

    //Constructor

    // Constructor  1

    public Node() {
        nexti=null;
        element="";
    }

    // Constructor  2

    public Node(String s, Node n) {
        element=s;
        nexti=n;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String newElem) {
        element=newElem;
    }

    // Set element

    public Node getNext() {
        return nexti;
    }

    public void setNext(Node newNext) {
        nexti=newNext;
    }


}



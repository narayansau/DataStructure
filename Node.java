package com.june13_2019.ds;

public class Node<DataType>{

    DataType element;
    Node Next;


    //  Three Constructor
    public Node() {
        element=null;
        Next=null;
    }

    public Node(DataType element, Node next) {
        this.element=element;
        this.Next=next;
    }

    public Node(Node next) {
        Next=next;
    }


    public DataType getElement() {
        return element;
    }

    public void setElement(DataType element) {
        this.element=element;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next=next;
    }
}

package com.june13_2019.ds;

public class DNode{

    protected String element;
    protected DNode next, prev;


    public DNode() {

        // TODO Auto-generated constructor stub
    }

    public DNode(DNode next, DNode prev) {
        super();
        this.next=next;
        this.prev=prev;
    }

    public DNode(String element) {

        this.element=element;
        this.next=null;
        this.prev=null;
    }

    public DNode(String element, DNode next, DNode prev) {
        super();
        this.element=element;
        this.next=next;
        this.prev=prev;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element=element;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next=next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev=prev;
    }

    @Override
    public String toString() {
        return "DNode [element=" + element + ", next=" + next + ", prev=" + prev + "]";
    }


}

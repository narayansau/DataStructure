package com.june13_2019.ds;

class DoublyLink<E>{ // Doubly linked list node
    private E element; // Value for this node
    private DoublyLink <E> prev; // Pointer to next node in list
    private DoublyLink <E> next; // Pointer to previous node

    // Constructors
    DoublyLink(E it, DoublyLink <E> p, DoublyLink <E> n) {
        element=it;
        prev=p;
        next=n;
    }

    DoublyLink(DoublyLink <E> p, DoublyLink <E> n) {
        prev=p;
        next=n;
    }

    DoublyLink <E> next() {
        return next;
    }

    DoublyLink <E> setNext(DoublyLink <E> nextval) {
        return next=nextval;
    }

    DoublyLink <E> prev() {
        return prev;
    }

    DoublyLink <E> setPrev(DoublyLink <E> prevval) {
        return prev=prevval;
    }

    E element() {
        return element;
    }

    E setElement(E it) {
        return element=it;
    }
} // class DoublyLink


package com.june13_2019.ds;

public class QueueWithLinkList<E> extends StackWithLiknList <E> implements Queue <E>{

    //  private static int size=0;
    private Node <E> front, rear;

    public QueueWithLinkList() {
        front=rear=null;
        // size = 0;
    }

    /**********************************
     * Check whether the queue is Full
     * @return boolean
     ******************************************/
    @Override
    public boolean isFull() {
        return false;
    }

    /**************************
     * Inserts an element at the rear of the queue.
     * @param  e
     * @return
     * @author Narayan Sau
     ****************************************/
    @Override
    public void enqueue(E e) {
        Node temp=new Node( e, null );
        if (size() == 0)
            front=temp;
        else
            rear.setNext( temp );
        rear=temp;

        incSize();


    }


    /**************************
     * Inserts an element at the front of the queue.
     * @param  e
     * @return
     * @author Narayan Sau
     ****************************************/
    // @Override
    public void enqueueFront(E e) {
        Node temp=new Node( e, null );
        if (size() == 0)
            front=temp;
        else
            temp.setNext( front );

        front=temp;

        incSize();


    }


    /**
     * Returns, but does not remove, the first element of the queue (null if empty).
     *
     * @Exception EmptyQueueException
     */
    @Override
    public E first() {
        return front();
    }

    @Override
    public E front() {
        return (size() == 0 ? null : front.getElement());
    }

    @Override
    public E peek() {
        return front();
    }

    /**
     * Removes and returns the first element of the queue (null if empty).
     */
    @Override
    public E dequeue() {
        Node temp=front;
        front=front.Next;

        decrSize();

        return (E) temp.getElement();

    }

    public void display() {
        String t;
        if (isEmpty()) t=" Queue is Empty";
        else t="Queue has data";
        String s="\n[ " + t + " ] Queue size :" + super.size() + " Queue values [ ";
        Node <E> tempNode=front;
        while (tempNode != null) {
            s+=tempNode.getElement();

            tempNode=tempNode.getNext();

            s+=(tempNode == null ? " " : " , ");

        }


        s+="]\n";
        System.out.print( s );
    }
}

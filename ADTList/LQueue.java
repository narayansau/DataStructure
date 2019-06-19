package com.june13_2019.ds.ADTList;

public class LQueue<E> implements Queue <E>{
    private Link <E> rear; // Pointer to rear queue
    private Link <E> front;  // Pointer to front queue

    private int size; // Number of elements


    // Constructor

    public LQueue() {

        front=rear=null;
        size=0;
    }


    @Override
    public void clear() {
        // TODO Auto-generated method stub
        front=rear=null;
        return;
    }

    @Override
    public void enqueue(E it) {
        // TODO Auto-generated method stub
        Link <E> temp=new Link <E>( it, null );


        if (size == 0) front=temp;
        else rear.setNext( temp );

        rear=temp;


        size++;
    }

    @Override
    public E dequeue() {
        // TODO Auto-generated method stub
        Link <E> curr;
        curr=front;
        front=front.next();
        size--;
        return (curr.element());
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub

        return ((size == 0) ? null : front.element());

        //if ( size == 0) return null;
        //return ( front.element());
    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        return size;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (size == 0);
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "LQueue [rear=" + rear + ", front=" + front + ", size="
                + size + ", toString()=" + super.toString()
                + "]";
    }


    public void display() {

        String t;

        if (isEmpty()) t=" Queue is Empty";
        else t="Queue has data ";

        String s="\n[ " + t + " ] Queue size :" + length() + " Queue values [ ";

        Link <E> temp;
        temp=front;
        while (temp != null) {
            s+=temp.element();

            if (temp.next() != null) s+=" ,";

            temp=temp.next();

        }
        ;
        s+="]  front element : ";
        s+=peek();
        s+="\n";
        System.out.print( s );
    }

}

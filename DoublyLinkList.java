package com.june13_2019.ds;

public class DoublyLinkList<E> implements List <E>{

    protected DoublyLink <E> curr; // Access to current element
    int cnt; // Size of list
    private DoublyLink <E> head; // Pointer to list header
    private DoublyLink <E> tail; // Pointer to last element

    public DoublyLinkList() {
        // TODO Auto-generated constructor stub

        curr=new DoublyLink <E>( null, null ); // Create header
        tail=curr;
        head=curr;
        cnt=0;
    }


    @Override
    public void clear() {
        // TODO Auto-generated method stub
        head.setNext( null ); // Drop access to links
        tail.setNext( null );

        tail=head=curr=new DoublyLink <E>( null, null ); // Create header
        cnt=0;
    }

    @Override
    public void insert(E item) {
        // TODO Auto-generated method stub
        DoublyLink <E> temp;

        if (head == curr) {


            curr=curr.setNext( new DoublyLink <E>( item, curr, null ) );

            head=curr;

            System.out.println( "{ First One :  " + item + "  " + curr + " } <-->" + curr.next() );
        } else {

            curr.setNext( new DoublyLink <E>( item, curr, curr.next() ) );
            curr.next().next().setPrev( curr.next() );

            /* Above two lines break up                         *
             * temp = new DoublyLink<E>(item, null, null);      *
             *    temp.setNext(curr.next());
             *	temp.setPrev(curr);
             *
             *	curr.next().setPrev(temp);
             *	curr.setNext(temp);
             *	curr = temp;
             ***************************************************/


        }


        cnt++;

    }

    @Override
    public void append(E item) {
        // TODO Auto-generated method stub


        DoublyLink <E> temp=(new DoublyLink <E>( item, null, null ));

        temp.setNext( tail.next() );
        tail.setNext( temp );
        temp.setPrev( tail );

        tail.next().next().setPrev( temp );


    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        if (curr.next() == tail) return null; // Nothing to remove
        E it=curr.next().element(); // Remember value

        if (head == curr.next()) head=curr;  // remove head
        else {
            curr.next().next().setPrev( curr );
            curr.setNext( curr.next().next() );
        }
        cnt--;
        return it;

    }

    public E removeSimple() {
        // TODO Auto-generated method stub

        DoublyLink <E> temp, tempnext;
        temp=curr.next();
        tempnext=null;
        if (temp != null) tempnext=temp.next();

        if (tempnext != null) {
            curr.setNext( tempnext );
            tempnext.setPrev( curr );

        }


        cnt--;
        return temp.element();

    }

    @Override
    public void moveToStart() {
        // TODO Auto-generated method stub
        head=curr;
    }

    @Override
    public void moveToEnd() {
        // TODO Auto-generated method stub
        tail=curr;
    }

    @Override
    public void prev() {
        // TODO Auto-generated method stub

        if (curr == head) return; // No previous element
        DoublyLink <E> temp=head;
        // March down list until we find the previous element
        while (temp.next() != curr) temp=temp.next();
        curr=temp;
    }


    @Override
    public void next() {
        // TODO Auto-generated method stub
        {
            if (curr != tail) curr=curr.next();
        }
    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        return cnt;
    }

    @Override
    public int currPos() {
        // TODO Auto-generated method stub

        DoublyLink <E> temp=head;
        int i;
        for (i=0; curr != temp; i++) temp=temp.next();

        return i;

    }

    @Override
    public void moveToPos(int pos) {
        // TODO Auto-generated method stub
        DoublyLink <E> temp=head;
        assert (pos >= 0) && (pos <= cnt) : "Position out of range";
        curr=head;
        for (int i=0; i < pos; i++) curr=curr.prev();

    }

    @Override
    public E getValue() {
        // TODO Auto-generated method stub
        return curr.element();
    }


    public void Display() {
        DoublyLink <E> temp;

        temp=head;
        System.out.print( "\n{Startinng from  head } <-->" );
        while (temp != null) {

            System.out.print( "{ " + temp.element() + " } <-->" );
            temp=temp.prev();
        }

        System.out.print( "<--> { tail }" );


        temp=tail;
        System.out.print( "\n{Starting from  tail } <-->" );
        while (temp != null) {
            System.out.print( "{ " + temp.element() + " } <-->" );
            temp=temp.next();
        }

        System.out.print( "<--> { head }" );

        temp=head;


        return;
    }
}


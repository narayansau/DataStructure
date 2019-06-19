package com.june13_2019.ds.LinkListExamlpleGoodReachAndTamasia;

public class linkedList{

    protected Node headi;  // Head node
    protected Node tail;   // Tail node
    protected long size;  // No. of node in the list

    // Constructor
    public linkedList() {
        headi=tail=null;
        size=0;
    }

    public boolean isEmpty() {
        return headi == null;
    }

    public long getSize() {
        return size;

    }

    public void insertAtHead(String val) {
        Node nptr=new Node( val, null );
        size++;
        if (headi == null) {
            headi=nptr;
            tail=headi;
        } else {
            nptr.setNext( headi );
            headi=nptr;
        }

    }


    public void insertAtTail(String val) {
        Node nptr=new Node( val, null );
        size++;
        if (headi == null) {
            headi=nptr;
            tail=headi;
        } else {
            tail.setNext( nptr );
            tail=nptr;
        }

    }

    public void insertAtPos(String val, long pos) {
        Node nptr=new Node( val, null );
        Node ptr=headi;
        pos=pos - 1;
        for (long i=1; i < size; i++) {
            if (i == pos) {
                Node tmp=ptr.getNext();
                ptr.setNext( nptr );
                nptr.setNext( tmp );
                break;
            }
            ptr=ptr.getNext();
        }
        size++;
    }

    /*
     * Function to deletean element at position
     */

    public void deleteAtPos(long pos) {
        if (pos == 1) {
            headi=headi.getNext();
            size--;
            return;
        }

        if (pos == size) {
            Node s=headi;
            Node t=headi;
            while (s != tail) {
                t=s;
                s=s.getNext();
            }

            tail=t;
            tail.setNext( null );
            size--;
            return;

        }

        Node ptr=headi;
        pos=pos - 1;

        for (long i=1; i < size - 1; i++) {
            if (i == pos) {
                Node tmp=ptr.getNext();
                tmp=tmp.getNext();
                ptr.setNext( tmp );
                break;

            }

            ptr=ptr.getNext();
        }

        size--;

    }

    /*
     * Function to display element...
     */
    public void display() {
        System.out.print( "\nSingly Linkied List = " );
        if (size == 0) {
            System.out.print( "Empty\n" );
            return;
        }
        if (headi.getNext() == null) {
            System.out.println( headi.getElement() );
            return;
        }
        Node ptr=headi;
        System.out.print( headi.getElement() + " --> " );
        ptr=headi.getNext();
        while (ptr.getNext() != null) {
            System.out.print( headi.getElement() + " --> " );
            ptr=headi.getNext();
        }
        System.out.print( headi.getElement() + "\n " );
    }


}



				
		
	


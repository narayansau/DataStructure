package com.june13_2019.ds.ADTList;

public class DQueuImplement<E> implements Deque <E>{
    protected DoublyLink <E> header, trailer;
    protected int size;


    public DQueuImplement() {
        header=new DoublyLink <E>( null, null );
        trailer=new DoublyLink <E>( null, null );


        size=0;

    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return (size);
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (size == 0);
    }

    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        if (size != 0) {
            System.out.println( " First Element : " + header.next().element() );
            return (header.next().element());
        } else {
            System.out.println( " The D.Q. is empty" );
            return null;
        }

    }

    @Override
    public E getLast() {
        // TODO Auto-generated method stub
        if (size == 0) {
            System.out.println( " The D.Q. is empty" );
            return null;
        }

        System.out.println( " Last  Element : " + trailer.prev().element() );

        return (trailer.prev().element());
    }

    @Override
    public void addFirst(E element) {
        // TODO Auto-generated method stub
        DoublyLink <E> temp=new DoublyLink <E>( element, null, null );

        // point the node next to header
        if (size == 0) {
            temp.setPrev( header );
            temp.setNext( trailer );
            trailer.setPrev( temp );
            header.setNext( temp );
        } else {
            DoublyLink <E> nextToHeader=header.next();
            temp.setPrev( header );
            temp.setNext( nextToHeader );
            nextToHeader.setPrev( temp );
            header.setNext( temp );
        }

        size++;


    }

    @Override
    public void addLast(E element) {
        // TODO Auto-generated method stub

        DoublyLink <E> temp=new DoublyLink <E>( element, null, null );

        // point the node next to header
        if (size == 0) {
            temp.setPrev( header );
            temp.setNext( trailer );
            trailer.setPrev( temp );
            header.setNext( temp );
        } else {
            DoublyLink <E> nextToTrailer=trailer.prev();
            temp.setPrev( nextToTrailer );
            temp.setNext( trailer );
            trailer.setPrev( temp );
            nextToTrailer.setNext( temp );

        }

        size++;

    }

    @Override
    public E removeFirst() {

        if (size == 0) {
            System.out.println( "The D Q is empty  : " );
            return null;
        }

        E it=header.next().element();
        System.out.println( "removing fast : " + it );

        /*************************************************
         * Can be done by usinng temp variable too
         * DoublyLink <E>  nextnextToHeader = header.next().next();
         * //nextnextToHeader.setPrev(header);
         * header.setNext(nextnextToHeader);
         * We are shouling without using TEMP variable
         * If you set  previous fisrt then code is as follows
         *  // header.next().next().setPrev(header)	;
         *  // header.setNext(header.next().next());
         *  if you set Next first then code is as follows
         *****************************************************/

        header.setNext( header.next().next() );
        header.next().setPrev( header );
        size--;

        return (it);
    }

    @Override
    public E removeLast() {
        // TODO Auto-generated method stub

        if (size == 0) {
            System.out.println( "The D Q is empty  : " );
            return null;
        }
        E it=trailer.prev().element();
        System.out.println( "removing last : " + it );

        trailer.setPrev( trailer.prev().prev() );
        trailer.prev().setNext( trailer );
        size--;
        return (it);
    }

    public void display() {

        String t;

        if (isEmpty()) t=" D-Q is Empty";
        else t="D-Q has data ";

        String s="\n[ " + t + " ] D-Q size :" + size + " D-Q values [ ";

        DoublyLink <E> temp;
        temp=header.next();
        while (temp != null) {
            if (temp.element() != null) s+=temp.element() + " , ";


            temp=temp.next();

        }
        ;
        s+="]   ";

        s+="\n";
        System.out.print( s );
    }


}

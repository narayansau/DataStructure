package com.june13_2019.ds;

public class DList{


    protected int size;
    protected DNode header, trailer;


    public DList(int size, DNode header, DNode trailer) {

        this.size=size;
        this.header=header;
        this.trailer=trailer;
    }

    /**
     *
     */
    public DList() {
        size=0;
        header=new DNode( null, null, null );
        trailer=new DNode( null, null, null );

        header.setNext( trailer );

    }

    /**
     * @return the size
     */
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }


    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size=size;
    }

    /**
     * @return the header
     */
    public DNode getHeader() {
        return header;
    }

    /**
     * @param header the header to set
     */
    public void setHeader(DNode header) {
        this.header=header;
    }

    public DNode getFirst() throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException( " : List is empty :" );
        return header.getNext();
    }

    /*
     * Return a Node at position i;
     */
    public DNode getANode(int i) throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException( " : List is empty :" );

        DNode temp;

        temp=header;

        for (int j=0; j <= i; j++) {
            temp=temp.getNext();
        }
        return temp;
    }

    /**
     * @return the trailer
     */
    public DNode getTrailer() {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(DNode trailer) {
        this.trailer=trailer;
    }

    public DNode getLast() throws IllegalStateException {

        if (isEmpty()) throw new IllegalStateException( " : List is empty :" );
        return trailer.getPrev();
    }

    public DNode getPrev(DNode v) throws IllegalArgumentException {

        if (v == header) throw new IllegalArgumentException( " : cannot move baack past to header :" );
        return v.getPrev();
    }

    public DNode getNext(DNode v) throws IllegalArgumentException {

        if (v == trailer) throw new IllegalArgumentException( " : cannot move forward  past to trailer :" );
        return v.getNext();
    }

    /*
     * Insert node Z before node V
     */

    public void addBefore(DNode v, DNode z) throws IllegalArgumentException {
        DNode u=getPrev( v );

        z.setPrev( u );
        z.setNext( v );
        v.setPrev( z );
        u.setNext( z );

        size++;
    }

    /*
     * insert a node Z after  a node V
     */
    public void addAfter(DNode v, DNode z) throws IllegalArgumentException {
        DNode u=getNext( v );

        z.setPrev( v );
        z.setNext( u );
        u.setPrev( z );
        v.setNext( z );

        size++;
    }

    /*
     * Insert a node at first that is after header
     */

    public void addFirst(DNode v) {
        addAfter( header, v );
    }
    /*
     *  Insert a node at last , that is before Trailer
     */

    public void addLast(DNode v) {
        addBefore( trailer, v );
    }

    /*
     * Remove a node v from doubly link list
     */

    public void remove(DNode v) {
        DNode u=getPrev( v );    // may through exception
        DNode w=getNext( v );      // may through exception
        w.setPrev( u );
        u.setNext( w );
        v.setPrev( null );
        v.setNext( null );
        size--;

    }

    public boolean hasPrev(DNode v) {
        return (v != header);
    }


    public boolean hasNext(DNode v) {
        return (v != trailer);
    }

    /**
     * @param
     */


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String s="DList [size=";
        s+=size;
        s+=" ] , {header} <==> ";
        DNode v=header.getNext();

        while (v != trailer) {
            s+=v.getElement();
            v=v.getNext();
            if (hasNext( v )) s+=" <==> ";
        }

        s+=" <==> {trailer}";
        return s;
    }


}

package com.june13_2019.ds.LinkListExamlpleGoodReachAndTamasia;

public class Nodeint{
    @SuppressWarnings("unused")
    public int data;
    public Nodeint next;

    public Nodeint() {
        next=null;
        data=0;
    }
    // Constructor  1

    public void displayNodeData() {
        System.out.println( "{ " + data + " } -->" );
    }
	
/*
	 //Constructor
	
	// Constructor  1
	
	public Nodeint() {
		next = null;
		data = 0;
	}
	
	// Constructor  2
	
	public Nodeint( int s, Nodeint n) {
		data = s;
		next = n;
	}
	
	public int getElement() { return data;}
	
	public Nodeint getNext() { return next;}
	
	// Set element
	
	public void setData( int newElem) {data = newElem;}
	
	public void setNext ( Nodeint newNext) { next = newNext ; }
	
	*/

}



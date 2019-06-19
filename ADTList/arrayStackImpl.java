package com.june13_2019.ds.ADTList;

public class arrayStackImpl{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //int [] listArray;

        Integer[] listArray={1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        arrayStack <Integer> myStack=new arrayStack <Integer>();
        System.out.println( "Stack is started \n" );

        myStack.arrayStackfill( listArray );

        //myStack.display();
        myStack.clear();
        myStack.display();
        myStack.push( 10 );
        for (int i=1; i < 8; i++) myStack.push( i * i );
        myStack.display();
        myStack.top();
        myStack.pop();
        myStack.display();

    }

}
	  


package com.june13_2019.ds.ADTList;

public class StackLinkMain<E>{

    public static void main(String[] args) {


        LStack <Integer> myStack=new LStack <Integer>();

        myStack.display();


        for (int i=1; i < 10; i++)
            myStack.push( i * i );

        myStack.display();

        myStack.pop();
        myStack.display();

    }
}
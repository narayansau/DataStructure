package com.june13_2019.ds.LinkListExamlpleGoodReachAndTamasia;

public class myNode{
    private int data;
    private myNode next;

    // Constructor
    public myNode() {
        data=0;
        next=null;

    }

    public myNode(int data, myNode node) {
        this.data=data;
        this.next=node;
    }

    // Getter

    public static void main(String args[]) {

        myNode linklist=new myNode();
        myNode head, mydata;

        head=linklist;
        linklist.setData( 5 );
        linklist.setNext( null );

        linklist.Display( head );

        for (int i=1; i < 10; i++) {

            mydata=new myNode( i * i, null );

            linklist.next=mydata;

            linklist=mydata;

            head.Display( head );
        }

        // find a particular node and insert data after that.

        myNode temp;

        temp=head.Search( head, 36 );
        if (temp != null)
            System.out.println( "\n" + " :  found " );

        mydata=new myNode( 100, null );
        // if found place after the node
        if (temp != null) {
            mydata.next=temp.next;
            temp.next=mydata;
        } else {

            // If not found place at last..

            linklist.next=mydata;
            linklist=mydata;

        }


        head.Display( head );

        //Delete a particular node.

        int i=100;

        temp=head.SearchAndPointPrev( head, i );
        if (head == temp) {

            // First node
            System.out.println( "\n" + i + " :  First node deleted " );
            head=head.next;


        } else if (temp.next == linklist) {
            // last node
            System.out.println( "\n" + i + " :  last  node deleted " );
            linklist=temp;
            linklist.next=null;

        } else {
            System.out.println( "\n" + i + " :  middle  node  deleted" );
            temp.next=temp.next.next;

        }
        head.Display( head );
    }

    public int getData() {
        return data;
    }

    // Setter
    public void setData(int data) {
        this.data=data;
        return;
    }

    public myNode getNext() {
        return next;
    }

    public void setNext(myNode next) {
        this.next=next;
        return;
    }

    public myNode Search(myNode node, int da) {
        myNode temp;
        temp=node;

        while (temp != null) {
            if (temp.getData() == da) return temp;
            temp=temp.next;

        }
        System.out.println( "\n" + da + " : not found " );

        return temp;

    }

    public myNode SearchAndPointPrev(myNode node, int da) {
        myNode temp, prev;
        temp=node;
        prev=node;

        while (temp != null) {
            if (temp.getData() == da) {
                System.out.println( "\n" + " :  data found... " );
                return prev;
            }
            prev=temp;
            temp=temp.next;

        }
        System.out.println( "\n" + da + " : not found " );

        return prev;

    }

    public void Display(myNode node) {
        myNode temp;

        temp=node;

        System.out.println( "\n" );
        //System.out.print( " { " + temp.getData() +  "} --> " );
        while (temp != null) {
            System.out.print( " { " + temp.getData() + "} --> " );
            temp=temp.next;

        }
        System.out.print( "{null }" );
    }

}

package com.june13_2019.ds.LinkListExamlpleGoodReachAndTamasia;

public class linkedListInt{

    private Nodeint head;  // Head node

    // Constructor
    public linkedListInt() {
        head=null;

    }

    public static void main(String args[]) {
        linkedListInt myLinkedlist=new linkedListInt();
        myLinkedlist.insertAtHead( 5 );
        myLinkedlist.insertAtHead( 6 );
        myLinkedlist.insertAtHead( 7 );
        myLinkedlist.insertAtHead( 1 );
        myLinkedlist.insertLast( 2 );
        // Linked list will be
        // 2 -> 1 ->  7 -> 6 -> 5
        myLinkedlist.printLinkedList();
        Nodeint node=new Nodeint();
        node.data=1;
        myLinkedlist.deleteAfter( node );
        // After deleting node after 1,Linked list will be
        // 2 -> 1 -> 6 -> 5
        myLinkedlist.printLinkedList();
    }

    // used to insert a node at the start of linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtHead(int val) {

        Nodeint newNode=new Nodeint();


        newNode.data=val;
        newNode.next=head;
        head=newNode;
    }

    // used to delete node from start of linked list
    public Nodeint deleteFirst(Nodeint node) {
        Nodeint temp=head;
        head=head.next;
        return temp;
    }

    // Use to delete node after particular node
    public void deleteAfter(Nodeint after) {
        Nodeint temp=head;
        while (temp.next != null && temp.data != after.data) {
            temp=temp.next;
        }
        if (temp.next != null)
            temp.next=temp.next.next;
    }

    // used to insert a node at the start of linked list
    public void insertLast(int data) {
        Nodeint current=head;
        while (current.next != null) {
            current=current.next; // we'll loop until current.next is null
        }
        Nodeint newNode=new Nodeint();
        newNode.data=data;
        current.next=newNode;
    }

    // For printing Linked List
    public void printLinkedList() {
        System.out.println( "Printing LinkedList (head --> last) " );
        Nodeint current=head;
        while (current != null) {
            current.displayNodeData();
            current=current.next;
        }
        System.out.println();
    }

}



				
		
	


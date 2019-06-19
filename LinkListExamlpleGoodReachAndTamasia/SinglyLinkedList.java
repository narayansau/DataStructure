package com.june13_2019.ds.LinkListExamlpleGoodReachAndTamasia;

import java.util.Scanner;

public class SinglyLinkedList{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan=new Scanner( System.in );
        /* Creating object of class linkedList */
        linkedList list=new linkedList();
        System.out.println( "Singly Linked List Test\n" );
        char ch;
        /*  Perform list operations  */
        do {
            System.out.println( "\nSingly Linked List Operations\n" );
            System.out.println( "1. insert at begining" );
            System.out.println( "2. insert at end" );
            System.out.println( "3. insert at position" );
            System.out.println( "4. delete at position" );
            System.out.println( "5. check empty" );
            System.out.println( "6. get size" );
            int choice=scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println( "Enter integer element to insert" );
                    list.insertAtHead( scan.next() );
                    break;
                case 2:
                    System.out.println( "Enter integer element to insert" );
                    list.insertAtTail( scan.next() );
                    break;
                case 3:
                    System.out.println( "Enter string  element to insert" );
                    String num=scan.next();
                    System.out.println( "Enter position" );
                    long pos=scan.nextInt();
                    if (pos <= 1 || pos > list.getSize())
                        System.out.println( "Invalid position\n" );
                    else
                        list.insertAtPos( num, pos );
                    break;
                case 4:
                    System.out.println( "Enter position" );
                    int p=scan.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println( "Invalid position\n" );
                    else
                        list.deleteAtPos( p );
                    break;
                case 5:
                    System.out.println( "Empty status = " + list.isEmpty() );
                    break;
                case 6:
                    System.out.println( "Size = " + list.getSize() + " \n" );
                    break;
                default:
                    System.out.println( "Wrong Entry \n " );
                    break;
            }
            /*  Display List  */
            list.display();
            System.out.println( "\nDo you want to continue (Type y or n) \n" );
            ch=scan.next().charAt( 0 );
        } while (ch == 'Y' || ch == 'y');

        scan.close();
    }


}

package com.june13_2019.ds;

import java.util.Scanner;

public class Master_Menu{

    private  int choice;



    public  int getChoice() {
        return choice;
    }


    Master_Menu() {
        Scanner in = new Scanner(System.in);





do {
    // Display the menu
    System.out.println("1\t Example of  Design Technique");
    System.out.println("2\t Data Types ");
    System.out.println("3\t Array");
    System.out.println("4\t Stack");
    System.out.println("5\t Queue");
    System.out.println( "6\t Singly Link List" );
    System.out.println( "7\t Doubly Link List" );
    System.out.println( "8\t Searching" );
    System.out.println( "9\t Sorting" );
    System.out.println( ("10\t Doubly Link List ") );
    System.out.println( "0 : \t Exit  "  );
    System.out.println( "Please enter your choice:" );

    //Get user's choice
     choice=in.nextInt();

    //Display the title of the chosen module
    switch (choice) {
        case 1:
            System.out.println( "1\t Example of  Design Technique\n" );
            DesignTachnique allDesignTechnique=new DesignTachnique();




            break;

        case 2:
            System.out.println( "2\t Data Types " );
            MyDataTypes myDataTypes=new MyDataTypes();
            myDataTypes.PrimitivDataType();
            myDataTypes.NonPrimitiveDataType();

            break;
        case 3:
            System.out.println( "3\t Array" );

            ArrayClass myArray=new ArrayClass();

            myArray.AllKindsOfArrayDeclaration();

            break;
        case 4:
            System.out.println( "4\t Stack" );

            // Using Array Implementation
            Integer[] listArray={1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            arrayStack <Integer> myStack=new arrayStack <Integer>();
            System.out.println( "Stack is started \n" );
            myStack.arrayStackfill( listArray );

            myStack.clear();
            myStack.display();
            myStack.push( 10 );
            for (int i=1; i < 8; i++) myStack.push( i * i );
            myStack.display();
            myStack.top();
            myStack.pop();
            myStack.display();

            // Using Link list implimentation
            StackWithLiknList <Integer> myStack1=new StackWithLiknList <Integer>();
            System.out.println( "Stack is started \n" );


            myStack1.clear();
            myStack1.display();
            myStack1.push( 10 );
            for (int i=1; i < 8; i++) myStack1.push( i * i );
            myStack1.display();
            myStack1.top();
            myStack1.pop();
            myStack1.display();


            // Using pipe type  Stack
            NewStackWithLinkList myStack2=new NewStackWithLinkList();
            myStack2.clear();
            myStack2.display()
                    .newpush( 10 )
                    .newpush( 1 )
                    .newpush( 4 )
                    .newpush( 9 )
                    .display()
                    .newtop()
                    .newpop()
                    .display();


            break;
        case 5:
            System.out.println( "5\t Queue" );

            ArrayQueue <Integer> myQueue=new ArrayQueue <Integer>();
            Integer[] listQueue={0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            System.out.println( "Queue is started \n" );
            myQueue.ArrayQueuefill( listQueue );
            myQueue.display();
            for (int i=1; i < 8; i++) myQueue.enqueue( i * i );
            myQueue.display();
            myQueue.dequeue();
            myQueue.display();
            myQueue.clear();
            myQueue.display();

            // LinkList implimentattion of Queue

            QueueWithLinkList myQueue1=new QueueWithLinkList();

            System.out.println( "Queue with LinkList is started \n" );

            myQueue1.enqueue( 10 );
            myQueue1.enqueue( 12 );
            for (int i=1; i < 8; i++) myQueue1.enqueue( i * i );
            myQueue1.display();
            myQueue1.dequeue();
            myQueue1.display();
            myQueue1.enqueueFront( 100 );
            myQueue1.display();


            break;
        case 6:
            System.out.println( "6\t Link List" );

            // Change ADT to Integer...

            SinglyLinkList <Integer> myLinkList=new SinglyLinkList <Integer>();

            //myLinkList.clear();

            //insert data in link list

            for (int i=0; i < 10; i++)
                myLinkList.insert( i * i );

            myLinkList.append( 100 );

            myLinkList.moveToStart();
            myLinkList.Display();


            System.out.print( " \nOne node removed :" + myLinkList.remove() + "\n" );
            myLinkList.moveToStart();
            myLinkList.Display();

            myLinkList.moveToPos( 5 );
            System.out.print( " \n Now current positoin value : " + myLinkList.getValue() + " current position  :  "
                    + myLinkList.currPos() + "\n" );
            myLinkList.insert( 200 );

            myLinkList.moveToStart();
            myLinkList.Display();

            System.out.print( "\n Total no of node : " + myLinkList.length() );

            break;
        case 7:
            System.out.println( "6\t Doubly Link List" );
            DList myDLList=new DList();

            System.out.println( myDLList.toString() );

            String s="Narayan";

            DNode myNode=new DNode( s );
            s="NarayanSau";
            DNode addNode=new DNode( s );

            myDLList.addFirst( myNode );


            System.out.println( myDLList.toString() );
            myDLList.addFirst( addNode );
            System.out.println( myDLList.toString() );

            for (int i=0; i < 5; i++) {
                s="Narayan - " + i;

                System.out.print( "  : " + s + " :" );
                myNode=myDLList.getNext( myDLList.getHeader() );


                addNode.setElement( s );


                myDLList.addBefore( myNode, addNode );
                myDLList.addAfter( myNode, addNode );
                myDLList.addFirst( addNode );

            }

            System.out.println( myDLList.toString() );

            break;
        case 8:
            System.out.println( "7\t Searching" );

            break;
        case 9:
            System.out.println( "8\t Sorting" );

            break;
        case 10:
            System.out.println( ("10\t Doubly Link List ") );

            DoublyLinkList <Integer> myDLList1=new DoublyLinkList <Integer>();


            myDLList1.insert( 50 );
            myDLList1.insert( 55 );
            myDLList1.insert( 60 );
            System.out.println( "\n Size is : " + myDLList1.length() );

            System.out.println( "\n curent position is : " + myDLList1.currPos() );

            System.out.println( "\n curent node  is : " + myDLList1.getValue() );

            myDLList1.insert( 80 );


            for (int i=1; i < 10; i++) {
                myDLList1.insert( i * i );
            }

            myDLList1.Display();
            myDLList1.moveToPos( 6 );
            System.out.println( "\n curent node  is : " + myDLList1.getValue() );
            myDLList1.remove();
            myDLList1.removeSimple();

            myDLList1.append( 255 );
            myDLList1.Display();
            break;

        default:
            System.out.println( "Invalid choice" );

    }   //Choice


    pressAnyKeyToContinue();
    choice=in.nextInt();
}   while (    choice != 0);


    }   // Main_choice


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void pressAnyKeyToContinue() {
        System.out.println( "Press Enter to continue or 0 to exit..." );
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }



}


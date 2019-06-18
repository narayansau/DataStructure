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
    System.out.println("6\t Link List");
    System.out.println("7\t Searching");
    System.out.println("8\t Sorting");
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


            break;
        case 5:
            System.out.println( "5\t Queue" );

            break;
        case 6:
            System.out.println( "6\t Link List" );

            break;
        case 7:
            System.out.println( "7\t Searching" );

            break;
        case 8:
            System.out.println( "8\t Sorting" );

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


package com.june13_2019.ds;

import java.util.Scanner;

public class Master_Menu{

    private  int choice;



    public  int getChoice() {
        return choice;
    }



    public  Master_Menu () {
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
    System.out.println( "Please enter your choice:" );

    //Get user's choice
     choice=in.nextInt();

    //Display the title of the chosen module
    switch (choice) {
        case 1:
            System.out.println( "1\t Example of  Design Technique" );
            break;

        case 2:
            System.out.println( "2\t Data Types " );
            ;
            break;
        case 3:
            System.out.println( "3\t Array" );
            ;
            break;
        case 4:
            System.out.println( "4\t Stack" );
            ;
            break;
        case 5:
            System.out.println( "5\t Queue" );
            ;
            break;
        case 6:
            System.out.println( "6\t Link List" );
            ;
            break;
        case 7:
            System.out.println( "7\t Searching" );
            ;
            break;
        case 8:
            System.out.println( "8\t Sorting" );
            ;
            break;

        default:
            System.out.println( "Invalid choice" );

    }   //Choice
}   while ( !  ( choice >0 && choice < 9));
     //return choice;
    }   // Main_choice
}

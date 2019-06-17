package com.june13_2019.ds;

import java.util.Scanner;

/****************************
 * 1.	Home Page of Data Structure
 * 1.1	example of design technique
 * 1.1.1	Brute force
 * 1.1.2	Greedy Algorithm
 * 1.1.3	Divide-and-Conquer, Decrease-and-Conquer
 * 1.1.4	Dynamic Programming
 * 1.1.5	Transform and Conquer
 * 1.1.6	Recursion
 * 1.1.7	Backtracking
 * 1.2	Data Type
 * 1.2.1	Primitive Data type
 * 1.2.2	Abstract Data Type
 * 1.3	Array
 * 1.4	Stack
 * 1.5	Queue
 * 1.6	Link List
 * 1.7	Searching
 * 1.8	Sorting
 *************************************************************************/
public class Main {

    public static void main(String[] args) {
        System.out.println("Home page of Data Structure");

        Master_Menu  masterMenu = new Master_Menu();

        int i;
        i=masterMenu.getChoice();

        System.out.println( "Menu choice is " + i );
       masterMenu. clearScreen();
        //end of switch
    }//end of the main method
}//end of class


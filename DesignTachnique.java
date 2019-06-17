/********************************************************
 * 1.1.1	Brute force
 * 1.1.2	Greedy Algorithm
 * 1.1.3	Divide-and-Conquer, Decrease-and-Conquer
 * 1.1.4	Dynamic Programming
 * 1.1.5	Transform and Conquer
 * 1.1.6	Recursion
 * 1.1.7	Backtracking
 */




package com.june13_2019.ds;

import java.util.Arrays;
import java.util.Scanner;

public class DesignTachnique{


        private  int choice;



        public  int getChoice() {
            return choice;
        }



        public  DesignTachnique () {
            Scanner in = new Scanner(System.in);





            do {
                // Display the menu
                System.out.println( "1 : \t Brute force "  );
                System.out.println( "2 : \t Greedy Algorithm "  );
                System.out.println( "3 : \t Divide-and-Conquer, Decrease-and-Conquer "  );
                System.out.println( "4 : \t Dynamic Programming "  );
                System.out.println( "5 : \t Transform and Conquer "  );
                System.out.println( "6 : \t Recursion "  );
                System.out.println( "7 : \t Backtracking  "  );
                System.out.println( "0 : \t Exit  "  );

                System.out.println( "Please enter your choice:" );

                //Get user's choice1

                choice=in.nextInt();

                //Display the title of the chosen module
                switch (choice) {
                    case 1:
                        System.out.println( "1 : \t Brute force "  );

                        BruteForce bruteForce = new BruteForce();
                        bruteForce.BruteForce();

                        break;

                    case 2:
                        System.out.println( "2 : \t Greedy Algorithm "  );

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
                    case 0:
                        return;

                    default:
                        System.out.println( "Invalid choice" );

                }   //Choice

                System.out.println( "Press Any key to continue or 0 to exit" );
                choice=in.nextInt();
            }   while (   ( choice != 0 ));

        }   // Main_choice

    }

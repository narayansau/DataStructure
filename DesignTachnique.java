package com.june13_2019.ds;

/******************************************************
 * 1.1.1	Brute force
 * 1.1.2	Greedy Algorithm
 * 1.1.3	Divide-and-Conquer, Decrease-and-Conquer
 * 1.1.4	Dynamic Programming
 * 1.1.5	Transform and Conquer
 * 1.1.6	Recursion
 * 1.1.7	Backtracking
 ********************************************************/


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
                System.out.println( "5 : \t Recursion " );

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
                        GreedyAlogorithm greedyAlogorithm = new GreedyAlogorithm();
                        greedyAlogorithm.CountCoin();

                        break;
                    case 3:
                        System.out.println( "3 : \t Divide-and-Conquer, Decrease-and-Conquer " );
                        DivideAndConquer divideAndConquor=new DivideAndConquer();
                        divideAndConquor.FinfNuberByDivideAndConquor();

                        System.out.println( "Sum of First 10 number is " +
                                divideAndConquor.DecreasAndConquor( 10 ) );

                        break;
                    case 4:
                        System.out.println( "4 : \t Dynamic Programming " );
                        DynamicProgramming dynamicProgrammingExample=new DynamicProgramming();
                        int recFib=dynamicProgrammingExample.recursiveFibonacci( 10 );
                        int dynFib=dynamicProgrammingExample.dynamicFibonacci( 10 );
                        System.out.println( " To Find fibonacci(10) via recursive program takes : " +
                                dynamicProgrammingExample.recursiveCounter +
                                " Steps \n and with Dynamic programming it takes : " +
                                dynamicProgrammingExample.dynamicCounter +
                                " Steps \n The value of Fib(10) is " + recFib +
                                " And " + dynFib );

                        break;
                    case 5:
                        System.out.println( "5 : \t Recursion " );
                        Recursion recursion=new Recursion();
                        System.out.println( "Factorial of 6 is : " + recursion.Factorial( 6l ) );

                        System.out.println( "Sum  of first 6 number  is : " + recursion.Sum( 6 ) );

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

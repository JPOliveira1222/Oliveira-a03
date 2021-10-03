/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise28;

import java.util.Scanner;

public class solution28 {
    /*
    Print "Enter a number:"

    using a for loop get 5 numbers from user input and add them together

    print "The total is " +sum
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int counter = 0;

        for (int i = 0; i < 5; i++) {

            counter++;

            System.out.println("Enter number #" + counter + " :");

            int numberInput = scanner.nextInt();

            sum += numberInput;

        }
        System.out.println("The total is " +sum);
    }
}
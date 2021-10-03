/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package exercise31;

import java.util.Scanner;

public class solution31{

    /*
    set 2 variables for restingPulse and age
    print "enter your resting Pulse"
    restingPulse = user input

    print "Enter your age: "
    age = user input

    print "Resting Pulse: "+restingPulse+ " Age: " +age"

    set a variable for the intensity

    print out the table

    using a while loop the equation at a 5% interval

    print out the results

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int restingPulse;
        int age;


        System.out.println("Enter your resting Pulse:");
        restingPulse = scan.nextInt();

        System.out.println("Enter your age: ");
        age = scan.nextInt();

        System.out.println("Resting Pulse: " + restingPulse + " Age: " + age);

        int intensity = 55;
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while(intensity<96){

            int Target = (220-age);
            Target = Target - restingPulse;
            Target = (int) ((Target*(intensity/100.00))+restingPulse);

            System.out.println(intensity+"%       | "+Target +"bpm");
            intensity+=5;
        }

    }



}

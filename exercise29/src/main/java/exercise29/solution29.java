/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise29;

import java.util.*;

public class solution29 {

    /*
    Set a boolean to test conditions for a true/false statement

    in a do/while loop continue asking for user input unless given and integer

    if the user inputs 0 or a Character,
    catch the exceptions and print "sorry. that's not a valid input"

    if the user inputs a digit besides 0 run it through the equation (72/user input)

    print "It will take " +user input+ " years to double your investment."

     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean test = false;

        do {
            try {
                System.out.print("What is the rate of return? ");
                int rate = Integer.parseInt(scan.next());

                System.out.println("It will take " + (72 / rate) + " years to double your inital investment.");
                test = true;
            } catch (NumberFormatException i) {
                System.out.println("Sorry. That's not a valid input");
            } catch (ArithmeticException i) {
                System.out.println("Sorry. that's not a valid input");
            }

        } while (!test);
    }



    }





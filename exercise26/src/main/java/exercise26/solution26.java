/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */


package exercise26;

import java.util.*;
import java.lang.*;

public class solution26 {
    /*
    Print "What is your balance?"
    balance = user input

    Print "What is the apr on the card (as a percent)?"
    APR = user input

    Print "What is the monthly payment you can make?")
    payment = user input

    get daily value of APR
    using the given formula, determine how many months it would take
    round the months to the next whole month

    Print ""It will take you " +months+ " months to pay off this card."

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your balance?");
        double balance = scan.nextDouble();

        System.out.println("What is the APR on the card (as a percent)?");
        double APR = scan.nextDouble();

        System.out.println("What is the monthly payment you can make?");
        double payment = scan.nextDouble();

        double months;
        APR = (APR/36500);
        months = (-1.0/30.0) * (Math.log(1 + ((balance/payment)) * ( 1 - (Math.pow((1 + APR), 30)))) /Math.log(1 + APR));



        System.out.println("It will take you " +Math.ceil(months)+ " months to pay off this card.");




    }




}

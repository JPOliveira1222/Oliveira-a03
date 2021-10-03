/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise33;

import java.util.*;

public class solution33 {

    /*
    Set a set amount of responses the user can get into a string
    set a random object

    print "what is your question?"
    question = user input

    choose a random response from the previously set strings

    print out the response.

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] answers = {"Yes", "No", "Maybe", "Ask again later"};
        Random random = new Random();

        System.out.println("What is your question?");
        String question = scan.nextLine();

        int randomResponseIndex = random.nextInt(answers.length);
        String response = answers[randomResponseIndex];

        System.out.println(response);

    }
}

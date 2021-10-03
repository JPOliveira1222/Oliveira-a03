
/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise32;
import java.util.*;


public class solution32 {

    /*
    Print "Let's play Guess The Number!"

    initialize a number and set it to random number between 1-1000

    ask what the difficulty the user would like to play
    if the difficulty is 1 get a random number between 1-10
    if the difficulty is 2 get a random number between 1-100
    if the difficulty is 3 get a random number between 1-1000

    have the user guess until they get the correct random number
    If the user guess is too low "Too low. Guess again."
    if the user guess is too high "Too high. Guess again."
    if the user guess is correct print "you got it in " +total+ "Guesses"

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Let's play Guess The Number!");
        int number;
        int guess,total,difficulty;

        number = (int) (Math.random()*999+1);

        while(true){

            total = 0;

            System.out.println("Enter the difficulty level 1, 2, or 3");
            difficulty = scan.nextInt();

            if(difficulty == 1)
                number = (int) (Math.random() * 10 + 1);
            else if (difficulty == 2)
                number = (int) (Math.random() * 100 + 1);
            else
                number = (int) (Math.random() * 1000 + 1);
            System.out.println("I have my number, what's your guess?");

            do{
                guess = scan.nextInt();
                total++;
                if (guess == number)
                    System.out.println("You got it in " +total+ " guesses!");

                else if (guess < number)
                    System.out.println("Too low. Guess again: ");
                else System.out.println("Too high. Guess again: ");

            }while (guess != number);
            System.out.println("\nDo you wish to play again (Y/N)");
            char k=scan.next().charAt(0);
            if(k=='N' || k =='n')
                break;



        }


    }

}

/*
 *  UCF COP3330 Fall 2021 Assignment 37 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise37;

import java.util.*;

public class solution37 {

    /*
    print "what's the minimum length"
    length = input from user that is turned into an int

    print "How many special characters?"
    character = input from user that is turned into int

    print "how many numbers?"
    numbers = input from user that is turned into an int

    print "your password is " randomPassword that takes in the user inputs of length, special characters and numbers.

    using a function that created a random password
    set the letters, numbers, and special characters that can be used

    add random letters from the predetermined string depending on the length of the password

    add random special characters from the predetermined string and amount of special characters requested by the user

    add random numbers from the predetermined string and amount of numbers requested by the user

    put it all together and shuffle them in a random order

    print out the completed password.


     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Whats the minimum length? ");
        int length = Integer.parseInt(scan.nextLine());

        System.out.println("How many special characters? ");
        int characters = Integer.parseInt(scan.nextLine());

        System.out.println("How many numbers? ");
        int numbers = Integer.parseInt(scan.nextLine());

        System.out.println("Your password is " +randomPassword(length, characters, numbers));

    }

    public static String randomPassword(int size, int special, int nums){
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*?";
        String numbers = "1234567890";
        Random random = new Random();
        ArrayList<Character> chars = new ArrayList<>();

        for(int i=0; i<special; i++){
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        }
        for(int i=0; i<nums; i++){
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }

        for(int i=chars.size()-1;i<size; i++){
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }

        Collections.shuffle(chars);
        StringBuilder password = new StringBuilder();
        for(Character s: chars)
        {
            password.append(s);
        }
        return password.toString();


    }

}

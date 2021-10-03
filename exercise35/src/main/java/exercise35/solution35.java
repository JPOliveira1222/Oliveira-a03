/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise35;

import java.util.*;

public class solution35 {

    /*
    Set up an arraylist that will take in all names input by the user

    in a do/while loop ask the user to input a name until they put in a blank input

    randomly choose a winner from the set arraylist of names that the user put

    print "And the winner is...." +nameList;
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random choice = new Random();

        String name;

        ArrayList<String> nameList = new ArrayList<>();
        do {
            System.out.println("Enter a name: ");
            name = scan.nextLine();
            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty());

        int random = choice.nextInt(nameList.size());

        System.out.println("The winner is...."+nameList.get(random));

    }



}

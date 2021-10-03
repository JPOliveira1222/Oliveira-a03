/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise38;

import java.util.ArrayList;
import java.util.Scanner;

public class solution38 {

    /*
    Prompt the user to enter a string containing numbers separated by the space
    Print "Enter a list of numbers, separated by spaces: "

    Have a function that returns the integer array of all the even numbers in the List

    print "The even numbers are "

    display the list of only even numbers using a for loop
    using an if/else loop keep going through the numbers until there are no more even numbers in the list

    the method to go through the numbers and check if they are even

    make an empty Integer array list
    loop to go through the inputs
    convert the string to integers
    check to see if the numbers are divisible by 2, if they are, add them to the empty list.
    */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();

        String[] list = data.split(" ");

        Integer[] evenList = filterEvenNumbers(list);

        System.out.print("The even numbers are ");
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    public static Integer[] filterEvenNumbers(String[] list) {

        ArrayList<Integer> newList = new ArrayList<>();

        for (String s : list) {

            int num = Integer.parseInt(s);
            if (num % 2 == 0) {
                newList.add(num);
            }
        }

        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);
        return arr;
    }


}

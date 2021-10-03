/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise36;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class solution36 {

    /*
    make an arraylist to hold the numbers the user inputs
    print "Enter a number: "
    input = user input that gets put into the arraylist

    determine that if the user inputs 'done' then stop the do/while loop for taking in user input
    print out the list of numbers

    create a function for the average, min, max, and standard deviation

    after running the numbers in the list through each function
    print out the average, min, max, and standard deviation



     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();
        String input;
        do {
            System.out.println("Enter a number: ");
            input = scan.next();

            if (!input.equals("done"))
                try {
                    int num = Integer.parseInt(input);
                    number.add(num);
                } catch (NumberFormatException ignored) {
                }
        }while(!input.equals("done"));
        System.out.println("Numbers: "+number.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("The average is " +average(number));
        System.out.println("The minimum is " +min(number));
        System.out.println("The maximum is " +max(number));
        System.out.println("The standard deviation is "+String.format("%.2f", std(number)));
    }

    public static double average (ArrayList<Integer> number){
        int total = 0;
        for(int num: number){
            total +=num;
        }
        return (double)(total)/number.size();
    }


    public static int max(ArrayList<Integer>number) {
        int max = number.get(0);
        for (int num : number) {
            if (num > max)
                max = num;
        }
        return max;
    }

    public static int min(ArrayList<Integer>number) {
        int min = number.get(0);
        for (int num:number){
            if(num<min)
                min = num;
        }
        return min;
    }

    public static double std(ArrayList<Integer>number) {
        double mean = average(number);
        double sum = 0;
        for(int num: number){
            sum = sum+Math.pow((num-mean),2);
        }

        return Math.sqrt(sum/number.size());
    }

}

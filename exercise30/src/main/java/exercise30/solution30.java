/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise30;

public class solution30 {
    /*
    set 2 integer variables to be multiplied
    in a for loop set the variables from 1-12
    Using a for loop, multiply 2 digits (a*b)
    print them out with 3 digits in between them
     */

    public static void main(String[] args) {
        int a;
        int b;
        for (a=1; a<=12; ++a)
        {
            for (b=1; b<=12; ++b)
            {
                System.out.printf("%4d",a*b);
            }
            System.out.println();
        }
    }




}

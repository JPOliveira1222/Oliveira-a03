package exercise24;

import java.util.Arrays;
import java.util.Scanner;

public class solution24 {

    /*
    Print "Enter two strings, and i'll tell you if they are anagrams:\n

    print "Enter the first string: "
    str1 = user input

    print "Enter the second string: "
    str2 user input

    using if else loop determine if the string are or are not anagrams

    using a boolean isAnagram

    compare the length of the strings
    if it isn't the same end the code there and return the exception

    if it is the same length sort the array and see if the characters are the same.



     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two strings, and i'll tell you if they are anagrams:\n");
        try {//just wanted to stall out the printing of the second string a little, so it looks nicer
            Thread.sleep (3000);

        }
        catch (InterruptedException ignored){

        }

        System.out.println("Enter the first string: ");
        String str1 = scan.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scan.nextLine();

        if (isAnagram(str1, str2))
            System.out.println(str1 + " and " + str2 + " are anagrams");
        else
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        scan.close();
    }



    public static boolean isAnagram(String str1, String str2){
        str1 = str1.replaceAll("s", "");
        str2 = str2.replaceAll("s", "");

        if (str1.length() != str2.length() )
            return false;

        else{
            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            return (Arrays.equals(array1, array2));

        }

    }



}

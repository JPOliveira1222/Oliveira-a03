/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise34;

import java.util.*;

public class solution34 {

    /*
    Create a string containing the list of employees
    print out the names of the employees

    print "Enter an employee name to remove: "
    removal - user input

    remove the employee from the list
    print out the remaining employees in the list

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        printEmployee(employeeList);

        System.out.println("\nEnter an Employee name to remove: ");
        String removal = scan.nextLine();

        employeeList.remove(removal);

        System.out.println();
        printEmployee(employeeList);

    }

    public static void printEmployee(ArrayList<String> employeeList){
        System.out.println("There are "+employeeList.size()+" employees: ");
        for (String employee:employeeList){
            System.out.println(employee);
        }
    }



}

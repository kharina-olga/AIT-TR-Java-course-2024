// code by Olga Kharina
package homework_06;

// Task 1. Write a program for calculating the payment of money to an employee, taking into account the bonus for length of service, if the base salary is $500.
// For 3 years of work, a 10% bonus, for 5 years of work, a 50% bonus, for 10 years of work, a 100% bonus, for 15 years of work, a 150% bonus.
// How many years the employee has worked is entered from the keyboard.

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input how many years works an employee in the company: ");
        int years = scanner.nextInt();
        
        double baseSalary = 500;
        double bonus = 0;

        if (years > 0 && years < 3) {
        bonus = 1;
        } else if (years >= 3 && years < 5) {
            bonus = 1.1; // For 3 years of work, a 10% bonus = 10/100 + 1
        } else if (years >=5 && years < 10) {
            bonus = 1.5; // for 5 years of work, a 50% bonus = 50/100 + 1
        } else if (years >= 10 && years < 15) {
            bonus = 2;  // for 10 years of work, a 100% bonus = 100/100 + 1
        } else if (years >= 15) {
            bonus = 2.5; // for 15 years of work, a 150% bonus = 150/100 + 1
        } else {
            System.out.println("Wrong input!");
        }
        double totalSalary =  bonus * baseSalary;
        System.out.println("Salary with bonus: " + bonus * baseSalary);

    } // end of main

} // end of class

package homework_07;

// code by Olga Kharina
/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */

import java.util.Random;
import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: 1, 2 or 3.");
        int number = scanner.nextInt();
/*
        switch (number) {
            case 1 -> System.out.println("one");

            case 2 -> System.out.println("two");

            case 3 -> System.out.println("three");

            default -> System.out.println("Wrong input!");
        }
      */

       String result =  switch (number) {
            case 1 -> "your number is one";

            case 2 -> "your number is two";

            case 3 -> "your number is three";

            default -> "Wrong input!";
        };
    }
}

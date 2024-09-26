package homework_07;
// code by Olga Kharina
// Эту задачу мы выполняли на занятии, поэтому я высылаю домашнюю работу с занятия, она аналогична.
/* Task 4
Напишите программу с использованием оператора switch:
Программа просит пользователя ввести число от 1 до 7.
 Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
 */

import java.util.Scanner;

public class Task_04_case {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number of month (number 1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1 -> {
                System.out.println("This is January.");
            }
            case 2 -> {
                System.out.println("This is February.");
            }
            case 3 -> {
                System.out.println("This is March.");
            }
            case 4 -> {
                System.out.println("This is April.");
            }
            case 5 -> {
                System.out.println("This is May.");
            }
            case 6 -> {
                System.out.println("This is June.");
            }
            case 7 -> {
                System.out.println("This is July.");
            }
            case 8 -> {
                System.out.println("This is August.");
            }
            case 9 -> {
                System.out.println("This is September.");
            }
            case 10 -> {
                System.out.println("This is October.");
            }
            case 11 -> {
                System.out.println("This is November.");
            }
            case 12 -> {
                System.out.println("This is December.");
            }
            default -> System.out.println("Wrong input!");

        } // end of case name of month

        switch (month){

            case 1, 2, 12 -> {
                System.out.println("This is winter!");
            }
            case 3, 4, 5 -> {
                System.out.println("This is spring!");
            }
            case 6, 7, 8 -> {
                System.out.println("This is summer!");
            }
            case 9, 10, 11 -> {
                System.out.println("This is autumn!");
            }
        }// end of switch time of year

    } // end of main

} // end of class


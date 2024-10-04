package OldPackages.lesson_06.code.homework_06;
// code by Olga Kharina
// Task 3. Write a program for a car at a traffic light. What to do if the light is red, yellow or green.
// The color of the traffic light is set in the program, then from the keyboard.

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can control this traffic light. To turn on red enter 1, yellow 2, green 3.");
        int color = scanner.nextInt();

        switch (color) {
            case 1 -> {
                System.out.println("Traffic light is red! Please stop and wait.");
            }
            case 2 -> {
                System.out.println("Traffic light is yellow! Get ready to move.");
            }
            case 3 -> {
                System.out.println("Traffic light is green! You can move on. ");
            }
        }

    } // end of main

} // enf of class

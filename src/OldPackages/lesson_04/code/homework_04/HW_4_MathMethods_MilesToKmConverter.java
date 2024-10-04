// code by Olga Kharina
// Write a method that converts Celsius to Fahrenheit. Find the conversion formula on the Internet. Call the method in main

package OldPackages.lesson_04.code.homework_04;
import java.util.Scanner;  // Import the Scanner class

public class HW_4_MathMethods_MilesToKmConverter {

        public static void main(String[]args) {
            // Taking input data from user
            Scanner input = new Scanner(System.in);
            System.out.println("Please input how much miles do you want to convert to kilometers: ");
            double miles = input.nextDouble();
            double km = convertMilesToKm(miles);
            // Getting the conversion result to user
            System.out.println( miles + " miles is " + km + " kilometers" );
        //    System.out.printf(  "miles is = miles %.2f ", miles, km, "kilometers = %.1f");
            input.close();
        } //end of main

        private static double convertMilesToKm(double miles) {
            return miles * 1.60934;   // miles to kilometers converting formula
        }
    } // end of class




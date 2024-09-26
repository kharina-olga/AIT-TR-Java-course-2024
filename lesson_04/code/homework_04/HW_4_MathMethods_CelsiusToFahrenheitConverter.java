// code by Olga Kharina
// Write a method that converts Celsius to Fahrenheit. Find the conversion formula on the Internet. Call the method in main

package homework_04;
import java.util.Scanner;  // Import the Scanner class

public class HW_4_MathMethods_CelsiusToFahrenheitConverter {
    public static void main(String[]args) {
        // Taking input data from user
        Scanner input = new Scanner(System.in);
        System.out.println("Please input temperature in degrees Celsius  to convert to degrees Fahrenheit: ");
        double tempC = input.nextDouble();
        double tempF = convertCelsiusToFahrenheit(tempC);
        // Getting the conversion result to user
        System.out.println( tempC + " degrees Celsius is " + tempF + " Fahrenheit degrees" );
        input.close();
    } //end of main

    private static double convertCelsiusToFahrenheit(double tempC) {
        return (tempC * 1.8)  + 32;    // Celsius to Fahrenheit conversion formula
    }
} // end of class

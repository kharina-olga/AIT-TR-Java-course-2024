// Code by Olga Kharina
// Write a method that returns the minimum of two integers. The numbers are specified in the program.
package homework_05;

public class Minimum {

    public static void main(String[] args) {
        int a = 1;
        int b = 174;

// calling a method
        int min = minimum(a, b);
        System.out.println("Minimum = "+ min);

    } // end of main

// method
    private static int minimum (int a, int b){
        int min= 0;
        if(a <= b){
            min = a;
        } else {
            min = b;
        }
        return min;
    }

} // end of class

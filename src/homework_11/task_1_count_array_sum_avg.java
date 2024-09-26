package homework_11;
// code by Olga Kharina
// Task 1
// Написать метод, который считает сумму всех элементов в массиве.
// Task 2
//Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).

import java.util.Random;

public class task_1_count_array_sum_avg {
    public static void main(String[] args) {

     int[] array = {1, 2, 3, 4, 10};

/*
        // The method creates an array of ints with 10 elements. Fills with random values
        int[] array = fillArray();
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
*/

        int sum = countSum(array);   // Call the method and store the sum result
        System.out.println("The sum of all elements in the array is: "  + sum);

        double avg = countAverage(array); // Call the method and store the average value result
        System.out.println("The average value of all elements in the array is: "  + avg);


    } // method area

    public static double countAverage(int[] array) {
        int arraySum = 0;  // Initialize sum to 0

        for (int i = 0; i < array.length; i++) { // through each element in the array
            arraySum += array[i];  // Add each element to the sum
        }
        double arrayAvg = (double) arraySum / array.length;; // Initialize average value to 0

        return arrayAvg;

    }


    public static int countSum(int[] array) {
        int arraySum = 0;  // Initialize sum to 0

        for (int i = 0; i < array.length; i++) { // through each element in the array
             arraySum += array[i];  // Add each element to the sum
        }

        return arraySum;   // Return the total sum

    }

/*
    // Method to count the sum of all elements in an array
    public static int[] fillArray() {
        int[] result = new int[10];

        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(101);
        }

        return result;
    }

*/

} // end of class

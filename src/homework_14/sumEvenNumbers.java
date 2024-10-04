package homework_14;

// Task 2 - Howework 14
//Сумма четных чисел
//Напишите метод, который вычисляет сумму всех четных чисел в массиве.

public class sumEvenNumbers {
    public static void main(String[] args) {

        // array with numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // calling method to calculate
        int result = sumOfEvenNumbers(numbers);
        System.out.println("The sum of even numbers is: " + result);

    } // end of Main

    // method to calculate the sum of even numbers

    public static int sumOfEvenNumbers(int[] numbers) {
        int sum = 0; // variable to store sum

        // Loop through all elements of the array
        for (int num : numbers) {
            if (num % 2 == 0) { // checking if a number is even
                sum += num; // adding a number to the sum if it is even
            }
        }
        return sum; // return sum of even numbers

    }


} // end of class

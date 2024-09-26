package homework_09;

// code by Olga Kharina
// Task 3 * (Опционально)
//Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа.
// Посчитайте сколько получилось таких чисел в массиве. Простое число - число, которое делится на цело только на 1 и само себя.
import java.util.Random;

public class task_3_prime_numbers {
    public static void main(String[] args) {

        Random random = new Random();
        int k = 0;
        int[] array = new int[10];

        // заполнение массива случайными числами и вывод на экран для самопроверки

        System.out.print("Massive: [");
        while (k < array.length) {
            array[k] = random.nextInt(0, 101);
            System.out.print(array[k] + ", ");
            k++;
        }
        System.out.println("]");
        printSimpleNumbers(array);

    } //method area

    // creating an array

    public static void printSimpleNumbers(int[] array) {
        int count = 0; // счетчик простых числе
        int i = 0;
        System.out.println("Simple numbers: ");
        while (i < array.length) {
            if (isPrime(array[i])) {
                System.out.println(array[i] + " ");
                count++;
            }
            i++;
        }
        System.out.println("Numbers of prime numbers: " + count);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Числа 1 и меньше не являются простыми
        }
        int i = 2;
        while (i < num) {  // Проверка всех делителей от 2 до num-1
            if (num % i == 0) {
                return false;  // Если число делится без остатка, оно не простое
            }
            i++;
        }
        return true;  // Если делителей нет, число простое
    }

} // end of class


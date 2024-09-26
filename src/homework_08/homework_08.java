/*
package homework_08;

// code by Olga Kharina

import java.util.Random;

public class homework_08 {
    public static void main(String[] args) {

        // Task 1 - Найдите произведение всех чисел от 1 до 15 включительно
        System.out.println(" ****************** Task 1 **********************");

        int n = 1; // Инициализация счетчика цикла
        int res = 1;

        while (n <= 15) {
            res *= n; // Перемножаю текущее значение n с предыдущим
            n++;
        }
        System.out.println("The product of the numbers from 1 to 15: " + res);

        // Task 2 - Используйте цикл while для решения задачи:
        // Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
        System.out.println(" ****************** Task 2 **********************");

        int taskNumber = 1;

        while (taskNumber <= 10) {
            System.out.println("Task" + taskNumber++);
            //  taskNumber++;
        }

        // Task 3
        //Используйте цикл while для решения задачи:
        //Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.

        // Task 3.1 * (Опционально)
        // Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.

        // Task 6
        //Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
        //Вывести на экран:
        //Минимальное значение в массиве
        //Максимальное значение в массиве
        //Среднее арифметическое всех значений в массиве

        System.out.println(" ****************** Task 6 **********************");

        Random random = new Random();

        int[] nums = new int[15];
        int k = 0;


        // заполнение массива случайными числами
        System.out.print("Massive: [");
        while (k < nums.length) {
            nums[k] = random.nextInt(-51, 51);
            System.out.print(nums[k] + ", ");
            k++;

            System.out.println(nums[k] + ((k != nums.length -1) ? ", ": "]\n"));
        }
        System.out.println("]");

        // нахождение минимального значения массива
        int min = nums[0];
        int minIndex = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i; // сохраняем индекс минимального значения
            }
            i++;
        }

        System.out.println("Minimum value in array: " + min);

        // нахождение максимального значения массива
        int max = nums[0];
        int maxIndex = 0;
      //  int i = 0;
        while (i < nums.length) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i; // сохраняем индекс максимального значения
            }
            i++;
        }
        System.out.println("Maximum value in array: " + max);

        // avg

        int sum = 0;
        i = 0;
        while (i < nums.length) {
            sum += nums[i];

            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];

            i++;


        }


        // Task 7
        // Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
        System.out.println(" ****************** Task 7 **********************");

        // Поменять местами элементы с максимальным и минимальным значениями
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[minIndex];
        nums[minIndex] = temp;

        // вывод измененного массива
        System.out.print("New massive : [");
        int j = 0;

        while (j < nums.length) {
            System.out.print(nums[j++] + "; ");
        }




        System.out.println("]");

        j++;


    } // end of main

} // end of class
*/

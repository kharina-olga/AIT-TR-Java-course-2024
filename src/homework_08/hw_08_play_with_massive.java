package homework_08;

// code by Olga Kharina

import java.util.Random;

public class hw_08_play_with_massive {
    public static void main(String[] args) {

        // Task 1 - Найдите произведение всех чисел от 1 до 15 включительно
        System.out.println(" ****************** Task 1 **********************");

        int n = 1; // Инициализация счетчика цикла
        int res = 1;

        while (n <= 15) {
            res *= n; // Перемножаю текущее значение i с предыдущим
            n++;
        }
        System.out.println("The product of the numbers from 1 to 15: " + res);

        // Task 2 - Используйте цикл while для решения задачи:
        // Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
        System.out.println(" ****************** Task 2 **********************");

        int taskNumber = 1;

        while (taskNumber <= 10) {
            System.out.println("Task" + taskNumber);
            taskNumber++;
        }

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
            nums[k] = random.nextInt(-50, 50);
            System.out.print(nums[k] + ", ");
            k++;
        }
        System.out.println("]");

        // нахождение минимального знавчения массива
        int min = nums[0];
        int minIndex = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i; // сохраняем миндекс минимального значения
            }
            i++;
        }

        System.out.println("Minimum value in array: " + min);

        // нахождение максимального значения массива
        int max = nums[0];
        int maxIndex = 0;
        int l = 0;
        while (l < nums.length) {
            if (nums[l] > max) {
                max = nums[l];
                maxIndex = l; // сохраняем индекс максимального значения
            }
            l++;
        }
        System.out.println("Maximum value in array: " + max);

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


    } // end of main

} // end of class

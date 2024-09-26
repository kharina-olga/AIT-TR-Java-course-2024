package homework_07;
// code by Olga Kharina
/*
Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
 */

import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {

    Random random = new Random();
    int v1 = random.nextInt(100);
    int v2 = random.nextInt(100);
    int v3 = random.nextInt(100);
    int v4 = random.nextInt(100);
     System.out.println(v1 + " | " + v2 + " | " + v3 + " | " + v4) ;
     System.out.println(Math.max(v1, Math.max(v2, Math.max(v3, v4))));

    }

}

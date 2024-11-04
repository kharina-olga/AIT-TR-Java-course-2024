package homework_38;
/*
Task 3 * ОПЦИОНАЛЬНО
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1]
 */

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator2 implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        /* Выражение a % 2 == 0: Это условие проверяет, является ли a четным числом.
        Если остаток от деления на 2 равен 0, то a — четное, и выражение вернет true. Если остаток не равен 0, то a — нечетное, и выражение вернет false. */
        boolean isAEven = a % 2 == 0;
        boolean isBEven = b % 2 == 0;

        /* В методе compare, который реализуется из интерфейса Comparator, мы возвращаем целое число (int), а не логическое значение (true или false).
        Это связано с тем, что метод compare должен указывать относительный порядок двух объектов, а не просто факт их равенства или различия.
        Положительное значение (1): указывает, что первый объект (a) должен идти после второго (b).
	    Отрицательное значение (-1): указывает, что первый объект (a) должен идти перед вторым (b).
	    Ноль (0): указывает, что объекты считаются равными в порядке сортировки.*/

        if (isAEven && !isBEven) return -1;
        if (!isAEven && isBEven) return 1;

        if (isAEven) return a.compareTo(b);
        return b.compareTo(a);
    }

    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Arrays.sort(integers, new MyComparator2());
        System.out.println(Arrays.toString(integers));
    }
}

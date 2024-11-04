package homework_38;
/*
Task 2 * ОПЦИОНАЛЬНО
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9]
 */

import java.util.Arrays;
import java.util.Comparator;
/*
	1. Обобщения (Generics): Comparator<T> является обобщенным интерфейсом, где <T> — это тип объекта. В данном случае мы реализуем Comparator<Integer>,
	поэтому метод должен работать с объектами Integer, а не с примитивами int. Это позволяет Comparator работать с любыми объектами, а не только с примитивными типами.
	2. Автоупаковка и распаковка (Autoboxing/Unboxing): В Java примитивные типы (например, int) автоматически преобразуются в их объектные аналоги (например, Integer) при необходимости, и наоборот.
	Благодаря автоупаковке, мы можем использовать Comparator<Integer> для массивов и списков целых чисел без необходимости вручную преобразовывать их между int и Integer.
*/

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        // Определяем четность, где 0 — четное, 1 — нечетное
        int isAEven = a % 2;
        int isBEven = b % 2;

        // Сравниваем по четности: четные числа идут раньше нечетных
        if (isAEven != isBEven) {
            return Integer.compare(isAEven, isBEven);
        }
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        // Сортируем массив с использованием MyComparator
        Arrays.sort(integers, new MyComparator());

        // Вывод отсортированного массива
        System.out.println(Arrays.toString(integers));
    }
}

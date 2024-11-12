package homework_44;
/*
Task 1
Из списка целых чисел выделите значения, которые больше 10, отсортируйте их по значению последней цифры и выведите результат на экран:
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        System.out.println("******* Task 1 ********");

        List<Integer> numbersTask1 = Arrays.asList(5, 12, 25, 32, 41, 15, 73, 99, 88);
        System.out.println("Числа больше 10, отсортированные по последней цифре: ");
        filterAndSortByLastDigit(numbersTask1);

        System.out.println("******* Task 2 ********");

        List<String> stringsTask2 = Arrays.asList("apple", "banana", "pear", "fig", "kiwi");
        String minLengthString = findMinLengthString(stringsTask2);
        System.out.println("\nСтрока с минимальной длиной: " + minLengthString);

        System.out.println("******* Task 3 ********");
        List<Integer> numbersTask3 = Arrays.asList(5, 12, 15, 20, 25, 30, 8, 10);
        List<Integer> resultTask3 = filterAndDoubleEvenNumbers(numbersTask3);
        System.out.println("\nОтфильтрованный и умноженный список: " + resultTask3);
    }

    public static void filterAndSortByLastDigit(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n > 10)                      // Оставляем числа больше 10
                .sorted((a, b) -> Integer.compare(a % 10, b % 10)) // Сортируем по последней цифре
                .forEach(System.out::println);            // Выводим результат
    }

    /*
    Task 2
Найдите строку с минимальной длиной в списке строк:
     */

    public static String findMinLengthString(List<String> strings) {
        return strings.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length())) // Находим строку с минимальной длиной
                .orElse(null); // Возвращаем результат или null, если список пуст
    }

    /*
    Task 3
Отфильтруйте список целых чисел, оставьте только четные числа, затем умножьте каждое на 2 и соберите результат в новый список:
     */
    public static List<Integer> filterAndDoubleEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)               // Оставляем только четные числа
                .peek(n -> System.out.println("Четное число: " + n)) // Промежуточный вывод
                .map(n -> n * 2)                      // Умножаем на 2
                .peek(n -> System.out.println("Умноженное число: " + n)) // Промежуточный вывод
                .collect(Collectors.toList());        // Собираем в список
    }


}

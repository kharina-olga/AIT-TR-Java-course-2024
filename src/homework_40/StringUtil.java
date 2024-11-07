package homework_40;
/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке
 */

import java.util.*;

public class StringUtil {

    public static List<String> getUniqueSortedWords(String inputString) {

        // Разбиваем строку на слова и удаляем все символы, кроме букв и пробелов
        // Преобразуем строки в массив слов
        // .split("\\s+"): Этот метод разбивает строку по пробелам. \\s+ обозначает один или более пробелов,
        // и в результате мы получаем массив words, содержащий все слова из строки без лишних символов.
        /*Регулярное выражение [^a-zA-Zа-яА-ЯёЁ\\s]:
	             a-zA-Z — соответствует латинским буквам в верхнем и нижнем регистрах.
	             а-яА-ЯёЁ — соответствует русским буквам.
	             \\s — соответствует пробелу.
	             [^ ... ] — обозначает “всё, кроме указанных символов”, так что мы удаляем все символы, кроме букв и пробелов.
         */

        String[] words = inputString.replaceAll("[^a-zA-Zа-яА-ЯёЁ\\s]", "").split(" ");

        // Используем TreeSet для хранения уникальных слов и автоматической сортировки
        Set<String> uniqueWords = new TreeSet<>(Comparator
                .comparingInt(String::length)      // Сортировка по длине слова
                .thenComparing(Comparator.naturalOrder()));  // Естественный порядок для слов одинаковой длины


        // Добавляем массив слов в набор TreeSet
        uniqueWords.addAll(Arrays.asList(words));

        // Преобразуем набор в список и возвращаем
        return new ArrayList<>(uniqueWords);
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }

}

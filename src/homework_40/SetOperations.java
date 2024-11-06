package homework_40;
/*
Task 2
Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами.
Некоторые слова должны повторяться в обоих множествах.
Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество,
содержащее все уникальные элементы из обоих множеств (объединение множеств).
Реализуйте метод intersection(Set<String> set1, Set<String> set2),
который возвращает множество, содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).
Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов,
которые есть в первом множестве, но отсутствуют во втором (разность множеств).
Результат каждого метода необходимо выводить в консоль для наглядности.
Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для наглядности результатов операций
 */

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {

        // Создаем и заполняем два множества именами
        Set<String> set1 = new HashSet<>(Set.of("Alice", "Bob", "Charlie", "David", "Eve"));
        Set<String> set2 = new HashSet<>(Set.of("Eve", "Frank", "George", "Alice", "Hannah"));

        // Выводим результаты объединения, пересечения и разности
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Difference: " + difference(set1, set2));

    }
    // Метод для объединения двух множеств
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1); // Копируем элементы из set1
        result.addAll(set2); // Добавляем элементы из set2 (дубликаты игнорируются)
        return result;
    }

    // Метод для пересечения двух множеств
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1); // Копируем элементы из set1
        result.retainAll(set2); // Оставляем только общие элементы
        return result;
    }

    // Метод для разности двух множеств
    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1); // Копируем элементы из set1
        result.removeAll(set2); // Удаляем элементы, которые есть в set2
        return result;
    }


}

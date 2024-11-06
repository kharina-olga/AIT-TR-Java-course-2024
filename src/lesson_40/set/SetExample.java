package lesson_40.set;

import java.util.*;

public class SetExample {
    /*
    Контракт между методами equals() и hashCode()
    Для корректной работы хэш- коллекций есть важное правило, состоящее из трех условий:
    1. Если два объекта равны по методу equals(), то их хэш коды тоже должны быть равны.
    2. Если хэш коды двух объектов различны, то объекты точно не равны по equals().
    Обратное не всегда верно. Разные объекты могут иметь одинаковый хэш код (коллизия).
    3. Вызов метода hashCode() должен возвращать одинаковое значение при многократном вызове на неизменяемом объекте.
     */

    public static void main(String[] args) {

        // Конструкторы
        Set<Integer> set = new HashSet<>(); // Создает пустой хэш-сет емкостью 16 коэффицент загрузки
        set = new HashSet<>(20); // Создает пустой хэш-сет указанной емкостью и коэффицент загрузки 0.75
        set = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 6, 5, 3)); // Создает сет, содержащий уникальные элементы из указанной коллекции

        System.out.println(set);

        List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
        System.out.println(startValues);

        // HashSet не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers hashSet: " + integers);

        // Сохраняет порядок добавленитя элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        // Методы интерфейса Set
        System.out.println("№1 integers.add(100): " + integers.add(100)); // true если элемент добавлен, так как не было такого значения
        System.out.println("№2 integers.add(100): " + integers.add(100)); //false элемент не добавлен, так как такое значения уже есть в сете
        System.out.println("integers.add(100):" + integers);

        System.out.println("№1 integers.remove(100): " + integers.remove(100)); // true если элемент добавлен, так как не было такого значения
        System.out.println("№2 integers.remove(100): " + integers.remove(100)); //false элемент не добавлен, так как такое значения уже есть в сете
        System.out.println("integers.remove(100):" + integers);

        System.out.println("№1 integers.contains(100): " + integers.contains(100)); // true если элемент добавлен, так как не было такого значения
        System.out.println("№2 integers.contains(100): " + integers.contains(100)); //false элемент не добавлен, так как такое значения уже есть в сете
        System.out.println("integers.contains(100):" + integers);

        /*
        int size() - кол-во элементов
        boolean isEmpty() - true, если множество элементов
        clear() - удаляет все элементы

        // iterator() - возвращает итератор для элементов set
        // Наличие итератора, позволяет перебрать все элементы циклом for each
         */


        // iterator() - возвращает итератор для элементов set
        // Наличие итератора, позволяет перебрать все элементы циклом for each
        for (Integer value : integers) {
            System.out.print(value + ", ");
        }
        System.out.println();



        // Написать метод, который принимает список (List) и возвращает список ,состоящий только из уникальных элементов начального списка
        // Убрать дубликаты
        System.out.println("startValues: " + startValues);
        List<Integer> resultList = getUniqueList(startValues);
        System.out.println("resultList: " + resultList);

        // SortedSet. Конструкторы
        // Конструктор по умолчанию. Естественный порядок
        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое, упорядоченное множество (сортировка в естественном порядке)
        sortedSet.addAll(startValues);
        System.out.println("sortedSet: " + sortedSet);

        // Конструктор с компаратором, определяющим порядок хранения элементов
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // Обратный естественному порядок сортировки
        treeSet.addAll(startValues);
        System.out.println("treeSet: " + treeSet);

        treeSet = new TreeSet<>((i1, i2) -> i2 - i1);
        treeSet = new TreeSet<>((i1, i2) -> i2.compareTo(i1));

        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);

        // first() - возвращает самый первый (левый) элемент (наименьший по мнению компаратора)

        System.out.println("sortedSet.first()" + sortedSet.first());
        System.out.println("sortedSet.first()" + treeSet.first());






    }

    public static <T> List<T> getUniqueList(List<T> list) {
        // Получить set, состоящий из уникальных элементов списка
        Set<T> set = new LinkedHashSet<>(list);
        // вернуть новый список, содержащий все элементы set-a
        return new ArrayList<>(set);
    }

}

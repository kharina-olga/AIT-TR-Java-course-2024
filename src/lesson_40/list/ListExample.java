package lesson_40.list;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        // Тип ссылки определяет две вещи
        // 1. Ссылку на объект какого типа можно сохранить в эту переменную
        // 2. Список доступных методов

        Collection<Integer> collection = new ArrayList<>();
        collection = new HashSet<>();
        collection = new PriorityQueue<>();
        Iterable<Integer> iterable = new ArrayList<>();

        // Конструкторы ArrayList
        List<Integer> list = new ArrayList<>(); // Создает список с начальной емкостью "под апотом" 10 элементов
        list = new ArrayList<>(); // Создает пустой список с указанной емкостью
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100)); // Принимает коллекцию
        // Создает спиоск, содержащий все элементы указанной колелкции (копирование элементов другой коллекции)

        // Конструкторы linkedList
        list = new LinkedList<>(); // Создает пустой список
        // list = new LinkedList<>(Set.of(1, -10, 5, 0, 25, -100)); Set.of не гарантирует порядок элементов
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100));//


        // boolean add(E e) - добавляет элемент в конец списка
        list.add(1000);
        list.add(-100);

        System.out.println("list: " + list);

        // void add(2, 100);
        list.add(2, 100);
        System.out.println(list);

        // E get(int index) - возвращает элемент по списку
        int value = list.get(5);
        System.out.println("list.get(5): " + value);

        // E remove (int index) - удаляет элемент по указанному индексу, возвращает старое значение
        System.out.println(list.remove(5));
        System.out.println(list);

        // Метод удаления по значению (из интерфейса Collection)
        list.remove(1000);


        // Поиск элементов по значению. Возвращает индекс
        // int indexOf(Object obj)
        // int lastIndexOf(Object obj)
        System.out.println("list.indexOf: " + list.indexOf(-100));
        System.out.println("list.lastIndexOf: " + list.lastIndexOf(-100));

        // void sort(Comparator<? super E> comparator - сортирует список с использованием указанного компаратора

// Реализация функционального интерфейса Comparator используя лямбда-выражение.
        // По сути более компактная форма записи реализации получения объекта анонимного класса
        list.sort((i1, i2) -> i2.compareTo(i1));



        // Реализация компаратора через анонимный класс (получение объекта анонимного класса)
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });
        System.out.println(list);

        // List<E> subList(int indexFrom, int indexTo) - возвращает список из элементов, находящихся на позиция от indexFrom до indexTo
        List<Integer> subList = list.subList(1, 5);
        System.out.println(subList);

    }


}

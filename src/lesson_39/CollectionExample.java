package lesson_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        //Это позволяет единообразно обрабатывать различные типы коллекций

        // Создаем коллекцию строк
        // Создаем ИНТЕРФЕЙС
        // ССылка типа интерфейс -> а справа мы можем подставить объект разных классов (получить разные реализации этого интерфейса)
        Collection<String> strings = new ArrayList<>();


        // СПИСОК БАЗОВЫХ МЕТОДОВ
        //int size() - возвращает кол-во элементов в коллекции
        System.out.println("кол-во элементов в коллекции strings.size(): " + strings.size());

        // boolean isEmptu() - возвращает true если коллекция пустая
        System.out.println("возвращает true если коллекция пустая  boolean isEmptu(): " + strings.isEmpty());

        // boolean add(T t) Добавляет новые элементы в коллекцию
        strings.add("Java");
        strings.add("Python");

        //Переопределенный метод toString для красивого вывода элементов
        System.out.println(strings);

        // Метод .of() - это статич метод в нескольких интерфейсах и классах. С джава 9
        // Создает изменяемый экземпляр коллекции из предоставленных
        // Доступен для List, Set, Map


        // удобный способ напихать элементов в коллекцию. Такая коллекция НЕИЗМЕНЯЕМА IMMUTABLE!
        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5);
        System.out.println("integers: " + integers);
        // integers.add(6); // попытка модифицировать неизменяемую коллекцию приведет к ошибке (исключ ситуации)

        // addAll(Collection<? extends T> col) - добавляет все элементы из указанной коллекции в текущие
        strings.addAll(List.of("Js", "Go"));

        System.out.println("********************");

        // boolean removeAll(Collection<?> col) - удаляет все элементы из коллекции (вычитание)
        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 3, 4, 5, 6));
        System.out.println("numbers: " + numbers);

        // метод удаляет элементы, совпадающие по значению
        numbers.removeAll(List.of(1, 2, 3));
        System.out.println("numbers: " + numbers);

        // boolean retainAll(Collection<?> col) - оставляетв коллекции вызовав только те элементы, которые содержаться в коллекции col
        // удаляет из коллекции вызова элементы, которые НЕ содержаться в коллекции col - (пересечение)
        // ПЕРЕСЕЧЕНИЕ МНОЖЕСТВ

        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 40, 50));
        colB.addAll(List.of(20, 30, 40));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB): " + colA);



        // boolean remove(Object obj) - удаляетэлемент из коллекции. Возвращет true, если такой элемент был
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colB.remove(40): " + colA.remove(40));
        System.out.println("colA: " + colA);

        // Все конструкторы принимают другую коллекцию
        // Создается коллекция, содержащая все элементы из указанной коллекции
        Collection<String> strings1 = new ArrayList<>(List.of("Test1","Test2", "Test3"));
        strings1.add("Test4");
        System.out.println("strings1: " + strings1);


    }
}

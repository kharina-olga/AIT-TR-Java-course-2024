package homework_25;

public class MagicArrayMain {
    public static void main(String[] args) {
        // Создаем параметризованный массив с типом Integer
        MagicArrayGeneric<Integer> intArray = new MagicArrayGeneric<>();
        intArray.add(10);
        intArray.add(20);
        intArray.add(30);
        System.out.println("Integer Array: " + intArray.toString());
        System.out.println("Size: " + intArray.size());

        // Удаление по значению и индексу
        intArray.remove(1); // удаляем элемент с индексом 1
        System.out.println("After removal (by index): " + intArray.toString());

        intArray.removeByValue(30); // удаляем элемент по значению
        System.out.println("After removal (by value): " + intArray.toString());

        // Добавляем несколько элементов сразу
        intArray.addAll(40, 50, 60);
        System.out.println("After adding multiple elements: " + intArray.toString());

        // Создаем параметризованный массив с типом String
        MagicArrayGeneric<String> stringArray = new MagicArrayGeneric<>();
        stringArray.add("Hello");
        stringArray.add("World");
        System.out.println("String Array: " + stringArray.toString());

        // Удаление строки по значению
        stringArray.removeByValue("World");
        System.out.println("After removing 'World': " + stringArray.toString());

        // Получение элемента по индексу
        System.out.println("Element at index 0: " + stringArray.get(0));
    }
}

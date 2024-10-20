package homework_26;

public class PairMain {
    public static void main(String[] args) {
        // Создаем пару строк
        Pair<String> pair = new Pair<>("Hello", "World");

        // Выводим первый и второй элементы
        System.out.println("First: " + pair.getFirst());   // Вывод: Hello
        System.out.println("Second: " + pair.getSecond()); // Вывод: World

        // Меняем местами элементы
        pair.swap();

        // Выводим первый и второй элементы после swap
        System.out.println("First: " + pair.getFirst());   // Вывод: World
        System.out.println("Second: " + pair.getSecond()); // Вывод: Hello

        // Устанавливаем новые значения
        pair.setFirst("Goodbye");
        pair.setSecond("Everyone");

        // Выводим обновленные элементы
        System.out.println("First: " + pair.getFirst());   // Вывод: Goodbye
        System.out.println("Second: " + pair.getSecond()); // Вывод: Everyone
    }
}

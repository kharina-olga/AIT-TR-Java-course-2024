package lesson_25;

public class GenericApp {
    public static void main(String[] args) {
        GenericBox<String> StringBox = new GenericBox<>("Hello");

        // Ошибка на этапе компиляции
      //  GenericBox<String> StringBox2 = new GenericBox<>(25);


    }
}

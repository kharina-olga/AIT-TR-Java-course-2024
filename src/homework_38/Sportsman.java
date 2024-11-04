package homework_38;
/*
Task 1
Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).
Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.
Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.
В методе main создайте массив из нескольких объектов Sportsman.
Отсортируйте его с использованием:
естественного порядка, определенного в Comparable,
данного класса Comparator,
анонимного класса Comparator для сортировки по третьему полю (например, age).
Выведите каждый вариант отсортированного массива в консоль.
 */

public class Sportsman implements Comparable<Sportsman> {
    private String firstName;
    private String lastName;
    private int age;
    private double score;

    public Sportsman(String firstName, String lastName, int age, double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        // ANSI-коды для цветов
        String reset = "\u001B[0m";
        String headerColor = "\u001B[34m";  // Синий для заголовка
        String rowColor = "\u001B[32m";     // Зеленый для строк

        // Заголовок таблицы с цветом

        // Строка таблицы с цветом
        String row = String.format(
                "%s| %-10s %-10s | %-3d | %-5.1f |%s",
                rowColor, firstName, lastName, age, score, reset
        );

        // Возвращаем заголовок + строку
        return row;
    }

    // Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.
    @Override
    public int compareTo(Sportsman sportsman1) {
        return this.firstName.compareTo(sportsman1.firstName);
    }

    // Метод для вывода заголовка один раз перед выводом списка
    public static void printTableHeader() {
        // ANSI-коды для цвета заголовка
        String reset = "\u001B[0m";
        String headerColor = "\u001B[34m";  // Синий для заголовка

        // Заголовок таблицы с цветом
        System.out.printf(
                "%s+----------------------+-----+-------+\n" +
                        "| Name                 | Age | Score |\n" +
                        "+----------------------+-----+-------+%s\n", headerColor, reset
        );

    }
}

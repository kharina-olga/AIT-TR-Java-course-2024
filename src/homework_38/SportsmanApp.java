package homework_38;

import java.util.Arrays;

import static homework_38.Sportsman.printTableHeader;

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmen = {
                new Sportsman("Alexei", "Ivanov", 24, 89.5),
                new Sportsman("Maria", "Petrova", 29, 92.3),
                new Sportsman("Sergey", "Kuznetsov", 31, 85.1),
                new Sportsman("Anna", "Sokolova", 27, 88.7),
                new Sportsman("Igor", "Smirnov", 22, 90.4)
        };


        // Task 1.1 интерфейс Comparable
        System.out.println("**** Task 1.1 интерфейс Comparable ****");
        System.out.println("******** сортировка по имени  ********");
        // Сортировка массива по имени и фамилии
        Arrays.sort(sportsmen);
        // Печатаем заголовок один раз
        printTableHeader();
        // Вывод информации о каждом спортсмене после сортировки
        for (Sportsman sportsman : sportsmen) {
            System.out.println(sportsman);
        }


        // Task 1.2 интерфейс Comparator
        System.out.println("**** Task 1.2 интерфейс Comparator ****");
        System.out.println("******** сортировка по баллам  ********");
        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();
        Arrays.sort(sportsmen, sportsmanScoreComparator);
        printTableHeader();
        for (Sportsman sportsman : sportsmen) {
            System.out.println(sportsman);
        }

        // Task 1.2 анонимный класс Comparator для сортировки по третьему полю (например, age).
        System.out.println("**** Task 1.3 анонимный класс ****");
        System.out.println("******** сортировка по возрасту  ********");
        Arrays.sort(sportsmen, (sportsmen1, sportsmen2) -> sportsmen1.getAge() - sportsmen2.getAge());
        printTableHeader();
        for (Sportsman sportsman : sportsmen) {
            System.out.println(sportsman);
        }


    }
}

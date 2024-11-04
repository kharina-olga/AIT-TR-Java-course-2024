package lesson_38;

import java.util.Arrays;
import java.util.Comparator;

// внешний отдельный класс, в отличии от Comparable
public class ComparatorApp {

    public static void main(String[] args) {

        int[] numbers = {9, 5, 1, 2, 3, 0, 4};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"Abb", "Ccccc", "apple", "Zebra"};
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));


        CarComparable[] cars = new CarComparable[5];
        cars[0] = new CarComparable("Alfa", 2021, 120);
        cars[1] = new CarComparable("BMW", 2000, 190);
        cars[2] = new CarComparable("Citroen", 2020, 190);
        cars[3] = new CarComparable("VW", 2020, 250);
        cars[4] = new CarComparable("Ferrari", 2024, 300);

        System.out.println(Arrays.toString(cars));


        System.out.println("Сортировка по году выпуска:");

        System.out.println(Arrays.toString(cars));


        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Arrays.sort(cars, carSpeedComparator);
        System.out.println("Сортировка по скорости:");
        System.out.println(Arrays.toString(cars));

        CarModelComparator carModelComparator = new CarModelComparator();
        System.out.println("Сортировка по модели:");
        Arrays.sort(cars, carModelComparator);
        System.out.println(Arrays.toString(cars));

        System.out.println("Сортировка по анонимному классу:");
        Arrays.sort(cars, new Comparator<CarComparable>() {
            /* тут будет создан объект анонимного класса (не имеющего имени)
            возвращают одноразовый объект
            */
            @Override
            public int compare(CarComparable car1, CarComparable car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });
        System.out.println(Arrays.toString(cars));

        /* Сортировка по году в порядке возрастания, если год совпадает, то по модели в порядке убывания
         */
        System.out.println("Сортировка по году, а затем по модели:");
        Arrays.sort(cars, new Comparator<CarComparable>() {
            @Override
            public int compare(CarComparable c1, CarComparable c2) {
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare == 0) {
                    // год один и тот же
                    return c2.getModel().compareTo(c1.getModel());
                } else {
                    return yearCompare;
                }
            }
        });
        System.out.println(Arrays.toString(cars));

        // Функц интерфейс - интерфейс который имеет ровно один абстрактный метод

        // Лямбда-выражения - способ краткой записи анонимных функций. Используется исключительно
        // для реализации фцнкциональных интерфейсов
        // (параметр) -> { тело выражения }
        // Когда реализация состоит из одного выражения, фигурные скобки не требуются
        // Ключевое слово return не используется. Результат автоматически возвращается

        System.out.println("Сортировка по году скорости через лямбда-выражение:");
        Arrays.sort(cars, (car1, car2) -> car1.getSpeed() - car2.getSpeed());
        System.out.println(Arrays.toString(cars));

        // Когда появляется блок {}, необходимо использовать return
        Arrays.sort(cars, (car1, car2) -> {
            return car1.getSpeed() - car2.getSpeed();
        });
        System.out.println("Сортировка по году выпуска и модели через лямбда-выражение:");
        Arrays.sort(cars, (c1, c2) -> {
            int yearCompare = c1.getYear() - c2.getYear();
            if (yearCompare == 0) {
                // год один и тот же
                return c2.getModel().compareTo(c1.getModel());
            } else {
                return yearCompare;
            }

        });


        // Компаратор с использованием лямбда-выражением
        // Отсортировать машины по году выпуска в порядке возрастания
        // Если год совпадает - такие машины сортировать по скорости в порядке возрастания

        System.out.println("Сортировка по году выпуска и скорости через лямбда-выражение и анонимный класс:");
        Arrays.sort(cars, (c1, c2) -> {
            int yearCompare = c1.getYear() - c2.getYear();
            if (yearCompare == 0) {
                // год один и тот же
                return c1.getSpeed() - c2.getSpeed();
            } else {
                return yearCompare;
            }

        });
        System.out.println(Arrays.toString(cars));

// реализация через отдельный объект компаратор, можно использовать в других местах
        System.out.println("Сортировка по году выпуска и скорости через лямбда-выражение и отдельный объект компаратор:");
        Comparator<CarComparable> comparator = (c1, c2) -> {
            int yearCompare = Integer.compare(c1.getYear(), c2.getYear());

            if (yearCompare == 0) {
                return Integer.compare(c1.getSpeed(), c2.getSpeed());
            }
            return yearCompare;
        };
        Arrays.sort(cars, comparator);
        System.out.println(Arrays.toString(cars));

        // Реализовать компаратор с использованием лямбда
        // для сортировки машин по году выпуска в обратном порядке
        // Если не получается - в прямом порядке по году выпуска

        /*
        v1 = 200, v2 = 100
        Машина с большей скоростью считалась "меньшей"
        (v1, v2) -> Если v1 считается меньше чем v2 - метод должен вернуть отрицательное значение
        v1 - v2 -> если скорость v1 меньше чем v2 - результат будет отрицательный,
        т.е. v1 будет признана меньше, чем v2
        v2 - v1 -> если скорость v1 меньше чем v2 -> результат будет положительный,
        т.е. v1 будет признана больше (т.к. результат положительный) v2

        (v1, v2) -> сравниваем
        v1 - v2 -> если v1 больше v2 -> результат положительный,
        т.е.  v1 будет признан большим, чем v2
        v2 - v1 -> если v1 больше чем v2 -> результат отрицательный,
        т.е. v2 признается большим

         */
        /*
       Сравнение по скорости. car1 vs car2
       1. Если мы хотим прямой порядок сортировки -> от меньшего к большему
       car1.getSpeed - car2
       car1.getYear - car2
       2. Порядок сортировки по убыванию
       car2.getSpeed - car1.getSpeed
       car2.getYear - car1.getYear
         */

        System.out.println("Сортировка по году выпуска в обратном порядке через лямбда-выражение и отдельный объект компаратор:");
        Comparator<CarComparable> comparator1 = (c1, c2) -> {
            int yearCompare = c2.getYear() - c1.getYear();
            return yearCompare;
        };
        Arrays.sort(cars, comparator1);
        System.out.println(Arrays.toString(cars));

Arrays.sort(cars, (car1, car2) -> car1.getYear() - car2.getYear());
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());
        System.out.println(Arrays.toString(cars));

        // Todo Comparator - статические методы - покажу на консультации

        Arrays.sort(cars, Comparator.comparing(CarComparable::getYear));
        // Две альтернативы поменять порядок
        Arrays.sort(cars, Comparator.comparing(CarComparable::getModel).reversed());
        Arrays.sort(cars, Comparator.comparing(CarComparable::getModel, Comparator.reverseOrder()));
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(CarComparable::getYear).thenComparing(CarComparable::getModel));

        System.out.println(Arrays.toString(cars));


    }
}

package lesson_38;

import java.util.Comparator;

public class CarModelComparator implements Comparator <CarComparable> {

/*
String, Integer и все оберточные классы реализуют интерфейс Comparable
это значит, что объекты этих классов можно сравнивать между собой "из коробки"
они имеют встроенные методы
 */
    @Override
    public int compare(CarComparable car1, CarComparable car2) {
        String model1 = car1.getModel();
        String model2 = car2.getModel();
        //car1.getModel().compareTo(car2.getModel());
        return model1.compareTo(model2);

        // String реализует по умолчанию лексикографическое сравнение строк
    }
}

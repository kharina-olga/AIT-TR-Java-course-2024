package lesson_38;

import java.util.Comparator;
// внешний инструмент

public class CarSpeedComparator implements Comparator<CarComparable> {


    // принимает на вход два объекта и вычитает один из другого для сравнения
    @Override
    public int compare(CarComparable car1, CarComparable car2) {

        // от меньшего к большему
        return car1.getSpeed() - car2.getSpeed();

        // от большего к меньшему
        //return car2.getSpeed() - car1.getSpeed();

        /*
        car1 vs car2 -> (car1 - car2)
        car1 < car2 -> negative value
        car1 > car2 -> positive value
        car1 == car2 -> 0
         */
    }
}

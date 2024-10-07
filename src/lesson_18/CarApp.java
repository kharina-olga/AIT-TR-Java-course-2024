package lesson_18;

public class CarApp {

    public static void main(String[] args) {

        Car car = new Car("BMW", 200);
        System.out.println(car.toString());

        Car car2 = new Car("VW", 300);
        System.out.println(car2.toString());

        Car car3 = new Car("Mercedes", 500);
        System.out.println(car3.toString());

        System.out.println("Static war: " + Car.totalCarProduced);

    }
}

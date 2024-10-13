package homework_22.Transport;

public class Car extends Vehicle {

    // Переопределение родительского метода

    @Override
    public void startEngine() {
        System.out.println("Car's engine is started.");
    }
}

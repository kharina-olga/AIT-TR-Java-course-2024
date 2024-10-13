package homework_22.transport;

public class Motorcycle extends Vehicle {

    // Переопределение родительского метода
    @Override
    public void startEngine() {
        System.out.println("Motorcycle's engine is started.");
    }
}

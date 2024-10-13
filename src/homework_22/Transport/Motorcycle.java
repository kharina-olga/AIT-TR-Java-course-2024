package homework_22.Transport;

public class Motorcycle extends Vehicle {

    // Переопределение родительского метода
    @Override
    public void startEngine() {
        System.out.println("Motorcycle's engine is started.");
    }
}

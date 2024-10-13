package homework_22.transport;

public class Bicycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Bicycles don't have engines.");
    }
}

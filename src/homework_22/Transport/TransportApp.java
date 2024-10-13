package homework_22.Transport;

public class TransportApp {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3]; // Создаем массив для 3 объектов типа Vehicle
        vehicles[0] = new Car();        // Присваиваем объект Car
        vehicles[1] = new Bicycle();    // Присваиваем объект Bicycle
        vehicles[2] = new Motorcycle(); // Присваиваем объект Motorcycle

        // Вызов метода startEngine() для каждого транспортного средства
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}

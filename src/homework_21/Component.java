package homework_21;

/*
Task 2
Компьютер и компоненты
Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношения между Computer и компонентами.
Компоненты Processor и Memory не могу существовать без компьютера.
*/
public class Component {

    private String brand;
    private String model;

    public void displayInfo() {
        System.out.println("Brand: " + brand + "\nModel: " + model);
    }

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        // Создаем компоненты для компьютера
        Processor processor = new Processor("Intel", "i7", 3.8);
        Memory memory = new Memory("Corsair", "Vengeance", 16);
        Storage storage = new Storage("Samsung", "EVO 860", 512);

        // Создаем компьютер с этими компонентами
        Computer computer = new Computer(processor, memory, storage);

        // Выводим информацию о компьютере
        computer.displayInfo();
    }

}

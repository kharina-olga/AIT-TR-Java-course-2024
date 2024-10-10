package homework_21;

// Класс Computer, содержащий компоненты
public class Computer {

    private Processor processor;  // Композиция: процессор не может существовать без компьютера
    private Memory memory;   // Композиция: память не может существовать без компьютера
    private Storage storage;  // Агрегация: накопитель может существовать отдельно, но является частью компьютера

    // Конструктор компьютера с обязательными компонентами процессора, памяти и накопителя
    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    // Метод для вывода информации о компьютере и его компонентах
    public void displayInfo() {
        System.out.println("Computer components:");
        System.out.println("Processor: " + processor.getBrand() + " " + processor.getModel() + " - " + processor.getSpeed() + " GHz");
        System.out.println("Memory: " + memory.getBrand() + " " + memory.getModel() + " - " + memory.getCapacity() + " GB");
        System.out.println("Storage: " + storage.getBrand() + " " + storage.getModel() + " - " + storage.getSize() + " GB");
    }

    // Геттеры для компонентов, если нужно
    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }
}

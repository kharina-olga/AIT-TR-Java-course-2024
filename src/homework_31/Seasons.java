package homework_31;

public enum Seasons {
    SPRING(15),
    SUMMER(25),
    FALL(10),
    WINTER(-5);

    private final int averageTemperature;

    // Конструктор для установки средней температуры
    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // Метод для получения средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }



}

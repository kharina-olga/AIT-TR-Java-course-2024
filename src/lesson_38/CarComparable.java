package lesson_38;

// указыввем типизированный интерфейс чтобы реализовать метод compareTo
// встроенный интерфейс для сравнения объектов класса
// определяет естественный порядок сортировки через переопределение метода compareTo
// сортировка по умолчанию

public class CarComparable implements Comparable<CarComparable>{

    private String model;
    private int year;
    private int speed;

    public CarComparable(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    // Сравнение машин по году выпуска. "Меньшей" будет считаться машина с меньшим (болеее ранним) годом выпуска.
    @Override
    public int compareTo(CarComparable car1) {
        return this.year - car1.year;

        /*
        a vs b -> (a -b)
        a < b -> negative value
        a > b -> positive value
        a == b -> 0
         */
    }
}

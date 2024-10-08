package lesson_18;

public class Car {

    public static  int totalCarProduced;   // переменная, считать сколько всего машин было создано  в этом коде

    private String model;
    private int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        totalCarProduced ++;   // счетчик, который будет работать каждый раз, при сздании машины. Увелитчиваем общее кол-во авто
    }

    public String toString() {
        return String.format("Auto - model: %s, power: %d. Всего выпущено машин: %d", model, powerPS, totalCarProduced);
    }

    public int getPowerPS() {
        return powerPS;
    }

    public void setPowerPS(int powerPS) {
        this.powerPS = powerPS;
    }
}



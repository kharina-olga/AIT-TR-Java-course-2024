package homework_31;

public class SeasonsMain {
    public static void main(String[] args) {
        // Перебор всех сезонов и вывод средней температуры
        for (Seasons seasons : Seasons.values()) {
            System.out.printf("The average temperature in %s is %d°C\n", seasons, seasons.getAverageTemperature());
        }
    }

}

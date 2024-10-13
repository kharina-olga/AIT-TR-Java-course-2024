package homework_22.jogger;

/* Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам

 */
public class Human {
    String name;
    int speed;
    int timeToRest;

    public void info() {
        System.out.println("I am a " + name);
        System.out.println("I run with speed " + speed + " km/h");
        displayTimeToRest();
    }

    public void displayTimeToRest() {
        System.out.println("I need to rest " + timeToRest + " minutes");
    }

    public void rest() {
        System.out.println("I am resting now.");
        timeToRest++;
    }


    public void run() {

        while (timeToRest < 15) {
            System.out.println("I am tired.");
            displayTimeToRest();

            rest();
        }

        System.out.println("I am jogging!");
        timeToRest -= 5;
        displayTimeToRest();
        System.out.println("************************************* \n");

    }

    public Human(String name, int speed, int timeToRest) {
        this.name = name;
        this.speed = speed;
        this.timeToRest = timeToRest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTimeToRest() {
        return timeToRest;
    }

    public void setTimeToRest(int timeToRest) {
        this.timeToRest = timeToRest;
    }
}


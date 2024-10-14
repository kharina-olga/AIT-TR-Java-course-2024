package homework_22.jogger;

/* Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
 */

public class Pro extends Human {

    public Pro() {
        setName("Pro");
        setSpeed(25);
        setTimeToRest(5);
    }

    @Override
    public void run() {
        while (timeToRest < 5) {
            System.out.println("I am tired.");
            displayTimeToRest();

            rest();
        }

        System.out.println("I am jogging!");
        timeToRest -= 5;
        displayTimeToRest();
        System.out.println("************************************* \n");
    }
}

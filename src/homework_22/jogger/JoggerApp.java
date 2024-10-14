package homework_22.jogger;

/* Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
 */

public class JoggerApp {

    public static void main(String[] args) {

        Human human = new Human("Human", 15, 15);
        Amateur amateur = new Amateur("Amateur", 15, 10);
    //    Pro pro = new Pro("Pro", 25, 5);

        human.info();
        human.run();
        human.run();

        amateur.info();
        amateur.run();

     //   pro.info();
     //   pro.run();
//

    }
}



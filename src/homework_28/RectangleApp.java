package homework_28;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println(rect1.equals(rect2)); // Вывод: true
        System.out.println(rect1.equals(rect3)); // Вывод: false
    }

}

package homework_20;

public class GeometricShapesApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Rectangle", 6, 9);

      //  System.out.println(rectangle.displayInfo());
        System.out.println(rectangle.calculateArea());


        Circle circle = new Circle("Circle", 5);

      //  System.out.println(circle.displayInfo());
        System.out.println(circle.calculateArea());

    }
}

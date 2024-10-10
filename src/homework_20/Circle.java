package homework_20;

public class Circle extends GeometricShapes {

    // declaring of the constant number Pi
    public static final double PI = 3.14159265;

    private double radius;

    public Circle(String shape, double radius) {
        super(shape);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = radius * radius * PI;
        System.out.println("The area of the circle is " + area );
        return area;
    }
}

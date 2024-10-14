package homework_23;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Вычисление площади круга
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    // Вычисление периметра окружности
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

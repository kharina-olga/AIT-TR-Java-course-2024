package homework_23;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Вычисление площади прямоугольника
    @Override
    double calculateArea() {
        return width * height;
    }

    // Вычисление периметра прямоугольника
    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

package homework_20;

public class Rectangle extends GeometricShapes {

    private double width;
    private double height;

    public Rectangle(String shape, double width, double height) {
        super(shape);
        this.width = width;
        this.height = height;
    }

    // Method to set the dimensions of the rectangle
    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
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
}

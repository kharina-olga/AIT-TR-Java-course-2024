package homework_20;

public class GeometricShapes {

    private String shape;
    private String color;

    public void displayInfo(){

        System.out.println(shape);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public GeometricShapes(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

}

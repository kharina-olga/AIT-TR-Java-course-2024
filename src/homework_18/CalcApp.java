package homework_18;

public class CalcApp {

    public static void main(String[] args) {

        System.out.println("Addition: " + Calculator.add(10, 5));
        System.out.println("Subtraction: " + Calculator.subtract(10, 5));
        System.out.println("Multiplication: " + Calculator.multiply(10, 5));
        System.out.println("Division: " + Calculator.divide(10, 3));
        System.out.println("Length of circle: " + Calculator.circleLength(10));
        System.out.println("Area of circle: " + Calculator.circleAreaOnRadius(10));
    }

}

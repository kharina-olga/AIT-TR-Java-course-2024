package homework_18;

public class CalcApp {
    public static void main(String[] args) {

        System.out.println("Addition: " + Calculator.add(10, 5));
        System.out.println("Subtraction: " + Calculator.subtract(10, 5));
        System.out.println("Multiplication: " + Calculator.multiply(10, 5));
        System.out.println("Division: " + Calculator.divide(10, 0));
    }

}

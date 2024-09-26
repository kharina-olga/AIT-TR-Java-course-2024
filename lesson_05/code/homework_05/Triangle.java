package homework_05;

public class Triangle {
    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 3;

        // calling a method
        boolean res = isTriangle(a, b, c);
        System.out.println("Triangle with sides " + a + ", " + b + ", " + c + " is " + res);
    }
    // method
    public static boolean isTriangle(int a, int b, int c) {

        return (a <= b + c) & (b <= a + c) & (c <= b + a);
    }
}

package methods;

public class testMethod {

    public static void main(String[] args) {
        method1();

    } // end of main

    public static void method1() {
        System.out.println("*** method1 has started ***");
        System.out.println("method1 finished");
        method2();

    }

    public static void method2() {
        System.out.println("*** method2 has started ***");
        System.out.println("*** method2 finished ***");
        method3();

    }

    public static void method3() {
        System.out.println("*** method3 has started ***");
        System.out.println("*** method3 finished ***");

    }
} // end of class
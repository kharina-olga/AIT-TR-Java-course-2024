package lesson_09;

public class MethodsExample {

    public static void main(String[] args) {

        sayHello();
        sayHello();
        sayHello();

        String string = "Java";

     //   System.out.println(string);

        saySomething("Java");
        char ch = 'A';
        char anotherChar = 'B';

        printDecimalChar(anotherChar);
        printDecimalChar(ch);
        printDecimalChar('J');
        //
        printNumbers(10);
        printNumbers(10, 20);



    } // end of main

    // method area
    public static void printNumbers(int x, int y) {
        int i = x;
        while (i <= y) {
            System.out.print(i++ + ", ");
        }
        System.out.println();
    }
    public static void printNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i++ + ", ");
        }
        System.out.println();
    }



    public static void printArray(int[] array) {
        System.out.print("[");
        int i = 0;


    }

    public static void  printDecimalChar( char ch1){
        System.out.println((int) ch1);
    }

    public static void saySomething(String text){
        System.out.println(text);

    }

    public static void sayHello() {
        // body method
        System.out.println("Hello!");
    }

} // end of class

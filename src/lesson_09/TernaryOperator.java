package lesson_09;

public class TernaryOperator {

    public static void main(String[] args) {

        int x = 2;

        String result;

        if (x >= 0) {
            result = "positive";
        } else {
            result = "negative";
        }
        System.out.println("1: Number " + result);

        // ternary operator

        System.out.println("2: Number " + ((x>= 0) ? "positive" : "negative"));

        String res1 = (x >= 0) ? "positive" : "negative";
        System.out.println("3: Number " + res1);



    } // end of main

}

package OldPackages.lesson_05.code.classwork_05;
//  Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.

public class Division {
    public static void main(String[] args) {

        int a = 45;
        int b = 10;

        boolean res = isDivided(a, b);
        System.out.println("a = " + a + " and b = " + b + " is divided: " + res);

    } // end of main

    public static boolean isDivided(int a, int b){

        return a % b == 0; // проверяем есть ли остаток от деления и равен ли он нулю
    }


} // end of class

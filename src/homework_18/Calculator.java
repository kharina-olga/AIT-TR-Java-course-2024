package homework_18;
// Task 1 - HW 18
//Класс "Калькулятор"
//Создайте класс Calculator, который будет предоставлять
//базовые арифметические операции: сложение, вычитание, умножение и деление
//Класс должен содержать:
//Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
// Task 1- HW 19
// - базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
//- Вычисление длины окружности и площади круга по ее радиусу
//Класс должен содержать:
//- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
//- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
//- Константу (число Пи)


public class Calculator {

    // declaring of the constant number Pi
    public static final double PI = 3.14159265;

    public static  int add(int a, int b) {
        return a + b;
    }

    // overloading a method to get the sum of multiple numbers
    public static int add(int a, int... ints) {
        int sum = a;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return a / b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double substract(double a, double b) {
        return  a - b;
    }

    public static double multiplay(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }

    // A method for calculating the circumference of a circle based on its radius.
    public static double circleLength(double r) {
        return 2 * PI * r;
    }

    // A method for calculating the area of a circle based on its radius;
    public static double circleAreaOnRadius(double r) {
        return r * r * PI;
        }



}

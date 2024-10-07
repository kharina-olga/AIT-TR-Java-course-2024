package homework_18;
// Task 1
//Класс "Калькулятор"
//Создайте класс Calculator, который будет предоставлять
//базовые арифметические операции: сложение, вычитание, умножение и деление
//Класс должен содержать:
//Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.

public class Calculator {

    public static  int add(int a, int b) {
        return a + b;
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



}

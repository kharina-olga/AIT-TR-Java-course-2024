package homework_07;

import java.util.Random;
import java.util.Scanner;

/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */
public class Task_03 {

    public static void main(String[] args) {
        // offering a user to input a number and taking data to the variable
        /*
       Scanner input = new Scanner(System.in);
        System.out.println("Please input four-digit number to find out if it is lucky: ");
        String number = input.nextLine();


        // some code to test the task
       /* Random random = new Random();
        int number = random.nextInt(1000, 9999);
        System.out.println("number: " + number ); */

        String string = "1234";
        int number = Integer.parseInt(string);
        System.out.println(number);


    } // end of main




} // end of Class

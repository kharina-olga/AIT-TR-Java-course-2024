package classwork_07.cycles;

// Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        // 5 467
        //  ----------------
        // 5 467 % 10 = 7 - это первая справа цифра
        // 5 467 / 10 = 546
        // продолжим в цикле делать / 10 пока результат > 0 .0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        int number1 = number;

        int count = 0;

        while(number > 0) {

            number = number / 10; // number - это параметр цикла
            System.out.println(number);
            count++;

        }
        System.out.println("Digits in number " + number + " are = " + count);
    }
}

package classwork_05;
// Проверка положительное или отрицательное число.
// Проверка четное или нечетное целое число.
// Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
// прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".

public class ConditionsEx {

    public static void main(String[] args) {
        // неполный условный оператор
        int x = -158;
// checking if a number positive or negative
        if( x > 0 ){
            System.out.println("x = " + x + " is a positive number");
        }
        if ( x < 0 ) {
            System.out.println("x = " + x + " is a negative number");
        }

        // полный условный оператор
 x = 234;   // переопределение значения переменный
        if(x > 0){
            System.out.println("x = " + x + " is a positive number");
        } else {
            System.out.println("x = " + x + " is a negative number");
        }

// проверяем четное ли число с помощью остатка от деления
        x = 12;
        if ( x % 2 == 0) {
            System.out.println("x= " + x + " is even");
        } else {
            System.out.println("x= " + x + " is odd");
        }

        int age = 6;
        if( age >= 18 ){
            System.out.println("Вам разрешено действовать самостоятельно");

        } else {
            System.out.println("Вам надо прийти вместе с вашим опекуном");
        }





    } // end of main






}

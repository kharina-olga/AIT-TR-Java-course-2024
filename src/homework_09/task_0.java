package homework_09;

import java.util.Scanner;


//Task 0

//Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)

public class task_0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("To count characters in a string, please input your string and press enter: ");
        String inputString = scanner.nextLine();
        countChars(inputString);

    } // method area

    public static void countChars(String str){
        System.out.println(str.length());
    }

} // end of class
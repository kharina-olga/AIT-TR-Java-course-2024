package lesson_20;

import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java " + "is" + " " + "the" + " " + "best";

        /*
        StringBuilder - это класс в Java,
        предназначенный для эффективного создания и модификации изменяемых посмледовательностей символов
        */
        // Констукртор перегружен. Может быть пустым, может принимать String
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb1 = new StringBuilder(str);

        // Метод для добавления в конец строки (приклеить справа) / аналог конкатеннации
        sb.append(" ").append("Java");

        // Получить строковое предстваление
        String string = sb.toString();
        System.out.println(string);

        // Вставить в указанную позицию символы
        StringBuilder sb2 = new StringBuilder("Hello World");

        // beautiful вставить в строку перед 6 символом
        sb2.insert(6, "beautiful ");
        System.out.println(sb2);

        // Заменить подстроку (определяется индексами) на указанное значение
        //  последовательность с 6 по 10 символы заменена
        StringBuilder sb3 = new StringBuilder("Hello World!");
        sb3.replace(6, 11, "Java");
        System.out.println(sb3);


        // удалить пордстроку в диапозоне от  start до end
        StringBuilder sb4 = new StringBuilder("hello world!");
        sb4.delete(5, 11);
        System.out.println(sb4);


        // Реверс строки
        StringBuilder sb5 = new StringBuilder("hello world!");
        sb5.reverse();
        System.out.println(sb5);

        // Количество символов - длина
        System.out.println("sb.5length(): " + sb5.length());

        //получить символ по индексу
        char ch = sb5.charAt(3);
        System.out.println(ch);

        //получить подстроку указанного индекса символа
        sb = new StringBuilder("Hekko World");
        String subString = sb.substring(3); // от индекса до конца строки
        System.out.println("sb.substring(3): " + subString);

        subString = sb.substring(6, 9); // от end до start не включительно
        System.out.println("sb.substring(6, 9): " + subString);

        // изменить размер последовательности символов
        sb = new StringBuilder("Hello!");
        sb.setLength(10);
        System.out.println(" sb.length()10: " + sb);

        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8): " + sb);


        String result = phraseString();
        System.out.println("Аббревиатура: " + result);

        // Потоко-безопасный брат StringBuilder
        StringBuffer stringBuffer = new StringBuffer();

    }

        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанных в верхнем регистре)
         */

    public static String phraseString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов");

        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        // String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // result = result + word.charAt(0);
            sb.append(word.charAt(0));
        }

        // System.out.println("Результирующая строка: " + result.toUpperCase());

        return sb.toString().toUpperCase();
    }


}

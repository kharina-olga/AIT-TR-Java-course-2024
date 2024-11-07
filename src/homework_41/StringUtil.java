package homework_41;
/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class StringUtil {

    // метод, который принимает строку текста и возвращает Map<String, Integer>
    public static Map<String, Integer> getWordFreuquency(String inputString) {

        Map<String, Integer> freuquencyWordsMap = new HashMap<>();

        String[] words = inputString.toLowerCase().replaceAll("[^a-zA-Zа-яА-ЯёЁ\\s]", "").split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                freuquencyWordsMap.put(word, freuquencyWordsMap.getOrDefault(word, 0) + 1);
            }
        }
        return freuquencyWordsMap;
    }

    // Метод, который принимает строку и возвращает Map с частотой каждого символа
    public static Map<Character, Integer> getCharFrequency (String inputString) {
        Map<Character, Integer> frequencyCharsMap = new HashMap<>();

        for (char ch : inputString.toCharArray()) {
            if (ch != ' ') { // игнорируем пробелы
                frequencyCharsMap.put(ch, frequencyCharsMap.getOrDefault(ch, 0) + 1);
            }
        }
        return  frequencyCharsMap;


    }

    public static void main(String[] args) {

        System.out.println("***** Task 1 *****");


        String inputString = "Java is a versatile programming language. Java developers use Java to build scalable applications.";
        System.out.println("Let's count word frequency in text: \n" + inputString);
        Map<String, Integer> frequencyWordsMap = getWordFreuquency(inputString);
        System.out.println("Here is result: \n" + frequencyWordsMap);

        System.out.println("***** Task 2 *****");

        System.out.println("Let's count characters frequency in text: \n" + inputString);
        Map<Character, Integer> frequencyCharsMap = getCharFrequency(inputString);
        System.out.println("Here is result: \n" + frequencyCharsMap);



    }


}

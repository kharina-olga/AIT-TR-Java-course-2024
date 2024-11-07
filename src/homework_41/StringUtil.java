package homework_41;
/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class StringUtil {

    // метод, который принимает строку текста и возвращает Map<String, Integer>
    public static Map<String, Integer> getWordFreuquency(String inputString) {

        Map<String, Integer> freuquencyMap = new HashMap<>();

        String[] words = inputString.toLowerCase().replaceAll("[^a-zA-Zа-яА-ЯёЁ\\s]", "").split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                freuquencyMap.put(word, freuquencyMap.getOrDefault(word, 0) + 1);
            }
        }
        return freuquencyMap;
    }

    public static void main(String[] args) {

        String inputString = "Java is a versatile programming language. Java developers use Java to build scalable applications.";


        Map<String, Integer> frequencyMap = getWordFreuquency(inputString);
        System.out.println(frequencyMap);

    }


}

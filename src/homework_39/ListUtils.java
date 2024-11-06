package homework_39;
/*
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListUtils {

    public static List<Integer> getCommonElements(Collection<Integer> integers, List<Integer> list) {

        // Создаем копию первой коллекции, чтобы сохранить оригинальный список без изменений
        List<Integer> commonElements = new ArrayList<>(integers);

        // Оставляем только элементы, которые присутствуют в обеих коллекциях
        commonElements.retainAll(list);

        // Возвращаем список общих элементов
        return commonElements;
    }

}
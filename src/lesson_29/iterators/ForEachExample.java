package lesson_29.iterators;

import lists.MyArrayList;

import java.util.Iterator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.10.2024
 */

public class ForEachExample {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        // Цикл for-each

        while (iterator.hasNext()) {
            String s = iterator.next();
        }

        /*
        for (ТипПеременной переменная : коллекция) {
            // Действия с переменной
        }
         */
        for (String s : list){
            System.out.println(s);
        }



    }
}


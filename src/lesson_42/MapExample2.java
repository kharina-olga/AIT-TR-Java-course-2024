package lesson_42;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer, String> mapColor = new HashMap<>();

        mapColor.put(1, "red");
        mapColor.put(2, "green");
        mapColor.put(3, "blue");

        System.out.println(mapColor);

        System.out.println("mapColor.size()" + mapColor.size());

        System.out.println( "mapColor.containsKey(32): " + mapColor.containsKey(32));
        System.out.println("mapColor.containsValue(blue): " + mapColor.containsValue("blue"));

        String color = mapColor.get(16);
        System.out.println("color: " + color);
        System.out.println("mapColor.get(100): " + mapColor.get(100));

        String deletedValue = mapColor.remove(100);
        System.out.println("mapColor.remove(100): " + deletedValue);

        deletedValue = mapColor.remove(5);
        System.out.println("mapColor.remove(5): " + deletedValue);
        System.out.println(mapColor);

        // void clear() - очищает карту
        // mapColors.clear();
        //  System.out.println(mapColor);

        // boolean isEmpty() - вернет true, если мапа пуста
        System.out.println(mapColor.isEmpty());

        mapColor.put(7, "yellow");
        mapColor.put(8, "white");
        mapColor.put(24, "white");
        System.out.println(mapColor);

        System.out.println("\n************************\n");

        // Collection<V> values() - возвращает коллекцию из всех значений карты
        Collection<String> values = mapColor.values();
        System.out.println("values.size(): " + values.size());
        System.out.println("values: " + values);

        // Set<> keySet = возвращает set, состоящий из всех ключей карты
        Set<Integer> keysSet = mapColor.keySet();
        System.out.println("keySet: " + keysSet);
        // Могу перебрать все ключи в цикле - получить все значения
        for (Integer key : keysSet) {
            System.out.println(key + ": " + mapColor.get(key) + "; ");
        }
        System.out.println();

        keysSet.remove(7);
        System.out.println(keysSet);
        System.out.println(mapColor);

        values.remove("red");
        System.out.println(values);
        System.out.println(mapColor);


    }
}

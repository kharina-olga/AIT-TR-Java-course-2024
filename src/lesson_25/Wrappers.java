package lesson_25;
/*
Классы-обертки используются в Java для представления примитивных типов типов данных как объектов
Byte -> обертка для byte
Short -> обертка для short
Integer -> обертка для int
Long -> обертка для long
Float -> обертка для float
Double -> обертка для double
Character -> обертка для char
Bollean -> обертка для boolean
 */

public class Wrappers {
    public static void main(String[] args) {

        // автоматические приведение типов
        // автоупаковка и автораспаковка - автоматическая конвертация примтивов

        Integer wrapperInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // автораспаковка. из типа integer автоматически преобразовало в примитив int

        // Сравнение объектов
        Integer a = 127;
        Integer b = 127;
        // Так как это ссылочный тип даннных оператором == сравниваются ссылки
        System.out.println(a == b); // true

        Integer c = 128;
        Integer d = 128;
        System.out.println("c == d -> " + (c == d)); // true
        System.out.println("c.equals(d): " + c.equals(d));
    }
}

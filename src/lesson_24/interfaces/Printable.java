package lesson_24.interfaces;


// интерфейсы косвенно абстрактны. Нам не нужно писать ключевое слово abstract (оно присутствует по умолчаниию
public interface Printable {
    // Интерфейс - это совокупность абстрвкных методов, задающих поведение


    // Все методы интерфейса косвенно и абстракные, и публичные
    // public abstract
    void  print();

    // начиная с JDK 8 доступны методы по умолчанию (имеющие реализацию)
    default void test(){
        System.out.println("Test");
    }

    // начиная с JDK 8 доступны статические методы
    static void testStatic(String str) {
        System.out.println("Static method printable: " + str);
    }

}

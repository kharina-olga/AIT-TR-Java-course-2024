package lesson_30.persons;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// тесты запускаются в произвольным порядке
// для упорядочивания порядка тестов надо вставить аннотацию

// порядок запуска тестовых методов в классе будет определяется аннотацтией Orderer
// для большей гибкости порядок указывают так: 10, 20, 30, иначе много переписывать
// чтобы иметь жесткую последовательность, неадо давать порядковые номера
// общая идея в том, что тесты независимы друг от друга
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    @Test
    @Order(20)
        // аннотация для аннотация порядка выполнения, указываем цифру
    void firstTest() {
        System.out.println("First Test");
    }

    @Order(30)
    @Test
    void secondTest() {
        System.out.println("Second Test");
    }

    @Order(15)
    @Test
    void thirdTest() {
        System.out.println("third Test");
    }

    @Test
    void randomTest() {
        System.out.println("randomTest");
    }

    @Order(15)
    @Test
    void randomTest2() {
        System.out.println("randomTest2");
    }


}

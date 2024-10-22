package lesson_29.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    // Метод, который выполняется перед КАЖДЫМ тесовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Method  @BeforeEach ");
    }
    /*
    @BeforeAll // запускается только один раз перед выполнение первого теста
    @AfterEach // выполняетс япосле каждого теста
    @AfterAll  // запускается один раз после выполнения всех тестовых методов
    @Disabled // Тест отключен и выполняться не будет
    @Nested // позволяет создать вложенный тестовый класс. М б использован для логической группировки тетсовых методов

    */
    // Указывает, что метод является тестовым
    @Test
    public void testAddition() {
        int result = 2 + 2;

        // Ожидаемое значение 4
        // Реальное значение в переменной result

        //  Методы проверки утверждений
        // assertEquals(expected, actual) - проверяет равны ли два значения

        Assertions.assertEquals(4, result); // проверяет равны ли два значения
        Assertions.assertNotEquals(5, result); // тест будет пройдет если "неожидаемый результат не совпадает с фактическим"
        Assertions.assertTrue(result >= 4); // проверяет, что условие верно (условие возвращает true)
        // если есть импорт import static org.junit.jupiter.api.Assertions.*; можно писать без
        assertFalse(result < 4); // проверяет, что условие неверно (условие возвращает false)
        assertNull(null); // проверяет что объект равен NUll
        assertNotNull("String"); // проверяет что объект не равен NUll

    }

    @Test
    public void emptyTest() {
        // пустой тестовыый метод является пройденным
        // если в методе нет ложного утверждения
    }

    @ParameterizedTest // позволяет выполнить один и тот же тест с разными значениями
    @ValueSource(strings = {"apple", "banana", "cherry"})

    public void testFruits(String fruit) {
        System.out.println(fruit);
        assertTrue(fruit.length() > 2);
    }

}
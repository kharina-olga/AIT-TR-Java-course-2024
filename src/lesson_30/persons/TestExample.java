package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, -1, 4, 5})
    void testInts(int value) {
        System.out.println("current value: " + value);
        Assertions.assertTrue(value > -5);
    }

    // CSV - Comma-Separeted-Value
    // Источник данных в формате csv
    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWithCsvSourse(String fruit, int rank) {
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    // Источник данных ФАЙЛ data.csv в формате csv
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testCsvFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    // Источник данных метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSource(String fruit) {
        System.out.println(fruit);
        assertNotNull(fruit);
    }

    // тестовый метод д б статическим и возвращать поток - последовательность данных, которые передаются постепенно
    // нужен для более сложных тестовых данных
    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSource(int value) {
        System.out.println("current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -1, 4, 5);  // передаем наборы единычных данных
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource3(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        assertEquals(expected, result);
        assertEquals(isEquals, result == expected);
    }

    // позволяет объединять в едином методе любые наборы данных
    static Stream<Arguments> testMethodSource3() {
        // передаем набор объектов в качестве тестовых данных
        return Stream.of(
                // помещаем комбинации типов данных
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );

    }

    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonData(Person person, String newEmail) {
        System.out.println(person);
        System.out.println(newEmail);
    }

    // составление сложных объединенных тест данных, передаем в метод объект Person c полями email password
    static Stream<Arguments> testPersonData() {
        // способ передачи данных 1
        Person person = new Person("mymail@mail.com", "Passwd1234!");
        return Stream.of(
                // способ передачи данных 1, часть два передаче второго мыла
                Arguments.of(person,"tesаааt@mail.com"),

                        // способ передачи данных два
                        // первый емэил от персон, второй как аргумент метода testPersonData
                        Arguments.of(new Person("test@mail.com", "pass1Q!"), "new123@mail.com"),
        Arguments.of(new Person("invalid.mail.com", "password"), "test.mail.com")
        );
    }

}

package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTest {
    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);
    }
    /*
    1. Берем валидный email
    2. Устанавливаем сеттером валидный email person
    3. Мы ожидаем: что у Person в поле email будет валидный email, который мы установили на шаге 2
    4.  проверить равенство person.getEmail() c валидный email, котолрый мы устанавливаем
     */

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);
        System.out.println("getEmail: " + person.getEmail());
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    1. Берем не валидный email
    2. Устанавливаем сеттером не валидный email person
    3. Мы ожидаем: что у Person в поле email будет не валидный email, который мы установили на шаге 2
    3.1 Ожидаемый результат: email утановлен не будет, т.е. значение у person не будет равно не валидному email
    3.2 Значение поля email у person останется прежним
     */
@ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
    person.setEmail(invalidEmail);
    Assertions.assertNotEquals(invalidEmail, person.getEmail());
    Assertions.assertEquals(startEmail, person.getEmail());
}

static Stream<String> invalidEmailData() {
    return Stream.of(
            "testmail.net",
            "test.mail.net",
            "test-mail.net",
            "test_mail.net",
            "valid@@test.com",
            "valid@tes@t.com",
            "valid@testcom",
            "valid@testco.m",
            "valid@test.com.",
            "1valid@test.com",
            "valid@test.com",
            "vali!d@test.com",
            "va lid@test.com",
            "va&lid@test.com",
            "va?lid@test.com",
            "valid+2@test.com"

    );
}

       /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */

}

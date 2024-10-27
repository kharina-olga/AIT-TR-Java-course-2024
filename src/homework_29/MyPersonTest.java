package homework_29;

import homework_29.MyPerson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MyPersonTest {

    MyPerson person;
    String startEmail = "test@mail.com";
    String startPassword = "Password1!";

    @BeforeEach
    void SetUp() {
        person = new MyPerson(startEmail, startPassword);
    }

// проверяем работает ли метод, который проверяет почту на корректность

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

    // проверяем, как работает метод, который проверяет корректность пароля

    @Test void testValidPasswordSet(){
        String validPassword = "Password1";

        person.setPassword(validPassword);
        System.out.println("getPassword: " + person.getPassword());
        Assertions.assertEquals(validPassword, person.getEmail());
    }

    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword) {
        person.setPassword(invalidPassword);
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "Qwert1!", // 1. длина >= 8. --> 7 символов
                "Qwertyy1", // Должна быть мин 1 цифра --> без цифр
                "QWERTY1!", //Должна быть мин 1 маленькая буква --> все буквы большие
                "qwerty1!", //  Должна быть мин 1 большая буква --> все буквы маленькие
                "Qwerty11", //Должна быть мин 1 спец. символ (!%$@&*()[].,- --> без символов
                "Qwerty1!"
        );
    }
/*
Требование к паролю:
1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */

}

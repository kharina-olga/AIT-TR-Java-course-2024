package homework_29_30;

import homework_27.MyPerson;

public class MyPersonApp {
    public static void main(String[] args) {
        // Пример корректных данных
        homework_27.MyPerson person = new MyPerson("test@mail.com", "Password1!");
        System.out.println(person);

        // Пробуем установить некорректный email
        person.setEmail("invalid-email");
        System.out.println(person.getEmail()); // Останется старый email

        // Пробуем установить некорректный пароль
        person.setPassword("short1!");
        System.out.println(person.getPassword()); // Останется старый пароль
    }
}

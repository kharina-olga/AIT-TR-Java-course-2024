package homework_29_30; // homework_30

// 29 Task 1 Написать тестовый метод для проверки работы с "не валидными" email
// Task 2 Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.

// 30 Task 1
// Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.

public class MyPerson {
    private String email;
    private String password;

    public MyPerson(String email, String password) {
        setEmail(email);  // Устанавливаем почту через проверку
        setPassword(password); // Устанавливаем пароль через проверку
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println("Некорректный email.");
        }
    }

    /*
    test@email.com.net
    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ должен быть буквой
    */

    private boolean isEmailValid(String email) {
        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3. После последней точки 2 или более символов
        if (email.length() - dotIndexAfterAt < 3) return false;

        // 4. Символы до @
        for (int i = 0; i < indexAt; i++) {
            char ch = email.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '-' && ch != '_' && ch != '.') {
                return false;
            }
        }

        // 5. До символа @ должен быть хотя бы один символ
        if (indexAt < 1) return false;

        // 6. Первый символ должен быть буквой
        if (!Character.isAlphabetic(email.charAt(0))) return false;

        return true;
    }

    // Проверка на корректность пароля
    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false; // 1. Длина >= 8

        boolean hasDigit = false;        // 2. Должна быть мин 1 цифра
        boolean hasLower = false;        // 3. Должна быть мин 1 маленькая буква
        boolean hasUpper = false;        // 4. Должна быть мин 1 большая буква
        boolean hasSpecial = false;      // 5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if ("!%$@&*()[].,-".indexOf(ch) != -1) {
                hasSpecial = true;
            }
        }

        return hasDigit && hasLower && hasUpper && hasSpecial;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        } else {
            System.out.println("Некорректный пароль.");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
Требование к паролю:
1. Длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
 */

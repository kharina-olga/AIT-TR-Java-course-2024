package lesson_45.validator;

/*
        Требование к паролю:
        1. длина >= 8
        2. Должна быть мин 1 цифра
        3. Должна быть мин 1 маленькая буква
        4. Должна быть мин 1 большая буква
        5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
 */
public class PasswordValidator {

    public static void isPasswordValid(String password) throws PasswordValidatorExeption {

        //  1. длина >= 8
        if (password == null || password.length() < 8)
            throw new PasswordValidatorExeption("Password must be at least 8 characters");

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

            if (!hasDigit) throw new PasswordValidatorExeption("Password must contain at least one digit.");
            if (!hasLower) throw new PasswordValidatorExeption("Password must contain at least one lowercase letter.");
            if (!hasUpper) throw new PasswordValidatorExeption("Password must contain at least one uppercase letter.");
            if (!hasSpecial)
                throw new PasswordValidatorExeption("Password must contain at least one special character (!%$@&*()[].,-).");

        }
    }
}

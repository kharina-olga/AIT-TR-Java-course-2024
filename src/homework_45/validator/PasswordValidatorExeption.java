package homework_45.validator;

public class PasswordValidatorExeption extends RuntimeException {


    public PasswordValidatorExeption(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " + super.getMessage();
    }
}

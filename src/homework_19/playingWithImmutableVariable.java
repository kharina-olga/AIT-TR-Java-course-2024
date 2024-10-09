package homework_19;
// Объявите переменную final int MAX_USERS = 100;.
//•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
//•	Объясните, что произошло при попытке изменения значения.

public class playingWithImmutableVariable {

    public static final int MAX_USERS = 100;

    public static void main(String[] args) {
        System.out.println(MAX_USERS);
       // MAX_USERS = 50;  cannot assign a value to static final variable MAX_USERS

    }
}

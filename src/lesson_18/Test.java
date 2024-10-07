package lesson_18;

public class Test {

    int x;
    static int staticY;

    public void testNonStatic(){
        x++;
        staticY++;
        // может вызывать нестатические и статитеческие методы
        testStatic();

    }

    public static void testStatic(){
        // статичексике методы видят ТОЛЬКО статические члены класса
        // х++ нет доступа к не-стиатическому методу
        staticY++;
        // Может вызвать ТОЛЬКО статические методы

    }

    public static void main(String[] args) {
        // х = 10 // ошибка компиляции, нет доступа к не-статическим членам
        testStatic();
        Test.testStatic();
        // testNonStatic(); не могу вызвать не-статический метода

        Test test = new Test();
        // я не могу вызвать не-статический метод, используя ссылку на объект

        test.testNonStatic();

    }

}

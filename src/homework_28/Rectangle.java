package homework_28;

// Task 1:  Создайте класс Rectangle, который представляет прямоугольник со следующими полями:
//    - length (длина) — тип double
//    - width (ширина) — тип double

import java.util.Objects;

public class Rectangle {

    double length;
    double width;

    // Создайте конструктор, который инициализирует оба поля класса.
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    //  Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

//  Переопределите метод toString(),
//  чтобы он возвращал строковое представление объекта Rectangle в формате: "Прямоугольник [длина=..., ширина=...]".

    @Override
    public String toString() {
        return "Прямоугольник [длина= " + length + ", ширина= " + width + "]";
    }

    // Task 2: Сравнение объектов класса “Rectangle”
    //Используя класс Rectangle из первого задания, необходимо реализовать сравнение объектов на равенство по их содержимому.


    // Переопределите метод equals() в классе Rectangle,
    // чтобы два объекта считались равными, если у них совпадают значения полей length и width.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверяем, не является ли объект текущим экземпляром

        // Приводим объект к типу Rectangle для дальнейшего сравнения полей
        Rectangle rectangle  = (Rectangle) obj;

//  Сравниваем поля length и width
        /* return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.width, width) == 0;
*/
        return Objects.equals(rectangle.length, length) &&
                Objects.equals(rectangle.width, width);
    }
}

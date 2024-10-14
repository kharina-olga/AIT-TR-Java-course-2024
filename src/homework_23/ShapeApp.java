package homework_23;

public class ShapeApp {
    public static void main(String[] args) {
        // Создаем массив объектов Shape
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5); // Круг с радиусом 5
        shapes[1] = new Rectangle(4, 6); // Прямоугольник со сторонами 4 и 6
        shapes[2] = new Triangle(3, 4, 5); // Треугольник со сторонами 3, 4 и 5

        // Вычисляем общую площадь и периметр
        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        // Выводим результаты
        System.out.println("Общая площадь всех фигур: " + totalArea);
        System.out.println("Общий периметр всех фигур: " + totalPerimeter);
    }
}

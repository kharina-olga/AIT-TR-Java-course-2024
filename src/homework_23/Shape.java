package homework_23;
/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

abstract class Shape {

    protected String name;

    // Абстрактные методы для вычисления площади и периметра
    abstract double calculateArea();
    abstract double calculatePerimeter();



}

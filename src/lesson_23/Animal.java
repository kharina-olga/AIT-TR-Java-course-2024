package lesson_23;

// Если в классе есть хотя бы один абстрактный метод (без реализации)
// класс обязан быть подмечен как абстрактный

abstract class Animal {

    // Абстрактный класс может иметь поля и константы
    protected  String name;

    public Animal(String name){
        this.name = name;
    }

    // Abstract method не имеет реализации
    abstract void eat();

    abstract void move();

    // в абстрактном классе могут присутствоаать обысные методы
    public void sayHello() {
        System.out.println("Hello from animal");
    }


}

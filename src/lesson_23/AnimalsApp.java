package lesson_23;

public class AnimalsApp {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat.eat();

        // Нельзя создать экземпляр абстрактного класса
        // Animal animal = new Animal() ошибка комплияции
         Animal animal = new Cat("Tim"); // но можно использовать полиморфизм
        // Собирать объекты дочерних классов в ссылку родительского абстрактного класса

        Dog dog = new Dog("Bart");
        dog.eat();
        dog.sayHello();
    }
}

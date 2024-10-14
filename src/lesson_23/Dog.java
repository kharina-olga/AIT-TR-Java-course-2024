package lesson_23;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sayHello() {
        System.out.println("Dog " + name + " says hello");
    }

    @Override
    void move() {
        System.out.println( name + " runs!");

    }
}

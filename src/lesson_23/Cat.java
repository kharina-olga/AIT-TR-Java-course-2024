package lesson_23;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Cat " + name + " loves eating much");
    }

    @Override
    void move() {
        System.out.println(name + " jumps!");
    }
}

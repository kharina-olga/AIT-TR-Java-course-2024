package lesson_22.animals;

public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.voice();
        System.out.println(cat.toString());
        cat.eat();

        System.out.println("**************");

        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("**************");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        System.out.println("**************");
    }
}

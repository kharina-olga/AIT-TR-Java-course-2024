package lesson_23;
// если в наследнике есть нереализованные методы родителя, то класс наследника необходимо пометить абстрактным
abstract class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Cow eats");

    }
    // нереализованный метод
    @Override
    void move() {

    }
}

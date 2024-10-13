package lesson_22.animals;

public class Cat extends Animal{

    // unic function
    public void eat(){
        System.out.println("Cat eats");
    }

    // Переопределение родительского метода voice()
    @Override // аннотация
    public void voice(){
        System.out.println("Cat says MEOW!!!");
    }

    @Override
    public String toString() {
        return "Cat toString";
    }

    // Перегрузка метода - статический полиморфизм
    public void voice(String str) {
        System.out.println("Cat says " + str);
    }
}

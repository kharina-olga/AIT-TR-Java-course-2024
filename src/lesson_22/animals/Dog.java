package lesson_22.animals;

public class Dog extends Animal {
    @Override
    public void voice() {
        // super - обращение к оюъекту родителя
        super.voice();
    }

    @Override
    public String toString() {
        return super.toString() + " | дополнение реализации родительского метода ";
    }
}

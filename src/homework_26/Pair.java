package homework_26;

public class Pair<T> {
    private T first;
    private T second;

    // Конструктор, принимающий два параметра типа T
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Возвращает первый элемент
    public T getFirst() {
        return first;
    }

    // Возвращает второй элемент
    public T getSecond() {
        return second;
    }

    // Устанавливает значение первого элемента
    public void setFirst(T first) {
        this.first = first;
    }

    // Устанавливает значение второго элемента
    public void setSecond(T second) {
        this.second = second;
    }

    // Меняет местами первый и второй элементы
    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }
}


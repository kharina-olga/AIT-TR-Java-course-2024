package homework_25;

// Объявляем класс с обобщением типа <T>
public class MagicArrayGeneric<T> {
    private T[] array;
    private int cursor;

    @SuppressWarnings("unchecked")
    public MagicArrayGeneric() {
        array = (T[]) new Object[10];  // Обобщенный массив
    }

    @SuppressWarnings("unchecked")
    public MagicArrayGeneric(T[] initialArray) {
        if (initialArray == null || initialArray.length == 0) {
            array = (T[]) new Object[10];  // Обобщенный массив
        } else {
            array = (T[]) new Object[initialArray.length * 2];  // Обобщенный массив с увеличенным размером
            addAll(initialArray);
        }
    }

    // Добавление в массив одного элемента
    public void add(T value) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    // Добавление нескольких элементов
    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    // Динамическое расширение массива
    private void expandArray() {
        System.out.println("Expanding array! Cursor = " + cursor);
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("Array expanded");
    }

    // Возвращает текущее количество элементов в массиве
    public int size() {
        return cursor;
    }

    // Возвращает элемент по индексу
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;  // Вернуть null при некорректном индексе
    }

    // Удаление элемента по индексу
    public T remove(int index) {
        if (index >= 0 && index < cursor) {
            T value = array[index];  // Сохраняем удаляемое значение
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];  // Сдвигаем элементы влево
            }
            cursor--;
            return value;  // Возвращаем удаленное значение
        }
        return null;
    }

    // Удаление элемента по значению
    public boolean removeByValue(T value) {
        int index = indexOf(value);
        if (index == -1) return false;
        remove(index);
        return true;
    }

    // Поиск индекса первого вхождения значения
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // Поиск индекса последнего вхождения значения
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // Строковое представление массива
    public String toString() {
        if (cursor == 0) return "[]";
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            result.append(array[i]).append(i < cursor - 1 ? ", " : "]");
        }
        return result.toString();
    }
}

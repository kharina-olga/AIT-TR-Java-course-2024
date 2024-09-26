package lesson_12;

public class ArraysMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 10};
        System.out.println(array.length);

        int index = ArrayUtility.linearSearch(array, 100);
        System.out.println("index: " + index);
    }

}

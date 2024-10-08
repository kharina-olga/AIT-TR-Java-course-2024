package lesson_19;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array = {3, 2, 1, 0};

        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));

        System.out.println("****** sorting massive 1 ******");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

     //   System.out.println("****** sorting massive 2 ******");
     //   Arrays.sort(array, 1, 3);
     //   System.out.println(Arrays.toString(array));

        System.out.println("****** binary search ******");
        // binarySearch - массив должен быть отсортирован
         int index = Arrays.binarySearch(array, 50);
        System.out.println("index: " + index);

        System.out.println("****** сравнение массивов на равенство ******");
        int[] test = {0, 1, 2, 3};
        // мы не можем корректно сравнить массивы Эпо значению методом equals
        System.out.println("array,equals(test):" + array.equals(test));
        // Для сравнения массивов по значениям мы используем Artrays.equals. Порядок значений учитывается при сравнении
        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("Arrays.equals(array, test): " + isArraysEquals);

        // Находит и возвращает индекс первого различия между массивами
        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("Arrays.mismatch(array, test): " + mismatchIndex);

        System.out.println("******* многомерные массивы **********");
        int[][] arrayD = new int[3][4];
        // Возвращает строковое представление массива, включая вложенные массивы

        System.out.println(Arrays.deepToString(arrayD));

        // сравнение многомерных массивов
        int[][] arrayC = new int[3][4];
        boolean isEquals = Arrays.deepEquals(arrayD, arrayC);
        System.out.println("Arrays.deepEquals(arrayD, arrayC): " + isEquals);
        arrayC[0][3] = 1;
        arrayC[2][2] = 5;
        System.out.println(Arrays.deepToString(arrayC));


        System.out.println("\n ************ copyOf *****************");
        /*
        создает новвый массив заданной длины. При этом копирует элементы из старого массива.
        Кол-во копируемых элементов равно новой длине массива
        Если длина нового массива, чем стьарого - оставшиеся ячейки заполгняются значениями по умолчанию для этого типа данных массива
         */

        System.out.println("tesArray: " + Arrays.toString(test));

        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));
        copyOfTest = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copyOfTest));Arrays.copyOf(test, 2);


        System.out.println("\n ************ copyOfRange *****************");

        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] rangeFromInts = Arrays.copyOfRange(ints, 3, 10);
        System.out.println("Arrays.copyOf(ints, 3, 10): " + Arrays.toString(rangeFromInts));
        int[] copyOfInts = Arrays.copyOf(ints, ints.length);
        System.out.println("Arrays.copyOf(ints, ints.length: " + Arrays.toString(copyOfInts));
        copyOfTest = Arrays.copyOfRange(ints, 0, ints.length);
        System.out.println("Arrays.copyOfRange(ints, 0, ints.length): " + Arrays.toString(copyOfTest));

        System.out.println("****** System.arrayCopy ********");

        int[] target = new int[10];
        System.arraycopy(ints, 9, target, 3, 5);
        System.out.println(Arrays.toString(target));


        System.out.println("******* fill massive *********");
        // заполнение массива

        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        Arrays.fill(arr,  2, 4, 1000);
        Random random = new Random();
        Arrays.fill(arr, random.nextInt(101));
        System.out.println(Arrays.toString(arr));






    }
}

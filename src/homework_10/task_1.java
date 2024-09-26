package homework_10;
// code by Olga Kharina
/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */

public class task_1 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5 };   // declaring first array
        printArrayInGivenLength(array1, 7);    // define length for the new array

    } // method area

    public static void printArrayInGivenLength(int[] array1, int array2Length) {
        int [] array2 = new int[array2Length];   // declaring second array
        System.out.print("[");
        for (int i = 0; i < array2Length; i++) {
            if (array1.length > i) {            // checking length of the new array and the first array to know when script should be stopped
                array2[i] = array1[i];          // coping elements from the first array to the new array

            } else {
                array2[i] = 0;                  // fulling the new array with zero when it's shorter
            }
            System.out.print(array2[i] + ", ");
        }
        System.out.print("]");
    }

} // end of class

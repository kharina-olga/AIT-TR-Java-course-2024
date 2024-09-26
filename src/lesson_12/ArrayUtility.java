package lesson_12;

public class ArrayUtility {

    // Метод линейного поиска элемента в массиве
  // Осущ-ся перебором всех элементов и сравниеванием с искомым значениям
    // Если не найдено - вовзвр-ся 1
    // Одгнозгначно сказатьБ что число отсутсвует в массиве?
    // Потребуется перебрать абсолютно все элементы массива -> O(n)

    public static int linearSearch(int[] array, int searchValue) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }




}

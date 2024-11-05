package homework_39;

import java.util.Collection;
import java.util.List;

public class ListUtilMain {

    public static void main(String[] args) {
        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5);
        List<Integer> otherList = List.of(3, 4, 5, 6, 7, 8);

        List<Integer> commonElements = ListUtils.getCommonElements(integers, otherList);
        System.out.println(commonElements); // Вывод: [3, 4, 5]
    }
}

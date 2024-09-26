package homework_10;
// code by Olga Kharina
/*
Task 2
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

public class task_2 {
    public static void main(String[] args) {
      String[]  names = new String[] {"Oleksandr", "Illia", "Olga"};

        // Get the array with shortest and longest strings
        String[] result = getArrayWithShortestAndLongest(names);

        // Print the result
        System.out.println("Longest and  Shortest Strings: " + result[0] + ", " + result[1]);


    } // method area

    public static String[] getArrayWithShortestAndLongest(String[] names) {
        String longestName = names[0];
        String shortestName = names[0];

        // find the longest name
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        // find the shortest name
        for (int i = 1; i < names.length; i++){
            if (names[i].length() < shortestName.length()) {
                shortestName = names[i];
            }
        }
        // Return the array with the shortest and longest names
        return new String[]{longestName, shortestName};

    }


} // end of class

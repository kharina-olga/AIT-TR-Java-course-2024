package lesson_16;

public class MagicApp {

    public static void main(String[] args) {

        int[] test = {1,2,3,4,5,6,7};

        MagicArray2 magicArray = new MagicArray2();

   /*     magicArray.cursor = 1_000_000;
        magicArray = new  int[1000];*/

  //      magicArray.array = new int{1,2,3,4};

        magicArray.add(100);

        System.out.println(magicArray.toString());

    }
}
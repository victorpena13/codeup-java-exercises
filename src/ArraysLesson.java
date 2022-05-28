import java.util.Arrays;

import static java.util.Arrays.fill;

public class ArraysLesson {
    public static void main(String[] args) {

        //arrays have a fixed length.
        double [] prices;
        prices = new double[4];

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers[0]); // 1
        System.out.println(numbers[1]); // 2
        System.out.println(numbers[2]); // 0;
        // System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException

        String[] beatles = {"John", "Paul", "Ringo"};
        System.out.println(beatles.length); // 3
        System.out.println(beatles[0]); // "John"
        System.out.println(beatles[1]); // "Paul"
        System.out.println(beatles[2]); // "Ringo"

        // beatles[3] = "George"; // ArrayIndexOutOfBoundsException

        // iterating:
        String[] languages = {"html", "css", "javascript", "java"};
        for (int i = 0; i < languages.length; i+=1) {
            System.out.println(languages[i]);
        }

        // ehanced for - similar to forEach:

        for (String language : languages) {
            System.out.println(language);
        }

        int[] numbersArray = {1,2,3,4,5};
        for(int n : numbersArray) {
            System.out.println(n);
        }

        Arrays.fill(numbersArray, 10);
        System.out.println("test");
        System.out.println(Arrays.toString(numbersArray)); // [10, 10, 10, 10, 10, 10, 10, 10, 10]


        int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};

        // To fill complete array with a particular
        // value
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" +
                " with 10\n" + Arrays.toString(ar));

    }
}

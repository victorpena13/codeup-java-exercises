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

        // enhanced forlooop - similar to forEach:

        for (String language : languages) {
            System.out.println(language);
        }

        int[] numbersArray = {1,2,3,4,5};
        for(int n : numbersArray) {
            System.out.println(n);
        }

        Arrays.fill(numbersArray, 10);
        System.out.println(Arrays.toString(numbersArray)); // [10, 10, 10, 10, 10, 10, 10, 10, 10]
        int[] newArray = Arrays.copyOf(numbersArray, 6);
        System.out.println(Arrays.toString(newArray)); // [10, 10, 10, 10, 10, 0]
        newArray[newArray.length-1] = 3;
        System.out.println(Arrays.toString(newArray));


        int ar[] = {2, 2, 1, 8, 3};

        // To fill complete array with a particular
        // value
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" +
                " with 10\n" + Arrays.toString(ar));

        System.out.println(Arrays.equals(ar, numbersArray)); //same type

        // Two-Dimensional Arrays - an array whose elements are themselves arrays.
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // access the first element in the second row
        System.out.println(matrix[1][0]); // 4
        // the last element in the first row
        System.out.println(matrix[0][2]); // 3
        // the first element inthe last row
        System.out.println(matrix[2][0]); // 7

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");
    }
}

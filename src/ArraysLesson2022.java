import java.util.Arrays;

public class ArraysLesson2022 {

    public static void main(String[] args) {

        double[] prices;
        prices = new double[4];

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers[0]); //1
        System.out.println(numbers[1]); //2
        System.out.println(numbers[2]); //0 - default vaule
//        System.out.println(numbers[3]); //ArrayIndexOutOfBoundsException

        String[] beatles = {"john", "paul", "ringo"};
        System.out.println(beatles.length);

        System.out.println(beatles[0]);
        System.out.println(beatles[1]);
        System.out.println(beatles[2]);

        for(int i=0; i <beatles.length; i+=1) {
            System.out.println(beatles[i]);
        }

        String[] languages = {"html", "css", "javascript", "java"};

        for(String language : languages) {
            System.out.println(language);
        }

        String[] letters = {"z","q","a", "b", "c", "d", "e"};
        for(String l : letters) {
            System.out.println(l);
        }

        Arrays.fill(numbers,10);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.equals(languages, letters));
        int[] numbersCopy = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(numbersCopy));

        // two-dimensional arrays

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(matrix[1][0]); //4 - first element second row
        System.out.println(matrix[0][2]); //3 - last element first row
        System.out.println(matrix[2][0]); //7 - first element last row

    }
}

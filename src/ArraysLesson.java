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
        for (int i= 0; i < languages.length; i+=1) {
            System.out.println(languages[i]);
        }


    }
}

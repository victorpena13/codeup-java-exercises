import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high-low) + low;

        System.out.println("Guess the correct number between 1 and 100: ");
        int userInput = scanner.nextInt();
    }
}

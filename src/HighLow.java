import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static boolean HigherLower(int guess, int randomNumber) {
        Scanner scanner = new Scanner(System.in);
        do {
            if(guess < randomNumber) {
                System.out.println("Higher");
                System.out.println("Try again:");
                int usersGuess = scanner.nextInt();
                HigherLower(usersGuess, randomNumber);
            } else if (guess > randomNumber) {
                System.out.println("Lower");
                System.out.println("Try again: ");
                int usersGuess = scanner.nextInt();
                HigherLower(usersGuess, randomNumber);
            } else if (guess == randomNumber);
            return true;
        } while (false);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high-low) + low;

        System.out.println("Guess the correct number between 1 and 100: ");
        int userInput = scanner.nextInt();
        System.out.println(HigherLower(userInput, result));
    }
}

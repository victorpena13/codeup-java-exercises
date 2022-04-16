import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static boolean HigherLower(int userGuess, int randomNumber) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            if (userGuess == randomNumber) {
                count++;
                System.out.println("guess count " + count);
                System.out.println("your guess " + userGuess + " matches the random Number: " + randomNumber );
                break;
            } else if (userGuess > randomNumber) {
                count++;
                System.out.println("guess count " + count);
                System.out.println("Lower");
                System.out.println("Try again: ");
                userGuess = scanner.nextInt();
            } else if (userGuess < randomNumber) {
                count++;
                System.out.println("guess count " + count);
                System.out.println("Higher");
                System.out.println("Try again: ");
                userGuess = scanner.nextInt();
            }
        } while (true);

        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high-low) + low;

        System.out.println("Guess the correct number between 1 and 100: ");
        int guess = scanner.nextInt();
        System.out.println(HigherLower(guess, result));
    }
}

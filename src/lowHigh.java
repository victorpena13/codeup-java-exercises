import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class lowHigh {

    public static void trueOrFalse(int randomNumber, int userGuess){
        if (randomNumber == userGuess){
            System.out.println("true");
            return;
        } else if (randomNumber != userGuess) {
            System.out.println("false");
            return;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomInt = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println(randomInt);

        System.out.print("guess the random number between 1 and 100: ");
        int userInt = scanner.nextInt();
        trueOrFalse(randomInt, userInt);


    }
}

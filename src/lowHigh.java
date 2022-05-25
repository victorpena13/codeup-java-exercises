import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class lowHigh {

    public static void trueOrFalse(int randomNumber, int userGuess){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (randomNumber != userGuess) {
            System.out.print("guess the random number between 1 and 100: ");
            int userInt = scanner.nextInt();
            if(count >= 4) {
                System.out.println("out of turns.");
                return;
            }
            if(randomNumber > userInt) {
                System.out.println("Higher");
                count++;
            } else if (randomNumber < userInt) {
                System.out.println("Lower");
                count++;
            }
            if (randomNumber == userInt) {
                System.out.println("correct");
                return;
            }
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

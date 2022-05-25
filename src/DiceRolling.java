import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceRolling {
    public static void rollDice(int sides) {
        Scanner scanner = new Scanner(System.in);
        int dieOne = ThreadLocalRandom.current().nextInt(1, sides);
        int dieTwo = ThreadLocalRandom.current().nextInt(1, sides);
        System.out.println("dice 1: " + dieOne);
        System.out.println("dice 2: " + dieTwo);

        String userAnswer;
        do {
            System.out.print("would you like to roll the dice again? [y/n]: ");
            userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase("n")) {
                return;
            }
            if (userAnswer.equalsIgnoreCase("y")) {
                System.out.print("number of sides for dice: ");
                int userSides = scanner.nextInt();
                rollDice(userSides);
            }

        } while (userAnswer.equalsIgnoreCase("y"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides for a pair of dice: ");
        int userInteger = scanner.nextInt();
        rollDice(userInteger);
    }
}

import java.util.Random;
import java.util.Scanner;

public class HowHighHowLow {
    public static void highLow(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pick a number 1 through 100.");
        int userInteger;
        do {
            System.out.print("guess number: ");
            userInteger = scanner.nextInt();
            if (userInteger == number) {
                System.out.println("you did it!");
            }

        }while(userInteger != number);
    }

    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high-low) + low;

        highLow(result);
    }
}

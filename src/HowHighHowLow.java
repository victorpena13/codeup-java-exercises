import java.util.Random;
import java.util.Scanner;

public class HowHighHowLow {
    public static void highLow(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pick a number 1 through 100.");
        int userInteger;
        int count=-1;
            do {
                if (count >= 5) {
                    System.out.println("You lose");
                    break;
                }
                System.out.print("guess number: ");
                userInteger = scanner.nextInt();
                count++;
                if(userInteger > number) {
                    System.out.println("lower");
                } else if(userInteger < number) {
                    System.out.println("higher");
                } else if (userInteger == number) {
                    count++;
                    System.out.println("you did it!");
                    System.out.println("counts: " + count);
                }
            }while(userInteger != number && count <= 5);
        System.out.println("your count is "+ count);

    }

    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        System.out.println(result);

        highLow(result);
    }
}

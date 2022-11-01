import java.util.Scanner;

public class ConsoleInputAndOutputExercise {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("two decimal places: %.2f ", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("enter a number: ");
        int userNumber = scanner.nextInt();
        System.out.println(userNumber);
        System.out.println("please enter three words: ");

        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        System.out.printf("%s\n%s\n%s\n" , wordOne, wordTwo, wordThree);

        System.out.print("enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);

        System.out.println("enter the width and length of a square or rectangle: ");

        int width = scanner.nextInt();
        int length = scanner.nextInt();

    }
}

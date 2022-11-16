import java.util.Scanner;

public class ConsoleExer {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("the value of pi %.2f", pi);
        System.out.println();
        System.out.print("please enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        System.out.println("you entered: " + userInt);

        System.out.print("enter three words: ");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        // will not accept less then 3 words.
        // if more than three words are entered it will disregard any words past 3.

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        System.out.print("enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println("your sentence: " + userSentence);

        System.out.println("calculate perimeter and area of square");
        System.out.println("length: ");
        int userLength = scanner.nextInt();
        System.out.println("area: ");
        int userWidth = scanner.nextInt();
        System.out.println("area: " + (userLength*userWidth) + " perimeter: " + ((userLength*2) + (userWidth*2)));

    }
}

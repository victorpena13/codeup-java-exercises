import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi); // %.2f shortens to two decimal places.  %n breaks line.

        System.out.print("enter an integer: ");
        int userInteger = scanner.nextInt();
        System.out.println(userInteger);

        System.out.println("enter 3 words: ");
        String userWordOne = scanner.next(); // captures only one word
        String userWordTwo = scanner.next(); // captures every word after the previous
        String userWordThree = scanner.next();

        // cannot enter less then 3 words
        // cannot enter more then 3 words

        System.out.println(userWordOne);
        System.out.println(userWordTwo);
        System.out.println(userWordThree);

        System.out.println("enter a sentence: ");
        String sentence = scanner.nextLine();
        String userSentence = scanner.nextLine();

        System.out.println(userSentence);

        System.out.print("enter width of rectangle: ");
        String userWidth = scanner.next();
        System.out.print("enter length of rectangle: ");
        String userLength = scanner.next();
        System.out.println(parseInt(userWidth) * parseInt(userLength));

    }
}

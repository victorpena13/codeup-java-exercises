import java.util.Scanner;

public class ConsoleExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);

        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt(); // if integer is not passed-system throws an error
        System.out.println("you entered " + userInt);

        System.out.print("Enter three words: ");
        String userWordOne = scanner.next();
        String userWordTwo = scanner.next();
        String userWordThree = scanner.next();

        System.out.println("word one: " + userWordOne);
        System.out.println("word three: " +userWordThree);

    }

}

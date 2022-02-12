import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
//Write some Java code that uses the variable pi to output the following:
//        The value of pi is approximately 3.14.

        System.out.format("The value of pi is approximately %.2f%n", pi);

        System.out.print("enter a whole number: ");
        int userInput = scanner.nextInt();
        System.out.format("The number you entered is --> %s <--%n", userInput);

        //if a decimal number is placed into a int variable the application will break.

        System.out.print("enter three words: ");
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.nextLine();
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);

    }
}

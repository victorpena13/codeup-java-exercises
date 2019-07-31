import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
    double pi = 3.14159;
    System.out.format("%.2f", pi);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter an integer (make sure you do it right):");
    int input = scanner.nextInt();
    System.out.println(input);

    System.out.print("Please enter three words: ");
    String input1 = scanner.next();
    String input2 = scanner.next();
    String input3 = scanner.nextLine();
    System.out.println(input1);
    System.out.println(input2);
    System.out.println(input3);
    //nextLine() called to clear input
    scanner.nextLine();
    System.out.printf("please enter a sentence: ");
    String sentence = scanner.nextLine();
    System.out.printf("Here is your sentence: %s%n", sentence);

    System.out.printf("What is the width of the classroom? ");
    String answer = scanner.nextLine();
    double width = Double.valueOf(answer);
    System.out.println(width);

    System.out.printf("what is the length of the classroom?");
    answer = scanner.nextLine();
    double length = Double.valueOf(answer);
    System.out.printf("Area of classroom = %.2f%n", width * length);
    System.out.printf("Perimeter of classroom = %.2f%n", 2 * width + 2 * length);
    System.out.printf("Volume of classroom = %.2f%n", width * length * 10.0);


    }





    }


import java.util.Arrays;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("What number would you like to go up to? ");
            int userNum = scan.nextInt();
            System.out.println();

            System.out.println("Here is your table!");
            System.out.println();

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (long i = 1; i <= userNum; i++) {
                System.out.printf("%-7d|%-9d|%-8d%n", i, i * i, i * i * i);
            }
            System.out.println();
            System.out.println("Do you want to continue (y/n)? ");
            answer = scan.next();
        } while (answer.equalsIgnoreCase("y"));
    }

}

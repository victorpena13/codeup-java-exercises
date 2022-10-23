import java.util.Scanner;

public class ConsoleInputAndOutputLesson {
    public static void main(String[] args) {
        String firstName = "victor";
        System.out.printf("Hello there %s, Nice to see you. %n", firstName);

        String greeting = "Salutations";
        System.out.printf("%s, %s!", greeting, firstName);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();
        System.out.print("You enetered: -->\"" + userInput + "\" <--");


    }
}

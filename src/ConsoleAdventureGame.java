import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you ready to start? [y/n] ");
        String userReady = scanner.next();
        String username;
        if(userReady.equalsIgnoreCase("y")){
            System.out.print("What is your name ");
            scanner.nextLine();
            username = scanner.nextLine();
            System.out.println("Hello, " + username);
        }

    }
}

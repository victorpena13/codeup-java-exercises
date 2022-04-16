import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ready to start? ");
        String userYesNo = scanner.nextLine();
        System.out.println(userYesNo);
        String username;

        if (userYesNo.equalsIgnoreCase("yes")) {
            System.out.print("what is your name hero?");
            username = scanner.nextLine();
            System.out.println("Thanks for playing hero" + username);
            System.out.println("The following instructions allow you to play hero: " + username);
            System.out.println("button a - Attack (decreases enemeyHealth");
            System.out.println("button b - Drink potion (adds to heroHealth");
            System.out.println("button c - Run? (ends the game)");
        }
        if (userYesNo.equalsIgnoreCase("no")) {
            System.out.println("GoodBye");
        }
    }
}

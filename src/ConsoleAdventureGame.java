import java.util.Scanner;
public class ConsoleAdventureGame {
    public String playerName;
    public int playerHealth = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you ready to start? [y/n] ");
        String userReady = scanner.next();
        if(userReady.equalsIgnoreCase("y")){
            ConsoleAdventureGame user = new ConsoleAdventureGame();
            System.out.print("What is your name ");
            user.playerName = scanner.nextLine();
            System.out.println("Hello, " + user + " " + user.playerHealth);
        } else if (userReady.equalsIgnoreCase("n")){
            System.out.println("goodbye");
            return;
        }
        System.out.println("To view yours and your enemies health type \'health\' ");
        System.out.println("To run type in \'run\'");
        System.out.println("To attack type in \'attack\'");
        System.out.println("To Drink potion type in \'potion\'");

        System.out.print("action: ");
        String userAction = scanner.next();
        if(userAction.equalsIgnoreCase("health")) {

        }

    }
}

package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo(String userInput) {
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = scanner.nextInt();
            if (userInput < min) {
                System.out.println("the number:" + userInput + " is smaller then " + min);
                getInt(min, max);
            } else if (userInput > max) {
                System.out.println("the number:" + userInput + " is bigger then " + max);
                getInt(min, max);
            }
            return userInput;
    }
}

package util;

import java.util.Scanner;

public class Inputs {
    private Scanner scanner = new Scanner(System.in);
    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("yes or no: ");
        String userInput = getString();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }


}

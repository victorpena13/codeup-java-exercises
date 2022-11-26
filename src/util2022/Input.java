package util2022;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    public String getString() {
        return scanner.nextLine();
    }

    public int getInt() {
        return scanner.nextInt();
    }


    public double getDouble() {
        return scanner.nextDouble();
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

    public int getInt(int min, int max) {
        int userInteger;
        do{
            System.out.print("enter a number between " + min + " " + max + ": ");
            userInteger = getInt();
        }while(userInteger < min || userInteger > max);
        return userInteger;
    }

    public double getDouble(int min, int max) {
        double userInteger;
        do{
            System.out.print("enter a number between " + min + " " + max + ": ");
            userInteger = getDouble();
        }while(userInteger < min || userInteger > max);
        return userInteger;
    }


}

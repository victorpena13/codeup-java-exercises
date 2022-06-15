package util;
import shapes.Circle;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public void yesNo(String question, String userInput) {
        Circle circle = new Circle();
        Input input = new Input();
        while (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            System.out.println(question);
            userInput = input.getString();
            System.out.print("radius: ");
            while(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
                double radius = input.getDouble();
                System.out.println("area: " + circle.getArea(radius));
                yesNo(question, userInput);
            }
            if(userInput.startsWith("no") || userInput.startsWith("n")) {
                System.out.println("goodbye");
                return;
            }
        }
    }

    public int getInt(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max);
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

    public double getInt() {
        String intString = getString();
        Integer convertedInt = Integer.valueOf(intString);
        return convertedInt;
    }

    public double getDouble(double min, double max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max);
        double userInput = scanner.nextDouble();
        if (userInput < min) {
            System.out.println("the number:" + userInput + " is smaller then " + min);
            getDouble(min, max);
        } else if (userInput > max) {
            System.out.println("the number:" + userInput + " is bigger then " + max);
            getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}

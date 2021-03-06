package util;
import javax.lang.model.util.ElementScanner6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public static String getString() {
        System.out.println("Type something... ");
        Scanner scanner = new Scanner(System.in);
        String daString = scanner.next();
        System.out.println(daString);
        return daString;
    }

    public static boolean yesNo() {
        System.out.println("Do you agree? y/n");
        Scanner scanner = new Scanner(System.in);
        String theString = scanner.next();
        boolean confirmation = theString.contains("y");
        System.out.println(confirmation);
        return confirmation;
    }

    public static int getInt(int min, int max){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            int inputNumber = scanner.nextInt();
            if(inputNumber > max || inputNumber < min) {
                inputNumber = getInt(min, max);
            }
            return inputNumber;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");

    }
return getInt(1, 10);
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        return  inputNumber;
    }

    public static double getDouble(double min, double max){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between .01 and .99: ");
        double inputDec = scanner.nextDouble();
        if(inputDec > max || inputDec < min) {
            inputDec = getDouble(min, max);
        }
        return inputDec;
    }

    public static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double inputDec = scanner.nextDouble();
        return inputDec;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.getDouble();
    }


    public static void main(String[] args) {
//        getString();
//        yesNo();
        System.out.println(getInt(1,10));
//        System.out.println(getInt());
//        System.out.println(getDouble(.01, .99));
//        System.out.println(getDouble());
    }
}
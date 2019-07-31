package util;
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int inputNumber = scanner.nextInt();
        if(inputNumber > max || inputNumber < min) {
            inputNumber = getInt(min, max);
        }
        return inputNumber;
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        return  inputNumber;
    }



    public static void main(String[] args) {
        getString();
        yesNo();
        System.out.println(getInt(1,10));
    }
}
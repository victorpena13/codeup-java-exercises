package grades;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryApp {
    private ArrayList categories;
    private String item;
    private String amount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to create a grocery list?[y/n]");
        String yesNo = scanner.next();
        if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {

        }


    }

}

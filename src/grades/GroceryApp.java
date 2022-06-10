package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GroceryApp {
    public ArrayList<String> categories;
    public HashMap<String, List<String>> item;

    public GroceryApp() {
        this.categories = new ArrayList<>();
        this.item = new HashMap<>();
        categories.add("Produce");
        categories.add("Dairy");
        categories.add("Meat");
        categories.add("Beverages");
        categories.add("Sweets");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryApp grocery = new GroceryApp();

        System.out.println("Would you like to create a grocery list?[y/n]");
        String yesNo = scanner.next();
        if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {
            System.out.println(grocery.categories);
            while (true) {
                System.out.println("add an item? [y/n]");
                yesNo = scanner.next();
                if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {
                    System.out.print("Enter Category: ");
                    String userCategory = scanner.next();
                    System.out.print("Enter Item: ");
                    String userItem = scanner.next();
                    System.out.println("Enter Amount");
                    Double userAmount = scanner.nextDouble();
                } else if (yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("No")) {
                    System.out.println("goodbye");
                    return;
                }
            }
        }
    }
}

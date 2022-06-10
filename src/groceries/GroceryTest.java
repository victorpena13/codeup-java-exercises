package groceries;


import java.util.*;

public class GroceryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to create a grocery list? [y/n]");
        String yesNo = scanner.next();
        if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {
            while (true) {
                System.out.print("Would you like to enter a new item? [y/n] ");
                yesNo = scanner.next();
                if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {
                    System.out.println("Produce, Dairy, Meat, Beverages, Sweets");
                    System.out.print("select a category: ");
                    String userCategory = scanner.next();
                    System.out.print("name of item: ");
                    scanner.nextLine();
                    String userItem = scanner.nextLine();
                    System.out.print("item x ");
                    String userAmount = scanner.next();

                    Grocery[] newGroceryList = Arrays.copyOf(GroceriesArray.findAll(), GroceriesArray.findAll().length + 1);
                    newGroceryList[newGroceryList.length-1] = new Grocery(userCategory, userItem, userAmount);
                    for(Grocery grocery: newGroceryList) {
                        System.out.println("Category: " + grocery.getCategory() + " item: " + " amount: " + grocery.getAmount());
                    }

                } else if (yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("no")) {
                    for(Grocery grocery : GroceriesArray.findAll()) {
                        System.out.print(grocery.getCategoryItemAmount());
                    }
                    return;
                }
            }
        }
    }
}
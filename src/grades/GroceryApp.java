package grades;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class GroceryApp {
    public ArrayList<String> categories;
    public Map<String, List<String>> item;

    public GroceryApp() {
        this.categories = new ArrayList<>();
        List<String> list = new ArrayList<>();
        this.item = new HashMap<>();
        item.put("produce", list);
        categories.add("Produce");
        categories.add("Dairy");
        categories.add("Meat");
        categories.add("Beverages");
        categories.add("Sweets");
    }

    public void recordItem(String category, String product, String amount) {
        String itemAmount = product + " * " + amount;
            item.get(category).add(itemAmount);
            System.out.println(item.get(category));
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
                    String userAmount = scanner.next();
                    grocery.recordItem(userCategory, userItem, userAmount);
                } else if (yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("No")) {
                    System.out.println("goodbye");
                    return;
                }
            }
        }
    }
}

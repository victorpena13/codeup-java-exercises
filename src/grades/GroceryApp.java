package grades;
import java.util.*;

public class GroceryApp {
    public ArrayList<String> categories;
    public Map<String, List<String>> item;

    public GroceryApp() {
        this.categories = new ArrayList<>();
        List<String> listProduce = new ArrayList<>();
        List<String> listDairy = new ArrayList<>();
        List<String> listMeat = new ArrayList<>();
        List<String> listBeverages = new ArrayList<>();
        List<String> listSweets = new ArrayList<>();
        this.item = new HashMap<>();
        item.put("produce", listProduce);
        item.put("dairy", listDairy);
        item.put("meat", listMeat);
        item.put("beverages", listBeverages);
        item.put("sweets", listSweets);
        categories.add("Produce");
        categories.add("Dairy");
        categories.add("Meat");
        categories.add("Beverages");
        categories.add("Sweets");
    }
    public void recordItem(String category, String product, String amount) {
        String itemAmount = product + " * " + amount;
        if(item.containsKey(category)) {
            item.get(category).add(itemAmount);
            System.out.println(item.get(category));
        }
    }

    public void viewList() {
        System.out.println(item.get("produce"));
        System.out.println(item.get("dairy"));
        System.out.println(item.get("meat"));
        System.out.println(item.get("beverages"));
        System.out.println(item.get("sweets"));
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
                    String userCategory = scanner.next().toLowerCase(Locale.ROOT);
                    System.out.print("Enter Item: ");
                    String userItem = scanner.next().toLowerCase(Locale.ROOT);
                    System.out.println("Enter Amount");
                    String userAmount = scanner.next().toLowerCase(Locale.ROOT) ;
                    grocery.recordItem(userCategory, userItem, userAmount);
                } else if (yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("No")) {
                    grocery.viewList();
                    System.out.println("goodbye");
                    return;
                }
            }
        }
    }
}
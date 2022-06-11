package grades;
import java.nio.charset.StandardCharsets;
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
        Collections.sort(item.get("produce"));
        Collections.sort(item.get("dairy"));
        Collections.sort(item.get("meat"));
        Collections.sort(item.get("beverages"));
        Collections.sort(item.get("sweets"));
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
                    System.out.println("would you like to edit item? [y/n]");
                    yesNo = scanner.next();
                    if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {
                        System.out.print("enter old category: ");
                        scanner.nextLine();
                        String oldCategory = scanner.nextLine();
                        System.out.print("enter old item:");
                        String oldItem = scanner.nextLine();
                        System.out.print("enter new item: ");
                        String newItem = scanner.next();
                        System.out.print("enter new amount: ");
                        String newAmount = scanner.next();
                        String newItemAmount = newItem + " * " + newAmount;
                        for(String gro: grocery.item.get(oldCategory)) {
                            if(gro.startsWith(oldItem)) {
                                oldItem = gro;
                                System.out.println("this is the selected product: " + gro);
                                break;
                            }
                        }
                        grocery.item.get(oldCategory).remove(oldItem);
                        grocery.item.get(oldCategory).add(newItemAmount);
                        grocery.viewList();
                    } else {
                        System.out.println("goodbye");
                        return;
                    }
                }
            }
        }
    }
}
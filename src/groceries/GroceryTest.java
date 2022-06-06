package groceries;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grocery listOne = new Grocery();

        System.out.println("Would you like to create a grocery list? [y/n]");
        String yesNo = scanner.next();
        if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {
            System.out.println(listOne.categories);
            System.out.print("Would you like to enter a new item? [y/n] ");
            yesNo = scanner.next();
            if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {
                System.out.print("select a category: ");
                String userCategory = scanner.next();
                System.out.print("name of item: ");
                scanner.nextLine();
                String userItem = scanner.nextLine();
                System.out.print("item x ");
                int userAmount = scanner.nextInt();
                HashMap userHashMap = new HashMap<String, Integer>();
                userHashMap.put(userItem, userAmount);
                listOne.createGroceryList(userCategory, userHashMap);
                System.out.println(listOne.groceryList);
                System.out.println(listOne.categories);
                }
            }
        }
    }

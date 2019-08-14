package grades;

import util.Input;

import java.util.*;

public class GroceryList {
    static Input input = new Input();
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, List<HashMap<String, String>>> groceryList = new HashMap<>();
    static boolean choice = true;

    public static void main(String[] args) {
        System.out.println("would you like to make a grocery list?");
        String yesNo = scanner.nextLine();
        if(yesNo.equalsIgnoreCase("yes")) {
            System.out.println("Choose a category: ");
            System.out.println("toiletries, groceries, pharmacy");
            String category = scanner.nextLine();

            while (choice) {
                System.out.println("enter name of toiletry: ");
                String groceryItem = scanner.nextLine();
                System.out.println("enter amount of toiletry: ");
                String numOfGrocItem = scanner.nextLine();
                List<HashMap<String, String>> toiletMap = new ArrayList<>();
                HashMap<String, String> item = new HashMap<>();

                item.put(numOfGrocItem, groceryItem);
                toiletMap.add(item);
                groceryList.put(category, toiletMap);
                System.out.println("do you want to add another item? y/n");
                String answer = scanner.nextLine();
                if(answer.equalsIgnoreCase("n")) {
                    choice = false;
                    System.out.println("bye");
                }
            }
            for (Map.Entry<String, List<HashMap<String, String>>> cat : groceryList.entrySet()) {
                System.out.println(cat.getKey());
                System.out.println(cat.getValue());
            }
        }
    }


}

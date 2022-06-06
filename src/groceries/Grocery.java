package groceries;

import java.util.ArrayList;
import java.util.HashMap;

public class Grocery {
    public ArrayList<String> categories;
    public HashMap<String, Double> itemAndAmount;
    public HashMap<String, HashMap<String, Double>> groceryList;

    public Grocery() {
        itemAndAmount = new HashMap<>();
        categories = new ArrayList<>();
        groceryList = new HashMap<>();
        categories.add("produce");
        categories.add("dairy");
        categories.add("meat");
        categories.add("beverages");
        categories.add("sweets");
    }

    public void createGroceryList(String category, HashMap hashMap) {
        if(categories.contains(category)) {
            groceryList.put(category, hashMap);
        } else {
            categories.add(category);
        }
        groceryList.put(category, hashMap);
    }

    public void addCategory(String category) {
        categories.add(category);
    }

}

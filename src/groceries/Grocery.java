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
    }

    public void createGroceryList(String category, HashMap hashMap) {
        groceryList.put(category, hashMap);
    }

    public void addCategory(String category) {
        categories.add(category);
    }

}

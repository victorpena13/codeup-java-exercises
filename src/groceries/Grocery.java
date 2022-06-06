package groceries;

import java.util.ArrayList;
import java.util.HashMap;

public class Grocery {
    public String item;
    public ArrayList<String> categories;
    public HashMap<Integer, String> list;

    public Grocery() {
        categories = new ArrayList<>();
        list = new HashMap<>();
    }

    public void addCategory(String category) {
        categories.add(category);
    }

    public void


}

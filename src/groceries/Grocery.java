package groceries;


import java.util.HashMap;

public class Grocery {
    private String category;
    private HashMap item;
    private String amount;

    public Grocery(String category, String item, String amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }


    public String getAmount() {
        return amount;
    }

    public String getCategoryItemAmount() {
        return category + " " + item + " " + amount;
    }


}

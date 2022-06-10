package groceries;


public class Grocery {
    private String category;
    private String item;
    private String amount;

    public Grocery(String category, String item, String amount) {
        this.category = category;
        this.item = item;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public String getItem() {
        return item;
    }

    public String getAmount() {
        return amount;
    }

    public String getCategoryItemAmount() {
        return category + " " + item + " " + amount;
    }


}

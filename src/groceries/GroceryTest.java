package groceries;

public class GroceryTest {

    public static void main(String[] args) {
        Grocery groceries = new Grocery();

        groceries.addCategory("produce");
        groceries.addCategory("dairy");
        groceries.addCategory("meat");
        groceries.addCategory("beverages");
        groceries.addCategory("sweets");

        System.out.println(groceries.categories);

    }
}

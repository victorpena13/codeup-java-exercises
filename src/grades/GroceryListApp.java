package grades;

import util.Input;

public class GroceryListApp {



    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Welcome!");
        System.out.print("Would you like to create a Grocery List? [y/n]");
        String userResponse = input.getString();
        if(userResponse.equalsIgnoreCase("y")) {
            System.out.print("\nWould you like to enter a new item? [y/n]");
            userResponse = input.getString();
            if(userResponse.equalsIgnoreCase("y")) {
                System.out.println();
            }
        }


    }
}

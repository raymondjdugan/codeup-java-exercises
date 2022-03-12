package collections.grocery_list;

import util.Input;

import java.util.*;

public class GroceryApp {
    private static final Input input = new Input();
    private static ArrayList<Map<String, Integer>> groceryList = new ArrayList<>
            (Arrays.asList(new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(),
                    new HashMap<>(), new HashMap<>(), new HashMap<>()));

    public static void main(String[] args) {
        while (input.yesNo("Would you like to add an item grocery list? (y/n)")) {
            displayCategories();

            int category = input.getInt(1, 8, "Enter a number from above");


        }
    }

    private static void displayCategories() {
        System.out.println("Pick a category to enter a new item\n" +
                "1. Produce\n" +
                "2. Fruit\n" +
                "3. Meat/Fish\n" +
                "4. Dairy\n" +
                "5. Bread\n" +
                "6. Snacks\n" +
                "7. Frozen\n" +
                "8. Baking\n");
    }

    private static void createItem(String category) {
        String itemName = input.getString("Enter the name of the item.");
        int itemQuantity = input.getInt("Enter the quantity for " + itemName + "(s)");

        HashMap<String, Integer> item = new HashMap<>();
        item.put(itemName, itemQuantity);
        addItemToList(item);
    }

    private static void addItemToList(HashMap<String, Integer> item) {

    }
}

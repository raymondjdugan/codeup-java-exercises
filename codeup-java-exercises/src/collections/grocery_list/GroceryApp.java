package collections.grocery_list;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroceryApp {
    private static final Input input = new Input();

    public static void main(String[] args) {
        HashMap<String, Integer> produce, fruit, meat, dairy, bread, snacks, frozen, baking;
        produce = new HashMap<>();
        fruit = new HashMap<>();
        meat = new HashMap<>();
        dairy = new HashMap<>();
        bread = new HashMap<>();
        snacks = new HashMap<>();
        frozen = new HashMap<>();
        baking = new HashMap<>();
        ArrayList<Map<String, Integer>> groceryList = new ArrayList<>(Arrays.asList(produce, fruit, meat, dairy, bread, snacks, frozen, baking));

        while (input.yesNo("Would you like to create a grocery list? (y/n)")) {
            displayCategories();
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

    private static Map<String, Integer> createItem(String category) {
        String itemName = input.getString("Enter the name of the item.");
        int itemQuantity = input.getInt("Enter the quantity for " + itemName + "(s)");

        HashMap<String, Integer> item = new HashMap<>();
        item.put(itemName, itemQuantity);
        return item;
    }
}

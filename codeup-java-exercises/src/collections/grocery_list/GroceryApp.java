package collections.grocery_list;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class GroceryApp {
    private static final Input input = new Input();
    private static ArrayList<TreeMap<String, Integer>> groceryList = new ArrayList<>();
    static TreeMap<String, Integer> produce = new TreeMap<>();
    static TreeMap<String, Integer> fruit = new TreeMap<>();
    static TreeMap<String, Integer> meat = new TreeMap<>();
    static TreeMap<String, Integer> dairy = new TreeMap<>();
    static TreeMap<String, Integer> bread = new TreeMap<>();
    static TreeMap<String, Integer> snacks = new TreeMap<>();
    static TreeMap<String, Integer> frozen = new TreeMap<>();
    static TreeMap<String, Integer> baking = new TreeMap<>();

    public static void main(String[] args) {
        groceryList.addAll(Arrays.asList(produce, fruit, meat, dairy, bread, snacks, frozen, baking));

        do {
            displayCategories();

            int category = input.getInt(1, 8, "Enter a number from above");
            addItemToList(category);
        } while (input.yesNo("Would you like to finalize the list? (y/n)"));
        printResults();
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

    private static GroceryItem createItem() {
        String itemName = input.getString("Enter the name of the item.");
        int itemQuantity = input.getInt("Enter the quantity for " + itemName + "(s)");
        return new GroceryItem(itemName, itemQuantity);
    }

    private static void addItemToList(int category) {
        GroceryItem item = createItem();
        switch (category) {
            case 1:
                produce.put(item.getName(), item.getQuantity());
                break;
            case 2:
                fruit.put(item.getName(), item.getQuantity());
                break;
            case 3:
                meat.put(item.getName(), item.getQuantity());
                break;
            case 4:
                dairy.put(item.getName(), item.getQuantity());
                break;
            case 5:
                bread.put(item.getName(), item.getQuantity());
                break;
            case 6:
                snacks.put(item.getName(), item.getQuantity());
                break;
            case 7:
                frozen.put(item.getName(), item.getQuantity());
                break;
            case 8:
                baking.put(item.getName(), item.getQuantity());
                break;
        }
    }

    private static String printCategory(int index){
        switch(index) {
                case 1:
                    return "Produce";
                case 2:
                    return "Fruits";
                case 3:
                    return "Meat/Fish";
                case 4:
                    return "Dairy";
                case 5:
                    return "Bread";
                case 6:
                    return "Snacks";
                case 7:
                    return "Frozen";
                case 8:
                    return "Baking";
            }
            return "Category Not Found";
    }

    private static void printResults(){
        int index = 0;
        for (TreeMap<String, Integer> category: groceryList) {
            if (!groceryList.get(index).isEmpty()){
                System.out.println(printCategory(index + 1));
                category.forEach((name, quantity) -> {
                    System.out.println("Item: " + name + " | Quantity: " + quantity);
                }) ;
            }
            index++;
        }
    }
}

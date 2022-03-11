package collections.grocery_list;

import java.util.ArrayList;
import java.util.Map;

public class GroceryList {
    private static ArrayList<Map<String, Integer>> groceryList;

    public GroceryList() {
        groceryList = new ArrayList<>();
    }

    public void setCategory(Map<String, Integer> category) {
        groceryList.add(category);
    }

    public Map<String, Integer> getCategory(Map<String, Integer>  category){
        return groceryList.get(groceryList.indexOf(category));
    }
}

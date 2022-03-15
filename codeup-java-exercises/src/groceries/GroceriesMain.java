package groceries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class GroceriesMain {
    public static void main(String[] args) {
        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        Path filepath = Paths.get( "src", "data", "groceries.txt");
        try {
            Files.write(filepath, groceryList);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Path groceriesPath = Paths.get("data", "groceries.txt");
//        try {
//            groceryList = Files.readAllLines(groceriesPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        for (int i = 0; i < groceryList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + groceryList.get(i));
//        }
    }
}

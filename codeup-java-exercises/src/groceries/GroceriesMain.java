package groceries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceriesMain {
    public static void main(String[] args) {

        // Creates a groceryList with the values
        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        // This Creates A File Named groceries.txt through filepath of src/data/groceries.txt
        // and passes the values into the txt file
        Path filepath = Paths.get( "src", "data", "groceries.txt");
//        try {
//            Files.write(filepath, groceryList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            Files.write(
                    Paths.get(String.valueOf(filepath)),
                    Arrays.asList("eggs"), // list with one item
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("src","data", "groceries.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }
        System.out.println(newList);

        try {
            Files.write(Paths.get("src","data", "groceries.txt"), newList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reads the data and prints out
        Path groceriesPath = Paths.get("src","data", "groceries.txt");
        try {
            groceryList = Files.readAllLines(groceriesPath);
        } catch (IOException e) {
            System.out.println("Cannot read file. Check file path.");
            e.printStackTrace();
        }

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }
    }
}

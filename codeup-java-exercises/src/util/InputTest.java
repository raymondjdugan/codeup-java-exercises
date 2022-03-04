package util;

public class InputTest {
    public static void main(String[] args) {
        System.out.println(Input.getString("Please enter a sentence"));
        System.out.println(Input.yesNo("Yes or No"));
        System.out.println(Input.getInt("Enter an integer"));
        System.out.println(Input.getInt(1, 10, "Please enter a number between 1 and 10"));
        System.out.println(Input.getDouble("Enter a decimal number"));
        System.out.println(Input.getDouble(3.2, 3.6, "Enter a number between 3.2 and 3.6"));
    }
}

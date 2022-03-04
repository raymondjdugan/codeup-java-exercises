package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString("Please enter a sentence"));
        System.out.println(input.yesNo("Yes or No"));
        System.out.println(input.getInt("Enter an integer"));
        System.out.println(input.getInt(1, 10, "Please enter a number between 1 and 10"));
        System.out.println(input.getDouble("Enter a decimal number"));
        System.out.println(input.getDouble(3.2, 3.6, "Enter a number between 3.2 and 3.6"));
    }
}

package ConsoleExercies;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //TODO: Copy this code into your main method:
        // Copied to clipboard
        // double pi = 3.14159
        // Write some Java code that uses the variable pi to output the following:
        // The value of pi is approximately 3.14.
        // Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
        double pi = 3.14159;
        System.out.format("The value of PI is approximately %s%n",pi);

        //TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userInput = input.nextInt();
        System.out.format("You entered: %s%n", userInput);
        //TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter three words");
        String firstWord = input.next();
        String secondWord = input.next();
        String thirdWord = input.next();
        System.out.printf("%s %s %s",firstWord,secondWord,thirdWord);
    }
}

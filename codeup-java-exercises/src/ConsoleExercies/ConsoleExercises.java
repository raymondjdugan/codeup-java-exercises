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
        System.out.printf("%s %s %s%n",firstWord,secondWord,thirdWord);

        //TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        System.out.println("Enter a sentence");
        String userSentence = input.nextLine();
        System.out.println(userSentence);

//        Calculate the perimeter and area of Codeup's classrooms.
        System.out.println("Enter the length of the room");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("Enter the length of the room");
        int width = Integer.parseInt(input.nextLine());
        int perimeter = length * width;
        int area = (length * 2) + (width * 2);
        System.out.printf("The perimeter of the classroom is: %sft%n", perimeter);
        System.out.printf("The area of the classroom is: %sft\u00B2%n", area);
        System.out.println("Enter the length, width and height of a room. I.E. L/W/H");


        int myInt = input.nextInt();
        System.out.println("1 Int? " + input.hasNextInt());
        input.nextInt();
        System.out.println("2 Int? " + input.hasNextInt());
        input.close();
    }
}

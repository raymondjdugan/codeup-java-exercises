package strings;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean activeConversation = true;
        while (activeConversation) {
            System.out.println("Bob says: \"What's up\"");
            String userInput = input.nextLine().trim();
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Do you want to continue the conversation? Y or N");
            String userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("n")) {
                activeConversation = false;
            }
        }
    }
}

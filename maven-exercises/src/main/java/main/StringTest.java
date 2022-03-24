package main;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String userInput = input.nextLine();
        System.out.println("You Entered " + "\"" + userInput + "\"" );
        String isNum = StringUtils.isNumeric(userInput) ? " is a number" : " is not a number";
        System.out.println("\"" + userInput + "\""  + isNum);
        System.out.println("Flipped Case " + "\"" + StringUtils.swapCase(userInput) + "\"" );
        System.out.println("Reversed " + "\"" + StringUtils.reverse(userInput) + "\"");
    }
}

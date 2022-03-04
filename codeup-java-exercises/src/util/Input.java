package util;

import java.util.Scanner;

public class Input {
    private static final Scanner input = new Scanner(System.in);

    public static String getString() {
        return input.nextLine();
    }
    public static String getString(String prompt) {
        System.out.println(prompt);
        return input.nextLine();
    }

    public static boolean yesNo(){
        String userInput = input.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public static boolean yesNo(String prompt){
        System.out.println(prompt);
        String userInput = input.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public static int getInt(){
        return input.nextInt();
    }

    public static int getInt(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }

    public static int getInt(int min, int max){
        int userInput = input.nextInt();
        if (userInput < min || userInput > max) {
            System.out.printf("%d is not a valid number between %d and %d%n", userInput, min, max);
            return getInt(min, max);
        }
        return userInput;
    }

    public static int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int userInput = input.nextInt();
        if (userInput < min || userInput > max) {
            System.out.printf("%d is not a valid number between %d and %d%n", userInput, min, max);
            return getInt(min, max, prompt);
        }
        return userInput;
    }

    public static double getDouble() {
        return input.nextDouble();
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        return input.nextDouble();
    }

    public static double getDouble(double min, double max) {
        double userInput = input.nextDouble();
        if (userInput < min || userInput > max) {
            System.out.printf("%.1f is not a valid number between %.1f and %.1f%n", userInput, min, max);
            return getDouble(min, max);
        }
        return userInput;
    }

    public static double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double userInput = input.nextDouble();
        if (userInput < min || userInput > max) {
            System.out.printf("%.1f is not a valid number between %.1f and %.1f%n", userInput, min, max);
            return getDouble(min, max, prompt);
        }
        return userInput;
    }




}


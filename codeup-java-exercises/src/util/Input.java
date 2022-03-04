package util;

import java.util.Scanner;

public class Input {
    private final Scanner input = new Scanner(System.in);

    public String getString() {
        return input.nextLine();
    }
    public String getString(String prompt) {
        System.out.println(prompt);
        return input.nextLine();
    }

    public String getNextString() {
        return input.next();
    }
    public String getNextString(String prompt) {
        System.out.println(prompt);
        return input.next();
    }

    public boolean yesNo(){
        String userInput = input.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userInput = input.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(){
        return input.nextInt();
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }

    public int getInt(int min, int max){
        int userInput = input.nextInt();
        if (userInput < min || userInput > max) {
            System.out.printf("%d is not a valid number between %d and %d%n", userInput, min, max);
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int userInput = input.nextInt();
        if (userInput < min || userInput > max) {
            System.out.printf("%d is not a valid number between %d and %d%n", userInput, min, max);
            return getInt(min, max, prompt);
        }
        return userInput;
    }

    public double getDouble() {
        return input.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return input.nextDouble();
    }

    public double getDouble(double min, double max) {
        double userInput = input.nextDouble();
        if (userInput < min || userInput > max) {
            System.out.printf("%.1f is not a valid number between %.1f and %.1f%n", userInput, min, max);
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double userInput = input.nextDouble();
        if (userInput < min || userInput > max) {
            System.out.printf("%.1f is not a valid number between %.1f and %.1f%n", userInput, min, max);
            return getDouble(min, max, prompt);
        }
        return userInput;
    }




}


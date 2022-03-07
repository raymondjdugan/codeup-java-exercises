package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public String getNextString(String prompt) {
        System.out.println(prompt);
        return scanner.next();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(String prompt) {
        while(true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                int nextInt = scanner.nextInt();
                scanner.nextLine();
                return nextInt;
            }
        }
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.printf("%d is not a valid number between %d and %d%n", userInput, min, max);
            return getInt(min, max, prompt);
        }
        return userInput;
    }

    public double getDouble(String prompt) {
        while(true) {
            System.out.println(prompt);
            if (scanner.hasNextDouble()) {
                double nextDouble = scanner.nextDouble();
                scanner.nextLine();
                return nextDouble;
            }
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            System.out.printf("%.1f is not a valid number between %.1f and %.1f%n", userInput, min, max);
            return getDouble(min, max, prompt);
        }
        return userInput;
    }

    public void close(){
        scanner.close();
    }

}


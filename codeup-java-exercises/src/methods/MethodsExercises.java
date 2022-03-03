package methods;

import java.util.Scanner;

public class MethodsExercises {
    static Scanner input = new Scanner(System.in);
    //TODO 1: Basic Arithmetic
    //Method for finding the sum of two numbers
    public static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    // Method for finding the difference of two numbers
    public static int difference(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    // Method for finding the product of two numbers
    public static int productOne(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    // Method to find the product of two numbers without using the * symbol
    public static int productTwo(double firstNum, int secondNum) {
        int result = 0;
        for (int i = 1; i <= secondNum; i++) {
            result += firstNum;
        }
        return result;
    }

    // Method of finding the product of two numbers using recursion
    public static int productThree(int firstNum, int secondNum) {
        if (firstNum < secondNum) {
            return productThree(secondNum, firstNum);
        } else if (secondNum != 0) {
            return (firstNum + productThree(firstNum, secondNum - 1));
        } else {
            return 0;
        }
    }

    // Method to find the quotient of two numbers
    public static int quotient(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    // Method to find the remainder of two numbers
    public static int findRemainder(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }
    // END OF TODO 1

    //TODO 2: Create a method that validates that user input is in a certain range;
    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int userInput = input.nextInt();
        if (userInput < min || userInput > max) {
            System.out.printf("%d is not a valid number between %d and %d%n", userInput, min, max);
            return getInteger(min, max);
        }
        return userInput;
    }
    //END OF TODO 2

    //TODO 3: Calculate the factorial of a number
    public static long calculateFactorial(int factor) {
        long factorial = 1;
        for (int i = 1; i <= factor ; i++) {
            factorial *= i;
        }
        return factorial;
    }
    // END OF TODO 3

    // TODO 4: Dice Roll
    public static void diceRoll(int sides){
        int diceRoll1 = (int) (Math.random() * sides) + 1;
        int diceRoll2 = (int) (Math.random() * sides) + 1;
        System.out.printf("You rolled a %d and a %d%n", diceRoll1, diceRoll2);
    }

    public static void main(String[] args) {
        //TODO 1: Tests
        System.out.println(sum(2, 2));
        System.out.println(difference(2, 2));
        System.out.println(productOne(2, 6));
        System.out.println(productTwo(2, 6));
        System.out.println(productThree(2, 6));
        System.out.println(quotient(4, 2));
        System.out.println(findRemainder(10, 2));

        //TODO 2: Implementation
        int userInput = getInteger(1, 10);
        System.out.println(userInput);

        //TODO 3: Implementation
        int factorialInput = getInteger(1, 20);
        long factorialOutput = calculateFactorial(factorialInput);
        System.out.printf("The factorial for %d is %d%n", factorialInput, factorialOutput);

        //TODO 4: Implementation
        boolean userContinue = true;
        while (userContinue) {
            System.out.println("How many sides for the dice roll?");
            diceRoll(input.nextInt());
            System.out.println("Would you like to roll again? (y/n)");
            if (input.next().equalsIgnoreCase("n")){
                userContinue = false;
            }
        }
    }

}

package methods;

import java.util.Scanner;

public class HighLow {
    static Scanner sc = new Scanner(System.in);
    public static boolean userContinues(){
        System.out.println("Would you like to play again (y/n)");
        boolean keepPlaying = false;
        if (sc.next().equalsIgnoreCase("y")) {
            keepPlaying = true;
        }
        return keepPlaying;
    }

    public static void main(String[] args) {
        int numToGuess = (int) (Math.random() * 100) + 1;
        boolean playing = true;
        int numOfGuesses = 10;
        while (playing) {
            System.out.println("Guess a number between 1 and 100.");
            int userGuess = sc.nextInt();
            if (userGuess > numToGuess) {
                System.out.printf("%d is too high%n", userGuess);
                numOfGuesses--;
            } else if (userGuess < numToGuess) {
                System.out.printf("%d is too low%n", userGuess);
                numOfGuesses--;
            } else {
                System.out.printf("%d was the correct number%n", userGuess);
                playing = false;
            }
            if (numOfGuesses == 0 || !playing) {
                playing = userContinues();
            }
        }
    }
}

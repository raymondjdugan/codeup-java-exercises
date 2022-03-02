package control_flow_exercises;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        long i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        i = 2;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 100);

        i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);

        i = 2;
        do {
            System.out.println(i);
            i = (long) Math.pow( i,  2);
        } while (i <= 1_000_000);

        for (i = 100; i >= -10; i -=5) {
            System.out.println(i);
        }

        for (i = 2; i <= 1_000_000;  i = (long) Math.pow(i,  2)) {
            System.out.println(i);
        }

        for (int j = 0; j <= 100; j++) {
            if (j % 3 == 0 && j % 5 == 0 ) {
                System.out.println("FizzBuzz");
            } else if (j % 3 == 0) {
                System.out.println("Fizz");
            } else if (j % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(j);
            }
        }

        Scanner input = new Scanner(System.in);
        boolean active = true;
        while (active) {
            System.out.println("What number would you like to see a table of square and cubes for?");
            int userNum = input.nextInt();
            System.out.println();
            System.out.println("Here is your table");
            System.out.println();
            System.out.println("Number | Squared | Cubed");
            System.out.println("______ | _______ | _____");

            for (int j = 1; j <= userNum; j++) {
                System.out.printf("%-7s| %-8s| %s%n", j, (int) Math.pow(j, 2), (int) Math.pow(j, 3));
            }
            System.out.println("Do you want to continue y or n");
            String userContinue = input.next();
            if (!userContinue.equalsIgnoreCase("y")) {
                active = false;
            }
        }


        System.out.println("Enter a numerical grade from 0-100");
        int numericalGrade = input.nextInt();
        if (numericalGrade <= 100 && numericalGrade >= 88) {
            if (numericalGrade >=95) {
                System.out.println("A+");
            } else if (numericalGrade >=91) {
                System.out.println("A");
            } else {
                System.out.println("A-");
            }
        } else if (numericalGrade <= 87 && numericalGrade >= 80) {
            if (numericalGrade >=85) {
                System.out.println("B+");
            } else if (numericalGrade >=82) {
                System.out.println("B");
            } else {
                System.out.println("B-");
            }
        } else if (numericalGrade <= 79 && numericalGrade >= 67) {
            if (numericalGrade >=76) {
                System.out.println("C+");
            } else if (numericalGrade >=71) {
                System.out.println("C");
            } else {
                System.out.println("C-");
            }
        } else if (numericalGrade <= 66 && numericalGrade >= 60) {
            if (numericalGrade >= 64) {
                System.out.println("D+");
            } else if (numericalGrade >= 62) {
                System.out.println("D");
            } else {
                System.out.println("D-");
            }
        } else  {
            System.out.println("F");
        }
    }
}

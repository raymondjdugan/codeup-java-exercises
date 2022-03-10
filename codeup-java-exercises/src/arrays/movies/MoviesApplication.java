package arrays.movies;

import util.Input;

public class MoviesApplication {
    private static boolean userContinue = true;
    private static void init(Input userInput){
        while(userContinue) {
            printMovies(getCategory(userChoice(userInput)));
        }
    }
    private static int userChoice(Input input) {
        System.out.println("What would you like to do?\n");
        System.out.println("0 - Exit");
        System.out.println("1 - View all movies");
        System.out.println("2 - View movies in the Animated category");
        System.out.println("3 - View movies in the Drama category");
        System.out.println("4 - View movies in the Horror category");
        System.out.println("5 - View movies in the Sci-Fi category\n");
        return input.getInt("Enter your choice");
    }

    private static String getCategory(int userChoice) {
        switch (userChoice) {
            case 1:
                return "full";
            case 2:
                return "animated";
            case 3:
                return "drama";
            case 4:
                return "horror";
            case 5:
                return "scifi";
            default:
                return "goodbye";
        }
    }

    private static void printMovies(String userChoice) {
        if (userChoice.equals("goodbye")) {
            System.out.println("Have a nice day");
            userContinue = false;
        } else if (userChoice.equals("full")) {
            for (Movie movie : MoviesArray.findAll()) {
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        } else {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals(userChoice))
                    System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {
        Input userInput = new Input();
        init(userInput);
    }
}

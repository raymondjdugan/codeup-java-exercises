package arrays.movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    private static boolean userContinue = true;
    private static final Input userInput = new Input();
    private static Movie[] myMovies = MoviesArray.findAll();

    private static void init(){
        while(userContinue) {
            printMovies(getCategory(userChoice()));
        }
    }

    private static int userChoice() {
        System.out.println("What would you like to do?\n");
        System.out.println("0 - Exit");
        System.out.println("1 - Add movie");
        System.out.println("2 - View all movies");
        System.out.println("3 - View movies in the Animated category");
        System.out.println("4 - View movies in the Drama category");
        System.out.println("5 - View movies in the Horror category");
        System.out.println("6 - View movies in the Sci-Fi category\n");
        return userInput.getInt(0, 6, "Enter your choice");
    }

    private static String getCategory(int userChoice) {
        switch (userChoice) {
            case 1:
                return "add";
            case 2:
                return "full";
            case 3:
                return "animated";
            case 4:
                return "drama";
            case 5:
                return "horror";
            case 6:
                return "scifi";
            default:
                return "goodbye";
        }
    }

    private static void createMovie(){
        String name = userInput.getNextString("What is the name of the movie?");
        String category = userInput.getNextString("What is the category of the movie?");

        Movie[] newMoviesArray = Arrays.copyOf(myMovies, myMovies.length + 1);
        newMoviesArray[newMoviesArray.length - 1] = new Movie(name, category);
        myMovies = newMoviesArray;
    }

    private static void printMovies(String userChoice) {
        if (userChoice.equals("goodbye")) {
            System.out.println("Have a nice day");
            userContinue = false;
        }
        if (userChoice.equals("add")) {
            createMovie();
        }
        if (userChoice.equals("full")) {
            for (Movie movie : myMovies) {
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        } else {
            for (Movie movie : myMovies) {
                if (movie.getCategory().equals(userChoice))
                    System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {
        init();

        userInput.close();
    }
}

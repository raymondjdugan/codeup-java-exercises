package arrays.movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    private static final Input userInput = new Input();
    private static Movie[] movies = MoviesArray.findAll();

    private static void printMenu() {
        System.out.println("What would you like to do?\n");
        System.out.println("0 - Exit");
        System.out.println("1 - Add movie");
        System.out.println("2 - View all movies");
        System.out.println("3 - View movies in the Animated category");
        System.out.println("4 - View movies in the Drama category");
        System.out.println("5 - View movies in the Horror category");
        System.out.println("6 - View movies in the Sci-Fi category");
        System.out.println("7 - View movies in the Comedy category");
        System.out.println("8 - View movies in the Action category\n");
    }

    private static void doUserChoice(int userChoice) {
        switch (userChoice) {
            case 1:
                createMovie();
            case 2:
                printMovies();
                break;
            case 3:
                printMovies("animated");
               break;
            case 4:
                printMovies("drama");
                break;
            case 5:
                printMovies("horror");
                break;
            case 6:
                printMovies("scifi");
                break;
            case 7:
                printMovies("comedy");
                break;
            case 8:
                printMovies("action");
                break;
            default:
                break;
        }
    }

    private static void printMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private static void printMovies(String userChoice) {
        for (Movie movie : movies) {
            if (movie.getCategory().equals(userChoice))
                System.out.println(movie);
        }
    }

    private static void createMovie() {
        String name = userInput.getNextString("What is the name of the movie?");
        String category = userInput.getNextString("What is the category of the movie?");

        Movie[] newMoviesArray = Arrays.copyOf(movies, movies.length + 1);
        newMoviesArray[newMoviesArray.length - 1] = new Movie(name, category);
        movies = newMoviesArray;
    }

    public static void main(String[] args) {
        int userChoice = 0;

        do {
            printMenu();

            userChoice = userInput.getInt(0, 6, "Enter your choice");

           doUserChoice(userChoice);
        } while (userChoice != 0);

        System.out.println("Thank you come again");

        userInput.close();
    }
}

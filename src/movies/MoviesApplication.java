package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        System.out.print("Enter your choice: ");
        double userInput = input.getDouble();

        System.out.println(MoviesArray.findAll());

        for(Movie movie : MoviesArray.findAll()) {
            System.out.println(movie.getName());
        }
    }

}

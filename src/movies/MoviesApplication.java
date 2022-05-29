package movies;

import util.Input;

import static java.lang.Integer.parseInt;

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
        String userInput = input.getString();


        switch (parseInt(userInput)){
            case 0:
                break;
            case 1:
                for(Movie movie : MoviesArray.findAll()) {
                    System.out.print(movie.getNameCategory());
                }
                break;
            case 2:
                for(Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getNameCategory());
                    }
                }
                break;
            case 3:
                for(Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getNameCategory());
                    }
                }
                break;
            case 4:
                for(Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getNameCategory());
                    }
                }
                break;
            case 5:
                for(Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movie.getNameCategory());
                    }
                }
                break;
        }
    }

}

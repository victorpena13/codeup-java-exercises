package movie;

import movies.Movie;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("select an option: ");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - animated");
        System.out.println("3 - drama");
        System.out.println("4 - horror");
        System.out.println("5 - scifi");
        System.out.print("enter you selection: ");
        int userInput = scanner.nextInt();

        switch(userInput) {
            case 1 :
                for(Movie movie: MoviesArray.findAll()) {
                    System.out.println(movie.getNameCategory());
                }
                break;
            case 2 :
                for (Movie movie: MoviesArray.findAll()) {
                    if(movie.getCategory().equalsIgnoreCase("animated")){
                        System.out.println(movie.getNameCategory());
                    }
                }
                break;
            case 3 :
                for(Movie movie: MoviesArray.findAll()) {
                    if(movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getNameCategory());
                    }
                }
                break;
            case 4 :
                for(Movie movie: MoviesArray.findAll()) {
                    if(movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getNameCategory());
                    }
                }
                break;
            case 5 :
                for(Movie movie: MoviesArray.findAll()) {
                    if(movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movie.getNameCategory());
                    }
                }
                break;

        }

    }
}

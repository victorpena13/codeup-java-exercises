package movies;

import java.util.Scanner;

public class MoviesApplication {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
//        System.out.println(displayAllMovies(movies, "all"));
////        System.out.println(displayAllMovies(movies, "drama"));
        System.out.println("To Display all movies type 'All':");
        System.out.println("To Display movies by category type: 'Drama, 'Comedy', 'Musical', 'Horror', 'SciFi, 'Animated':");
        String categoryOfMovie = scanner.nextLine();
        System.out.println(displayAllMovies(movies, categoryOfMovie));



        }

    public static String displayAllMovies(Movie[] movies, String category) {
        String moviesAllText = "";
        String moviesText = "";
        for (int i = 0; i < movies.length; i++) {
            if(category.equalsIgnoreCase("all")){
                for(Movie n : MoviesArray.findAll()){
                    moviesAllText += (n.getName() + " - " + n.getCategory() + " ") + "\n";
                }
                return moviesAllText;
            }
            if (movies[i].getCategory().equalsIgnoreCase(category)){
                moviesText += (movies[i].getName() + " - " + movies[i].getCategory() + " ") + " \n ";
            }
        }
        return moviesText;
    }

}


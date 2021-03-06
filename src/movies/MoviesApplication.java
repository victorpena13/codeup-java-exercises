package movies;

import java.util.Scanner;

public class MoviesApplication {
    static Scanner scanner = new Scanner(System.in);
    static boolean choice = true;


    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();

    while(choice){
        System.out.println("To Display all movies type 'All':");
        System.out.println("To Display movies by category type: 'Drama, 'Comedy', 'Musical', 'Horror', 'SciFi, 'Animated':");
        System.out.println("Else type 'bye' to exit app");
        String categoryOfMovie = scanner.nextLine();
        System.out.println(displayAllMovies(movies, categoryOfMovie));
        if(categoryOfMovie.equalsIgnoreCase("bye")){
            choice = false;
            System.out.println("bye");
        }
    }


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


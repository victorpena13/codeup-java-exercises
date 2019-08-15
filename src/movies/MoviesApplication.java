package movies;

public class MoviesApplication {


    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        System.out.println(displayAllMovies(movies, ""));
        System.out.println(displayAllMovies(movies, "drama"));

        }


    public static String displayAllMovies(Movie[] movies, String category) {
        String moviesAllText = "";
        String moviesText = "";
        for (int i = 0; i < movies.length; i++) {
            if(category.isEmpty()){
                for(Movie n : MoviesArray.findAll()){
                    moviesAllText += (n.getName() + " " + n.getCategory() + " ") + " | ";
                }
                return moviesAllText;
            }
            if (movies[i].getCategory().equalsIgnoreCase(category)){
                moviesText += (movies[i].getName() + " - " + movies[i].getCategory() + " ") + " | ";
            }
        }
        return moviesText;
    }



    }


package movies;

public class MoviesApplication {


    public static void main(String[] args) {
        Movie[] movie = MoviesArray.findAll();
        System.out.println(displayMovies(movie));

        }

        public static String displayMovies(Movie[] movie) {
        String movies = "";
        for (int i = 0; i < movie.length; i++) {
            movies += (movie[i].getName() + " - " + movie[i].getCategory());
        }
        return movies;
     }

    }


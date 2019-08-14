package movies;

public class MoviesApplication {


    public static void main(String[] args) {
        Movie[] movie = MoviesArray.findAll();
        System.out.println(displayAllMovies(movie));
        System.out.println();
        System.out.println(displayMovieByCategory(movie));

        }

        public static String displayMovieByCategory(Movie[] movie) {
        String moviesCat = "";
        for (int i = 0; i < movie.length; i++) {
            moviesCat += (movie[i].getCategory() + " ");
        }
        return  moviesCat;
        }

        public static String displayAllMovies(Movie[] movie) {
        String movies = "";
        for (int i = 0; i < movie.length; i++) {
            movies += (movie[i].getName() + " - " + movie[i].getCategory());
        }
        return movies;
     }



    }


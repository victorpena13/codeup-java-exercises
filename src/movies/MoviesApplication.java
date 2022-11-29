package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInt;
        do {
            System.out.println("0 - exit");
            System.out.println("1 - all");
            System.out.println("2 - animated");
            System.out.println("3 - drama");
            System.out.println("4 - horror");
            System.out.println("5 - scifi");
            System.out.println("6 - add");
            System.out.print("enter selection: ");
            userInt = scanner.nextInt();

            switch(userInt) {
                case 1:
                    for(Movie movie: MoviesArray.findAll()) {
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                    break;
                case 2:
                    for(Movie movie: MoviesArray.findAll()) {
                        if(movie.getCategory() == "animated") {
                            System.out.println(movie.getName() + " - " + movie.getCategory());

                        }
                    }
                    break;
                case 3:
                    for(Movie movie: MoviesArray.findAll()) {
                        if(movie.getCategory() == "drama") {
                            System.out.println(movie.getName() + " - " + movie.getCategory());

                        }
                    }
                    break;
                case 4:
                    for(Movie movie: MoviesArray.findAll()) {
                        if(movie.getCategory() == "horror") {
                            System.out.println(movie.getName() + " - " + movie.getCategory());

                        }
                    }
                    break;
                case 5:
                for(Movie movie: MoviesArray.findAll()) {
                    if(movie.getCategory() == "scifi") {
                        System.out.println(movie.getName() + " - " + movie.getCategory());

                    }
                }
                break;
            }
        } while(userInt != 0);


    }
}

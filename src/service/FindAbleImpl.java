package service;

import interfaces.FindAble;
import model.Movie;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FindAbleImpl implements FindAble {
    private List<Movie>movies;

    public FindAbleImpl(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Write full or part name of movie: ");
        String movieName= scanner.nextLine().toLowerCase();
        for (int i = 0; i < movies.size(); i++) {
            String currentMovieName = movies.get(i).getName().toLowerCase();
            if (currentMovieName.contains(movieName)) {
                System.out.println(movies.get(i));
            }

        }
    }


    @Override
    public void findMovieByActorName(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write actor name: ");
        String name=scanner.nextLine().toLowerCase();
        for (int i = 0; i < movies.size(); i++) {
            for (int j = 0; j < movies.get(i).getCast().size(); j++) {
                String currentMovie=movies.get(i).getCast().get(j).getActorFullName().toLowerCase();
                if (currentMovie.contains(name)) {
                    System.out.println(movies.get(i));
                }
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
      Scanner scanner=new Scanner(System.in);
        System.out.println("Write year movie :");
        int year= scanner.nextInt();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getYear()==year){
                System.out.println(movies.get(i));
            }

            }
        }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write director movie: ");
        String director=scanner.nextLine().toLowerCase();
        for (int i = 0; i < movies.size(); i++){
            String directorName=movies.get(i).getDirector().getName().toLowerCase();
            if (directorName.contains(director)){
                System.out.println(movies.get(i));
            }
        }

    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write movie genre: ");
        String genre=scanner.nextLine().toLowerCase();
        for (int i = 0; i < movies.size(); i++) {
            String genreName=movies.get(i).getGenre().toLowerCase();
            if (genreName.contains(genre)){
                System.out.println(movies.get(i));
            }

        }

    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write role: ");
        String role=scanner.nextLine().toLowerCase();
        for (int i = 0; i < movies.size(); i++) {
            for (int j = 0; j < movies.get(i).getCast().size(); j++) {
                String roleName=movies.get(i).getCast().get(j).getRole().toLowerCase();
                if (roleName.contains(role)){
                    System.out.println(movies.get(i));
                }
            }

            }





    }
}

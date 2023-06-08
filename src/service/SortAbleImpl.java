package service;

import interfaces.SortAble;
import model.Movie;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortAbleImpl implements SortAble {
   private List<Movie>movies;

    public SortAbleImpl(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void sortByMovieName(List<Movie> movies) {
        Collections.sort(movies);
        System.out.println(movies);
    }


    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(Movie.sortByYear);
        System.out.println(movies);
        System.out.println("sort by ascedin " +
                "-------------------------");
        movies.sort(Movie.sortByYearAscendin);
        System.out.println(movies);

    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(Movie.sortDirector);
        System.out.println(movies);

    }

}

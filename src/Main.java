import model.Cast;
import model.Director;
import model.Movie;
import service.FindAbleImpl;
import service.SortAbleImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cast cast1=new Cast("Jerard Batler","King Leonid");
        Cast cast2=new Cast("Sam Vortington","Avatar");
        Cast cast3=new Cast("Liam Neeson","Dad");
        Cast cast4=new Cast("Leonardo Dicaprio","Volk");
        LinkedList<Cast>casts1=new LinkedList<>(List.of(cast1));
        LinkedList<Cast>casts2=new LinkedList<>(List.of(cast2));
        LinkedList<Cast>casts3=new LinkedList<>(List.of(cast3));
        LinkedList<Cast>casts4=new LinkedList<>(List.of(cast4));
        LinkedList<Cast>casts5=new LinkedList<>(List.of(cast1,cast2,cast3,cast4));


        Director director1=new Director("Zack","Snaider");
        Director director2=new Director("James","Cameroon");
        Director director3=new Director("Martin ","Skorseze");
        Director director4=new Director("Perl","Morel");
        LinkedList<Director>directors1=new LinkedList<>(List.of(director1));
        LinkedList<Director>directors2=new LinkedList<>(List.of(director2));
        LinkedList<Director>directors3=new LinkedList<>(List.of(director3));
        LinkedList<Director>directors4=new LinkedList<>(List.of(director4));
        LinkedList<Director>directors5=new LinkedList<>(List.of(director1,director2,director3,director4));

        Movie movie1=new Movie("Spartanies",2006,"Adventure",director1,casts1);
        Movie movie2=new Movie("Avatar",2009,"Fantasy",director2,casts2);
        Movie movie3=new Movie("Hostage",2008,"Boevik",director4,casts3);
        Movie movie4=new Movie("Volk s vol-strit",2010,"Fantasy",director3,casts4);
        LinkedList<Movie>movies3=new LinkedList<>(List.of(movie1,movie2,movie3,movie4));


        FindAbleImpl findAbleImpl=new FindAbleImpl(movies3);
        System.out.println("-----------------------------");

        SortAbleImpl sortAbleImpl=new SortAbleImpl(movies3);
        System.out.println("-------------------------------------");
//        sortAbleImpl.sortByMovieName(movies3);
//        sortAbleImpl.sortByYear(movies3);
//        sortAbleImpl.sortByDirector(movies3);



        Scanner scanner=new Scanner(System.in);
        System.out.println("1.All movies" +
                "\n2.Find movie by full name or part name" +
                "\n3.Find movie by Actor name" +
                "\n4.Find movie by Year" +
                "\n5.Find movie by Director" +
                "\n6.Find movie by Genre" +
                "\n7.Find movie by Role");
        int x;
        while (true){
            x= scanner.nextInt();
            switch (x){
                case 1:{
                    System.out.println(findAbleImpl.getAllMovies(movies3));
                } case 2:{
                    findAbleImpl.findMovieByFullNameOrPartName(movies3);
                } case 3:{
                    findAbleImpl.findMovieByActorName(movies3);
                } case 4:{
                    findAbleImpl.findMovieByYear(movies3);
                } case 5:{
                    findAbleImpl.findMovieByDirector(movies3);
                } case 6:{
                    findAbleImpl.findMovieByGenre(movies3);
                } case 7:{
                    findAbleImpl.findMovieByRole(movies3);
                } Scanner scanner1=new Scanner(System.in);
                System.out.println("1.Sort by movie name: " +
                        "\n2.Sort by year movie: " +
                        "\n3.Sort by director: ");
                int z;
                while (true){
                    z=scanner1.nextInt();
                    switch (z){
                        case 1: {
                            sortAbleImpl.sortByMovieName(movies3);
                        } case 2:{
                            sortAbleImpl.sortByYear(movies3);
                        } case 3:{
                            sortAbleImpl.sortByDirector(movies3);
                        }
                    }
                }
            }

        }

    }
}
package interfaces.impl;

import interfaces.FindAble;
import movie.Cast;
import movie.Movie;

import java.util.*;

public class FindImpl implements FindAble {

    public static Scanner scanner = new Scanner(System.in);
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        boolean isSorted = false;
        System.out.println("Enter movie name: ");
        String movie = scanner.nextLine();
        for (Movie m: movies) {
            if(m.getName().equals(movie)){
                isSorted = true;
                System.out.print(m);
            }
        }
        if(!isSorted){
            System.out.println("No such Movie!");
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        boolean isSorted = false;
        System.out.println("Enter actor name:");
        String name = scanner.nextLine();
        for (Movie m: movies) {
            for (int i = 0; i < m.getCast().size(); i++) {
                if (m.getCast().get(i).getActorFullName().contains(name)) {
                    isSorted = true;
                    System.out.print("------------Actor-------------" +
                            "\nActor: " + m.getCast().get(i).getActorFullName() +
                            "\nRole: " + m.getCast().get(i).getRole() +
                            "\nMovie: " + m.getName() +
                            "\n-----------------------------\n");
                }
            }
        }
        if(!isSorted){
            System.out.println("No such Actor!");
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        boolean isSorted = false;
        System.out.println("Enter movie year:");
        int year = scanner.nextInt();
        for (Movie m : movies) {
            if (m.getYear() == year) {
                isSorted = true;
                System.out.print("------------Year-------------" +
                        "\nYear: " + m.getYear() +
                        "\nName: " + m.getName() +
                        "\nGenre: " + m.getGenre() +
                        "\n-----------------------------\n");
            }
        }
        if (!isSorted) {
            System.out.println("No such Year!");
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        boolean isSorted = false;
        System.out.println("Enter director name:");
        String name = scanner.nextLine();
        for (Movie m: movies) {
            if(m.getDirector().getName().equals(name) || m.getDirector().getLastName().equals(name)){
                System.out.print("------------Director-------------"+
                        "\nDirector: "+m.getDirector()+
                        "\nYear: "+m.getYear()+
                        "\nName: "+m.getName()+
                        "\nGenre: "+m.getGenre()+
                        "\n-----------------------------\n");
                isSorted = true;
            }
        }if(!isSorted){
            System.out.println("No such Director!");
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        boolean isSorted = false;
        System.out.println("Enter genre:");
        String genre = scanner.nextLine();
        for (Movie m: movies) {
                if (m.getGenre().contains(genre)) {
                    isSorted = true;
                    System.out.print("------------Genre-------------" +
                            "\nGenre: " + m.getGenre() +
                            "\nMovie: " + m.getName() +
                            "\nYear: " + m.getYear() +
                            "\n-----------------------------\n");
                }
        }
        if(!isSorted){
            System.out.println("No such Genre!");
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        boolean isSorted = false;
        System.out.println("Enter role:");
        String role = scanner.nextLine();
        for (Movie m: movies) {
            for (int i = 0; i < m.getCast().size(); i++) {
                if (m.getCast().get(i).getRole().equals(role)) {
                    isSorted = true;
                    System.out.print("------------Role-------------" +
                            "\nRole: " + m.getCast().get(i).getRole() +
                            "\nActor: " + m.getCast().get(i).getActorFullName() +
                            "\nMovie: " + m.getName() +
                            "\n-----------------------------\n");
                }
            }
        }
        if(!isSorted){
            System.out.println("No such Role!");
        }
    }
}

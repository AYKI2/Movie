package interfaces.impl;

import interfaces.SortAble;
import movie.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortImpl implements SortAble {
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void sortByMovieName(List<Movie> movies) {
        System.out.println("- from A to Z (1)");
        System.out.println("- from Z to A (2)");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
            movies.sort(new Comparator<Movie>() {
                @Override
                public int compare(Movie o1, Movie o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            System.out.println(movies);
                break;
            case 2:
                movies.sort(new Comparator<Movie>() {
                    @Override
                    public int compare(Movie o1, Movie o2) {
                        return o2.getName().compareTo(o1.getName());
                    }
                });
                System.out.println(movies);
                break;
                default:
                System.out.println("No such number!");
                break;
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        System.out.println("- Ascending (1)");
        System.out.println("- Descending (2)");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                movies.sort(new Comparator<Movie>() {
                    @Override
                    public int compare(Movie o1, Movie o2) {
                        return o1.getYear() - o2.getYear();
                    }
                });
                for (Movie m : movies) {
                    System.out.println("----------SortByYear----------" +
                            "\nYear: " + m.getYear() +
                            "\nName: " + m.getName() +
                            "\nGenre: " + m.getGenre() +
                            "\n-------------------------");
                }
                break;
            case 2:
                movies.sort(new Comparator<Movie>() {
                    @Override
                    public int compare(Movie o1, Movie o2) {
                        return o2.getYear() - o1.getYear();
                    }
                });
                for (Movie m : movies) {
                    System.out.println("----------SortByYear----------" +
                            "\nYear: " + m.getYear() +
                            "\nName: " + m.getName() +
                            "\nGenre: " + m.getGenre() +
                            "\n-------------------------");
                }
                break;
            default:
                System.out.println("No such number!");
                break;
        }
    }

    @Override
    public void sortByDirector(List <Movie> movies) {
        System.out.println("- sort by name (1)");
        System.out.println("- sort by lastname (2)");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                movies.sort(new Comparator<Movie>() {
                    @Override
                    public int compare(Movie o1, Movie o2) {
                        return o1.getDirector().getName().compareTo(o2.getDirector().getName());
                    }
                });
                for (Movie m : movies) {
                    System.out.println("----------SortByDirector----------" +
                            "\nDirector: " + m.getDirector() +
                            "\nYear: " + m.getYear() +
                            "\nName: " + m.getName() +
                            "\nGenre: " + m.getGenre() +
                            "\n-------------------------");
                }
                break;
            case 2:
                movies.sort(new Comparator<Movie>() {
                    @Override
                    public int compare(Movie o1, Movie o2) {
                        return o1.getDirector().getLastName().compareTo(o2.getDirector().getLastName());
                    }
                });
                for (Movie m : movies) {
                    System.out.println("----------SortByDirector----------" +
                            "\nDirector: " + m.getDirector() +
                            "\nYear: " + m.getYear() +
                            "\nName: " + m.getName() +
                            "\nGenre: " + m.getGenre() +
                            "\n-------------------------");
                }
                break;
            default:
                System.out.println("No such number!");
                break;
        }
    }
}
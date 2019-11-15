/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.moviesexam1.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Edison Lascano
 */
public class MoviesExam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Collection<Movie> movies = new ArrayList<>();
        
    Director director2 = new Director("estaban", "dido", "Ecuador");
        Movie movie2 = new Movie("spiderman", "peter parker", 2001, "webs", "USA", director2);
        
        System.out.println(movie2);

        Scanner in = new Scanner(System.in);
        Movie movie;
        Director director;

        do {
            System.out.println("insert title");
            String title = in.nextLine();
            System.out.println("insert synopsis");
            String synopsis = in.nextLine();
            System.out.println("insert year");
            int year = in.nextInt();
            in.nextLine();
            System.out.println("insert genre");
            String genre = in.nextLine();
            System.out.println("insert country");
            String country = in.nextLine();
            System.out.println("insert director first name");
            String directorFirstName = in.nextLine();
            System.out.println("insert director last name");
            String directorLastName = in.nextLine();
            System.out.println("insert director country");
            String directorCountry = in.nextLine();
            director = new Director(directorFirstName, directorLastName, directorCountry);
            movie = new Movie(title, synopsis, year, genre, country, director);
            movies.add(movie);

            System.out.println("MOVIES ARE --> " + Arrays.toString(movies.toArray()));


        } while (true);

    }

}

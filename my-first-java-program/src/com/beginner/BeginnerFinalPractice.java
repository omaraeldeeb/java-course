package com.beginner;
// choose actor - date of birth ( get age ) - movie titles with the rating
// variables: name - year of born - array for movie titles - array for rating
//what to print: 1. name - 2. year porn + the age 3. the function of the ratings
// function to return the movie title and the rating in the same line
public class BeginnerFinalPractice {
    public static void main(String[] args) {
        actorName("Al Pacino");
        actorAge(1940);
        String[] moviesTitles = {"We Are Not Animals", "Paterno", "Bad Bunny: Monaco", "Hangman", "The Godfather", "The Godfather Part II", "Scarface"};
        double[] moviesRating = {4.8, 6.5, 7.8, 5.2, 9.2, 9, 8.3};
        for (int i = 0; i < moviesRating.length ; i++) {
            System.out.println(moviesTitles[i] + "   -   " +moviesRatings(moviesRating[i]) );
        }
    }
    static void actorName(String name){
        System.out.println("Actor name: " + name);
    }
    static void actorAge(int year){
        System.out.println("Year of birth: " + year);
        System.out.println("Current age: " + (2023 - year));
    }


    static String moviesRatings(double ratings){
        if (ratings <= 5.0){
            return "bad";
        } else if (ratings > 5.0 && ratings <= 6.5){
            return "average";
        } else if (ratings > 6.5 && ratings <= 7.0){
            return "good";
        } else if (ratings > 7.0 && ratings <= 8.0){
            return "very good";
        }else{
            return "amazing";
        }
    }

}

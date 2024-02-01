package com.expert.methodreferences;

import java.util.Comparator;
import java.util.List;

public class MethodReferencesApp {

    public static void main(String[] args) {
        List<LorCharacters> characters = List.of(
                new LorCharacters("Gollum", 589),
                new LorCharacters("Frodo", 35 ),
                new LorCharacters("Gandalf", 2000),
                new LorCharacters("Aragon", 87),
                new LorCharacters("Sam" , 38),
                new LorCharacters("Gandalf", 86),
                new LorCharacters("Gandalf", 135));
    characters.stream()
            .sorted(Comparator.comparing(LorCharacters::getName).thenComparing(LorCharacters::getAge))
            .forEach(System.out::println);

        System.out.println("----------------------------------------");

//    LorCharactersComparisonProvider comparisonProvider = new LorCharactersComparisonProvider();
    characters.stream()
            .sorted(LorCharactersComparisonProvider::compareByNameAndAge)
            .forEach(System.out::println);



    }
}

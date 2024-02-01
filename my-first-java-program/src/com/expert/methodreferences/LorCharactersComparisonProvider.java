package com.expert.methodreferences;

import com.intermediate.thegreatrobbery.Person;

import java.util.Comparator;

public class LorCharactersComparisonProvider {
    public static int compareByNameAndAge(LorCharacters character1, LorCharacters character2){
        return Comparator.comparing(LorCharacters::getName)
                .thenComparing(LorCharacters::getAge)
                .compare(character1, character2);

    }
}

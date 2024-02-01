package com.intermediate.inheritance.champions;

public class ChampionsApp {
    public static void main(String[] args) {
        Fizz fizzOmar = new Fizz("Omar Daf", "Bronze", "EUW", "Fishing", 750, 0, .95f);
        fizzOmar.getDescription();
        fizzOmar.attack();
        fizzOmar.beInvincible();
        fizzOmar.useUltimate();
        fizzOmar.recallToBase();
    }
}

package com.intermediate.classesandobjects;

public class BasketballApp {
    public static void main(String[] args) {
        BasketballPlayer omar = new BasketballPlayer("Omar Abdelhamid", "Itachi", 1996, "Al Ahly", 84.5, 27, 1358);
        BasketballPlayer noory = new BasketballPlayer("Noor ElAmar", "Noory", 1999, "Al Ahly", 87.9, 28, 1358);
        BasketballPlayer magic = new BasketballPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);
        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];

        basketballPlayers[0]= omar;
        basketballPlayers[1]= noory;
        basketballPlayers[2]= magic;

        for (BasketballPlayer basketballPlayer : basketballPlayers){
            basketballPlayer.freeThrow();
        }
    }
}

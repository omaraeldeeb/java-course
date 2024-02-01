package com.intermediate.thegreatrobbery;

public class TheGreatRobberyApp {
    public static void main(String[] args) {
        City city = new City();
        Gang theGang = new Gang();
        Police police = new Police();

        theGang.getGangInfo();
        do {
            theGang.letsRob(city.getBuilding());
        }while (!police.catchCriminals(theGang));


    }
}

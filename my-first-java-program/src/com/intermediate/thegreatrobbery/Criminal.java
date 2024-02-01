package com.intermediate.thegreatrobbery;

public class Criminal extends Person{
    public final static int SUCCESS_PERCENTAGE = 20;

    public Criminal(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);
    }


    @Override
    public void getBioData() {
        System.out.println("Criminal");
        super.getBioData();
    }
}

package com.intermediate.inheritance.champions;

public abstract class Champions {
    private String playerName;
    private String championName;
    private String rank;
    private String region;
    private String ability;
    private int abilityPower;
    private int attackDamage;
    private float attackSpeed;


    public Champions(String championName,String playerName, String rank ,String region, String ability, int abilityPower, int attackDamage, float attackSpeed) {

        this.championName = championName;
        this.playerName = playerName;
        this.rank = rank;
        this.region = region;
        this.ability = ability;
        this.abilityPower = abilityPower;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
    }
    public void getDescription(){
        System.out.println("Champion name is: " + championName);
        System.out.println("Player name is: " + playerName);
        System.out.println("Player current rank is: " + rank + " this season");
        System.out.println("Player region is: " + region);
        System.out.println("Champion ability is: " + ability);
        System.out.println("Champion abilityPower is: " + abilityPower);
        System.out.println("Champion attackDamage is: " + attackDamage);
        System.out.println("Champion attackSpeed is: " + attackSpeed);
    }

    public String getChampionName() {
        return championName;
    }

    public void recallToBase(){
        System.out.println(championName + " is recalling to base");
    }
    public void attack(){
        System.out.println(championName + " is attacking the enemy");
    }
    public abstract void useUltimate ();

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRank() {
        return rank;
    }



}



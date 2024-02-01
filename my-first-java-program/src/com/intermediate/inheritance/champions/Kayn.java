package com.intermediate.inheritance.champions;

public class Kayn extends Champions implements KaynAbilities{

// kayn passive - stacks
    public Kayn(String playerName, String rank, String region, String ability, int abilityPower, int attackDamage, float attackSpeed) {
        super("Kayn", playerName, rank, region, ability, abilityPower, attackDamage, attackSpeed);
    }

    @Override
    public void useUltimate() {
        System.out.println(getChampionName()+ " used the ultimate and got inside the enemy successfully");
    }

    public void enterTheWall(){
        System.out.println( getChampionName() + " is in the wall");
    }

    @Override
    public void firstAbilityDashCircle() {

    }

    @Override
    public void secondAbilityLongAttack() {

    }

    @Override
    public void thirdAbilityInWall() {

    }

    @Override
    public void ultimateAbilityInsideTarget() {

    }
}

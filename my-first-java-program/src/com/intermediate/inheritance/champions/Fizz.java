package com.intermediate.inheritance.champions;

public class Fizz extends Champions implements FizzAbilities{

   // fizz passive - stacks
    public Fizz(String playerName, String rank, String region, String ability, int abilityPower, int attackDamage, float attackSpeed) {
        super("Fizz", playerName, rank, region, ability, abilityPower, attackDamage, attackSpeed);
    }

    @Override
    public void useUltimate() {
        System.out.println(getChampionName()+ " used the ultimate and thrown the fish successfully");
    }
    public void beInvincible(){
        System.out.println( getChampionName() + " is invincible");
    }

    @Override
    public void firstAbilityDash() {
     System.out.println("Dashing towards the target causing magic damage");
    }

    @Override
    public void secondAbilityHit() {
     System.out.println("Hitting the target causing magic damage if died reset CD");
    }

    @Override
    public void thirdAbilityInvincible() {
     System.out.println("Jump and be invincible cannot be targeted for short period of time");
    }

    @Override
    public void ultimateAbilityFish() {
     System.out.println("Throw a fish towards a target causing magic damage " +
             "the highest distance have the highest damage");
    }
}

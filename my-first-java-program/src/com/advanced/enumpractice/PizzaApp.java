package com.advanced.enumpractice;

public class PizzaApp {
    public static void main(String[] args) {
        System.out.println("Available sizes: ");
        for (PizzaSize pizzaSize : PizzaSize.values()){
            System.out.println("- " + pizzaSize.getPizzaSizeText());
        }
        System.out.println();
        Pizza pizzaOrder =  new Pizza("Margareta", PizzaSize.MEDIUM);
        System.out.println("I ordered the following pizza ");
        System.out.println("Name: " + pizzaOrder.getName());
        System.out.println("Pizza Size: " +pizzaOrder.getPizzaSize().name());
        System.out.println("Prize: $" + pizzaOrder.getPrice());
    }
}
